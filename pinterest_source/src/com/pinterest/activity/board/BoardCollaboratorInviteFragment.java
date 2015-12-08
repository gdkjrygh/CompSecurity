// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.board;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.pinterest.activity.board.adapter.BoardCollaboratorInviteAdapter;
import com.pinterest.activity.board.event.ResetSearchQueryEvent;
import com.pinterest.activity.sendapin.ui.ProgressSpinnerListCell;
import com.pinterest.activity.task.fragment.BaseFragment;
import com.pinterest.base.Device;
import com.pinterest.base.Events;
import com.pinterest.ui.text.SearchEditText;

public class BoardCollaboratorInviteFragment extends BaseFragment
{

    private BoardCollaboratorInviteAdapter _adapter;
    private String _boardId;
    private com.pinterest.base.Events.EventsSubscriber _eventsSubscriber;
    ListView _listView;
    private android.widget.AdapterView.OnItemClickListener _onListItemClickListener;
    TextView _reminderTv;
    SearchEditText _searchEt;
    private TextWatcher _textWatcher;
    private android.widget.AbsListView.OnScrollListener onScrollListener;

    public BoardCollaboratorInviteFragment()
    {
        _eventsSubscriber = new _cls2();
        _textWatcher = new _cls3();
        onScrollListener = new _cls4();
        _onListItemClickListener = new _cls5();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        _layoutId = 0x7f0300a8;
        _menuId = -1;
        _boardId = getTaskDataId();
    }

    protected void onDeactivate()
    {
        Device.hideSoftKeyboard(_searchEt);
        super.onDeactivate();
    }

    public void onDestroyView()
    {
        ButterKnife.a(this);
        super.onDestroyView();
    }

    public void onPause()
    {
        super.onPause();
        Events.unregister(_eventsSubscriber);
    }

    public void onResume()
    {
        super.onResume();
        Events.register(_eventsSubscriber, com/pinterest/activity/board/event/ResetSearchQueryEvent, new Class[0]);
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        ButterKnife.a(this, view);
        _actionBar.setTitle(0x7f070086);
        _searchEt.addTextChangedListener(_textWatcher);
        _searchEt.setOnEditorActionListener(new _cls1());
        _adapter = new BoardCollaboratorInviteAdapter(getActivity(), _boardId);
        view = new ProgressSpinnerListCell(getActivity());
        _adapter.setFooterView(view);
        _adapter.setSpinnerState(true);
        _adapter.setApiTag(getApiTag());
        _listView.setOnItemClickListener(_onListItemClickListener);
        _listView.setOnScrollListener(onScrollListener);
        _listView.addFooterView(view, null, true);
        _listView.setAdapter(_adapter);
    }



    private class _cls2
        implements com.pinterest.base.Events.EventsSubscriber
    {

        final BoardCollaboratorInviteFragment this$0;

        public void onEventMainThread(ResetSearchQueryEvent resetsearchqueryevent)
        {
            _searchEt.setText("");
        }

        _cls2()
        {
            this$0 = BoardCollaboratorInviteFragment.this;
            super();
        }
    }


    private class _cls3
        implements TextWatcher
    {

        final BoardCollaboratorInviteFragment this$0;

        public void afterTextChanged(Editable editable)
        {
        }

        public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
        {
        }

        public void onTextChanged(CharSequence charsequence, int i, int j, int k)
        {
            if (charsequence != null)
            {
                _adapter.onSearchQueryChanged(charsequence.toString());
            }
            TextView textview = _reminderTv;
            boolean flag;
            if (!TextUtils.isEmpty(charsequence))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            ViewHelper.setVisibility(textview, flag);
        }

        _cls3()
        {
            this$0 = BoardCollaboratorInviteFragment.this;
            super();
        }
    }


    private class _cls4
        implements android.widget.AbsListView.OnScrollListener
    {

        final BoardCollaboratorInviteFragment this$0;

        public void onScroll(AbsListView abslistview, int i, int j, int k)
        {
        }

        public void onScrollStateChanged(AbsListView abslistview, int i)
        {
            if (i == 1)
            {
                Device.hideSoftKeyboard(_listView);
            }
        }

        _cls4()
        {
            this$0 = BoardCollaboratorInviteFragment.this;
            super();
        }
    }


    private class _cls5
        implements android.widget.AdapterView.OnItemClickListener
    {

        final BoardCollaboratorInviteFragment this$0;

        public void onItemClick(AdapterView adapterview, View view, int i, long l)
        {
            adapterview = ((AdapterView) (view.getTag()));
            if (adapterview != null)
            {
                if (adapterview instanceof CollaboratorInvite)
                {
                    adapterview = (CollaboratorInvite)adapterview;
                    Pinalytics.a(ElementType.USER_LIST_USER, ComponentType.USER_FEED);
                    Events.post(new Navigation(Location.USER, adapterview.getInvitedUser().getUid()));
                } else
                if (adapterview instanceof TypeAheadItem)
                {
                    adapterview = (TypeAheadItem)adapterview;
                    if (!adapterview.isPlaceHolder())
                    {
                        Pinalytics.a(ElementType.USER_LIST_USER, ComponentType.SUGGESTED_USERS);
                        Events.post(new Navigation(Location.USER, adapterview.getUid()));
                        return;
                    }
                    if (adapterview.getItemType() == com.pinterest.activity.search.model.TypeAheadItem.ItemType.EMAIL_PLACEHOLDER)
                    {
                        adapterview = _searchEt.getText().toString();
                        if (SignupFormUtils.isEmailValid(adapterview))
                        {
                            Device.hideSoftKeyboard(_searchEt);
                            Events.post(new ToastEvent(new InviteEmailToast(_boardId, adapterview)));
                            return;
                        } else
                        {
                            Application.showToast(0x7f0702fa);
                            return;
                        }
                    }
                }
            }
        }

        _cls5()
        {
            this$0 = BoardCollaboratorInviteFragment.this;
            super();
        }
    }


    private class _cls1
        implements android.widget.TextView.OnEditorActionListener
    {

        final BoardCollaboratorInviteFragment this$0;

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
            this$0 = BoardCollaboratorInviteFragment.this;
            super();
        }
    }

}
