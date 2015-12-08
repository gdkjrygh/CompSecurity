// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.response;

import android.content.Context;
import android.content.SharedPreferences;
import com.auditude.ads.core.AdSettings;
import com.auditude.ads.core.AuditudeEnv;
import com.auditude.ads.loader.DataLoader;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONObject;

public class AudienceManager
    implements com.auditude.ads.loader.DataLoader.DataLoaderListener
{
    public static interface AudienceManagerListener
    {

        public abstract void onAudienceManagerComplete();

        public abstract void onAudienceManagerFailed(Throwable throwable);
    }


    public static final String AUD_AAM_SEGS = "aud_aam_segs";
    public static final String AUD_AAM_SEGS_DATE = "aud_aam_segs_expire";
    public static final String AUD_AAM_UUID = "aud_aam_uuid";
    public static final String AUD_CN_NAME = "aud";
    public static final String AUD_OBJ_NAME = "stuff";
    public static final String AUD_SEGS_PARAM_NAME = "segs";
    private String aamUrl;
    private DataLoader dataLoader;
    private AudienceManagerListener listener;
    private String segmentsValues[];
    private int timeout;
    private String uuid;

    public AudienceManager(int i)
    {
        timeout = i;
    }

    private Boolean loadData()
    {
        Object obj = (Context)AuditudeEnv.getInstance().getAdSettings().getProperty("applicationContext");
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_157;
        }
        String s;
        Object obj1;
        try
        {
            obj = ((Context) (obj)).getSharedPreferences("aud_aam_segs", 0);
            obj1 = ((SharedPreferences) (obj)).getString("aud_aam_segs_expire", null);
            s = ((SharedPreferences) (obj)).getString("aamUrl", null);
        }
        catch (Exception exception)
        {
            return Boolean.valueOf(false);
        }
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_146;
        }
        obj1 = new Date(((String) (obj1)));
        if ((int)((new Date()).getTime() - ((Date) (obj1)).getTime()) >= 0x5265c00 || !s.equalsIgnoreCase(aamUrl))
        {
            break MISSING_BLOCK_LABEL_141;
        }
        s = ((SharedPreferences) (obj)).getString("aud_aam_segs", null);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_123;
        }
        if (s.length() > 0)
        {
            segmentsValues = s.split(",");
        }
        uuid = ((SharedPreferences) (obj)).getString("aud_aam_uuid", null);
        return Boolean.valueOf(true);
        return Boolean.valueOf(false);
        return Boolean.valueOf(false);
        return Boolean.valueOf(false);
    }

    private void saveData()
    {
        Object obj1;
        obj1 = (Context)AuditudeEnv.getInstance().getAdSettings().getProperty("applicationContext");
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_185;
        }
        Object obj;
        obj = new Date();
        obj1 = ((Context) (obj1)).getSharedPreferences("aud_aam_segs", 0).edit();
        ((android.content.SharedPreferences.Editor) (obj1)).clear();
        ((android.content.SharedPreferences.Editor) (obj1)).putString("aud_aam_segs_expire", ((Date) (obj)).toGMTString());
        ((android.content.SharedPreferences.Editor) (obj1)).putString("aamUrl", aamUrl);
        if (uuid != null)
        {
            ((android.content.SharedPreferences.Editor) (obj1)).putString("aud_aam_uuid", uuid);
        }
        obj = new StringBuilder();
        if (segmentsValues == null || segmentsValues.length <= 0) goto _L2; else goto _L1
_L1:
        int i = 0;
_L6:
        if (i < segmentsValues.length) goto _L4; else goto _L3
_L3:
        ((android.content.SharedPreferences.Editor) (obj1)).putString("aud_aam_segs", ((StringBuilder) (obj)).toString());
_L2:
        ((android.content.SharedPreferences.Editor) (obj1)).commit();
        return;
_L4:
        ((StringBuilder) (obj)).append((new StringBuilder(String.valueOf(segmentsValues[i]))).append(",").toString());
        i++;
        if (true) goto _L6; else goto _L5
_L5:
        Exception exception;
        exception;
    }

    public String[] getSegmentsValues()
    {
        return segmentsValues;
    }

    public String getUuid()
    {
        return uuid;
    }

    public void loadSegmentData(String s)
    {
        aamUrl = s;
        segmentsValues = null;
        uuid = null;
        if (loadData().booleanValue())
        {
            listener.onAudienceManagerComplete();
            return;
        } else
        {
            dataLoader = new DataLoader();
            dataLoader.setDataLoaderListener(this);
            dataLoader.load(aamUrl, null, timeout);
            return;
        }
    }

    public void onRequestComplete(String s)
    {
        JSONObject jsonobject;
        String as[];
        int i;
        try
        {
            s = new JSONObject(s);
            uuid = s.optString("uuid");
            s = s.getJSONArray("stuff");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            listener.onAudienceManagerFailed(s);
            return;
        }
        i = 0;
        if (i >= s.length())
        {
            saveData();
            listener.onAudienceManagerComplete();
            return;
        }
        jsonobject = s.getJSONObject(i);
        if (!jsonobject.optString("cn").toLowerCase().equals("aud") || jsonobject.optString("cv") == null)
        {
            break MISSING_BLOCK_LABEL_136;
        }
        as = jsonobject.optString("cv").split("=");
        if (as == null)
        {
            break MISSING_BLOCK_LABEL_136;
        }
        if (as.length > 1 && as[0].equals("segs") && as[1].length() > 0)
        {
            segmentsValues = as[1].split(",");
        }
        i++;
        if (false)
        {
        } else
        {
            break MISSING_BLOCK_LABEL_28;
        }
    }

    public void onRequestFailed(Throwable throwable)
    {
        listener.onAudienceManagerFailed(throwable);
    }

    public void setAudienceManagerListener(AudienceManagerListener audiencemanagerlistener)
    {
        listener = audiencemanagerlistener;
    }
}
