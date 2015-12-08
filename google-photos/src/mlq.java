// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.PointF;
import android.view.animation.Interpolator;
import java.util.ArrayList;

public final class mlq
    implements Interpolator
{

    private float a[];
    private float b[];

    public mlq(float f, float f1, float f2, float f3)
    {
        mlr mlr1 = new mlr();
        mlr1.a.add(new mlu(0.0F, 0.0F, false));
        mlr1.a.add(new mlt(f, f1, f2, f3, 1.0F, 1.0F, false));
        a(mlr1);
    }

    private void a(mlr mlr1)
    {
        boolean flag = false;
        float f1 = 0.0F;
        int k = mlr1.a.size();
        ArrayList arraylist = new ArrayList(k + 1);
        ArrayList arraylist1 = new ArrayList(k + 1);
        PointF pointf = new PointF();
        for (int i = 0; i < k; i++)
        {
            ((mlv)mlr1.a.get(i)).a(arraylist, arraylist1, 4E-06F, pointf);
        }

        if (arraylist.isEmpty())
        {
            arraylist.add(new PointF(0.0F, 0.0F));
            arraylist1.add(Float.valueOf(0.0F));
        }
        float f = ((Float)arraylist1.get(arraylist1.size() - 1)).floatValue();
        if (f == 0.0F)
        {
            arraylist.add(arraylist.get(arraylist.size() - 1));
            arraylist1.add(Float.valueOf(1.0F));
            f = 1.0F;
        }
        int i1 = arraylist.size();
        mlr1 = new float[i1 * 3];
        int j = 0;
        for (k = 0; j < i1; k++)
        {
            PointF pointf1 = (PointF)arraylist.get(j);
            int j1 = k + 1;
            mlr1[k] = ((Float)arraylist1.get(j)).floatValue() / f;
            k = j1 + 1;
            mlr1[j1] = pointf1.x;
            mlr1[k] = pointf1.y;
            j++;
        }

        i1 = mlr1.length / 3;
        if (mlr1[1] != 0.0F || mlr1[2] != 0.0F || mlr1[mlr1.length - 2] != 1.0F || mlr1[mlr1.length - 1] != 1.0F)
        {
            throw new IllegalArgumentException("The Path must start at (0,0) and end at (1,1)");
        }
        a = new float[i1];
        b = new float[i1];
        j = 0;
        f = 0.0F;
        k = ((flag) ? 1 : 0);
        while (j < i1) 
        {
            int l = k + 1;
            float f3 = mlr1[k];
            int k1 = l + 1;
            float f2 = mlr1[l];
            k = k1 + 1;
            float f4 = mlr1[k1];
            if (f3 == f && f2 != f1)
            {
                throw new IllegalArgumentException("The Path cannot have discontinuity in the X axis.");
            }
            if (f2 < f1)
            {
                throw new IllegalArgumentException("The Path cannot loop back on itself.");
            }
            a[j] = f2;
            b[j] = f4;
            j++;
            f = f3;
            f1 = f2;
        }
    }

    public final float getInterpolation(float f)
    {
        if (f <= 0.0F)
        {
            return 0.0F;
        }
        if (f >= 1.0F)
        {
            return 1.0F;
        }
        int j = a.length - 1;
        int i;
        for (i = 0; j - i > 1;)
        {
            int k = (i + j) / 2;
            if (f < a[k])
            {
                j = k;
            } else
            {
                i = k;
            }
        }

        float f1 = a[j] - a[i];
        if (f1 == 0.0F)
        {
            return b[i];
        } else
        {
            f = (f - a[i]) / f1;
            f1 = b[i];
            return f * (b[j] - f1) + f1;
        }
    }
}
