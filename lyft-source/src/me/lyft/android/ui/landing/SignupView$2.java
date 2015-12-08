// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.landing;

import android.view.KeyEvent;
import android.widget.TextView;

// Referenced classes of package me.lyft.android.ui.landing:
//            SignupView

class this._cls0
    implements android.widget.itorActionListener
{

    final SignupView this$0;

    public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        if (i == 6)
        {
            submitProfileInfo();
            return true;
        } else
        {
            return false;
        }
    }

    stener()
    {
        this$0 = SignupView.this;
        super();
    }
}
