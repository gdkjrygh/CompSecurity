// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.search;

import android.content.SharedPreferences;
import com.soundcloud.android.rx.ScSchedulers;
import com.soundcloud.android.utils.CurrentDateProvider;
import com.soundcloud.android.utils.DateProvider;
import com.soundcloud.java.strings.Joiner;
import com.soundcloud.java.strings.Strings;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import rx.R;
import rx.b;

public class PlaylistTagStorage
{

    private static final long CACHE_EXPIRATION_TIME;
    private static final String KEY_LAST_SYNC_TIME = "tags_last_sync_time";
    private static final String KEY_POPULAR_TAGS = "popular_tags";
    private static final String KEY_RECENT_TAGS = "recent_tags";
    private static final int MAX_RECENT_TAGS = 5;
    private final DateProvider dateProvider;
    private final R scheduler;
    private final SharedPreferences sharedPreferences;

    public PlaylistTagStorage(SharedPreferences sharedpreferences, CurrentDateProvider currentdateprovider)
    {
        this(sharedpreferences, ((DateProvider) (currentdateprovider)), ScSchedulers.HIGH_PRIO_SCHEDULER);
    }

    PlaylistTagStorage(SharedPreferences sharedpreferences, DateProvider dateprovider, R r)
    {
        sharedPreferences = sharedpreferences;
        dateProvider = dateprovider;
        scheduler = r;
    }

    private List deserialize(String s)
    {
        return Arrays.asList(s.split(","));
    }

    private List getStoredTags(String s)
    {
        s = sharedPreferences.getString(s, "");
        if (Strings.isBlank(s))
        {
            return new LinkedList();
        } else
        {
            return deserialize(s);
        }
    }

    private String sanitizeTag(String s)
    {
        return s.replaceFirst(",.*", "");
    }

    private String serialize(List list)
    {
        return Strings.joinOn(",").join(list);
    }

    public void addRecentTag(String s)
    {
        LinkedList linkedlist = new LinkedList(getRecentTags());
        if (linkedlist.contains(s))
        {
            return;
        }
        if (linkedlist.size() == 5)
        {
            linkedlist.removeLast();
        }
        linkedlist.addFirst(sanitizeTag(s));
        sharedPreferences.edit().putString("recent_tags", serialize(linkedlist)).apply();
    }

    public void cachePopularTags(List list)
    {
        android.content.SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("popular_tags", serialize(list));
        editor.putLong("tags_last_sync_time", dateProvider.getCurrentTime());
        editor.apply();
    }

    public void clear()
    {
        sharedPreferences.edit().clear().apply();
    }

    List getPopularTags()
    {
        return getStoredTags("popular_tags");
    }

    public b getPopularTagsAsync()
    {
        return b.create(new _cls2()).subscribeOn(scheduler);
    }

    List getRecentTags()
    {
        return getStoredTags("recent_tags");
    }

    public b getRecentTagsAsync()
    {
        return b.create(new _cls1()).subscribeOn(scheduler);
    }

    public boolean isTagsCacheExpired()
    {
        long l = sharedPreferences.getLong("tags_last_sync_time", 0L);
        return dateProvider.getCurrentTime() - l > CACHE_EXPIRATION_TIME;
    }

    static 
    {
        CACHE_EXPIRATION_TIME = TimeUnit.DAYS.toMillis(1L);
    }

    private class _cls2
        implements rx.b.f
    {

        final PlaylistTagStorage this$0;

        public volatile void call(Object obj)
        {
            call((X)obj);
        }

        public void call(X x)
        {
            x.onNext(getPopularTags());
            x.onCompleted();
        }

        _cls2()
        {
            this$0 = PlaylistTagStorage.this;
            super();
        }
    }


    private class _cls1
        implements rx.b.f
    {

        final PlaylistTagStorage this$0;

        public volatile void call(Object obj)
        {
            call((X)obj);
        }

        public void call(X x)
        {
            x.onNext(getRecentTags());
            x.onCompleted();
        }

        _cls1()
        {
            this$0 = PlaylistTagStorage.this;
            super();
        }
    }

}
