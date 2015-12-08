// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

final class edu extends aev
{

    private final int a;
    private final int b;
    private edp c;

    edu(edp edp1)
    {
        c = edp1;
        super();
        a = c.g().getDimensionPixelOffset(b.kR);
        b = c.g().getDimensionPixelOffset(b.kQ);
    }

    public final void a(Rect rect, View view, RecyclerView recyclerview)
    {
        int i = Math.max(0, (recyclerview.getWidth() - a * 2 - b) / 2);
        rect.set(i, 0, i, a);
    }
}
