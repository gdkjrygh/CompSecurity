// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.util;

import android.graphics.Rect;
import android.view.View;
import java.util.Comparator;

// Referenced classes of package com.netflix.mediaclient.util:
//            ViewUtils

public static class mView
    implements Comparable
{

    public static final Comparator REVERSE_SORT_BY_TOP = new Comparator() {

        public int compare(ViewUtils.ViewComparator viewcomparator, ViewUtils.ViewComparator viewcomparator1)
        {
            viewcomparator = ViewUtils.getRect(viewcomparator.getView(), true);
            viewcomparator1 = ViewUtils.getRect(viewcomparator1.getView(), true);
            if (((Rect) (viewcomparator)).top < ((Rect) (viewcomparator1)).top)
            {
                return 1;
            }
            return ((Rect) (viewcomparator)).top <= ((Rect) (viewcomparator1)).top ? 0 : -1;
        }

        public volatile int compare(Object obj, Object obj1)
        {
            return compare((ViewUtils.ViewComparator)obj, (ViewUtils.ViewComparator)obj1);
        }

    };
    public static final Comparator SORT_BY_BOTTOM = new Comparator() {

        public int compare(ViewUtils.ViewComparator viewcomparator, ViewUtils.ViewComparator viewcomparator1)
        {
            byte byte0 = 1;
            viewcomparator = ViewUtils.getRect(viewcomparator.getView(), true);
            viewcomparator1 = ViewUtils.getRect(viewcomparator1.getView(), true);
            if (((Rect) (viewcomparator)).bottom < ((Rect) (viewcomparator1)).bottom)
            {
                byte0 = -1;
            } else
            if (((Rect) (viewcomparator)).bottom <= ((Rect) (viewcomparator1)).bottom)
            {
                return 0;
            }
            return byte0;
        }

        public volatile int compare(Object obj, Object obj1)
        {
            return compare((ViewUtils.ViewComparator)obj, (ViewUtils.ViewComparator)obj1);
        }

    };
    public static final Comparator SORT_BY_TOP = new Comparator() {

        public int compare(ViewUtils.ViewComparator viewcomparator, ViewUtils.ViewComparator viewcomparator1)
        {
            byte byte0 = 1;
            viewcomparator = ViewUtils.getRect(viewcomparator.getView(), true);
            viewcomparator1 = ViewUtils.getRect(viewcomparator1.getView(), true);
            if (((Rect) (viewcomparator)).top < ((Rect) (viewcomparator1)).top)
            {
                byte0 = -1;
            } else
            if (((Rect) (viewcomparator)).top <= ((Rect) (viewcomparator1)).top)
            {
                return 0;
            }
            return byte0;
        }

        public volatile int compare(Object obj, Object obj1)
        {
            return compare((ViewUtils.ViewComparator)obj, (ViewUtils.ViewComparator)obj1);
        }

    };
    private final View mView;

    public int compareTo(mView mview)
    {
        byte byte0 = 1;
        Rect rect = ViewUtils.getRect(mView, true);
        mview = ViewUtils.getRect(mview.getView(), true);
        if (rect.bottom < ((Rect) (mview)).bottom)
        {
            byte0 = -1;
        } else
        if (rect.bottom <= ((Rect) (mview)).bottom)
        {
            return 0;
        }
        return byte0;
    }

    public volatile int compareTo(Object obj)
    {
        return compareTo((compareTo)obj);
    }

    public View getView()
    {
        return mView;
    }


    public _cls3(View view)
    {
        if (view == null)
        {
            throw new IllegalArgumentException("View can not be null");
        } else
        {
            mView = view;
            return;
        }
    }
}
