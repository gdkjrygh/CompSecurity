// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class cob
{

    public final int a;
    public final int b;
    public final float c[];

    public cob(int i, int j)
    {
        this(i, j, new float[i * j]);
    }

    private cob(int i, int j, float af[])
    {
        b.a(af.length, "value.length", i * j, null);
        a = i;
        b = j;
        c = af;
    }

    public static cob a(cwf cwf1)
    {
        return new cob(cwf1.a, cwf1.b, cwf1.c);
    }

    public final cwf a()
    {
        cwf cwf1 = new cwf();
        cwf1.b = b;
        cwf1.a = a;
        cwf1.c = c;
        return cwf1;
    }

    public final int b()
    {
        return a * b;
    }
}
