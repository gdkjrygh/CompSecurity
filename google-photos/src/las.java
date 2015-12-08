// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class las
{

    int a;
    int b;
    final int c;
    final float d;

    public las()
    {
        this(2500, 1, 1.0F);
    }

    public las(int i, int j, float f)
    {
        a = 2500;
        c = 1;
        d = 1.0F;
    }

    public int a()
    {
        return a;
    }

    public void a(lev lev)
    {
        b = b + 1;
        a = (int)((float)a + (float)a * d);
        if (!c())
        {
            throw lev;
        } else
        {
            return;
        }
    }

    public int b()
    {
        return b;
    }

    protected boolean c()
    {
        return b <= c;
    }
}
