// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

class ViewGroupUtilsHoneycomb
{

    private static final Matrix IDENTITY = new Matrix();
    private static final ThreadLocal sMatrix = new ThreadLocal();
    private static final ThreadLocal sRectF = new ThreadLocal();

    ViewGroupUtilsHoneycomb()
    {
    }

    static void offsetDescendantMatrix(ViewParent viewparent, View view, Matrix matrix)
    {
        Object obj = view.getParent();
        if ((obj instanceof View) && obj != viewparent)
        {
            obj = (View)obj;
            offsetDescendantMatrix(viewparent, ((View) (obj)), matrix);
            matrix.preTranslate(-((View) (obj)).getScrollX(), -((View) (obj)).getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        if (!view.getMatrix().isIdentity())
        {
            matrix.preConcat(view.getMatrix());
        }
    }

    public static void offsetDescendantRect(ViewGroup viewgroup, View view, Rect rect)
    {
        Matrix matrix = (Matrix)sMatrix.get();
        if (matrix == null)
        {
            matrix = new Matrix();
            sMatrix.set(matrix);
        } else
        {
            matrix.set(IDENTITY);
        }
        offsetDescendantMatrix(viewgroup, view, matrix);
        view = (RectF)sRectF.get();
        viewgroup = view;
        if (view == null)
        {
            viewgroup = new RectF();
        }
        viewgroup.set(rect);
        matrix.mapRect(viewgroup);
        rect.set((int)(((RectF) (viewgroup)).left + 0.5F), (int)(((RectF) (viewgroup)).top + 0.5F), (int)(((RectF) (viewgroup)).right + 0.5F), (int)(((RectF) (viewgroup)).bottom + 0.5F));
    }

}
