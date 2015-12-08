// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            fq, gn, gk, gm, 
//            gr, gl

public final class gq
{

    private static int a = 0x7fffffff;

    public static void a(gn gn1, byte byte0)
    {
        a(gn1, byte0, a);
    }

    private static void a(gn gn1, byte byte0, int i)
    {
        boolean flag;
        boolean flag1;
        boolean flag2;
        flag1 = false;
        flag2 = false;
        flag = false;
        if (i <= 0)
        {
            throw new fq("Maximum skip depth exceeded");
        }
        byte0;
        JVM INSTR tableswitch 2 15: default 96
    //                   2 97
    //                   3 103
    //                   4 127
    //                   5 96
    //                   6 109
    //                   7 96
    //                   8 115
    //                   9 96
    //                   10 121
    //                   11 133
    //                   12 139
    //                   13 175
    //                   14 220
    //                   15 254;
           goto _L1 _L2 _L3 _L4 _L1 _L5 _L1 _L6 _L1 _L7 _L8 _L9 _L10 _L11 _L12
_L1:
        return;
_L2:
        gn1.j();
        return;
_L3:
        gn1.k();
        return;
_L5:
        gn1.l();
        return;
_L6:
        gn1.m();
        return;
_L7:
        gn1.n();
        return;
_L4:
        gn1.o();
        return;
_L8:
        gn1.q();
        return;
_L9:
        gn1.d();
        do
        {
            gk gk1 = gn1.f();
            if (gk1.b != 0)
            {
                a(gn1, gk1.b, i - 1);
            } else
            {
                gn1.e();
                return;
            }
        } while (true);
_L10:
        gm gm1 = gn1.g();
        byte0 = flag;
        while (byte0 < gm1.c) 
        {
            a(gn1, gm1.a, i - 1);
            a(gn1, gm1.b, i - 1);
            byte0++;
        }
        continue; /* Loop/switch isn't completed */
_L11:
        gr gr1 = gn1.i();
        byte0 = flag1;
        while (byte0 < gr1.b) 
        {
            a(gn1, gr1.a, i - 1);
            byte0++;
        }
        if (true) goto _L1; else goto _L12
_L12:
        gl gl1 = gn1.h();
        byte0 = flag2;
        while (byte0 < gl1.b) 
        {
            a(gn1, gl1.a, i - 1);
            byte0++;
        }
        if (true) goto _L1; else goto _L13
_L13:
    }

}
