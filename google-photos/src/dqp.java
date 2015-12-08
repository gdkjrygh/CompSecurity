// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dqp
{

    public static final String a = dqm.getName();
    public static final String b = evf.getName();
    private static dqo c;

    public static void a(olm olm1)
    {
        if (c == null)
        {
            c = new dqo();
        }
        olm1.a(dqm, new dqm());
    }

    public static void b(olm olm1)
    {
        if (c == null)
        {
            c = new dqo();
        }
        olm1.a(evf, new evf[] {
            (dqm)olm1.a(dqm)
        });
    }

}
