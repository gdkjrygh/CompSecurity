// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.event;

import java.util.HashMap;

public class AdPluginEvent
{

    public static final String BREAK_BEGIN = "breakBegin";
    public static final String BREAK_END = "breakEnd";
    public static final String INIT_COMPLETE = "initComplete";
    public static final String LOAD_COMPLETE = "loadComplete";
    public static final String NETWORK_AD_RESPONSE_EMPTY = "NetworkAdResponseEmpty";
    public static final String PAUSE_PLAYBACK = "pausePlayback";
    public static final String RESUME_PLAYBACK = "resumePlayback";
    private HashMap data;
    private String type;

    public AdPluginEvent(String s)
    {
        this(s, null);
    }

    public AdPluginEvent(String s, HashMap hashmap)
    {
        type = s;
        data = hashmap;
    }

    public final HashMap getData()
    {
        return data;
    }

    public final String getType()
    {
        return type;
    }
}
