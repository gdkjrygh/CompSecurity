// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.base.fragment;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ad;
import android.support.v4.app.q;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.debug.log.b;
import com.facebook.i;
import com.facebook.k;

// Referenced classes of package com.facebook.base.fragment:
//            b, d, c

public class NavigableFragmentController extends Fragment
    implements com.facebook.base.fragment.b
{

    private static final Class a = com/facebook/base/fragment/NavigableFragmentController;
    private Fragment b;
    private final c c = new d(this);
    private c d;

    public NavigableFragmentController()
    {
    }

    static void a(NavigableFragmentController navigablefragmentcontroller, com.facebook.base.fragment.b b1, Intent intent)
    {
        navigablefragmentcontroller.a(b1, intent);
    }

    private void a(com.facebook.base.fragment.b b1, Intent intent)
    {
        boolean flag1 = false;
        if (b1 != null)
        {
            com.facebook.debug.log.b.b(a, "Finished fragment '%s' with %s", new Object[] {
                b1.getClass().getName(), intent
            });
        } else
        {
            com.facebook.debug.log.b.b(a, "Starting Navigable Fragment Controller");
        }
        if (q().c())
        {
            if ("com.facebook.fragment.FRAGMENT_ACTION".equals(intent.getAction()))
            {
                b1 = intent.getComponent().getClassName();
                com.facebook.debug.log.b.b(a, (new StringBuilder()).append("Navigating to ").append(b1).toString());
                if (b1 != null)
                {
                    Bundle bundle = intent.getExtras();
                    boolean flag;
                    if (bundle == null)
                    {
                        flag = false;
                    } else
                    {
                        flag = bundle.getBoolean("com.facebook.fragment.PUSH_BACK_STACK", false);
                    }
                    if (bundle != null)
                    {
                        flag1 = bundle.getBoolean("com.facebook.fragment.CLEAR_BACK_STACK", false);
                    }
                    intent.removeExtra("com.facebook.fragment.PUSH_BACK_STACK");
                    intent.removeExtra("com.facebook.fragment.CLEAR_BACK_STACK");
                    a(((String) (b1)), intent.getExtras(), flag, flag1);
                    return;
                }
            } else
            {
                d.a(this, intent);
                return;
            }
        }
    }

    private void a(String s, Bundle bundle, boolean flag, boolean flag1)
    {
        com.facebook.debug.log.b.c(a, (new StringBuilder()).append("Starting controlled fragment ").append(s).toString());
        b = Fragment.a(n(), s, bundle);
        ((com.facebook.base.fragment.b)b).a(c);
        if (flag1)
        {
            q().a(null, 1);
        }
        s = q().a().a(i.login_fragment_controller_host, b);
        if (flag)
        {
            s.a(null);
        }
        s.a();
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(k.login_fragment_controller, viewgroup, false);
    }

    public void a(Bundle bundle)
    {
        super.a(bundle);
        if (bundle != null)
        {
            b = q().a(i.login_fragment_controller_host);
        }
    }

    public void a(Fragment fragment)
    {
        super.a(fragment);
        if (fragment instanceof com.facebook.base.fragment.b)
        {
            ((com.facebook.base.fragment.b)fragment).a(c);
        }
    }

    public void a(c c1)
    {
        d = c1;
    }

    public void b(Intent intent)
    {
        a(null, intent);
    }

    public boolean c()
    {
        return b != null;
    }

}
