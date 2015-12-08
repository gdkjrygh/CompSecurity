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
import com.google.android.gms.maps.a.g;
import com.google.android.gms.maps.a.i;
import com.google.android.gms.maps.a.l;
import com.google.android.gms.maps.model.c;

// Referenced classes of package com.google.android.gms.maps:
//            StreetViewPanoramaView, f, g

static final class a
    implements l
{

    private final ViewGroup a;
    private final i b;
    private View c;

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        throw new UnsupportedOperationException("onCreateView not allowed on StreetViewPanoramaViewDelegate");
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
        throw new UnsupportedOperationException("onInflate not allowed on StreetViewPanoramaViewDelegate");
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

    public final void a(f f)
    {
        try
        {
            b.a(new com.google.android.gms.maps.a.ah.a(f) {

                final f a;
                final StreetViewPanoramaView.a b;

                public final void a(g g1)
                    throws RemoteException
                {
                    new com.google.android.gms.maps.g(g1);
                }

            
            {
                b = StreetViewPanoramaView.a.this;
                a = f;
                super();
            }
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (f f)
        {
            throw new c(f);
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
        throw new UnsupportedOperationException("onDestroyView not allowed on StreetViewPanoramaViewDelegate");
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

    public _cls1.a(ViewGroup viewgroup, i j)
    {
        b = (i)y.a(j);
        a = (ViewGroup)y.a(viewgroup);
    }
}
