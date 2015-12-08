// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget.helper;

import android.graphics.Canvas;
import android.support.v7.widget.RecyclerView;
import android.view.View;

// Referenced classes of package android.support.v7.widget.helper:
//            ItemTouchUIUtil, ItemTouchUIUtilImpl

static class 
    implements ItemTouchUIUtil
{

    private void draw(Canvas canvas, RecyclerView recyclerview, View view, float f, float f1)
    {
        canvas.save();
        canvas.translate(f, f1);
        recyclerview.drawChild(canvas, view, 0L);
        canvas.restore();
    }

    public void clearView(View view)
    {
        view.setVisibility(0);
    }

    public void onDraw(Canvas canvas, RecyclerView recyclerview, View view, float f, float f1, int i, boolean flag)
    {
        if (i != 2)
        {
            draw(canvas, recyclerview, view, f, f1);
        }
    }

    public void onDrawOver(Canvas canvas, RecyclerView recyclerview, View view, float f, float f1, int i, boolean flag)
    {
        if (i == 2)
        {
            draw(canvas, recyclerview, view, f, f1);
        }
    }

    public void onSelected(View view)
    {
        view.setVisibility(4);
    }

    ()
    {
    }
}
