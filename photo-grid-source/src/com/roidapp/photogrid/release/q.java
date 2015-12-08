// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.b;
import com.bumptech.glide.d;
import com.bumptech.glide.h;
import com.bumptech.glide.p;
import com.roidapp.baselib.c.n;
import com.roidapp.photogrid.common.an;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.roidapp.photogrid.release:
//            c, p, StickerInfo

final class q extends BaseAdapter
{

    com.roidapp.photogrid.release.p a;
    final c b;

    public q(c c1)
    {
        b = c1;
        super();
        if (com.roidapp.photogrid.release.c.h(c1) == null)
        {
            c.a(c1, new ArrayList(0));
        }
    }

    public final int getCount()
    {
        return com.roidapp.photogrid.release.c.h(b).size();
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
        viewgroup = view;
        if (view == null)
        {
            viewgroup = LayoutInflater.from(com.roidapp.photogrid.release.c.n(b)).inflate(0x7f030125, null);
        }
        if (viewgroup.getTag() != null)
        {
            a = (com.roidapp.photogrid.release.p)viewgroup.getTag();
        } else
        {
            a = new com.roidapp.photogrid.release.p();
            a.a = (TextView)viewgroup.findViewById(0x7f0d0382);
            a.b = (ImageView)viewgroup.findViewById(0x7f0d04c2);
            a.c = (ImageView)viewgroup.findViewById(0x7f0d04c4);
            a.d = (ImageView)viewgroup.findViewById(0x7f0d04c5);
            a.e = (ImageView)viewgroup.findViewById(0x7f0d037f);
            a.f = (ImageView)viewgroup.findViewById(0x7f0d04c3);
            a.d.setVisibility(8);
            viewgroup.setTag(a);
        }
        a.f.setVisibility(4);
        if (c.o(b) == i)
        {
            a.e.setVisibility(0);
        } else
        {
            a.e.setVisibility(4);
        }
        view = (StickerInfo)com.roidapp.photogrid.release.c.h(b).get(i);
        if (((StickerInfo) (view)).f)
        {
            a.a.setText(((StickerInfo) (view)).c);
            try
            {
                a.b.setImageResource(((StickerInfo) (view)).d);
            }
            catch (OutOfMemoryError outofmemoryerror)
            {
                outofmemoryerror.printStackTrace();
            }
        } else
        {
            String s = ((StickerInfo) (view)).m;
            if (!TextUtils.isEmpty(s))
            {
                try
                {
                    h.a(b.getActivity()).a(s).i().a(a.b);
                }
                catch (OutOfMemoryError outofmemoryerror1)
                {
                    outofmemoryerror1.printStackTrace();
                }
            }
            if (((StickerInfo) (view)).j != null)
            {
                String s1 = an.a(b.getActivity(), an.a(b.getActivity())).getCountry();
                if (s1 != null && ((StickerInfo) (view)).j.containsKey(s1.toLowerCase()))
                {
                    a.a.setText((CharSequence)((StickerInfo) (view)).j.get(s1.toLowerCase()));
                } else
                {
                    a.a.setText((CharSequence)((StickerInfo) (view)).j.get("en"));
                }
            }
        }
        if (((StickerInfo) (view)).g)
        {
            a.f.setVisibility(0);
        }
        if (((StickerInfo) (view)).e)
        {
            a.c.setVisibility(4);
            return viewgroup;
        } else
        {
            n.a(a.c, 0x7f020383);
            a.c.setVisibility(0);
            return viewgroup;
        }
    }
}
