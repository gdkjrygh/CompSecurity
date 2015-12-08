// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Canvas;
import android.support.v7.widget.RecyclerView;
import android.view.View;

final class agq
    implements agp
{

    agq()
    {
    }

    private static void a(Canvas canvas, RecyclerView recyclerview, View view, float f, float f1)
    {
        canvas.save();
        canvas.translate(f, f1);
        recyclerview.drawChild(canvas, view, 0L);
        canvas.restore();
    }

    public final void a(Canvas canvas, RecyclerView recyclerview, View view, float f, float f1, int i)
    {
        if (i == 2)
        {
            a(canvas, recyclerview, view, f, f1);
        }
    }

    public final void a(Canvas canvas, RecyclerView recyclerview, View view, float f, float f1, int i, boolean flag)
    {
        if (i != 2)
        {
            a(canvas, recyclerview, view, f, f1);
        }
    }

    public final void a(View view)
    {
        view.setVisibility(0);
    }

    public final void b(View view)
    {
        view.setVisibility(4);
    }
}
