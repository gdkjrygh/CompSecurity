// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.verification;

import PF;
import android.os.Handler;

// Referenced classes of package com.snapchat.android.fragments.verification:
//            PhoneVerificationFragment

final class a extends PF
{

    private PhoneVerificationFragment a;

    public final void a()
    {
        if (!a.isAdded())
        {
            return;
        } else
        {
            PhoneVerificationFragment.w(a);
            a.u();
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
            PhoneVerificationFragment.a(a, null);
            a.u();
            return;
        }
    }

    public (PhoneVerificationFragment phoneverificationfragment, int i, long l, Handler handler)
    {
        a = phoneverificationfragment;
        super(i, l, handler);
        PhoneVerificationFragment.a(phoneverificationfragment, i);
        phoneverificationfragment.u();
    }
}
