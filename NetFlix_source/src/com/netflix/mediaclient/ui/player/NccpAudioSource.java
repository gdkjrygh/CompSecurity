// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.player;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.media.AudioSource;
import com.netflix.mediaclient.util.JsonUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class NccpAudioSource extends AudioSource
{

    public static final int IMPL_VALUE = 1;
    private static final String TRACK_TYPE_ASSISTIVE = "ASSISTIVE";
    private static final String TRACK_TYPE_COMMENTARY = "COMMENTARY";
    private static final String TRACK_TYPE_PRIMARY = "PRIMARY";

    protected NccpAudioSource(JSONObject jsonobject, int i)
        throws JSONException
    {
        id = JsonUtils.getString(jsonobject, "id", null);
        numChannels = JsonUtils.getInt(jsonobject, "channels", 0);
        languageCodeIso639_1 = JsonUtils.getString(jsonobject, "language", "en");
        languageDescription = JsonUtils.getString(jsonobject, "languageDescription", "English");
        nccpOrderNumber = i;
        String s = JsonUtils.getString(jsonobject, "trackType", null);
        isNative = JsonUtils.getBoolean(jsonobject, "isNative", true);
        if ("ASSISTIVE".equalsIgnoreCase(s))
        {
            trackType = 2;
        } else
        if ("COMMENTARY".equalsIgnoreCase(s))
        {
            trackType = 1;
        } else
        if ("PRIMARY".equalsIgnoreCase(s))
        {
            trackType = 0;
        } else
        {
            trackType = -1;
        }
        jsonobject = JsonUtils.getJSONArray(jsonobject, "disallowedSubtitleTracks");
        if (jsonobject != null)
        {
            Log.d("nf_audio_source", (new StringBuilder()).append("DisallowedSubtitleTracks found: ").append(jsonobject.length()).toString());
            disallowedSubtitles = new String[jsonobject.length()];
            for (i = 0; i < jsonobject.length(); i++)
            {
                disallowedSubtitles[i] = jsonobject.getString(i);
            }

        } else
        {
            Log.d("nf_audio_source", "No disallowedSubtitleTracks!");
            disallowedSubtitles = new String[0];
        }
    }

    public static AudioSource newInstance(JSONObject jsonobject, int i)
        throws JSONException
    {
        return new NccpAudioSource(jsonobject, i);
    }

    public JSONObject toJson()
        throws JSONException
    {
        Object obj;
        JSONObject jsonobject;
        jsonobject = new JSONObject();
        jsonobject.put("impl", 1);
        jsonobject.put("id", id);
        jsonobject.put("languageDescription", languageDescription);
        jsonobject.put("order", nccpOrderNumber);
        jsonobject.put("channels", numChannels);
        jsonobject.put("language", languageCodeIso639_1);
        jsonobject.put("languageDescription", languageDescription);
        jsonobject.put("isNative", isNative);
        obj = null;
        if (trackType != 2) goto _L2; else goto _L1
_L1:
        obj = "ASSISTIVE";
_L4:
        jsonobject.put("trackType", obj);
        if (disallowedSubtitles != null && disallowedSubtitles.length > 0)
        {
            obj = new JSONArray();
            jsonobject.put("disallowedSubtitleTracks", obj);
            for (int i = 0; i < disallowedSubtitles.length; i++)
            {
                ((JSONArray) (obj)).put(disallowedSubtitles[i]);
            }

        }
        break; /* Loop/switch isn't completed */
_L2:
        if (trackType == 1)
        {
            obj = "COMMENTARY";
        } else
        if (trackType == 0)
        {
            obj = "PRIMARY";
        }
        if (true) goto _L4; else goto _L3
_L3:
        return jsonobject;
    }
}
