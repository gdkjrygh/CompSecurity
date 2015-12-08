// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.service;

import android.app.NotificationManager;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.MediaPlayer;
import android.os.Handler;
import android.os.IBinder;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.widget.Toast;
import com.arist.MusicPlayer.MyApplication;
import com.arist.entity.Music;
import com.arist.notify.MyNotiofation;
import com.yong.jamendo.api.JamendoMusic;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Map;
import java.util.Random;
import yong.powerfull.equalizer.CompatEq;
import yong.powerfull.equalizer.EquzeHelper;
import yong.powerfull.equalizer.PreferenceService;

public class MusicPlayService extends Service
{
    private class InCallListener extends PhoneStateListener
    {

        final MusicPlayService this$0;

        public void onCallStateChanged(int i, String s)
        {
            i;
            JVM INSTR tableswitch 1 2: default 24
        //                       1 25
        //                       2 25;
               goto _L1 _L2 _L2
_L1:
            return;
_L2:
            if (MyApplication.getInstance().isPlaying())
            {
                MyApplication.mediaPlayer.pause();
                MyApplication.status = 3;
                return;
            }
            if (true) goto _L1; else goto _L3
_L3:
        }

        private InCallListener()
        {
            this$0 = MusicPlayService.this;
            super();
        }

        InCallListener(InCallListener incalllistener)
        {
            this();
        }
    }

    private class MyReciever extends BroadcastReceiver
    {

        final MusicPlayService this$0;

        public void onReceive(Context context, Intent intent)
        {
            boolean flag = true;
            if (!"com.MediaPlayer.action.PLAY".equals(intent.getAction())) goto _L2; else goto _L1
_L1:
            play();
_L4:
            return;
_L2:
            if ("com.MediaPlayer.action.PREVIOUS".equals(intent.getAction()))
            {
                previous();
                return;
            }
            if ("com.MediaPlayer.action.NEXT".equals(intent.getAction()))
            {
                next();
                return;
            }
            if (!"com.MediaPlayer.action.SEEK".equals(intent.getAction()))
            {
                break; /* Loop/switch isn't completed */
            }
            try
            {
                nowCurr = intent.getIntExtra("seekProgress", 0);
                MyApplication.mediaPlayer.seekTo(nowCurr);
                if (MyApplication.status == 2 || MyApplication.status == 3)
                {
                    MyApplication.mediaPlayer.start();
                    return;
                }
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                return;
            }
            if (true) goto _L4; else goto _L3
_L3:
            if ("com.MediaPlayer.action.NET_PLAY".equals(intent.getAction()))
            {
                context = (JamendoMusic)intent.getSerializableExtra("netMusic");
                playNetMusic(context);
                MyApplication.setPlayNetMusic(true);
                sendBroadcast(new Intent("com.MediaPlayer.action.STATUS_CHANGED"));
                sendBroadcast(new Intent("com.MediaPlayer.action.MUSIC_CHANGED"));
                return;
            }
            if ("com.MediaPlayer.action.DESTORY".equals(intent.getAction()))
            {
                stopMediaPlayer();
                stopSelf();
                MyApplication.getInstance().exit();
                return;
            }
            if (!"com.MediaPlayer.action.MEDIA_BUTTON_PRESSED".equals(intent.getAction()))
            {
                break; /* Loop/switch isn't completed */
            }
            if (MyApplication.getDefaultSharedPreferences().getBoolean("headset_control_allow", false))
            {
                if (intent.getLongExtra("event_time", 0L) <= 800L)
                {
                    flag = false;
                }
                if (flag)
                {
                    previous();
                    return;
                }
                play();
                if (System.currentTimeMillis() - lastBroadcastReceiveTime < 1500L)
                {
                    next();
                }
                lastBroadcastReceiveTime = System.currentTimeMillis();
                return;
            }
            if (true) goto _L4; else goto _L5
_L5:
            if (!"android.intent.action.HEADSET_PLUG".equals(intent.getAction()))
            {
                continue; /* Loop/switch isn't completed */
            }
            if (!getHeadSetState())
            {
                continue; /* Loop/switch isn't completed */
            }
            if (!MyApplication.getDefaultSharedPreferences().getBoolean("headset_in_play", false) || MyApplication.getInstance().isPlaying()) goto _L4; else goto _L6
_L6:
            play();
            return;
            if (!MyApplication.getDefaultSharedPreferences().getBoolean("headset_out_stop", false) || !MyApplication.getInstance().isPlaying()) goto _L4; else goto _L7
_L7:
            MyApplication.mediaPlayer.pause();
            return;
            if (!"com.MediaPlayer.action.START_SLEEP".equals(intent.getAction())) goto _L4; else goto _L8
_L8:
            startSleep();
            return;
        }

