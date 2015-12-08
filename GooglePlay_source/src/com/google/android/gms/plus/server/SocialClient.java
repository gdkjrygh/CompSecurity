// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.server;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.analytics.Application;
import com.google.android.gms.common.util.AndroidUtils;
import com.google.android.gms.common.util.DeviceProperties;
import java.util.HashMap;

public final class SocialClient
{

    private static SocialClient sInstance;

    private SocialClient()
    {
    }

    public static void addHeaders(Context context, HashMap hashmap, String s)
    {
        String s1 = s;
        if (TextUtils.isEmpty(s))
        {
            s1 = Application.UNKNOWN;
        }
        String s2;
        if (DeviceProperties.isTablet(context.getResources()))
        {
            s = "3";
        } else
        {
            s = "2";
        }
        if (AndroidUtils.hasSystemSharedLibrary(context, "com.google.android.pano.v1"))
        {
            s = "9";
        }
        context = new StringBuilder();
        s2 = (String)hashmap.get("X-Api-Client");
        if (s2 != null && s2.length() > 0)
        {
            context.append(s2).append(';');
        }
        context.append("device=").append(s);
        context.append(';');
        context.append("platform=2");
        context.append(';');
        context.append("application=").append(s1);
        hashmap.put("X-Api-Client", context.toString());
    }

    public static SocialClient getInstance()
    {
        com/google/android/gms/plus/server/SocialClient;
        JVM INSTR monitorenter ;
        SocialClient socialclient;
        if (sInstance == null)
        {
            sInstance = new SocialClient();
        }
        socialclient = sInstance;
        com/google/android/gms/plus/server/SocialClient;
        JVM INSTR monitorexit ;
        return socialclient;
        Exception exception;
        exception;
        com/google/android/gms/plus/server/SocialClient;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
