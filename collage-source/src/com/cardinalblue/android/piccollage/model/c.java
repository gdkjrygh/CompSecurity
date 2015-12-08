// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.model;

import android.graphics.Path;
import android.graphics.PointF;
import com.cardinalblue.android.b.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class c extends Path
{

    private ArrayList a;
    private float b;

    public c(float f1)
    {
        a = new ArrayList();
        b = 1.0F;
        b = f1;
    }

    private PointF a(int i)
    {
        if (isEmpty())
        {
            return null;
        } else
        {
            PointF pointf = (PointF)a.get(i);
            return new PointF(pointf.x, pointf.y);
        }
    }

    private void g()
    {
        super.reset();
        if (!isEmpty())
        {
            PointF pointf = (PointF)a.get(0);
            float f1 = pointf.x;
            float f2 = b * f1;
            f1 = pointf.y;
            f1 = b * f1;
            super.moveTo(f2, f1);
            int i = 1;
            while (i < c()) 
            {
                PointF pointf1 = (PointF)a.get(i);
                float f3 = pointf1.x;
                f3 = b * f3;
                float f4 = pointf1.y;
                f4 = b * f4;
                quadTo(f2, f1, (f3 + f2) / 2.0F, (f4 + f1) / 2.0F);
                i++;
                f1 = f4;
                f2 = f3;
            }
        }
    }

    public void a()
    {
        if (isEmpty())
        {
            return;
        } else
        {
            PointF pointf = (PointF)a.get(c() - 1);
            lineTo(pointf.x * b, pointf.y * b);
            return;
        }
    }

    public void a(float f1)
    {
        b = f1;
        g();
    }

    public void a(float f1, float f2, boolean flag)
    {
        if (isEmpty())
        {
            moveTo(f1, f2);
        } else
        {
            float f3 = ((PointF)a.get(c() - 1)).x;
            f3 = b * f3;
            float f4 = ((PointF)a.get(c() - 1)).y * b;
            float f5 = b * f1;
            float f6 = b * f2;
            if (!flag || k.a(f3, f4, f5, f6, 10F))
            {
                quadTo(f3, f4, (f5 + f3) / 2.0F, (f6 + f4) / 2.0F);
                a.add(new PointF(f1, f2));
                return;
            }
        }
    }

    public void a(List list)
    {
        if (list == null || list.isEmpty())
        {
            return;
        } else
        {
            a.clear();
            a.addAll(list);
            g();
            return;
        }
    }

    public boolean a(float f1, float f2)
    {
        for (int i = c() - 1; i >= 0; i--)
        {
            PointF pointf = (PointF)a.get(i);
            if (Math.sqrt(Math.pow(f1 - pointf.x, 2D) + Math.pow(f2 - pointf.y, 2D)) * (double)b < 20D)
            {
                Iterator iterator = a.iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    if (a.indexOf(iterator.next()) >= i)
                    {
                        iterator.remove();
                    }
                } while (true);
                g();
                return true;
            }
        }

        return false;
    }

    public ArrayList b()
    {
        ArrayList arraylist = new ArrayList();
        PointF pointf;
        for (Iterator iterator = a.iterator(); iterator.hasNext(); arraylist.add(new PointF(pointf.x, pointf.y)))
        {
            pointf = (PointF)iterator.next();
        }

        return arraylist;
    }

    public int c()
    {
        return a.size();
    }

    public PointF d()
    {
        return a(0);
    }

    public PointF e()
    {
        return a(c() - 1);
    }

    public float f()
    {
        if (c() < 2)
        {
            return 0.0F;
        } else
        {
            PointF pointf = (PointF)a.get(c() - 2);
            PointF pointf1 = (PointF)a.get(c() - 1);
            double d1 = pointf1.x - pointf.x;
            float f1 = -pointf1.y;
            return (float)Math.toDegrees(Math.atan2(d1, pointf.y + f1));
        }
    }

    public boolean isEmpty()
    {
        return a.isEmpty();
    }

    public void moveTo(float f1, float f2)
    {
        reset();
        super.moveTo(b * f1, b * f2);
        a.add(new PointF(f1, f2));
    }

    public void reset()
    {
        super.reset();
        a.clear();
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        PointF pointf;
        for (Iterator iterator = a.iterator(); iterator.hasNext(); stringbuilder.append(String.format("(%f, %f),", new Object[] {
    Float.valueOf(pointf.x), Float.valueOf(pointf.y)
})))
        {
            pointf = (PointF)iterator.next();
        }

        if (stringbuilder.length() > 0)
        {
            stringbuilder.delete(stringbuilder.length() - 1, stringbuilder.length());
        }
        return stringbuilder.toString();
    }
}
