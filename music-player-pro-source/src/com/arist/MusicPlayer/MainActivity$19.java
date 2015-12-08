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

class this._cls0
    implements android.view.Listener
{

    final MainActivity this$0;

    public boolean onLongClick(View view)
    {
        MainActivity.access$47(MainActivity.this, new Timer());
        MainActivity.access$48(MainActivity.this).schedule(new TimerTask() {

            int i;
            final MainActivity._cls19 this$1;

            public void run()
            {
                Message message = MainActivity.access$23(this$0).obtainMessage();
                message.what = 1;
                Bundle bundle = new Bundle();
                int j = i;
                i = j + 1;
                bundle.putInt("text", j);
                message.setData(bundle);
                MainActivity.access$23(this$0).sendMessage(message);
            }

            
            {
                this$1 = MainActivity._cls19.this;
                super();
                i = 1;
            }
        }, 0L, 100L);
        MainActivity.access$49(MainActivity.this, true);
        return true;
    }


    _cls1.i()
    {
        this$0 = MainActivity.this;
        super();
    }
}
