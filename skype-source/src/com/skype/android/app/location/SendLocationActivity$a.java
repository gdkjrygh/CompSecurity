// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.location;

import android.app.Activity;
import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import android.os.AsyncTask;
import com.google.android.gms.maps.model.LatLng;
import com.skype.android.event.EventBus;
import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.app.location:
//            SendLocationActivity

private static final class bus extends AsyncTask
{

    private final EventBus bus;
    private final Context context;

    protected final volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((LatLng[])aobj);
    }

    protected final transient Void doInBackground(LatLng alatlng[])
    {
        LatLng latlng;
        Object obj;
        if (alatlng == null || alatlng.length == 0)
        {
            return null;
        }
        latlng = alatlng[0];
        obj = new Geocoder(context);
        alatlng = null;
        obj = ((Geocoder) (obj)).getFromLocation(latlng.a, latlng.b, 1);
        if (!((List) (obj)).isEmpty())
        {
            alatlng = (Address)((List) (obj)).get(0);
        }
        bus.a(new dressRetrieverResult(latlng, alatlng));
        return null;
        alatlng;
        SendLocationActivity.access$1400().warning((new StringBuilder("Cannot resolve address: ")).append(alatlng).toString());
        bus.a(new dressRetrieverResult(latlng, null));
        return null;
        alatlng;
        bus.a(new dressRetrieverResult(latlng, null));
        return null;
    }

    public dressRetrieverResult(Activity activity, EventBus eventbus)
    {
        context = activity;
        bus = eventbus;
    }
}
