// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.view.comments;

import com.pinterest.api.model.Comment;
import com.pinterest.base.Application;
import com.pinterest.ui.atmention.AtMentionEditTextView;

// Referenced classes of package com.pinterest.activity.pin.view.comments:
//            PinCommentEditView

class this._cls0 extends com.pinterest.api.remote.onse
{

    final PinCommentEditView this$0;

    public void onFinish()
    {
        super.onFinish();
        PinCommentEditView.access$102(PinCommentEditView.this, false);
    }

    public void onSuccess(Comment comment)
    {
        super.onSuccess(comment);
        Application.showToast(0x7f0703fe);
        if (PinCommentEditView.access$200(PinCommentEditView.this) != null)
        {
            PinCommentEditView.access$200(PinCommentEditView.this).setText("");
        }
    }

    (String s)
    {
        this$0 = PinCommentEditView.this;
        super(s);
    }
}
