// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment;


// Referenced classes of package io.card.payment:
//            CreditCard

class e
{

    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public float f;
    public int g[];
    public int h;
    public int i;
    public CreditCard j;

    public e()
    {
        a = false;
        g = new int[16];
        g[0] = -1;
        g[15] = -1;
        j = new CreditCard();
    }

    final CreditCard a()
    {
        String s = new String();
        for (int k = 0; k < 16 && g[k] >= 0 && g[k] < 10; k++)
        {
            s = (new StringBuilder()).append(s).append(String.valueOf(g[k])).toString();
        }

        j.a = s;
        j.b = h;
        j.c = i;
        return j;
    }

    final int b()
    {
        int j1 = 1;
        int k;
        int l;
        int i1;
        if (b)
        {
            k = 1;
        } else
        {
            k = 0;
        }
        if (c)
        {
            l = 1;
        } else
        {
            l = 0;
        }
        if (d)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (!e)
        {
            j1 = 0;
        }
        return i1 + (l + k) + j1;
    }
}
