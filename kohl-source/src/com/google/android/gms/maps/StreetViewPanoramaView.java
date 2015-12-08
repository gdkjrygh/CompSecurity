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

        protected f ZC;
        private final ViewGroup ZH;
        private final StreetViewPanoramaOptions aaa;
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
            IStreetViewPanoramaViewDelegate istreetviewpanoramaviewdelegate = u.E(mContext).a(e.h(mContext), aaa);
            ZC.a(new b(ZH, istreetviewpanoramaviewdelegate));
            return;
            Object obj;
            obj;
            throw new RuntimeRemoteException(((RemoteException) (obj)));
            obj;
        }

        a(ViewGroup viewgroup, Context context, StreetViewPanoramaOptions streetviewpanoramaoptions)
        {
            ZH = viewgroup;
            mContext = context;
            aaa = streetviewpanoramaoptions;
        }
    }

    static class b
        implements LifecycleDelegate
    {

        private final ViewGroup ZE;
        private final IStreetViewPanoramaViewDelegate aab;
        private View aac;

        public IStreetViewPanoramaViewDelegate jB()
        {
            return aab;
        }

        public void onCreate(Bundle bundle)
        {
            try
            {
                aab.onCreate(bundle);
                aac = (View)e.e(aab.getView());
                ZE.removeAllViews();
                ZE.addView(aac);
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
                aab.onDestroy();
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
                aab.onLowMemory();
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
                aab.onPause();
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
                aab.onResume();
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
                aab.onSaveInstanceState(bundle);
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
            aab = (IStreetViewPanoramaViewDelegate)hn.f(istreetviewpanoramaviewdelegate);
            ZE = (ViewGroup)hn.f(viewgroup);
        }
    }


    private StreetViewPanorama ZQ;
    private final a ZZ;

    public StreetViewPanoramaView(Context context)
    {
        super(context);
        ZZ = new a(this, context, null);
    }

    public StreetViewPanoramaView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        ZZ = new a(this, context, null);
    }

    public StreetViewPanoramaView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        ZZ = new a(this, context, null);
    }

    public StreetViewPanoramaView(Context context, StreetViewPanoramaOptions streetviewpanoramaoptions)
    {
        super(context);
        ZZ = new a(this, context, streetviewpanoramaoptions);
    }

    public final StreetViewPanorama getStreetViewPanorama()
    {
        if (ZQ != null)
        {
            return ZQ;
        }
        ZZ.ju();
        if (ZZ.gC() == null)
        {
            return null;
        }
        try
        {
            ZQ = new StreetViewPanorama(((b)ZZ.gC()).jB().getStreetViewPanorama());
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return ZQ;
    }

    public final void onCreate(Bundle bundle)
    {
        ZZ.onCreate(bundle);
        if (ZZ.gC() == null)
        {
            bundle = ZZ;
            a.b(this);
        }
    }

    public final void onDestroy()
    {
        ZZ.onDestroy();
    }

    public final void onLowMemory()
    {
        ZZ.onLowMemory();
    }

    public final void onPause()
    {
        ZZ.onPause();
    }

    public final void onResume()
    {
        ZZ.onResume();
    }

    public final void onSaveInstanceState(Bundle bundle)
    {
        ZZ.onSaveInstanceState(bundle);
    }
}
