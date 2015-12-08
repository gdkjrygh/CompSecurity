// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere;

import android.content.res.Resources;
import android.os.AsyncTask;
import android.util.Log;
import com.aetn.history.android.historyhere.utils.Json;
import com.aetn.history.android.historyhere.utils.Utils;
import java.util.HashMap;
import org.json.JSONObject;

// Referenced classes of package com.aetn.history.android.historyhere:
//            HistoryHereApplication

class this._cls0 extends AsyncTask
{

    final HistoryHereApplication this$0;

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((String[])aobj);
    }

    protected transient JSONObject doInBackground(String as[])
    {
        try
        {
            Utils.logger(HistoryHereApplication.access$100(), "DoGeoAddressLookup:doInBackground()");
            as = as[0].replace(' ', '+');
            as = Json.getJSONfromURL((new StringBuilder()).append("http://maps.google.com/maps/api/geocode/json?address=").append(as).append("&sensor=true").toString());
            Utils.logger(HistoryHereApplication.access$100(), (new StringBuilder()).append("Geoloc returned:").append(as.toString()).toString());
        }
        // Misplaced declaration of an exception variable
        catch (String as[])
        {
            Utils.logger(HistoryHereApplication.access$100(), "Geoloc returned error");
            as.printStackTrace();
            return null;
        }
        return as;
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((JSONObject)obj);
    }

    protected void onPostExecute(JSONObject jsonobject)
    {
        Utils.logger(HistoryHereApplication.access$100(), "DoGeoAddressLookup:onPostExecute()");
        if (jsonobject == null)
        {
            break MISSING_BLOCK_LABEL_142;
        }
        String s = Utils.getFormattedAddressFromGeolocationData(jsonobject);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_32;
        }
        setCurrentSearchFormattedAddress(s);
        jsonobject = Utils.getLocationFromGeolocationData(jsonobject);
        if (jsonobject != null)
        {
            try
            {
                double d = Double.valueOf(((String)jsonobject.get("latitude")).trim()).doubleValue();
                double d1 = Double.valueOf(((String)jsonobject.get("longitude")).trim()).doubleValue();
                setCurrentSearchLocation(d, d1);
                hideMessageBox();
                doPoiSearch(getCurrentSearchLatitude(), getCurrentSearchLongitude());
                return;
            }
            // Misplaced declaration of an exception variable
            catch (JSONObject jsonobject)
            {
                jsonobject.printStackTrace();
            }
            break MISSING_BLOCK_LABEL_141;
        }
        Log.e(HistoryHereApplication.access$100(), "There was no result from the lookup");
        hideMessageBox();
        return;
        return;
        Utils.logger(HistoryHereApplication.access$100(), "DoGeoAddressLookup:onPostExecute()-- result is NULL so show error");
        hideMessageBox();
        showToast(getResources().getString(0x7f0d0040), 1);
        return;
    }

    protected transient void onProgressUpdate(Integer ainteger[])
    {
        super.onProgressUpdate(ainteger);
    }

    protected volatile void onProgressUpdate(Object aobj[])
    {
        onProgressUpdate((Integer[])aobj);
    }

    ()
    {
        this$0 = HistoryHereApplication.this;
        super();
    }
}
