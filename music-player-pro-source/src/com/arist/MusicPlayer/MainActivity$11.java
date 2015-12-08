// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.MusicPlayer;

import android.content.Intent;
import android.view.View;
import com.arist.notify.MyNotiofation;
import net.coocent.android.exitwithrate.EnterAndExit;

// Referenced classes of package com.arist.MusicPlayer:
//            MainActivity, MyApplication

class this._cls0
    implements android.view.ener
{

    final MainActivity this$0;

    public void onClick(View view)
    {
        MyNotiofation.clearNotification();
        MyApplication.status = 3;
        sendBroadcast(new Intent("com.MediaPlayer.action.STATUS_CHANGED"));
        (new EnterAndExit(MainActivity.this)).exitWithRate(isExitAdLoad, mExitAdview);
    }

    AndExit()
    {
        this$0 = MainActivity.this;
        super();
    }
}
