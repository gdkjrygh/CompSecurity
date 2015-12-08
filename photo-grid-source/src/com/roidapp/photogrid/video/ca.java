// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.video;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bumptech.glide.g;
import com.bumptech.glide.h;
import com.bumptech.glide.load.b.e;
import com.bumptech.glide.p;
import com.bumptech.glide.r;
import com.bumptech.glide.s;
import com.roidapp.baselib.b.a;
import com.roidapp.photogrid.release.ig;
import com.roidapp.photogrid.release.ih;

// Referenced classes of package com.roidapp.photogrid.video:
//            bp, cb, cc, bm

final class ca extends BaseAdapter
{

    final bp a;
    private Context b;
    private ig c[];
    private int d;

    ca(bp bp1, Context context, ig aig[])
    {
        a = bp1;
        super();
        b = context;
        c = aig;
        d = 0x80000000;
    }

    protected final void a()
    {
        d = 0x80000000;
    }

    protected final void a(int i)
    {
        if (c == null || i < 0 || i >= c.length)
        {
            return;
        }
        System.arraycopy(com.roidapp.photogrid.video.bp.e(a), i, com.roidapp.photogrid.video.bp.e(a), i, c.length - i - 1);
        com.roidapp.photogrid.video.bp.e(a)[c.length - 1] = null;
        Object aobj[] = new String[c.length - 1];
        System.arraycopy(com.roidapp.photogrid.video.bp.e(a), 0, ((Object) (aobj)), 0, c.length - 1);
        com.roidapp.photogrid.video.bp.a(a, ((String []) (aobj)));
        int j = c.length;
        aobj = c;
        ig aig[] = c;
        j--;
        System.arraycopy(((Object) (aobj)), i + 1, aig, i, j - i);
        c[j] = null;
        aobj = new ig[j];
        System.arraycopy(c, 0, ((Object) (aobj)), 0, j);
        c = com.roidapp.photogrid.video.bp.a(a, ((ig []) (aobj)));
        ih.C().a(bp.c(a));
        if (bp.c(a).length < 50)
        {
            bp.d(a).setTextColor(a.getResources().getColor(0x7f0c00bf));
            Drawable drawable = a.getResources().getDrawable(0x7f020359);
            drawable.setAlpha(255);
            bp.d(a).setCompoundDrawablesWithIntrinsicBounds(null, drawable, null, null);
        }
        notifyDataSetChanged();
    }

    protected final void a(int i, int j)
    {
        ig ig1;
        if (c == null || i < 0 || j < 0 || i >= c.length || j >= c.length)
        {
            return;
        }
        ig1 = c[i];
        if (i >= j) goto _L2; else goto _L1
_L1:
        System.arraycopy(c, i + 1, c, i, j - i);
_L4:
        c[j] = ig1;
        d = j;
        notifyDataSetChanged();
        return;
_L2:
        if (i > j)
        {
            System.arraycopy(c, j, c, j + 1, i - j);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected final void a(ig ig1)
    {
        ig aig[] = new ig[c.length + 1];
        System.arraycopy(c, 0, aig, 0, c.length);
        aig[aig.length - 1] = ig1;
        c = com.roidapp.photogrid.video.bp.a(a, aig);
        ih.C().a(bp.c(a));
        if (bp.c(a).length >= 50)
        {
            bp.d(a).setTextColor(a.getResources().getColor(0x7f0c00c0));
            ig1 = a.getResources().getDrawable(0x7f020359);
            ig1.setAlpha(50);
            bp.d(a).setCompoundDrawablesWithIntrinsicBounds(null, ig1, null, null);
        }
        ig1 = new String[Math.max(bp.c(a).length, com.roidapp.photogrid.video.bp.e(a).length)];
        System.arraycopy(com.roidapp.photogrid.video.bp.e(a), 0, ig1, 0, Math.min(com.roidapp.photogrid.video.bp.e(a).length, bp.c(a).length));
        com.roidapp.photogrid.video.bp.a(a, ig1);
        notifyDataSetChanged();
    }

    public final ig b(int i)
    {
        if (c == null || i < 0 || i >= c.length)
        {
            return null;
        } else
        {
            return c[i];
        }
    }

    public final int getCount()
    {
        if (c == null)
        {
            return 0;
        } else
        {
            return c.length;
        }
    }

    public final Object getItem(int i)
    {
        return b(i);
    }

    public final long getItemId(int i)
    {
        return (long)i;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        View view1;
        if (view == null)
        {
            view1 = LayoutInflater.from(b).inflate(0x7f030131, viewgroup, false);
            view1.getLayoutParams().height = bp.f(a);
            view = new cb();
            view.a = (ImageView)view1.findViewById(0x7f0d0175);
            view.c = (RelativeLayout)view1.findViewById(0x7f0d04dd);
            ((cb) (view)).c.setOnTouchListener(a);
            view.b = (TextView)view1.findViewById(0x7f0d04db);
            view1.setTag(view);
            viewgroup = view;
        } else
        {
            viewgroup = (cb)view.getTag();
            view1 = view;
        }
        if (i == d)
        {
            view1.setVisibility(4);
        } else
        {
            view1.setVisibility(0);
        }
        ((cb) (viewgroup)).c.setTag(Integer.valueOf(i));
        ((cb) (viewgroup)).b.setVisibility(0);
        ((cb) (viewgroup)).b.setText(String.valueOf(i + 1));
        h.a(a).a(new cc(), android/graphics/Bitmap).a(b(i)).a(android/graphics/Bitmap).a(new bm(b)).b(e.b).e().a(com.roidapp.baselib.b.a.b()).a(bp.f(a), bp.f(a)).a(((cb) (viewgroup)).a);
        return view1;
    }
}
