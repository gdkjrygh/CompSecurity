// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.view;

import android.location.Address;
import android.location.Geocoder;
import android.os.AsyncTask;
import com.aetn.history.android.historyhere.utils.Utils;
import java.io.IOException;
import java.util.List;

// Referenced classes of package com.aetn.history.android.historyhere.view:
//            SuggestActivity

class this._cls0 extends AsyncTask
{

    final SuggestActivity this$0;

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
            geocoder = new Geocoder(SuggestActivity.access$000(SuggestActivity.this));
        }
        // Misplaced declaration of an exception variable
        catch (String as[])
        {
            Utils.logger("SuggestActivity", (new StringBuilder()).append("AddressLookupTask: IOException: ").append(as).toString());
            as.printStackTrace();
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (String as[])
        {
            Utils.logger("SuggestActivity", (new StringBuilder()).append("AddressLookupTask: Exception: ").append(as).toString());
            as.printStackTrace();
            return list;
        }
        list = list1;
        Utils.logger("SuggestActivity", (new StringBuilder()).append("the geocoder: ").append(geocoder).toString());
        list = list1;
        list1 = geocoder.getFromLocationName(as[0], 1);
        list = list1;
        Utils.logger("SuggestActivity", (new StringBuilder()).append("AddressLookupTask: ").append(list1).toString());
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
        Utils.logger("SuggestActivity", (new StringBuilder()).append("AddressLookupTask -- the address is: ").append(as[0]).toString());
        list = list1;
        Utils.logger("SuggestActivity", (new StringBuilder()).append("AddressLookupTask -- request #: ").append(j).toString());
        return list1;
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((List)obj);
    }

    protected void onPostExecute(List list)
    {
        Utils.logger("SuggestActivity", "AddressLookupTask:onPostExecute()");
        if (list != null && list.size() >= 1) goto _L2; else goto _L1
_L1:
        Utils.logger("SuggestActivity", "AddressLookupTask:onPostExecute: geocoderError: so set the location to 0.0|0.0 ");
        SuggestActivity.access$900(SuggestActivity.this). = 0.0D;
        SuggestActivity.access$900(SuggestActivity.this). = 0.0D;
_L5:
        SuggestActivity.access$1600(SuggestActivity.this);
        return;
_L2:
        Double double1;
        Object obj;
        boolean flag;
        obj = (Address)list.get(0);
        Utils.logger("SuggestActivity", (new StringBuilder()).append("AddressLookupTask:onPostExecute: firstAddress: ").append(obj).toString());
        list = Double.valueOf(((Address) (obj)).getLatitude());
        double1 = Double.valueOf(((Address) (obj)).getLongitude());
        flag = false;
        obj = ((Address) (obj)).getCountryCode();
        if (obj != null) goto _L4; else goto _L3
_L3:
        flag = true;
_L6:
        if (flag)
        {
            Utils.logger("SuggestActivity", "AddressLookupTask:onPostExecute: searchError: so set the location to 0.0|0.0 ");
            SuggestActivity.access$900(SuggestActivity.this). = 0.0D;
            SuggestActivity.access$900(SuggestActivity.this). = 0.0D;
        } else
        {
            Utils.logger("SuggestActivity", "AddressLookupTask:onPostExecute: success: ");
            SuggestActivity.access$900(SuggestActivity.this). = list.doubleValue();
            SuggestActivity.access$900(SuggestActivity.this). = double1.doubleValue();
            Utils.logger("SuggestActivity", (new StringBuilder()).append("AddressLookupTask:onPostExecute: lat: ").append(list).toString());
            Utils.logger("SuggestActivity", (new StringBuilder()).append("AddressLookupTask:onPostExecute: lng:: ").append(double1).toString());
        }
        if (true) goto _L5; else goto _L4
_L4:
        if (!((String) (obj)).equalsIgnoreCase("US"))
        {
            flag = true;
        }
          goto _L6
    }

    protected transient void onProgressUpdate(Integer ainteger[])
    {
        super.onProgressUpdate(ainteger);
    }

    protected volatile void onProgressUpdate(Object aobj[])
    {
        onProgressUpdate((Integer[])aobj);
    }

    Q()
    {
        this$0 = SuggestActivity.this;
        super();
    }
}
