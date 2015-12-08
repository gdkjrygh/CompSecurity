// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.MusicPlayer;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import com.arist.MyView.LyricView;
import com.arist.entity.Lyric;
import com.arist.util.AlbumPicUtil;
import com.arist.util.LrcRead;
import com.arist.util.MusicPreference;
import com.arist.util.TimeFormat;
import java.io.File;
import java.util.ArrayList;
import yong.powerfull.equalizer.VisualizerView;

// Referenced classes of package com.arist.MusicPlayer:
//            MyApplication, MainActivity

public class MusicPlayActivity extends Activity
{
    private class MyReciever extends BroadcastReceiver
    {

        final MusicPlayActivity this$0;

        public void onReceive(Context context, Intent intent)
        {
            if ("com.MediaPlayer.action.DESTORY".equals(intent.getAction()))
            {
                finish();
            } else
            {
                if ("com.MediaPlayer.action.MUSIC_CHANGED".equals(intent.getAction()))
                {
                    updateView();
                    handler.sendMessage(handler.obtainMessage(3));
                    return;
                }
                if ("com.MediaPlayer.action.STATUS_CHANGED".equals(intent.getAction()))
                {
                    updateView();
                    return;
                }
            }
        }

        private MyReciever()
        {
            this$0 = MusicPlayActivity.this;
            super();
        }

        MyReciever(MyReciever myreciever)
        {
            this();
        }
    }


    private ImageView ablamImage;
    private ImageButton btnNext;
    private ImageButton btnPlay;
    private ImageButton btnPlayList;
    private ImageButton btnPlayMode;
    private ImageButton btnPrevious;
    private ArrayList files;
    private Handler handler;
    Handler handlerUpdateSeekBar;
    private int index;
    private boolean isFront;
    private RelativeLayout layout;
    private LrcRead lrcRead;
    private int lyricCurrentTime;
    private ArrayList lyricList;
    private String lyricPath;
    Runnable lyricRunnable;
    private int lyricTotalTime;
    private LyricView lyricView;
    MyReciever mReciever;
    private android.widget.SeekBar.OnSeekBarChangeListener mSeekBarChangeListener;
    private SeekBar musicProgress;
    private int playModeArr[] = {
        0x7f020047, 0x7f02004a, 0x7f020046, 0x7f02004c
    };
    private String playModeStrArr[];
    private TextView tvCurrentTime;
    private TextView tvMusicArtist;
    private TextView tvMusicName;
    private TextView tvTotalTime;
    Runnable updateSeekBarThread;
    private VisualizerView visualizer;

    public MusicPlayActivity()
    {
        handlerUpdateSeekBar = new Handler();
        updateSeekBarThread = new Runnable() {

            final MusicPlayActivity this$0;

            public void run()
            {
                if (MyApplication.mediaPlayer != null)
                {
                    musicProgress.setProgress(MyApplication.getMusicProgress());
                    tvTotalTime.setText(TimeFormat.timeFormat(MyApplication.getMusicDuration()));
                    tvCurrentTime.setText(TimeFormat.timeFormat(MyApplication.getMusicProgress()));
                    handlerUpdateSeekBar.postDelayed(updateSeekBarThread, 100L);
                }
            }

            
            {
                this$0 = MusicPlayActivity.this;
                super();
            }
        };
        mSeekBarChangeListener = new android.widget.SeekBar.OnSeekBarChangeListener() {

            final MusicPlayActivity this$0;

            public void onProgressChanged(SeekBar seekbar, int i, boolean flag)
            {
                if (!flag || MyApplication.mediaPlayer == null)
                {
                    return;
                } else
                {
                    MyApplication.mediaPlayer.seekTo(i);
                    return;
                }
            }

            public void onStartTrackingTouch(SeekBar seekbar)
            {
                if (MyApplication.mediaPlayer == null)
                {
                    return;
                } else
                {
                    MyApplication.mediaPlayer.pause();
                    return;
                }
            }

            public void onStopTrackingTouch(SeekBar seekbar)
            {
                if (MyApplication.mediaPlayer == null)
                {
                    return;
                } else
                {
                    MyApplication.mediaPlayer.seekTo(seekbar.getProgress());
                    MyApplication.mediaPlayer.start();
                    return;
                }
            }

            
            {
                this$0 = MusicPlayActivity.this;
                super();
            }
        };
        lyricCurrentTime = 0;
        lyricTotalTime = 0;
        index = 0;
        isFront = false;
        lyricRunnable = new Runnable() {

            final MusicPlayActivity this$0;

            public void run()
            {
                if (lyricList == null)
                {
                    lyricView.clearText();
                } else
                {
                    lyricView.setText("");
                    lyricView.setIndex(getIndex());
                    lyricView.invalidate();
                    if (isFront)
                    {
                        handler.postDelayed(lyricRunnable, 100L);
                        return;
                    }
                }
            }

            
            {
                this$0 = MusicPlayActivity.this;
                super();
            }
        };
        mReciever = null;
        playModeStrArr = new String[4];
    }

