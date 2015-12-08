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
//            GoogleMapOptions, GoogleMap, OnMapReadyCallback

public class MapView extends FrameLayout
{
    static class a
        implements MapLifecycleDelegate
    {

        private final ViewGroup akZ;
        private final IMapViewDelegate ala;
        private View alb;

        public void getMapAsync(OnMapReadyCallback onmapreadycallback)
        {
            try
            {
                ala.getMapAsync(new com.google.android.gms.maps.internal.m.a(this, onmapreadycallback) {

                    final OnMapReadyCallback akU;
                    final a alc;

                    public void a(IGoogleMapDelegate igooglemapdelegate)
                        throws RemoteException
                    {
                        akU.onMapReady(new GoogleMap(igooglemapdelegate));
                    }

            
            {
                alc = a1;
                akU = onmapreadycallback;
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

        public IMapViewDelegate nP()
        {
            return ala;
        }

        public void onCreate(Bundle bundle)
        {
            try
            {
                ala.onCreate(bundle);
                alb = (View)e.f(ala.getView());
                akZ.removeAllViews();
                akZ.addView(alb);
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
            throw new UnsupportedOperationException("onCreateView not allowed on MapViewDelegate");
        }

        public void onDestroy()
        {
            try
            {
                ala.onDestroy();
                return;
            }
            catch (RemoteException remoteexception)
            {
                throw new RuntimeRemoteException(remoteexception);
            }
        }

        public void onDestroyView()
        {
            throw new UnsupportedOperationException("onDestroyView not allowed on MapViewDelegate");
        }

        public void onInflate(Activity activity, Bundle bundle, Bundle bundle1)
        {
            throw new UnsupportedOperationException("onInflate not allowed on MapViewDelegate");
        }

        public void onLowMemory()
        {
            try
            {
                ala.onLowMemory();
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
                ala.onPause();
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
                ala.onResume();
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
                ala.onSaveInstanceState(bundle);
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

        public a(ViewGroup viewgroup, IMapViewDelegate imapviewdelegate)
        {
            ala = (IMapViewDelegate)jx.i(imapviewdelegate);
            akZ = (ViewGroup)jx.i(viewgroup);
        }
    }

    static class b extends com.google.android.gms.dynamic.a
    {

        protected f akW;
        private final List akX = new ArrayList();
        private final ViewGroup ald;
        private final GoogleMapOptions ale;
        private final Context mContext;

        protected void a(f f1)
        {
            akW = f1;
            nO();
        }

        public void getMapAsync(OnMapReadyCallback onmapreadycallback)
        {
            if (je() != null)
            {
                ((a)je()).getMapAsync(onmapreadycallback);
                return;
            } else
            {
                akX.add(onmapreadycallback);
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
                IMapViewDelegate imapviewdelegate = x.S(mContext).a(e.k(mContext), ale);
                akW.a(new a(ald, imapviewdelegate));
                OnMapReadyCallback onmapreadycallback;
                for (Iterator iterator = akX.iterator(); iterator.hasNext(); ((a)je()).getMapAsync(onmapreadycallback))
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
            akX.clear();
        }

        b(ViewGroup viewgroup, Context context, GoogleMapOptions googlemapoptions)
        {
            ald = viewgroup;
            mContext = context;
            ale = googlemapoptions;
        }
    }


    private GoogleMap akS;
    private final b akY;

    public MapView(Context context)
    {
        super(context);
        akY = new b(this, context, null);
    }

    public MapView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        akY = new b(this, context, GoogleMapOptions.createFromAttributes(context, attributeset));
    }

    public MapView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        akY = new b(this, context, GoogleMapOptions.createFromAttributes(context, attributeset));
    }

    public MapView(Context context, GoogleMapOptions googlemapoptions)
    {
        super(context);
        akY = new b(this, context, googlemapoptions);
    }

    public final GoogleMap getMap()
    {
        if (akS != null)
        {
            return akS;
        }
        akY.nO();
        if (akY.je() == null)
        {
            return null;
        }
        try
        {
            akS = new GoogleMap(((a)akY.je()).nP().getMap());
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return akS;
    }

    public void getMapAsync(OnMapReadyCallback onmapreadycallback)
    {
        jx.aU("getMapAsync() must be called on the main thread");
        akY.getMapAsync(onmapreadycallback);
    }

    public final void onCreate(Bundle bundle)
    {
        akY.onCreate(bundle);
        if (akY.je() == null)
        {
            com.google.android.gms.dynamic.a.b(this);
        }
    }

    public final void onDestroy()
    {
        akY.onDestroy();
    }

    public final void onLowMemory()
    {
        akY.onLowMemory();
    }

    public final void onPause()
    {
        akY.onPause();
    }

    public final void onResume()
    {
        akY.onResume();
    }

    public final void onSaveInstanceState(Bundle bundle)
    {
        akY.onSaveInstanceState(bundle);
    }
}
