// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.TextView;
import com.roidapp.baselib.c.an;
import com.roidapp.photogrid.video.HorizontalScrollViewEx;
import com.roidapp.photogrid.video.HorizontalViewEx;
import com.roidapp.photogrid.video.bj;
import com.roidapp.photogrid.video.d;
import com.roidapp.videolib.b.u;
import com.roidapp.videolib.core.e;
import java.lang.ref.WeakReference;

// Referenced classes of package com.roidapp.photogrid.release:
//            ng, ih, PhotoGridActivity, hu

public class ht extends Fragment
    implements android.widget.AdapterView.OnItemClickListener
{

    public static final String b = com/roidapp/photogrid/release/ht.getSimpleName();
    private int a;
    protected PhotoGridActivity c;
    protected ng d;
    protected bj e[];
    protected int f;
    protected View g;
    protected LayoutInflater h;

    public ht()
    {
        e = null;
        f = -1;
        g = null;
        h = null;
    }

    private void a(boolean flag)
    {
        int j = u.d.ordinal();
        Object obj = getResources();
        int i;
        if (flag)
        {
            i = 0x7f0205f9;
        } else
        {
            i = e[j].c;
        }
        obj = ((Resources) (obj)).getDrawable(i);
        if (obj != null)
        {
            e[j].e.setCompoundDrawablesWithIntrinsicBounds(null, ((Drawable) (obj)), null, null);
        }
    }

    protected void a()
    {
        e = new bj[u.k.ordinal()];
        e[u.a.ordinal()] = new bj(u.a, 0x7f0703cc, 0x7f02040c, false);
        e[u.d.ordinal()] = new bj(u.d, 0x7f0703d0, 0x7f0205f8, false);
        e[u.e.ordinal()] = new bj(u.e, 0x7f0703ce, 0x7f0205f1, false);
        e[u.f.ordinal()] = new bj(u.f, 0x7f0703cf, 0x7f0205f2, false);
        e[u.g.ordinal()] = new bj(u.g, 0x7f0703ca, 0x7f0205f3, false);
        e[u.h.ordinal()] = new bj(u.h, 0x7f0703c7, 0x7f0205f4, false);
        e[u.i.ordinal()] = new bj(u.i, 0x7f0703c8, 0x7f0205f5, false);
        e[u.j.ordinal()] = new bj(u.j, 0x7f0703c9, 0x7f0205f6, false);
    }

    protected final boolean a(int i)
    {
        return d != null && d.i != null && d.i.length <= com.roidapp.videolib.core.e.c(u.values()[i]);
    }

    protected int b()
    {
        return 0x7f0300c9;
    }

    protected final void b(int i)
    {
        Drawable drawable = getResources().getDrawable(e[i].c);
        if (!a(i))
        {
            e[i].e.setTextColor(getResources().getColor(0x7f0c00c0));
            if (drawable != null)
            {
                drawable.setAlpha(50);
                e[i].e.setCompoundDrawablesWithIntrinsicBounds(null, drawable, null, null);
            }
        } else
        {
            e[i].e.setTextColor(getResources().getColor(0x7f0c00bf));
            if (drawable != null)
            {
                drawable.setAlpha(255);
                e[i].e.setCompoundDrawablesWithIntrinsicBounds(null, drawable, null, null);
                return;
            }
        }
    }

    protected int c()
    {
        return 0x7f03013a;
    }

    protected void d()
    {
        u u1 = ih.C().ab();
        boolean flag;
        if (u1 == u.b || u1 == u.c)
        {
            f = e[u.a.ordinal()].g.getId();
            u1 = u.a;
        } else
        {
            f = e[u1.ordinal()].g.getId();
        }
        if (u1 != u.d)
        {
            e[u1.ordinal()].g.setSelected(true);
        }
        if (u1 == u.d)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a(flag);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        a();
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        c = (PhotoGridActivity)getActivity();
        d = (ng)c.b;
        h = layoutinflater;
        a = getResources().getDisplayMetrics().widthPixels;
        g = h.inflate(b(), viewgroup, false);
        ((d)g).a(new hu(this));
        ((d)g).a(this);
        d();
        return g;
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        if (g != null)
        {
            if (g instanceof HorizontalScrollViewEx)
            {
                ((HorizontalScrollViewEx)g).b();
                g = null;
            } else
            if (g instanceof HorizontalViewEx)
            {
                ((HorizontalViewEx)g).a();
                g = null;
                return;
            }
        }
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        if (!(g instanceof HorizontalScrollViewEx)) goto _L2; else goto _L1
_L1:
        int j;
        i = view.getWidth();
        j = a - g.getLeft() - (view.getRight() - g.getScrollX());
        if (j >= i) goto _L4; else goto _L3
_L3:
        ((HorizontalScrollViewEx)g).smoothScrollBy(i - j, 0);
_L2:
        i = view.getId();
        int k;
        boolean flag;
        try
        {
            if (f != i)
            {
                break; /* Loop/switch isn't completed */
            }
            k = u.d.ordinal();
        }
        // Misplaced declaration of an exception variable
        catch (AdapterView adapterview)
        {
            return;
        }
        if (i != k)
        {
            return;
        }
        break; /* Loop/switch isn't completed */
_L4:
        k = view.getLeft() - g.getScrollX();
        if (k < i)
        {
            ((HorizontalScrollViewEx)g).smoothScrollBy(k - i, 0);
        }
        if (true) goto _L2; else goto _L5
_L5:
        if (com.roidapp.videolib.core.e.a(u.values()[i]) && !a(i))
        {
            an.a(new WeakReference(getActivity()), getString(0x7f0702f8, new Object[] {
                Integer.valueOf(com.roidapp.videolib.core.e.c(u.values()[i]))
            }));
            return;
        }
        e[f].g.setSelected(false);
        f = i;
        if (u.d.ordinal() == i)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_240;
        }
        e[i].g.setSelected(true);
        a(flag);
        if (d != null)
        {
            d.a(u.values()[i]);
        }
        ((PhotoGridActivity)getActivity()).G();
        return;
    }

}
