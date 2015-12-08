// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.template.c;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.roidapp.baselib.c.a;
import com.roidapp.baselib.c.an;
import com.roidapp.baselib.e.l;
import com.roidapp.cloudlib.ads.s;
import com.roidapp.cloudlib.al;
import com.roidapp.cloudlib.ar;
import com.roidapp.cloudlib.as;
import com.roidapp.cloudlib.at;
import com.roidapp.cloudlib.template.TemplateInfo;
import com.roidapp.cloudlib.template.a.b;
import com.roidapp.cloudlib.template.a.c;
import com.roidapp.cloudlib.template.a.d;
import com.roidapp.cloudlib.template.a.e;
import com.roidapp.cloudlib.template.j;
import java.lang.ref.WeakReference;

// Referenced classes of package com.roidapp.cloudlib.template.c:
//            c, a, g, h

public class f extends a
    implements android.view.View.OnClickListener
{

    protected e a;
    protected RecyclerView b;
    protected com.roidapp.cloudlib.template.b.a c;
    protected TextView d;
    protected Handler e;
    protected int f;
    protected int g;
    private boolean h;
    private int i;
    private boolean j;

    public f()
    {
    }

    public static f a(int k)
    {
        k;
        JVM INSTR tableswitch 2 3: default 24
    //                   2 39
    //                   3 50;
           goto _L1 _L2 _L3
_L1:
        Object obj = new f();
_L5:
        obj.i = k;
        return ((f) (obj));
_L2:
        obj = new com.roidapp.cloudlib.template.c.c();
        continue; /* Loop/switch isn't completed */
_L3:
        obj = new com.roidapp.cloudlib.template.c.a();
        if (true) goto _L5; else goto _L4
_L4:
    }

    protected static void a(Handler handler, int k, Object obj)
    {
        if (handler != null)
        {
            Message message = Message.obtain();
            message.what = k;
            message.obj = obj;
            handler.sendMessage(message);
        }
    }

    protected void a(View view)
    {
        b = (RecyclerView)view;
        b.a(new g(this));
        b.setPadding(g / 2, g, g / 2, 0);
        b.setClipToPadding(false);
        view = new StaggeredGridLayoutManager();
        b.a(view);
        b.a(a);
    }

    protected final void a(boolean flag)
    {
        super.a(flag);
        if (j) goto _L2; else goto _L1
_L1:
        if (!(a instanceof b)) goto _L4; else goto _L3
_L3:
        com.roidapp.baselib.c.b.d("TemplatePremiumPage");
_L6:
        j = true;
_L2:
        return;
_L4:
        if (a instanceof d)
        {
            com.roidapp.baselib.c.b.d("TemplateFreePage");
        } else
        if (a instanceof c)
        {
            com.roidapp.baselib.c.b.d("TemplateLocalPage");
        } else
        if (a instanceof com.roidapp.cloudlib.template.a.a)
        {
            com.roidapp.baselib.c.b.d("TemplateFavouritePage");
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void b(int k)
    {
        if (d != null)
        {
            d.setVisibility(k);
        }
    }

    public e c()
    {
        return a;
    }

    public final void c(int k)
    {
        if (b != null)
        {
            b.post(new h(this, k));
        }
    }

    public final int d()
    {
        return f;
    }

    public final void onAttach(Activity activity)
    {
        super.onAttach(activity);
        if (activity instanceof com.roidapp.cloudlib.template.b.a)
        {
            c = (com.roidapp.cloudlib.template.b.a)activity;
        }
    }

    public void onClick(View view)
    {
        int k = ((Integer)view.getTag()).intValue();
        if (view.getId() != ar.cA) goto _L2; else goto _L1
_L1:
        TemplateInfo templateinfo = a.e(k);
        if (templateinfo != null) goto _L4; else goto _L3
_L3:
        return;
_L4:
        com.roidapp.baselib.c.b.f("Click", templateinfo.i());
        if (com.roidapp.cloudlib.template.j.a().c(templateinfo))
        {
            a(e, 8996, templateinfo);
            return;
        }
        if (!h && templateinfo.q() && !com.roidapp.cloudlib.template.j.b(templateinfo.e()))
        {
            if (s.c())
            {
                c.a(templateinfo);
                return;
            }
            if (l.b(view.getContext()))
            {
                continue; /* Loop/switch isn't completed */
            }
            if (e != null)
            {
                e.sendEmptyMessage(9216);
                return;
            }
        } else
        {
            a(e, 8985, templateinfo);
            return;
        }
        continue; /* Loop/switch isn't completed */
        if (e == null) goto _L3; else goto _L5
_L5:
        c.b(true);
        view = Message.obtain();
        view.what = 9218;
        view.obj = templateinfo;
        e.sendMessageDelayed(view, 10000L);
        return;
_L2:
        if (view.getId() == ar.cF)
        {
            view = a.e(k);
            if (view != null && !com.roidapp.cloudlib.template.j.b().(view))
            {
                com.roidapp.cloudlib.template.j.b().(view.r());
                an.c(new WeakReference(getActivity()), getString(at.aR));
            } else
            {
                com.roidapp.cloudlib.template.j.b().(view);
            }
            a(e, 9217, null);
            return;
        }
        if (true) goto _L3; else goto _L6
_L6:
    }

    public final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        int k = getActivity().getResources().getDisplayMetrics().widthPixels;
        float f1 = getActivity().getResources().getDisplayMetrics().density;
        g = (int)((float)(int)((double)k * 0.16D) - f1 * 42F);
        f = k / 2 - (g * 3) / 2;
        e = c.b();
        h = al.g().d(getActivity());
        i;
        JVM INSTR tableswitch 0 3: default 128
    //                   0 155
    //                   1 139
    //                   2 168
    //                   3 181;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        throw new IllegalArgumentException("Unknown fragment type!");
_L3:
        bundle = new b(this, this);
_L7:
        a = bundle;
        return;
_L2:
        bundle = new d(this, this);
        continue; /* Loop/switch isn't completed */
_L4:
        bundle = new c(this, this);
        continue; /* Loop/switch isn't completed */
_L5:
        bundle = new com.roidapp.cloudlib.template.a.a(this, this);
        if (true) goto _L7; else goto _L6
_L6:
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(as.Y, viewgroup, false);
        b = (RecyclerView)layoutinflater.findViewById(ar.cD);
        d = (TextView)layoutinflater.findViewById(ar.cE);
        a(b);
        return layoutinflater;
    }

    public void onDestroy()
    {
        if (e != null)
        {
            ((com.roidapp.cloudlib.template.b.c)e).a();
            a(e, 8999, null);
            a(e, 8998, null);
        }
        if (a != null)
        {
            a.e();
            a = null;
        }
        super.onDestroy();
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        if (b != null)
        {
            b.a(null);
            b = null;
        }
    }
}
