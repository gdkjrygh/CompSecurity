// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.javabridge.invoke.media;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.javabridge.invoke.BaseInvoke;
import com.netflix.mediaclient.media.AudioSource;
import com.netflix.mediaclient.media.Subtitle;
import org.json.JSONException;
import org.json.JSONObject;

public class SelectTracks extends BaseInvoke
{

    private static final String METHOD = "selectTracks";
    private static final String PROPERTY_audio = "audio";
    private static final String PROPERTY_subtitle = "subtitle";
    private static final String TARGET = "media";

    public SelectTracks(AudioSource audiosource, Subtitle subtitle)
    {
        super("media", "selectTracks");
        if (audiosource == null)
        {
            throw new IllegalArgumentException("Audio can not be null!");
        } else
        {
            setArguments(audiosource, subtitle);
            return;
        }
    }

    private void setArguments(AudioSource audiosource, Subtitle subtitle)
    {
        String s;
        String s1 = "";
        s = s1;
        if (audiosource == null)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        s = s1;
        if (audiosource.getId() != null)
        {
            s = audiosource.getId();
        }
        if (subtitle == null)
        {
            break MISSING_BLOCK_LABEL_75;
        }
        if (subtitle.getId() == null)
        {
            break MISSING_BLOCK_LABEL_75;
        }
        audiosource = subtitle.getId();
_L1:
        subtitle = new JSONObject();
        try
        {
            subtitle.put("audio", s);
            subtitle.put("subtitle", audiosource);
            arguments = subtitle.toString();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (AudioSource audiosource) { }
        break MISSING_BLOCK_LABEL_82;
        audiosource = "-1";
          goto _L1
        audiosource;
        Log.e("nf_invoke", "Failed to create JSON object", audiosource);
        return;
    }
}
