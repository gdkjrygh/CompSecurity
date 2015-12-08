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
import com.google.android.gms.dynamic.LifecycleDelegate;
import com.google.android.gms.dynamic.c;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.internal.dm;
import com.google.android.gms.maps.internal.IMapViewDelegate;
import com.google.android.gms.maps.internal.q;
import com.google.android.gms.maps.model.RuntimeRemoteException;

// Referenced classes of package com.google.android.gms.maps:
//            GoogleMapOptions, GoogleMap

public class MapView extends FrameLayout
{
    static class a
        implements LifecycleDelegate
    {

        private final ViewGroup pN;
        private final IMapViewDelegate pO;
        private View pP;

        public IMapViewDelegate cF()
        {
            return pO;
        }

        public void onCreate(Bundle bundle)
        {
            try
            {
                pO.onCreate(bundle);
                pP = (View)c.b(pO.getView());
                pN.removeAllViews();
                pN.addView(pP);
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
                pO.onDestroy();
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
                pO.onLowMemory();
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
                pO.onPause();
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
                pO.onResume();
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
                pO.onSaveInstanceState(bundle);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle)
            {
                throw new RuntimeRemoteException(bundle);
            }
        }

        public a(ViewGroup viewgroup, IMapViewDelegate imapviewdelegate)
        {
            pO = (IMapViewDelegate)dm.e(imapviewdelegate);
            pN = (ViewGroup)dm.e(viewgroup);
        }
    }

    static class b extends com.google.android.gms.dynamic.a
    {

        private final Context mContext;
        protected d pL;
        private final ViewGroup pQ;
        private final GoogleMapOptions pR;

        protected void a(d d1)
        {
            pL = d1;
            cE();
        }

        public void cE()
        {
            if (pL == null || bP() != null)
            {
                break MISSING_BLOCK_LABEL_59;
            }
            IMapViewDelegate imapviewdelegate = q.u(mContext).a(c.g(mContext), pR);
            pL.a(new a(pQ, imapviewdelegate));
            return;
            Object obj;
            obj;
            throw new RuntimeRemoteException(((RemoteException) (obj)));
            obj;
        }

        b(ViewGroup viewgroup, Context context, GoogleMapOptions googlemapoptions)
        {
            pQ = viewgroup;
            mContext = context;
            pR = googlemapoptions;
        }
    }


    private GoogleMap pI;
    private final b pM;

    public MapView(Context context)
    {
        super(context);
        pM = new b(this, context, null);
    }

    public MapView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        pM = new b(this, context, GoogleMapOptions.createFromAttributes(context, attributeset));
    }

    public MapView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        pM = new b(this, context, GoogleMapOptions.createFromAttributes(context, attributeset));
    }

    public MapView(Context context, GoogleMapOptions googlemapoptions)
    {
        super(context);
        pM = new b(this, context, googlemapoptions);
    }

    public final GoogleMap getMap()
    {
        if (pI != null)
        {
            return pI;
        }
        pM.cE();
        if (pM.bP() == null)
        {
            return null;
        }
        try
        {
            pI = new GoogleMap(((a)pM.bP()).cF().getMap());
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return pI;
    }

    public final void onCreate(Bundle bundle)
    {
        pM.onCreate(bundle);
        if (pM.bP() == null)
        {
            pM.a(this);
        }
    }

    public final void onDestroy()
    {
        pM.onDestroy();
    }

    public final void onLowMemory()
    {
        pM.onLowMemory();
    }

    public final void onPause()
    {
        pM.onPause();
    }

    public final void onResume()
    {
        pM.onResume();
    }

    public final void onSaveInstanceState(Bundle bundle)
    {
        pM.onSaveInstanceState(bundle);
    }
}
