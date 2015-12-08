// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aq;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.m4b.maps.ay.m;
import com.google.android.m4b.maps.bo.ah;
import com.google.android.m4b.maps.bs.d;
import com.google.android.m4b.maps.bw.g;
import com.google.android.m4b.maps.bx.o;
import com.google.android.m4b.maps.cg.bj;
import com.google.android.m4b.maps.cg.bo;
import com.google.android.m4b.maps.cg.bt;
import java.util.concurrent.TimeUnit;

public final class e
{

    private static boolean a;

    public static void a(bj bj1, g g)
    {
        com/google/android/m4b/maps/aq/e;
        JVM INSTR monitorenter ;
        boolean flag = a;
        if (!flag) goto _L2; else goto _L1
_L1:
        com/google/android/m4b/maps/aq/e;
        JVM INSTR monitorexit ;
        return;
_L2:
        a = true;
        ah ah1 = ah.a;
        ah ah2 = ah.d;
        ah ah3 = ah.f;
        ah ah4 = ah.e;
        ah ah5 = ah.o;
        ah ah6 = ah.n;
        bt bt1 = bj1.d;
        m m1 = bt1.a();
        Context context = bj1.a;
        com.google.android.m4b.maps.bs.e e1 = bj1.i;
        bj1 = bj1.b;
        int i = com.google.android.m4b.maps.h.g.maps_dav_k2;
        o.a(context, bj1, new ah[] {
            ah1, ah2, ah3, ah4, ah5, ah6
        }, i, m1, e1, g);
        bj1 = new bo(bt1, context.getSharedPreferences("MapviewInitializerPreferences", 0), new com.google.android.m4b.maps.cg.bo.a() {

            public final void a()
            {
                o.d();
            }

        });
        m1.a(bj1);
        g = e1.b;
        long l = TimeUnit.DAYS.toMillis(((d) (g)).a);
        if (!((bo) (bj1)).c.a(false))
        {
            long l1 = System.currentTimeMillis();
            if (l1 - ((bo) (bj1)).a.getLong("LAST_FETCH_PERSISTENT_TAG", l1) > l)
            {
                ((bo) (bj1)).b.a();
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
        bj1;
        throw bj1;
    }
}
