// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.g.b;

import com.google.b.s;

public final class d extends s
{

    private final float a;
    private final int b;

    d(float f, float f1, float f2)
    {
        this(f, f1, f2, 1);
    }

    private d(float f, float f1, float f2, int i)
    {
        super(f, f1);
        a = f2;
        b = i;
    }

    boolean a(float f, float f1, float f2)
    {
        boolean flag;
label0:
        {
            boolean flag1 = false;
            flag = flag1;
            if (Math.abs(f1 - b()) > f)
            {
                break label0;
            }
            flag = flag1;
            if (Math.abs(f2 - a()) > f)
            {
                break label0;
            }
            f = Math.abs(f - a);
            if (f > 1.0F)
            {
                flag = flag1;
                if (f > a)
                {
                    break label0;
                }
            }
            flag = true;
        }
        return flag;
    }

    d b(float f, float f1, float f2)
    {
        int i = b + 1;
        return new d(((float)b * a() + f1) / (float)i, ((float)b * b() + f) / (float)i, ((float)b * a + f2) / (float)i, i);
    }

    public float c()
    {
        return a;
    }

    int d()
    {
        return b;
    }
}
