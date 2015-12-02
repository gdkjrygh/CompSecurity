// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ui.images.cache;


// Referenced classes of package com.facebook.ui.images.cache:
//            e, f

public class g
{

    private int a;
    private int b;
    private f c;

    g()
    {
        a = -1;
        b = -1;
        c = e.a;
    }

    public int a()
    {
        return a;
    }

    public g a(int i, int j)
    {
        a = i;
        b = j;
        return this;
    }

    public g a(f f)
    {
        c = f;
        return this;
    }

    public g a(boolean flag)
    {
        if (flag)
        {
            return a(-2, -2);
        } else
        {
            return a(-1, -1);
        }
    }

    public int b()
    {
        return b;
    }

    public f c()
    {
        return c;
    }

    public e d()
    {
        return new e(this);
    }
}
