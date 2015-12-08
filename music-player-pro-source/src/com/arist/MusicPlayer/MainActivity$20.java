// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.MusicPlayer;

import android.content.Intent;
import android.view.MotionEvent;
import android.view.View;
import java.util.Timer;

// Referenced classes of package com.arist.MusicPlayer:
//            MainActivity

class this._cls0
    implements android.view.ener
{

    final MainActivity this$0;

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        if (1 == motionevent.getAction() && MainActivity.access$48(MainActivity.this) != null)
        {
            MainActivity.access$48(MainActivity.this).cancel();
            view = new Intent("com.MediaPlayer.action.SEEK");
            view.putExtra("seekProgress", MainActivity.access$50(MainActivity.this));
            sendBroadcast(view);
            MainActivity.access$49(MainActivity.this, false);
        }
        return false;
    }

    ()
    {
        this$0 = MainActivity.this;
        super();
    }
}
