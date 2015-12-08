// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.settings.fragment.adapter;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CompoundButton;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.Board;
import com.pinterest.api.model.SyncJob;
import com.pinterest.base.Events;
import com.pinterest.kit.application.Resources;
import com.pinterest.offline.OfflineDataInfo;
import com.pinterest.offline.OfflineDataRetriever;
import com.pinterest.schemas.event.ElementType;
import com.pinterest.schemas.event.EventType;
import com.pinterest.ui.listview.ListCellSwitch;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class OfflineBoardsSettingsAdapter extends BaseAdapter
    implements android.widget.CompoundButton.OnCheckedChangeListener
{

    private SyncJob _currentJob;
    private List _dataSource;
    private List _enabledBoardIds;
    private com.pinterest.base.Events.EventsSubscriber _eventSubscriber;

    public OfflineBoardsSettingsAdapter()
    {
        _eventSubscriber = new _cls1();
    }

    private void handleBoardStateChange(final String boardUid, boolean flag)
    {
        final SyncJob job = OfflineDataInfo.g();
        Set set = job.e();
        if (flag)
        {
            set.add(boardUid);
        } else
        {
            set.remove(boardUid);
        }
        job.a(set);
        _enabledBoardIds = new ArrayList(set);
        if (flag)
        {
            OfflineDataRetriever.d();
            job = OfflineDataRetriever.a(1, null, boardUid);
        } else
        {
            OfflineDataRetriever.d();
            job = OfflineDataRetriever.a(1, boardUid);
        }
        (new _cls2()).execute();
    }

    public int getCount()
    {
        if (_dataSource == null)
        {
            return 0;
        } else
        {
            return _dataSource.size();
        }
    }

    public Board getItem(int i)
    {
        if (_dataSource == null || i >= _dataSource.size())
        {
            return null;
        } else
        {
            return (Board)_dataSource.get(i);
        }
    }

    public volatile Object getItem(int i)
    {
        return getItem(i);
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        boolean flag = true;
        Board board = getItem(i);
        String s = board.getUid();
        viewgroup = ListCellSwitch.get(view, viewgroup);
        if (view == null)
        {
            view = Resources.drawable(0x7f0201d3);
            view.setBounds(0, (int)((float)view.getIntrinsicWidth() * 0.25F), (int)((float)view.getIntrinsicWidth() * 0.75F), (int)((float)view.getIntrinsicHeight() * 0.75F));
            viewgroup.setMetadataIcon(view);
            viewgroup.setDividerVisibility(0);
            viewgroup.setAlignWithActionBar(true);
        }
        viewgroup.setSwitchListener(null);
        viewgroup.setSwitchTag(0x7f0706d9, Integer.valueOf(i));
        viewgroup.setText(board.getName());
        viewgroup.setMetadataText(NumberFormat.getInstance().format(board.getPinCountDisplay()));
        if (_enabledBoardIds.indexOf(s) < 0)
        {
            flag = false;
        }
        viewgroup.setSwitchChecked(flag);
        viewgroup.setSwitchListener(this);
        return viewgroup;
    }

    public void notifyDataSetChanged()
    {
        _enabledBoardIds = new ArrayList(OfflineDataInfo.g().e());
        super.notifyDataSetChanged();
    }

    public void onActivate()
    {
        Events.register(_eventSubscriber);
    }

    public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        EventType eventtype;
        if (flag)
        {
            eventtype = EventType.TOGGLE_ON;
        } else
        {
            eventtype = EventType.TOGGLE_OFF;
        }
        Pinalytics.a(eventtype, ElementType.SETTINGS_OFFLINE_BOARD_TOGGLE, null, null);
        handleBoardStateChange(getItem(((Integer)compoundbutton.getTag(0x7f0706d9)).intValue()).getUid(), flag);
    }

    public void onDeactivate()
    {
        Events.unregister(_eventSubscriber);
    }

    public void setDataSource(List list)
    {
        _dataSource = list;
        notifyDataSetChanged();
    }



/*
    static SyncJob access$002(OfflineBoardsSettingsAdapter offlineboardssettingsadapter, SyncJob syncjob)
    {
        offlineboardssettingsadapter._currentJob = syncjob;
        return syncjob;
    }

*/

    private class _cls1
        implements com.pinterest.base.Events.EventsSubscriber
    {

        final OfflineBoardsSettingsAdapter this$0;

        public void onEventMainThread(com.pinterest.api.model.SyncJob.CurrentEvent currentevent)
        {
            SyncJob syncjob = _currentJob;
            _currentJob = currentevent.getJob();
            if (syncjob == null || _currentJob == null || !syncjob.getGroupUid().equals(_currentJob.getGroupUid()))
            {
                notifyDataSetChanged();
            }
        }

        _cls1()
        {
            this$0 = OfflineBoardsSettingsAdapter.this;
            super();
        }
    }


    private class _cls2 extends BackgroundTask
    {

        final OfflineBoardsSettingsAdapter this$0;
        final String val$boardUid;
        final SyncJob val$job;

        public void onFinish()
        {
            OfflineDataRetriever.d().a();
        }

        public void run()
        {
            Board board = ModelHelper.getBoard(boardUid);
            if (board != null)
            {
                board.setSyncedAt(null);
                ModelHelper.setBoard(board);
            }
            ModelHelper.setSyncJob(job);
        }

        _cls2()
        {
            this$0 = OfflineBoardsSettingsAdapter.this;
            boardUid = s;
            job = syncjob;
            super();
        }
    }

}
