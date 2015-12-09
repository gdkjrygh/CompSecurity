// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget.helper;

import android.graphics.Canvas;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.RecyclerView;
import android.view.View;

// Referenced classes of package android.support.v7.widget.helper:
//            ItemTouchUIUtil, ItemTouchUIUtilImpl

static class 
    implements ItemTouchUIUtil
{

    public void clearView(View view)
    {
        ViewCompat.setTranslationX(view, 0.0F);
        ViewCompat.setTranslationY(view, 0.0F);
    }

    public void onDraw(Canvas canvas, RecyclerView recyclerview, View view, float f, float f1, int i, boolean flag)
    {
        ViewCompat.setTranslationX(view, f);
        ViewCompat.setTranslationY(view, f1);
    }

    public void onDrawOver(Canvas canvas, RecyclerView recyclerview, View view, float f, float f1, int i, boolean flag)
    {
    }

    public void onSelected(View view)
    {
    }

    ()
    {
    }
}
