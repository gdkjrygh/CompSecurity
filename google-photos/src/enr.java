// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import org.lucasr.twowayview.TwoWayLayoutManager;

public class enr
{

    final RecyclerView a;
    final int b;
    final int c;
    final int d[] = new int[2];
    final int e;
    final int f;
    final int g;
    int h;

    public enr(RecyclerView recyclerview)
    {
        a = recyclerview;
        e = mk.h(recyclerview);
        b = Math.round(recyclerview.getResources().getDimension(b.lZ));
        c = b / 2;
        f = Math.round(recyclerview.getResources().getDimension(b.lY));
        g = Math.round(recyclerview.getResources().getDimension(b.md) / 2.0F);
    }

    static float a(float f1, float f2, View view, boolean flag)
    {
        float f3;
        float f4;
        float f5;
        if (flag)
        {
            f3 = view.getLeft();
        } else
        {
            f3 = view.getRight();
        }
        f4 = view.getTop();
        f5 = (float)view.getHeight() / 2.0F;
        return Math.abs(f1 - f3) + Math.abs(f2 - (f4 + f5));
    }

    static boolean a(int i)
    {
        return i == 0;
    }

    public int a(int i, float f1, float f2, Rect rect)
    {
        b(i, f1, f2, rect);
        return h;
    }

    void b(int i, float f1, float f2, Rect rect)
    {
        int j = ((TwoWayLayoutManager)a.e).getFirstVisiblePosition();
        int k = ((TwoWayLayoutManager)a.e).getLastVisiblePosition();
        h = 0x80000000;
        boolean flag = a(e);
        View view = null;
        float f3 = 3.402823E+38F;
        while (j <= k) 
        {
            View view1 = a.a(j, false).a;
            float f4 = a(f1, f2, view1, a(e));
            if (f4 < f3)
            {
                flag = a(e);
                h = j;
                f3 = f4;
                view = view1;
            }
            if (j + 1 <= k && a.a(j + 1, false).a.getTop() <= view1.getBottom())
            {
                continue;
            }
            boolean flag1;
            if (!a(e))
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            f4 = a(f1, f2, view1, flag1);
            if (f4 < f3)
            {
                if (!a(e))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                h = j + 1;
                f3 = f4;
                view = view1;
            }
            j++;
        }
        if (view == null)
        {
            h = 0x80000000;
            rect.setEmpty();
            return;
        }
        if (b(i))
        {
            h = 0x80000001;
            return;
        }
        view.getLocationOnScreen(d);
        if (flag && h == i || !flag && h == i + 1)
        {
            int ai[] = d;
            ai[0] = (int)((float)ai[0] - view.getTranslationX());
            ai = d;
            ai[1] = (int)((float)ai[1] - view.getTranslationY());
        }
        fqw fqw1 = (fqw)view;
        f3 = fqw1.b().x;
        f1 = fqw1.a().left;
        f2 = fqw1.a().right;
        f3 += d[0];
        i = c + f;
        int l;
        int i1;
        if (flag)
        {
            i = Math.round(f3 + f1) - g - i;
        } else
        {
            i = (Math.round(f2 + f3) + g) - i;
        }
        j = b;
        k = f;
        l = d[1];
        i1 = d[1];
        rect.set(i, l, j + i + k * 2, view.getHeight() + i1);
    }

    boolean b(int i)
    {
        return h == i || h == i + 1;
    }
}
