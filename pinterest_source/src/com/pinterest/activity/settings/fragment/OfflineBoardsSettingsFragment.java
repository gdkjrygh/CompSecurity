// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.settings.fragment;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.widget.SwitchCompat;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.CompoundButton;
import android.widget.ListView;
import com.pinterest.activity.settings.fragment.adapter.OfflineBoardsSettingsAdapter;
import com.pinterest.activity.task.fragment.ListFragment;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.base.Colors;
import com.pinterest.base.Constants;
import com.pinterest.kit.application.Resources;
import com.pinterest.offline.OfflineDataInfo;
import com.pinterest.offline.OfflineDataRetriever;
import com.pinterest.schemas.event.ElementType;
import com.pinterest.schemas.event.EventType;
import com.pinterest.ui.actions.Scrollable;
import com.pinterest.ui.progress.SmallLoadingView;
import com.pinterest.ui.text.PTextView;

public class OfflineBoardsSettingsFragment extends ListFragment
    implements android.widget.CompoundButton.OnCheckedChangeListener, Scrollable
{

    private PTextView _footer;
    private Handler _handler;
    private SmallLoadingView _loadingIc;

    public OfflineBoardsSettingsFragment()
    {
        _menuId = 0x7f100002;
        _adapter = new OfflineBoardsSettingsAdapter();
    }

    protected void onActivate()
    {
        super.onActivate();
        if (_handler != null)
        {
            _handler.removeCallbacksAndMessages(null);
            _handler.postDelayed(new _cls2(), 3000L);
        }
        if (_adapter != null)
        {
            ((OfflineBoardsSettingsAdapter)_adapter).onActivate();
        }
    }

    public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        int i;
        if (flag)
        {
            compoundbutton = EventType.TOGGLE_ON;
        } else
        {
            compoundbutton = EventType.TOGGLE_OFF;
        }
        Pinalytics.a(compoundbutton, ElementType.SETTINGS_OFFLINE_BOARD_TOGGLE_ALL, null, null);
        compoundbutton = _listView;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 4;
        }
        compoundbutton.setVisibility(i);
        OfflineDataInfo.g();
        OfflineDataInfo.a(flag);
        (new _cls3()).execute();
        if (flag)
        {
            OfflineDataInfo.g();
            OfflineDataInfo.a(0L);
            OfflineDataRetriever.d().a();
            return;
        } else
        {
            OfflineDataRetriever.d().a(false);
            (new _cls4()).execute();
            return;
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        _handler = new Handler(Looper.getMainLooper());
        _layoutId = 0x7f0300ec;
        OfflineDataRetriever.d().a();
        (new _cls1()).execute();
    }

    protected void onDeactivate()
    {
        if (_handler != null)
        {
            _handler.removeCallbacksAndMessages(null);
        }
        if (_adapter != null)
        {
            ((OfflineBoardsSettingsAdapter)_adapter).onDeactivate();
        }
        super.onDeactivate();
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        _footer = null;
        _loadingIc = null;
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        _actionBar.setTitle(0x7f070039);
        bundle = new SwitchCompat(view.getContext());
        bundle.setId(0x7f0f0016);
        OfflineDataInfo.g();
        bundle.setChecked(OfflineDataInfo.d());
        _actionBar.addView(bundle, -2, -2);
        android.support.v7.widget.Toolbar.LayoutParams layoutparams = (android.support.v7.widget.Toolbar.LayoutParams)bundle.getLayoutParams();
        layoutparams.gravity = 5;
        layoutparams.setMargins(0, 0, Constants.MARGIN, 0);
        bundle.setLayoutParams(layoutparams);
        bundle.setOnCheckedChangeListener(this);
        _loadingIc = new SmallLoadingView(view.getContext());
        int i = (int)Resources.dimension(0x7f0a01ed);
        _actionBar.addView(_loadingIc, i, i);
        layoutparams = (android.support.v7.widget.Toolbar.LayoutParams)_loadingIc.getLayoutParams();
        layoutparams.gravity = 5;
        layoutparams.setMargins(0, 0, Constants.MARGIN, 0);
        _loadingIc.setLayoutParams(layoutparams);
        _loadingIc.setVisibility(8);
        _footer = new PTextView(view.getContext());
        _footer.setGravity(17);
        _footer.setTextColor(Colors.LIGHT_GRAY);
        _footer.setMinWidth(-1);
        _footer.setMinHeight(Constants.ITEM_HEIGHT);
        _footer.setTypeface(null, 3);
        _listView = (ListView)view.findViewById(0x7f0f0128);
        _listView.addFooterView(_footer, null, false);
        _listView.setAdapter(_adapter);
        view = _listView;
        if (bundle.isChecked())
        {
            i = 0;
        } else
        {
            i = 4;
        }
        view.setVisibility(i);
    }






    private class _cls2
        implements Runnable
    {

        final OfflineBoardsSettingsFragment this$0;

        public void run()
        {
            if (_loadingIc != null)
            {
                SmallLoadingView smallloadingview = _loadingIc;
                class _cls1 extends BackgroundTask
                {

                    public String cacheSize;
                    final _cls2 this$1;

                    public void onFinish()
                    {
                        super.onFinish();
                        if (_footer != null)
                        {
                            _footer.setText(cacheSize);
                        }
                    }

                    public void run()
                    {
                        cacheSize = OfflineDataInfo.g().toString();
                    }

                _cls1()
                {
                    this$1 = _cls2.this;
                    super();
                    cacheSize = "";
                }
                }

                int i;
                if (OfflineDataRetriever.d().c())
                {
                    i = 0;
                } else
                {
                    i = 8;
                }
                smallloadingview.setVisibility(i);
            }
            if (_footer != null)
            {
                (new _cls1()).execute();
            }
            if (_handler != null && isActive())
            {
                _handler.postDelayed(this, 3000L);
            }
        }

        _cls2()
        {
            this$0 = OfflineBoardsSettingsFragment.this;
            super();
        }
    }


    private class _cls3 extends BackgroundTask
    {

        final OfflineBoardsSettingsFragment this$0;

        public void run()
        {
            List list = ModelHelper.getUserBoards(MyUser.getUid());
            for (Iterator iterator = list.iterator(); iterator.hasNext(); ((Board)iterator.next()).setSyncedAt(null)) { }
            ModelHelper.setBoards(list);
        }

        _cls3()
        {
            this$0 = OfflineBoardsSettingsFragment.this;
            super();
        }
    }


    private class _cls4 extends BackgroundTask
    {

        final OfflineBoardsSettingsFragment this$0;

        public void run()
        {
            ModelHelper.deleteSyncJobs();
            OfflineDataRetriever.d().b();
        }

        _cls4()
        {
            this$0 = OfflineBoardsSettingsFragment.this;
            super();
        }
    }


    private class _cls1 extends BackgroundTask
    {

        private List _usersBoards;
        final OfflineBoardsSettingsFragment this$0;

        public void onFinish()
        {
            if (OfflineBoardsSettingsFragment.this._usersBoards != null)
            {
                ((OfflineBoardsSettingsAdapter)OfflineBoardsSettingsFragment.this._usersBoards).setDataSource(_usersBoards);
            }
        }

        public void run()
        {
            _usersBoards = ModelHelper.getUserBoards(MyUser.getUid());
            OfflineDataInfo.g().a(_usersBoards);
        }

        _cls1()
        {
            this$0 = OfflineBoardsSettingsFragment.this;
            super();
        }
    }

}
