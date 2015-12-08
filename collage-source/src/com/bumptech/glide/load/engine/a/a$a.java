// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.engine.a;


// Referenced classes of package com.bumptech.glide.load.engine.a:
//            h, a

static class a
    implements h
{

    private final d a;
    private int b;
    private int c;
    private android.graphics.ap.Config d;

    public void a()
    {
        a.a(this);
    }

    public void a(int i, int j, android.graphics.ap.Config config)
    {
        b = i;
        c = j;
        d = config;
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof d)
        {
            obj = (d)obj;
            flag = flag1;
            if (b == ((b) (obj)).b)
            {
                flag = flag1;
                if (c == ((c) (obj)).c)
                {
                    flag = flag1;
                    if (d == ((d) (obj)).d)
                    {
                        flag = true;
                    }
                }
            }
        }
        return flag;
    }

    public int hashCode()
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

    public String toString()
    {
        return com.bumptech.glide.load.engine.a.a.c(b, c, d);
    }

    public ( )
    {
        a = ;
    }
}
