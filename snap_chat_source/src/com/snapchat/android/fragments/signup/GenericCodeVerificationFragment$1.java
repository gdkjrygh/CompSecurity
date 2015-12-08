// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.signup;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

// Referenced classes of package com.snapchat.android.fragments.signup:
//            GenericCodeVerificationFragment

final class a
    implements android.view.deVerificationFragment._cls1
{

    private GenericCodeVerificationFragment a;

    public final void onClick(View view)
    {
        a.c.setVisibility(0);
        if (GenericCodeVerificationFragment.a(a) != null)
        {
            GenericCodeVerificationFragment.a(a).c();
            GenericCodeVerificationFragment.b(a);
        }
        a.b.setText("");
        a.b.setClickable(false);
        a.a.setEnabled(false);
        if (a.a.length() < 6)
        {
            a.m();
            return;
        } else
        {
            a.h();
            return;
        }
    }

    (GenericCodeVerificationFragment genericcodeverificationfragment)
    {
        a = genericcodeverificationfragment;
        super();
    }
}
