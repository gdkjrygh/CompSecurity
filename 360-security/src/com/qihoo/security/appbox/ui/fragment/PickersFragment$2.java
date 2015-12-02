// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.appbox.ui.fragment;

import android.view.View;
import com.qihoo.security.appbox.b.c;
import com.qihoo.security.appbox.core.AppBoxResponse;
import com.qihoo.security.appbox.core.a;
import com.qihoo.security.appbox.ui.view.FooterLoadingView;
import com.qihoo.security.support.b;
import com.qihoo360.mobilesafe.share.SharedPref;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.qihoo.security.appbox.ui.fragment:
//            PickersFragment

class a
    implements c
{

    final PickersFragment a;

    public void a()
    {
        if (a.getActivity() == null)
        {
            return;
        } else
        {
            a.o.getAndSet(true);
            a.k.setVisibility(0);
            return;
        }
    }

    public void a(int i, String s)
    {
        if (a.getActivity() != null)
        {
            a.o.getAndSet(false);
            a.f();
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
        if (a.getActivity() != null && appboxresponse != null && appboxresponse.appItems != null)
        {
            a.k.setVisibility(8);
            a.o.getAndSet(false);
            if (appboxresponse.end_state == 1)
            {
                a.n.getAndSet(true);
                a.m.a();
            }
            if (com.qihoo.security.appbox.ui.fragment.PickersFragment.a(a) != null)
            {
                if (com.qihoo.security.appbox.ui.fragment.PickersFragment.a(a).size() == 0)
                {
                    com.qihoo.security.support.b.c(26002);
                } else
                if (com.qihoo.security.appbox.ui.fragment.PickersFragment.a(a).size() == 1)
                {
                    com.qihoo.security.support.b.c(26003);
                } else
                if (com.qihoo.security.appbox.ui.fragment.PickersFragment.a(a).size() == 2)
                {
                    com.qihoo.security.support.b.c(26004);
                }
            }
            long l;
            if (com.qihoo.security.appbox.ui.fragment.PickersFragment.a(a) != null && com.qihoo.security.appbox.ui.fragment.PickersFragment.a(a).size() != 0)
            {
                int i = com.qihoo.security.appbox.core.a.a().c();
                if (i != -1)
                {
                    com.qihoo.security.appbox.ui.fragment.PickersFragment.b(a, new ArrayList());
                    com.qihoo.security.appbox.ui.fragment.PickersFragment.b(a).addAll(appboxresponse.appItems);
                    i = Math.min(appboxresponse.appItems.size(), i);
                    com.qihoo.security.appbox.core.c c1;
                    for (appboxresponse = com.qihoo.security.appbox.ui.fragment.PickersFragment.a(a).iterator(); appboxresponse.hasNext(); com.qihoo.security.appbox.ui.fragment.PickersFragment.b(a).add(i, c1))
                    {
                        c1 = (com.qihoo.security.appbox.core.c)appboxresponse.next();
                    }

                }
                a.i.a(com.qihoo.security.appbox.ui.fragment.PickersFragment.b(a));
            } else
            {
                a.i.a(appboxresponse.appItems);
            }
            l = SharedPref.b(a.r, "click_home_appbox_timestamp", 0L);
            if (l != 0L)
            {
                com.qihoo.security.support.b.b(26010, System.currentTimeMillis() - l);
                SharedPref.a(a.r, "click_home_appbox_timestamp", 0L);
                return;
            }
        }
    }

    public void b()
    {
        if (a.getActivity() == null)
        {
            return;
        } else
        {
            a.o.getAndSet(false);
            a.f();
            return;
        }
    }

    (PickersFragment pickersfragment)
    {
        a = pickersfragment;
        super();
    }
}
