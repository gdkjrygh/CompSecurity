// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.facebookinvites;

import android.content.SharedPreferences;
import com.soundcloud.android.utils.CurrentDateProvider;
import com.soundcloud.android.utils.DateProvider;

public class FacebookInvitesStorage
{

    public static final String LAST_CLICK = "last_click";
    public static final String LAST_DISMISS = "last_dismiss";
    public static final String TIMES_APP_OPENED = "times_app_opened";
    public static final String TIMES_DISMISSED = "times_dismissed";
    private final DateProvider dateProvider;
    private final SharedPreferences sharedPreferences;

    public FacebookInvitesStorage(SharedPreferences sharedpreferences, CurrentDateProvider currentdateprovider)
    {
        sharedPreferences = sharedpreferences;
        dateProvider = currentdateprovider;
    }

    private int getCounter(String s)
    {
        return sharedPreferences.getInt(s, 0);
    }

    private long getTimestamp(String s)
    {
        return sharedPreferences.getLong(s, 0L);
    }

    private void incrementCounter(String s)
    {
        setCounter(s, getCounter(s) + 1);
    }

    private long millisSince(String s)
    {
        return dateProvider.getCurrentTime() - getTimestamp(s);
    }

    private void setCounter(String s, int i)
    {
        sharedPreferences.edit().putInt(s, i).apply();
    }

    private void setCurrentTimestamp(String s)
    {
        setTimestamp(s, dateProvider.getCurrentTime());
    }

    private void setTimestamp(String s, long l)
    {
        sharedPreferences.edit().putLong(s, l).apply();
    }

    public long getMillisSinceLastClick()
    {
        return millisSince("last_click");
    }

    public long getMillisSinceLastDismiss()
    {
        return millisSince("last_dismiss");
    }

    public int getTimesAppOpened()
    {
        return getCounter("times_app_opened");
    }

    public int getTimesDismissed()
    {
        return getCounter("times_dismissed");
    }

    public void resetDismissed()
    {
        setTimestamp("last_dismiss", 0L);
        setCounter("times_dismissed", 0);
    }

    public void setAppOpened()
    {
        incrementCounter("times_app_opened");
    }

    public void setClicked()
    {
        setCurrentTimestamp("last_click");
        resetDismissed();
    }

    public void setDismissed()
    {
        incrementCounter("times_dismissed");
        setCurrentTimestamp("last_dismiss");
    }

    public void setLastClick(long l)
    {
        setTimestamp("last_click", l);
    }

    public void setTimesAppOpened(int i)
    {
        setCounter("times_app_opened", i);
    }
}
