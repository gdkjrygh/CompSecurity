// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.mdx.message.controller;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.mdx.message.MdxMessage;
import org.json.JSONException;
import org.json.JSONObject;

public final class SetAudioSubtitles extends MdxMessage
{

    private static String PROPERTY_audio_track_id = "audio_track_id";
    private static String PROPERTY_timed_text_track_id = "timed_text_track_id";
    private String mAudioTrackId;
    private String mTimedTextTrackId;

    public SetAudioSubtitles(String s, String s1)
    {
        super("SET_AUDIO_SUBTITLES");
        mTimedTextTrackId = s1;
        mAudioTrackId = s;
        createObj();
    }

    private void createObj()
    {
        try
        {
            mJson.put(PROPERTY_audio_track_id, mAudioTrackId);
            mJson.put(PROPERTY_timed_text_track_id, mTimedTextTrackId);
            return;
        }
        catch (JSONException jsonexception)
        {
            Log.e("nf_mdx", (new StringBuilder()).append(messageName()).append(" createObj failed ").append(jsonexception).toString());
        }
    }

}
