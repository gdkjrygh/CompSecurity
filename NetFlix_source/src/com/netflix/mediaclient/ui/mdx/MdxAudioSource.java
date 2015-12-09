// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.mdx;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.media.AudioSource;
import com.netflix.mediaclient.media.Subtitle;
import com.netflix.mediaclient.util.JsonUtils;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class MdxAudioSource extends AudioSource
{

    protected static final String ATTR_LABEL = "label";
    public static final int IMPL_VALUE = 2;
    private boolean mAvailable;
    private final boolean mSelected;
    private boolean mSupported;

    protected MdxAudioSource(JSONObject jsonobject, int i)
        throws JSONException
    {
        id = JsonUtils.getString(jsonobject, "id", null);
        languageDescription = JsonUtils.getString(jsonobject, "label", "English");
        mSelected = JsonUtils.getBoolean(jsonobject, "selected", false);
        nccpOrderNumber = i;
        isNative = true;
        trackType = 0;
        jsonobject = JsonUtils.getJSONArray(jsonobject, "disallowedSubtitleTracks");
        if (jsonobject != null)
        {
            if (Log.isLoggable("nf_audio_source", 3))
            {
                Log.d("nf_audio_source", (new StringBuilder()).append("DisallowedSubtitleTracks found: ").append(jsonobject.length()).toString());
            }
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

    public static MdxAudioSource newInstance(JSONObject jsonobject, int i)
        throws JSONException
    {
        return new MdxAudioSource(jsonobject, i);
    }

    public boolean isAllowedSubtitle(Subtitle subtitle)
    {
        if (subtitle == null)
        {
            return false;
        } else
        {
            return super.isAllowedSubtitle(subtitle);
        }
    }

    public boolean isAvailable()
    {
        return mAvailable;
    }

    public boolean isSelected()
    {
        return mSelected;
    }

    public boolean isSupported()
    {
        return mSupported;
    }

    public JSONObject toJson()
        throws JSONException
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("impl", 2);
        jsonobject.put("id", id);
        jsonobject.put("label", languageDescription);
        jsonobject.put("order", nccpOrderNumber);
        jsonobject.put("selected", mSelected);
        if (disallowedSubtitles != null && disallowedSubtitles.length > 0)
        {
            JSONArray jsonarray = new JSONArray();
            jsonobject.put("disallowedSubtitleTracks", jsonarray);
            for (int i = 0; i < disallowedSubtitles.length; i++)
            {
                jsonarray.put(disallowedSubtitles[i]);
            }

        }
        return jsonobject;
    }

    public String toString()
    {
        return (new StringBuilder()).append("MdxAudioSource [mSelected=").append(mSelected).append(", mSupported=").append(mSupported).append(", mAvailable=").append(mAvailable).append(", id=").append(id).append(", languageCodeIso639_1=").append(languageCodeIso639_1).append(", languageCodeIso639_2=").append(languageCodeIso639_2).append(", languageDescription=").append(languageDescription).append(", trackType=").append(trackType).append(", codecType=").append(codecType).append(", isNative=").append(isNative).append(", numChannels=").append(numChannels).append(", nccpOrderNumber=").append(nccpOrderNumber).append(", disallowedSubtitles=").append(Arrays.toString(disallowedSubtitles)).append("]").toString();
    }
}
