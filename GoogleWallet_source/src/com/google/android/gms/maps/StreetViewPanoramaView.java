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
//            OnStreetViewPanoramaReadyCallback, StreetViewPanorama, StreetViewPanoramaOptions

public class StreetViewPanoramaView extends FrameLayout
{
    static final class a
        implements StreetViewLifecycleDelegate
    {

        private final IStreetViewPanoramaViewDelegate azF;
        private View azG;
        private final ViewGroup azf;

        public final void getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback onstreetviewpanoramareadycallback)
        {
            try
            {
                azF.getStreetViewPanoramaAsync(new com.google.android.gms.maps.internal.u.a(this, onstreetviewpanoramareadycallback) {

                    final a azH;
                    final OnStreetViewPanoramaReadyCallback azu;

                    public final void a(IStreetViewPanoramaDelegate istreetviewpanoramadelegate)
                        throws RemoteException
                    {
                        OnStreetViewPanoramaReadyCallback onstreetviewpanoramareadycallback = azu;
                        new StreetViewPanorama(istreetviewpanoramadelegate);
                    }

            
            {
                azH = a1;
                azu = onstreetviewpanoramareadycallback;
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

        public final void onCreate(Bundle bundle)
        {
            try
            {
                azF.onCreate(bundle);
                azG = (View)e.i(azF.getView());
                azf.removeAllViews();
                azf.addView(azG);
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
            throw new UnsupportedOperationException("onCreateView not allowed on StreetViewPanoramaViewDelegate");
        }

        public final void onDestroy()
        {
            try
            {
                azF.onDestroy();
                return;
            }
            catch (RemoteException remoteexception)
            {
                throw new RuntimeRemoteException(remoteexception);
            }
        }

        public final void onDestroyView()
        {
            throw new UnsupportedOperationException("onDestroyView not allowed on StreetViewPanoramaViewDelegate");
        }

        public final void onInflate(Activity activity, Bundle bundle, Bundle bundle1)
        {
            throw new UnsupportedOperationException("onInflate not allowed on StreetViewPanoramaViewDelegate");
        }

        public final void onLowMemory()
        {
            try
            {
                azF.onLowMemory();
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
                azF.onPause();
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
                azF.onResume();
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
                azF.onSaveInstanceState(bundle);
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

        public a(ViewGroup viewgroup, IStreetViewPanoramaViewDelegate istreetviewpanoramaviewdelegate)
        {
            azF = (IStreetViewPanoramaViewDelegate)kn.k(istreetviewpanoramaviewdelegate);
            azf = (ViewGroup)kn.k(viewgroup);
        }
    }

    static final class b extends com.google.android.gms.dynamic.a
    {

        private final StreetViewPanoramaOptions azI;
        protected f azc;
        private final ViewGroup azj;
        private final List azw = new ArrayList();
        private final Context mContext;

        private void qc()
        {
            if (azc == null || lf() != null)
            {
                break MISSING_BLOCK_LABEL_121;
            }
            try
            {
                IStreetViewPanoramaViewDelegate istreetviewpanoramaviewdelegate = x.V(mContext).a(e.q(mContext), azI);
                azc.a(new a(azj, istreetviewpanoramaviewdelegate));
                OnStreetViewPanoramaReadyCallback onstreetviewpanoramareadycallback;
                for (Iterator iterator = azw.iterator(); iterator.hasNext(); ((a)lf()).getStreetViewPanoramaAsync(onstreetviewpanoramareadycallback))
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
            azw.clear();
        }

        protected final void a(f f1)
        {
            azc = f1;
            qc();
        }

        b(ViewGroup viewgroup, Context context, StreetViewPanoramaOptions streetviewpanoramaoptions)
        {
            azj = viewgroup;
            mContext = context;
            azI = streetviewpanoramaoptions;
        }
    }


    private final b azE;

    public StreetViewPanoramaView(Context context)
    {
        super(context);
        azE = new b(this, context, null);
    }

    public StreetViewPanoramaView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        azE = new b(this, context, null);
    }

    public StreetViewPanoramaView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        azE = new b(this, context, null);
    }
}
