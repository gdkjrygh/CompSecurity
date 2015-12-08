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
import com.google.android.gms.common.internal.o;
import com.google.android.gms.dynamic.LifecycleDelegate;
import com.google.android.gms.dynamic.e;
import com.google.android.gms.dynamic.f;
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

        protected f aiT;
        private final ViewGroup aiY;
        private final StreetViewPanoramaOptions ajr;
        private final Context mContext;

        protected void a(f f1)
        {
            aiT = f1;
            mA();
        }

        public void mA()
        {
            if (aiT == null || it() != null)
            {
                break MISSING_BLOCK_LABEL_59;
            }
            IStreetViewPanoramaViewDelegate istreetviewpanoramaviewdelegate = u.S(mContext).a(e.k(mContext), ajr);
            aiT.a(new b(aiY, istreetviewpanoramaviewdelegate));
            return;
            Object obj;
            obj;
            throw new RuntimeRemoteException(((RemoteException) (obj)));
            obj;
        }

        a(ViewGroup viewgroup, Context context, StreetViewPanoramaOptions streetviewpanoramaoptions)
        {
            aiY = viewgroup;
            mContext = context;
            ajr = streetviewpanoramaoptions;
        }
    }

    static class b
        implements LifecycleDelegate
    {

        private final ViewGroup aiV;
        private final IStreetViewPanoramaViewDelegate ajs;
        private View ajt;

        public IStreetViewPanoramaViewDelegate mH()
        {
            return ajs;
        }

        public void onCreate(Bundle bundle)
        {
            try
            {
                ajs.onCreate(bundle);
                ajt = (View)e.f(ajs.getView());
                aiV.removeAllViews();
                aiV.addView(ajt);
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
                ajs.onDestroy();
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
                ajs.onLowMemory();
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
                ajs.onPause();
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
                ajs.onResume();
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
                ajs.onSaveInstanceState(bundle);
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
            ajs = (IStreetViewPanoramaViewDelegate)o.i(istreetviewpanoramaviewdelegate);
            aiV = (ViewGroup)o.i(viewgroup);
        }
    }


    private StreetViewPanorama ajh;
    private final a ajq;

    public StreetViewPanoramaView(Context context)
    {
        super(context);
        ajq = new a(this, context, null);
    }

    public StreetViewPanoramaView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        ajq = new a(this, context, null);
    }

    public StreetViewPanoramaView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        ajq = new a(this, context, null);
    }

    public StreetViewPanoramaView(Context context, StreetViewPanoramaOptions streetviewpanoramaoptions)
    {
        super(context);
        ajq = new a(this, context, streetviewpanoramaoptions);
    }

    public final StreetViewPanorama getStreetViewPanorama()
    {
        if (ajh != null)
        {
            return ajh;
        }
        ajq.mA();
        if (ajq.it() == null)
        {
            return null;
        }
        try
        {
            ajh = new StreetViewPanorama(((b)ajq.it()).mH().getStreetViewPanorama());
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return ajh;
    }

    public final void onCreate(Bundle bundle)
    {
        ajq.onCreate(bundle);
        if (ajq.it() == null)
        {
            bundle = ajq;
            a.b(this);
        }
    }

    public final void onDestroy()
    {
        ajq.onDestroy();
    }

    public final void onLowMemory()
    {
        ajq.onLowMemory();
    }

    public final void onPause()
    {
        ajq.onPause();
    }

    public final void onResume()
    {
        ajq.onResume();
    }

    public final void onSaveInstanceState(Bundle bundle)
    {
        ajq.onSaveInstanceState(bundle);
    }
}
