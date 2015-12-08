// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget.helper;

import android.graphics.Canvas;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.RecyclerView;
import android.view.View;

// Referenced classes of package android.support.v7.widget.helper:
//            ItemTouchUIUtilImpl

static class  extends 
{

    private float findMaxElevation(RecyclerView recyclerview, View view)
    {
        int j = recyclerview.getChildCount();
        int i = 0;
        float f = 0.0F;
        while (i < j) 
        {
            View view1 = recyclerview.getChildAt(i);
            float f1;
            if (view1 == view)
            {
                f1 = f;
            } else
            {
                float f2 = ViewCompat.getElevation(view1);
                f1 = f;
                if (f2 > f)
                {
                    f1 = f2;
                }
            }
            i++;
            f = f1;
        }
        return f;
    }

    public void clearView(View view)
    {
        Object obj = view.getTag(android.support.v7.recyclerview.us_elevation);
        if (obj != null && (obj instanceof Float))
        {
            ViewCompat.setElevation(view, ((Float)obj).floatValue());
        }
        view.setTag(android.support.v7.recyclerview.us_elevation, null);
        super.clearView(view);
    }

    public void onDraw(Canvas canvas, RecyclerView recyclerview, View view, float f, float f1, int i, boolean flag)
    {
        if (flag && view.getTag(android.support.v7.recyclerview.us_elevation) == null)
        {
            float f2 = ViewCompat.getElevation(view);
            ViewCompat.setElevation(view, 1.0F + findMaxElevation(recyclerview, view));
            view.setTag(android.support.v7.recyclerview.us_elevation, Float.valueOf(f2));
        }
        super.onDraw(canvas, recyclerview, view, f, f1, i, flag);
    }

    ()
    {
    }
}
