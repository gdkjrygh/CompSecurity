// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class bmv
{

    long a;
    private final cnp b;

    public bmv(cnp cnp1)
    {
        btl.a(cnp1);
        b = cnp1;
    }

    public bmv(cnp cnp1, long l)
    {
        btl.a(cnp1);
        b = cnp1;
        a = l;
    }

    public final void a()
    {
        a = b.b();
    }

    public final boolean a(long l)
    {
        while (a == 0L || b.b() - a > l) 
        {
            return true;
        }
        return false;
    }
}
