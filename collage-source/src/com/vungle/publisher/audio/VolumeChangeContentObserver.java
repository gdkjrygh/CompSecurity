// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.audio;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import com.vungle.log.Logger;
import com.vungle.publisher.aq;
import com.vungle.publisher.device.AudioHelper;
import com.vungle.publisher.event.EventBus;

public class VolumeChangeContentObserver extends ContentObserver
{

    private static final Handler g = new Handler();
    public volatile int a;
    public boolean b;
    public AudioHelper c;
    com.vungle.publisher.aq.a d;
    EventBus e;
    public Context f;

    VolumeChangeContentObserver()
    {
        super(g);
        b = false;
    }

    public void onChange(boolean flag)
    {
        EventBus eventbus;
        com.vungle.publisher.aq.a a1;
        aq aq1;
        int i;
        int j;
        try
        {
            super.onChange(flag);
            i = a;
            j = c.b();
            a = j;
        }
        catch (Exception exception)
        {
            Logger.e("VungleDevice", exception);
            return;
        }
        if (j == i)
        {
            break MISSING_BLOCK_LABEL_136;
        }
        Logger.v("VungleDevice", (new StringBuilder("volume changed ")).append(i).append(" --> ").append(j).toString());
        eventbus = e;
        a1 = d;
        aq1 = new aq();
        aq1.b = a1.a.b();
        aq1.d = a1.a.c();
        aq1.a = i;
        aq1.c = a1.a.a(i);
        eventbus.a(aq1);
    }

}
