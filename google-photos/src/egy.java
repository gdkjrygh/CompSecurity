// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class egy
    implements nug
{

    private long a;
    private egv b;

    egy(egv egv1)
    {
        b = egv1;
        super();
        a = -1L;
    }

    public final void b_(Object obj)
    {
        long l = ((jgc)obj).d;
        if (l != a)
        {
            egv.a(b, egv.a() + l);
            a = l;
        }
    }
}
