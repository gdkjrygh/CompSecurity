// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.ConnectionResult;

// Referenced classes of package com.google.android.gms.internal:
//            up, uc, tu, uu

final class ud extends up
{

    final ConnectionResult a;
    final uc b;

    ud(uc uc1, uu uu, ConnectionResult connectionresult)
    {
        b = uc1;
        a = connectionresult;
        super(uu);
    }

    public final void a()
    {
        tu.a(b.a, a);
    }
}
