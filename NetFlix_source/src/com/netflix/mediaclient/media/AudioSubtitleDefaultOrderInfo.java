// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.media;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.util.JsonUtils;
import org.json.JSONException;
import org.json.JSONObject;

public final class AudioSubtitleDefaultOrderInfo
    implements Comparable
{

    private String audioTrackId;
    private int preferenceOrder;
    private String subtitleTrackId;

    public AudioSubtitleDefaultOrderInfo(String s, String s1, int i)
    {
        audioTrackId = s;
        subtitleTrackId = s1;
        preferenceOrder = i;
    }

    public AudioSubtitleDefaultOrderInfo(JSONObject jsonobject)
        throws JSONException
    {
        audioTrackId = JsonUtils.getString(jsonobject, "audioTrackId", null);
        subtitleTrackId = JsonUtils.getString(jsonobject, "subtitleTrackId", null);
        preferenceOrder = JsonUtils.getInt(jsonobject, "preferenceOrder", -1);
    }

    public static void dumpLog(AudioSubtitleDefaultOrderInfo aaudiosubtitledefaultorderinfo[], String s)
    {
        if (aaudiosubtitledefaultorderinfo != null)
        {
            if (Log.isLoggable(s, 3))
            {
                Log.d(s, (new StringBuilder()).append("Defalts: ").append(aaudiosubtitledefaultorderinfo.length).toString());
                for (int i = 0; i < aaudiosubtitledefaultorderinfo.length; i++)
                {
                    Log.d(s, (new StringBuilder()).append(i).append(" ").append(aaudiosubtitledefaultorderinfo[i]).toString());
                }

            }
        } else
        {
            Log.e(s, "Defaults are null!");
        }
    }

    public int compareTo(AudioSubtitleDefaultOrderInfo audiosubtitledefaultorderinfo)
    {
        if (audiosubtitledefaultorderinfo != null)
        {
            if (preferenceOrder == audiosubtitledefaultorderinfo.preferenceOrder)
            {
                return 0;
            }
            if (preferenceOrder < audiosubtitledefaultorderinfo.preferenceOrder)
            {
                return -1;
            }
        }
        return 1;
    }

    public volatile int compareTo(Object obj)
    {
        return compareTo((AudioSubtitleDefaultOrderInfo)obj);
    }

    public String getAudioTrackId()
    {
        return audioTrackId;
    }

    public int getPreferenceOrder()
    {
        return preferenceOrder;
    }

    public String getSubtitleTrackId()
    {
        return subtitleTrackId;
    }

    public String toString()
    {
        return (new StringBuilder()).append("AudioSubtitleDefaultOrderInfo [audioTrackId=").append(audioTrackId).append(", subtitleTrackId=").append(subtitleTrackId).append(", preferenceOrder=").append(preferenceOrder).append("]").toString();
    }
}
