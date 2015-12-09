// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.artfulbits.aiCharts.Base;

import android.graphics.Rect;
import com.artfulbits.aiCharts.Enums.CoordinateSystem;
import java.util.List;

// Referenced classes of package com.artfulbits.aiCharts.Base:
//            u, e, a

final class a
    implements u
{

    private e a;

    public final void a(List list, Rect rect)
    {
        boolean flag = false;
        Rect rect1 = new Rect(rect);
        int i1 = list.size();
        if (i1 == 0)
        {
            return;
        }
        int k = e.a(a);
        int j1 = (rect.height() - (i1 - 1) * k) / i1;
        for (int i = 0; i < i1; i++)
        {
            a a1 = (a)list.get(i);
            rect1.bottom = rect1.top + j1;
            if (a1.j())
            {
                a1.c(rect1);
            }
            rect1.top = rect1.top + (j1 + k);
        }

        if (e.b(a) && list.size() > 1)
        {
            Rect rect2 = new Rect(0, 0, rect.width(), rect.height());
            Rect rect3 = new Rect();
            int j = 0;
            int l;
            do
            {
                l = ((flag) ? 1 : 0);
                if (j >= i1)
                {
                    break;
                }
                a a2 = (a)list.get(j);
                a2.p();
                if (a2.j() && a2.i() == CoordinateSystem.a)
                {
                    rect3.set(a2.g());
                    rect3.offset(-a2.f().left, -a2.f().top);
                    rect2.left = Math.max(rect2.left, rect3.left);
                    rect2.right = Math.min(rect2.right, rect3.right);
                }
                j++;
            } while (true);
            for (; l < i1; l++)
            {
                a a3 = (a)list.get(l);
                if (a3.j() && a3.i() == CoordinateSystem.a)
                {
                    rect3.set(a3.g());
                    rect3.left = a3.f().left + rect2.left;
                    rect3.right = a3.f().left + rect2.right;
                    a3.d(rect3);
                }
            }

        }
        rect.setEmpty();
    }

    rdinateSystem(e e1)
    {
        a = e1;
        super();
    }
}
