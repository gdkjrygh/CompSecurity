// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.plugin.gcm;

import android.content.Context;
import com.google.android.gcm.GCMBroadcastReceiver;

public class CordovaGCMBroadcastReceiver extends GCMBroadcastReceiver
{

    public CordovaGCMBroadcastReceiver()
    {
    }

    protected String getGCMIntentServiceClassName(Context context)
    {
        return "com.plugin.gcm.GCMIntentService";
    }
}
