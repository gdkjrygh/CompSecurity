// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.controller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class MediaScannerBroadcastReceiver extends BroadcastReceiver
{
    public static interface a
    {

        public abstract void a();

        public abstract void b();
    }


    private a a;

    public void onReceive(Context context, Intent intent)
    {
        context = intent.getAction();
        if (context.equals("android.intent.action.MEDIA_SCANNER_FINISHED"))
        {
            a.b();
        } else
        if (context.equals("android.intent.action.MEDIA_SCANNER_STARTED"))
        {
            a.a();
            return;
        }
    }
}
