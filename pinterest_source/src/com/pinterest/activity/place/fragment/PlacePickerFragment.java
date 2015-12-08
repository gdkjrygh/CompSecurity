// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.place.fragment;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import com.pinterest.activity.place.PlaceSelectedEvent;
import com.pinterest.activity.place.adapter.PlacePickerAdapter;
import com.pinterest.activity.sendapin.ui.ProgressSpinnerListCell;
import com.pinterest.activity.task.fragment.BaseFragment;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.api.model.Place;
import com.pinterest.api.remote.PlaceApi;
import com.pinterest.base.Application;
import com.pinterest.base.Device;
import com.pinterest.base.Events;
import com.pinterest.base.PermissionUtil;
import com.pinterest.kit.activity.BaseActivity;
import com.pinterest.ui.text.SearchEditText;

public class PlacePickerFragment extends BaseFragment
{

    private PlacePickerAdapter _adapter;
    private ListView _listView;
    private SearchEditText _locationSearchEt;
    private Mode _mode;
    private TextWatcher _onLocationEtChanged;
    private String _originBoardId;
    private ViewGroup _placeHolderCell;
    private SearchEditText _searchEt;
    private android.widget.AdapterView.OnItemClickListener onItemClickListener;
    private android.widget.AbsListView.OnScrollListener onListViewScrollListener;
    private TextWatcher onSearchEtChanged;

    public PlacePickerFragment()
    {
        _mode = Mode.DEBUG;
        onItemClickListener = new _cls3();
        onSearchEtChanged = new _cls4();
        _onLocationEtChanged = new _cls5();
        onListViewScrollListener = new _cls6();
    }

    private boolean allSearchFieldsEmpty()
    {
        return _searchEt != null && _searchEt.getText().length() <= 0 && _locationSearchEt != null && _locationSearchEt.getText().length() <= 0;
    }

