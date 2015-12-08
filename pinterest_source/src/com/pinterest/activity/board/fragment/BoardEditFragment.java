// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.board.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.CheckedTextView;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.pinterest.activity.board.dialog.BoardBaseDialog;
import com.pinterest.activity.board.dialog.BoardChangePrivacyDialog;
import com.pinterest.activity.board.dialog.BoardCollaboratorsDialog;
import com.pinterest.activity.board.dialog.BoardCoverDialog;
import com.pinterest.activity.board.dialog.BoardDeleteDialog;
import com.pinterest.activity.board.dialog.BoardEditCategoryDialog;
import com.pinterest.activity.board.dialog.BoardEditDescriptionDialog;
import com.pinterest.activity.board.dialog.BoardEditNameDialog;
import com.pinterest.activity.board.dialog.BoardLeaveDialog;
import com.pinterest.activity.task.event.DialogEvent;
import com.pinterest.activity.task.fragment.BaseFragment;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.Board;
import com.pinterest.api.model.Category;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.api.model.MyUser;
import com.pinterest.api.remote.BoardApi;
import com.pinterest.base.Constants;
import com.pinterest.base.Events;
import com.pinterest.experiment.Experiments;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;
import com.pinterest.ui.ViewHelper;
import com.pinterest.ui.actions.Scrollable;
import com.pinterest.ui.grid.AdapterFooterView;

