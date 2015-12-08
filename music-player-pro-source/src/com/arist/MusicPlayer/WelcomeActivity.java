// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.MusicPlayer;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.preference.PreferenceManager;
import android.view.Window;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.arist.biz.MusicBiz;
import com.arist.dao.MusicDao;
import com.arist.dao.MusicFolderDao;
import com.arist.util.Constant;
import com.arist.util.LrcFileUtil;
import com.arist.util.MainGridPreference;
import java.io.File;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

// Referenced classes of package com.arist.MusicPlayer:
//            MainActivity

public class WelcomeActivity extends Activity
{

    private MusicBiz biz;
    private boolean flag;
    private MusicFolderDao folderDao;
    private Handler handler;
    private MainGridPreference mainPref;
    private MusicDao musicDao;
    private ProgressBar pbWelcome;
    private TextView tvWelcome;

    public WelcomeActivity()
    {
        flag = false;
    }

    private void gotoMainActivity()
    {
        startActivity(new Intent(this, com/arist/MusicPlayer/MainActivity));
        overridePendingTransition(0x7f040009, 0);
        finish();
    }

    private void init()
    {
        tvWelcome.setVisibility(0);
        pbWelcome.setVisibility(0);
        musicDao = new MusicDao(this);
        folderDao = new MusicFolderDao(this);
        biz = new MusicBiz(this);
        biz.setMusicDao(musicDao);
        biz.setFolderDao(folderDao);
        final Timer timer = new Timer();
        timer.schedule(new TimerTask() {

            int progress;
            final WelcomeActivity this$0;
            int totalMusic;

            public void run()
            {
                if (totalMusic > 0)
                {
                    progress = (int)(((double)biz.getCount() * 1000D) / (double)totalMusic);
                } else
                {
                    progress = 0;
                }
                pbWelcome.setProgress(progress);
                if (flag)
                {
                    pbWelcome.setProgress(1000);
                }
            }

            
            {
                this$0 = WelcomeActivity.this;
                super();
                progress = 0;
                totalMusic = biz.getTotalMusic();
            }
        }, 0L, 500L);
        (new Thread() {

            final WelcomeActivity this$0;
            private final Timer val$timer;

            public void run()
            {
                updateMusicList();
                handler.sendMessage(handler.obtainMessage());
                LrcFileUtil.moveLrcFile(new File(Constant.rootDir));
                flag = true;
                timer.cancel();
                gotoMainActivity();
            }

            
            {
                this$0 = WelcomeActivity.this;
                timer = timer1;
                super();
            }
        }).start();
    }

    private void initMainGrid()
    {
        mainPref.saveAdd(biz.getRecentAddMusic().size());
        mainPref.saveAlbum(musicDao.getAlbumNum());
        mainPref.saveAllMusic(musicDao.getAllMusic().size());
        mainPref.saveArtist(musicDao.getArtistNum());
        mainPref.saveDownload(0);
        mainPref.saveFav(0);
        mainPref.saveFolder(musicDao.getFolder().size());
    }

    private void updateMusicList()
    {
        musicDao.deleteAllMusic();
        folderDao.deleteAllFolder();
        biz.addAllMusicToDB();
        biz.addMusicFolderToDB();
        initMainGrid();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        requestWindowFeature(1);
        getWindow().setFlags(1024, 1024);
        setContentView(0x7f030026);
        tvWelcome = (TextView)findViewById(0x7f0d00b2);
        pbWelcome = (ProgressBar)findViewById(0x7f0d00b3);
        bundle = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        mainPref = new MainGridPreference(this);
        handler = new Handler() {

            final WelcomeActivity this$0;

            public void handleMessage(Message message)
            {
                tvWelcome.setText(0x7f080035);
                super.handleMessage(message);
            }

            
            {
                this$0 = WelcomeActivity.this;
                super();
            }
        };
        if (bundle.getBoolean("isFirstUse", true))
        {
            init();
            bundle.edit().putBoolean("isFirstUse", false).commit();
            return;
        } else
        {
            (new Handler()).postDelayed(new Runnable() {

                final WelcomeActivity this$0;

                public void run()
                {
                    try
                    {
                        gotoMainActivity();
                        return;
                    }
                    catch (Exception exception)
                    {
                        exception.printStackTrace();
                    }
                }

            
            {
                this$0 = WelcomeActivity.this;
                super();
            }
            }, 1000L);
            return;
        }
    }








}
