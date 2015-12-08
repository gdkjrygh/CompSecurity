// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b;


// Referenced classes of package com.google.a.b:
//            av, ax, aj, ay, 
//            ct, cs, be

final class cr extends av
{

    private final transient ax a[];
    private final transient ax b[];
    private final transient int c;

    cr(int i, ay aay[])
    {
        a = new ax[i];
        int j = aj.a(i, 1.2D);
        b = new ax[j];
        c = j - 1;
        for (int k = 0; k < i; k++)
        {
            Object obj = aay[k];
            Object obj2 = ((ay) (obj)).getKey();
            int l = aj.a(obj2.hashCode()) & c;
            Object obj1 = b[l];
            if (obj1 != null)
            {
                obj = new ct(((ax) (obj)), ((ax) (obj1)));
            }
            b[l] = ((ax) (obj));
            a[k] = ((ax) (obj));
            boolean flag;
            for (; obj1 != null; obj1 = ((ax) (obj1)).a())
            {
                if (!obj2.equals(((ax) (obj1)).getKey()))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (!flag)
                {
                    aay = String.valueOf(String.valueOf("key"));
                    obj = String.valueOf(String.valueOf(obj));
                    obj1 = String.valueOf(String.valueOf(obj1));
                    throw new IllegalArgumentException((new StringBuilder(aay.length() + 34 + ((String) (obj)).length() + ((String) (obj1)).length())).append("Multiple entries with same ").append(aay).append(": ").append(((String) (obj))).append(" and ").append(((String) (obj1))).toString());
                }
            }

        }

    }

    transient cr(ay aay[])
    {
        this(2, aay);
    }

    static ax[] a(cr cr1)
    {
        return cr1.a;
    }

    final be c()
    {
        return new cs(this, (byte)0);
    }

    public final Object get(Object obj)
    {
        if (obj != null)
        {
            int i = aj.a(obj.hashCode());
            int j = c;
            ax ax1 = b[i & j];
            while (ax1 != null) 
            {
                if (obj.equals(ax1.getKey()))
                {
                    return ax1.getValue();
                }
                ax1 = ax1.a();
            }
        }
        return null;
    }

    public final int size()
    {
        return a.length;
    }
}
