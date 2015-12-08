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
import com.google.android.gms.internal.hn;
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

        private final ViewGroup ZE;
        private final IMapViewDelegate ZF;
        private View ZG;

        public IMapViewDelegate jv()
        {
            return ZF;
        }

        public void onCreate(Bundle bundle)
        {
            try
            {
                ZF.onCreate(bundle);
                ZG = (View)e.e(ZF.getView());
                ZE.removeAllViews();
                ZE.addView(ZG);
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
                ZF.onDestroy();
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
                ZF.onLowMemory();
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
                ZF.onPause();
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
                ZF.onResume();
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
                ZF.onSaveInstanceState(bundle);
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
            ZF = (IMapViewDelegate)hn.f(imapviewdelegate);
            ZE = (ViewGroup)hn.f(viewgroup);
        }
    }

    static class b extends com.google.android.gms.dynamic.a
    {

        protected f ZC;
        private final ViewGroup ZH;
        private final GoogleMapOptions ZI;
        private final Context mContext;

        protected void a(f f1)
        {
            ZC = f1;
            ju();
        }

        public void ju()
        {
            if (ZC == null || gC() != null)
            {
                break MISSING_BLOCK_LABEL_59;
            }
            IMapViewDelegate imapviewdelegate = u.E(mContext).a(e.h(mContext), ZI);
            ZC.a(new a(ZH, imapviewdelegate));
            return;
            Object obj;
            obj;
            throw new RuntimeRemoteException(((RemoteException) (obj)));
            obj;
        }

        b(ViewGroup viewgroup, Context context, GoogleMapOptions googlemapoptions)
        {
            ZH = viewgroup;
            mContext = context;
            ZI = googlemapoptions;
        }
    }


    private GoogleMap ZA;
    private final b ZD;

    public MapView(Context context)
    {
        super(context);
        ZD = new b(this, context, null);
    }

    public MapView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        ZD = new b(this, context, GoogleMapOptions.createFromAttributes(context, attributeset));
    }

    public MapView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        ZD = new b(this, context, GoogleMapOptions.createFromAttributes(context, attributeset));
    }

    public MapView(Context context, GoogleMapOptions googlemapoptions)
    {
        super(context);
        ZD = new b(this, context, googlemapoptions);
    }

    public final GoogleMap getMap()
    {
        if (ZA != null)
        {
            return ZA;
        }
        ZD.ju();
        if (ZD.gC() == null)
        {
            return null;
        }
        try
        {
            ZA = new GoogleMap(((a)ZD.gC()).jv().getMap());
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return ZA;
    }

    public final void onCreate(Bundle bundle)
    {
        ZD.onCreate(bundle);
        if (ZD.gC() == null)
        {
            bundle = ZD;
            b.b(this);
        }
    }

    public final void onDestroy()
    {
        ZD.onDestroy();
    }

    public final void onLowMemory()
    {
        ZD.onLowMemory();
    }

    public final void onPause()
    {
        ZD.onPause();
    }

    public final void onResume()
    {
        ZD.onResume();
    }

    public final void onSaveInstanceState(Bundle bundle)
    {
        ZD.onSaveInstanceState(bundle);
    }
}
