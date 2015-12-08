// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.board.adapter;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import com.facebook.Session;
import com.facebook.widget.WebDialog;
import com.pinterest.activity.board.dialog.RemoveCollaboratorDialog;
import com.pinterest.activity.board.event.ResetSearchQueryEvent;
import com.pinterest.activity.board.model.CollaboratorInvite;
import com.pinterest.activity.board.model.CollaboratorInviteFeed;
import com.pinterest.activity.search.model.TypeAheadItem;
import com.pinterest.activity.sendapin.ui.PeoplePickerPersonCell;
import com.pinterest.activity.sendapin.ui.ProgressSpinnerListCell;
import com.pinterest.activity.task.event.DialogEvent;
import com.pinterest.api.model.Board;
import com.pinterest.api.model.Feed;
import com.pinterest.api.model.MyUser;
import com.pinterest.api.model.User;
import com.pinterest.api.remote.BaseApi;
import com.pinterest.api.remote.BoardApi;
import com.pinterest.api.remote.SearchApi;
import com.pinterest.base.Events;
import com.pinterest.kit.application.Resources;
import java.util.Collections;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

public class BoardCollaboratorInviteAdapter extends BaseAdapter
    implements ListAdapter
{

    private String _apiTag;
    private Board _board;
    private Feed _boardCollaborators;
    private String _boardId;
    private Context _context;
    private String _currentSearchQuery;
    private ProgressSpinnerListCell _footerView;
    private Handler _handler;
    private List _items;
    private LayoutInflater _li;
    private boolean isLoadingMoreItems;

    public BoardCollaboratorInviteAdapter(Context context, String s)
    {
        _boardCollaborators = new CollaboratorInviteFeed();
        _items = Collections.emptyList();
        _currentSearchQuery = "";
        isLoadingMoreItems = false;
        _context = context;
        _boardId = s;
        _handler = new Handler();
        _li = LayoutInflater.from(context);
        refreshBoardCollaborators();
    }

    private void appendEmailPlaceHolder()
    {
        TypeAheadItem typeaheaditem = new TypeAheadItem();
        typeaheaditem.setTitle(Resources.string(0x7f07023a, new Object[] {
            _currentSearchQuery
        }));
        typeaheaditem.setItemType(com.pinterest.activity.search.model.TypeAheadItem.ItemType.EMAIL_PLACEHOLDER);
        _items.add(typeaheaditem);
    }

    private boolean canRemoveUser(CollaboratorInvite collaboratorinvite)
    {
        return collaboratorinvite.containsAccess("delete") && !collaboratorinvite.getInvitedUser().getUid().equals(MyUser.getUid());
    }

    private void fillView(PeoplePickerPersonCell peoplepickerpersoncell, CollaboratorInvite collaboratorinvite)
    {
        final User invitedUser = collaboratorinvite.getInvitedUser();
        peoplepickerpersoncell.setTitle(invitedUser.getFullName());
        peoplepickerpersoncell.setImage(invitedUser.getImageMediumUrl());
        if (collaboratorinvite.isOwner())
        {
            int i;
            if (isMyUserBoardOwner())
            {
                i = 0x7f070612;
            } else
            {
                i = 0x7f0701b5;
            }
            peoplepickerpersoncell.setDesc(Resources.string(i));
            peoplepickerpersoncell.createActionButton(null, null);
        } else
        if (collaboratorinvite.getInviteBy() != null)
        {
            User user = collaboratorinvite.getInviteBy();
            if (user.getFirstName() != null)
            {
                String s = Resources.string(0x7f07030d, new Object[] {
                    user.getFirstName()
                });
                if (user.getUid().equals(MyUser.getUid()))
                {
                    s = Resources.string(0x7f07030e);
                }
                peoplepickerpersoncell.setDesc(s);
            }
            peoplepickerpersoncell.createActionButton(null, null);
            peoplepickerpersoncell.setActionButtonStyle(com.pinterest.ui.text.PButton.ButtonStyle.PLAIN);
            if (isMyUserBoardOwner() || canRemoveUser(collaboratorinvite))
            {
                peoplepickerpersoncell.createActionButton(Resources.string(0x7f070494), new _cls1());
                return;
            }
            if (invitedUser.getUid().equals(MyUser.getUid()))
            {
                peoplepickerpersoncell.createActionButton(Resources.string(0x7f07031f), new _cls2());
                return;
            }
        }
    }

    private void fillView(PeoplePickerPersonCell peoplepickerpersoncell, final TypeAheadItem item)
    {
        peoplepickerpersoncell.setTitle(item.getTitle());
        peoplepickerpersoncell.setDesc(null);
        peoplepickerpersoncell.setImage(item.getImageUri());
        peoplepickerpersoncell.setItem(item);
        if (!item.isPlaceHolder())
        {
            peoplepickerpersoncell.createActionButton(Resources.string(0x7f0702fd), new _cls3());
            peoplepickerpersoncell.setActionButtonStyle(com.pinterest.ui.text.PButton.ButtonStyle.PLAIN);
            return;
        } else
        {
            peoplepickerpersoncell.createActionButton(null, null);
            return;
        }
    }

    private void getTypeaheadSuggestions()
    {
        SearchApi.e(_currentSearchQuery, _boardId, new BoardCollaboratorsSuggestionHandler(_currentSearchQuery), _apiTag);
    }

    private void inviteCollaboratorsWithFacebook(final String params, final String inviteCode, String s)
    {
        User user = MyUser.get();
        if (user == null)
        {
            return;
        }
        params = new Bundle();
        params.putString("message", String.format(Resources.string(0x7f070093), new Object[] {
            user.getFullName(), _board.getName()
        }));
        params.putString("title", _context.getString(0x7f07005d));
        params.putString("to", s);
        s = Session.getActiveSession();
        if (s == null || !s.isOpened())
        {
            Session.openActiveSession((Activity)_context, true, new _cls6());
            return;
        } else
        {
            showFacebookDialog(inviteCode, params);
            return;
        }
    }

    private boolean isMyUserBoardOwner()
    {
        if (_board != null)
        {
            return _board.getUserUid().equals(MyUser.getUid());
        } else
        {
            return false;
        }
    }

    private void loadMore(int i)
    {
        int j = getCount();
        if (j > 0 && j - i <= 3 && !isLoadingMoreItems && _boardCollaborators.getNextUrl() != null)
        {
            isLoadingMoreItems = true;
            setSpinnerState(true);
            BaseApi.e(_boardCollaborators.getNextUrl(), new _cls4(), _apiTag);
        }
    }

    private void refreshBoardCollaborators()
    {
        BoardApi.f(_boardId, new _cls5(), _apiTag);
    }

    private void showFacebookDialog(final String inviteCode, Bundle bundle)
    {
        ((com.facebook.widget.WebDialog.RequestsDialogBuilder)(new com.facebook.widget.WebDialog.RequestsDialogBuilder(_context, Session.getActiveSession(), bundle)).setOnCompleteListener(new _cls7())).build().show();
    }

    private void showRemoveCollaboratorDialog(final User invitedUser)
    {
        String s = invitedUser.getFirstName();
        String s1 = invitedUser.getFullName();
        if (s != null && s1 != null)
        {
            final RemoveCollaboratorDialog dialog = RemoveCollaboratorDialog.newInstance(invitedUser.getUid());
            dialog.setPositiveButton(0x7f07049a, new _cls8());
            Events.post(new DialogEvent(dialog));
        }
    }

    public int getCount()
    {
        if (StringUtils.isEmpty(_currentSearchQuery))
        {
            return _boardCollaborators.getCount();
        } else
        {
            return _items.size();
        }
    }

    public Object getItem(int i)
    {
        if (StringUtils.isEmpty(_currentSearchQuery))
        {
            return _boardCollaborators.get(i);
        } else
        {
            return _items.get(i);
        }
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        if (view == null)
        {
            view = (PeoplePickerPersonCell)_li.inflate(0x7f030163, null);
        } else
        {
            view = (PeoplePickerPersonCell)view;
        }
        viewgroup = ((ViewGroup) (getItem(i)));
        view.setTag(viewgroup);
        if (!(viewgroup instanceof CollaboratorInvite)) goto _L2; else goto _L1
_L1:
        boolean flag;
        if (!((CollaboratorInvite)viewgroup).isCollaborator())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view.setGrayOut(flag);
        fillView(view, (CollaboratorInvite)viewgroup);
_L4:
        loadMore(i);
        return view;
_L2:
        if (viewgroup instanceof TypeAheadItem)
        {
            fillView(view, (TypeAheadItem)viewgroup);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onSearchQueryChanged(String s)
    {
        _currentSearchQuery = s;
        if (StringUtils.isNotEmpty(s))
        {
            setSpinnerState(true);
            getTypeaheadSuggestions();
        } else
        {
            setSpinnerState(false);
        }
        _items = Collections.emptyList();
        notifyDataSetChanged();
    }

    public void removeCollaborator(User user, boolean flag)
    {
        String s = user.getUid();
        BoardApi.a(_boardId, s, flag, new RemoveBoardCollaboratorResponseHandler(user.getUid()), _apiTag);
    }

    public void resetSearchQuery()
    {
        Events.post(new ResetSearchQueryEvent());
    }

    public void setApiTag(String s)
    {
        _apiTag = s;
    }

    public void setFooterView(ProgressSpinnerListCell progressspinnerlistcell)
    {
        _footerView = progressspinnerlistcell;
    }

    public void setSpinnerState(boolean flag)
    {
label0:
        {
            if (_footerView != null)
            {
                if (!flag)
                {
                    break label0;
                }
                ProgressSpinnerListCell progressspinnerlistcell = _footerView;
                if (getCount() == 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                progressspinnerlistcell.showSpinner(flag);
            }
            return;
        }
        _footerView.hideSpinner();
    }




/*
    static List access$1102(BoardCollaboratorInviteAdapter boardcollaboratorinviteadapter, List list)
    {
        boardcollaboratorinviteadapter._items = list;
        return list;
    }

*/






/*
    static Board access$202(BoardCollaboratorInviteAdapter boardcollaboratorinviteadapter, Board board)
    {
        boardcollaboratorinviteadapter._board = board;
        return board;
    }

*/





/*
    static Feed access$502(BoardCollaboratorInviteAdapter boardcollaboratorinviteadapter, Feed feed)
    {
        boardcollaboratorinviteadapter._boardCollaborators = feed;
        return feed;
    }

*/


/*
    static boolean access$602(BoardCollaboratorInviteAdapter boardcollaboratorinviteadapter, boolean flag)
    {
        boardcollaboratorinviteadapter.isLoadingMoreItems = flag;
        return flag;
    }

*/




    private class _cls1
        implements android.view.View.OnClickListener
    {

        final BoardCollaboratorInviteAdapter this$0;
        final User val$invitedUser;

        public void onClick(View view)
        {
            Pinalytics.a(ElementType.REMOVE_BUTTON, ComponentType.USER_FEED);
            showRemoveCollaboratorDialog(invitedUser);
        }

        _cls1()
        {
            this$0 = BoardCollaboratorInviteAdapter.this;
            invitedUser = user;
            super();
        }
    }


    private class _cls2
        implements android.view.View.OnClickListener
    {

        final BoardCollaboratorInviteAdapter this$0;

        public void onClick(View view)
        {
            Pinalytics.a(ElementType.BOARD_LEAVE_BUTTON, ComponentType.USER_FEED);
            LeaveBoardDialog.show((Activity)_context, _board);
        }

        _cls2()
        {
            this$0 = BoardCollaboratorInviteAdapter.this;
            super();
        }
    }


    private class _cls3
        implements android.view.View.OnClickListener
    {

        final BoardCollaboratorInviteAdapter this$0;
        final TypeAheadItem val$item;

        public void onClick(View view)
        {
            Pinalytics.a(ElementType.INVITE_BUTTON, ComponentType.USER_FEED);
            resetSearchQuery();
            Device.hideSoftKeyboard(view);
            if (item.getItemType() == com.pinterest.activity.search.model.TypeAheadItem.ItemType.PINNER)
            {
                view = new BoardCollaboratorInviteResponseHandler(item);
                view.setShowLoadingDialog(true);
                BoardApi.e(_boardId, item.getUid(), view, _apiTag);
            } else
            if (item.getItemType() == com.pinterest.activity.search.model.TypeAheadItem.ItemType.FACEBOOK_CONTACT)
            {
                view = new BoardCollaboratorGetFBInviteCodeResponseHandler(item.getUid());
                view.setShowLoadingDialog(true);
                BoardApi.g(_boardId, view, _apiTag);
                return;
            }
        }

        _cls3()
        {
            this$0 = BoardCollaboratorInviteAdapter.this;
            item = typeaheaditem;
            super();
        }

        private class BoardCollaboratorInviteResponseHandler extends ApiResponseHandler
        {

            private TypeAheadItem _item;
            final BoardCollaboratorInviteAdapter this$0;

            public void onFailure(Throwable throwable, ApiResponse apiresponse)
            {
                Application.showToast(apiresponse.getMessage());
            }

            public void onSuccess(ApiResponse apiresponse)
            {
                Pinalytics.a(EventType.BOARD_INVITE_COLLABORATOR, _item.getUid());
                Events.post(new ToastEvent(new UserToast(Resources.string(0x7f070098), _item.getTitle(), _item.getImageUri())));
                refreshBoardCollaborators();
            }

            public BoardCollaboratorInviteResponseHandler(TypeAheadItem typeaheaditem)
            {
                this$0 = BoardCollaboratorInviteAdapter.this;
                super();
                _item = typeaheaditem;
            }
        }


        private class BoardCollaboratorGetFBInviteCodeResponseHandler extends ApiResponseHandler
        {

            private String _userId;
            final BoardCollaboratorInviteAdapter this$0;

            public void onFailure(Throwable throwable, ApiResponse apiresponse)
            {
                Application.showToast(apiresponse.getMessage());
            }

            public void onSuccess(ApiResponse apiresponse)
            {
                try
                {
                    Object obj = (PinterestJsonObject)apiresponse.getData();
                    apiresponse = ((PinterestJsonObject) (obj)).a("url", "");
                    obj = ((PinterestJsonObject) (obj)).a("invite_code", "");
                    refreshBoardCollaborators();
                    inviteCollaboratorsWithFacebook(apiresponse, ((String) (obj)), _userId);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (ApiResponse apiresponse)
                {
                    CrashReporting.a(apiresponse);
                }
            }

            public BoardCollaboratorGetFBInviteCodeResponseHandler(String s)
            {
                this$0 = BoardCollaboratorInviteAdapter.this;
                super();
                _userId = s;
            }
        }

    }


    private class BoardCollaboratorsSuggestionHandler extends BaseApiResponseHandler
    {

        private String query;
        final BoardCollaboratorInviteAdapter this$0;

        private void postDataOnUIThread(final List apiItems)
        {
            class _cls1
                implements Runnable
            {

                final BoardCollaboratorsSuggestionHandler this$1;
                final List val$apiItems;

                public void run()
                {
                    if (query.equalsIgnoreCase(_currentSearchQuery))
                    {
                        if (apiItems.isEmpty())
                        {
                            TypeAheadItem typeaheaditem = new TypeAheadItem();
                            typeaheaditem.setUid("0");
                            typeaheaditem.setItemType(com.pinterest.activity.search.model.TypeAheadItem.ItemType.EMPTY_PLACEHOLDER);
                            typeaheaditem.setTitle(Resources.string(0x7f0703a0));
                            apiItems.add(typeaheaditem);
                        }
                        _items = apiItems;
                        appendEmailPlaceHolder();
                        notifyDataSetChanged();
                        setSpinnerState(false);
                    }
                }

                _cls1()
                {
                    this$1 = BoardCollaboratorsSuggestionHandler.this;
                    apiItems = list;
                    super();
                }
            }

            _handler.post(new _cls1());
        }

        public void onFailure(Throwable throwable, ApiResponse apiresponse)
        {
            PLog.error(throwable, "BoardCollaboratorsSuggestionHandler failed with response %s", new Object[] {
                apiresponse
            });
            class _cls2
                implements Runnable
            {

                final BoardCollaboratorsSuggestionHandler this$1;

                public void run()
                {
                    setSpinnerState(false);
                }

                _cls2()
                {
                    this$1 = BoardCollaboratorsSuggestionHandler.this;
                    super();
                }
            }

            _handler.post(new _cls2());
        }

        public void onSuccess(ApiResponse apiresponse)
        {
            if (query.equalsIgnoreCase(_currentSearchQuery))
            {
                postDataOnUIThread(TypeAheadItem.parseData(apiresponse.getData()));
            }
        }


        public BoardCollaboratorsSuggestionHandler(String s)
        {
            this$0 = BoardCollaboratorInviteAdapter.this;
            super();
            query = s;
        }
    }


    private class _cls6
        implements com.facebook.Session.StatusCallback
    {

        final BoardCollaboratorInviteAdapter this$0;
        final String val$inviteCode;
        final Bundle val$params;

        public void call(Session session, SessionState sessionstate, Exception exception)
        {
            if (session.isOpened())
            {
                showFacebookDialog(inviteCode, params);
            }
        }

        _cls6()
        {
            this$0 = BoardCollaboratorInviteAdapter.this;
            inviteCode = s;
            params = bundle;
            super();
        }
    }


    private class _cls4 extends BaseApiResponseHandler
    {

        final BoardCollaboratorInviteAdapter this$0;

        public void onFailure(Throwable throwable, ApiResponse apiresponse)
        {
            super.onFailure(throwable, apiresponse);
            class _cls2
                implements Runnable
            {

                final _cls4 this$1;

                public void run()
                {
                    setSpinnerState(false);
                    isLoadingMoreItems = false;
                }

                _cls2()
                {
                    this$1 = _cls4.this;
                    super();
                }
            }

            _handler.post(new _cls2());
        }

        public void onSuccess(final PinterestJsonObject collaboratorNextPage)
        {
            collaboratorNextPage = new CollaboratorInviteFeed(collaboratorNextPage, getBaseUrl(), _board, false);
            class _cls1
                implements Runnable
            {

                final _cls4 this$1;
                final Feed val$collaboratorNextPage;

                public void run()
                {
                    setSpinnerState(false);
                    _boardCollaborators.appendItems(collaboratorNextPage);
                    notifyDataSetChanged();
                    isLoadingMoreItems = false;
                }

                _cls1()
                {
                    this$1 = _cls4.this;
                    collaboratorNextPage = feed;
                    super();
                }
            }

            _handler.post(new _cls1());
        }

        _cls4()
        {
            this$0 = BoardCollaboratorInviteAdapter.this;
            super();
        }
    }


    private class _cls5 extends BaseApiResponseHandler
    {

        final BoardCollaboratorInviteAdapter this$0;

        public void onFailure(Throwable throwable, ApiResponse apiresponse)
        {
            super.onFailure(throwable, apiresponse);
            class _cls2
                implements Runnable
            {

                final _cls5 this$1;

                public void run()
                {
                    setSpinnerState(false);
                }

                _cls2()
                {
                    this$1 = _cls5.this;
                    super();
                }
            }

            _handler.post(new _cls2());
        }

        public void onSuccess(final PinterestJsonObject boardCollaborators)
        {
            super.onSuccess(boardCollaborators);
            _board = ModelHelper.getBoard(_boardId);
            boardCollaborators = new CollaboratorInviteFeed(boardCollaborators, getBaseUrl(), _board, true);
            class _cls1
                implements Runnable
            {

                final _cls5 this$1;
                final Feed val$boardCollaborators;

                public void run()
                {
                    setSpinnerState(false);
                    _boardCollaborators = boardCollaborators;
                    notifyDataSetChanged();
                }

                _cls1()
                {
                    this$1 = _cls5.this;
                    boardCollaborators = feed;
                    super();
                }
            }

            _handler.post(new _cls1());
        }

        _cls5()
        {
            this$0 = BoardCollaboratorInviteAdapter.this;
            super();
        }
    }


    private class _cls7
        implements com.facebook.widget.WebDialog.OnCompleteListener
    {

        final BoardCollaboratorInviteAdapter this$0;
        final String val$inviteCode;

        public void onComplete(Bundle bundle, FacebookException facebookexception)
        {
            if (facebookexception != null)
            {
                if (facebookexception instanceof FacebookOperationCanceledException)
                {
                    Application.showToast(0x7f070095);
                } else
                {
                    Application.showToast(facebookexception.getMessage());
                }
            } else
            {
                BoardApi.a(_boardId, inviteCode, _apiTag);
            }
            resetSearchQuery();
        }

        _cls7()
        {
            this$0 = BoardCollaboratorInviteAdapter.this;
            inviteCode = s;
            super();
        }
    }


    private class _cls8
        implements android.view.View.OnClickListener
    {

        final BoardCollaboratorInviteAdapter this$0;
        final RemoveCollaboratorDialog val$dialog;
        final User val$invitedUser;

        public void onClick(View view)
        {
            Pinalytics.a(ElementType.REMOVE_BUTTON, ComponentType.MODAL_DIALOG);
            removeCollaborator(invitedUser, dialog.isBlockedCbChecked());
            dialog.dismiss();
        }

        _cls8()
        {
            this$0 = BoardCollaboratorInviteAdapter.this;
            invitedUser = user;
            dialog = removecollaboratordialog;
            super();
        }
    }


    private class RemoveBoardCollaboratorResponseHandler extends BaseApiResponseHandler
    {

        private String _uid;
        final BoardCollaboratorInviteAdapter this$0;

        public void onFailure(Throwable throwable, ApiResponse apiresponse)
        {
            Application.showToast(apiresponse.getMessage());
        }

        public void onSuccess(ApiResponse apiresponse)
        {
            Pinalytics.a(EventType.BOARD_REMOVE_COLLABORATOR, _uid);
            refreshBoardCollaborators();
        }

        public RemoveBoardCollaboratorResponseHandler(String s)
        {
            this$0 = BoardCollaboratorInviteAdapter.this;
            super();
            _uid = s;
        }
    }

}
