// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate;
import com.google.android.gms.maps.model.RuntimeRemoteException;

// Referenced classes of package com.google.android.gms.maps:
//            StreetViewPanorama

public class StreetViewPanoramaView extends FrameLayout
{

    private final zzb a;
    private StreetViewPanorama b;

    public final StreetViewPanorama getStreetViewPanorama()
    {
        if (b != null)
        {
            return b;
        }
        a.i();
        if (a.a() == null)
        {
            return null;
        }
        try
        {
            b = new StreetViewPanorama(((zza)a.a()).h().a());
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return b;
    }

    private class zzb extends com.google.android.gms.dynamic.zza
    {

        protected zzf a;
        private final ViewGroup b;
        private final Context c;
        private final StreetViewPanoramaOptions d;
        private final List e;

        protected void a(zzf zzf1)
        {
            a = zzf1;
            i();
        }

        public void i()
        {
            if (a == null || a() != null)
            {
                break MISSING_BLOCK_LABEL_121;
            }
            try
            {
                IStreetViewPanoramaViewDelegate istreetviewpanoramaviewdelegate = zzy.a(c).a(zze.a(c), d);
                a.a(new zza(b, istreetviewpanoramaviewdelegate));
                OnStreetViewPanoramaReadyCallback onstreetviewpanoramareadycallback;
                for (Iterator iterator = e.iterator(); iterator.hasNext(); ((zza)a()).a(onstreetviewpanoramareadycallback))
                {
                    onstreetviewpanoramareadycallback = (OnStreetViewPanoramaReadyCallback)iterator.next();
                }

            }
            catch (RemoteException remoteexception)
            {
                throw new RuntimeRemoteException(remoteexception);
            }
            catch (GooglePlayServicesNotAvailableException googleplayservicesnotavailableexception)
            {
                return;
            }
            e.clear();
        }
    }


    private class zza
        implements StreetViewLifecycleDelegate
    {

        private final ViewGroup a;
        private final IStreetViewPanoramaViewDelegate b;
        private View c;

        public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
        {
            throw new UnsupportedOperationException("onCreateView not allowed on StreetViewPanoramaViewDelegate");
        }

        public void a()
        {
        }

        public void a(Activity activity, Bundle bundle, Bundle bundle1)
        {
            throw new UnsupportedOperationException("onInflate not allowed on StreetViewPanoramaViewDelegate");
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

        public void a(OnStreetViewPanoramaReadyCallback onstreetviewpanoramareadycallback)
        {
            try
            {
                b.a(new com.google.android.gms.maps.internal.zzv.zza(onstreetviewpanoramareadycallback) {

                    final OnStreetViewPanoramaReadyCallback a;
                    final zza b;

                    public void a(IStreetViewPanoramaDelegate istreetviewpanoramadelegate)
                    {
                        a.a(new StreetViewPanorama(istreetviewpanoramadelegate));
                    }

                
                {
                    b = zza.this;
                    a = onstreetviewpanoramareadycallback;
                    super();
                }
                });
                return;
            }
            // Misplaced declaration of an exception variable
            catch (OnStreetViewPanoramaReadyCallback onstreetviewpanoramareadycallback)
            {
                throw new RuntimeRemoteException(onstreetviewpanoramareadycallback);
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
            throw new UnsupportedOperationException("onDestroyView not allowed on StreetViewPanoramaViewDelegate");
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

        public IStreetViewPanoramaViewDelegate h()
        {
            return b;
        }

        public zza(ViewGroup viewgroup, IStreetViewPanoramaViewDelegate istreetviewpanoramaviewdelegate)
        {
            b = (IStreetViewPanoramaViewDelegate)zzu.a(istreetviewpanoramaviewdelegate);
            a = (ViewGroup)zzu.a(viewgroup);
        }
    }

}
