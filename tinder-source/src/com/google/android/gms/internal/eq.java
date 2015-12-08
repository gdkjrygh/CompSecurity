// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.g;
import com.google.android.gms.signin.internal.h;
import com.google.android.gms.signin.internal.i;
import java.util.concurrent.Executors;

// Referenced classes of package com.google.android.gms.internal:
//            er, et

public final class eq
{

    public static final com.google.android.gms.common.api.a.c a;
    public static final com.google.android.gms.common.api.a.c b;
    public static final com.google.android.gms.common.api.a.a c;
    static final com.google.android.gms.common.api.a.a d;
    public static final Scope e = new Scope("profile");
    public static final Scope f = new Scope("email");
    public static final a g;
    public static final a h;
    public static final er i = new h();

    static 
    {
        a = new com.google.android.gms.common.api.a.c();
        b = new com.google.android.gms.common.api.a.c();
        c = new com.google.android.gms.common.api.a.a() {

            public final com.google.android.gms.common.api.a.b a(Context context, Looper looper, g g1, Object obj, com.google.android.gms.common.api.c.b b1, com.google.android.gms.common.api.c.c c1)
            {
                obj = (et)obj;
                if (obj == null)
                {
                    obj = com.google.android.gms.internal.et.a;
                }
                return new i(context, looper, true, g1, ((et) (obj)), b1, c1, Executors.newSingleThreadExecutor());
            }

        };
        d = new com.google.android.gms.common.api.a.a() {

            public final com.google.android.gms.common.api.a.b a(Context context, Looper looper, g g1, Object obj, com.google.android.gms.common.api.c.b b1, com.google.android.gms.common.api.c.c c1)
            {
                return new i(context, looper, false, g1, com.google.android.gms.internal.et.a, b1, c1, Executors.newSingleThreadExecutor());
            }

        };
        g = new a("SignIn.API", c, a);
        h = new a("SignIn.INTERNAL_API", d, b);
    }
}
