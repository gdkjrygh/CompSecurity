// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.cloud;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.c;
import com.bumptech.glide.load.b.e;
import com.bumptech.glide.p;
import com.cmcm.adsdk.nativead.d;
import com.roidapp.baselib.c.b;
import com.roidapp.baselib.c.n;
import com.roidapp.cloudlib.ads.i;
import com.roidapp.cloudlib.ads.j;
import com.roidapp.cloudlib.ads.k;
import com.roidapp.photogrid.a.m;
import com.roidapp.photogrid.b.f;
import com.roidapp.photogrid.common.a;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.roidapp.photogrid.cloud:
//            ad, ab, ac, ae

public final class aa
    implements k
{

    private Set a;
    private SparseArray b;
    private float c;
    private int d;
    private boolean e;
    private i f;
    private boolean g;

    public aa(Context context, int i)
    {
        a = new HashSet(i);
        b = new SparseArray(i);
        if (m.a(context.getApplicationContext()) == 1 || com.roidapp.photogrid.common.a.a().b)
        {
            e = false;
            return;
        } else
        {
            context = context.getResources().getDisplayMetrics();
            d = ((DisplayMetrics) (context)).widthPixels;
            c = ((DisplayMetrics) (context)).density;
            return;
        }
    }

    static i a(aa aa1)
    {
        return aa1.f;
    }

    static SparseArray b(aa aa1)
    {
        return aa1.b;
    }

    public final View a(j j1, View view, ViewGroup viewgroup, p p1)
    {
        if (!(j1.a() instanceof d)) goto _L2; else goto _L1
_L1:
        d d1;
        String s;
        d1 = (d)j1.a();
        s = j1.b();
        if (d1 != null) goto _L4; else goto _L3
_L3:
        j1 = null;
_L6:
        return j1;
_L4:
        String s1;
        if (view == null)
        {
            j1 = new ad((byte)0);
            view = LayoutInflater.from(viewgroup.getContext()).inflate(0x7f03001d, null);
            j1.a = (TextView)view.findViewById(0x7f0d009b);
            j1.b = (TextView)view.findViewById(0x7f0d009f);
            j1.c = (TextView)view.findViewById(0x7f0d009a);
            j1.d = (ImageView)view.findViewById(0x7f0d0098);
            j1.e = (ImageView)view.findViewById(0x7f0d009e);
            j1.f = (ImageView)view.findViewById(0x7f0d0099);
            view.setTag(j1);
        } else
        {
            j1 = (ad)view.getTag();
        }
        if (((ad) (j1)).a != null)
        {
            ((ad) (j1)).a.setText(d1.d());
        }
        if (((ad) (j1)).b != null)
        {
            ((ad) (j1)).b.setText(d1.h());
            ((ad) (j1)).b.setMaxLines(100);
        }
        if (((ad) (j1)).c != null)
        {
            if (!TextUtils.isEmpty(d1.g()))
            {
                ((ad) (j1)).c.setText(d1.g());
            } else
            {
                ((ad) (j1)).c.setText("Try it");
            }
        }
        viewgroup = d1.e();
        s1 = d1.f();
        if (((ad) (j1)).e != null)
        {
            if (!TextUtils.isEmpty(viewgroup))
            {
                ((ad) (j1)).e.setVisibility(0);
                float f1 = d;
                float f3 = c;
                ((ad) (j1)).e.getLayoutParams().height = (int)((f1 - f3 * 48F) / 1.9F);
                if (p1 != null)
                {
                    p1.a(viewgroup).b(com.roidapp.baselib.b.a.b()).g().a(e.c).a(((ad) (j1)).e);
                }
            } else
            {
                ((ad) (j1)).e.setVisibility(8);
            }
        }
        if (!TextUtils.isEmpty(s1) && ((ad) (j1)).d != null && p1 != null)
        {
            p1.a(s1).b(com.roidapp.baselib.b.a.b()).g().a(e.c).a(((ad) (j1)).d);
        }
        if (((ad) (j1)).f != null)
        {
            j1 = ((ad) (j1)).f;
            int i;
            if (d1.j())
            {
                i = 0x7f02014b;
            } else
            {
                i = 0;
            }
            n.a(j1, i);
        }
        d1.a(view);
        view.setVisibility(0);
        j1 = view;
        if (!a.contains(d1))
        {
            com.roidapp.photogrid.b.f.a(s, 5, 1);
            a.add(d1);
            b.put(d1.hashCode(), s);
            return view;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (view == null)
        {
            j1 = new ad((byte)0);
            view = LayoutInflater.from(viewgroup.getContext()).inflate(0x7f03001d, null);
            j1.a = (TextView)view.findViewById(0x7f0d009b);
            j1.b = (TextView)view.findViewById(0x7f0d009f);
            j1.c = (TextView)view.findViewById(0x7f0d009a);
            j1.d = (ImageView)view.findViewById(0x7f0d0098);
            j1.e = (ImageView)view.findViewById(0x7f0d009e);
            j1.f = (ImageView)view.findViewById(0x7f0d0099);
            view.setTag(j1);
        } else
        {
            j1 = (ad)view.getTag();
        }
        if (((ad) (j1)).a != null)
        {
            ((ad) (j1)).a.setText("3D Theme");
        }
        if (((ad) (j1)).b != null)
        {
            ((ad) (j1)).b.setVisibility(8);
        }
        if (((ad) (j1)).c != null)
        {
            ((ad) (j1)).c.setText(0x7f070021);
        }
        if (((ad) (j1)).e != null)
        {
            ((ad) (j1)).e.setVisibility(0);
            float f2 = d;
            float f4 = c;
            ((ad) (j1)).e.getLayoutParams().height = (int)((f2 - f4 * 48F) / 1.9F);
            if (p1 != null)
            {
                p1.a(Integer.valueOf(0x7f020009)).b(com.roidapp.baselib.b.a.b()).g().a(e.c).a(((ad) (j1)).e);
            }
        }
        if (((ad) (j1)).d != null && p1 != null)
        {
            p1.a(Integer.valueOf(0x7f020008)).b(com.roidapp.baselib.b.a.b()).g().a(e.c).a(((ad) (j1)).d);
        }
        if (((ad) (j1)).f != null)
        {
            n.a(((ad) (j1)).f, 0x7f02014b);
        }
        viewgroup = new ab(this);
        view.setOnClickListener(viewgroup);
        ((ad) (j1)).c.setOnClickListener(viewgroup);
        view.setVisibility(0);
        j1 = view;
        if (!g)
        {
            com.roidapp.baselib.c.b.f("Ad/Show/CML", null);
            g = true;
            return view;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void a()
    {
        if (a != null)
        {
            a.clear();
            a = null;
        }
        if (b != null)
        {
            b.clear();
            b = null;
        }
        com.roidapp.cloudlib.ads.f.a().b();
        f = null;
    }

    public final void a(Context context, ac ac1, i i)
    {
        if (e || com.roidapp.photogrid.cloud.ac.a(ac1))
        {
            return;
        } else
        {
            f = i;
            com.roidapp.photogrid.cloud.ac.b(ac1);
            com.roidapp.cloudlib.ads.f.a().a(context, 40008, new ae(this));
            return;
        }
    }
}
