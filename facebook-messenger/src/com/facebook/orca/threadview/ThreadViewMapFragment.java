// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadview;

import android.app.Activity;
import android.app.LocalActivityManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.p;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import com.facebook.orca.threads.ThreadSummary;
import com.google.common.a.es;

// Referenced classes of package com.facebook.orca.threadview:
//            cw, cq

public class ThreadViewMapFragment extends Fragment
{

    private LocalActivityManager a;
    private cq b;
    private FrameLayout c;
    private boolean d;
    private ThreadSummary e;
    private es f;

    public ThreadViewMapFragment()
    {
    }

    private void a()
    {
        if (!d && cw.a())
        {
            Object obj = cw.b();
            obj = (new Intent()).setClass(n(), ((Class) (obj)));
            obj = a.startActivity("map", ((Intent) (obj)));
            b = (cq)a.getActivity("map");
            c.addView(((Window) (obj)).getDecorView());
            d = true;
            if (e != null && f != null)
            {
                b.a(e, f);
                return;
            }
        }
    }

    public void A()
    {
        super.A();
        if (!w())
        {
            a();
            a.dispatchResume();
        }
    }

    public void B()
    {
        super.B();
        if (!w())
        {
            a.dispatchPause(m().f());
        }
    }

    public void C()
    {
        super.C();
        a.dispatchDestroy(m().f());
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        c = new FrameLayout(n());
        return c;
    }

    public void a(Bundle bundle)
    {
        super.a(bundle);
        a = new LocalActivityManager((Activity)n(), false);
        a.dispatchCreate(bundle);
    }

    void a(ThreadSummary threadsummary, es es)
    {
        e = threadsummary;
        f = es;
        if (b != null)
        {
            b.a(threadsummary, es);
        }
    }

    public void c(boolean flag)
    {
label0:
        {
            if (u())
            {
                if (!flag)
                {
                    break label0;
                }
                a.dispatchPause(false);
            }
            return;
        }
        a();
        a.dispatchResume();
    }

    public void g()
    {
        super.g();
        a.dispatchStop();
    }
}
