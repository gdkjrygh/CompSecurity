// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.filter;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.roidapp.baselib.c.n;
import com.roidapp.imagelib.b.b;
import com.roidapp.imagelib.d;
import com.roidapp.imagelib.e;
import com.roidapp.imagelib.f;
import com.roidapp.imagelib.filter.filterinfo.IFilterInfo;
import com.roidapp.imagelib.filter.groupinfo.CloudGroupInfo;
import com.roidapp.imagelib.filter.groupinfo.IGroupInfo;
import com.roidapp.imagelib.filter.groupinfo.LocalGroupInfo;
import com.roidapp.imagelib.g;
import com.roidapp.imagelib.h;

// Referenced classes of package com.roidapp.imagelib.filter:
//            n, ad, ag, bf, 
//            ai, u, az, bg, 
//            y, x, aa, ImageColorView, 
//            w, ab, a, t, 
//            z, ax

public class s extends com.roidapp.imagelib.filter.n
    implements android.view.View.OnClickListener, ad, ag, bf
{

    public static final String f = com/roidapp/imagelib/filter/s.getSimpleName();
    protected ai g;
    private TextView h;
    private TextView i;
    private ViewGroup j;
    private az k;
    private bg l;
    private IGroupInfo m;
    private IFilterInfo n;
    private y o;
    private boolean p;
    private Handler q;
    private b r;
    private IFilterInfo s;

    public s()
    {
        p = true;
        g = ai.a;
        q = new Handler(new u(this));
        r = new b();
    }

    static Handler a(s s1)
    {
        return s1.q;
    }

    static az b(s s1)
    {
        return s1.k;
    }

    static IGroupInfo c(s s1)
    {
        return s1.m;
    }

    static void d(s s1)
    {
        s1.i();
    }

    static boolean e(s s1)
    {
        return s1.p;
    }

    private void i()
    {
        if (o == null || !isAdded())
        {
            return;
        } else
        {
            o.a(k.B(), r, l.a());
            return;
        }
    }

    public final ax a(IGroupInfo igroupinfo, Context context)
    {
        return new x(this, igroupinfo, context);
    }

    public final void a(ai ai1)
    {
        g = ai1;
    }

    public final void a(IGroupInfo igroupinfo)
    {
        l.a(igroupinfo, aa.a().b());
        igroupinfo = new android.widget.FrameLayout.LayoutParams(-1, -2);
        j.removeAllViews();
        j.addView(l, igroupinfo);
    }

    public final void a(boolean flag)
    {
        p = flag;
    }

    public final void b(int i1)
    {
        r.a(i1);
    }

    public final void c(int i1)
    {
        r.b(i1);
    }

    public final boolean c()
    {
        return false;
    }

    public final void d()
    {
        if (!r.a())
        {
            return;
        } else
        {
            r = new b();
            i();
            return;
        }
    }

    public final void d(int i1)
    {
        r.c(i1);
    }

    public final void e()
    {
        if (!isAdded())
        {
            return;
        } else
        {
            j.removeAllViews();
            Object obj = new View(getActivity());
            ((View) (obj)).setBackgroundResource(f.d);
            android.widget.FrameLayout.LayoutParams layoutparams = new android.widget.FrameLayout.LayoutParams(-1, (int)getResources().getDimension(e.h));
            layoutparams.gravity = 80;
            j.addView(((View) (obj)), layoutparams);
            obj = new android.widget.FrameLayout.LayoutParams(-1, (int)getResources().getDimension(e.f));
            j.addView(k, ((android.view.ViewGroup.LayoutParams) (obj)));
            return;
        }
    }

    public final void e(int i1)
    {
        r.d(i1);
    }

    public final void f()
    {
        r = new b();
        i();
    }

    public final void g()
    {
        i();
    }

    public final boolean h()
    {
        while (!isAdded() || j.getChildCount() == 0 || j.findViewWithTag("imageFilterBaseView") != null || j.findViewWithTag("imageFilterColorView") != null || j.findViewWithTag("imageFilterListView") == null) 
        {
            return false;
        }
        e();
        return true;
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        if (activity instanceof y)
        {
            o = (y)activity;
            return;
        } else
        {
            throw new ClassCastException((new StringBuilder()).append(activity.toString()).append(" must implemenet FilterProcessListener").toString());
        }
    }

    public void onClick(View view)
    {
        int i1 = view.getId();
        if (i1 != g.G) goto _L2; else goto _L1
_L1:
        h.setBackgroundResource(d.j);
        i.setBackgroundResource(f.o);
        e();
_L4:
        return;
_L2:
        if (i1 != g.I)
        {
            continue; /* Loop/switch isn't completed */
        }
        i.setBackgroundResource(d.j);
        h.setBackgroundResource(f.o);
        if (!isAdded()) goto _L4; else goto _L3
_L3:
        j.removeAllViews();
        view = new ImageColorView(getActivity());
        view.a(this);
        view.setTag("imageFilterColorView");
        view.a(new w(this));
        view.a(r, Integer.parseInt(g.toString()));
        j.addView(view);
        return;
        if (i1 != g.ah || o == null) goto _L4; else goto _L5
_L5:
        o.a();
        return;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        Bundle bundle1 = getArguments();
        if (bundle1 != null)
        {
            m = (IGroupInfo)bundle1.getParcelable("globalGroupInfo");
            if (m != null && m.g())
            {
                CloudGroupInfo cloudgroupinfo = (CloudGroupInfo)m;
                if (!com.roidapp.baselib.c.n.a(getActivity(), cloudgroupinfo.c))
                {
                    m = null;
                }
            }
            if (bundle != null)
            {
                n = (IFilterInfo)bundle.getParcelable("globalFilterInfo");
            } else
            {
                n = (IFilterInfo)bundle1.getParcelable("globalFilterInfo");
            }
            r = new b(bundle1.getInt("global_image_property_lightness", 150), bundle1.getInt("global_image_property_contast", 100), bundle1.getInt("global_image_property_contast", 100), bundle1.getInt("global_image_property_hue", 180));
            a = bundle1.getString("current_image_path");
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(h.i, viewgroup, false);
        h = (TextView)layoutinflater.findViewById(g.G);
        h.setOnClickListener(this);
        h.setBackgroundResource(d.j);
        i = (TextView)layoutinflater.findViewById(g.I);
        i.setOnClickListener(this);
        ((ViewGroup)layoutinflater.findViewById(g.ah)).setOnClickListener(this);
        j = (ViewGroup)layoutinflater.findViewById(g.k);
        k = new az(getActivity(), this, false);
        k.setTag("imageFilterBaseView");
        if (m != null && (m instanceof LocalGroupInfo))
        {
            viewgroup = ((ab)k.z()).a(m.c());
            if (viewgroup != null)
            {
                viewgroup.a(m.a());
                m = viewgroup;
            }
            k.a(m);
        }
        l = new bg(getActivity(), this);
        l.a(true);
        l.setTag("imageFilterListView");
        l.a(k.A());
        if (m == null || (m instanceof CloudGroupInfo))
        {
            e();
        } else
        {
            a(m);
        }
        viewgroup = new a(layoutinflater.getContext());
        viewgroup.a(new t(this));
        viewgroup.a();
        viewgroup = new z(this, getActivity());
        viewgroup.addView(layoutinflater);
        return viewgroup;
    }

    public void onDestroy()
    {
        super.onDestroy();
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        b();
    }

    public void onResume()
    {
        boolean flag = false;
        super.onResume();
        if (j.getChildCount() != 0)
        {
            flag = j.getChildAt(0) instanceof bg;
        }
        if (flag)
        {
            Object obj = l.b();
            if (obj != null && (obj instanceof CloudGroupInfo))
            {
                obj = (CloudGroupInfo)obj;
                if (!com.roidapp.baselib.c.n.a(getActivity(), ((CloudGroupInfo) (obj)).c))
                {
                    k.a(null);
                    e();
                }
            }
        }
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("globalFilterInfo", s);
    }

}
