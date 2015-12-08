// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.a.a.a;


// Referenced classes of package org.a.a.a:
//            h

final class g
{

    private transient h a[];
    private transient int b;
    private int c;
    private final float d;

    public g()
    {
        this((byte)0);
    }

    private g(byte byte0)
    {
        d = 0.75F;
        a = new h[20];
        c = 15;
    }

    public final Object a(int i, Object obj)
    {
        h ah[] = a;
        int j = (i & 0x7fffffff) % ah.length;
        for (h h1 = ah[j]; h1 != null; h1 = h1.d)
        {
            if (h1.a == i)
            {
                ah = ((h []) (h1.c));
                h1.c = obj;
                return ah;
            }
        }

        Object obj1 = ah;
        if (b >= c)
        {
            j = a.length;
            h ah1[] = a;
            int l = j * 2 + 1;
            h ah2[] = new h[l];
            c = (int)((float)l * d);
            a = ah2;
            do
            {
                int k = j - 1;
                if (j <= 0)
                {
                    break;
                }
                h h2;
                for (obj1 = ah1[k]; obj1 != null; obj1 = h2)
                {
                    h2 = ((h) (obj1)).d;
                    j = (((h) (obj1)).a & 0x7fffffff) % l;
                    obj1.d = ah2[j];
                    ah2[j] = ((h) (obj1));
                }

                j = k;
            } while (true);
            obj1 = a;
            j = (i & 0x7fffffff) % obj1.length;
        }
        obj1[j] = new h(i, i, obj, obj1[j]);
        b = b + 1;
        return null;
    }
}
