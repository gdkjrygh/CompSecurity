// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.location.internal.c;
import com.google.android.gms.location.internal.d;
import com.google.android.gms.location.internal.i;
import com.google.android.gms.location.internal.n;

// Referenced classes of package com.google.android.gms.location:
//            c, d, i

public final class h
{
    public static abstract class a extends com.google.android.gms.common.api.k.a
    {

        public a(com.google.android.gms.common.api.c c1)
        {
            super(com.google.android.gms.location.h.a(), c1);
        }
    }


    public static final com.google.android.gms.common.api.a a;
    public static final com.google.android.gms.location.c b = new c();
    public static final com.google.android.gms.location.d c = new d();
    public static final com.google.android.gms.location.i d = new n();
    private static final com.google.android.gms.common.api.a.c e;
    private static final com.google.android.gms.common.api.a.a f;

    static com.google.android.gms.common.api.a.c a()
    {
        return e;
    }

    static 
    {
        e = new com.google.android.gms.common.api.a.c();
        f = new com.google.android.gms.common.api.a.a() {

            public final com.google.android.gms.common.api.a.b a(Context context, Looper looper, com.google.android.gms.common.internal.i j, Object obj, com.google.android.gms.common.api.c.b b1, com.google.android.gms.common.api.c.c c1)
            {
                return new i(context, looper, b1, c1, "locationServices", j);
            }

        };
        a = new com.google.android.gms.common.api.a("LocationServices.API", f, e);
    }
}