public class BoardEditFragment extends BaseFragment
    implements Scrollable
{

    public static final int COLLABORATOR = 2;
    public static final int OWNER = 0;
    public static final int OWNER_SECRET = 1;
    private Board _board;
    View _categoryBt;
    TextView _categoryTv;
    View _changePrivacyBt;
    CheckedTextView _changePrivacyCb;
    View _coverImageBt;
    View _deleteBt;
    View _descriptionBt;
    TextView _descriptionTv;
    private com.pinterest.base.Events.EventsSubscriber _eventsSubscriber;
    View _groupButtons;
    View _leaveBt;
    View _memberInviteBt;
    CheckedTextView _memberInviteCb;
    View _nameBt;
    TextView _nameTv;
    View _showMapBt;
    CheckedTextView _showMapCb;
    View _whoCanPinBt;
    View _whoCanPinLine;

    public BoardEditFragment()
    {
        _eventsSubscriber = new _cls2();
    }

    private void initUi(View view)
    {
        if (view == null)
        {
            return;
        } else
        {
            ButterKnife.a(this, view);
            view = (AdapterFooterView)view.findViewById(0x7f0f01fd);
            view.setState(1);
            view.setShadowVisibility(8);
            updateUi();
            return;
        }
    }

    private void updateUi()
    {
        boolean flag2 = true;
        if (getActivity() == null || _board == null)
        {
            return;
        }
        Object obj;
        Exception exception;
        byte byte0;
        boolean flag;
        boolean flag1;
        if (Constants.isTrue(_board.getCollaborator()))
        {
            flag = false;
            byte0 = 2;
        } else
        if (MyUser.isUserMe(_board.getUserUid()))
        {
            if (Constants.isTrue(_board.getSecret()))
            {
                byte0 = 1;
            } else
            {
                byte0 = 0;
            }
            flag = true;
        } else
        {
            flag = false;
            byte0 = 0;
        }
        ViewHelper.setVisibility(_nameBt, flag);
        ViewHelper.setVisibility(_descriptionBt, flag);
        ViewHelper.setVisibility(_categoryBt, flag);
        obj = _coverImageBt;
        if (flag && !Experiments.x())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        ViewHelper.setVisibility(((View) (obj)), flag1);
        ViewHelper.setVisibility(_showMapBt, flag);
        ViewHelper.setVisibility(_changePrivacyBt, flag);
        ViewHelper.setVisibility(_whoCanPinLine, flag);
        obj = _memberInviteBt;
        if (flag && Experiments.n())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        ViewHelper.setVisibility(((View) (obj)), flag1);
        _memberInviteCb.setChecked(Constants.isTrue(_board.getCollaboratorInvitesEnabled()));
        obj = _groupButtons;
        if (flag || byte0 == 2)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        ViewHelper.setVisibility(((View) (obj)), flag1);
        ViewHelper.setVisibility(_deleteBt, flag);
        obj = _leaveBt;
        if (byte0 == 2)
        {
            flag = flag2;
        } else
        {
            flag = false;
        }
        ViewHelper.setVisibility(((View) (obj)), flag);
        _nameTv.setText(_board.getName());
        _descriptionTv.setText(_board.getDescription());
        obj = ModelHelper.getCategory(_board.getCategory());
        if (obj != null)
        {
            try
            {
                _categoryTv.setText(((Category) (obj)).getName());
            }
            // Misplaced declaration of an exception variable
            catch (Exception exception) { }
        }
        _changePrivacyCb.setChecked(Constants.isFalse(_board.getSecret()));
        _showMapCb.setChecked(_board.isPlaceBoard());
        return;
    }

    protected void onActivate()
    {
        super.onActivate();
        Events.register(_eventsSubscriber, com/pinterest/api/model/Board$UpdateEvent, new Class[0]);
    }

    void onAllowMemberInviteClicked()
    {
        CheckedTextView checkedtextview = _memberInviteCb;
        boolean flag;
        if (!_memberInviteCb.isChecked())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        checkedtextview.setChecked(flag);
        flag = _memberInviteCb.isChecked();
        _board.setCollaboratorInvitesEnabled(Boolean.valueOf(flag));
        ModelHelper.updateBoard(_board, null, null, null, null, Boolean.valueOf(flag), null, getApiTag());
        Events.post(new com.pinterest.api.model.Board.UpdateEvent(_board, false));
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
    }

    void onCategoryClicked()
    {
        Events.post(new DialogEvent(BoardBaseDialog.newInstance(com/pinterest/activity/board/dialog/BoardEditCategoryDialog, _board.getUid())));
    }

    void onChangePrivacyClicked()
    {
        Events.post(new DialogEvent(BoardBaseDialog.newInstance(com/pinterest/activity/board/dialog/BoardChangePrivacyDialog, _board.getUid())));
    }

    void onCoverImageClicked()
    {
        Events.post(new DialogEvent(BoardBaseDialog.newInstance(com/pinterest/activity/board/dialog/BoardCoverDialog, _board.getUid())));
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        _layoutId = 0x7f0300aa;
        _menuId = 0x7f100009;
        bundle = getNavigation().getId();
        BoardApi.a(bundle, new _cls1(), getApiTag());
        _board = ModelHelper.getBoard(bundle);
    }

    protected void onDeactivate()
    {
        Events.unregister(_eventsSubscriber, new Class[] {
            com/pinterest/api/model/Board$UpdateEvent
        });
        super.onDeactivate();
    }

    void onDeleteClicked()
    {
        Events.post(new DialogEvent(BoardBaseDialog.newInstance(com/pinterest/activity/board/dialog/BoardDeleteDialog, _board.getUid())));
    }

    void onDescriptionClicked()
    {
        BoardEditDescriptionDialog boardeditdescriptiondialog = new BoardEditDescriptionDialog();
        boardeditdescriptiondialog.addBoardUidToArguments(_board.getUid());
        Events.post(new DialogEvent(boardeditdescriptiondialog));
    }

    void onLeaveClicked()
    {
        Events.post(new DialogEvent(BoardBaseDialog.newInstance(com/pinterest/activity/board/dialog/BoardLeaveDialog, _board.getUid())));
    }

    void onNameClicked()
    {
        BoardEditNameDialog boardeditnamedialog = new BoardEditNameDialog();
        boardeditnamedialog.addBoardUidToArguments(_board.getUid());
        Events.post(new DialogEvent(boardeditnamedialog));
    }

    void onShowMapClicked()
    {
        Object obj = _showMapCb;
        boolean flag;
        if (!_showMapCb.isChecked())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ((CheckedTextView) (obj)).setChecked(flag);
        if (_showMapCb.isChecked())
        {
            obj = "places";
        } else
        {
            obj = "default";
        }
        BoardApi.a(_board.getUid(), null, null, null, null, ((String) (obj)), null, null, getApiTag());
        _board.setLayout(((String) (obj)));
        ModelHelper.setBoard(_board);
        Events.post(new com.pinterest.api.model.Board.UpdateEvent(_board, false));
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        _actionBar.setTitle(0x7f07008d);
        initUi(view);
    }

    void onWhoCanPinClicked()
    {
        Pinalytics.a(ElementType.WHO_CAN_PIN_BUTTON, ComponentType.NAVIGATION);
        if (_board.allowToInviteOthers())
        {
            Events.post(new Navigation(Location.INVITE_BOARD_COLLAB, _board.getUid()));
            return;
        } else
        {
            Events.post(new DialogEvent(BoardBaseDialog.newInstance(com/pinterest/activity/board/dialog/BoardCollaboratorsDialog, _board.getUid())));
            return;
        }
    }



/*
    static Board access$002(BoardEditFragment boardeditfragment, Board board)
    {
        boardeditfragment._board = board;
        return board;
    }

*/


    private class _cls2
        implements com.pinterest.base.Events.EventsSubscriber
    {

        final BoardEditFragment this$0;

        public void onEventMainThread(com.pinterest.api.model.Board.UpdateEvent updateevent)
        {
            _board = updateevent.getBoard();
            updateUi();
            if (updateevent.wasDeleted())
            {
                updateevent = new com.pinterest.activity.task.model.Navigation.Remove();
                updateevent.add(new Navigation(Location.BOARD, _board.getUid()));
                updateevent.add(new Navigation(Location.BOARD_EDIT, _board.getUid()));
                Events.post(updateevent);
            }
        }

        _cls2()
        {
            this$0 = BoardEditFragment.this;
            super();
        }
    }


    private class _cls1 extends com.pinterest.api.remote.BoardApi.BoardApiResponse
    {

        final BoardEditFragment this$0;

        public void onSuccess(Board board)
        {
            _board = board;
            updateUi();
        }

        _cls1()
        {
            this$0 = BoardEditFragment.this;
            super();
        }
    }

}
