// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.template.a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.util.LongSparseArray;
import android.support.v7.widget.al;
import android.support.v7.widget.bi;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bumptech.glide.c;
import com.bumptech.glide.h;
import com.bumptech.glide.p;
import com.roidapp.cloudlib.a.a;
import com.roidapp.cloudlib.ads.i;
import com.roidapp.cloudlib.aq;
import com.roidapp.cloudlib.as;
import com.roidapp.cloudlib.common.d;
import com.roidapp.cloudlib.template.TemplateInfo;
import com.roidapp.cloudlib.template.b;
import com.roidapp.cloudlib.template.c.f;
import com.roidapp.cloudlib.template.j;
import java.util.List;

// Referenced classes of package com.roidapp.cloudlib.template.a:
//            c, f, d

public abstract class e extends al
    implements i
{

    protected final Context a;
    protected final f b;
    protected String c;
    protected b d;
    protected com.roidapp.cloudlib.template.a e;
    protected Drawable f[];
    protected Drawable g[];
    private int h[];
    private int i;
    private final int j;
    private final int k;
    private final Rect l = new Rect();
    private final Rect m = new Rect();
    private final android.view.View.OnClickListener n;
    private final LongSparseArray o = new LongSparseArray();
    private SparseArray p;

    public e(f f1, android.view.View.OnClickListener onclicklistener)
    {
        i = 0;
        b = f1;
        a = f1.getActivity();
        n = onclicklistener;
        j = f1.d();
        k = com.roidapp.cloudlib.common.d.a(a.getResources(), 54F);
        d = com.roidapp.cloudlib.template.j.a();
        e = com.roidapp.cloudlib.template.j.b();
        p = new SparseArray();
        if (!(this instanceof com.roidapp.cloudlib.template.a.c))
        {
            f = new Drawable[2];
            f[0] = a.getResources().getDrawable(aq.r);
            f[1] = a.getResources().getDrawable(aq.q);
            f[0].setBounds(0, 0, f[0].getIntrinsicWidth(), f[0].getIntrinsicHeight());
            f[1].setBounds(0, 0, f[1].getIntrinsicWidth(), f[0].getIntrinsicHeight());
            h = com.roidapp.cloudlib.a.a.a(a).d("ad", "templateAdPos");
            if (h == null)
            {
                h = (new int[] {
                    4, 9
                });
            }
        }
        g = new Drawable[2];
        g[0] = a.getResources().getDrawable(aq.s);
        g[1] = a.getResources().getDrawable(aq.n);
        o.put(0x77fda40aL, Integer.valueOf(aq.Y));
        o.put(0x77fda407L, Integer.valueOf(aq.Z));
        o.put(0x77fda406L, Integer.valueOf(aq.aa));
    }

    public final int a(int i1)
    {
        return p == null || p.get(i1) == null ? 0 : 1;
    }

    public final int a(com.roidapp.cloudlib.ads.j j1)
    {
        if (p != null && i < h.length)
        {
            if (i > 0)
            {
                for (int i1 = 0; i1 < i; i1++)
                {
                    int l1 = h[i1];
                    com.roidapp.cloudlib.ads.j j2 = (com.roidapp.cloudlib.ads.j)p.get(l1);
                    if (j2 != null && (j2.a() == j1.a() || TextUtils.equals(((com.cmcm.a.a.a)j2.a()).d(), ((com.cmcm.a.a.a)j1.a()).d())))
                    {
                        return -1;
                    }
                }

            }
            int ai[] = h;
            int k1 = i;
            i = k1 + 1;
            k1 = ai[k1];
            p.append(k1, j1);
            c();
            return k1;
        } else
        {
            return -1;
        }
    }

    public final bi a(ViewGroup viewgroup, int i1)
    {
        if (i1 == 1)
        {
            viewgroup = new FrameLayout(a);
            android.support.v7.widget.StaggeredGridLayoutManager.LayoutParams layoutparams = new android.support.v7.widget.StaggeredGridLayoutManager.LayoutParams(-1, -2);
            layoutparams.a();
            viewgroup.setLayoutParams(layoutparams);
            return new com.roidapp.cloudlib.template.a.f(viewgroup, i1);
        } else
        {
            return new com.roidapp.cloudlib.template.a.f(LayoutInflater.from(a).inflate(as.Z, viewgroup, false), i1);
        }
    }

    public final void a(bi bi, int i1)
    {
        com.roidapp.cloudlib.template.a.f f1 = (com.roidapp.cloudlib.template.a.f)bi;
        if (f1.j != 1) goto _L2; else goto _L1
_L1:
        View view;
        if (p != null)
        {
            bi = (com.roidapp.cloudlib.ads.j)p.get(i1);
        } else
        {
            bi = null;
        }
        if (bi == null)
        {
            f1.a.setVisibility(8);
        }
        if ((this instanceof com.roidapp.cloudlib.template.a.d) && !TextUtils.isEmpty(c))
        {
            bi.a((new StringBuilder()).append(c).append(i1).toString());
        }
        view = ((FrameLayout)f1.a).getChildAt(0);
        if (view != null) goto _L4; else goto _L3
_L3:
        bi = bi.a(null, (ViewGroup)f1.a, com.bumptech.glide.h.a(b));
        ((ViewGroup)f1.a).addView(bi);
_L6:
        return;
_L4:
        bi.a(view, (ViewGroup)f1.a, com.bumptech.glide.h.a(b));
        return;
_L2:
        bi = e(i1);
        if (bi != null)
        {
            long l1 = bi.e();
            f1.u.setOnClickListener(n);
            f1.p.setOnClickListener(n);
            f1.q.setOnClickListener(n);
            f1.u.setTag(Integer.valueOf(i1));
            f1.p.setTag(Integer.valueOf(i1));
            f1.q.setTag(Integer.valueOf(i1));
            i1 = j;
            int j1 = Math.round(((float)i1 * (float)bi.l()) / (float)bi.k());
            android.view.ViewGroup.LayoutParams layoutparams = f1.o.getLayoutParams();
            layoutparams.width = i1;
            layoutparams.height = j1;
            l.left = 0;
            l.right = i1 / 2;
            l.top = 0;
            l.bottom = k;
            ((View)f1.p.getParent()).setTouchDelegate(new TouchDelegate(l, f1.p));
            m.left = i1 / 2;
            m.right = i1;
            m.top = 0;
            m.bottom = k;
            ((View)f1.q.getParent()).setTouchDelegate(new TouchDelegate(m, f1.q));
            if (com.roidapp.cloudlib.template.j.a(l1))
            {
                com.bumptech.glide.h.a(b).a((Integer)o.get(l1)).b(com.roidapp.baselib.b.a.b()).g().b(i1, j1).a(f1.o);
            } else
            {
                com.bumptech.glide.h.a(b).a(bi.h()).b(com.roidapp.baselib.b.a.b()).g().a(com.bumptech.glide.load.b.e.c).b(i1, j1).a(f1.o);
            }
            if (!(this instanceof com.roidapp.cloudlib.template.a.c))
            {
                RelativeLayout relativelayout = (RelativeLayout)f1.k.getParent();
                relativelayout.setLayoutParams(layoutparams);
                if (f1.k.getTag() == null || l1 != ((Long)f1.k.getTag()).longValue())
                {
                    f1.k.setTag(Long.valueOf(l1));
                }
                i1 = bi.d();
                bi.a(f1.k);
                if (i1 == 0 || i1 == 100)
                {
                    relativelayout.setVisibility(8);
                } else
                if (i1 == 1)
                {
                    f1.k.setProgress(i1);
                    f1.n.setText("");
                    f1.n.setCompoundDrawables(f[0], null, null, null);
                    relativelayout.setVisibility(0);
                } else
                {
                    f1.k.setProgress(i1);
                    f1.n.setText((new StringBuilder()).append(i1).append("%").toString());
                    f1.n.setCompoundDrawables(f[1], null, null, null);
                    relativelayout.setVisibility(0);
                }
            }
            if (bi.n() && bi.o())
            {
                f1.r.setVisibility(0);
            } else
            {
                f1.r.setVisibility(8);
            }
            f1.l.setText(bi.i());
            a(f1, ((TemplateInfo) (bi)));
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    abstract void a(com.roidapp.cloudlib.template.a.f f1, TemplateInfo templateinfo);

    public final void a(String s)
    {
        c = s;
    }

    public abstract void a(List list);

    public abstract void d();

    public abstract TemplateInfo e(int i1);

    public void e()
    {
        if (f != null)
        {
            Drawable adrawable[] = f;
            f[1] = null;
            adrawable[0] = null;
            f = null;
        }
        if (g != null)
        {
            Drawable adrawable1[] = g;
            g[1] = null;
            adrawable1[0] = null;
            g = null;
        }
        if (p != null)
        {
            p.clear();
            p = null;
        }
    }

    public final int f()
    {
        if (p != null)
        {
            return p.size();
        } else
        {
            return 0;
        }
    }

    public final int f(int i1)
    {
        int l1;
        if (p != null)
        {
            int k1 = 0;
            int j1 = i1;
            do
            {
                l1 = j1;
                if (k1 >= p.size())
                {
                    break;
                }
                l1 = j1;
                if (i1 > p.keyAt(k1))
                {
                    l1 = j1 - 1;
                }
                k1++;
                j1 = l1;
            } while (true);
        } else
        {
            l1 = i1;
        }
        return l1;
    }
}
