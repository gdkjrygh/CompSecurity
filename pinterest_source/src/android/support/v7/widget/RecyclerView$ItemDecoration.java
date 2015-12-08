// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;

// Referenced classes of package android.support.v7.widget:
//            RecyclerView

public abstract class 
{

    public void getItemOffsets(Rect rect, int i, RecyclerView recyclerview)
    {
        rect.set(0, 0, 0, 0);
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerview,  )
    {
        getItemOffsets(rect, ((getItemOffsets)view.getLayoutParams()).tViewLayoutPosition(), recyclerview);
    }

    public void onDraw(Canvas canvas, RecyclerView recyclerview)
    {
    }

    public void onDraw(Canvas canvas, RecyclerView recyclerview, tViewLayoutPosition tviewlayoutposition)
    {
        onDraw(canvas, recyclerview);
    }

    public void onDrawOver(Canvas canvas, RecyclerView recyclerview)
    {
    }

    public void onDrawOver(Canvas canvas, RecyclerView recyclerview, onDraw ondraw)
    {
        onDrawOver(canvas, recyclerview);
    }

    public ()
    {
    }
}
