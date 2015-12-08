// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.signup;

import PF;
import android.os.Handler;

// Referenced classes of package com.snapchat.android.fragments.signup:
//            GenericCodeVerificationFragment

final class a extends PF
{

    private GenericCodeVerificationFragment a;

    public final void a()
    {
        if (!a.isAdded())
        {
            return;
        } else
        {
            GenericCodeVerificationFragment.c(a);
            a.t();
            return;
        }
    }

    public final void b()
    {
        if (!a.isAdded())
        {
            return;
        } else
        {
            GenericCodeVerificationFragment.b(a);
            a.t();
            return;
        }
    }

    public (GenericCodeVerificationFragment genericcodeverificationfragment, int i, long l, Handler handler)
    {
        a = genericcodeverificationfragment;
        super(i, l, handler);
        GenericCodeVerificationFragment.a(genericcodeverificationfragment, i);
        genericcodeverificationfragment.t();
    }
}
