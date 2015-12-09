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
import com.google.android.gms.dynamic.e;
import com.google.android.gms.dynamic.f;
import com.google.android.gms.internal.kn;
import com.google.android.gms.maps.internal.IGoogleMapDelegate;
import com.google.android.gms.maps.internal.IMapViewDelegate;
import com.google.android.gms.maps.internal.MapLifecycleDelegate;
import com.google.android.gms.maps.internal.c;
import com.google.android.gms.maps.internal.x;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.maps:
//            GoogleMapOptions, OnMapReadyCallback, GoogleMap

public class MapView extends FrameLayout
{
    static final class a
        implements MapLifecycleDelegate
    {

        private final ViewGroup azf;
        private final IMapViewDelegate azg;
        private View azh;

        public final void getMapAsync(OnMapReadyCallback onmapreadycallback)
        {
            try
            {
                azg.getMapAsync(new com.google.android.gms.maps.internal.m.a(this, onmapreadycallback) {

                    final OnMapReadyCallback aza;
                    final a azi;

                    public final void a(IGoogleMapDelegate igooglemapdelegate)
                        throws RemoteException
                    {
                        OnMapReadyCallback onmapreadycallback = aza;
                        new GoogleMap(igooglemapdelegate);
                    }

            
            {
                azi = a1;
                aza = onmapreadycallback;
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

        public final void onCreate(Bundle bundle)
        {
            try
            {
                azg.onCreate(bundle);
                azh = (View)e.i(azg.getView());
                azf.removeAllViews();
                azf.addView(azh);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle)
            {
                throw new RuntimeRemoteException(bundle);
            }
        }

        public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
        {
            throw new UnsupportedOperationException("onCreateView not allowed on MapViewDelegate");
        }

        public final void onDestroy()
        {
            try
            {
                azg.onDestroy();
                return;
            }
            catch (RemoteException remoteexception)
            {
                throw new RuntimeRemoteException(remoteexception);
            }
        }

        public final void onDestroyView()
        {
            throw new UnsupportedOperationException("onDestroyView not allowed on MapViewDelegate");
        }

        public final void onInflate(Activity activity, Bundle bundle, Bundle bundle1)
        {
            throw new UnsupportedOperationException("onInflate not allowed on MapViewDelegate");
        }

        public final void onLowMemory()
        {
            try
            {
                azg.onLowMemory();
                return;
            }
            catch (RemoteException remoteexception)
            {
                throw new RuntimeRemoteException(remoteexception);
            }
        }

        public final void onPause()
        {
            try
            {
                azg.onPause();
                return;
            }
            catch (RemoteException remoteexception)
            {
                throw new RuntimeRemoteException(remoteexception);
            }
        }

        public final void onResume()
        {
            try
            {
                azg.onResume();
                return;
            }
            catch (RemoteException remoteexception)
            {
                throw new RuntimeRemoteException(remoteexception);
            }
        }

        public final void onSaveInstanceState(Bundle bundle)
        {
            try
            {
                azg.onSaveInstanceState(bundle);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle)
            {
                throw new RuntimeRemoteException(bundle);
            }
        }

        public final void onStart()
        {
        }

        public final void onStop()
        {
        }

        public a(ViewGroup viewgroup, IMapViewDelegate imapviewdelegate)
        {
            azg = (IMapViewDelegate)kn.k(imapviewdelegate);
            azf = (ViewGroup)kn.k(viewgroup);
        }
    }

    static final class b extends com.google.android.gms.dynamic.a
    {

        protected f azc;
        private final List azd = new ArrayList();
        private final ViewGroup azj;
        private final GoogleMapOptions azk;
        private final Context mContext;

        private void qc()
        {
            if (azc == null || lf() != null)
            {
                break MISSING_BLOCK_LABEL_121;
            }
            try
            {
                IMapViewDelegate imapviewdelegate = x.V(mContext).a(e.q(mContext), azk);
                azc.a(new a(azj, imapviewdelegate));
                OnMapReadyCallback onmapreadycallback;
                for (Iterator iterator = azd.iterator(); iterator.hasNext(); ((a)lf()).getMapAsync(onmapreadycallback))
                {
                    onmapreadycallback = (OnMapReadyCallback)iterator.next();
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
            azd.clear();
        }

        protected final void a(f f1)
        {
            azc = f1;
            qc();
        }

        b(ViewGroup viewgroup, Context context, GoogleMapOptions googlemapoptions)
        {
            azj = viewgroup;
            mContext = context;
            azk = googlemapoptions;
        }
    }


    private final b aze;

    public MapView(Context context)
    {
        super(context);
        aze = new b(this, context, null);
    }

    public MapView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        aze = new b(this, context, GoogleMapOptions.createFromAttributes(context, attributeset));
    }

    public MapView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        aze = new b(this, context, GoogleMapOptions.createFromAttributes(context, attributeset));
    }
}
