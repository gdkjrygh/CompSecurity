// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class cav extends cbg
{

    private final long c = 0xf4240L;

    public cav(int i, int j, long l1)
    {
        cbh cbh1 = new cbh();
        cbh1.b = i;
        cbh1.d = caz.b;
        cbh1.e = j;
        cbh1.g = caz.b;
        super(cbh1);
    }

    public final float h(cba cba1)
    {
        return (float)((Math.sin((double)cba1.a / (double)c) + 1.0D) / 2D);
    }

    public final float l(cba cba1)
    {
        return 1.0F - h(cba1);
    }
}
