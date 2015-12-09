// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.api.u;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            at, u, an, k, 
//            am, s

final class t extends at
{

    final String b;
    final String c;
    final byte d[];
    final s e;

    t(s s, l l, String s1, String s2, byte abyte0[])
    {
        e = s;
        b = s1;
        c = s2;
        d = abyte0;
        super(l);
    }

    protected final u a(Status status)
    {
        return new com.google.android.gms.wearable.internal.u(status, -1);
    }

    protected final void b(h h)
    {
        h = (an)h;
        String s = b;
        String s1 = c;
        byte abyte0[] = d;
        ((k)h.l()).a(new am(this), s, s1, abyte0);
    }
}
