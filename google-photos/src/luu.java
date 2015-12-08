// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class luu
    implements Runnable
{

    private String a;
    private lur b;

    luu(lur lur1, String s)
    {
        b = lur1;
        a = s;
        super();
    }

    public final void run()
    {
        lur.a(b, a);
    }
}
