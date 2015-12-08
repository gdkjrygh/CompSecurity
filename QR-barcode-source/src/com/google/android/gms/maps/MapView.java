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

        private final ViewGroup aiV;
        private final IMapViewDelegate aiW;
        private View aiX;

        public IMapViewDelegate mB()
        {
            return aiW;
        }

        public void onCreate(Bundle bundle)
        {
            try
            {
                aiW.onCreate(bundle);
                aiX = (View)e.f(aiW.getView());
                aiV.removeAllViews();
                aiV.addView(aiX);
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
                aiW.onDestroy();
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
                aiW.onLowMemory();
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
                aiW.onPause();
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
                aiW.onResume();
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
                aiW.onSaveInstanceState(bundle);
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
            aiW = (IMapViewDelegate)o.i(imapviewdelegate);
            aiV = (ViewGroup)o.i(viewgroup);
        }
    }

    static class b extends com.google.android.gms.dynamic.a
    {

        protected f aiT;
        private final ViewGroup aiY;
        private final GoogleMapOptions aiZ;
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
            IMapViewDelegate imapviewdelegate = u.S(mContext).a(e.k(mContext), aiZ);
            aiT.a(new a(aiY, imapviewdelegate));
            return;
            Object obj;
            obj;
            throw new RuntimeRemoteException(((RemoteException) (obj)));
            obj;
        }

        b(ViewGroup viewgroup, Context context, GoogleMapOptions googlemapoptions)
        {
            aiY = viewgroup;
            mContext = context;
            aiZ = googlemapoptions;
        }
    }


    private GoogleMap aiR;
    private final b aiU;

    public MapView(Context context)
    {
        super(context);
        aiU = new b(this, context, null);
    }

    public MapView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        aiU = new b(this, context, GoogleMapOptions.createFromAttributes(context, attributeset));
    }

    public MapView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        aiU = new b(this, context, GoogleMapOptions.createFromAttributes(context, attributeset));
    }

    public MapView(Context context, GoogleMapOptions googlemapoptions)
    {
        super(context);
        aiU = new b(this, context, googlemapoptions);
    }

    public final GoogleMap getMap()
    {
        if (aiR != null)
        {
            return aiR;
        }
        aiU.mA();
        if (aiU.it() == null)
        {
            return null;
        }
        try
        {
            aiR = new GoogleMap(((a)aiU.it()).mB().getMap());
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return aiR;
    }

    public final void onCreate(Bundle bundle)
    {
        aiU.onCreate(bundle);
        if (aiU.it() == null)
        {
            bundle = aiU;
            b.b(this);
        }
    }

    public final void onDestroy()
    {
        aiU.onDestroy();
    }

    public final void onLowMemory()
    {
        aiU.onLowMemory();
    }

    public final void onPause()
    {
        aiU.onPause();
    }

    public final void onResume()
    {
        aiU.onResume();
    }

    public final void onSaveInstanceState(Bundle bundle)
    {
        aiU.onSaveInstanceState(bundle);
    }
}
