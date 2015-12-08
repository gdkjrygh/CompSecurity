// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap;

import android.content.Context;
import org.apache.cordova.CordovaWebView;

public class WLWebView extends CordovaWebView
{

    public WLWebView(Context context)
    {
        super(context);
    }

    public void pauseTimers()
    {
    }

    public void pauseTimers(boolean flag)
    {
        super.pauseTimers();
    }
}
