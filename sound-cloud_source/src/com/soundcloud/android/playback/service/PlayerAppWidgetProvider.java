// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.service;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.playback.widget.PlayerWidgetController;
import dagger.b;

public class PlayerAppWidgetProvider extends AppWidgetProvider
{

    PlayerWidgetController controller;

    public PlayerAppWidgetProvider()
    {
    }

    public void onUpdate(Context context, AppWidgetManager appwidgetmanager, int ai[])
    {
        SoundCloudApplication.getObjectGraph().a(this);
        controller.update();
    }
}