        private MyReciever()
        {
            this$0 = MusicPlayService.this;
            super();
        }

        MyReciever(MyReciever myreciever)
        {
            this();
        }
    }

    public static class playControlReciever extends BroadcastReceiver
    {

        public void onReceive(Context context, Intent intent)
        {
            if (MyApplication.getInstance() != null)
            {
                MusicPlayService.musicList = MyApplication.musicList;
                if ("com.MediaPlayer.action.WIDGET_PLAY".equals(intent.getAction()))
                {
                    MyApplication.context.sendBroadcast(new Intent("com.MediaPlayer.action.PLAY"));
                } else
                {
                    if ("com.MediaPlayer.action.WIDGET_NEXT".equals(intent.getAction()))
                    {
                        MyApplication.context.sendBroadcast(new Intent("com.MediaPlayer.action.NEXT"));
                        return;
                    }
                    if ("com.MediaPlayer.action.WIDGET_PREVIOUS".equals(intent.getAction()))
                    {
                        MyApplication.context.sendBroadcast(new Intent("com.MediaPlayer.action.PREVIOUS"));
                        return;
                    }
                    if ("com.MediaPlayer.action.WIDGET_EXIT".equals(intent.getAction()))
                    {
                        MyNotiofation.clearNotification();
                        MyApplication.context.sendBroadcast(new Intent("com.MediaPlayer.action.PLAY"));
                        return;
                    }
                }
            }
        }

        public playControlReciever()
        {
        }
    }


    public static String SongNamekeywords[];
    private static ArrayList musicList = new ArrayList();
    public static MusicPlayService sInstance;
    private static final Object sWait[] = new Object[0];
    private int currentPosition;
    PreferenceService equizePreferService;
    private Handler handler;
    private long lastBroadcastReceiveTime;
    private Music lastMusic;
    public InCallListener mCallListener;
    public CompatEq mEqualizer;
    private MyReciever mReceiver;
    private SensorEventListener mSensorEventListener;
    private NotificationManager manager;
    private boolean musicComplet;
    private int nowCurr;
    private int planeModeSet;
    private SensorManager sensorManager;

    public MusicPlayService()
    {
        nowCurr = 0;
        lastBroadcastReceiveTime = 0L;
        musicComplet = false;
        mSensorEventListener = new SensorEventListener() {

            final MusicPlayService this$0;

            public void onAccuracyChanged(Sensor sensor, int i)
            {
            }

            public void onSensorChanged(SensorEvent sensorevent)
            {
                if (MyApplication.getDefaultSharedPreferences().getBoolean("shake_to_change_song", false))
                {
                    sensorevent = sensorevent.values;
                    float f = sensorevent[0];
                    float f1 = sensorevent[1];
                    if (Math.abs(f) > (float)19)
                    {
                        next();
                        return;
                    }
                    if (Math.abs(f1) > (float)19)
                    {
                        previous();
                        return;
                    }
                }
            }

            
            {
                this$0 = MusicPlayService.this;
                super();
            }
        };
    }

    public static MusicPlayService get(Context context)
    {
        if (sInstance != null) goto _L2; else goto _L1
_L1:
        context.startService(new Intent(context, com/arist/service/MusicPlayService));
_L5:
        if (sInstance == null) goto _L3; else goto _L2
_L2:
        return sInstance;
_L3:
        synchronized (sWait)
        {
            ((Object) (sWait)).wait();
        }
        continue; /* Loop/switch isn't completed */
        exception;
        context;
        JVM INSTR monitorexit ;
        try
        {
            throw exception;
        }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
        if (true) goto _L5; else goto _L4
_L4:
    }

    private boolean getHeadSetState()
    {
        boolean flag1 = false;
        File file = new File("/sys/class/switch/h2w/state");
        boolean flag = flag1;
        if (file.isFile())
        {
            boolean flag2;
            try
            {
                flag2 = "1".equals((new BufferedReader(new FileReader(file))).readLine().trim());
            }
            catch (Exception exception)
            {
                return false;
            }
            flag = flag1;
            if (flag2)
            {
                flag = true;
            }
        }
        return flag;
    }

