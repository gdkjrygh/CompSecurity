// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jgd
{

    public int a;
    public int b;

    public jgd()
    {
    }

    public final int a(int i)
    {
        if (a == b)
        {
            return i;
        }
        if (b != 0)
        {
            return (int)(((float)i / (float)b) * (float)a);
        } else
        {
            return 0;
        }
    }

    public final int b(int i)
    {
        if (a == b)
        {
            return i;
        }
        if (a != 0)
        {
            return (int)(((float)i / (float)a) * (float)b);
        } else
        {
            return 0;
        }
    }
}
