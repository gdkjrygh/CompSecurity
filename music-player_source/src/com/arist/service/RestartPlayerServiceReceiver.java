// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.util.Log;
import com.arist.activity.MyApplication;
import com.arist.c.a;
import com.arist.c.j;

// Referenced classes of package com.arist.service:
//            DeskLrcService, MusicPlayService, q

public class RestartPlayerServiceReceiver extends BroadcastReceiver
{

    public RestartPlayerServiceReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        Log.i("RestartPlayerServiceReceiver", intent.getAction());
        if (a.C.equals(intent.getAction()) && MyApplication.r && !j.a(context, com/arist/service/DeskLrcService.getName()))
        {
            context.startService(new Intent(MyApplication.q, com/arist/service/DeskLrcService));
            return;
        }
        if (!MusicPlayService.b)
        {
            Log.i("RestartPlayerServiceReceiver", "\u6CA1\u6709\u5728\u8FD0\u884C");
            Intent intent1 = new Intent(MyApplication.q, com/arist/service/MusicPlayService);
            intent1.putExtra("from", "RestartPlayerServiceReceiver");
            context.startService(intent1);
            (new Handler()).postDelayed(new q(this, context, intent), 200L);
            return;
        } else
        {
            Log.i("RestartPlayerServiceReceiver", "\u6B63\u5728\u8FD0\u884C");
            return;
        }
    }
}
