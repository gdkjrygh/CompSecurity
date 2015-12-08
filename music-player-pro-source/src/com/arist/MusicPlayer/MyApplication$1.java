// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.MusicPlayer;

import android.content.Intent;
import com.arist.service.MusicPlayService;
import java.util.Timer;
import java.util.TimerTask;

// Referenced classes of package com.arist.MusicPlayer:
//            MyApplication

class this._cls0 extends TimerTask
{

    final MyApplication this$0;

    public void run()
    {
        Intent intent = new Intent(MyApplication.context, com/arist/service/MusicPlayService);
        startService(intent);
        MyApplication.timerStartService.cancel();
    }

    ()
    {
        this$0 = MyApplication.this;
        super();
    }
}
