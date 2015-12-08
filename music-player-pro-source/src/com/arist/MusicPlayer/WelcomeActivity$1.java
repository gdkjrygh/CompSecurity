// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.MusicPlayer;

import android.os.Handler;
import android.os.Message;
import android.widget.TextView;

// Referenced classes of package com.arist.MusicPlayer:
//            WelcomeActivity

class this._cls0 extends Handler
{

    final WelcomeActivity this$0;

    public void handleMessage(Message message)
    {
        WelcomeActivity.access$0(WelcomeActivity.this).setText(0x7f080035);
        super.handleMessage(message);
    }

    ()
    {
        this$0 = WelcomeActivity.this;
        super();
    }
}
