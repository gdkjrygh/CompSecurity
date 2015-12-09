// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.b.m;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.maps.a.ae;
import com.google.android.gms.maps.a.cu;
import com.google.android.gms.maps.a.j;
import com.google.android.gms.maps.model.f;

// Referenced classes of package com.google.android.gms.maps:
//            GoogleMapOptions, l, i

class k
    implements ae
{

    private final Fragment a;
    private final j b;

    public k(Fragment fragment, j j1)
    {
        b = (j)u.a(j1);
        a = (Fragment)u.a(fragment);
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        try
        {
            layoutinflater = b.a(m.a(layoutinflater), m.a(viewgroup), bundle);
        }
        // Misplaced declaration of an exception variable
        catch (LayoutInflater layoutinflater)
        {
            throw new f(layoutinflater);
        }
        return (View)m.a(layoutinflater);
    }

    public void a()
    {
        try
        {
            b.b();
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new f(remoteexception);
        }
    }

    public void a(Activity activity, Bundle bundle, Bundle bundle1)
    {
        bundle = (GoogleMapOptions)bundle.getParcelable("MapOptions");
        try
        {
            b.a(m.a(activity), bundle, bundle1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            throw new f(activity);
        }
    }

    public void a(Bundle bundle)
    {
        Bundle bundle1;
        bundle1 = bundle;
        if (bundle != null)
        {
            break MISSING_BLOCK_LABEL_14;
        }
        bundle1 = new Bundle();
        bundle = a.h();
        if (bundle == null)
        {
            break MISSING_BLOCK_LABEL_47;
        }
        if (bundle.containsKey("MapOptions"))
        {
            cu.a(bundle1, "MapOptions", bundle.getParcelable("MapOptions"));
        }
        b.a(bundle1);
        return;
        bundle;
        throw new f(bundle);
    }

    public void a(i i)
    {
        try
        {
            b.a(new l(this, i));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (i i)
        {
            throw new f(i);
        }
    }

    public void b()
    {
        try
        {
            b.c();
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new f(remoteexception);
        }
    }

    public void b(Bundle bundle)
    {
        try
        {
            b.b(bundle);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw new f(bundle);
        }
    }

    public void c()
    {
        try
        {
            b.d();
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new f(remoteexception);
        }
    }

    public void d()
    {
        try
        {
            b.e();
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new f(remoteexception);
        }
    }

    public void e()
    {
        try
        {
            b.f();
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new f(remoteexception);
        }
    }

    public j f()
    {
        return b;
    }
}
