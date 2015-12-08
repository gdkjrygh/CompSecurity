// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.data;

import android.location.Location;
import android.net.http.AndroidHttpClient;
import android.os.Build;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.maps.model.LatLng;
import com.thetransitapp.droid.controller.FeedManager;
import com.thetransitapp.droid.model.Feed;
import com.thetransitapp.droid.model.Route;
import com.thetransitapp.droid.model.TransitBundle;
import com.thetransitapp.droid.model.TransitServer;
import com.thetransitapp.droid.util.ServiceUtility;
import java.io.InputStream;
import org.OpenUDID.OpenUDID_manager;
import org.apache.http.Header;
import org.apache.http.HttpException;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.methods.HttpGet;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.thetransitapp.droid.data:
//            TransitDatabaseHelper

public class BaseOnlineSource
{

    private static final String DEBUG_API_ENDPOINT = null;
    private String baseURL;
    private String buildNumber;
    private TransitDatabaseHelper databaseHelper;
    private FeedManager feedManager;
    private String lastURL;
    private final boolean withCredentails;

    public BaseOnlineSource(boolean flag)
    {
        withCredentails = flag;
    }

    protected JSONObject execute(String s)
        throws Exception
    {
        return execute(s, null, 0);
    }

    protected JSONObject execute(String s, String s1, int i)
        throws Exception
    {
        String s2;
        String s3;
        s2 = null;
        if (s1 != null)
        {
            s2 = databaseHelper.getCache(s1);
        }
        s3 = s2;
        if (s2 != null) goto _L2; else goto _L1
_L1:
        AndroidHttpClient androidhttpclient;
        lastURL = s;
        Log.d("Calling URL", s);
        s = new HttpGet(s);
        if (withCredentails)
        {
            s.setHeader("Authorization", (new StringBuilder("Basic ")).append(getAuth()).toString());
        }
        androidhttpclient = AndroidHttpClient.newInstance(getUserAgent());
        AndroidHttpClient.modifyRequestToAcceptGzipResponse(s);
        int j;
        s = androidhttpclient.execute(s);
        j = s.getStatusLine().getStatusCode();
        if (j < 300 || j >= 400) goto _L4; else goto _L3
_L3:
        androidhttpclient.close();
        if (i <= 5) goto _L6; else goto _L5
_L5:
        try
        {
            throw new HttpException((new StringBuilder(String.valueOf(j))).append(" infinite redirect").toString());
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
_L10:
        if (androidhttpclient != null)
        {
            androidhttpclient.close();
        }
        throw s;
_L6:
        s = s.getFirstHeader("Location").getValue();
        s = execute(s, s1, i);
        return s;
_L4:
        if (j < 400)
        {
            break MISSING_BLOCK_LABEL_239;
        }
        androidhttpclient.close();
        throw new HttpException((new StringBuilder(String.valueOf(j))).toString());
        s = s.getEntity();
        s3 = s2;
        if (s == null) goto _L2; else goto _L7
_L7:
        InputStream inputstream = AndroidHttpClient.getUngzippedContent(s);
        s = ServiceUtility.convertStreamToString(inputstream);
        inputstream.close();
        androidhttpclient.close();
        s3 = s;
        if (s1 == null) goto _L2; else goto _L8
_L8:
        databaseHelper.saveCache(s1, s);
        s3 = s;
_L2:
        try
        {
            s = new JSONObject(s3);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("BaseOnlineSource", (new StringBuilder("Fail to parse JSON at ")).append(lastURL).toString(), s);
            return new JSONObject();
        }
        return s;
        s;
        if (true) goto _L10; else goto _L9
_L9:
    }

    public String getAuth()
    {
        String s = "";
        if (OpenUDID_manager.isInitialized())
        {
            s = OpenUDID_manager.getOpenUDID();
        }
        return Base64.encodeToString((new StringBuilder(String.valueOf(s))).append(":").append("DT0xK3QnVf2T9I4PSv0k").toString().getBytes(), 2);
    }

    public String getBannedTransitParameters(boolean flag)
    {
        if (feedManager.isReady())
        {
            return feedManager.getClosestBundle().getBannedTransitParameters(flag);
        } else
        {
            return null;
        }
    }

    public String getBaseURL(boolean flag, LatLng latlng)
    {
        if (DEBUG_API_ENDPOINT != null)
        {
            return (new StringBuilder("http://")).append(DEBUG_API_ENDPOINT).toString();
        }
        if (latlng == null)
        {
            latlng = feedManager.getClosestBundle();
        } else
        {
            Location location = new Location("Transit");
            location.setLatitude(latlng.latitude);
            location.setLongitude(latlng.longitude);
            latlng = feedManager.closestBundleToLocation(location);
        }
        if (latlng != null && latlng.getServer() != null)
        {
            latlng = latlng.getServer();
            if (latlng != null)
            {
                if (flag)
                {
                    StringBuilder stringbuilder = new StringBuilder(String.valueOf("http://"));
                    if (latlng.getPlannerRegion() != null)
                    {
                        latlng = latlng.getPlannerRegion();
                    } else
                    {
                        latlng = "api";
                    }
                    latlng = stringbuilder.append(latlng).toString();
                } else
                {
                    StringBuilder stringbuilder1 = new StringBuilder(String.valueOf("http://"));
                    if (latlng.getAppRegion() != null)
                    {
                        latlng = latlng.getAppRegion();
                    } else
                    {
                        latlng = "api";
                    }
                    latlng = stringbuilder1.append(latlng).toString();
                }
                return (new StringBuilder(String.valueOf(latlng))).append(".thetransitapp.com").toString();
            }
        }
        return baseURL;
    }

    public Feed getFeed(Route route)
    {
        if (feedManager.isReady())
        {
            return feedManager.getFeed(route);
        } else
        {
            return null;
        }
    }

    public String getLastURL()
    {
        return lastURL;
    }

    public String getUserAgent()
    {
        String s = android.os.Build.VERSION.RELEASE;
        String s1 = Build.MODEL;
        return (new StringBuilder("Transit/")).append(buildNumber).append(" Android/").append(s).append(" ").append(s1).toString();
    }

}
