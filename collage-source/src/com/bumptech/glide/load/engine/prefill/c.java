// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.engine.prefill;


public final class c
{

    static final android.graphics.Bitmap.Config a;
    private final int b;
    private final int c;
    private final android.graphics.Bitmap.Config d;
    private final int e;

    int a()
    {
        return b;
    }

    int b()
    {
        return c;
    }

    android.graphics.Bitmap.Config c()
    {
        return d;
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof c)
        {
            obj = (c)obj;
            flag = flag1;
            if (c == ((c) (obj)).c)
            {
                flag = flag1;
                if (b == ((c) (obj)).b)
                {
                    flag = flag1;
                    if (e == ((c) (obj)).e)
                    {
                        flag = flag1;
                        if (d == ((c) (obj)).d)
                        {
                            flag = true;
                        }
                    }
                }
            }
        }
        return flag;
    }

    public int hashCode()
    {
        return ((b * 31 + c) * 31 + d.hashCode()) * 31 + e;
    }

    public String toString()
    {
        return (new StringBuilder()).append("PreFillSize{width=").append(b).append(", height=").append(c).append(", config=").append(d).append(", weight=").append(e).append('}').toString();
    }

    static 
    {
        a = android.graphics.Bitmap.Config.RGB_565;
    }
}
