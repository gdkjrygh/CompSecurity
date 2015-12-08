// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jge
{

    public final float a;
    public final float b;

    public jge(float f, float f1)
    {
        boolean flag1 = true;
        super();
        boolean flag;
        if (f >= 0.0F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag);
        if (f1 >= f)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag);
        if (f1 <= 1.0F)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        p.a(flag);
        a = f;
        b = f1;
    }
}
