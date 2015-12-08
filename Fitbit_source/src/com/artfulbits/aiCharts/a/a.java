// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.artfulbits.aiCharts.a;

import android.graphics.Canvas;
import com.artfulbits.aiCharts.Base.e;

// Referenced classes of package com.artfulbits.aiCharts.a:
//            b

public abstract class a
{

    protected String a;
    protected int b;
    private b c;

    public a()
    {
    }

    public int a()
    {
        return b;
    }

    public void a(int i)
    {
        if (b != i)
        {
            b = i;
        }
    }

    public abstract void a(Canvas canvas, e e);

    public void a(b b1)
    {
        if (!b1.equals(c))
        {
            c = b1;
        }
    }

    public void a(String s)
    {
        if (a != null && !a.equals(s))
        {
            a = s;
        }
    }

    public b b()
    {
        return c;
    }

    public String c()
    {
        return a;
    }
}
