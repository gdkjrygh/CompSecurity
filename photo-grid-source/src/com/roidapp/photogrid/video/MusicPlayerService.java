// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.video;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import com.roidapp.baselib.c.t;
import java.util.concurrent.AbstractExecutorService;

// Referenced classes of package com.roidapp.photogrid.video:
//            k, i, l, j

public class MusicPlayerService extends Service
    implements android.media.MediaPlayer.OnCompletionListener, android.media.MediaPlayer.OnErrorListener, android.media.MediaPlayer.OnInfoListener, android.media.MediaPlayer.OnPreparedListener
{

    private final IBinder a = new k(this);
    private MediaPlayer b;
    private HandlerThread c;
    private Handler d;
    private BroadcastReceiver e;

    public MusicPlayerService()
    {
        b = null;
        c = null;
        d = null;
        e = new i(this);
    }

    static Handler a(MusicPlayerService musicplayerservice)
    {
        return musicplayerservice.d;
    }

    private void a()
    {
        this;
        JVM INSTR monitorenter ;
        MediaPlayer mediaplayer = b;
        if (mediaplayer != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        mediaplayer = b;
        b = null;
        if (mediaplayer == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        mediaplayer.setOnErrorListener(null);
        mediaplayer.setOnPreparedListener(null);
        mediaplayer.setOnBufferingUpdateListener(null);
        mediaplayer.setOnInfoListener(null);
        if (mediaplayer.isPlaying())
        {
            mediaplayer.stop();
        }
        t.b().execute(new l(this, mediaplayer));
        continue; /* Loop/switch isn't completed */
        Throwable throwable;
        throwable;
        (new StringBuilder("System Player Error:")).append(throwable.getMessage());
        if (mediaplayer == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        t.b().execute(new l(this, mediaplayer));
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    static void a(MusicPlayerService musicplayerservice, String s)
    {
        musicplayerservice.a(s);
    }

    private void a(String s)
    {
        this;
        JVM INSTR monitorenter ;
        a();
        if (b == null)
        {
            b = new MediaPlayer();
        }
        b.reset();
        b.setOnPreparedListener(this);
        b.setOnCompletionListener(this);
        b.setOnInfoListener(this);
        b.setOnErrorListener(this);
        if (!s.startsWith("http://")) goto _L2; else goto _L1
_L1:
        b.setDataSource(this, Uri.parse(s));
_L3:
        b.prepareAsync();
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        b.setDataSource(s);
          goto _L3
        s;
        (new StringBuilder("System Player Error:")).append(s.getMessage());
        try
        {
            if (b != null)
            {
                b.release();
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        b = null;
          goto _L4
        s;
        throw s;
          goto _L3
    }

    static void b(MusicPlayerService musicplayerservice)
    {
        musicplayerservice.a();
    }

    public IBinder onBind(Intent intent)
    {
        return a;
    }

    public void onCompletion(MediaPlayer mediaplayer)
    {
        a();
        mediaplayer = new Intent();
        mediaplayer.setAction("MusicPlayerServic.onComplete");
        sendBroadcast(mediaplayer);
    }

    public void onCreate()
    {
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("MusicPlayerService.PlayMusic");
        intentfilter.addAction("MusicPlayerService.StopMusic");
        c = new HandlerThread("Music");
        c.start();
        d = new Handler(c.getLooper(), new j(this));
        registerReceiver(e, intentfilter);
    }

    public void onDestroy()
    {
        if (d != null)
        {
            d.removeMessages(1);
            d.sendMessage(d.obtainMessage(2));
            c.quit();
            d = null;
            c = null;
        }
        a();
        a();
    }

    public boolean onError(MediaPlayer mediaplayer, int i1, int j1)
    {
        while (b != mediaplayer || b == null) 
        {
            return false;
        }
        a();
        mediaplayer = new Intent("MusicPlayerService.onError");
        mediaplayer.putExtra("what", i1);
        mediaplayer.putExtra("extra", j1);
        sendBroadcast(mediaplayer);
        return true;
    }

    public boolean onInfo(MediaPlayer mediaplayer, int i1, int j1)
    {
        while (b != mediaplayer || b == null) 
        {
            return false;
        }
        mediaplayer = new Intent("MusicPlayerService.onInfo");
        mediaplayer.putExtra("what", i1);
        mediaplayer.putExtra("extra", j1);
        sendBroadcast(mediaplayer);
        return false;
    }

    public void onPrepared(MediaPlayer mediaplayer)
    {
        while (b != mediaplayer || b == null) 
        {
            return;
        }
        b.start();
        sendBroadcast(new Intent("MusicPlayerService.onPrepared"));
    }

    public void onStart(Intent intent, int i1)
    {
        (new StringBuilder("onStart() called, instance=")).append(hashCode());
    }
}
