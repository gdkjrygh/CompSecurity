// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobeta.android.dslv;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

// Referenced classes of package com.mobeta.android.dslv:
//            o

public class w
    implements o
{

    private Bitmap a;
    private ImageView b;
    private int c;
    private ListView d;

    public w(ListView listview)
    {
        c = 0xff000000;
        d = listview;
    }

    public final View a(int i)
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

    public void a(Point point)
    {
    }

    public final void a(View view)
    {
        ((ImageView)view).setImageDrawable(null);
        a.recycle();
        a = null;
    }

    public final void b(int i)
    {
        c = i;
    }
}
