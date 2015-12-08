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
import com.google.android.gms.maps.internal.IMapViewDelegate;
import com.google.android.gms.maps.model.RuntimeRemoteException;

// Referenced classes of package com.google.android.gms.maps:
//            GoogleMapOptions, GoogleMap, OnMapReadyCallback

public class MapView extends FrameLayout
{

    private GoogleMap akS;
    private final b akY;

    public MapView(Context context)
    {
        super(context);
        akY = new b(context, null);
    }

    public MapView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        akY = new b(context, GoogleMapOptions.createFromAttributes(context, attributeset));
    }

    public MapView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        akY = new b(context, GoogleMapOptions.createFromAttributes(context, attributeset));
    }

    public MapView(Context context, GoogleMapOptions googlemapoptions)
    {
        super(context);
        akY = new b(context, googlemapoptions);
    }

    public final GoogleMap getMap()
    {
        if (akS != null)
        {
            return akS;
        }
        akY.nO();
        if (akY.je() == null)
        {
            return null;
        }
        try
        {
            akS = new GoogleMap(((a)akY.je()).nP().getMap());
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return akS;
    }

    public void getMapAsync(OnMapReadyCallback onmapreadycallback)
    {
        jx.aU("getMapAsync() must be called on the main thread");
        akY.getMapAsync(onmapreadycallback);
    }

    public final void onCreate(Bundle bundle)
    {
        akY.onCreate(bundle);
        if (akY.je() == null)
        {
            com.google.android.gms.dynamic.a.b(this);
        }
    }

    public final void onDestroy()
    {
        akY.onDestroy();
    }

    public final void onLowMemory()
    {
        akY.onLowMemory();
    }

    public final void onPause()
    {
        akY.onPause();
    }

    public final void onResume()
    {
        akY.onResume();
    }

    public final void onSaveInstanceState(Bundle bundle)
    {
        akY.onSaveInstanceState(bundle);
    }

    /* member class not found */
    class b {}


    /* member class not found */
    class a {}

}
