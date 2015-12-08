// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class iuh
{

    public pev a;
    public iui b;
    public long c;
    public boolean d;
    public int e;
    public boolean f;

    public iuh(pev pev)
    {
        a = pev;
    }

    public final iug a()
    {
        iug iug1 = new iug();
        iug1.a = a;
        iug1.c = c;
        iug1.d = d;
        iug1.e = e;
        iui iui1;
        if (b != null)
        {
            iui1 = b;
        } else
        {
            iui1 = new iui();
        }
        iug1.b = iui1;
        return iug1;
    }
}
