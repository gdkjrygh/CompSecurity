// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.o;

import android.content.Context;
import android.os.Looper;
import com.google.android.m4b.maps.h.b;
import com.google.android.m4b.maps.h.o;
import com.google.android.m4b.maps.j.g;
import com.google.android.m4b.maps.q.d;
import com.google.android.m4b.maps.q.i;

// Referenced classes of package com.google.android.m4b.maps.o:
//            h, b, f

public final class v
{
    public static abstract class a extends com.google.android.m4b.maps.h.c.a
    {

        public a(com.google.android.m4b.maps.h.d d1)
        {
            super(v.a(), d1);
        }
    }


    public static final b a;
    public static final f b = new d();
    private static final com.google.android.m4b.maps.h.b.c c;
    private static final com.google.android.m4b.maps.h.b.b d;
    private static h e = new h();
    private static com.google.android.m4b.maps.o.b f = new com.google.android.m4b.maps.o.b();

    static com.google.android.m4b.maps.h.b.c a()
    {
        return c;
    }

    static 
    {
        c = new com.google.android.m4b.maps.h.b.c();
        d = new com.google.android.m4b.maps.h.b.b() {

            public final com.google.android.m4b.maps.h.b.a a(Context context, Looper looper, g g, Object obj, com.google.android.m4b.maps.h.d.b b1, com.google.android.m4b.maps.h.d.d d1)
            {
                return new i(context, looper, b1, d1, "locationServices", g);
            }

        };
        a = new b("LocationServices.API", d, c, new o[0]);
    }
}
