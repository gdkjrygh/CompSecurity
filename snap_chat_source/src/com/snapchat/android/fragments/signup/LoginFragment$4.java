// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.signup;

import android.view.KeyEvent;
import android.widget.TextView;

// Referenced classes of package com.snapchat.android.fragments.signup:
//            LoginFragment

final class a
    implements android.widget.rActionListener
{

    private LoginFragment a;

    public final boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        LoginFragment.c(a);
        return false;
    }

    (LoginFragment loginfragment)
    {
        a = loginfragment;
        super();
    }
}
