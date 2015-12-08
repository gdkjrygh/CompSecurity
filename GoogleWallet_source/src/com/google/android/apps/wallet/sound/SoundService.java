// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.sound;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.IBinder;
import com.google.android.apps.wallet.logging.WLog;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.apps.wallet.sound:
//            SoundRegistry

public class SoundService extends Service
{

    private static final String TAG = com/google/android/apps/wallet/sound/SoundService.getSimpleName();
    private final ExecutorService executorService = Executors.newSingleThreadExecutor();
    private final MediaPlayer mediaPlayer = new MediaPlayer();
    private Uri paymentFailureToneDefaultUri;
    private Uri paymentSuccessToneUri;

    public SoundService()
    {
    }

    public IBinder onBind(Intent intent)
    {
        return null;
    }

    public void onCreate()
    {
        super.onCreate();
        paymentSuccessToneUri = SoundRegistry.getSound(this, 1);
        paymentFailureToneDefaultUri = SoundRegistry.getSound(this, 2);
    }

    public void onDestroy()
    {
        boolean flag;
        super.onDestroy();
        if (mediaPlayer.isPlaying())
        {
            mediaPlayer.stop();
        }
        mediaPlayer.release();
        executorService.shutdown();
        flag = false;
        boolean flag1 = executorService.awaitTermination(60L, TimeUnit.SECONDS);
        flag = flag1;
_L1:
        InterruptedException interruptedexception;
        if (!flag)
        {
            throw new RuntimeException("mExecutorService not stopped.");
        } else
        {
            return;
        }
        interruptedexception;
        Thread.currentThread().interrupt();
          goto _L1
    }

    public int onStartCommand(final Intent uri, int i, final int startId)
    {
        if ("com.google.android.apps.wallet.services.misc.SoundService.PLAY".equals(uri.getAction())) goto _L2; else goto _L1
_L1:
        return 2;
_L2:
        uri = uri.getStringExtra("soundName");
        if (!"paymentSuccess".equals(uri))
        {
            continue; /* Loop/switch isn't completed */
        }
        uri = paymentSuccessToneUri;
_L4:
        executorService.execute(new Runnable() {

            final SoundService this$0;
            final int val$startId;
            final Uri val$uri;

            public final void run()
            {
                if (mediaPlayer.isPlaying())
                {
                    mediaPlayer.stop();
                }
                mediaPlayer.reset();
                String s = SoundService.TAG;
                String s1 = String.valueOf(uri);
                WLog.v(s, (new StringBuilder(String.valueOf(s1).length() + 15)).append("Playing sound: ").append(s1).toString());
                try
                {
                    mediaPlayer.setDataSource(SoundService.this, uri);
                    mediaPlayer.setAudioStreamType(5);
                    mediaPlayer.prepare();
                    mediaPlayer.start();
                }
                catch (IOException ioexception) { }
                mediaPlayer.setOnCompletionListener(new android.media.MediaPlayer.OnCompletionListener() {

                    final _cls1 this$1;

                    public final void onCompletion(MediaPlayer mediaplayer)
                    {
                        if (stopSelfResult(startId))
                        {
                            WLog.dfmt(SoundService.TAG, "Stopping service, startId=%s", new Object[] {
                                Integer.valueOf(startId)
                            });
                        }
                    }

            
            {
                this$1 = _cls1.this;
                super();
            }
                });
            }

            
            {
                this$0 = SoundService.this;
                uri = uri1;
                startId = i;
                super();
            }
        });
        return 2;
        if (!"paymentFailure".equals(uri)) goto _L1; else goto _L3
_L3:
        uri = paymentFailureToneDefaultUri;
          goto _L4
        if (true) goto _L1; else goto _L5
_L5:
    }



}
