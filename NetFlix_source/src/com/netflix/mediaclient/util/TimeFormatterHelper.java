// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.util;

import com.netflix.mediaclient.Log;
import java.util.Formatter;
import java.util.Locale;

public class TimeFormatterHelper
{

    private static final String HOUR_FORMAT = "%d:%02d:%02d";
    private static final String MINUTE_FORMAT = "%02d:%02d";
    private static final String TAG = "TimeFormatterHelper";
    private final StringBuilder formatBuilder = new StringBuilder();
    private final Formatter formatter;

    public TimeFormatterHelper()
    {
        formatter = new Formatter(formatBuilder, Locale.getDefault());
    }

    public String getStringForMs(int i)
    {
        return getStringForSeconds(i / 1000);
    }

    public String getStringForSeconds(int i)
    {
        formatBuilder.setLength(0);
        if (i < 0)
        {
            Log.w("TimeFormatterHelper", (new StringBuilder()).append("Received negative time: ").append(i).toString());
            return formatter.format("%02d:%02d", new Object[] {
                Integer.valueOf(0), Integer.valueOf(0)
            }).toString();
        }
        int j = i % 60;
        int k = (i / 60) % 60;
        i /= 3600;
        if (i > 0)
        {
            return formatter.format("%d:%02d:%02d", new Object[] {
                Integer.valueOf(i), Integer.valueOf(k), Integer.valueOf(j)
            }).toString();
        } else
        {
            return formatter.format("%02d:%02d", new Object[] {
                Integer.valueOf(k), Integer.valueOf(j)
            }).toString();
        }
    }
}
