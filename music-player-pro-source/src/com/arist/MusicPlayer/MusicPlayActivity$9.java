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

class this._cls0 extends Handler
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
            (new Thread() {

                final MusicPlayActivity._cls9 this$1;

                public void run()
                {
                    try
                    {
                        MusicPlayActivity.access$17(this$0, MusicPlayActivity.access$18(this$0).Read(MusicPlayActivity.access$16(this$0)));
                    }
                    catch (Exception exception) { }
                    if (MusicPlayActivity.access$3(this$0) != null)
                    {
                        MusicPlayActivity.access$4(this$0).setLyricList(MusicPlayActivity.access$3(this$0));
                    }
                    MusicPlayActivity.access$6(this$0).post(lyricRunnable);
                }

            
            {
                this$1 = MusicPlayActivity._cls9.this;
                super();
            }
            }).start();
            MusicPlayActivity.access$19(MusicPlayActivity.this);
        }
        super.handleMessage(message);
    }


    _cls1.this._cls1()
    {
        this$0 = MusicPlayActivity.this;
        super();
    }
}
