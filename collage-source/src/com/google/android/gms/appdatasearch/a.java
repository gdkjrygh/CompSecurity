// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appdatasearch;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.internal.ii;
import com.google.android.gms.internal.ij;

// Referenced classes of package com.google.android.gms.appdatasearch:
//            k

public final class a
{

    public static final com.google.android.gms.common.api.d a;
    public static final com.google.android.gms.common.api.a b;
    public static final k c = new ij();
    private static final com.google.android.gms.common.api.b d;

    static 
    {
        a = new com.google.android.gms.common.api.d();
        d = new com.google.android.gms.common.api.b() {

            public volatile com.google.android.gms.common.api.c a(Context context, Looper looper, i i, Object obj, com.google.android.gms.common.api.c.b b1, com.google.android.gms.common.api.c.c c1)
            {
                return a(context, looper, i, (com.google.android.gms.common.api.a.b)obj, b1, c1);
            }

            public ii a(Context context, Looper looper, i i, com.google.android.gms.common.api.a.b b1, com.google.android.gms.common.api.c.b b2, com.google.android.gms.common.api.c.c c1)
            {
                return new ii(context, looper, i, b2, c1);
            }

        };
        b = new com.google.android.gms.common.api.a("AppDataSearch.LIGHTWEIGHT_API", d, a);
    }
}
