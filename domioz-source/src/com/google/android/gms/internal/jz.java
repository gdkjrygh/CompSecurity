// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.internal.n;
import com.google.android.gms.location.o;
import com.google.android.gms.location.z;

// Referenced classes of package com.google.android.gms.internal:
//            jy

final class jz extends n
{

    final jy a;
    private final int b;
    private final String c[];

    public jz(jy jy, z z1, int i, String as[])
    {
        a = jy;
        super(jy, z1);
        b = o.a(i);
        c = as;
    }

    protected final void a(Object obj)
    {
        obj = (z)obj;
        if (obj != null)
        {
            ((z) (obj)).a(b);
        }
    }
}
