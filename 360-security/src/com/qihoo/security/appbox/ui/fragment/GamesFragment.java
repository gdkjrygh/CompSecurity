// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.appbox.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.qihoo.security.appbox.b.c;
import com.qihoo.security.appbox.core.AppBoxResponse;
import com.qihoo.security.appbox.core.a;
import com.qihoo.security.appbox.ui.view.FooterLoadingView;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.qihoo.security.appbox.ui.fragment:
//            BaseAppBoxFragment

public class GamesFragment extends BaseAppBoxFragment
{

    private final c y = new c() {

        final GamesFragment a;

        public void a()
        {
            if (a.getActivity() != null)
            {
                a.o.getAndSet(true);
                if (a.u == 0)
                {
                    a.k.setVisibility(0);
                    return;
                }
            }
        }

        public void a(int i, String s)
        {
            if (a.getActivity() != null)
            {
                com.qihoo.security.appbox.ui.fragment.GamesFragment.a(a);
                if (40102 == i)
                {
                    a.n.getAndSet(true);
                    a.m.a();
                    return;
                }
            }
        }

        public void a(AppBoxResponse appboxresponse)
        {
            if (a.getActivity() == null)
            {
                return;
            }
            a.v = appboxresponse.updateTime;
            a.k.setVisibility(8);
            a.o.getAndSet(false);
            if (appboxresponse.appItems == null || appboxresponse.appItems.size() == 0)
            {
                a.f();
                return;
            }
            if (appboxresponse.end_state == 1)
            {
                a.n.getAndSet(true);
                a.m.a();
            }
            a.i.a(appboxresponse.appItems);
            a.u = appboxresponse.appItems.size();
        }

        public void b()
        {
            if (a.getActivity() == null)
            {
                return;
            } else
            {
                com.qihoo.security.appbox.ui.fragment.GamesFragment.a(a);
                return;
            }
        }

            
            {
                a = GamesFragment.this;
                super();
            }
    };

    public GamesFragment()
    {
    }

    static void a(GamesFragment gamesfragment)
    {
        gamesfragment.h();
    }

    private void h()
    {
        k.setVisibility(8);
        o.getAndSet(false);
        if (u == 0)
        {
            f();
            return;
        } else
        {
            p.set(true);
            m.c();
            return;
        }
    }

    protected void b()
    {
        super.b();
        com.qihoo.security.appbox.core.a.a().a(r, y, t, u, q);
    }

    protected void c()
    {
        com.qihoo.security.appbox.core.a.a().a(true, r, t, u, q, v, y);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        a("2");
        x = 1500L;
        return super.onCreateView(layoutinflater, viewgroup, bundle);
    }

    public void onDestroy()
    {
        super.onDestroy();
        com.qihoo.security.appbox.c.b.a.a("2");
    }
}
