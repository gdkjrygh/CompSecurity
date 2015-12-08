// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.MusicPlayer;

import android.os.Handler;
import android.os.Message;
import com.arist.MyView.LyricView;
import com.arist.util.LrcRead;

// Referenced classes of package com.arist.MusicPlayer:
//            MusicPlayActivity

class this._cls1 extends Thread
{

    final cRunnable this$1;

    public void run()
    {
        try
        {
            MusicPlayActivity.access$17(_fld0, MusicPlayActivity.access$18(_fld0).Read(MusicPlayActivity.access$16(_fld0)));
        }
        catch (Exception exception) { }
        if (MusicPlayActivity.access$3(_fld0) != null)
        {
            MusicPlayActivity.access$4(_fld0).setLyricList(MusicPlayActivity.access$3(_fld0));
        }
        MusicPlayActivity.access$6(_fld0).post(lyricRunnable);
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/arist/MusicPlayer/MusicPlayActivity$9

/* anonymous class */
    class MusicPlayActivity._cls9 extends Handler
    {

        final MusicPlayActivity this$0;

        public void handleMessage(Message message)
        {
            if (message.what == 3)
            {
                MusicPlayActivity.access$15(MusicPlayActivity.this, MusicPlayActivity.access$14(MusicPlayActivity.this));
                if (MusicPlayActivity.access$16(MusicPlayActivity.this) == null)
                {
                    MusicPlayActivity.access$17(MusicPlayActivity.this, null);
                    MusicPlayActivity.access$6(MusicPlayActivity.this).post(lyricRunnable);
                    return;
                }
                (new MusicPlayActivity._cls9._cls1()).start();
                MusicPlayActivity.access$19(MusicPlayActivity.this);
            }
            super.handleMessage(message);
        }


            
            {
                this$0 = MusicPlayActivity.this;
                super();
            }
    }

}