    public static boolean hasInstance()
    {
        return sInstance != null;
    }

    private void next()
    {
        int i;
        int l;
        l = 0;
        i = 0;
        MyApplication.setPlayNetMusic(false);
        currentPosition = MyApplication.getCurrentPosition();
        MyApplication.playMode;
        JVM INSTR tableswitch 1 4: default 48
    //                   1 83
    //                   2 159
    //                   3 123
    //                   4 60;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        MyApplication.setCurrentPosition(currentPosition);
        play();
        return;
_L5:
        currentPosition = (new Random()).nextInt(musicList.size());
        continue; /* Loop/switch isn't completed */
_L2:
        l = currentPosition + 1;
        currentPosition = l;
        if (l <= musicList.size() - 1)
        {
            i = currentPosition;
        }
        currentPosition = i;
        continue; /* Loop/switch isn't completed */
_L4:
        int j = currentPosition + 1;
        currentPosition = j;
        if (j > musicList.size() - 1)
        {
            currentPosition = 0;
            stopMediaPlayer();
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (!musicComplet)
        {
            int k = currentPosition + 1;
            currentPosition = k;
            if (k > musicList.size() - 1)
            {
                k = l;
            } else
            {
                k = currentPosition;
            }
            currentPosition = k;
        }
        if (true) goto _L1; else goto _L6
_L6:
    }

    private void play()
    {
        MyApplication.mediaPlayer.setLooping(false);
        musicList = MyApplication.musicList;
        if (musicList == null || musicList.size() <= 0)
        {
            break MISSING_BLOCK_LABEL_136;
        }
        if (!MyApplication.getCurrentMusic().getData().equals(lastMusic.getData()) || musicList.size() <= 0)
        {
            break MISSING_BLOCK_LABEL_203;
        }
        if (!musicComplet || MyApplication.playMode != 2)
        {
            break MISSING_BLOCK_LABEL_154;
        }
        musicComplet = false;
        MyApplication.mediaPlayer.reset();
        try
        {
            MyApplication.mediaPlayer.setDataSource(MyApplication.getCurrentMusic().getData());
            MyApplication.mediaPlayer.prepare();
            MyApplication.mediaPlayer.start();
            MyApplication.status = 2;
        }
        catch (Exception exception3) { }
        try
        {
            sendBroadcast(new Intent("com.MediaPlayer.action.STATUS_CHANGED"));
            sendBroadcast(new Intent("com.MediaPlayer.action.ALBUM_PIC_CHANGED"));
        }
        catch (Exception exception) { }
        startNotificationHandler();
        if (MyApplication.getCurrentMusic() != null)
        {
            lastMusic = MyApplication.getCurrentMusic();
        }
        return;
        if (MyApplication.getInstance().isPlaying())
        {
            if (MyApplication.mediaPlayer != null)
            {
                MyApplication.mediaPlayer.pause();
                MyApplication.status = 3;
            }
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            MyApplication.mediaPlayer.start();
            MyApplication.status = 2;
        }
        catch (Exception exception1) { }
        continue; /* Loop/switch isn't completed */
        try
        {
            MyApplication.mediaPlayer.reset();
            MyApplication.mediaPlayer.setDataSource(MyApplication.getCurrentMusic().getData());
            MyApplication.mediaPlayer.prepare();
            MyApplication.mediaPlayer.start();
            MyApplication.status = 2;
            sendBroadcast(new Intent("com.MediaPlayer.action.MUSIC_CHANGED"));
        }
        catch (Exception exception2) { }
        if (true) goto _L2; else goto _L1
_L1:
        break MISSING_BLOCK_LABEL_257;
_L2:
        break MISSING_BLOCK_LABEL_109;
    }

    private void previous()
    {
        MyApplication.setPlayNetMusic(false);
        currentPosition = MyApplication.getCurrentPosition();
        if (musicList == null || musicList.size() <= 0) goto _L2; else goto _L1
_L1:
        MyApplication.playMode;
        JVM INSTR tableswitch 1 4: default 60
    //                   1 95
    //                   2 160
    //                   3 136
    //                   4 72;
           goto _L3 _L4 _L5 _L6 _L7
_L3:
        MyApplication.setCurrentPosition(currentPosition);
        play();
_L2:
        return;
_L7:
        currentPosition = (new Random()).nextInt(musicList.size());
        continue; /* Loop/switch isn't completed */
_L4:
        int i = currentPosition - 1;
        currentPosition = i;
        if (i < 0)
        {
            i = musicList.size() - 1;
        } else
        {
            i = currentPosition;
        }
        currentPosition = i;
        continue; /* Loop/switch isn't completed */
_L6:
        int j = currentPosition - 1;
        currentPosition = j;
        if (j < 0)
        {
            currentPosition = 0;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        int k = currentPosition - 1;
        currentPosition = k;
        if (k < 0)
        {
            k = musicList.size() - 1;
        } else
        {
            k = currentPosition;
        }
        currentPosition = k;
        if (true) goto _L3; else goto _L8
_L8:
    }

    private void startSleep()
    {
        planeModeSet = Integer.parseInt(MyApplication.getDefaultSharedPreferences().getString("sleep_mode", "1"));
        if (planeModeSet != 2)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        android.content.ContentResolver contentresolver = getContentResolver();
        if (android.provider.Settings.System.getInt(contentresolver, "airplane_mode_on") == 0)
        {
            android.provider.Settings.System.putInt(contentresolver, "airplane_mode_on", 1);
            sendBroadcast(new Intent("android.intent.action.AIRPLANE_MODE"));
        }
        return;
        Exception exception;
        exception;
    }

    private void stopMediaPlayer()
    {
        if (MyApplication.mediaPlayer == null)
        {
            return;
        }
        if (!MyApplication.mediaPlayer.isPlaying())
        {
            try
            {
                MyApplication.mediaPlayer.prepare();
                MyApplication.status = 1;
            }
            catch (Exception exception) { }
        }
        MyApplication.mediaPlayer.stop();
        MyApplication.mediaPlayer.release();
    }

    public int getindex(String s)
    {
        int i = 0;
        do
        {
            if (i >= musicList.size())
            {
                return 0;
            }
            if (((Music)musicList.get(i)).getTitle().equals(s))
            {
                return i;
            }
            i++;
        } while (true);
    }

    public IBinder onBind(Intent intent)
    {
        return null;
    }

    public void onCreate()
    {
        super.onCreate();
        stopForeground(true);
        if (MyApplication.mediaPlayer == null)
        {
            MyApplication.mediaPlayer = new MediaPlayer();
        }
        mReceiver = new MyReciever(null);
        musicList = MyApplication.musicList;
        Map map;
        Map map1;
        Map map2;
        Map map3;
        Map map4;
        if (MyApplication.getCurrentMusic() != null)
        {
            lastMusic = MyApplication.getCurrentMusic();
        } else
        {
            lastMusic = new Music(11111, "title", "dataLast", 111L, 111, "albumTest", 11, "11", "11");
        }
        handler = new Handler();
        manager = (NotificationManager)getSystemService("notification");
        startNotificationHandler();
        MyApplication.mediaPlayer.setOnCompletionListener(new android.media.MediaPlayer.OnCompletionListener() {

            final MusicPlayService this$0;

            public void onCompletion(MediaPlayer mediaplayer)
            {
                musicComplet = true;
                Log.i("info", (new StringBuilder("MusicPlayService next")).append(MyApplication.getCurrentPosition()).toString());
                next();
            }

            
            {
                this$0 = MusicPlayService.this;
                super();
            }
        });
        try
        {
            mCallListener = new InCallListener(null);
            ((TelephonyManager)getSystemService("phone")).listen(mCallListener, 32);
        }
        catch (SecurityException securityexception) { }
        equizePreferService = new PreferenceService(this);
        map = equizePreferService.getPreferences00();
        map1 = equizePreferService.getPreferences01();
        map2 = equizePreferService.getPreferences02();
        map3 = equizePreferService.getPreferences03();
        map4 = equizePreferService.getPreferences04();
        EquzeHelper.setEe(0, Integer.valueOf((String)map.get("progress0")).intValue());
        EquzeHelper.setEe(1, Integer.valueOf((String)map1.get("progress1")).intValue());
        EquzeHelper.setEe(2, Integer.valueOf((String)map2.get("progress2")).intValue());
        EquzeHelper.setEe(3, Integer.valueOf((String)map3.get("progress3")).intValue());
        EquzeHelper.setEe(4, Integer.valueOf((String)map4.get("progress4")).intValue());
        if (android.os.Build.VERSION.SDK_INT < 9)
        {
            break MISSING_BLOCK_LABEL_385;
        }
        mEqualizer = new CompatEq(MyApplication.mediaPlayer);
        try
        {
            mEqualizer.setBandLevel((short)0, (short)EquzeHelper.getEe(0));
            mEqualizer.setBandLevel((short)1, (short)EquzeHelper.getEe(1));
            mEqualizer.setBandLevel((short)2, (short)EquzeHelper.getEe(2));
            mEqualizer.setBandLevel((short)3, (short)EquzeHelper.getEe(3));
            mEqualizer.setBandLevel((short)4, (short)EquzeHelper.getEe(4));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            try
            {
                ((Exception) (obj)).printStackTrace();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Toast.makeText(getApplicationContext(), "Does not support this device", 1).show();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Toast.makeText(getApplicationContext(), "The device does not support the Equalizer function", 1).show();
            }
        }
        sInstance = this;
        synchronized (sWait)
        {
            ((Object) (sWait)).notifyAll();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void onDestroy()
    {
        unregisterReceiver(mReceiver);
        if (sensorManager != null)
        {
            sensorManager.unregisterListener(mSensorEventListener);
            sensorManager = null;
        }
        if (manager != null)
        {
            manager.cancel(1);
        }
        super.onDestroy();
    }

    public void onStart(Intent intent, int i)
    {
        super.onStart(intent, i);
        intent = new IntentFilter();
        intent.addAction("com.MediaPlayer.action.PLAY");
        intent.addAction("com.MediaPlayer.action.NET_PLAY");
        intent.addAction("com.MediaPlayer.action.DESTORY");
        intent.addAction("com.MediaPlayer.action.SEEK");
        intent.addAction("com.MediaPlayer.action.PREVIOUS");
        intent.addAction("com.MediaPlayer.action.NEXT");
        intent.addAction("com.MediaPlayer.action.MEDIA_BUTTON_PRESSED");
        intent.addAction("android.intent.action.HEADSET_PLUG");
        intent.addAction("com.MediaPlayer.action.START_SLEEP");
        registerReceiver(mReceiver, intent);
        sensorManager = (SensorManager)getSystemService("sensor");
        sensorManager.registerListener(mSensorEventListener, sensorManager.getDefaultSensor(1), 3);
        if (!MyApplication.getDefaultSharedPreferences().getBoolean("play_music", false))
        {
            break MISSING_BLOCK_LABEL_188;
        }
        MyApplication.mediaPlayer.setDataSource(MyApplication.getCurrentMusic().getData());
        MyApplication.mediaPlayer.prepare();
        MyApplication.mediaPlayer.seekTo(MyApplication.musicProgress);
        MyApplication.mediaPlayer.start();
        MyApplication.status = 2;
        sendBroadcast(new Intent("com.MediaPlayer.action.MUSIC_CHANGED"));
        return;
        intent;
    }

    public void playNetMusic(JamendoMusic jamendomusic)
    {
        try
        {
            MyApplication.mediaPlayer.reset();
            MyApplication.mediaPlayer.setDataSource(jamendomusic.getAudio_link());
            MyApplication.mediaPlayer.prepareAsync();
            MyApplication.mediaPlayer.setOnPreparedListener(new android.media.MediaPlayer.OnPreparedListener() {

                final MusicPlayService this$0;

                public void onPrepared(MediaPlayer mediaplayer)
                {
                    mediaplayer.start();
                    mediaplayer.setLooping(true);
                    mediaplayer = new Intent("com.MediaPlayer.action.NET_MUSIC_BUFFERING");
                    sendBroadcast(mediaplayer);
                    startNotificationHandler();
                }

            
            {
                this$0 = MusicPlayService.this;
                super();
            }
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (JamendoMusic jamendomusic)
        {
            return;
        }
    }

    public void startNotificationHandler()
    {
        handler.postDelayed(new Runnable() {

            final MusicPlayService this$0;

            public void run()
            {
                if (MyApplication.getInstance().isPlaying())
                {
                    MyNotiofation.sendNotify(getApplicationContext(), manager);
                    return;
                } else
                {
                    MyNotiofation.clearNotification();
                    return;
                }
            }

            
            {
                this$0 = MusicPlayService.this;
                super();
            }
        }, 100L);
    }














}
