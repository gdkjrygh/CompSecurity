// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.service;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.arist.activity.MyApplication;
import com.arist.c.f;
import com.arist.c.j;
import java.util.TimerTask;

// Referenced classes of package com.arist.service:
//            MusicPlayService

final class g extends TimerTask
{

    final MusicPlayService a;

    g(MusicPlayService musicplayservice)
    {
        a = musicplayservice;
        super();
    }

    public final void run()
    {
        Context context;
        MusicPlayService.a(a, MyApplication.e.d());
        Log.i("MusicPlayService", (new StringBuilder("\u7761\u7720 \u9000\u51FA planeModeSet = ")).append(MusicPlayService.k(a)).toString());
        a.stopSelf();
        if (MusicPlayService.k(a) != 2 || j.a(a.getApplicationContext()))
        {
            break MISSING_BLOCK_LABEL_122;
        }
        Log.i("MusicPlayService", "\u8BBE\u7F6E\u98DE\u884C\u98DE\u884C\u6A21\u5F0F");
        context = a.getApplicationContext();
        android.provider.Settings.System.putInt(context.getContentResolver(), "airplane_mode_on", 1);
        Intent intent = new Intent("android.intent.action.AIRPLANE_MODE");
        intent.putExtra("state", true);
        context.sendBroadcast(intent);
        return;
        Exception exception;
        exception;
        exception.printStackTrace();
        return;
    }
}
