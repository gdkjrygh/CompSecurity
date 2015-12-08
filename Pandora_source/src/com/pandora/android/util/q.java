// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.util;

import android.app.Application;
import android.view.View;
import com.pandora.android.activity.a;
import com.pandora.android.coachmark.CoachmarkBuilder;
import com.pandora.android.coachmark.e;
import com.pandora.android.provider.b;
import com.pandora.radio.data.aa;
import com.pandora.radio.data.af;
import com.pandora.radio.data.ag;
import com.pandora.radio.data.y;
import p.cw.c;

public class q
{

    public static int a;

    public static CoachmarkBuilder a(com.pandora.radio.data.b b1, String s, String s1, String s2)
    {
        return (new CoachmarkBuilder()).b(true).a(0x7f020088).b(0x7f080110).c(s2).e(a(0x7f080225)).a(com.pandora.android.coachmark.e.b.a).d(true).a(com.pandora.android.coachmark.e.e.w).a(b1).a("videoAdDataUUID", s).a("stationId", s1);
    }

    private static String a(int i)
    {
        return b.a.h().getString(i);
    }

    public static boolean a(e e1, View view)
    {
        return e1.a((new CoachmarkBuilder()).b(true).a(new View[] {
            view
        }).b(0x7f080111).c(0x7f080112).e(true).a(com.pandora.android.coachmark.e.b.b).a(com.pandora.android.coachmark.e.e.d));
    }

    public static boolean a(e e1, com.pandora.android.coachmark.CoachmarkLayout.a a1)
    {
        if (!com.pandora.android.coachmark.e.f())
        {
            return false;
        } else
        {
            return e1.a((new CoachmarkBuilder()).b(true).a(0x7f02008d).b(0x7f080117).c(0x7f080118).a(com.pandora.android.coachmark.e.b.b).a(com.pandora.android.coachmark.e.e.b));
        }
    }

