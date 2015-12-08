// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.sound;

import android.media.MediaPlayer;
import android.net.Uri;
import com.google.android.apps.wallet.logging.WLog;
import java.io.IOException;

// Referenced classes of package com.google.android.apps.wallet.sound:
//            SoundService

final class this._cls1
    implements android.media.pletionListener
{

    final l.startId this$1;

    public final void onCompletion(MediaPlayer mediaplayer)
    {
        if (stopSelfResult(startId))
        {
            WLog.dfmt(SoundService.access$100(), "Stopping service, startId=%s", new Object[] {
                Integer.valueOf(startId)
            });
        }
    }

    l.startId()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/google/android/apps/wallet/sound/SoundService$1

/* anonymous class */
    final class SoundService._cls1
        implements Runnable
    {

        final SoundService this$0;
        final int val$startId;
        final Uri val$uri;

        public final void run()
        {
            if (SoundService.access$000(SoundService.this).isPlaying())
            {
                SoundService.access$000(SoundService.this).stop();
            }
            SoundService.access$000(SoundService.this).reset();
            String s = SoundService.access$100();
            String s1 = String.valueOf(uri);
            WLog.v(s, (new StringBuilder(String.valueOf(s1).length() + 15)).append("Playing sound: ").append(s1).toString());
            try
            {
                SoundService.access$000(SoundService.this).setDataSource(SoundService.this, uri);
                SoundService.access$000(SoundService.this).setAudioStreamType(5);
                SoundService.access$000(SoundService.this).prepare();
                SoundService.access$000(SoundService.this).start();
            }
            catch (IOException ioexception) { }
            SoundService.access$000(SoundService.this).setOnCompletionListener(new SoundService._cls1._cls1());
        }

            
            {
                this$0 = final_soundservice;
                uri = uri1;
                startId = I.this;
                super();
            }
    }

}
