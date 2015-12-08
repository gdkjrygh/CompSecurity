// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesUtil;

// Referenced classes of package com.google.android.gms.auth:
//            GoogleAuthUtil

private static class lz extends Handler
{

    private final Context lz;

    public void handleMessage(Message message)
    {
        if (message.what == 1)
        {
            int i = GooglePlayServicesUtil.isGooglePlayServicesAvailable(lz);
            if (GooglePlayServicesUtil.isUserRecoverableError(i))
            {
                GooglePlayServicesUtil.showErrorNotification(i, lz);
            }
            return;
        } else
        {
            Log.wtf("GoogleAuthUtil", (new StringBuilder()).append("Don't know how to handle this message: ").append(message.what).toString());
            return;
        }
    }

    cesUtil(Context context)
    {
        Looper looper;
        if (Looper.myLooper() == null)
        {
            looper = Looper.getMainLooper();
        } else
        {
            looper = Looper.myLooper();
        }
        super(looper);
        lz = context;
    }
}
