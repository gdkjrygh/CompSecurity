// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobeta.android.dslv;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

public class h
    implements DragSortListView.i
{

    private Bitmap a;
    private ImageView b;
    private int c;
    private ListView d;

    public h(ListView listview)
    {
        c = 0xff000000;
        d = listview;
    }

    public View a(int i)
    {
        View view = d.getChildAt((d.getHeaderViewsCount() + i) - d.getFirstVisiblePosition());
        if (view == null)
        {
            return null;
        }
        view.setPressed(false);
        view.setDrawingCacheEnabled(true);
        a = Bitmap.createBitmap(view.getDrawingCache());
        view.setDrawingCacheEnabled(false);
        if (b == null)
        {
            b = new ImageView(d.getContext());
        }
        b.setBackgroundColor(c);
        b.setPadding(0, 0, 0, 0);
        b.setImageBitmap(a);
        b.setLayoutParams(new android.view.ViewGroup.LayoutParams(view.getWidth(), view.getHeight()));
        return b;
    }

    public void a(View view)
    {
        ((ImageView)view).setImageDrawable(null);
        a.recycle();
        a = null;
    }

    public void a(View view, Point point, Point point1)
    {
    }

    public void g(int i)
    {
        c = i;
    }
}