    private void doPlay()
    {
        Intent intent = new Intent();
        intent.setAction("com.MediaPlayer.action.PLAY");
        sendBroadcast(intent);
    }

    private void doPlayNext()
    {
        Intent intent = new Intent();
        intent.setAction("com.MediaPlayer.action.NEXT");
        sendBroadcast(intent);
    }

    private void doPlayPre()
    {
        Intent intent = new Intent();
        intent.setAction("com.MediaPlayer.action.PREVIOUS");
        sendBroadcast(intent);
    }

    private String findLyric()
    {
        Object obj = null;
        String s = MyApplication.getMusicTitle();
        files = new ArrayList();
        files = lrcRead.findLyric(s);
        s = obj;
        if (files != null)
        {
            s = obj;
            if (files.size() > 0)
            {
                s = ((File)files.get(0)).getAbsolutePath();
                Log.i("info", s);
            }
        }
        return s;
    }

    private void setLyric()
    {
        lyricView.setTextSize(MyApplication.musicPref.getLrcSize());
        MyApplication.musicPref.saveLrcColor(Color.argb(100, 255, 255, 255));
        lyricView.setColor(MyApplication.musicPref.getLrcColor());
        MyApplication.musicPref.saveHightLightColor(Color.argb(255, 255, 255, 255));
        lyricView.setHighlightColor(MyApplication.musicPref.getHighLightColor());
    }

    private void updateView()
    {
        tvMusicName.setText(MyApplication.getMusicTitle());
        tvMusicArtist.setText(MyApplication.getMusicArtist());
        musicProgress.setMax(MyApplication.getMusicDuration());
        musicProgress.setProgress(MyApplication.getMusicProgress());
        android.graphics.Bitmap bitmap = AlbumPicUtil.getAlbumBitmap(MyApplication.getCurrentMusic());
        if (bitmap != null)
        {
            bitmap = AlbumPicUtil.createReflectedImage(bitmap);
            ablamImage.setImageBitmap(bitmap);
        } else
        {
            android.graphics.Bitmap bitmap1 = AlbumPicUtil.createReflectedImage(BitmapFactory.decodeResource(getResources(), 0x7f020017));
            ablamImage.setImageBitmap(bitmap1);
        }
        if (MyApplication.status == 2)
        {
            btnPlay.setImageResource(0x7f020050);
        } else
        {
            btnPlay.setImageResource(0x7f020052);
        }
        btnPlayMode.setImageResource(playModeArr[MyApplication.playMode - 1]);
    }

