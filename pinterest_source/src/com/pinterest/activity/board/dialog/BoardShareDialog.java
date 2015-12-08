// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.board.dialog;

import android.os.Bundle;
import android.view.LayoutInflater;
import com.pinterest.activity.task.dialog.BaseDialog;
import com.pinterest.api.ApiResponseHandler;
import com.pinterest.api.model.Board;
import com.pinterest.api.model.ModelHelper;

public class BoardShareDialog extends BaseDialog
{

    private Board _board;
    ApiResponseHandler onFeedback;

    public BoardShareDialog()
    {
        onFeedback = new ApiResponseHandler();
    }

    public static BoardShareDialog newInstance(String s)
    {
        BoardShareDialog boardsharedialog = new BoardShareDialog();
        Bundle bundle = new Bundle();
        bundle.putString("com.pinterest.EXTRA_BOARD_ID", s);
        boardsharedialog.setArguments(bundle);
        return boardsharedialog;
    }

    public void make(LayoutInflater layoutinflater)
    {
        Object obj = getContext();
        if (obj == null)
        {
            return;
        } else
        {
            obj = new BoardShareView(((Context) (obj)));
            ((BoardShareView) (obj)).setBoard(_board);
            setContent(((View) (obj)), 0);
            super.make(layoutinflater);
            return;
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = getArguments();
        if (bundle != null && bundle.getString("com.pinterest.EXTRA_BOARD_ID") != null)
        {
            _board = ModelHelper.getBoard(bundle.getString("com.pinterest.EXTRA_BOARD_ID"));
        }
    }

    private class BoardShareView extends LinearLayout
        implements android.view.View.OnClickListener
    {

        private Board _board;
        final BoardShareDialog this$0;

        private void init()
        {
            setOrientation(1);
            inflate(getContext(), 0x7f03005e, this);
            findViewById(0x7f0f012d).setOnClickListener(this);
            findViewById(0x7f0f012e).setOnClickListener(this);
            findViewById(0x7f0f012f).setOnClickListener(this);
        }

        public void onClick(View view)
        {
            if (_board == null)
            {
                dismiss();
                return;
            }
            switch (view.getId())
            {
            default:
                return;

            case 2131689773: 
                Pinalytics.a(ElementType.BOARD_SHARE_FACEBOOK_BUTTON, ComponentType.MODAL_DIALOG, _board.getUid());
                if (Experiments.L())
                {
                    SocialUtils.shareWithInviteCode(getContext(), new SendableObject(_board.getUid(), 1), "com.facebook.katana", getApiTag());
                    return;
                } else
                {
                    SocialUtils.startShare(getContext(), _board, null, "com.facebook.katana");
                    return;
                }

            case 2131689774: 
                Pinalytics.a(ElementType.BOARD_SHARE_COPY_LINK_BUTTON, ComponentType.MODAL_DIALOG, _board.getUid());
                view = (new StringBuilder()).append(StringUtils.removeEnd(Resources.string(0x7f070738), "/")).append(_board.getUrl()).toString();
                Device.copyToClipboard(getContext(), view);
                Events.post(new ToastEvent(new SimpleToast(Resources.string(0x7f070588))));
                return;

            case 2131689775: 
                break;
            }
            if (Experiments.L())
            {
                SocialUtils.shareWithInviteCode(getContext(), new SendableObject(_board.getUid(), 1), null, getApiTag());
            } else
            {
                SocialUtils.startShare(getContext(), _board, null, null);
            }
            Pinalytics.a(ElementType.BOARD_SHARE_OTHER_BUTTON, ComponentType.MODAL_DIALOG, _board.getUid());
        }

        public void setBoard(Board board)
        {
            _board = board;
        }

        public BoardShareView(Context context)
        {
            this(context, null);
        }

        public BoardShareView(Context context, AttributeSet attributeset)
        {
            this$0 = BoardShareDialog.this;
            super(context, attributeset);
            init();
        }
    }

}
