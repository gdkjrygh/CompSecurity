// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.findfriend;

import android.os.Bundle;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import butterknife.ButterKnife;
import com.pinterest.activity.findfriend.adapter.FindFriendsListAdapter;
import com.pinterest.activity.findfriend.view.FindFriendsHeaderView;
import com.pinterest.activity.sendapin.ui.ProgressSpinnerListCell;
import com.pinterest.activity.task.fragment.BaseFragment;
import com.pinterest.base.Device;
import com.pinterest.base.Events;
import com.pinterest.base.PermissionUtil;
import com.pinterest.ui.ViewHelper;
import com.pinterest.ui.actionsheet.ActionSheetFragment;
import com.pinterest.ui.text.PButton;
import com.pinterest.ui.text.SearchEditText;

public class FindFriendsContactFragment extends BaseFragment
{

    private ActionSheetFragment _actionSheet;
    PButton _connectBtn;
    private com.pinterest.base.Events.EventsSubscriber _eventsSubscriber;
    private FindFriendsHeaderView _header;
    ListView _listView;
    private FindFriendsListAdapter _listViewAdapter;
    private android.widget.AbsListView.OnScrollListener _onListViewScrollListener;
    private boolean _refreshOnResume;
    SearchEditText _searchEt;
    private TextWatcher _searchTextWatcher;
    ViewGroup _unconnectedViewContainer;

    public FindFriendsContactFragment()
    {
        _refreshOnResume = false;
        _eventsSubscriber = new _cls2();
        _searchTextWatcher = new _cls3();
        _onListViewScrollListener = new _cls4();
    }

    private void buildUnconnectedView()
    {
        _connectBtn.setIconTint(0x7f0e00bf);
        _connectBtn.setOnClickListener(new _cls5());
    }

    private void showConnectedView()
    {
        ViewHelper.setVisibility(_unconnectedViewContainer, false);
        ViewHelper.setVisibility(_listView, true);
        ViewHelper.setVisibility(_searchEt, true);
        _listViewAdapter.refresh();
    }

    protected void onActivate()
    {
        super.onActivate();
        Events.register(_eventsSubscriber, com/pinterest/activity/findfriend/adapter/FriendSearchAdapter$ContactsChangeEvent, new Class[0]);
        _listViewAdapter.notifyDataSetChanged();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        _layoutId = 0x7f0300c4;
    }

    protected void onDeactivate()
    {
        Events.unregister(_eventsSubscriber);
        Device.hideSoftKeyboard(_searchEt);
        super.onDeactivate();
    }

    public void onResume()
    {
        super.onResume();
        if (_refreshOnResume)
        {
            _listViewAdapter.refresh();
        }
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        ButterKnife.a(this, view);
        view = getActivity();
        _actionSheet = new ActionSheetFragment();
        _listViewAdapter = new FindFriendsListAdapter(view, _actionSheet);
        _listViewAdapter.setApiTag(getApiTag());
        bundle = new ProgressSpinnerListCell(view);
        _header = new FindFriendsHeaderView(view);
        _listView.addHeaderView(_header);
        _listView.addFooterView(bundle, null, false);
        _listViewAdapter.setFooterView(bundle);
        _listViewAdapter.setSpinnerState(true);
        _listView.setAdapter(_listViewAdapter);
        _listView.setOnScrollListener(_onListViewScrollListener);
        _listView.setSelection(0);
        _searchEt.addTextChangedListener(_searchTextWatcher);
        _searchEt.setOnEditorActionListener(new _cls1());
        if (PermissionUtil.checkPermission(getContext(), "android.permission.READ_CONTACTS"))
        {
            _listViewAdapter.refresh();
            return;
        } else
        {
            buildUnconnectedView();
            ViewHelper.setVisibility(_listView, false);
            ViewHelper.setVisibility(_searchEt, false);
            return;
        }
    }




    private class _cls2
        implements com.pinterest.base.Events.EventsSubscriber
    {

        final FindFriendsContactFragment this$0;

        public void onEventMainThread(com.pinterest.activity.findfriend.adapter.FriendSearchAdapter.ContactsChangeEvent contactschangeevent)
        {
            if (_header != null && contactschangeevent.originatingAdapter == _listViewAdapter)
            {
                _header.updateFriendsCount(contactschangeevent.size);
            }
        }

        _cls2()
        {
            this$0 = FindFriendsContactFragment.this;
            super();
        }
    }


    private class _cls3
        implements TextWatcher
    {

        final FindFriendsContactFragment this$0;

        public void afterTextChanged(Editable editable)
        {
        }

        public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
        {
        }

        public void onTextChanged(CharSequence charsequence, int i, int j, int k)
        {
            _listViewAdapter.onSearchQueryChanged(charsequence.toString());
        }

        _cls3()
        {
            this$0 = FindFriendsContactFragment.this;
            super();
        }
    }


    private class _cls4
        implements android.widget.AbsListView.OnScrollListener
    {

        final FindFriendsContactFragment this$0;

        public void onScroll(AbsListView abslistview, int i, int j, int k)
        {
        }

        public void onScrollStateChanged(AbsListView abslistview, int i)
        {
            if (i == 1)
            {
                Device.hideSoftKeyboard(abslistview);
            }
        }

        _cls4()
        {
            this$0 = FindFriendsContactFragment.this;
            super();
        }
    }


    private class _cls5
        implements android.view.View.OnClickListener
    {

        final FindFriendsContactFragment this$0;

        public void onClick(View view)
        {
            class _cls1
                implements android.support.v4.app.ActivityCompat.OnRequestPermissionsResultCallback
            {

                final _cls5 this$1;

                public void onRequestPermissionsResult(int i, String as[], int ai[])
                {
                    if (PermissionUtil.checkPermission(getContext(), "android.permission.READ_CONTACTS"))
                    {
                        showConnectedView();
                    }
                }

                _cls1()
                {
                    this$1 = _cls5.this;
                    super();
                }
            }

            PermissionUtil.checkPermissionAsync((BaseActivity)getContext(), "android.permission.READ_CONTACTS", 0x7f070179, new _cls1());
        }

        _cls5()
        {
            this$0 = FindFriendsContactFragment.this;
            super();
        }
    }


    private class _cls1
        implements android.widget.TextView.OnEditorActionListener
    {

        final FindFriendsContactFragment this$0;

        public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
        {
            if (ViewHelper.isKeyboardAction(3, i, keyevent))
            {
                textview.clearFocus();
                Device.hideSoftKeyboard(textview);
                return true;
            } else
            {
                return false;
            }
        }

        _cls1()
        {
            this$0 = FindFriendsContactFragment.this;
            super();
        }
    }

}
