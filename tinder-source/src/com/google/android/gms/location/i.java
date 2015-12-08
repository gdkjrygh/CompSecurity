// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.g;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.location.internal.c;
import com.google.android.gms.location.internal.e;
import com.google.android.gms.location.internal.k;
import com.google.android.gms.location.internal.p;

// Referenced classes of package com.google.android.gms.location:
//            c, e, j

public final class i
{
    public static abstract class a extends com.google.android.gms.internal.dg.a
    {

        public a(com.google.android.gms.common.api.c c1)
        {
            super(com.google.android.gms.location.i.a(), c1);
        }
    }


    public static final com.google.android.gms.common.api.a a;
    public static final com.google.android.gms.location.c b = new c();
    public static final com.google.android.gms.location.e c = new e();
    public static final j d = new p();
    private static final com.google.android.gms.common.api.a.c e;
    private static final com.google.android.gms.common.api.a.a f;

    static com.google.android.gms.common.api.a.c a()
    {
        return e;
    }

    public static k a(com.google.android.gms.common.api.c c1)
    {
        boolean flag1 = true;
        boolean flag;
        if (c1 != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        u.b(flag, "GoogleApiClient parameter is required.");
        c1 = (k)c1.a(e);
        if (c1 != null)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        u.a(flag, "GoogleApiClient is not configured to use the LocationServices.API Api. Pass thisinto GoogleApiClient.Builder#addApi() to use this feature.");
        return c1;
    }

    static 
    {
        e = new com.google.android.gms.common.api.a.c();
        f = new com.google.android.gms.common.api.a.a() {

            public final com.google.android.gms.common.api.a.b a(Context context, Looper looper, g g, Object obj, com.google.android.gms.common.api.c.b b1, com.google.android.gms.common.api.c.c c1)
            {
                return new k(context, looper, b1, c1, "locationServices", g);
            }

        };
        a = new com.google.android.gms.common.api.a("LocationServices.API", f, e);
    }
}
