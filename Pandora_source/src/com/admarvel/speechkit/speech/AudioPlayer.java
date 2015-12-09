// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.speechkit.speech;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.widget.MediaController;
import com.admarvel.android.ads.AdMarvelInternalWebView;
import com.admarvel.android.util.Logging;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;

public class AudioPlayer
    implements android.widget.MediaController.MediaPlayerControl
{

    private Runnable audioPositionUpdateCallback;
    private Context context;
    private boolean controls;
    private Handler handler;
    private HashMap hashMap;
    private volatile int lastPosition;
    private boolean loop;
    private MediaController mediaController;
    private MediaPlayer mediaPlayer;
    private AdMarvelInternalWebView parentView;
    private int positionUpdatePeriodMs;

    public AudioPlayer(Context context1, AdMarvelInternalWebView admarvelinternalwebview)
    {
        controls = false;
        loop = false;
        positionUpdatePeriodMs = -1;
        lastPosition = 0;
        handler = new Handler(Looper.getMainLooper());
        audioPositionUpdateCallback = new Runnable() {

            final AudioPlayer this$0;

            public void run()
            {
                if (!isPlaying())
                {
                    Logging.log("Not firing AudioPositionChangeEvent -- not playing");
                } else
                if (mediaPlayer != null)
                {
                    int i = mediaPlayer.getCurrentPosition();
                    if (i == lastPosition)
                    {
                        Logging.log("Not firing AudioPositionChangeEvent -- didn't change");
                        return;
                    }
                    lastPosition = i;
                    Logging.log((new StringBuilder("Firing AudioPositonChangeEvent() position=")).append(i).toString());
                    if (parentView != null && parentView.audioPositionChangeCallback != null && parentView.audioPositionChangeCallback.length() > 0)
                    {
                        String s = (new StringBuilder("window.")).append(parentView.audioPositionChangeCallback).append("(").append(i).append(");").toString();
                        parentView.injectJavaScript(s);
                    }
                    handler.postDelayed(audioPositionUpdateCallback, positionUpdatePeriodMs);
                    return;
                }
            }

            
            {
                this$0 = AudioPlayer.this;
                super();
            }
        };
        context = context1;
        parentView = admarvelinternalwebview;
        hashMap = new HashMap();
    }

    private android.media.MediaPlayer.OnCompletionListener createCompletionListener()
    {
        return new android.media.MediaPlayer.OnCompletionListener() {

            final AudioPlayer this$0;

            public void onCompletion(MediaPlayer mediaplayer)
            {
                handler.removeCallbacks(audioPositionUpdateCallback);
                if (parentView != null && parentView.audioCompletedCallback != null && parentView.audioCompletedCallback.length() > 0)
                {
                    String s = (new StringBuilder("window.")).append(parentView.audioCompletedCallback).append("();").toString();
                    parentView.injectJavaScript(s);
                }
                if (mediaController != null)
                {
                    mediaController.hide();
                }
                mediaplayer.stop();
                lastPosition = mediaplayer.getDuration();
                mediaplayer.reset();
                mediaplayer.release();
                mediaPlayer = null;
            }

            
            {
                this$0 = AudioPlayer.this;
                super();
            }
        };
    }

    private android.media.MediaPlayer.OnPreparedListener createPreparedListener()
    {
        return new android.media.MediaPlayer.OnPreparedListener() {

            final AudioPlayer this$0;

            public void onPrepared(MediaPlayer mediaplayer)
            {
                if (controls && mediaController != null)
                {
                    setMediaController();
                    mediaController.setAnchorView(parentView);
                    mediaController.setEnabled(true);
                    mediaController.show();
                }
            }

            
            {
                this$0 = AudioPlayer.this;
                super();
            }
        };
    }

    private void setListeners()
    {
        this;
        JVM INSTR monitorenter ;
        mediaPlayer.setOnCompletionListener(createCompletionListener());
        mediaPlayer.setOnPreparedListener(createPreparedListener());
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        Logging.log((new StringBuilder(String.valueOf(((Exception) (obj)).getMessage()))).append(" Exception in setting listeners ").toString());
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        throw obj;
    }

    private void setMediaController()
    {
        this;
        JVM INSTR monitorenter ;
        mediaController.setMediaPlayer(this);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void cacheAudio(String s)
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        if (s != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        InputStream inputstream;
        File file;
        Logging.log((new StringBuilder("Storing content from: ")).append(s).append(" into cache.").toString());
        Object obj = (new URL(s)).openConnection();
        ((URLConnection) (obj)).connect();
        inputstream = ((URLConnection) (obj)).getInputStream();
        obj = s.substring(s.lastIndexOf("/") + 1);
        file = new File(context.getCacheDir(), ((String) (obj)));
        Object obj1 = new FileOutputStream(file);
        byte abyte0[] = new byte[16384];
_L5:
        int i = inputstream.read(abyte0);
        if (i > 0) goto _L4; else goto _L3
_L3:
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_122;
        }
        ((FileOutputStream) (obj1)).close();
_L7:
        file.setReadable(true, false);
        hashMap.put(s, file);
        if (parentView != null && parentView.audioCachedCallback != null && parentView.audioCachedCallback.length() > 0)
        {
            s = (new StringBuilder("window.")).append(parentView.audioCachedCallback).append("();").toString();
            parentView.injectJavaScript(s);
        }
          goto _L1
        s;
        Logging.log((new StringBuilder(String.valueOf(s.getMessage()))).append(" Exception in cacheAudio").toString());
          goto _L1
        s;
        throw s;
_L4:
        ((FileOutputStream) (obj1)).write(abyte0, 0, i);
          goto _L5
        s;
_L8:
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_265;
        }
        ((FileOutputStream) (obj1)).close();
_L6:
        throw s;
        obj1;
        Logging.log((new StringBuilder("Failed to close URL")).append(((IOException) (obj1)).getMessage()).toString());
          goto _L6
        obj1;
        Logging.log((new StringBuilder("Failed to close URL")).append(((IOException) (obj1)).getMessage()).toString());
          goto _L7
        s;
        obj1 = null;
          goto _L8
    }

    public boolean canPause()
    {
        return true;
    }

    public boolean canSeekBackward()
    {
        return true;
    }

    public boolean canSeekForward()
    {
        return true;
    }

    public int getBufferPercentage()
    {
        return 0;
    }

    public int getCurrentPosition()
    {
        this;
        JVM INSTR monitorenter ;
        int i;
        Logging.log("getCurrentPosition()");
        if (mediaPlayer != null && isPlaying())
        {
            lastPosition = mediaPlayer.getCurrentPosition();
        }
        i = lastPosition;
        this;
        JVM INSTR monitorexit ;
        return i;
        Exception exception;
        exception;
        throw exception;
    }

    public int getDuration()
    {
        this;
        JVM INSTR monitorenter ;
        Logging.log("getDuration()");
        if (mediaPlayer == null) goto _L2; else goto _L1
_L1:
        int i = mediaPlayer.getDuration();
_L4:
        this;
        JVM INSTR monitorexit ;
        return i;
_L2:
        i = -1;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public boolean isPlaying()
    {
        boolean flag1 = false;
        this;
        JVM INSTR monitorenter ;
        Logging.log("isPlaying()");
        boolean flag = flag1;
        Exception exception;
        try
        {
            if (mediaPlayer != null)
            {
                flag = mediaPlayer.isPlaying();
            }
        }
        catch (IllegalStateException illegalstateexception)
        {
            flag = flag1;
        }
        finally
        {
            this;
        }
        this;
        JVM INSTR monitorexit ;
        return flag;
        throw exception;
    }

    public void loadContent(Bundle bundle)
    {
        this;
        JVM INSTR monitorenter ;
        Abstract.PlayerProperties playerproperties = (Abstract.PlayerProperties)bundle.getParcelable("player_properties");
        controls = playerproperties.showControl;
        loop = playerproperties.doLoop;
        positionUpdatePeriodMs = playerproperties.positionUpdatePeriodMs;
        mediaPlayer = new MediaPlayer();
        mediaPlayer.setOnErrorListener(new android.media.MediaPlayer.OnErrorListener() {

            final AudioPlayer this$0;

            public boolean onError(MediaPlayer mediaplayer, int i, int j)
            {
                if (parentView != null && parentView.audioCompletedCallback != null && parentView.audioCompletedCallback.length() > 0)
                {
                    mediaplayer = (new StringBuilder("window.")).append(parentView.audioCompletedCallback).append("();").toString();
                    parentView.injectJavaScript(mediaplayer);
                }
                return true;
            }

            
            {
                this$0 = AudioPlayer.this;
                super();
            }
        });
        mediaController = new MediaController(context);
        setListeners();
        bundle = bundle.getString("expand_url");
        Logging.log("Loading audio resources.");
        Logging.log((new StringBuilder("Looking for: \"")).append(bundle).append("\" in cache.").toString());
        if (!hashMap.containsKey(bundle)) goto _L2; else goto _L1
_L1:
        Logging.log((new StringBuilder(String.valueOf(bundle))).append(" found in cache.").toString());
        mediaPlayer.setDataSource(((File)hashMap.get(bundle)).getCanonicalPath());
_L3:
        mediaPlayer.prepare();
        mediaPlayer.setLooping(loop);
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        Logging.log((new StringBuilder(String.valueOf(bundle))).append(" not found in cache.  Loading data from url.").toString());
        bundle = Uri.parse(bundle);
        mediaPlayer.setDataSource(context, bundle);
          goto _L3
        bundle;
        Logging.log((new StringBuilder("MediaPlayer Exception")).append(bundle.getMessage()).toString());
          goto _L4
        bundle;
        Logging.log((new StringBuilder(String.valueOf(bundle.getMessage()))).append(" Exception in load content Audio player ").toString());
          goto _L4
        bundle;
        throw bundle;
          goto _L3
    }

    public void pause()
    {
        this;
        JVM INSTR monitorenter ;
        Logging.log("pause()");
        if (mediaPlayer != null)
        {
            mediaPlayer.pause();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void playAudio()
    {
        this;
        JVM INSTR monitorenter ;
        if (mediaPlayer != null)
        {
            Logging.log("Starting audio playback.");
            mediaPlayer.start();
            if (parentView != null && parentView.audioStartedCallback != null && parentView.audioStartedCallback.length() > 0)
            {
                String s = (new StringBuilder("window.")).append(parentView.audioStartedCallback).append("();").toString();
                parentView.injectJavaScript(s);
            }
            if (positionUpdatePeriodMs > 0)
            {
                handler.postDelayed(audioPositionUpdateCallback, positionUpdatePeriodMs);
            }
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void releasePlayer()
    {
        this;
        JVM INSTR monitorenter ;
        MediaPlayer mediaplayer = mediaPlayer;
        if (mediaplayer != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (isPlaying() && parentView != null && parentView.audioCompletedCallback != null && parentView.audioCompletedCallback.length() > 0)
        {
            String s = (new StringBuilder("window.")).append(parentView.audioCompletedCallback).append("();").toString();
            parentView.injectJavaScript(s);
        }
_L4:
        Logging.log("Releasing media player.");
        if (mediaController != null)
        {
            mediaController.hide();
        }
        hashMap.clear();
        mediaPlayer.reset();
        mediaPlayer.release();
        mediaPlayer = null;
        if (true) goto _L1; else goto _L3
_L3:
        Object obj;
        obj;
        throw obj;
        obj;
        Logging.log("MediaPlayer in wrong state while releasing");
          goto _L4
    }

    public void seekTo(int i)
    {
        this;
        JVM INSTR monitorenter ;
        Logging.log("seekTo()");
        if (mediaPlayer != null)
        {
            mediaPlayer.seekTo(i);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void start()
    {
        this;
        JVM INSTR monitorenter ;
        Logging.log("start()");
        if (mediaPlayer != null)
        {
            mediaPlayer.start();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }











}
