// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.b.d;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.maps.a.b;
import com.google.android.gms.maps.a.e;
import com.google.android.gms.maps.a.k;
import com.google.android.gms.maps.model.c;

// Referenced classes of package com.google.android.gms.maps:
//            MapView, e, b

static final class .y.a
    implements k
{

    private final ViewGroup a;
    private final e b;
    private View c;

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        throw new UnsupportedOperationException("onCreateView not allowed on MapViewDelegate");
    }

    public final void a()
    {
        try
        {
            b.b();
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new c(remoteexception);
        }
    }

    public final void a(Activity activity, Bundle bundle, Bundle bundle1)
    {
        throw new UnsupportedOperationException("onInflate not allowed on MapViewDelegate");
    }

    public final void a(Bundle bundle)
    {
        try
        {
            b.a(bundle);
            c = (View)com.google.android.gms.b.d.a(b.f());
            a.removeAllViews();
            a.addView(c);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw new c(bundle);
        }
    }

    public final void a(com.google.android.gms.maps.e e1)
    {
        try
        {
            b.a(new com.google.android.gms.maps.a.x.a(e1) {

                final com.google.android.gms.maps.e a;
                final MapView.a b;

                public final void a(b b1)
                    throws RemoteException
                {
                    a.onMapReady(new com.google.android.gms.maps.b(b1));
                }

            
            {
                b = MapView.a.this;
                a = e1;
                super();
            }
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.maps.e e1)
        {
            throw new c(e1);
        }
    }

    public final void b()
    {
        try
        {
            b.c();
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new c(remoteexception);
        }
    }

    public final void b(Bundle bundle)
    {
        try
        {
            b.b(bundle);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw new c(bundle);
        }
    }

    public final void c()
    {
        throw new UnsupportedOperationException("onDestroyView not allowed on MapViewDelegate");
    }

    public final void d()
    {
        try
        {
            b.d();
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new c(remoteexception);
        }
    }

    public final void e()
    {
        try
        {
            b.e();
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new c(remoteexception);
        }
    }

    public t>(ViewGroup viewgroup, e e1)
    {
        b = (e)y.a(e1);
        a = (ViewGroup)y.a(viewgroup);
    }
}
