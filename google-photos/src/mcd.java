// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class mcd
{

    public static final String a = mbx.getName();
    public static final String b = mbz.getName();
    private static mcc c;

    public static void a(olm olm1)
    {
        if (c == null)
        {
            c = new mcc();
        }
        olm1.a(mbx, new mca());
    }

    public static void b(olm olm1)
    {
        if (c == null)
        {
            c = new mcc();
        }
        olm1.a(mbz, new mcb());
    }

}
