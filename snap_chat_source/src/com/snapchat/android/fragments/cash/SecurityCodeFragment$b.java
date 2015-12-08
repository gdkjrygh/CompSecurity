// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.cash;

import android.view.View;
import com.snapchat.android.ui.cash.CardCvvEditText;
import sp;

// Referenced classes of package com.snapchat.android.fragments.cash:
//            SecurityCodeFragment

final class <init>
    implements sp
{

    private SecurityCodeFragment a;

    public final void a()
    {
        SecurityCodeFragment.d(a).setVisibility(8);
    }

    public final void b()
    {
        if (SecurityCodeFragment.f(a) == null)
        {
            throw new RuntimeException("Forgot to set a callback on SecurityCodeFragment!");
        }
        if (SecurityCodeFragment.g(a))
        {
            SecurityCodeFragment.b(a, false);
            SecurityCodeFragment.h(a).setBackgroundColor(0xff000000);
        }
        SecurityCodeFragment.d(a).setVisibility(0);
        SecurityCodeFragment.b(a).setEnabled(false);
        SecurityCodeFragment.f(a).a(SecurityCodeFragment.b(a).b());
    }

    public final void c()
    {
    }

    private (SecurityCodeFragment securitycodefragment)
    {
        a = securitycodefragment;
        super();
    }

    a(SecurityCodeFragment securitycodefragment, byte byte0)
    {
        this(securitycodefragment);
    }
}
