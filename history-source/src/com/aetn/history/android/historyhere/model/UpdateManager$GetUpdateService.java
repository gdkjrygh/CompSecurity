// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.model;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import com.aetn.history.android.historyhere.utils.Json;
import com.aetn.history.android.historyhere.utils.Utils;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.aetn.history.android.historyhere.model:
//            UpdateManager

class this._cls0 extends AsyncTask
{

    final UpdateManager this$0;

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((String[])aobj);
    }

    protected transient JSONObject doInBackground(String as[])
    {
        Utils.logger("UpdateManager", "GetUpdateService:doInBackground()");
        as = Json.getJSONfromURL(as[0]);
        if (as == null)
        {
            Utils.logger("UpdateManager", "GetUpdateService:error getting detail");
        }
        return as;
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((JSONObject)obj);
    }

    protected void onPostExecute(JSONObject jsonobject)
    {
        HashMap hashmap = new HashMap();
        if (jsonobject != null)
        {
            try
            {
                jsonobject = jsonobject.getJSONObject("config");
                hashmap.put("versionNumber", jsonobject.getString("versionNumber"));
                hashmap.put("latestVersionDetails", jsonobject.getString("latestVersionDetails"));
                hashmap.put("latestVersionURL", jsonobject.getString("latestVersionURL"));
                hashmap.put("sponsorImageURL", jsonobject.getString("sponsorImageURL"));
                hashmap.put("promoURL", jsonobject.getString("promoURL"));
                hashmap.put("facebookShareLogoURL", jsonobject.getString("facebookShareLogoURL"));
                Utils.logger("UpdateManager", (new StringBuilder()).append("UpdateManager.KEY_FACEBOOK_SHARE_LOGO_URL: ").append(jsonobject.getString("facebookShareLogoURL")).toString());
                Utils.logger("UpdateManager", (new StringBuilder()).append("updateData.size(): ").append(hashmap.size()).toString());
                jsonobject = new Intent("update data received");
                jsonobject.putExtra("updateData", hashmap);
                UpdateManager.access$000(UpdateManager.this).sendBroadcast(jsonobject);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (JSONObject jsonobject)
            {
                Utils.logger("UpdateManager", "onPostExecute(): error ");
            }
        } else
        {
            return;
        }
        jsonobject.printStackTrace();
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
        this$0 = UpdateManager.this;
        super();
    }
}
