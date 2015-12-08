// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.os.Bundle;
import android.support.v4.app.ac;
import android.support.v4.app.aj;
import com.google.android.gms.common.d;
import com.google.android.gms.maps.c;
import com.google.android.gms.maps.j;
import com.google.android.gms.maps.n;
import com.jcp.adapters.bf;
import com.jcp.h.g;
import java.util.List;

// Referenced classes of package com.jcp.fragments:
//            gh

public class gs extends j
{

    private List a;
    private c b;

    public gs()
    {
    }

    final void O()
    {
        b = b();
        if (b == null)
        {
            int i = com.google.android.gms.common.d.a(i());
            if (i != 0)
            {
                com.google.android.gms.common.d.a(i, i(), 0);
            }
        }
    }

    public void a(List list)
    {
        a = list;
        if (i() != null && a != null)
        {
            new bf(i(), this, b, a);
            if (b != null)
            {
                b.b();
                (new com.jcp.a.c(a, this, i(), b)).execute(new Void[0]);
            }
        }
    }

    public void b(int i)
    {
        android.support.v4.app.Fragment fragment = i().f().a("StoreListFragment");
        if (fragment != null && (fragment instanceof gh))
        {
            ((gh)fragment).b(i);
        }
    }

    public void d(Bundle bundle)
    {
        if (bundle != null && bundle.containsKey("arrayStoreList"))
        {
            bundle.remove("arrayStoreList");
        }
        super.d(bundle);
        O();
        bundle = h();
        if (bundle != null)
        {
            a = bundle.getParcelableArrayList("arrayStoreList");
            if (a != null)
            {
                new bf(i(), this, b, a);
                if (b != null)
                {
                    b.c().a(false);
                    (new com.jcp.a.c(a, this, i(), b)).execute(new Void[0]);
                }
            }
        }
        if (bundle != null && bundle.containsKey("arrayStoreList"))
        {
            bundle.remove("arrayStoreList");
        }
    }

    public void f_()
    {
        super.f_();
        g.a("STORELISTMAP", null);
    }
}
