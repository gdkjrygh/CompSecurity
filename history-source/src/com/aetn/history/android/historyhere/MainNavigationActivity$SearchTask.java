// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere;

import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.os.AsyncTask;
import com.aetn.history.android.historyhere.dialogs.NoResultsDialogFragment;
import com.aetn.history.android.historyhere.utils.Utils;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.aetn.history.android.historyhere:
//            MainNavigationActivity, HistoryHereApplication

class this._cls0 extends AsyncTask
{

    final MainNavigationActivity this$0;

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((String[])aobj);
    }

    protected transient List doInBackground(String as[])
    {
        List list1 = null;
        int i = 0;
        List list = list1;
        Geocoder geocoder;
        int j;
        try
        {
            geocoder = new Geocoder(MainNavigationActivity.access$200(MainNavigationActivity.this));
        }
        // Misplaced declaration of an exception variable
        catch (String as[])
        {
            Utils.logger(MainNavigationActivity.access$000(MainNavigationActivity.this), (new StringBuilder()).append("IOException: ").append(as).toString());
            as.printStackTrace();
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (String as[])
        {
            Utils.logger(MainNavigationActivity.access$000(MainNavigationActivity.this), (new StringBuilder()).append("SearchTask -- exception: ").append(as).toString());
            as.printStackTrace();
            return list;
        }
        list = list1;
        Utils.logger(MainNavigationActivity.access$000(MainNavigationActivity.this), (new StringBuilder()).append("the geocoder: ").append(geocoder).toString());
        list = list1;
        list1 = geocoder.getFromLocationName(as[0], 1);
        list = list1;
        Utils.logger(MainNavigationActivity.access$000(MainNavigationActivity.this), (new StringBuilder()).append("addressFromSearch: ").append(list1).toString());
        list = list1;
_L2:
        list1 = list;
        j = i;
        if (list != null)
        {
            break; /* Loop/switch isn't completed */
        }
        list1 = geocoder.getFromLocationName(as[0], 1);
        j = i + 1;
        list = list1;
        i = j;
        if (j != 10) goto _L2; else goto _L1
_L1:
        list = list1;
        Utils.logger(MainNavigationActivity.access$000(MainNavigationActivity.this), (new StringBuilder()).append("SearchTask -- the address is: ").append(as[0]).toString());
        list = list1;
        Utils.logger(MainNavigationActivity.access$000(MainNavigationActivity.this), (new StringBuilder()).append("SearchTask -- request #: ").append(j).toString());
        return list1;
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((List)obj);
    }

    protected void onPostExecute(List list)
    {
        MainNavigationActivity.access$300(MainNavigationActivity.this).hideMessageBox();
        Utils.logger(MainNavigationActivity.access$000(MainNavigationActivity.this), "SearchTask:onPostExecute()");
        if (list == null || list.size() < 1)
        {
            Utils.logger(MainNavigationActivity.access$000(MainNavigationActivity.this), "error in search, try doGeoLookup: ");
            MainNavigationActivity.access$300(MainNavigationActivity.this).doGeoLookup(MainNavigationActivity.access$400(MainNavigationActivity.this), MainNavigationActivity.access$200(MainNavigationActivity.this));
            list = new HashMap();
            list.put("lookup_type", "location_from_address");
            list.put("search_term", MainNavigationActivity.access$400(MainNavigationActivity.this));
            tagLocalyticsEvent("GmapLimitedApi", list);
            return;
        }
        list = (Address)list.get(0);
        Utils.logger(MainNavigationActivity.access$000(MainNavigationActivity.this), (new StringBuilder()).append("SearchTask:onPostExecute: firstAddress: ").append(list).toString());
        double d = list.getLatitude();
        double d1 = list.getLongitude();
        boolean flag = false;
        list = list.getCountryCode();
        if (list == null)
        {
            flag = true;
        } else
        if (!list.equalsIgnoreCase("US"))
        {
            flag = true;
        }
        if (flag)
        {
            (new NoResultsDialogFragment()).show(getSupportFragmentManager(), "NoResultsDialogFragment");
            return;
        } else
        {
            list = new Location("searchResults");
            list.setLatitude(Double.valueOf(d).doubleValue());
            list.setLongitude(Double.valueOf(d1).doubleValue());
            showMap(list);
            return;
        }
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
        this$0 = MainNavigationActivity.this;
        super();
    }
}
