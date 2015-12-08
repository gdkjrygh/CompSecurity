// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.analytics.framework;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.snapchat.android.Timber;
import java.io.UnsupportedEncodingException;
import java.util.UUID;

public class UniqueDeviceIdBuilder
{

    public UniqueDeviceIdBuilder()
    {
    }

    public static UUID a(Context context)
    {
        UUID uuid = b(context);
        if (uuid == null)
        {
            c(context);
        }
        context = uuid;
        if (uuid == null)
        {
            context = UUID.randomUUID();
        }
        return context;
    }

    private static UUID b(Context context)
    {
        context = android.provider.Settings.Secure.getString(context.getContentResolver(), "android_id");
        if (TextUtils.equals(context, "9774d56d682e549c") || context == null)
        {
            return null;
        }
        try
        {
            context = UUID.nameUUIDFromBytes(context.getBytes("utf8"));
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Timber.a("UniqueDeviceIdentifier", context);
            return null;
        }
        return context;
    }

    private static UUID c(Context context)
    {
        context = ((TelephonyManager)context.getSystemService("phone")).getDeviceId();
        if (context == null)
        {
            return null;
        }
        try
        {
            context = UUID.nameUUIDFromBytes(context.getBytes("utf8"));
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Timber.a("UniqueDeviceIdentifier", context);
            return null;
        }
        return context;
    }
}
