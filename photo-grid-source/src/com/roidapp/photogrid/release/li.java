// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

// Referenced classes of package com.roidapp.photogrid.release:
//            ld, PhotoGridActivity

final class li extends BaseAdapter
{

    final ld a;
    private LayoutInflater b;

    public li(ld ld1, Context context)
    {
        a = ld1;
        super();
        b = LayoutInflater.from(context);
    }

    public final int getCount()
    {
        if (ld.e(a) != null)
        {
            return ld.e(a).size() + 1;
        } else
        {
            return 0;
        }
    }

    public final Object getItem(int i)
    {
        return null;
    }

    public final long getItemId(int i)
    {
        return 0L;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        if (i == 0)
        {
            view = b.inflate(0x7f0300fd, null);
            ((TextView)view.findViewById(0x7f0d03f7)).setText(0x7f07023d);
            return view;
        }
        view = b.inflate(0x7f0300fe, null);
        viewgroup = (TextView)view.findViewById(0x7f0d03f7);
        viewgroup.setText((CharSequence)ld.e(a).get(i - 1));
        ImageView imageview = (ImageView)view.findViewById(0x7f0d03fb);
        Drawable drawable = ld.a(a).getResources().getDrawable(((Integer)ld.f(a).get(i - 1)).intValue());
        drawable.mutate();
        if (ld.a() == 0)
        {
            viewgroup.setTextColor(ld.a(a).getResources().getColor(0x7f0c00c0));
            drawable.setAlpha(50);
        } else
        {
            viewgroup.setTextColor(ld.a(a).getResources().getColor(0x7f0c00bf));
            drawable.setAlpha(225);
        }
        imageview.setBackgroundDrawable(drawable);
        return view;
    }
}
