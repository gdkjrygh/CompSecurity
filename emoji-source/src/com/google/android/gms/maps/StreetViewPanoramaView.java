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
import com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate;
import com.google.android.gms.maps.internal.c;
import com.google.android.gms.maps.internal.u;
import com.google.android.gms.maps.model.RuntimeRemoteException;

// Referenced classes of package com.google.android.gms.maps:
//            StreetViewPanorama, StreetViewPanoramaOptions

public class StreetViewPanoramaView extends FrameLayout
{
    static class a extends com.google.android.gms.dynamic.a
    {

        protected f ZF;
        private final ViewGroup ZK;
        private final StreetViewPanoramaOptions aad;
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
            IStreetViewPanoramaViewDelegate istreetviewpanoramaviewdelegate = u.H(mContext).a(e.h(mContext), aad);
            ZF.a(new b(ZK, istreetviewpanoramaviewdelegate));
            return;
            Object obj;
            obj;
            throw new RuntimeRemoteException(((RemoteException) (obj)));
            obj;
        }

        a(ViewGroup viewgroup, Context context, StreetViewPanoramaOptions streetviewpanoramaoptions)
        {
            ZK = viewgroup;
            mContext = context;
            aad = streetviewpanoramaoptions;
        }
    }

    static class b
        implements LifecycleDelegate
    {

        private final ViewGroup ZH;
        private final IStreetViewPanoramaViewDelegate aae;
        private View aaf;

        public IStreetViewPanoramaViewDelegate jG()
        {
            return aae;
        }

        public void onCreate(Bundle bundle)
        {
            try
            {
                aae.onCreate(bundle);
                aaf = (View)e.e(aae.getView());
                ZH.removeAllViews();
                ZH.addView(aaf);
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
                aae.onDestroy();
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
                aae.onLowMemory();
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
                aae.onPause();
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
                aae.onResume();
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
                aae.onSaveInstanceState(bundle);
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

        public b(ViewGroup viewgroup, IStreetViewPanoramaViewDelegate istreetviewpanoramaviewdelegate)
        {
            aae = (IStreetViewPanoramaViewDelegate)hm.f(istreetviewpanoramaviewdelegate);
            ZH = (ViewGroup)hm.f(viewgroup);
        }
    }


    private StreetViewPanorama ZT;
    private final a aac;

    public StreetViewPanoramaView(Context context)
    {
        super(context);
        aac = new a(this, context, null);
    }

    public StreetViewPanoramaView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        aac = new a(this, context, null);
    }

    public StreetViewPanoramaView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        aac = new a(this, context, null);
    }

    public StreetViewPanoramaView(Context context, StreetViewPanoramaOptions streetviewpanoramaoptions)
    {
        super(context);
        aac = new a(this, context, streetviewpanoramaoptions);
    }

    public final StreetViewPanorama getStreetViewPanorama()
    {
        if (ZT != null)
        {
            return ZT;
        }
        aac.jz();
        if (aac.gH() == null)
        {
            return null;
        }
        try
        {
            ZT = new StreetViewPanorama(((b)aac.gH()).jG().getStreetViewPanorama());
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return ZT;
    }

    public final void onCreate(Bundle bundle)
    {
        aac.onCreate(bundle);
        if (aac.gH() == null)
        {
            bundle = aac;
            a.b(this);
        }
    }

    public final void onDestroy()
    {
        aac.onDestroy();
    }

    public final void onLowMemory()
    {
        aac.onLowMemory();
    }

    public final void onPause()
    {
        aac.onPause();
    }

    public final void onResume()
    {
        aac.onResume();
    }

    public final void onSaveInstanceState(Bundle bundle)
    {
        aac.onSaveInstanceState(bundle);
    }
}
