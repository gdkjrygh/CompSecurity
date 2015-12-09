// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.b;

import android.graphics.Matrix;
import com.cardinalblue.android.piccollage.view.PhotoProtoView;
import com.cardinalblue.android.piccollage.view.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.cardinalblue.android.piccollage.view.b:
//            e

public class com.cardinalblue.android.piccollage.view.b.a extends e
{
    private static class a
    {

        public k a;
        public float b;
        public float c;

        public a(k k1, float f, float f1)
        {
            a = k1;
            b = f;
            c = f1;
        }
    }


    private ArrayList a;

    public com.cardinalblue.android.piccollage.view.b.a(k k1, PhotoProtoView photoprotoview, List list)
    {
        super(k1, photoprotoview, 500L);
        a = new ArrayList();
        photoprotoview = list.iterator();
        do
        {
            if (!photoprotoview.hasNext())
            {
                break;
            }
            list = (k)photoprotoview.next();
            float f2 = com.cardinalblue.android.b.k.a(k1, list) - 10F;
            if (list != k1 && f2 < 0.0F && (list.t() == k1.t() || list.t() == -1))
            {
                float f1 = (float)Math.atan2(k1.L() - list.L(), k1.K() - list.K()) - list.Q();
                float f = f1;
                if (Float.isNaN(f1))
                {
                    f = (float)(Math.random() * 3.1415926535897931D * 2D);
                }
                f1 = ((float)Math.cos(f) * f2) / list.P();
                f = ((float)Math.sin(f) * f2) / list.P();
                a.add(new a(list, f1, f));
            }
        } while (true);
    }

    private void c(float f)
    {
        f = a(1.0F, 0.7F, f);
        Matrix matrix = new Matrix();
        matrix.setScale(f, f);
        this.f.a(matrix, null);
    }

    private void d(float f)
    {
        a a1;
        Matrix matrix;
        for (Iterator iterator = a.iterator(); iterator.hasNext(); a1.a.a(matrix, null))
        {
            a1 = (a)iterator.next();
            float f1 = a(0.0F, a1.b, f);
            float f2 = a(0.0F, a1.c, f);
            matrix = new Matrix();
            matrix.setTranslate(f1, f2);
        }

    }

    public void a()
    {
        super.a();
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((a)iterator.next()).a.H()) { }
    }

    public void a(float f)
    {
        if (f <= 0.5F)
        {
            f /= 0.5F;
        } else
        {
            f = (1.0F - f) / 0.5F;
        }
        f = b(f);
        c(f);
        d(f);
    }
}
