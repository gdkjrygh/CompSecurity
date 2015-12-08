// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class avl extends avk
{

    avl()
    {
    }

    public final float a(int i, int j, int k, int l)
    {
        i = Math.min(j / l, i / k);
        if (i == 0)
        {
            return 1.0F;
        } else
        {
            return 1.0F / (float)Integer.highestOneBit(i);
        }
    }

    public final int a(int i, int j)
    {
        return avo.b;
    }
}
