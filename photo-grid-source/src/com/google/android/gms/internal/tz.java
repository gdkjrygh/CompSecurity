// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.internal.ResolveAccountResponse;

// Referenced classes of package com.google.android.gms.internal:
//            up, tu, ty, uu

final class tz extends up
{

    final tu a;
    final ResolveAccountResponse b;
    final ty c;

    tz(ty ty, uu uu, tu tu1, ResolveAccountResponse resolveaccountresponse)
    {
        c = ty;
        a = tu1;
        b = resolveaccountresponse;
        super(uu);
    }

    public final void a()
    {
        tu.a(a, b);
    }
}
