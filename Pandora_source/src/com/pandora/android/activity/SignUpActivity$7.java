// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.activity;

import android.view.KeyEvent;
import android.widget.TextView;
import com.pandora.android.util.s;

// Referenced classes of package com.pandora.android.activity:
//            SignUpActivity

class a
    implements android.widget.ActionListener
{

    final SignUpActivity a;

    public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        if (i == 0 || i == 66)
        {
            s.a(a, SignUpActivity.h(a));
            return true;
        } else
        {
            return false;
        }
    }

    (SignUpActivity signupactivity)
    {
        a = signupactivity;
        super();
    }
}
