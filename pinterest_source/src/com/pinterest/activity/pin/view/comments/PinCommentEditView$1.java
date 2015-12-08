// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.view.comments;

import android.view.KeyEvent;
import android.widget.TextView;

// Referenced classes of package com.pinterest.activity.pin.view.comments:
//            PinCommentEditView

class this._cls0
    implements android.widget.onListener
{

    final PinCommentEditView this$0;

    public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        if (i == 4 || i == 0 || keyevent != null && keyevent.getKeyCode() == 66)
        {
            PinCommentEditView.access$000(PinCommentEditView.this);
            requestFocus();
            return true;
        } else
        {
            return false;
        }
    }

    ()
    {
        this$0 = PinCommentEditView.this;
        super();
    }
}
