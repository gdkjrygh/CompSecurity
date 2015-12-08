// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.library.filters;

import com.aviary.android.feather.headless.filters.NativeFilter;
import com.aviary.android.feather.headless.moa.b;
import com.aviary.android.feather.headless.moa.c;
import com.aviary.android.feather.headless.moa.d;

public class AdjustFilter extends NativeFilter
{

    AdjustFilter()
    {
        super(new String[0]);
    }

    private void b(int i, int j)
    {
        b b2 = b.a("setfeathereditsize");
        b b1 = b2;
        if (b2 == null)
        {
            b1 = c.a("setfeathereditsize");
            b.a(b1);
        }
        b1.a("width", i);
        b1.a("height", j);
    }

    public boolean a(double d1, double d2, double d3)
    {
        if (d1 != 0.0D)
        {
            b b2 = b.a("rotate");
            b b1 = b2;
            if (b2 == null)
            {
                b1 = c.a("rotate");
                b.a(b1);
            }
            b1.a("angle", d1);
            b1.a("width", d2);
            b1.a("height", d3);
            return true;
        } else
        {
            return false;
        }
    }

    public boolean a(boolean flag, boolean flag1)
    {
        if (flag || flag1)
        {
            b b2 = b.a("flip");
            b b1 = b2;
            if (b2 == null)
            {
                b1 = c.a("flip");
                b.a(b1);
            }
            b1.a("horizontal", flag);
            b1.a("vertical", flag1);
            return true;
        } else
        {
            return false;
        }
    }

    public boolean b(int i)
    {
        if (i % 90 == 0 && i != 0)
        {
            b b2 = b.a("rotate90");
            b b1 = b2;
            if (b2 == null)
            {
                b1 = c.a("rotate90");
                b.a(b1);
                b(1, 1);
            }
            b1.a("angle", i);
            return true;
        } else
        {
            return false;
        }
    }
}
