// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.wear;

import android.app.Application;
import android.content.SharedPreferences;
import com.skype.android.event.EventBus;
import com.skype.android.inject.EventSubscriberBinder;

public class WearDataRequestCache
{

    public static final String KEY_EMOTICON_DATA_REQUEST_URI = "emoticonDataRequestUri";
    public static final String WEAR_REQUEST_DATA_CACHE = "wear_request_data_cache";
    private final Application context;

    public WearDataRequestCache(Application application, EventBus eventbus)
    {
        context = application;
        (new EventSubscriberBinder(eventbus, this)).bind();
        eraseDataCache();
    }

    private void eraseDataCache()
    {
        context.getSharedPreferences("wear_request_data_cache", 0).edit().clear().apply();
    }

    public String getEmoticonListCacheDataUri()
    {
        return context.getSharedPreferences("wear_request_data_cache", 0).getString("emoticonDataRequestUri", null);
    }

    public void onEvent(com.skype.android.gen.SkyLibListener.OnEmoticonListUpdated onemoticonlistupdated)
    {
        this;
        JVM INSTR monitorenter ;
        context.getSharedPreferences("wear_request_data_cache", 0).edit().remove("emoticonDataRequestUri").apply();
        this;
        JVM INSTR monitorexit ;
        return;
        onemoticonlistupdated;
        throw onemoticonlistupdated;
    }

    public void putEmoticonListCacheDataUrl(String s)
    {
        context.getSharedPreferences("wear_request_data_cache", 0).edit().putString("emoticonDataRequestUri", s).apply();
    }
}
