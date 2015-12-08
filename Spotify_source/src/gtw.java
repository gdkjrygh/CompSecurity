// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gtw
{

    public final grq a;
    public final grt b;

    private gtw(grq grq1, grt grt1)
    {
        a = grq1;
        b = grt1;
    }

    gtw(grq grq1, grt grt1, byte byte0)
    {
        this(grq1, grt1);
    }

    public static boolean a(grt grt1, grq grq1)
    {
        grt1.c;
        JVM INSTR lookupswitch 13: default 120
    //                   200: 163
    //                   203: 163
    //                   204: 163
    //                   300: 163
    //                   301: 163
    //                   302: 122
    //                   307: 122
    //                   308: 163
    //                   404: 163
    //                   405: 163
    //                   410: 163
    //                   414: 163
    //                   501: 163;
           goto _L1 _L2 _L2 _L2 _L2 _L2 _L3 _L3 _L2 _L2 _L2 _L2 _L2 _L2
_L1:
        return false;
_L3:
        if (grt1.a("Expires", null) == null && grt1.j().d == -1 && !grt1.j().f && !grt1.j().e)
        {
            continue; /* Loop/switch isn't completed */
        }
_L2:
        if (!grt1.j().c && !grq1.d().c)
        {
            return true;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }
}
