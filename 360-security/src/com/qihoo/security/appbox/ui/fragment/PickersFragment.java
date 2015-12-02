// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.appbox.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
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
//            BaseAppBoxFragment

public class PickersFragment extends BaseAppBoxFragment
{

    private final c A = new c() {

        final PickersFragment a;

        public void a()
        {
        }

        public void a(int i, String s)
        {
            Toast.makeText(a.r, "message", 0).show();
        }

        public void a(AppBoxResponse appboxresponse)
        {
            while (a.getActivity() == null || appboxresponse.faceBookItems == null) 
            {
                return;
            }
            com.qihoo.security.appbox.ui.fragment.PickersFragment.a(a, appboxresponse.faceBookItems);
        }

        public void b()
        {
        }

            
            {
                a = PickersFragment.this;
                super();
            }
    };
    private final c B = new c() {

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

            
            {
                a = PickersFragment.this;
                super();
            }
    };
    private ArrayList y;
    private ArrayList z;

    public PickersFragment()
    {
    }

    static ArrayList a(PickersFragment pickersfragment)
    {
        return pickersfragment.y;
    }

    static ArrayList a(PickersFragment pickersfragment, ArrayList arraylist)
    {
        pickersfragment.y = arraylist;
        return arraylist;
    }

    static ArrayList b(PickersFragment pickersfragment)
    {
        return pickersfragment.z;
    }

    static ArrayList b(PickersFragment pickersfragment, ArrayList arraylist)
    {
        pickersfragment.z = arraylist;
        return arraylist;
    }

    protected void b()
    {
        super.b();
        com.qihoo.security.appbox.core.a.a().a(r, B);
    }

    protected void e()
    {
        com.qihoo.security.appbox.core.a.a().a(com.qihoo.security.appbox.core.a.a().a("3"), "3", A);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        a("0");
        x = 100L;
        return super.onCreateView(layoutinflater, viewgroup, bundle);
    }

    public void onDestroy()
    {
        super.onDestroy();
        com.qihoo.security.appbox.c.b.a.a("appbox");
    }
}
