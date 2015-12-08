// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.media;


public class Size
    implements Comparable
{

    public static final Size a = new Size(32767, 32767);
    public static final Size b = new Size(352, 288);
    public static final Size c = new Size(320, 240);
    public static final Size d = new Size(480, 320);
    public static final Size e = new Size(640, 480);
    public static final Size f = new Size(720, 480);
    public static final Size g = new Size(1280, 720);
    public static final Size h = new Size(1920, 1080);
    public static final Size i = new Size(320, 320);
    public static final Size j = new Size(480, 480);
    public static final Size k = new Size(640, 640);
    private int l;
    private int m;

    public Size(int i1, int j1)
    {
        if (i1 < 0)
        {
            throw new IllegalArgumentException("width must be positive or zero");
        }
        if (j1 < 0)
        {
            throw new IllegalArgumentException("height must be positive or zero");
        } else
        {
            l = i1;
            m = j1;
            return;
        }
    }

    public final int a()
    {
        return l;
    }

    public final int a(Size size)
    {
        if (l == size.l && m == size.m)
        {
            return 0;
        }
        if (l > size.l && m > size.m)
        {
            return ((l - size.l) + m) - size.m;
        } else
        {
            return -(((size.l - l) + size.m) - m);
        }
    }

    public final int b()
    {
        return m;
    }

    public final Size c()
    {
        return new Size(m, l);
    }

    public int compareTo(Object obj)
    {
        return a((Size)obj);
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof Size)
        {
            obj = (Size)obj;
            flag = flag1;
            if (l == ((Size) (obj)).l)
            {
                flag = flag1;
                if (m == ((Size) (obj)).m)
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public int hashCode()
    {
        return 16 << l | m;
    }

    public String toString()
    {
        return String.format("%d x %d", new Object[] {
            Integer.valueOf(l), Integer.valueOf(m)
        });
    }

}
