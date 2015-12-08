// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.signup;

import android.view.KeyEvent;
import android.widget.TextView;

// Referenced classes of package com.snapchat.android.fragments.signup:
//            SignupFragment

final class a
    implements android.widget.ctionListener
{

    private SignupFragment a;

    public final boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        SignupFragment.j(a);
        return true;
    }

    (SignupFragment signupfragment)
    {
        a = signupfragment;
        super();
    }
}