    private void handleItemSelect(Place place)
    {
        if (place == null)
        {
            return;
        }
        PlaceApi.a(place.getUid(), place.getSearchId());
        switch (_cls7..SwitchMap.com.pinterest.activity.place.fragment.PlacePickerFragment.Mode[_mode.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            Application.showDebugToast((new StringBuilder("Location Set to ")).append(place.getName()).toString());
            Events.postSticky(new PlaceSelectedEvent(place));
            getActivity().onBackPressed();
            return;

        case 2: // '\002'
            place = new Navigation(Location.PLACE_IMAGE_PICKER, place);
            if (_originBoardId != null)
            {
                place.putExtra("com.pinterest.EXTRA_BOARD_ID", _originBoardId);
            }
            Events.post(place);
            return;

        case 3: // '\003'
            Events.postSticky(new PlaceSelectedEvent(place));
            getActivity().onBackPressed();
            return;
        }
    }

    private void setEmptyPlaceHolderVisibility()
    {
        if (_searchEt.getText().length() <= 0 && _locationSearchEt.getText().length() <= 0)
        {
            _placeHolderCell.setVisibility(0);
            return;
        } else
        {
            _placeHolderCell.setVisibility(8);
            return;
        }
    }

    private void tryRequestLocationPermissions()
    {
        PermissionUtil.checkPermissionAsync((BaseActivity)getActivity(), "android.permission.ACCESS_FINE_LOCATION", 0x7f070346, new _cls2());
    }

    private void updateViewSize()
    {
        View view = getView();
        if (view != null)
        {
            android.view.ViewGroup.LayoutParams layoutparams1 = view.getLayoutParams();
            android.view.ViewGroup.LayoutParams layoutparams = layoutparams1;
            if (layoutparams1 == null)
            {
                layoutparams = new android.view.ViewGroup.LayoutParams(-1, -1);
            }
            layoutparams.width = (int)(Device.getScreenWidth() * 0.9F);
            layoutparams.height = (int)(Device.getScreenHeight() * 0.9F);
            view.setLayoutParams(layoutparams);
        }
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        if (getView() != null)
        {
            updateViewSize();
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        _layoutId = 0x7f0300fc;
        _menuId = 0x7f100002;
        if (_mode == Mode.EDIT)
        {
            _menuId = -1;
        }
    }

    protected void onDeactivate()
    {
        Device.hideSoftKeyboard(_searchEt);
        super.onDeactivate();
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        updateViewSize();
        int i;
        if (_mode == Mode.EDIT)
        {
            i = 0x7f070366;
        } else
        {
            i = 0x7f0702a0;
        }
        _actionBar.setTitle(i);
        _placeHolderCell = (ViewGroup)view.findViewById(0x7f0f03e2);
        _placeHolderCell.setBackgroundResource(0);
        ((TextView)_placeHolderCell.findViewById(0x7f0f0304)).setText(0x7f07045b);
        _searchEt = (SearchEditText)view.findViewById(0x7f0f0236);
        _searchEt.addTextChangedListener(onSearchEtChanged);
        _locationSearchEt = (SearchEditText)view.findViewById(0x7f0f02a9);
        _locationSearchEt.addTextChangedListener(_onLocationEtChanged);
        _listView = (ListView)view.findViewById(0x7f0f01e4);
        _adapter = new PlacePickerAdapter((BaseActivity)view.getContext());
        _adapter.setApiTag(getApiTag());
        view = new ProgressSpinnerListCell(view.getContext());
        _adapter.setSpinnerView(view);
        _listView.addFooterView(view, null, true);
        _listView.setAdapter(_adapter);
        _listView.setOnScrollListener(onListViewScrollListener);
        _listView.setOnItemClickListener(onItemClickListener);
        _listView.setSelection(0);
        _listView.postDelayed(new _cls1(), 200L);
        tryRequestLocationPermissions();
    }

    public void setNavigation(Navigation navigation)
    {
        super.setNavigation(navigation);
        Mode mode = (Mode)navigation.getExtra("com.pinterest.EXTRA_MODE");
        if (mode == null)
        {
            mode = _mode;
        }
        _mode = mode;
        _originBoardId = (String)navigation.getExtra("com.pinterest.EXTRA_BOARD_ID");
    }








    private class Mode extends Enum
    {

        private static final Mode $VALUES[];
        public static final Mode CREATE;
        public static final Mode DEBUG;
        public static final Mode EDIT;

        public static Mode valueOf(String s)
        {
            return (Mode)Enum.valueOf(com/pinterest/activity/place/fragment/PlacePickerFragment$Mode, s);
        }

        public static Mode[] values()
        {
            return (Mode[])$VALUES.clone();
        }

        static 
        {
            DEBUG = new Mode("DEBUG", 0);
            CREATE = new Mode("CREATE", 1);
            EDIT = new Mode("EDIT", 2);
            $VALUES = (new Mode[] {
                DEBUG, CREATE, EDIT
            });
        }

        private Mode(String s, int i)
        {
            super(s, i);
        }
    }


    private class _cls3
        implements android.widget.AdapterView.OnItemClickListener
    {

        final PlacePickerFragment this$0;

        public void onItemClick(AdapterView adapterview, View view, int i, long l)
        {
label0:
            {
label1:
                {
                    adapterview = (Place)_adapter.getItem(i);
                    if (adapterview != null && adapterview.getUid() != null)
                    {
                        if (!_adapter.isShowingLocations())
                        {
                            break label0;
                        }
                        _locationSearchEt.setText(adapterview.getName());
                        _searchEt.requestFocus();
                        Device.showSoftKeyboard(_searchEt);
                        if (_searchEt.getText().length() <= 0)
                        {
                            break label1;
                        }
                        _adapter.onSearchQueryChanged(_searchEt.getText().toString());
                    }
                    return;
                }
                _placeHolderCell.setVisibility(0);
                return;
            }
            handleItemSelect(adapterview);
        }

        _cls3()
        {
            this$0 = PlacePickerFragment.this;
            super();
        }
    }


    private class _cls4
        implements TextWatcher
    {

        final PlacePickerFragment this$0;

        public void afterTextChanged(Editable editable)
        {
        }

        public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
        {
        }

        public void onTextChanged(CharSequence charsequence, int i, int j, int k)
        {
            String s = charsequence.toString();
            setEmptyPlaceHolderVisibility();
            if (StringUtils.isNotEmpty(s))
            {
                _adapter.onSearchQueryChanged(charsequence.toString());
            } else
            if (allSearchFieldsEmpty())
            {
                _adapter.onSearchFieldsEmpty();
                return;
            }
        }

        _cls4()
        {
            this$0 = PlacePickerFragment.this;
            super();
        }
    }


    private class _cls5
        implements TextWatcher
    {

        final PlacePickerFragment this$0;

        public void afterTextChanged(Editable editable)
        {
        }

        public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
        {
        }

        public void onTextChanged(CharSequence charsequence, int i, int j, int k)
        {
            if (allSearchFieldsEmpty())
            {
                _adapter.onSearchFieldsEmpty();
            } else
            {
                _adapter.onLocationTextChanged(charsequence.toString());
            }
            setEmptyPlaceHolderVisibility();
        }

        _cls5()
        {
            this$0 = PlacePickerFragment.this;
            super();
        }
    }


    private class _cls6
        implements android.widget.AbsListView.OnScrollListener
    {

        final PlacePickerFragment this$0;

        public void onScroll(AbsListView abslistview, int i, int j, int k)
        {
        }

        public void onScrollStateChanged(AbsListView abslistview, int i)
        {
            if (i == 1 && _searchEt != null)
            {
                Device.hideSoftKeyboard(_searchEt);
            }
        }

        _cls6()
        {
            this$0 = PlacePickerFragment.this;
            super();
        }
    }


    private class _cls7
    {

        static final int $SwitchMap$com$pinterest$activity$place$fragment$PlacePickerFragment$Mode[];

        static 
        {
            $SwitchMap$com$pinterest$activity$place$fragment$PlacePickerFragment$Mode = new int[Mode.values().length];
            try
            {
                $SwitchMap$com$pinterest$activity$place$fragment$PlacePickerFragment$Mode[Mode.DEBUG.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                $SwitchMap$com$pinterest$activity$place$fragment$PlacePickerFragment$Mode[Mode.CREATE.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$com$pinterest$activity$place$fragment$PlacePickerFragment$Mode[Mode.EDIT.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }


    private class _cls2
        implements android.support.v4.app.ActivityCompat.OnRequestPermissionsResultCallback
    {

        final PlacePickerFragment this$0;

        public void onRequestPermissionsResult(int i, String as[], int ai[])
        {
            boolean flag1 = false;
            boolean flag = flag1;
            if (ai.length > 0)
            {
                flag = flag1;
                if (ai[0] == 0)
                {
                    flag = true;
                }
            }
            _adapter.onLocationPermissionResponse(flag);
            if (flag)
            {
                _locationSearchEt.setHint(0x7f0701bc);
                return;
            } else
            {
                _locationSearchEt.setHint(0x7f070347);
                return;
            }
        }

        _cls2()
        {
            this$0 = PlacePickerFragment.this;
            super();
        }
    }


    private class _cls1
        implements Runnable
    {

        final PlacePickerFragment this$0;

        public void run()
        {
            _searchEt.requestFocusFromTouch();
            Device.showSoftKeyboard(_searchEt);
        }

        _cls1()
        {
            this$0 = PlacePickerFragment.this;
            super();
        }
    }

}
