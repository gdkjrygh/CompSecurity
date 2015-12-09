// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;

public class cf
    implements Runnable
{

    private HorizontalScrollView a;
    private Object b;
    private int c;

    public cf(HorizontalScrollView horizontalscrollview, Object obj, int i)
    {
        a = horizontalscrollview;
        b = obj;
        c = i;
    }

    public void run()
    {
        if (a.getChildCount() > 0)
        {
            ImageView imageview = (ImageView)a.getChildAt(0).findViewWithTag(b);
            if (imageview != null)
            {
                int i = imageview.getTop();
                int j = imageview.getLeft();
                int k = c / 2;
                int l = imageview.getWidth() / 2;
                a.scrollTo(l + (j - k), i);
            }
        }
    }
}
