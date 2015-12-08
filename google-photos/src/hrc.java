// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hrc extends Enum
{

    public static final hrc a;
    public static final hrc b;
    public static final hrc c;
    private static hrc d;
    private static final hrc e[] = values();
    private static final hrc h[];
    private final int f;
    private final int g;

    private hrc(String s, int i, int j, int k)
    {
        super(s, i);
        g = j;
        f = k;
    }

    public static hrc a(int i)
    {
        hrc ahrc[];
        int k;
        boolean flag1;
        if (i >= 0 && i < 0x7fffffff)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        p.a(flag1, Integer.valueOf(i));
        ahrc = e;
        k = ahrc.length;
        boolean flag;
        for (int j = 0; j < k; j++)
        {
            hrc hrc1 = ahrc[j];
            if (i >= hrc1.g && i < hrc1.f)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                return hrc1;
            }
        }

        throw new IllegalStateException((new StringBuilder(40)).append("Failed to obtain a speed for ").append(i).toString());
    }

    public static hrc valueOf(String s)
    {
        return (hrc)Enum.valueOf(hrc, s);
    }

    public static hrc[] values()
    {
        return (hrc[])h.clone();
    }

    static 
    {
        a = new hrc("FAST", 0, 100, 0x7fffffff);
        d = new hrc("MODERATE", 1, 40, 100);
        b = new hrc("SLOW", 2, 1, 40);
        c = new hrc("STOPPED", 3, 0, 1);
        h = (new hrc[] {
            a, d, b, c
        });
    }
}
