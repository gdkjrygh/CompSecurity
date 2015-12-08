// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget.helper;

import android.graphics.Canvas;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public interface ItemTouchUIUtil
{

    public abstract void clearView(View view);

    public abstract void onDraw(Canvas canvas, RecyclerView recyclerview, View view, float f, float f1, int i, boolean flag);

    public abstract void onDrawOver(Canvas canvas, RecyclerView recyclerview, View view, float f, float f1, int i, boolean flag);

    public abstract void onSelected(View view);
}
