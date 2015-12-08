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
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

public class UpdateManager
{
    class GetUpdateService extends AsyncTask
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
                    mContext.sendBroadcast(jsonobject);
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

        GetUpdateService()
        {
            this$0 = UpdateManager.this;
            super();
        }
    }


    public static final String KEY_CONFIG_UPDATE_DETAILS = "latestVersionDetails";
    public static final String KEY_CONFIG_VERSION = "versionNumber";
    public static final String KEY_FACEBOOK_SHARE_LOGO_URL = "facebookShareLogoURL";
    public static final String KEY_PROMO_URL = "promoURL";
    public static final String KEY_SPONSOR_IMAGE_URL = "sponsorImageURL";
    public static final String KEY_UPDATE_URL = "latestVersionURL";
    private static final String TAG = "UpdateManager";
    public static final String UPDATE_DATA_KEY = "updateData";
    public static final String UPDATE_DATA_RECEIVED = "update data received";
    private Context mContext;

    public UpdateManager()
    {
    }

    private static boolean isLatestVersion(String s, String s1)
    {
        return normalisedVersion(s).compareTo(normalisedVersion(s1)) >= 0;
    }

    public static String normalisedVersion(String s)
    {
        return normalisedVersion(s, ".", 4);
    }

    private static String normalisedVersion(String s, String s1, int i)
    {
        s = Pattern.compile(s1, 16).split(s);
        s1 = new StringBuilder();
        int k = s.length;
        for (int j = 0; j < k; j++)
        {
            Object obj = s[j];
            s1.append(String.format((new StringBuilder()).append("%").append(i).append('s').toString(), new Object[] {
                obj
            }));
        }

        return s1.toString();
    }

    public void updateConfig(Context context, String s, String s1)
    {
        mContext = context;
        (new GetUpdateService()).execute(new String[] {
            s
        });
    }

}
