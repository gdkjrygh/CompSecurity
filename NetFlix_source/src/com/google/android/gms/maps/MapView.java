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
import com.google.android.gms.dynamic.e;
import com.google.android.gms.dynamic.f;
import com.google.android.gms.internal.fq;
import com.google.android.gms.maps.internal.IMapViewDelegate;
import com.google.android.gms.maps.internal.c;
import com.google.android.gms.maps.internal.u;
import com.google.android.gms.maps.model.RuntimeRemoteException;

// Referenced classes of package com.google.android.gms.maps:
//            GoogleMapOptions, GoogleMap

public class MapView extends FrameLayout
{
    static class a
        implements LifecycleDelegate
    {

        private final ViewGroup RX;
        private final IMapViewDelegate RY;
        private View RZ;

        public IMapViewDelegate iq()
        {
            return RY;
        }

        public void onCreate(Bundle bundle)
        {
            try
            {
                RY.onCreate(bundle);
                RZ = (View)e.d(RY.getView());
                RX.removeAllViews();
                RX.addView(RZ);
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
                RY.onDestroy();
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
                RY.onLowMemory();
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
                RY.onPause();
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
                RY.onResume();
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
                RY.onSaveInstanceState(bundle);
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
            RY = (IMapViewDelegate)fq.f(imapviewdelegate);
            RX = (ViewGroup)fq.f(viewgroup);
        }
    }

    static class b extends com.google.android.gms.dynamic.a
    {

        protected f RV;
        private final ViewGroup Sa;
        private final GoogleMapOptions Sb;
        private final Context mContext;

        protected void a(f f1)
        {
            RV = f1;
            ip();
        }

        public void ip()
        {
            if (RV == null || fW() != null)
            {
                break MISSING_BLOCK_LABEL_59;
            }
            IMapViewDelegate imapviewdelegate = u.A(mContext).a(e.h(mContext), Sb);
            RV.a(new a(Sa, imapviewdelegate));
            return;
            Object obj;
            obj;
            throw new RuntimeRemoteException(((RemoteException) (obj)));
            obj;
        }

        b(ViewGroup viewgroup, Context context, GoogleMapOptions googlemapoptions)
        {
            Sa = viewgroup;
            mContext = context;
            Sb = googlemapoptions;
        }
    }


    private GoogleMap RT;
    private final b RW;

    public MapView(Context context)
    {
        super(context);
        RW = new b(this, context, null);
    }

    public MapView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        RW = new b(this, context, GoogleMapOptions.createFromAttributes(context, attributeset));
    }

    public MapView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        RW = new b(this, context, GoogleMapOptions.createFromAttributes(context, attributeset));
    }

    public MapView(Context context, GoogleMapOptions googlemapoptions)
    {
        super(context);
        RW = new b(this, context, googlemapoptions);
    }

    public final GoogleMap getMap()
    {
        if (RT != null)
        {
            return RT;
        }
        RW.ip();
        if (RW.fW() == null)
        {
            return null;
        }
        try
        {
            RT = new GoogleMap(((a)RW.fW()).iq().getMap());
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return RT;
    }

    public final void onCreate(Bundle bundle)
    {
        RW.onCreate(bundle);
        if (RW.fW() == null)
        {
            bundle = RW;
            b.b(this);
        }
    }

    public final void onDestroy()
    {
        RW.onDestroy();
    }

    public final void onLowMemory()
    {
        RW.onLowMemory();
    }

    public final void onPause()
    {
        RW.onPause();
    }

    public final void onResume()
    {
        RW.onResume();
    }

    public final void onSaveInstanceState(Bundle bundle)
    {
        RW.onSaveInstanceState(bundle);
    }
}
