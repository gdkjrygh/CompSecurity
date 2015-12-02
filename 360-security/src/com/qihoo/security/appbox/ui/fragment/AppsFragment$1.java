// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.appbox.ui.fragment;

import android.view.View;
import com.qihoo.security.appbox.b.c;
import com.qihoo.security.appbox.core.AppBoxResponse;
import com.qihoo.security.appbox.ui.view.FooterLoadingView;
import com.qihoo.security.appbox.ui.view.a;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.qihoo.security.appbox.ui.fragment:
//            AppsFragment

class a
    implements c
{

    final AppsFragment a;

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
            com.qihoo.security.appbox.ui.fragment.AppsFragment.a(a);
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
        a.k.setVisibility(8);
        a.o.getAndSet(false);
        a.v = appboxresponse.updateTime;
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
            com.qihoo.security.appbox.ui.fragment.AppsFragment.a(a);
            return;
        }
    }

    (AppsFragment appsfragment)
    {
        a = appsfragment;
        super();
    }
}
