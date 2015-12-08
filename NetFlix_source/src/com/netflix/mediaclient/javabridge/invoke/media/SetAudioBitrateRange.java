// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.javabridge.invoke.media;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.javabridge.invoke.BaseInvoke;
import com.netflix.mediaclient.media.bitrate.AudioBitrateRange;
import org.json.JSONException;
import org.json.JSONObject;

public class SetAudioBitrateRange extends BaseInvoke
{

    private static final String METHOD = "setAudioBitrateRange";
    private static final String PROPERTY_maxBitrate = "maxBitrate";
    private static final String PROPERTY_minBitrate = "minBitrate";
    private static final String TARGET = "media";

    public SetAudioBitrateRange(int i, int j)
    {
        super("media", "setAudioBitrateRange");
        setArguments(i, j);
    }

    public SetAudioBitrateRange(AudioBitrateRange audiobitraterange)
    {
        super("media", "setAudioBitrateRange");
        if (audiobitraterange == null)
        {
            throw new IllegalArgumentException("Range can not be null!");
        } else
        {
            setArguments(audiobitraterange.getMinimal(), audiobitraterange.getMaximal());
            return;
        }
    }

    private void setArguments(int i, int j)
    {
        JSONObject jsonobject = new JSONObject();
        JSONException jsonexception;
        try
        {
            jsonobject.put("minBitrate", i);
            jsonobject.put("maxBitrate", j);
            arguments = jsonobject.toString();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (JSONException jsonexception) { }
        break MISSING_BLOCK_LABEL_34;
        jsonexception;
        Log.e("nf_invoke", "Failed to create JSON object", jsonexception);
        return;
    }
}