    public int getIndex()
    {
        lyricCurrentTime = MyApplication.getMusicProgress();
        lyricTotalTime = MyApplication.getMusicDuration();
        if (lyricCurrentTime >= lyricTotalTime) goto _L2; else goto _L1
_L1:
        int i = 0;
_L9:
        if (i < lyricList.size()) goto _L3; else goto _L2
_L2:
        int j = index;
_L5:
        return j;
_L3:
        if (i >= lyricList.size() - 1)
        {
            break; /* Loop/switch isn't completed */
        }
        if (lyricCurrentTime >= ((Lyric)lyricList.get(i)).getLyricTime())
        {
            break; /* Loop/switch isn't completed */
        }
        j = i;
        if (i == 0) goto _L5; else goto _L4
_L4:
        if (lyricCurrentTime <= ((Lyric)lyricList.get(i)).getLyricTime())
        {
            break; /* Loop/switch isn't completed */
        }
        j = i;
        if (lyricCurrentTime < ((Lyric)lyricList.get(i + 1)).getLyricTime()) goto _L5; else goto _L6
_L6:
        if (i != lyricList.size() - 1)
        {
            break; /* Loop/switch isn't completed */
        }
        j = i;
        if (lyricCurrentTime > ((Lyric)lyricList.get(i)).getLyricTime()) goto _L5; else goto _L7
_L7:
        i++;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public void initData()
    {
        lrcRead = new LrcRead();
        tvMusicName.setText(MyApplication.getMusicTitle());
        tvMusicArtist.setText(MyApplication.getMusicArtist());
        playModeStrArr = getResources().getStringArray(0x7f0b0002);
    }

    public void initListener()
    {
        btnPlay.setOnClickListener(new android.view.View.OnClickListener() {

            final MusicPlayActivity this$0;

            public void onClick(View view)
            {
                doPlay();
            }

            
            {
                this$0 = MusicPlayActivity.this;
                super();
            }
        });
        btnPrevious.setOnClickListener(new android.view.View.OnClickListener() {

            final MusicPlayActivity this$0;

            public void onClick(View view)
            {
                doPlayPre();
            }

            
            {
                this$0 = MusicPlayActivity.this;
                super();
            }
        });
        btnNext.setOnClickListener(new android.view.View.OnClickListener() {

            final MusicPlayActivity this$0;

            public void onClick(View view)
            {
                doPlayNext();
            }

            
            {
                this$0 = MusicPlayActivity.this;
                super();
            }
        });
        btnPlayList.setOnClickListener(new android.view.View.OnClickListener() {

            final MusicPlayActivity this$0;

            public void onClick(View view)
            {
                MyApplication.showList = true;
                view = new Intent(MusicPlayActivity.this, com/arist/MusicPlayer/MainActivity);
                startActivity(view);
                overridePendingTransition(0x7f040002, 0x7f040007);
                finish();
            }

            
            {
                this$0 = MusicPlayActivity.this;
                super();
            }
        });
        btnPlayMode.setOnClickListener(new android.view.View.OnClickListener() {

            final MusicPlayActivity this$0;

            public void onClick(View view)
            {
                int i = MyApplication.playMode + 1;
                MyApplication.playMode = i;
                if (i > 4)
                {
                    i = 1;
                } else
                {
                    i = MyApplication.playMode;
                }
                MyApplication.playMode = i;
                Toast.makeText(MusicPlayActivity.this, playModeStrArr[MyApplication.playMode - 1], 0).show();
                btnPlayMode.setImageResource(playModeArr[MyApplication.playMode - 1]);
            }

            
            {
                this$0 = MusicPlayActivity.this;
                super();
            }
        });
    }

    public void initView()
    {
        layout = (RelativeLayout)findViewById(0x7f0d007c);
        btnPlayList = (ImageButton)findViewById(0x7f0d002f);
        btnPlayMode = (ImageButton)findViewById(0x7f0d002e);
        btnPrevious = (ImageButton)findViewById(0x7f0d002b);
        btnPlay = (ImageButton)findViewById(0x7f0d002c);
        btnNext = (ImageButton)findViewById(0x7f0d002d);
        tvMusicName = (TextView)findViewById(0x7f0d0084);
        tvMusicArtist = (TextView)findViewById(0x7f0d0083);
        ablamImage = (ImageView)findViewById(0x7f0d0082);
        lyricView = (LyricView)findViewById(0x7f0d0086);
        tvCurrentTime = (TextView)findViewById(0x7f0d007f);
        tvTotalTime = (TextView)findViewById(0x7f0d0080);
        tvCurrentTime.setText(TimeFormat.timeFormat(0));
        musicProgress = (SeekBar)findViewById(0x7f0d007e);
        musicProgress.setOnSeekBarChangeListener(mSeekBarChangeListener);
        if (android.os.Build.VERSION.SDK_INT >= 9)
        {
            visualizer = (VisualizerView)findViewById(0x7f0d006a);
            visualizer.setupVisualizerFx(MyApplication.mediaPlayer.getAudioSessionId());
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setContentView(0x7f03001c);
        MyApplication.getInstance().addActivity(this);
        initView();
        initData();
        initListener();
        handlerUpdateSeekBar.post(updateSeekBarThread);
        handler = new Handler() {

            final MusicPlayActivity this$0;

            public void handleMessage(Message message)
            {
                if (message.what == 3)
                {
                    lyricPath = findLyric();
                    if (lyricPath == null)
                    {
                        lyricList = null;
                        handler.post(lyricRunnable);
                        return;
                    }
                    (new Thread() {

                        final _cls9 this$1;

                        public void run()
                        {
                            try
                            {
                                lyricList = lrcRead.Read(lyricPath);
                            }
                            catch (Exception exception) { }
                            if (lyricList != null)
                            {
                                lyricView.setLyricList(lyricList);
                            }
                            handler.post(lyricRunnable);
                        }

            
            {
                this$1 = _cls9.this;
                super();
            }
                    }).start();
                    setLyric();
                }
                super.handleMessage(message);
            }


            
            {
                this$0 = MusicPlayActivity.this;
                super();
            }
        };
    }

    protected void onDestroy()
    {
        unregisterReceiver(mReciever);
        if (visualizer != null)
        {
            visualizer.releaseVisualizerFx();
        }
        super.onDestroy();
    }

    protected void onPause()
    {
        isFront = false;
        super.onPause();
    }

    protected void onResume()
    {
        updateView();
        layout.setBackgroundResource(MyApplication.getWallpaperId());
        if (MyApplication.status != 1)
        {
            handler.sendMessage(handler.obtainMessage(3));
        }
        isFront = true;
        setLyric();
        handler.sendMessage(handler.obtainMessage(3));
        super.onResume();
    }

    protected void onStart()
    {
        mReciever = new MyReciever(null);
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("com.MediaPlayer.action.DESTORY");
        intentfilter.addAction("com.MediaPlayer.action.MEDIAPLAYER_INFO");
        intentfilter.addAction("com.MediaPlayer.action.MUSIC_CHANGED");
        intentfilter.addAction("com.MediaPlayer.action.STATUS_CHANGED");
        registerReceiver(mReciever, intentfilter);
        super.onStart();
    }




















}
