// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.views;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ScrollView;
import com.jcp.adapters.aw;
import com.jcp.e.ad;
import com.jcp.pojo.Accordion;
import com.jcp.util.g;
import in.srain.cube.views.GridViewWithHeaderAndFooter;
import java.util.List;

// Referenced classes of package com.jcp.views:
//            j, aa, e, h, 
//            g, HorizontalListOfRecommendedProducts, f, i

public final class DataListView extends ScrollView
    implements ad
{

    private static final String a = com/jcp/views/DataListView.getName();
    private float b;
    private View c;
    private Accordion d[];
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private j j;
    private LayoutInflater k;
    private int l;
    private Bundle m;
    private i n;
    private int o;
    private int p;
    private ImageView q;
    private GridViewWithHeaderAndFooter r;
    private HorizontalListOfRecommendedProducts s;
    private boolean t;
    private String u;
    private List v;
    private ad w;
    private boolean x;

    public DataListView(Context context)
    {
        this(context, null);
    }

    public DataListView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public DataListView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        l = 1;
        a(context);
    }

    static int a(DataListView datalistview, int i1)
    {
        datalistview.p = i1;
        return i1;
    }

    static j a(DataListView datalistview)
    {
        return datalistview.j;
    }

    static String a()
    {
        return a;
    }

    private void a(Context context)
    {
        k = LayoutInflater.from(context);
        j = new j(this, context);
        addView(j, new android.widget.FrameLayout.LayoutParams(-1, -2));
        setOnTouchListener(new aa(this, j));
        postDelayed(new e(this), 0L);
    }

    private void a(List list, int i1)
    {
        r.setOnItemClickListener(new h(this, list, i1));
    }

    static int b(DataListView datalistview, int i1)
    {
        datalistview.o = i1;
        return i1;
    }

    private void b()
    {
        c = k.inflate(0x7f030092, this, false);
        q = (ImageView)c.findViewById(0x7f0e033c);
        r = (GridViewWithHeaderAndFooter)c.findViewById(0x7f0e033d);
        r.setNumColumns(2);
        c.findViewById(0x7f0e033b).setOnClickListener(new com.jcp.views.g(this));
    }

    static boolean b(DataListView datalistview)
    {
        return datalistview.x;
    }

    private void c()
    {
        smoothScrollTo(0, 0);
    }

    static void c(DataListView datalistview)
    {
        datalistview.c();
    }

    private void d()
    {
        smoothScrollTo(0, getTopOfDepartments());
    }

    static void d(DataListView datalistview)
    {
        datalistview.d();
    }

    static i e(DataListView datalistview)
    {
        return datalistview.n;
    }

    private void e()
    {
        if (c != null)
        {
            s = (HorizontalListOfRecommendedProducts)c.findViewById(0x7f0e033e);
            s.setRecommendedProductClickListener(this);
        }
    }

    private View f()
    {
        if (c == null)
        {
            b();
            e();
            List list = com.jcp.util.g.a().a("depth0");
            int i1 = list.size();
            r.setAdapter(new aw(getContext(), list));
            a(r, 2);
            g();
            a(list, i1);
        }
        return c;
    }

    static Accordion[] f(DataListView datalistview)
    {
        return datalistview.d;
    }

    static int g(DataListView datalistview)
    {
        return datalistview.e;
    }

    private void g()
    {
        if (v != null && s != null)
        {
            String s1;
            if (!TextUtils.isEmpty(u))
            {
                s1 = u;
            } else
            {
                s1 = getResources().getString(0x7f070480);
            }
            s.setTitle(s1);
            s.setRecommendedProductsWithSignInItem(v);
            s.setZone(100);
            a(s.getAdapterView(), 1);
        }
    }

    private int getTopOfDepartments()
    {
        return e * (l - 1);
    }

    static int h(DataListView datalistview)
    {
        return datalistview.h;
    }

    static int i(DataListView datalistview)
    {
        return datalistview.g;
    }

    static int j(DataListView datalistview)
    {
        return datalistview.l;
    }

    static int k(DataListView datalistview)
    {
        return datalistview.i;
    }

    static float l(DataListView datalistview)
    {
        return datalistview.b;
    }

    static int m(DataListView datalistview)
    {
        return datalistview.f;
    }

    static LayoutInflater n(DataListView datalistview)
    {
        return datalistview.k;
    }

    static View o(DataListView datalistview)
    {
        return datalistview.f();
    }

    static int p(DataListView datalistview)
    {
        return datalistview.p;
    }

    static int q(DataListView datalistview)
    {
        return datalistview.o;
    }

    static View r(DataListView datalistview)
    {
        return datalistview.c;
    }

    public void a(AdapterView adapterview, int i1)
    {
        Object obj = adapterview.getAdapter();
        if (obj == null || ((Adapter) (obj)).getCount() == 0)
        {
            return;
        }
        View view = ((Adapter) (obj)).getView(0, null, adapterview);
        view.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        view.measure(0, 0);
        int j1 = view.getMeasuredHeight();
        if (((Adapter) (obj)).getCount() > i1 && i1 > 1)
        {
            i1 = (((Adapter) (obj)).getCount() / i1) * j1;
        } else
        {
            i1 = j1 * 2;
        }
        obj = adapterview.getLayoutParams();
        obj.height = i1;
        adapterview.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        g = i1 + g;
        if (adapterview.getId() == 0x7f0e033e)
        {
            t = true;
        }
        requestLayout();
    }

    public void a(Accordion aaccordion[], boolean flag)
    {
        j.removeAllViews();
        com.jcp.views.j.a(j, 0);
        d = aaccordion;
        l = 1;
        if (d != null)
        {
            l = l + d.length;
        }
        if (!flag)
        {
            if (m != null)
            {
                post(new f(this, m.getInt("scrollPos")));
            } else
            {
                com.jcp.views.j.a(j);
            }
        } else
        if (i == 0)
        {
            com.jcp.views.j.a(j);
        } else
        {
            i = 0;
            scrollTo(0, 0);
        }
        m = null;
    }

    public void c(Bundle bundle)
    {
        w.c(bundle);
    }

    public int getTotalDataSize()
    {
        return l;
    }

    public int getViewMaxHeight()
    {
        return e;
    }

    protected void onMeasure(int i1, int j1)
    {
        super.onMeasure(i1, j1);
        int k1 = getMeasuredHeight();
        if (k1 > 0 && h < k1 && !t)
        {
            h = getMeasuredHeight();
            e = (int)((float)h * 0.48F);
            f = (int)((float)h * 0.13F);
            b = (float)f / (float)e;
            super.onMeasure(i1, j1);
            com.jcp.views.j.a(j);
        }
    }

    protected void onRestoreInstanceState(Parcelable parcelable)
    {
        if (parcelable instanceof Bundle)
        {
            m = (Bundle)parcelable;
            super.onRestoreInstanceState(m.getParcelable("savedState"));
            i = m.getInt("scrollPos");
        }
    }

    protected Parcelable onSaveInstanceState()
    {
        Bundle bundle = new Bundle();
        bundle.putInt("scrollPos", i);
        bundle.putParcelable("savedState", super.onSaveInstanceState());
        return bundle;
    }

    protected void onScrollChanged(int i1, int j1, int k1, int l1)
    {
        i = j1;
        if (q != null)
        {
            ImageView imageview;
            Resources resources;
            boolean flag;
            if (i >= getTopOfDepartments())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            x = flag;
            imageview = q;
            resources = getResources();
            if (x)
            {
                i1 = 0x7f02018f;
            } else
            {
                i1 = 0x7f020190;
            }
            imageview.setImageDrawable(resources.getDrawable(i1));
        }
        com.jcp.views.j.a(j);
    }

    public void setItemClick(i i1)
    {
        n = i1;
    }

    public void setRecommendations(List list)
    {
        v = list;
        e();
        g();
    }

    public void setRecommendationsStrategyMessage(String s1)
    {
        u = s1;
    }

    public void setRecommendedProductClickListener(ad ad1)
    {
        w = ad1;
    }

}
