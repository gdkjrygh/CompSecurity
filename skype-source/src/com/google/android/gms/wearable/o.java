// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.wearable.internal.ac;
import com.google.android.gms.wearable.internal.am;
import com.google.android.gms.wearable.internal.ao;
import com.google.android.gms.wearable.internal.aq;
import com.google.android.gms.wearable.internal.as;
import com.google.android.gms.wearable.internal.au;
import com.google.android.gms.wearable.internal.ax;
import com.google.android.gms.wearable.internal.az;
import com.google.android.gms.wearable.internal.bf;
import com.google.android.gms.wearable.internal.bg;
import com.google.android.gms.wearable.internal.z;

// Referenced classes of package com.google.android.gms.wearable:
//            c, a, j, m, 
//            ChannelApi, q, p, s, 
//            v, w

public final class o
{
    public static final class a
    {

        private a()
        {
        }

        a(byte byte0)
        {
            this();
        }
    }

    public static final class a.a
    {

        public a.a()
        {
        }
    }


    public static final c a = new bg();
    public static final com.google.android.gms.wearable.a b = new ax();
    public static final j c = new z();
    public static final m d = new ac();
    public static final ChannelApi e = new az();
    public static final q f = new au();
    public static final p g = new as();
    public static final s h = new bf();
    public static final v i = new am();
    public static final w j = new aq();
    public static final com.google.android.gms.common.api.a.c k;
    public static final com.google.android.gms.common.api.a l;
    private static final com.google.android.gms.common.api.a.a m;

    static 
    {
        k = new com.google.android.gms.common.api.a.c();
        m = new com.google.android.gms.common.api.a.a() {

            public final com.google.android.gms.common.api.a.b a(Context context, Looper looper, i i1, Object obj, com.google.android.gms.common.api.c.b b1, com.google.android.gms.common.api.c.c c1)
            {
                if ((a)obj == null)
                {
                    new a.a();
                    new a((byte)0);
                }
                return new ao(context, looper, b1, c1, i1);
            }

        };
        l = new com.google.android.gms.common.api.a("Wearable.API", m, k);
    }
}
