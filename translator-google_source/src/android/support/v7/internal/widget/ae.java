// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;


public final class ae
{

    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public boolean h;

    public ae()
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

    public final void b(int i, int j)
    {
        h = false;
        if (i != 0x80000000)
        {
            e = i;
            a = i;
        }
        if (j != 0x80000000)
        {
            f = j;
            b = j;
        }
    }
}