    public static boolean a(e e1, com.pandora.android.coachmark.CoachmarkLayout.a a1, int i)
    {
        int j;
        if (!com.pandora.android.coachmark.e.g())
        {
            return false;
        }
        j = 0x7f0801dd;
        i;
        JVM INSTR lookupswitch 3: default 48
    //                   5: 50
    //                   10: 123
    //                   20: 153;
           goto _L1 _L2 _L3 _L4
_L1:
        return false;
_L2:
        com.pandora.android.coachmark.e.e e2;
        int k;
        int l;
        l = 0x7f020086;
        k = 0x7f08010e;
        j = 0x7f08010f;
        e2 = com.pandora.android.coachmark.e.e.j;
        a1 = com.pandora.android.coachmark.e.b.f;
        i = 0x7f08010d;
_L6:
        return e1.a((new CoachmarkBuilder()).a(l).b(k).c(j).e(a(i)).b(true).d(true).a(a1).a(e2));
_L3:
        l = 0x7f02008b;
        k = 0x7f080109;
        int i1 = 0x7f08010a;
        e2 = com.pandora.android.coachmark.e.e.k;
        a1 = com.pandora.android.coachmark.e.b.f;
        i = j;
        j = i1;
        continue; /* Loop/switch isn't completed */
_L4:
        l = 0x7f02008f;
        k = 0x7f08010b;
        j = 0x7f08010c;
        e2 = com.pandora.android.coachmark.e.e.l;
        a1 = com.pandora.android.coachmark.e.b.f;
        i = 0x7f080263;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public static boolean a(e e1, com.pandora.android.coachmark.CoachmarkLayout.a a1, y y1)
    {
        return e1.a((new CoachmarkBuilder()).b(true).a(0x7f02008f).b(0x7f0800ff).c(0x7f080100).e(a(0x7f0801dd)).a(com.pandora.android.coachmark.e.b.c).a(com.pandora.android.coachmark.e.e.m).a(y1));
    }

    public static boolean a(e e1, com.pandora.android.coachmark.CoachmarkLayout.a a1, y y1, View view, View view1)
    {
        while (!com.pandora.android.coachmark.e.f() || y1 == null || !com.pandora.android.activity.a.a(y1)) 
        {
            return false;
        }
        return e1.a((new CoachmarkBuilder()).b(true).a(new View[] {
            view, view1
        }).a(0x7f02008e).b(0x7f080119).c(0x7f08011a).a(com.pandora.android.coachmark.e.b.b).a(com.pandora.android.coachmark.e.e.a));
    }

    public static boolean a(e e1, com.pandora.android.coachmark.CoachmarkLayout.a a1, y y1, aa aa1)
    {
        while (!com.pandora.android.coachmark.e.g() || y1 == null || !com.pandora.android.activity.a.a(y1) || aa1 == null || aa1.k() || aa1.M()) 
        {
            return false;
        }
        return e1.a((new CoachmarkBuilder()).b(true).d(true).e(true).a(com.pandora.android.coachmark.e.b.b).a(com.pandora.android.coachmark.CoachmarkLayout.b.c, 0x7f100024).a(0x7f020086).b(0x7f080105).c(0x7f080106).e(a(0x7f0800f6)).a(com.pandora.android.coachmark.e.e.f));
    }

    public static boolean a(e e1, String s)
    {
        s = b.a.h().getString(0x7f080258, new Object[] {
            s
        });
        return e1.a((new CoachmarkBuilder()).b(true).a(0x7f020087).b(0x7f08028b).c(s).e(a(0x7f0801f5)).a(com.pandora.android.coachmark.e.b.a).a(com.pandora.android.coachmark.e.e.q));
    }

    public static boolean b(e e1, View view)
    {
        return e1.a((new CoachmarkBuilder()).b(true).a(0x7f020085).c(true).a(new View[] {
            view
        }).b(0x7f0800f7).c(0x7f0800f8).a(com.pandora.android.coachmark.e.b.f).e(true).e(a(0x7f0800f6)).a(com.pandora.android.coachmark.e.e.r));
    }

    public static boolean b(e e1, com.pandora.android.coachmark.CoachmarkLayout.a a1)
    {
        boolean flag;
        if (!com.pandora.android.coachmark.e.f())
        {
            flag = false;
        } else
        {
            boolean flag1 = e1.a((new CoachmarkBuilder()).b(true).a(0x7f02008c).b(0x7f080115).c(0x7f080116).a(com.pandora.android.coachmark.e.b.b).a(com.pandora.android.coachmark.e.e.c));
            flag = flag1;
            if (!flag1)
            {
                return c(e1, a1);
            }
        }
        return flag;
    }

    public static boolean b(e e1, com.pandora.android.coachmark.CoachmarkLayout.a a1, y y1, aa aa1)
    {
        while (!com.pandora.android.coachmark.e.g() || b.a.b().k().g(com.pandora.android.coachmark.e.e.a.name()) > 0L || y1 == null || !com.pandora.android.activity.a.a(y1) || aa1 == null || aa1.k() || aa1.M() || System.currentTimeMillis() - y1.i() > 0x36ee80L) 
        {
            return false;
        }
        return e1.a((new CoachmarkBuilder()).b(true).d(true).a(com.pandora.android.coachmark.e.b.b).a(0x7f02008a).b(0x7f080107).c(0x7f080108).e(a(0x7f0801f5)).a(com.pandora.android.coachmark.e.e.g));
    }

    public static boolean c(e e1, com.pandora.android.coachmark.CoachmarkLayout.a a1)
    {
        if (com.pandora.android.coachmark.e.f() && !b.a.F())
        {
            a++;
            if (a >= 3)
            {
                return e1.a((new CoachmarkBuilder()).b(true).a(com.pandora.android.coachmark.CoachmarkLayout.b.a, 0x102002c).b(0x7f080113).c(0x7f080114).a(com.pandora.android.coachmark.e.b.b).a(com.pandora.android.coachmark.e.e.e));
            }
        }
        return false;
    }

    public static boolean d(e e1, com.pandora.android.coachmark.CoachmarkLayout.a a1)
    {
        while (!com.pandora.android.coachmark.e.g() || b.a.b().k().g(com.pandora.android.coachmark.e.e.b.name()) > 0L) 
        {
            return false;
        }
        return e1.a((new CoachmarkBuilder()).b(true).d(true).a(com.pandora.android.coachmark.e.b.b).a(0x7f02008d).b(0x7f080103).c(0x7f080104).e(a(0x7f0801f5)).a(com.pandora.android.coachmark.e.e.h));
    }

    public static boolean e(e e1, com.pandora.android.coachmark.CoachmarkLayout.a a1)
    {
        while (!com.pandora.android.coachmark.e.g() || b.a.b().k().g(com.pandora.android.coachmark.e.e.c.name()) > 0L) 
        {
            return false;
        }
        return e1.a((new CoachmarkBuilder()).b(true).d(true).a(com.pandora.android.coachmark.e.b.b).a(0x7f02008c).b(0x7f080101).c(0x7f080102).e(a(0x7f0801f5)).a(com.pandora.android.coachmark.e.e.i));
    }

    public static boolean f(e e1, com.pandora.android.coachmark.CoachmarkLayout.a a1)
    {
        if (!com.pandora.android.coachmark.e.g())
        {
            return false;
        }
        boolean flag = b.a.d().x();
        int i;
        int j;
        int k;
        if (flag)
        {
            i = 0x7f0800fd;
        } else
        {
            i = 0x7f0800fa;
        }
        if (flag)
        {
            j = 0x7f0800fe;
        } else
        {
            j = 0x7f0800fb;
        }
        if (flag)
        {
            k = 0x7f0800fc;
        } else
        {
            k = 0x7f0800f9;
        }
        if (flag)
        {
            a1 = com.pandora.android.coachmark.e.e.o;
        } else
        {
            a1 = com.pandora.android.coachmark.e.e.n;
        }
        return e1.a((new CoachmarkBuilder()).b(true).d(true).a(com.pandora.android.coachmark.e.b.d).a(0x7f020089).b(i).c(j).e(a(k)).a(a1));
    }
}
