// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.music.internal.receiver;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.spotify.mobile.android.service.LoggerProvider;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.viewuri.Verified;
import dmz;
import fop;

public class LoggerReceiver extends BroadcastReceiver
{

    public LoggerReceiver()
    {
    }

    public static Intent a(Context context, Verified verified, com.spotify.mobile.android.util.viewuri.ViewUri.SubView subview, ClientEvent clientevent)
    {
        Assertion.a(context);
        Assertion.a(verified);
        Assertion.a(subview);
        Assertion.a(clientevent);
        Assertion.a((fop)dmz.a(fop));
        verified = fop.b(context, verified, subview, clientevent);
        Assertion.a(verified);
        subview = new Intent("com.spotify.music.internal.receiver.CACHE_LOG");
        subview.putExtras(verified);
        subview.setClass(context, com/spotify/music/internal/receiver/LoggerReceiver);
        return subview;
    }

    public void onReceive(Context context, Intent intent)
    {
        Assertion.a(intent);
        Assertion.a("com.spotify.music.internal.receiver.CACHE_LOG", intent.getAction());
        Assertion.a(com/spotify/music/internal/receiver/LoggerReceiver.getName(), intent.getComponent().getClassName());
        intent = intent.getExtras();
        if (intent == null || intent.isEmpty())
        {
            Assertion.b(String.format("System sent null or empty extras: %s", new Object[] {
                intent
            }));
            return;
        } else
        {
            LoggerProvider.a(context, intent);
            return;
        }
    }
}
