// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.ConnectionResult;

// Referenced classes of package com.google.android.gms.internal:
//            up, tu, tw, uu

final class tx extends up
{

    final tu a;
    final ConnectionResult b;
    final tw c;

    tx(tw tw, uu uu, tu tu1, ConnectionResult connectionresult)
    {
        c = tw;
        a = tu1;
        b = connectionresult;
        super(uu);
    }

    public final void a()
    {
        tu.c(a, b);
    }
}
