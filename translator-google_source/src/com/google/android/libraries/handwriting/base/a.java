// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.handwriting.base;

import java.util.Iterator;

// Referenced classes of package com.google.android.libraries.handwriting.base:
//            Stroke, StrokeList

public final class a
{

    public final float a[];

    public a()
    {
        a = new float[4];
    }

    public a(Stroke stroke)
    {
        a = (new float[] {
            3.402823E+38F, 3.402823E+38F, -3.402823E+38F, -3.402823E+38F
        });
        for (stroke = stroke.iterator(); stroke.hasNext(); a((Stroke.Point)stroke.next())) { }
    }

    public a(StrokeList strokelist)
    {
        a = (new float[] {
            3.402823E+38F, 3.402823E+38F, -3.402823E+38F, -3.402823E+38F
        });
        for (strokelist = strokelist.iterator(); strokelist.hasNext();)
        {
            Iterator iterator = ((Stroke)strokelist.next()).iterator();
            while (iterator.hasNext()) 
            {
                a((Stroke.Point)iterator.next());
            }
        }

    }

    public a(float af[])
    {
        a = (float[])af.clone();
    }

    private void a(Stroke.Point point)
    {
        if (point.b < a[0])
        {
            a[0] = point.b;
        }
        if (point.a < a[1])
        {
            a[1] = point.a;
        }
        if (point.b > a[2])
        {
            a[2] = point.b;
        }
        if (point.a > a[3])
        {
            a[3] = point.a;
        }
    }

    public final float a()
    {
        float f1 = a[2] - a[0];
        float f = f1;
        if (f1 < 1.175494E-38F)
        {
            f = 1.0F;
        }
        return f;
    }

    public final boolean a(a a1)
    {
        return a[0] <= a1.a[2] && a[2] >= a1.a[0] && a[1] <= a1.a[3] && a[3] >= a1.a[1];
    }

    public final float b()
    {
        float f1 = a[3] - a[1];
        float f = f1;
        if (f1 < 1.175494E-38F)
        {
            f = 1.0F;
        }
        return f;
    }

    public final float c()
    {
        return b() * a();
    }

    public final String toString()
    {
        float f = a[0];
        float f1 = a[1];
        float f2 = a[2];
        float f3 = a[3];
        return (new StringBuilder(65)).append("[").append(f).append(",").append(f1).append(",").append(f2).append(",").append(f3).append("]").toString();
    }
}
