// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class xw
{

    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public boolean h;

    public xw()
    {
        a = 0;
        b = 0;
        c = 0x80000000;
        d = 0x80000000;
        e = 0;
        f = 0;
        g = false;
        h = false;
    }

    public final void a(int i, int j)
    {
        c = i;
        d = j;
        h = true;
        if (g)
        {
            if (j != 0x80000000)
            {
                a = j;
            }
            if (i != 0x80000000)
            {
                b = i;
            }
        } else
        {
            if (i != 0x80000000)
            {
                a = i;
            }
            if (j != 0x80000000)
            {
                b = j;
                return;
            }
        }
    }
}
