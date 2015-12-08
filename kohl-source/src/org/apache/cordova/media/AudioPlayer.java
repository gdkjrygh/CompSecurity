// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova.media;

import android.app.Activity;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.media.MediaPlayer;
import android.media.MediaRecorder;
import android.os.Environment;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaWebView;

// Referenced classes of package org.apache.cordova.media:
//            AudioHandler

public class AudioPlayer
    implements android.media.MediaPlayer.OnCompletionListener, android.media.MediaPlayer.OnPreparedListener, android.media.MediaPlayer.OnErrorListener
{
    public static final class MODE extends Enum
    {

        private static final MODE $VALUES[];
        public static final MODE NONE;
        public static final MODE PLAY;
        public static final MODE RECORD;

        public static MODE valueOf(String s)
        {
            return (MODE)Enum.valueOf(org/apache/cordova/media/AudioPlayer$MODE, s);
        }

        public static MODE[] values()
        {
            return (MODE[])$VALUES.clone();
        }

        static 
        {
            NONE = new MODE("NONE", 0);
            PLAY = new MODE("PLAY", 1);
            RECORD = new MODE("RECORD", 2);
            $VALUES = (new MODE[] {
                NONE, PLAY, RECORD
            });
        }

        private MODE(String s, int i)
        {
            super(s, i);
        }
    }

    public static final class STATE extends Enum
    {

        private static final STATE $VALUES[];
        public static final STATE MEDIA_LOADING;
        public static final STATE MEDIA_NONE;
        public static final STATE MEDIA_PAUSED;
        public static final STATE MEDIA_RUNNING;
        public static final STATE MEDIA_STARTING;
        public static final STATE MEDIA_STOPPED;

        public static STATE valueOf(String s)
        {
            return (STATE)Enum.valueOf(org/apache/cordova/media/AudioPlayer$STATE, s);
        }

        public static STATE[] values()
        {
            return (STATE[])$VALUES.clone();
        }

        static 
        {
            MEDIA_NONE = new STATE("MEDIA_NONE", 0);
            MEDIA_STARTING = new STATE("MEDIA_STARTING", 1);
            MEDIA_RUNNING = new STATE("MEDIA_RUNNING", 2);
            MEDIA_PAUSED = new STATE("MEDIA_PAUSED", 3);
            MEDIA_STOPPED = new STATE("MEDIA_STOPPED", 4);
            MEDIA_LOADING = new STATE("MEDIA_LOADING", 5);
            $VALUES = (new STATE[] {
                MEDIA_NONE, MEDIA_STARTING, MEDIA_RUNNING, MEDIA_PAUSED, MEDIA_STOPPED, MEDIA_LOADING
            });
        }

        private STATE(String s, int i)
        {
            super(s, i);
        }
    }


    private static final String LOG_TAG = "AudioPlayer";
    private static int MEDIA_DURATION = 2;
    private static int MEDIA_ERROR = 9;
    private static int MEDIA_ERR_ABORTED = 1;
    private static int MEDIA_ERR_NONE_ACTIVE = 0;
    private static int MEDIA_POSITION = 3;
    private static int MEDIA_STATE = 1;
    private String audioFile;
    private float duration;
    private AudioHandler handler;
    private String id;
    private MODE mode;
    private MediaPlayer player;
    private boolean prepareOnly;
    private MediaRecorder recorder;
    private int seekOnPrepared;
    private STATE state;
    private String tempFile;

    public AudioPlayer(AudioHandler audiohandler, String s, String s1)
    {
        mode = MODE.NONE;
        state = STATE.MEDIA_NONE;
        audioFile = null;
        duration = -1F;
        recorder = null;
        tempFile = null;
        player = null;
        prepareOnly = true;
        seekOnPrepared = 0;
        handler = audiohandler;
        id = s;
        audioFile = s1;
        recorder = new MediaRecorder();
        if (Environment.getExternalStorageState().equals("mounted"))
        {
            tempFile = (new StringBuilder()).append(Environment.getExternalStorageDirectory().getAbsolutePath()).append("/tmprecording.3gp").toString();
            return;
        } else
        {
            tempFile = (new StringBuilder()).append("/data/data/").append(audiohandler.cordova.getActivity().getPackageName()).append("/cache/tmprecording.3gp").toString();
            return;
        }
    }

    private float getDurationInSeconds()
    {
        return (float)player.getDuration() / 1000F;
    }

    private void loadAudioFile(String s)
        throws IllegalArgumentException, SecurityException, IllegalStateException, IOException
    {
        if (isStreaming(s))
        {
            player.setDataSource(s);
            player.setAudioStreamType(3);
            setMode(MODE.PLAY);
            setState(STATE.MEDIA_STARTING);
            player.setOnPreparedListener(this);
            player.prepareAsync();
            return;
        }
        if (s.startsWith("/android_asset/"))
        {
            s = s.substring(15);
            s = handler.cordova.getActivity().getAssets().openFd(s);
            player.setDataSource(s.getFileDescriptor(), s.getStartOffset(), s.getLength());
        } else
        if ((new File(s)).exists())
        {
            s = new FileInputStream(s);
            player.setDataSource(s.getFD());
            s.close();
        } else
        {
            player.setDataSource((new StringBuilder()).append(Environment.getExternalStorageDirectory().getPath()).append("/").append(s).toString());
        }
        setState(STATE.MEDIA_STARTING);
        player.setOnPreparedListener(this);
        player.prepare();
        duration = getDurationInSeconds();
    }

    private boolean playMode()
    {
        static class _cls1
        {

            static final int $SwitchMap$org$apache$cordova$media$AudioPlayer$MODE[];
            static final int $SwitchMap$org$apache$cordova$media$AudioPlayer$STATE[];

            static 
            {
                $SwitchMap$org$apache$cordova$media$AudioPlayer$STATE = new int[STATE.values().length];
                try
                {
                    $SwitchMap$org$apache$cordova$media$AudioPlayer$STATE[STATE.MEDIA_NONE.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    $SwitchMap$org$apache$cordova$media$AudioPlayer$STATE[STATE.MEDIA_LOADING.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    $SwitchMap$org$apache$cordova$media$AudioPlayer$STATE[STATE.MEDIA_STARTING.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$org$apache$cordova$media$AudioPlayer$STATE[STATE.MEDIA_RUNNING.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$org$apache$cordova$media$AudioPlayer$STATE[STATE.MEDIA_PAUSED.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$org$apache$cordova$media$AudioPlayer$STATE[STATE.MEDIA_STOPPED.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                $SwitchMap$org$apache$cordova$media$AudioPlayer$MODE = new int[MODE.values().length];
                try
                {
                    $SwitchMap$org$apache$cordova$media$AudioPlayer$MODE[MODE.PLAY.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$org$apache$cordova$media$AudioPlayer$MODE[MODE.NONE.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$org$apache$cordova$media$AudioPlayer$MODE[MODE.RECORD.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1..SwitchMap.org.apache.cordova.media.AudioPlayer.MODE[mode.ordinal()];
        JVM INSTR tableswitch 1 3: default 36
    //                   1 36
    //                   2 38
    //                   3 48;
           goto _L1 _L1 _L2 _L3
_L1:
        return true;
_L2:
        setMode(MODE.PLAY);
          goto _L1
_L3:
        Log.d("AudioPlayer", "AudioPlayer Error: Can't play in record mode.");
        handler.webView.sendJavascript((new StringBuilder()).append("cordova.require('org.apache.cordova.media.Media').onStatus('").append(id).append("', ").append(MEDIA_ERROR).append(", { \"code\":").append(MEDIA_ERR_ABORTED).append("});").toString());
        return false;
    }

    private boolean readyPlayer(String s)
    {
label0:
        {
label1:
            {
label2:
                {
label3:
                    {
                        if (playMode())
                        {
                            switch (_cls1..SwitchMap.org.apache.cordova.media.AudioPlayer.STATE[state.ordinal()])
                            {
                            default:
                                Log.d("AudioPlayer", (new StringBuilder()).append("AudioPlayer Error: startPlaying() called during invalid state: ").append(state).toString());
                                handler.webView.sendJavascript((new StringBuilder()).append("cordova.require('org.apache.cordova.media.Media').onStatus('").append(id).append("', ").append(MEDIA_ERROR).append(", { \"code\":").append(MEDIA_ERR_ABORTED).append("});").toString());
                                break;

                            case 1: // '\001'
                                break label3;

                            case 2: // '\002'
                                break label2;

                            case 3: // '\003'
                            case 4: // '\004'
                            case 5: // '\005'
                                break label1;

                            case 6: // '\006'
                                break label0;
                            }
                        }
                        return false;
                    }
                    if (player == null)
                    {
                        player = new MediaPlayer();
                    }
                    try
                    {
                        loadAudioFile(s);
                    }
                    // Misplaced declaration of an exception variable
                    catch (String s)
                    {
                        handler.webView.sendJavascript((new StringBuilder()).append("cordova.require('org.apache.cordova.media.Media').onStatus('").append(id).append("', ").append(MEDIA_ERROR).append(", { \"code\":").append(MEDIA_ERR_ABORTED).append("});").toString());
                        return false;
                    }
                    return false;
                }
                Log.d("AudioPlayer", (new StringBuilder()).append("AudioPlayer Loading: startPlaying() called during media preparation: ").append(STATE.MEDIA_STARTING.ordinal()).toString());
                prepareOnly = false;
                return false;
            }
            return true;
        }
        if (audioFile.compareTo(s) == 0)
        {
            player.seekTo(0);
            player.pause();
            return true;
        }
        player.reset();
        try
        {
            loadAudioFile(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            handler.webView.sendJavascript((new StringBuilder()).append("cordova.require('org.apache.cordova.media.Media').onStatus('").append(id).append("', ").append(MEDIA_ERROR).append(", { \"code\":").append(MEDIA_ERR_ABORTED).append("});").toString());
            return false;
        }
        return false;
    }

    private void setMode(MODE mode1)
    {
        if (mode == mode1);
        mode = mode1;
    }

    private void setState(STATE state1)
    {
        if (state != state1)
        {
            handler.webView.sendJavascript((new StringBuilder()).append("cordova.require('org.apache.cordova.media.Media').onStatus('").append(id).append("', ").append(MEDIA_STATE).append(", ").append(state1.ordinal()).append(");").toString());
        }
        state = state1;
    }

    public void destroy()
    {
        if (player != null)
        {
            if (state == STATE.MEDIA_RUNNING || state == STATE.MEDIA_PAUSED)
            {
                player.stop();
                setState(STATE.MEDIA_STOPPED);
            }
            player.release();
            player = null;
        }
        if (recorder != null)
        {
            stopRecording();
            recorder.release();
            recorder = null;
        }
    }

    public long getCurrentPosition()
    {
        if (state == STATE.MEDIA_RUNNING || state == STATE.MEDIA_PAUSED)
        {
            int i = player.getCurrentPosition();
            handler.webView.sendJavascript((new StringBuilder()).append("cordova.require('org.apache.cordova.media.Media').onStatus('").append(id).append("', ").append(MEDIA_POSITION).append(", ").append((float)i / 1000F).append(");").toString());
            return (long)i;
        } else
        {
            return -1L;
        }
    }

    public float getDuration(String s)
    {
        if (recorder != null)
        {
            return -2F;
        }
        if (player != null)
        {
            return duration;
        } else
        {
            prepareOnly = true;
            startPlaying(s);
            return duration;
        }
    }

    public int getState()
    {
        return state.ordinal();
    }

    public boolean isStreaming(String s)
    {
        return s.contains("http://") || s.contains("https://");
    }

    public void moveFile(String s)
    {
        File file = new File(tempFile);
        String s1 = s;
        if (!s.startsWith("/"))
        {
            if (Environment.getExternalStorageState().equals("mounted"))
            {
                s1 = (new StringBuilder()).append(Environment.getExternalStorageDirectory().getAbsolutePath()).append(File.separator).append(s).toString();
            } else
            {
                s1 = (new StringBuilder()).append("/data/data/").append(handler.cordova.getActivity().getPackageName()).append("/cache/").append(s).toString();
            }
        }
        s = (new StringBuilder()).append("renaming ").append(tempFile).append(" to ").append(s1).toString();
        Log.d("AudioPlayer", s);
        if (!file.renameTo(new File(s1)))
        {
            Log.e("AudioPlayer", (new StringBuilder()).append("FAILED ").append(s).toString());
        }
    }

    public void onCompletion(MediaPlayer mediaplayer)
    {
        Log.d("AudioPlayer", "on completion is calling stopped");
        setState(STATE.MEDIA_STOPPED);
    }

    public boolean onError(MediaPlayer mediaplayer, int i, int j)
    {
        Log.d("AudioPlayer", (new StringBuilder()).append("AudioPlayer.onError(").append(i).append(", ").append(j).append(")").toString());
        player.stop();
        player.release();
        handler.webView.sendJavascript((new StringBuilder()).append("cordova.require('org.apache.cordova.media.Media').onStatus('").append(id).append("', { \"code\":").append(i).append("});").toString());
        return false;
    }

    public void onPrepared(MediaPlayer mediaplayer)
    {
        player.setOnCompletionListener(this);
        seekToPlaying(seekOnPrepared);
        if (!prepareOnly)
        {
            player.start();
            setState(STATE.MEDIA_RUNNING);
            seekOnPrepared = 0;
        } else
        {
            setState(STATE.MEDIA_STARTING);
        }
        duration = getDurationInSeconds();
        prepareOnly = true;
        handler.webView.sendJavascript((new StringBuilder()).append("cordova.require('org.apache.cordova.media.Media').onStatus('").append(id).append("', ").append(MEDIA_DURATION).append(",").append(duration).append(");").toString());
    }

    public void pausePlaying()
    {
        if (state == STATE.MEDIA_RUNNING && player != null)
        {
            player.pause();
            setState(STATE.MEDIA_PAUSED);
            return;
        } else
        {
            Log.d("AudioPlayer", (new StringBuilder()).append("AudioPlayer Error: pausePlaying() called during invalid state: ").append(state.ordinal()).toString());
            handler.webView.sendJavascript((new StringBuilder()).append("cordova.require('org.apache.cordova.media.Media').onStatus('").append(id).append("', ").append(MEDIA_ERROR).append(", { \"code\":").append(MEDIA_ERR_NONE_ACTIVE).append("});").toString());
            return;
        }
    }

    public void seekToPlaying(int i)
    {
        if (readyPlayer(audioFile))
        {
            player.seekTo(i);
            Log.d("AudioPlayer", "Send a onStatus update for the new seek");
            handler.webView.sendJavascript((new StringBuilder()).append("cordova.require('org.apache.cordova.media.Media').onStatus('").append(id).append("', ").append(MEDIA_POSITION).append(", ").append((float)i / 1000F).append(");").toString());
            return;
        } else
        {
            seekOnPrepared = i;
            return;
        }
    }

    public void setVolume(float f)
    {
        player.setVolume(f, f);
    }

    public void startPlaying(String s)
    {
        if (readyPlayer(s) && player != null)
        {
            player.start();
            setState(STATE.MEDIA_RUNNING);
            seekOnPrepared = 0;
            return;
        } else
        {
            prepareOnly = false;
            return;
        }
    }

    public void startRecording(String s)
    {
        switch (_cls1..SwitchMap.org.apache.cordova.media.AudioPlayer.MODE[mode.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            Log.d("AudioPlayer", "AudioPlayer Error: Can't record in play mode.");
            handler.webView.sendJavascript((new StringBuilder()).append("cordova.require('org.apache.cordova.media.Media').onStatus('").append(id).append("', ").append(MEDIA_ERROR).append(", { \"code\":").append(MEDIA_ERR_ABORTED).append("});").toString());
            return;

        case 2: // '\002'
            audioFile = s;
            recorder.setAudioSource(1);
            recorder.setOutputFormat(0);
            recorder.setAudioEncoder(0);
            recorder.setOutputFile(tempFile);
            try
            {
                recorder.prepare();
                recorder.start();
                setState(STATE.MEDIA_RUNNING);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s.printStackTrace();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s.printStackTrace();
            }
            handler.webView.sendJavascript((new StringBuilder()).append("cordova.require('org.apache.cordova.media.Media').onStatus('").append(id).append("', ").append(MEDIA_ERROR).append(", { \"code\":").append(MEDIA_ERR_ABORTED).append("});").toString());
            return;

        case 3: // '\003'
            Log.d("AudioPlayer", "AudioPlayer Error: Already recording.");
            handler.webView.sendJavascript((new StringBuilder()).append("cordova.require('org.apache.cordova.media.Media').onStatus('").append(id).append("', ").append(MEDIA_ERROR).append(", { \"code\":").append(MEDIA_ERR_ABORTED).append("});").toString());
            return;
        }
    }

    public void stopPlaying()
    {
        if (state == STATE.MEDIA_RUNNING || state == STATE.MEDIA_PAUSED)
        {
            player.pause();
            player.seekTo(0);
            Log.d("AudioPlayer", "stopPlaying is calling stopped");
            setState(STATE.MEDIA_STOPPED);
            return;
        } else
        {
            Log.d("AudioPlayer", (new StringBuilder()).append("AudioPlayer Error: stopPlaying() called during invalid state: ").append(state.ordinal()).toString());
            handler.webView.sendJavascript((new StringBuilder()).append("cordova.require('org.apache.cordova.media.Media').onStatus('").append(id).append("', ").append(MEDIA_ERROR).append(", { \"code\":").append(MEDIA_ERR_NONE_ACTIVE).append("});").toString());
            return;
        }
    }

    public void stopRecording()
    {
        if (recorder == null)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        if (state == STATE.MEDIA_RUNNING)
        {
            recorder.stop();
            setState(STATE.MEDIA_STOPPED);
        }
        recorder.reset();
        moveFile(audioFile);
        return;
        Exception exception;
        exception;
        exception.printStackTrace();
        return;
    }

}
