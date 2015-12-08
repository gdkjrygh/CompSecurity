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
import com.google.android.gms.internal.hm;
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

        private final ViewGroup ZH;
        private final IMapViewDelegate ZI;
        private View ZJ;

        public IMapViewDelegate jA()
        {
            return ZI;
        }

        public void onCreate(Bundle bundle)
        {
            try
            {
                ZI.onCreate(bundle);
                ZJ = (View)e.e(ZI.getView());
                ZH.removeAllViews();
                ZH.addView(ZJ);
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
                ZI.onDestroy();
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
                ZI.onLowMemory();
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
                ZI.onPause();
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
                ZI.onResume();
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
                ZI.onSaveInstanceState(bundle);
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
            ZI = (IMapViewDelegate)hm.f(imapviewdelegate);
            ZH = (ViewGroup)hm.f(viewgroup);
        }
    }

    static class b extends com.google.android.gms.dynamic.a
    {

        protected f ZF;
        private final ViewGroup ZK;
        private final GoogleMapOptions ZL;
        private final Context mContext;

        protected void a(f f1)
        {
            ZF = f1;
            jz();
        }

        public void jz()
        {
            if (ZF == null || gH() != null)
            {
                break MISSING_BLOCK_LABEL_59;
            }
            IMapViewDelegate imapviewdelegate = u.H(mContext).a(e.h(mContext), ZL);
            ZF.a(new a(ZK, imapviewdelegate));
            return;
            Object obj;
            obj;
            throw new RuntimeRemoteException(((RemoteException) (obj)));
            obj;
        }

        b(ViewGroup viewgroup, Context context, GoogleMapOptions googlemapoptions)
        {
            ZK = viewgroup;
            mContext = context;
            ZL = googlemapoptions;
        }
    }


    private GoogleMap ZD;
    private final b ZG;

    public MapView(Context context)
    {
        super(context);
        ZG = new b(this, context, null);
    }

    public MapView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        ZG = new b(this, context, GoogleMapOptions.createFromAttributes(context, attributeset));
    }

    public MapView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        ZG = new b(this, context, GoogleMapOptions.createFromAttributes(context, attributeset));
    }

    public MapView(Context context, GoogleMapOptions googlemapoptions)
    {
        super(context);
        ZG = new b(this, context, googlemapoptions);
    }

    public final GoogleMap getMap()
    {
        if (ZD != null)
        {
            return ZD;
        }
        ZG.jz();
        if (ZG.gH() == null)
        {
            return null;
        }
        try
        {
            ZD = new GoogleMap(((a)ZG.gH()).jA().getMap());
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return ZD;
    }

    public final void onCreate(Bundle bundle)
    {
        ZG.onCreate(bundle);
        if (ZG.gH() == null)
        {
            bundle = ZG;
            b.b(this);
        }
    }

    public final void onDestroy()
    {
        ZG.onDestroy();
    }

    public final void onLowMemory()
    {
        ZG.onLowMemory();
    }

    public final void onPause()
    {
        ZG.onPause();
    }

    public final void onResume()
    {
        ZG.onResume();
    }

    public final void onSaveInstanceState(Bundle bundle)
    {
        ZG.onSaveInstanceState(bundle);
    }
}
