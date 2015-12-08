// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.landing;

import android.view.KeyEvent;
import android.widget.TextView;

// Referenced classes of package me.lyft.android.ui.landing:
//            SignupView

class val.target
    implements android.widget.ener
{

    final ion this$0;
    final SignupView val$target;

    public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        return val$target.onEmailEditorAction(textview, i, keyevent);
    }

    ()
    {
        this$0 = final_;
        val$target = SignupView.this;
        super();
    }
}
