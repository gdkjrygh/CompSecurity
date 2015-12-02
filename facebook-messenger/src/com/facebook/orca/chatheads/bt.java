// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.chatheads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import com.facebook.g;
import com.google.common.a.hq;
import com.google.common.d.a.i;
import com.google.common.d.a.s;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.facebook.orca.chatheads:
//            br, al, ef, ag

class bt
    implements br
{

    final al a;
    private final Resources b;
    private int c;
    private int d;

    public bt(al al1)
    {
        a = al1;
        super();
        b = al.c(al1).getResources();
        a();
    }

    public int a(float f, float f1)
    {
        if (c > 0)
        {
            return ((b.getDisplayMetrics().widthPixels - al.h(a) - (int)f) + c / 2) / c;
        } else
        {
            return (((int)f1 - com.facebook.orca.chatheads.al.i(a).top) + d / 2) / d;
        }
    }

    public PointF a(int j)
    {
        int k = b.getDisplayMetrics().widthPixels;
        int l = al.h(a);
        int i1 = c;
        int j1 = com.facebook.orca.chatheads.al.i(a).top;
        int k1 = d;
        return new PointF(k - l - i1 * j, j1 + k1 * j);
    }

    public s a(List list)
    {
        java.util.ArrayList arraylist = hq.a();
        int k = b.getDisplayMetrics().widthPixels;
        int l = al.h(a);
        int j = com.facebook.orca.chatheads.al.i(a).top;
        list = list.iterator();
        k -= l;
        while (list.hasNext()) 
        {
            ef ef1 = (ef)list.next();
            if (!al.j(a) || al.k(a) == null || al.k(a).getSpringyPositioner() != ef1)
            {
                arraylist.add(ef1.a(new PointF(k, j)));
            }
            k -= c;
            j = d + j;
        }
        return i.a(arraylist);
    }

    public void a()
    {
        Rect rect = al.f(a);
        Point point = new Point(b.getDimensionPixelOffset(g.chat_head_line_item_min_x_offset), b.getDimensionPixelOffset(g.chat_head_line_item_min_y_offset));
        Point point1 = new Point(b.getDimensionPixelOffset(g.chat_head_width), b.getDimensionPixelOffset(g.chat_head_height));
        c = ((int)Math.signum(point.x) * (rect.width() - point1.x)) / (com.facebook.orca.chatheads.al.g(a) - 1);
        int j = (int)Math.signum(point.y);
        d = ((rect.height() - point1.y) * j) / (com.facebook.orca.chatheads.al.g(a) - 1);
    }

    public PointF b(int j)
    {
        int k = b.getDimensionPixelOffset(g.chat_head_width) / 2;
        PointF pointf = a(j);
        pointf.x = pointf.x + (float)k;
        float f = pointf.y;
        pointf.y = (float)k + f;
        return pointf;
    }
}
