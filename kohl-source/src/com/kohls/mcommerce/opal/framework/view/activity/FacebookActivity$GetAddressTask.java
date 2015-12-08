// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.framework.view.activity;

import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.os.AsyncTask;
import com.kohls.mcommerce.opal.common.util.Logger;
import java.io.IOException;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.kohls.mcommerce.opal.framework.view.activity:
//            FacebookActivity

private class mContext extends AsyncTask
{

    Context mContext;
    final FacebookActivity this$0;

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((Location[])aobj);
    }

    protected transient String doInBackground(Location alocation[])
    {
        Object obj = new Geocoder(mContext, Locale.getDefault());
        alocation = alocation[0];
        try
        {
            obj = ((Geocoder) (obj)).getFromLocation(alocation.getLatitude(), alocation.getLongitude(), 1);
        }
        // Misplaced declaration of an exception variable
        catch (Location alocation[])
        {
            Logger.debug(FacebookActivity.access$1500(), "IO Exception in getFromLocation()");
            return null;
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            alocation = (new StringBuilder()).append("Illegal arguments ").append(Double.toString(alocation.getLatitude())).append(" , ").append(Double.toString(alocation.getLongitude())).append(" passed to address service").toString();
            Logger.debug(FacebookActivity.access$1500(), alocation);
            return null;
        }
        if (obj != null && ((List) (obj)).size() > 0)
        {
            alocation = (Address)((List) (obj)).get(0);
            obj = new StringBuilder();
            if (alocation != null)
            {
                if (alocation.getLocality() != null)
                {
                    ((StringBuilder) (obj)).append((new StringBuilder()).append(alocation.getLocality()).append(", ").toString());
                }
                if (alocation.getCountryName() != null)
                {
                    ((StringBuilder) (obj)).append(alocation.getCountryName());
                }
                return ((StringBuilder) (obj)).toString();
            } else
            {
                return null;
            }
        } else
        {
            return null;
        }
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((String)obj);
    }

    protected void onPostExecute(String s)
    {
        super.onPostExecute(s);
        if (s != null)
        {
            FacebookActivity.access$2802(FacebookActivity.this, s);
            return;
        } else
        {
            FacebookActivity.access$2802(FacebookActivity.this, "Nearby");
            Logger.debug(FacebookActivity.access$1500(), getString(0x7f0801f2));
            return;
        }
    }

    public (Context context)
    {
        this$0 = FacebookActivity.this;
        super();
        mContext = context;
    }
}
