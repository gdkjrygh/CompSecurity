// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.danlew.android.joda;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import java.util.TimeZone;
import org.joda.time.DateTimeZone;

public class TimeZoneChangedReceiver extends BroadcastReceiver
{

    public TimeZoneChangedReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        context = intent.getStringExtra("time-zone");
        try
        {
            DateTimeZone.setDefault(DateTimeZone.forTimeZone(TimeZone.getDefault()));
            Log.d("joda-time-android", (new StringBuilder()).append("TIMEZONE_CHANGED received, changed default timezone to \"").append(context).append("\"").toString());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            Log.e("joda-time-android", (new StringBuilder()).append("Could not recognize timezone id \"").append(context).append("\"").toString(), intent);
        }
    }
}
