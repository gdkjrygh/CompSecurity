// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.controller;

import android.graphics.PointF;
import android.graphics.RectF;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.a.f;
import com.cardinalblue.android.piccollage.model.Collage;
import com.cardinalblue.android.piccollage.model.g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class m
{

    public m()
    {
    }

    private static com.cardinalblue.android.piccollage.model.f.h a(int i)
    {
        if (i < 4)
        {
            switch (i)
            {
            default:
                return com.cardinalblue.android.piccollage.model.f.h.a;

            case 3: // '\003'
                return com.cardinalblue.android.piccollage.model.f.h.f;

            case 2: // '\002'
                return com.cardinalblue.android.piccollage.model.f.h.b;
            }
        }
        if (Math.max(2, (int)Math.floor(Math.sqrt(i))) >= 3)
        {
            return com.cardinalblue.android.piccollage.model.f.h.p;
        } else
        {
            return com.cardinalblue.android.piccollage.model.f.h.i;
        }
    }

    public static List a(int i, int j, int l, boolean flag, PointF pointf)
    {
        int i1;
label0:
        {
            if (l < 0)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("scrapNum should not be negative : ").append(l).toString());
            }
            if (i > 0)
            {
                i1 = i;
                i = j;
                if (j > 0)
                {
                    break label0;
                }
            }
            i = Collage.n();
            f.a(new IllegalArgumentException((new StringBuilder()).append("width = ").append(i).append(" , height = ").append(i).toString()));
            i1 = i;
        }
        ArrayList arraylist = new ArrayList(l);
        com.cardinalblue.android.piccollage.model.f f3 = com.cardinalblue.android.piccollage.model.f.a(a(l));
        ArrayList arraylist1 = new ArrayList();
        f3.a(l, arraylist1);
        j = 0;
        while (j < l) 
        {
            if (flag)
            {
                if (arraylist1.size() > j)
                {
                    RectF rectf = ((g)arraylist1.get(j)).a(i1, i, true);
                    arraylist.add(new PointF(rectf.centerX(), rectf.centerY()));
                } else
                {
                    arraylist.add(new PointF(i1 / 2, i / 2));
                }
            } else
            if (pointf != null && pointf.x > 0.0F && pointf.y > 0.0F)
            {
                arraylist.add(pointf);
            } else
            {
                float f1 = i1 / 4;
                float f2 = i / 4;
                arraylist.add(new PointF(k.a(f1, (float)i1 - f1), k.a(f2, (float)i - f2)));
            }
            j++;
        }
        Collections.sort(arraylist, new Comparator() {

            public int a(PointF pointf1, PointF pointf2)
            {
                return (int)(pointf1.y - pointf2.y);
            }

            public int compare(Object obj, Object obj1)
            {
                return a((PointF)obj, (PointF)obj1);
            }

        });
        return arraylist;
    }
}
