// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.b.a;


// Referenced classes of package com.bumptech.glide.load.b.a:
//            m, c, a

final class b
    implements m
{

    private final c a;
    private int b;
    private int c;
    private android.graphics.Bitmap.Config d;

    public b(c c1)
    {
        a = c1;
    }

    public final void a()
    {
        a.a(this);
    }

    public final void a(int i, int j, android.graphics.Bitmap.Config config)
    {
        b = i;
        c = j;
        d = config;
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof b)
        {
            obj = (b)obj;
            flag = flag1;
            if (b == ((b) (obj)).b)
            {
                flag = flag1;
                if (c == ((b) (obj)).c)
                {
                    flag = flag1;
                    if (d == ((b) (obj)).d)
                    {
                        flag = true;
                    }
                }
            }
        }
        return flag;
    }

    public final int hashCode()
    {
        int j = b;
        int k = c;
        int i;
        if (d != null)
        {
            i = d.hashCode();
        } else
        {
            i = 0;
        }
        return i + (j * 31 + k) * 31;
    }

    public final String toString()
    {
        return com.bumptech.glide.load.b.a.a.c(b, c, d);
    }
}
