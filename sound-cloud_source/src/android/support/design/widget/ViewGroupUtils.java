// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package android.support.design.widget:
//            ViewGroupUtilsHoneycomb

class ViewGroupUtils
{
    private static interface ViewGroupUtilsImpl
    {

        public abstract void offsetDescendantRect(ViewGroup viewgroup, View view, Rect rect);
    }

    private static class ViewGroupUtilsImplBase
        implements ViewGroupUtilsImpl
    {

        public void offsetDescendantRect(ViewGroup viewgroup, View view, Rect rect)
        {
            viewgroup.offsetDescendantRectToMyCoords(view, rect);
        }

        private ViewGroupUtilsImplBase()
        {
        }

    }

    private static class ViewGroupUtilsImplHoneycomb
        implements ViewGroupUtilsImpl
    {

        public void offsetDescendantRect(ViewGroup viewgroup, View view, Rect rect)
        {
            ViewGroupUtilsHoneycomb.offsetDescendantRect(viewgroup, view, rect);
        }

        private ViewGroupUtilsImplHoneycomb()
        {
        }

    }


    private static final ViewGroupUtilsImpl IMPL;

    ViewGroupUtils()
    {
    }

    static void getDescendantRect(ViewGroup viewgroup, View view, Rect rect)
    {
        rect.set(0, 0, view.getWidth(), view.getHeight());
        offsetDescendantRect(viewgroup, view, rect);
    }

    static void offsetDescendantRect(ViewGroup viewgroup, View view, Rect rect)
    {
        IMPL.offsetDescendantRect(viewgroup, view, rect);
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            IMPL = new ViewGroupUtilsImplHoneycomb();
        } else
        {
            IMPL = new ViewGroupUtilsImplBase();
        }
    }
}
