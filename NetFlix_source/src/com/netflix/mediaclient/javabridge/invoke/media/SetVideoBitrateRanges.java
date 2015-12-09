// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.javabridge.invoke.media;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.javabridge.invoke.BaseInvoke;
import com.netflix.mediaclient.javabridge.transport.NativeTransport;
import com.netflix.mediaclient.media.bitrate.VideoBitrateRange;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class SetVideoBitrateRanges extends BaseInvoke
{

    private static final String METHOD = "setVideoBitrateRanges";
    private static final String PROPERTY_maxBitrate = "max";
    private static final String PROPERTY_minBitrate = "min";
    private static final String PROPERTY_profile = "profile";
    private static final String PROPERTY_ranges = "ranges";
    private static final String TARGET = "media";

    public SetVideoBitrateRanges(int i, int j)
    {
        JSONArray jsonarray;
        String as[];
        super("media", "setVideoBitrateRanges");
        as = NativeTransport.getSupportedVideoProfiles();
        if (Log.isLoggable("nf_invoke", 3))
        {
            Log.d("nf_invoke", (new StringBuilder()).append("minBitrate: ").append(i).append(", maxBitrate: ").append(j).toString());
        }
        jsonarray = new JSONArray();
        int l = as.length;
        int k;
        k = 0;
        Object obj = null;
_L2:
        String s;
        if (k >= l)
        {
            break; /* Loop/switch isn't completed */
        }
        s = as[k];
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("min", i);
        jsonobject.put("max", j);
        jsonobject.put("profile", s);
        jsonarray.put(jsonobject);
        k++;
        if (true) goto _L2; else goto _L1
_L1:
        jsonobject = new JSONObject();
        JSONException jsonexception;
        try
        {
            jsonobject.put("ranges", jsonarray);
            arguments = jsonobject.toString();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (JSONException jsonexception) { }
        break MISSING_BLOCK_LABEL_165;
        jsonexception;
_L4:
        Log.e("nf_invoke", "Failed to create JSON object", jsonexception);
        return;
        jsonexception;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public SetVideoBitrateRanges(VideoBitrateRange avideobitraterange[])
    {
        super("media", "setVideoBitrateRanges");
        if (avideobitraterange == null)
        {
            throw new IllegalArgumentException("Range can not be null!");
        } else
        {
            setArguments(avideobitraterange);
            return;
        }
    }

    private void setArguments(VideoBitrateRange avideobitraterange[])
    {
        JSONArray jsonarray = new JSONArray();
        int j = avideobitraterange.length;
        int i;
        i = 0;
        Object obj = null;
_L2:
        VideoBitrateRange videobitraterange;
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        videobitraterange = avideobitraterange[i];
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("min", videobitraterange.getMinimal());
        jsonobject.put("max", videobitraterange.getMaximal());
        jsonobject.put("profile", videobitraterange.getProfile());
        jsonarray.put(jsonobject);
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        avideobitraterange = new JSONObject();
        try
        {
            avideobitraterange.put("ranges", jsonarray);
            arguments = avideobitraterange.toString();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (VideoBitrateRange avideobitraterange[]) { }
        break MISSING_BLOCK_LABEL_115;
        avideobitraterange;
_L4:
        Log.e("nf_invoke", "Failed to create JSON object", avideobitraterange);
        return;
        avideobitraterange;
        if (true) goto _L4; else goto _L3
_L3:
    }
}
