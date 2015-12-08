// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.danlew.android.joda;

import android.content.Context;
import android.content.IntentFilter;
import java.io.IOException;
import org.joda.time.DateTimeZone;

// Referenced classes of package net.danlew.android.joda:
//            ResourceZoneInfoProvider, TimeZoneChangedReceiver

public final class JodaTimeAndroid
{

    private static boolean sInitCalled = false;

    private JodaTimeAndroid()
    {
        throw new AssertionError();
    }

    public static void init(Context context)
    {
        if (sInitCalled)
        {
            return;
        }
        sInitCalled = true;
        try
        {
            DateTimeZone.setProvider(new ResourceZoneInfoProvider(context));
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new RuntimeException("Could not read ZoneInfoMap");
        }
        context.getApplicationContext().registerReceiver(new TimeZoneChangedReceiver(), new IntentFilter("android.intent.action.TIMEZONE_CHANGED"));
    }

}
