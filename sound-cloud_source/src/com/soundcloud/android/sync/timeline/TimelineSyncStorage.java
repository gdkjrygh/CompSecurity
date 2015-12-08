// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync.timeline;

import android.content.SharedPreferences;
import com.soundcloud.android.api.model.Link;
import com.soundcloud.java.optional.Optional;

public class TimelineSyncStorage
{

    private static final String PREFS_FUTURE_URL = "future_url";
    private static final String PREFS_NEXT_URL = "next_url";
    private final SharedPreferences prefs;

    public TimelineSyncStorage(SharedPreferences sharedpreferences)
    {
        prefs = sharedpreferences;
    }

    public void clear()
    {
        prefs.edit().clear().apply();
    }

    public String getFuturePageUrl()
    {
        return prefs.getString("future_url", "");
    }

    public String getNextPageUrl()
    {
        return prefs.getString("next_url", "");
    }

    public boolean hasNextPageUrl()
    {
        return prefs.contains("next_url");
    }

    public boolean isMissingFuturePageUrl()
    {
        return !prefs.contains("future_url");
    }

    public void storeFuturePageUrl(Link link)
    {
        link = link.getHref();
        prefs.edit().putString("future_url", link).apply();
    }

    public void storeNextPageUrl(Optional optional)
    {
        if (optional.isPresent())
        {
            optional = ((Link)optional.get()).getHref();
            prefs.edit().putString("next_url", optional).apply();
            return;
        } else
        {
            prefs.edit().remove("next_url").apply();
            return;
        }
    }
}
