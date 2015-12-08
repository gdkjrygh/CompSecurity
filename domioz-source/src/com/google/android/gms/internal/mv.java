// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.l;
import com.google.android.gms.wallet.k;

// Referenced classes of package com.google.android.gms.internal:
//            mw, mr

final class mv extends k
{

    final String b;
    final String c;
    final int d = 21;
    final mr e;

    mv(mr mr, l l, String s, String s1)
    {
        e = mr;
        b = s;
        c = s1;
        super(l);
    }

    protected final void b(h h)
    {
        ((mw)h).a(b, c, d);
        a(Status.a);
    }
}
