// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.internal.jx;
import com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate;
import com.google.android.gms.maps.model.RuntimeRemoteException;

// Referenced classes of package com.google.android.gms.maps:
//            StreetViewPanorama, StreetViewPanoramaOptions, OnStreetViewPanoramaReadyCallback

public class StreetViewPanoramaView extends FrameLayout
{

    private StreetViewPanorama alm;
    private final b aly;

    public StreetViewPanoramaView(Context context)
    {
        super(context);
        aly = new b(context, null);
    }

    public StreetViewPanoramaView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        aly = new b(context, null);
    }

    public StreetViewPanoramaView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        aly = new b(context, null);
    }

    public StreetViewPanoramaView(Context context, StreetViewPanoramaOptions streetviewpanoramaoptions)
    {
        super(context);
        aly = new b(context, streetviewpanoramaoptions);
    }

    public final StreetViewPanorama getStreetViewPanorama()
    {
        if (alm != null)
        {
            return alm;
        }
        aly.nO();
        if (aly.je() == null)
        {
            return null;
        }
        try
        {
            alm = new StreetViewPanorama(((a)aly.je()).nV().getStreetViewPanorama());
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return alm;
    }

    public void getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback onstreetviewpanoramareadycallback)
    {
        jx.aU("getStreetViewPanoramaAsync() must be called on the main thread");
        aly.getStreetViewPanoramaAsync(onstreetviewpanoramareadycallback);
    }

    public final void onCreate(Bundle bundle)
    {
        aly.onCreate(bundle);
        if (aly.je() == null)
        {
            com.google.android.gms.dynamic.a.b(this);
        }
    }

    public final void onDestroy()
    {
        aly.onDestroy();
    }

    public final void onLowMemory()
    {
        aly.onLowMemory();
    }

    public final void onPause()
    {
        aly.onPause();
    }

    public final void onResume()
    {
        aly.onResume();
    }

    public final void onSaveInstanceState(Bundle bundle)
    {
        aly.onSaveInstanceState(bundle);
    }

    /* member class not found */
    class b {}


    /* member class not found */
    class a {}

}
