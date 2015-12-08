// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.service;

import com.arist.MusicPlayer.MyApplication;
import com.arist.notify.MyNotiofation;

// Referenced classes of package com.arist.service:
//            MusicPlayService

class this._cls0
    implements Runnable
{

    final MusicPlayService this$0;

    public void run()
    {
        if (MyApplication.getInstance().isPlaying())
        {
            MyNotiofation.sendNotify(getApplicationContext(), MusicPlayService.access$12(MusicPlayService.this));
            return;
        } else
        {
            MyNotiofation.clearNotification();
            return;
        }
    }

    ()
    {
        this$0 = MusicPlayService.this;
        super();
    }
}
