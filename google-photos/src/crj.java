// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class crj
{

    public final float a;
    public final float b;
    public final int c;
    public final int d[];

    public crj(float f, float f1, int i)
    {
        boolean flag;
        if (f < f1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b.a(flag, "min value must be smaller than max");
        a = f;
        b = f1;
        c = i;
        d = new int[c];
    }
}
