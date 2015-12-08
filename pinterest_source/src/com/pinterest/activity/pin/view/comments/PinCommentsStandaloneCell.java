// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.view.comments;

import android.content.Context;
import android.text.Html;
import android.util.AttributeSet;
import com.pinterest.activity.task.dialog.BaseDialog;
import com.pinterest.activity.task.event.DialogEvent;
import com.pinterest.api.model.Comment;
import com.pinterest.api.model.CommentFeed;
import com.pinterest.api.model.MyUser;
import com.pinterest.api.model.Pin;
import com.pinterest.api.model.User;
import com.pinterest.base.Constants;
import com.pinterest.base.Events;
import com.pinterest.kit.application.Resources;

// Referenced classes of package com.pinterest.activity.pin.view.comments:
//            PinViewBaseCell, PinCommentView, PinCommentEditView

public class PinCommentsStandaloneCell extends PinViewBaseCell
{

    private static final int COMMENT_MAX_LENGTH = 40;
    private static final String COMMENT_TAG = "COMMENT_TAG";
    private CommentFeed _comments;
    private String _prefillText;
    private com.pinterest.api.remote.PinApi.CommentDeleteApiResponse onCommentDelete;

    public PinCommentsStandaloneCell(Context context)
    {
        this(context, null);
    }

    public PinCommentsStandaloneCell(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        onCommentDelete = new _cls4(true);
        init();
    }

    private void displayComments()
    {
        removeAllViews();
        if (_comments != null)
        {
            if (_comments.getCount() > 0)
            {
                boolean flag = MyUser.isUserMe(_pin.getUserUid());
                int i = _comments.getCount();
                for (final int position = 0; position < i; position++)
                {
                    Comment comment = (Comment)_comments.get(position);
                    final User user = comment.getUser();
                    if (user == null)
                    {
                        continue;
                    }
                    PinCommentView pincommentview = new PinCommentView(getContext());
                    pincommentview.setData(comment, _pin);
                    pincommentview.setOnClickListener(new _cls1());
                    if (flag || MyUser.isUserMe(user))
                    {
                        pincommentview.setOnLongClickListener(new _cls2());
                    }
                    addView(pincommentview);
                }

            }
            if (MyUser.hasAccessToken())
            {
                PinCommentEditView pincommenteditview = (PinCommentEditView)inflate(getContext(), 0x7f030166, null);
                pincommenteditview.setPin(_pin);
                pincommenteditview.setTag("COMMENT_TAG");
                pincommenteditview.setText(_prefillText);
                addView(pincommenteditview);
                return;
            }
        }
    }

    private void init()
    {
    }

    private void showDeleteCommentDialog(int i)
    {
        if (i >= 0 && i < _comments.getCount())
        {
            final BaseDialog dialog = new BaseDialog();
            dialog.setTitle(0x7f0701f3);
            final Comment comment = (Comment)_comments.get(i);
            if (comment != null)
            {
                User user = comment.getUser();
                if (user != null)
                {
                    String s1 = Html.fromHtml(comment.getText()).toString();
                    String s = s1;
                    if (s1.length() > 40)
                    {
                        s = Constants.appendEllipsis(s1.substring(0, 40));
                    }
                    if (user.getFirstName() != null)
                    {
                        dialog.setMessage(Resources.string(0x7f0701ec, new Object[] {
                            s, user.getFirstName()
                        }));
                    }
                    dialog.setPositiveButton(0x7f0701ed, new _cls3());
                    dialog.setNegativeButton(0x7f0700af, null);
                    Events.post(new DialogEvent(dialog));
                    return;
                }
            }
        }
    }

    public CommentFeed getComments()
    {
        return _comments;
    }

    public void setComments(CommentFeed commentfeed)
    {
        _comments = commentfeed;
        displayComments();
    }

    public void setPrefillText(String s)
    {
        _prefillText = s;
    }



    private class _cls4 extends com.pinterest.api.remote.PinApi.CommentDeleteApiResponse
    {

        final PinCommentsStandaloneCell this$0;

        public void onSuccess(ApiResponse apiresponse)
        {
            super.onSuccess(apiresponse);
            Application.showToast(0x7f0703fb);
        }

        _cls4(boolean flag)
        {
            this$0 = PinCommentsStandaloneCell.this;
            super(flag);
        }
    }


    private class _cls1
        implements android.view.View.OnClickListener
    {

        final PinCommentsStandaloneCell this$0;
        final User val$user;

        public void onClick(View view)
        {
            Events.post(new Navigation(Location.USER, user.getUid()));
        }

        _cls1()
        {
            this$0 = PinCommentsStandaloneCell.this;
            user = user1;
            super();
        }
    }


    private class _cls2
        implements android.view.View.OnLongClickListener
    {

        final PinCommentsStandaloneCell this$0;
        final int val$position;

        public boolean onLongClick(View view)
        {
            showDeleteCommentDialog(position);
            return true;
        }

        _cls2()
        {
            this$0 = PinCommentsStandaloneCell.this;
            position = i;
            super();
        }
    }


    private class _cls3
        implements android.view.View.OnClickListener
    {

        final PinCommentsStandaloneCell this$0;
        final Comment val$comment;
        final BaseDialog val$dialog;

        public void onClick(View view)
        {
            Pinalytics.a(ElementType.PIN_DELETE_BUTTON, ComponentType.MODAL_DIALOG, comment.getUid());
            onCommentDelete.setCommentUid(comment.getUid());
            PinApi.a(_pin.getUid(), comment.getUid(), onCommentDelete);
            dialog.dismiss();
        }

        _cls3()
        {
            this$0 = PinCommentsStandaloneCell.this;
            comment = comment1;
            dialog = basedialog;
            super();
        }
    }

}
