// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamic.e;
import com.google.android.gms.dynamic.f;
import com.google.android.gms.internal.jx;
import com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate;
import com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate;
import com.google.android.gms.maps.internal.StreetViewLifecycleDelegate;
import com.google.android.gms.maps.internal.c;
import com.google.android.gms.maps.internal.x;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.maps:
//            StreetViewPanorama, StreetViewPanoramaOptions, OnStreetViewPanoramaReadyCallback

public class StreetViewPanoramaView extends FrameLayout
{
    static class a
        implements StreetViewLifecycleDelegate
    {

        private final ViewGroup akZ;
        private View alA;
        private final IStreetViewPanoramaViewDelegate alz;

        public void getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback onstreetviewpanoramareadycallback)
        {
            try
            {
                alz.getStreetViewPanoramaAsync(new com.google.android.gms.maps.internal.u.a(this, onstreetviewpanoramareadycallback) {

                    final a alB;
                    final OnStreetViewPanoramaReadyCallback alo;

                    public void a(IStreetViewPanoramaDelegate istreetviewpanoramadelegate)
                        throws RemoteException
                    {
                        alo.onStreetViewPanoramaReady(new StreetViewPanorama(istreetviewpanoramadelegate));
                    }

            
            {
                alB = a1;
                alo = onstreetviewpanoramareadycallback;
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

        public IStreetViewPanoramaViewDelegate nV()
        {
            return alz;
        }

        public void onCreate(Bundle bundle)
        {
            try
            {
                alz.onCreate(bundle);
                alA = (View)e.f(alz.getView());
                akZ.removeAllViews();
                akZ.addView(alA);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle)
            {
                throw new RuntimeRemoteException(bundle);
            }
        }

        public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
        {
            throw new UnsupportedOperationException("onCreateView not allowed on StreetViewPanoramaViewDelegate");
        }

        public void onDestroy()
        {
            try
            {
                alz.onDestroy();
                return;
            }
            catch (RemoteException remoteexception)
            {
                throw new RuntimeRemoteException(remoteexception);
            }
        }

        public void onDestroyView()
        {
            throw new UnsupportedOperationException("onDestroyView not allowed on StreetViewPanoramaViewDelegate");
        }

        public void onInflate(Activity activity, Bundle bundle, Bundle bundle1)
        {
            throw new UnsupportedOperationException("onInflate not allowed on StreetViewPanoramaViewDelegate");
        }

        public void onLowMemory()
        {
            try
            {
                alz.onLowMemory();
                return;
            }
            catch (RemoteException remoteexception)
            {
                throw new RuntimeRemoteException(remoteexception);
            }
        }

        public void onPause()
        {
            try
            {
                alz.onPause();
                return;
            }
            catch (RemoteException remoteexception)
            {
                throw new RuntimeRemoteException(remoteexception);
            }
        }

        public void onResume()
        {
            try
            {
                alz.onResume();
                return;
            }
            catch (RemoteException remoteexception)
            {
                throw new RuntimeRemoteException(remoteexception);
            }
        }

        public void onSaveInstanceState(Bundle bundle)
        {
            try
            {
                alz.onSaveInstanceState(bundle);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle)
            {
                throw new RuntimeRemoteException(bundle);
            }
        }

        public void onStart()
        {
        }

        public void onStop()
        {
        }

        public a(ViewGroup viewgroup, IStreetViewPanoramaViewDelegate istreetviewpanoramaviewdelegate)
        {
            alz = (IStreetViewPanoramaViewDelegate)jx.i(istreetviewpanoramaviewdelegate);
            akZ = (ViewGroup)jx.i(viewgroup);
        }
    }

    static class b extends com.google.android.gms.dynamic.a
    {

        protected f akW;
        private final StreetViewPanoramaOptions alC;
        private final ViewGroup ald;
        private final List alq = new ArrayList();
        private final Context mContext;

        protected void a(f f1)
        {
            akW = f1;
            nO();
        }

        public void getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback onstreetviewpanoramareadycallback)
        {
            if (je() != null)
            {
                ((a)je()).getStreetViewPanoramaAsync(onstreetviewpanoramareadycallback);
                return;
            } else
            {
                alq.add(onstreetviewpanoramareadycallback);
                return;
            }
        }

        public void nO()
        {
            if (akW == null || je() != null)
            {
                break MISSING_BLOCK_LABEL_121;
            }
            try
            {
                IStreetViewPanoramaViewDelegate istreetviewpanoramaviewdelegate = x.S(mContext).a(e.k(mContext), alC);
                akW.a(new a(ald, istreetviewpanoramaviewdelegate));
                OnStreetViewPanoramaReadyCallback onstreetviewpanoramareadycallback;
                for (Iterator iterator = alq.iterator(); iterator.hasNext(); ((a)je()).getStreetViewPanoramaAsync(onstreetviewpanoramareadycallback))
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
            alq.clear();
        }

        b(ViewGroup viewgroup, Context context, StreetViewPanoramaOptions streetviewpanoramaoptions)
        {
            ald = viewgroup;
            mContext = context;
            alC = streetviewpanoramaoptions;
        }
    }


    private StreetViewPanorama alm;
    private final b aly;

    public StreetViewPanoramaView(Context context)
    {
        super(context);
        aly = new b(this, context, null);
    }

    public StreetViewPanoramaView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        aly = new b(this, context, null);
    }

    public StreetViewPanoramaView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        aly = new b(this, context, null);
    }

    public StreetViewPanoramaView(Context context, StreetViewPanoramaOptions streetviewpanoramaoptions)
    {
        super(context);
        aly = new b(this, context, streetviewpanoramaoptions);
    }

    public final StreetViewPanorama getStreetViewPanorama()
    {
        if (alm != null)
        {
            return alm;
        }
        aly.nO();
        if (aly.je() == null)
        {
            return null;
        }
        try
        {
            alm = new StreetViewPanorama(((a)aly.je()).nV().getStreetViewPanorama());
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return alm;
    }

    public void getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback onstreetviewpanoramareadycallback)
    {
        jx.aU("getStreetViewPanoramaAsync() must be called on the main thread");
        aly.getStreetViewPanoramaAsync(onstreetviewpanoramareadycallback);
    }

    public final void onCreate(Bundle bundle)
    {
        aly.onCreate(bundle);
        if (aly.je() == null)
        {
            com.google.android.gms.dynamic.a.b(this);
        }
    }

    public final void onDestroy()
    {
        aly.onDestroy();
    }

    public final void onLowMemory()
    {
        aly.onLowMemory();
    }

    public final void onPause()
    {
        aly.onPause();
    }

    public final void onResume()
    {
        aly.onResume();
    }

    public final void onSaveInstanceState(Bundle bundle)
    {
        aly.onSaveInstanceState(bundle);
    }
}
