// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.dd;

import android.content.Context;
import android.os.Looper;
import com.google.android.m4b.maps.h.b;
import com.google.android.m4b.maps.h.o;
import com.google.android.m4b.maps.j.g;
import com.google.android.m4b.maps.v.i;
import java.util.concurrent.Executors;

// Referenced classes of package com.google.android.m4b.maps.dd:
//            b, d

public final class a
{

    public static final com.google.android.m4b.maps.h.b.b a;
    private static com.google.android.m4b.maps.h.b.c b;
    private static com.google.android.m4b.maps.h.b.c c;
    private static com.google.android.m4b.maps.h.b.b d;
    private static b e;
    private static b f;
    private static com.google.android.m4b.maps.dd.b g = new com.google.android.m4b.maps.dd.b();

    static 
    {
        b = new com.google.android.m4b.maps.h.b.c();
        c = new com.google.android.m4b.maps.h.b.c();
        a = new com.google.android.m4b.maps.h.b.b() {

            public final com.google.android.m4b.maps.h.b.a a(Context context, Looper looper, g g1, Object obj, com.google.android.m4b.maps.h.d.b b1, com.google.android.m4b.maps.h.d.d d1)
            {
                obj = (d)obj;
                if (obj == null)
                {
                    obj = d.a;
                }
                return new i(context, looper, true, g1, ((d) (obj)), b1, d1, Executors.newSingleThreadExecutor());
            }

        };
        d = new com.google.android.m4b.maps.h.b.b() {

            public final com.google.android.m4b.maps.h.b.a a(Context context, Looper looper, g g1, Object obj, com.google.android.m4b.maps.h.d.b b1, com.google.android.m4b.maps.h.d.d d1)
            {
                return new i(context, looper, false, g1, d.a, b1, d1, Executors.newSingleThreadExecutor());
            }

        };
        e = new b("SignIn.API", a, b, new o[0]);
        f = new b("SignIn.INTERNAL_API", d, c, new o[0]);
    }
}
