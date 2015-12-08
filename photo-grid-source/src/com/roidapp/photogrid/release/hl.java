// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import com.bumptech.glide.g;
import com.bumptech.glide.h;
import com.bumptech.glide.load.b.e;
import com.bumptech.glide.p;
import com.bumptech.glide.r;
import com.bumptech.glide.s;
import com.roidapp.baselib.b.a;
import com.roidapp.baselib.c.u;
import com.roidapp.photogrid.video.bm;
import com.roidapp.photogrid.video.cc;

// Referenced classes of package com.roidapp.photogrid.release:
//            hk, ng, ig

final class hl extends BaseAdapter
{

    final hk a;

    hl(hk hk1)
    {
        a = hk1;
        super();
    }

    private ig a(int i)
    {
        return a.b.i[i];
    }

    public final int getCount()
    {
        if (a.b != null && a.b.L != null)
        {
            return a.b.L.length;
        } else
        {
            return 0;
        }
    }

    public final Object getItem(int i)
    {
        return a(i);
    }

    public final long getItemId(int i)
    {
        return (long)i;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        viewgroup = view;
        if (view == null)
        {
            viewgroup = a.c.inflate(0x7f030139, null);
        }
        h.a(a).a(new cc(), android/graphics/Bitmap).a(a(i)).a(android/graphics/Bitmap).a(new bm(a.getActivity())).b(e.b).e().a(com.roidapp.baselib.b.a.b()).a(com.roidapp.photogrid.release.hk.a(a), com.roidapp.photogrid.release.hk.a(a)).a((ImageView)u.a(viewgroup, 0x7f0d04ef));
        return viewgroup;
    }
}
