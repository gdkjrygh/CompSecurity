// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api.legacy.model;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.preference.PreferenceManager;
import com.soundcloud.android.storage.provider.Content;

public class ContentStats
{

    private static final Content CONTENTS[];
    public static final String NOTIFIED = "notified";
    public static final String NOTIFIED_ITEM = "notified.item";
    public static final String SEEN = "seen";
    private final Context context;

    public ContentStats(Context context1)
    {
        context = context1;
    }

    public static void clear(Context context1)
    {
        Content acontent[] = CONTENTS;
        int j = acontent.length;
        for (int i = 0; i < j; i++)
        {
            Content content = acontent[i];
            setLastSeen(context1, content, 1L);
            setLastNotified(context1, content, 1L);
            setLastNotifiedItem(context1, content, 1L);
        }

    }

    public static long getLastNotified(Context context1, Content content)
    {
        return PreferenceManager.getDefaultSharedPreferences(context1).getLong(prefKey(content, "notified"), 0L);
    }

    public static long getLastNotifiedItem(Context context1, Content content)
    {
        return PreferenceManager.getDefaultSharedPreferences(context1).getLong(prefKey(content, "notified.item"), 0L);
    }

    public static long getLastSeen(Context context1, Content content)
    {
        return PreferenceManager.getDefaultSharedPreferences(context1).getLong(prefKey(content, "seen"), 0L);
    }

    private static String prefKey(Content content, String s)
    {
        return (new StringBuilder("last.")).append(s).append(".").append(content.uri.toString()).toString();
    }

    public static void rewind(Context context1, long l)
    {
        Content acontent[] = CONTENTS;
        int j = acontent.length;
        for (int i = 0; i < j; i++)
        {
            Content content = acontent[i];
            setLastSeen(context1, content, Math.max(0L, getLastSeen(context1, content) - l));
            setLastNotified(context1, content, Math.max(0L, getLastNotified(context1, content) - l));
            setLastNotifiedItem(context1, content, Math.max(0L, getLastNotifiedItem(context1, content) - l));
        }

    }

    public static void setLastNotified(Context context1, Content content, long l)
    {
        setTimestamp(context1, "notified", content, l);
    }

    public static void setLastNotifiedItem(Context context1, Content content, long l)
    {
        setTimestamp(context1, "notified.item", content, l);
    }

    public static void setLastSeen(Context context1, Content content, long l)
    {
        setTimestamp(context1, "seen", content, l);
    }

    public static void setTimestamp(Context context1, String s, Content content, long l)
    {
        PreferenceManager.getDefaultSharedPreferences(context1).edit().putLong(prefKey(content, s), l).apply();
    }

    public long getLastNotifiedItem(Content content)
    {
        return getLastNotifiedItem(context, content);
    }

    public long getLastSeen(Content content)
    {
        return getLastSeen(context, content);
    }

    public void setLastNotified(Content content, long l)
    {
        setLastNotified(context, content, l);
    }

    public void setLastNotifiedItem(Content content, long l)
    {
        setLastNotifiedItem(context, content, l);
    }

    public void setLastSeen(Content content, long l)
    {
        setLastSeen(context, content, l);
    }

    static 
    {
        CONTENTS = (new Content[] {
            Content.ME_SOUND_STREAM, Content.ME_ACTIVITIES
        });
    }
}
