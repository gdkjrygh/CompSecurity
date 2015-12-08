// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.util;

import android.content.Context;
import android.content.SharedPreferences;
import com.urbanairship.Logger;
import com.urbanairship.UAirship;

public class NotificationIDGenerator
{

    private static final int MAX_RANGE = 50;
    private static final String NEXT_ID_KEY = "count";
    private static final String SHARED_PREFERENCES_FILE = "com.urbanairship.notificationidgenerator";
    private static int range = 40;
    private static int start = 1000;

    public NotificationIDGenerator()
    {
    }

    private static int getInt(String s, int i)
    {
        return getPreferences().getInt(s, i);
    }

    private static SharedPreferences getPreferences()
    {
        return UAirship.shared().getApplicationContext().getSharedPreferences("com.urbanairship.notificationidgenerator", 0);
    }

    public static int getRange()
    {
        return range;
    }

    public static int getStart()
    {
        return start;
    }

    public static int nextID()
    {
        int i = getInt("count", start) + 1;
        if (i < start + range)
        {
            Logger.verbose("Incrementing notification id count");
            putInt("count", i);
        } else
        {
            Logger.verbose("Resetting notification id count");
            putInt("count", start);
        }
        Logger.verbose((new StringBuilder()).append("Notification id: ").append(i).toString());
        return i;
    }

    private static void putInt(String s, int i)
    {
        android.content.SharedPreferences.Editor editor = getPreferences().edit();
        editor.putInt(s, i);
        editor.commit();
    }

    public static void setRange(int i)
    {
        int j = i;
        if (i > 50)
        {
            Logger.error("The maximum numer of notifications allowed is 50. Limiting alert id range to conform.");
            j = 50;
        }
        putInt("count", start);
        range = j;
    }

    public static void setStart(int i)
    {
        putInt("count", i);
        start = i;
    }

}
