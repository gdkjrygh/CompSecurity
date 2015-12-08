// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.service;

import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import android.os.AsyncTask;
import com.google.android.gms.maps.model.LatLng;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.thetransitapp.droid.service:
//            ServiceCallback

public class ReverseGeocoderTask extends AsyncTask
{

    private ServiceCallback callback;
    private Context context;

    public ReverseGeocoderTask(Context context1, ServiceCallback servicecallback)
    {
        context = context1;
        callback = servicecallback;
    }

    protected volatile transient Object doInBackground(Object aobj[])
    {
        return doInBackground((LatLng[])aobj);
    }

    protected transient String doInBackground(LatLng alatlng[])
    {
        Object obj;
        Object obj1;
        Object obj2;
        obj1 = null;
        obj2 = null;
        if (alatlng.length <= 0)
        {
            break MISSING_BLOCK_LABEL_161;
        }
        obj = obj2;
        if (!Geocoder.isPresent())
        {
            break MISSING_BLOCK_LABEL_91;
        }
        obj = new Geocoder(context, Locale.getDefault());
        obj1 = ((Geocoder) (obj)).getFromLocation(alatlng[0].latitude, alatlng[0].longitude, 1);
        obj = obj2;
        if (((List) (obj1)).isEmpty())
        {
            break MISSING_BLOCK_LABEL_91;
        }
        obj1 = (Address)((List) (obj1)).get(0);
        obj = obj2;
        try
        {
            if (((Address) (obj1)).getMaxAddressLineIndex() > 0)
            {
                obj = ((Address) (obj1)).getAddressLine(0);
            }
        }
        catch (IOException ioexception)
        {
            ioexception.printStackTrace();
            ioexception = obj2;
        }
        obj1 = obj;
        if (obj == null)
        {
            obj = NumberFormat.getInstance();
            ((NumberFormat) (obj)).setMaximumFractionDigits(4);
            obj1 = (new StringBuilder(String.valueOf((new StringBuilder(String.valueOf(((NumberFormat) (obj)).format(alatlng[0].latitude)))).append(", ").toString()))).append(((NumberFormat) (obj)).format(alatlng[0].longitude)).toString();
        }
        return ((String) (obj1));
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((String)obj);
    }

    protected void onPostExecute(String s)
    {
        super.onPostExecute(s);
        callback.onResult(s);
    }
}
