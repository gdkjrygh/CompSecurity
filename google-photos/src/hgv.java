// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public final class hgv extends aev
{

    private final int a;
    private final int b;
    private final int c;
    private final adf d;

    public hgv(int i, int j, adf adf1)
    {
        boolean flag;
        if (j > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag);
        a = i;
        c = j;
        d = adf1;
        b = Math.round((1.0F - 1.0F / (float)j) * (float)i);
    }

    public final void a(Rect rect, View view, RecyclerView recyclerview)
    {
        int i;
        int j;
label0:
        {
            i = recyclerview.c(view);
            rect.set(0, 0, 0, a);
            if (d.a(i) != c)
            {
                i = Math.round(((float)d.a(i, c) / (float)c) * (float)a);
                j = b - i;
                if (mk.h(recyclerview) != 1)
                {
                    break label0;
                }
                rect.right = i;
                rect.left = j;
            }
            return;
        }
        rect.left = i;
        rect.right = j;
    }
}
