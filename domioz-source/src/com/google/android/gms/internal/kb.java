// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.util.Log;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.location.aa;
import com.google.android.gms.location.o;

// Referenced classes of package com.google.android.gms.internal:
//            jy

final class kb extends n
{

    final jy a;
    private final int b;
    private final String c[];
    private final PendingIntent e;
    private final int f;

    public kb(jy jy, aa aa1, int i, PendingIntent pendingintent)
    {
        a = jy;
        super(jy, aa1);
        f = 1;
        b = o.a(i);
        e = pendingintent;
        c = null;
    }

    public kb(jy jy, aa aa1, int i, String as[])
    {
        a = jy;
        super(jy, aa1);
        f = 2;
        b = o.a(i);
        c = as;
        e = null;
    }

    protected final void a(Object obj)
    {
        if ((aa)obj != null)
        {
            switch (f)
            {
            default:
                Log.wtf("LocationClientImpl", (new StringBuilder("Unsupported action: ")).append(f).toString());
                break;

            case 1: // '\001'
            case 2: // '\002'
                break;
            }
        }
    }
}
