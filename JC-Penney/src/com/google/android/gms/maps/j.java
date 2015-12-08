// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.v4.app.Fragment;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.maps.a.d;
import com.google.android.gms.maps.model.f;

// Referenced classes of package com.google.android.gms.maps:
//            m, k, GoogleMapOptions, c

public class j extends Fragment
{

    private final m a = new m(this);
    private c b;

    public j()
    {
    }

    public static j a(GoogleMapOptions googlemapoptions)
    {
        j j1 = new j();
        Bundle bundle = new Bundle();
        bundle.putParcelable("MapOptions", googlemapoptions);
        j1.g(bundle);
        return j1;
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = a.a(layoutinflater, viewgroup, bundle);
        layoutinflater.setClickable(true);
        return layoutinflater;
    }

    protected com.google.android.gms.maps.a.j a()
    {
        a.g();
        if (a.a() == null)
        {
            return null;
        } else
        {
            return ((k)a.a()).f();
        }
    }

    public void a(Activity activity)
    {
        super.a(activity);
        m.a(a, activity);
    }

    public void a(Activity activity, AttributeSet attributeset, Bundle bundle)
    {
        super.a(activity, attributeset, bundle);
        m.a(a, activity);
        attributeset = GoogleMapOptions.a(activity, attributeset);
        Bundle bundle1 = new Bundle();
        bundle1.putParcelable("MapOptions", attributeset);
        a.a(activity, bundle1, bundle);
    }

    public void a(Bundle bundle)
    {
        super.a(bundle);
        a.a(bundle);
    }

    public final c b()
    {
        Object obj = a();
        if (obj != null)
        {
            try
            {
                obj = ((com.google.android.gms.maps.a.j) (obj)).a();
            }
            catch (RemoteException remoteexception)
            {
                throw new f(remoteexception);
            }
            if (obj != null)
            {
                if (b == null || b.a().asBinder() != ((d) (obj)).asBinder())
                {
                    b = new c(((d) (obj)));
                }
                return b;
            }
        }
        return null;
    }

    public void d(Bundle bundle)
    {
        if (bundle != null)
        {
            bundle.setClassLoader(com/google/android/gms/maps/j.getClassLoader());
        }
        super.d(bundle);
    }

    public void e(Bundle bundle)
    {
        if (bundle != null)
        {
            bundle.setClassLoader(com/google/android/gms/maps/j.getClassLoader());
        }
        super.e(bundle);
        a.b(bundle);
    }

    public void f()
    {
        a.d();
        super.f();
    }

    public void f_()
    {
        super.f_();
        a.b();
    }

    public void g(Bundle bundle)
    {
        super.g(bundle);
    }

    public void g_()
    {
        a.c();
        super.g_();
    }

    public void onLowMemory()
    {
        a.f();
        super.onLowMemory();
    }

    public void u()
    {
        a.e();
        super.u();
    }
}
