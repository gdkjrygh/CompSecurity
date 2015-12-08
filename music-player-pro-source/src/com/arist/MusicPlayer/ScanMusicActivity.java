// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.MusicPlayer;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.arist.biz.MusicBiz;
import com.arist.dao.MusicDao;
import com.arist.dao.MusicFolderDao;
import com.arist.util.Constant;
import com.arist.util.FavMusicXmlUtil;
import com.arist.util.LrcFileUtil;
import com.arist.util.MainGridPreference;
import java.io.File;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class ScanMusicActivity extends Activity
{

    private Button btnScan;
    private MusicFolderDao folderDao;
    private Handler handler;
    private MainGridPreference mainPref;
    private MusicBiz musicBiz;
    private MusicDao musicDao;
    private ProgressBar pbScan;
    private Thread thread;
    private Timer timer;
    private TextView tvCount;
    private TextView tvTotal;

    public ScanMusicActivity()
    {
        timer = null;
    }

    private void initMainGrid()
    {
        try
        {
            mainPref.saveAdd(musicBiz.getRecentAddMusic().size());
            mainPref.saveAlbum(musicDao.getAlbumNum());
            mainPref.saveAllMusic(musicDao.getAllMusic().size());
            mainPref.saveArtist(musicDao.getArtistNum());
            mainPref.saveDownload(musicDao.getMusic(Constant.BASE_DOWNLOAD_PATH.substring(0, Constant.BASE_DOWNLOAD_PATH.length() - 1)).size());
            mainPref.saveFav(FavMusicXmlUtil.getFavMusic().size());
            mainPref.saveFolder(musicDao.getFolder().size());
            return;
        }
        catch (Exception exception)
        {
            return;
        }
    }

    private void updateMusicList()
    {
        try
        {
            musicDao.deleteAllMusic();
            folderDao.deleteAllFolder();
            musicBiz.addAllMusicToDB();
            musicBiz.addMusicFolderToDB();
            initMainGrid();
            return;
        }
        catch (Exception exception)
        {
            return;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setContentView(0x7f030021);
        musicDao = new MusicDao(this);
        folderDao = new MusicFolderDao(this);
        mainPref = new MainGridPreference(this);
        musicBiz = new MusicBiz(this);
        musicBiz.setMusicDao(musicDao);
        musicBiz.setFolderDao(folderDao);
        tvCount = (TextView)findViewById(0x7f0d0099);
        tvTotal = (TextView)findViewById(0x7f0d009a);
        tvTotal.setText((new StringBuilder(String.valueOf(getString(0x7f080070)))).append(" ").append(musicBiz.getTotalMusic()).append(" ").append(getString(0x7f08005d)).toString());
        pbScan = (ProgressBar)findViewById(0x7f0d009b);
        btnScan = (Button)findViewById(0x7f0d009c);
        btnScan.setOnClickListener(new android.view.View.OnClickListener() {

            final ScanMusicActivity this$0;

            public void onClick(View view)
            {
                if (getString(0x7f080072).equals(btnScan.getText()))
                {
                    finish();
                    return;
                } else
                {
                    thread.start();
                    btnScan.setText(getString(0x7f080073));
                    btnScan.setEnabled(false);
                    return;
                }
            }

            
            {
                this$0 = ScanMusicActivity.this;
                super();
            }
        });
        findViewById(0x7f0d0097).setOnClickListener(new android.view.View.OnClickListener() {

            final ScanMusicActivity this$0;

            public void onClick(View view)
            {
                finish();
            }

            
            {
                this$0 = ScanMusicActivity.this;
                super();
            }
        });
        handler = new Handler() {

            final ScanMusicActivity this$0;

            public void handleMessage(Message message)
            {
                if (message.what != 1) goto _L2; else goto _L1
_L1:
                tvCount.setText((new StringBuilder(String.valueOf(getString(0x7f080071)))).append(" ").append(musicBiz.getCount()).append(" ").append(getString(0x7f08005d)).toString());
_L4:
                super.handleMessage(message);
                return;
_L2:
                if (message.what == 2)
                {
                    btnScan.setText(getString(0x7f080077));
                } else
                if (message.what == 3)
                {
                    btnScan.setText(getString(0x7f080072));
                    btnScan.setEnabled(true);
                }
                if (true) goto _L4; else goto _L3
_L3:
            }

            
            {
                this$0 = ScanMusicActivity.this;
                super();
            }
        };
        thread = new Thread() {

            final ScanMusicActivity this$0;

            public void run()
            {
                updateMusicList();
                handler.sendEmptyMessage(2);
                LrcFileUtil.moveLrcFile(new File(Constant.rootDir));
                handler.sendEmptyMessage(3);
                timer.cancel();
            }

            
            {
                this$0 = ScanMusicActivity.this;
                super();
            }
        };
        timer = new Timer();
        timer.schedule(new TimerTask() {

            int progress;
            final ScanMusicActivity this$0;
            int totalMusic;

            public void run()
            {
                int i = musicBiz.getCount();
                if (totalMusic > 0)
                {
                    progress = (int)(((double)i * 1000D) / (double)totalMusic);
                } else
                {
                    progress = 0;
                }
                pbScan.setProgress(progress);
                handler.sendEmptyMessage(1);
                if (musicBiz.getCount() == totalMusic)
                {
                    timer.cancel();
                }
            }

            
            {
                this$0 = ScanMusicActivity.this;
                super();
                progress = 0;
                totalMusic = musicBiz.getTotalMusic();
            }
        }, 0L, 100L);
    }

    protected void onDestroy()
    {
        try
        {
            if (thread != null)
            {
                thread.stop();
            }
            timer.cancel();
        }
        catch (Exception exception) { }
        super.onDestroy();
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        if (i == 4 && 1 == keyevent.getAction())
        {
            (new android.app.AlertDialog.Builder(this)).setTitle(getString(0x7f080052)).setIcon(0x108009b).setMessage(getString(0x7f080076)).setPositiveButton(getString(0x7f080052), new android.content.DialogInterface.OnClickListener() {

                final ScanMusicActivity this$0;

                public void onClick(DialogInterface dialoginterface, int j)
                {
                    finish();
                }

            
            {
                this$0 = ScanMusicActivity.this;
                super();
            }
            }).setNegativeButton(getString(0x7f080051), null).setCancelable(true).create().show();
        }
        return super.onKeyDown(i, keyevent);
    }








}
