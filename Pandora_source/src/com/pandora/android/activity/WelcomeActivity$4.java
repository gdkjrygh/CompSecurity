// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.activity;

import android.view.KeyEvent;
import android.widget.TextView;
import com.pandora.android.view.ValidatingEditText;

// Referenced classes of package com.pandora.android.activity:
//            WelcomeActivity

class a
    implements android.widget.ctionListener
{

    final WelcomeActivity a;

    public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        if (i == 6 || i == 0)
        {
            if (a.n())
            {
                a.m();
            } else
            {
                WelcomeActivity.e(a).clearFocus();
            }
            return true;
        } else
        {
            return false;
        }
    }

    (WelcomeActivity welcomeactivity)
    {
        a = welcomeactivity;
        super();
    }
}
