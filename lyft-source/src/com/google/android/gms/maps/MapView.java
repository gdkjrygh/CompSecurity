// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.dynamic.zza;
import com.google.android.gms.maps.internal.IMapViewDelegate;
import com.google.android.gms.maps.model.RuntimeRemoteException;

// Referenced classes of package com.google.android.gms.maps:
//            GoogleMapOptions, GoogleMap, OnMapReadyCallback

public class MapView extends FrameLayout
{

    private GoogleMap zzaBV;
    private final zzb zzaCb;

    public MapView(Context context)
    {
        super(context);
        zzaCb = new zzb(this, context, null);
        init();
    }

    public MapView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        zzaCb = new zzb(this, context, GoogleMapOptions.a(context, attributeset));
        init();
    }

    public MapView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        zzaCb = new zzb(this, context, GoogleMapOptions.a(context, attributeset));
        init();
    }

    public MapView(Context context, GoogleMapOptions googlemapoptions)
    {
        super(context);
        zzaCb = new zzb(this, context, googlemapoptions);
        init();
    }

    private void init()
    {
        setClickable(true);
    }

    public final GoogleMap getMap()
    {
        if (zzaBV != null)
        {
            return zzaBV;
        }
        zzaCb.i();
        if (zzaCb.a() == null)
        {
            return null;
        }
        try
        {
            zzaBV = new GoogleMap(((zza)zzaCb.a()).h().a());
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return zzaBV;
    }

    public void getMapAsync(OnMapReadyCallback onmapreadycallback)
    {
        zzu.b("getMapAsync() must be called on the main thread");
        zzaCb.a(onmapreadycallback);
    }

    public final void onCreate(Bundle bundle)
    {
        zzaCb.a(bundle);
        if (zzaCb.a() == null)
        {
            com.google.android.gms.dynamic.zza.b(this);
        }
    }

    public final void onDestroy()
    {
        zzaCb.g();
    }

    public final void onLowMemory()
    {
        zzaCb.h();
    }

    public final void onPause()
    {
        zzaCb.d();
    }

    public final void onResume()
    {
        zzaCb.c();
    }

    public final void onSaveInstanceState(Bundle bundle)
    {
        zzaCb.b(bundle);
    }

    private class zzb extends com.google.android.gms.dynamic.zza
    {

        protected zzf a;
        private final ViewGroup b;
        private final Context c;
        private final GoogleMapOptions d;
        private final List e = new ArrayList();

        protected void a(zzf zzf1)
        {
            a = zzf1;
            i();
        }

        public void a(OnMapReadyCallback onmapreadycallback)
        {
            if (a() != null)
            {
                ((zza)a()).a(onmapreadycallback);
                return;
            } else
            {
                e.add(onmapreadycallback);
                return;
            }
        }

        public void i()
        {
            if (a == null || a() != null)
            {
                break MISSING_BLOCK_LABEL_136;
            }
            IMapViewDelegate imapviewdelegate;
            MapsInitializer.a(c);
            imapviewdelegate = zzy.a(c).a(zze.a(c), d);
            if (imapviewdelegate == null)
            {
                return;
            }
            RemoteException remoteexception;
            a.a(new zza(b, imapviewdelegate));
            OnMapReadyCallback onmapreadycallback;
            for (Iterator iterator = e.iterator(); iterator.hasNext(); ((zza)a()).a(onmapreadycallback))
            {
                onmapreadycallback = (OnMapReadyCallback)iterator.next();
            }

            try
            {
                e.clear();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (RemoteException remoteexception)
            {
                throw new RuntimeRemoteException(remoteexception);
            }
            catch (GooglePlayServicesNotAvailableException googleplayservicesnotavailableexception) { }
        }

        zzb(ViewGroup viewgroup, Context context, GoogleMapOptions googlemapoptions)
        {
            b = viewgroup;
            c = context;
            d = googlemapoptions;
        }
    }


    private class zza
        implements MapLifecycleDelegate
    {

        private final ViewGroup a;
        private final IMapViewDelegate b;
        private View c;

        public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
        {
            throw new UnsupportedOperationException("onCreateView not allowed on MapViewDelegate");
        }

        public void a()
        {
        }

        public void a(Activity activity, Bundle bundle, Bundle bundle1)
        {
            throw new UnsupportedOperationException("onInflate not allowed on MapViewDelegate");
        }

        public void a(Bundle bundle)
        {
            try
            {
                b.a(bundle);
                c = (View)zze.a(b.f());
                a.removeAllViews();
                a.addView(c);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle)
            {
                throw new RuntimeRemoteException(bundle);
            }
        }

        public void a(OnMapReadyCallback onmapreadycallback)
        {
            try
            {
                b.a(new com.google.android.gms.maps.internal.zzm.zza(onmapreadycallback) {

                    final OnMapReadyCallback a;
                    final zza b;

                    public void a(IGoogleMapDelegate igooglemapdelegate)
                    {
                        a.onMapReady(new GoogleMap(igooglemapdelegate));
                    }

                
                {
                    b = zza.this;
                    a = onmapreadycallback;
                    super();
                }
                });
                return;
            }
            // Misplaced declaration of an exception variable
            catch (OnMapReadyCallback onmapreadycallback)
            {
                throw new RuntimeRemoteException(onmapreadycallback);
            }
        }

        public void b()
        {
            try
            {
                b.b();
                return;
            }
            catch (RemoteException remoteexception)
            {
                throw new RuntimeRemoteException(remoteexception);
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
                throw new RuntimeRemoteException(bundle);
            }
        }

        public void c()
        {
            try
            {
                b.c();
                return;
            }
            catch (RemoteException remoteexception)
            {
                throw new RuntimeRemoteException(remoteexception);
            }
        }

        public void d()
        {
        }

        public void e()
        {
            throw new UnsupportedOperationException("onDestroyView not allowed on MapViewDelegate");
        }

        public void f()
        {
            try
            {
                b.d();
                return;
            }
            catch (RemoteException remoteexception)
            {
                throw new RuntimeRemoteException(remoteexception);
            }
        }

        public void g()
        {
            try
            {
                b.e();
                return;
            }
            catch (RemoteException remoteexception)
            {
                throw new RuntimeRemoteException(remoteexception);
            }
        }

        public IMapViewDelegate h()
        {
            return b;
        }

        public zza(ViewGroup viewgroup, IMapViewDelegate imapviewdelegate)
        {
            b = (IMapViewDelegate)zzu.a(imapviewdelegate);
            a = (ViewGroup)zzu.a(viewgroup);
        }
    }

}
