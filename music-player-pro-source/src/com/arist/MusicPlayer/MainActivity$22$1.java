// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.MusicPlayer;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import java.util.Timer;
import java.util.TimerTask;

// Referenced classes of package com.arist.MusicPlayer:
//            MainActivity

class i extends TimerTask
{

    int i;
    final is._cls0 this$1;

    public void run()
    {
        Message message = MainActivity.access$23(_fld0).obtainMessage();
        message.what = 2;
        Bundle bundle = new Bundle();
        int j = i;
        i = j + 1;
        bundle.putInt("text", j);
        message.setData(bundle);
        MainActivity.access$23(_fld0).sendMessage(message);
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
        i = 1;
    }

    // Unreferenced inner class com/arist/MusicPlayer/MainActivity$22

/* anonymous class */
    class MainActivity._cls22
        implements android.view.View.OnLongClickListener
    {

        final MainActivity this$0;

        public boolean onLongClick(View view)
        {
            MainActivity.access$47(MainActivity.this, new Timer());
            MainActivity.access$48(MainActivity.this).schedule(new MainActivity._cls22._cls1(), 0L, 100L);
            MainActivity.access$49(MainActivity.this, true);
            return true;
        }


            
            {
                this$0 = MainActivity.this;
                super();
            }
    }

}
