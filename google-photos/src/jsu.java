// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class jsu
{

    long a;
    private final kdh b;

    public jsu(kdh kdh1)
    {
        b.d(kdh1);
        b = kdh1;
    }

    public jsu(kdh kdh1, long l)
    {
        b.d(kdh1);
        b = kdh1;
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
