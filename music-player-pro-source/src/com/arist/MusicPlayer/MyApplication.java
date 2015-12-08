// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.MusicPlayer;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.preference.PreferenceManager;
import com.arist.dao.MusicDao;
import com.arist.entity.Music;
import com.arist.service.MusicPlayService;
import com.arist.util.MusicPreference;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class MyApplication extends Application
{

    public static Context context;
    private static Music currentMusic;
    public static int currentPage;
    public static int currentPosition;
    private static SharedPreferences defaultPref;
    public static MyApplication instance;
    public static boolean isplayNetMusic = false;
    public static Color lrcColor;
    public static int lrcSize;
    public static MediaPlayer mediaPlayer;
    public static String musicAlbum;
    public static String musicData;
    public static int musicDuration;
    public static ArrayList musicList = new ArrayList();
    public static MusicPreference musicPref;
    public static int musicProgress;
    public static int playMode;
    public static boolean showList = false;
    public static int status = 1;
    public static Timer timer;
    public static Timer timerStartService;
    public List activityList;
    private MusicDao musicDao;

    public MyApplication()
    {
        activityList = new LinkedList();
    }

    public static Music getCurrentMusic()
    {
        if (isplayNetMusic)
        {
            return currentMusic;
        }
        if (currentPosition < musicList.size())
        {
            currentMusic = (Music)musicList.get(currentPosition);
        }
        return currentMusic;
    }

    public static int getCurrentPage()
    {
        return currentPage;
    }

    public static int getCurrentPosition()
    {
        return currentPosition;
    }

    public static SharedPreferences getDefaultSharedPreferences()
    {
        defaultPref = PreferenceManager.getDefaultSharedPreferences(context);
        return defaultPref;
    }

    public static MyApplication getInstance()
    {
        if (instance == null)
        {
            instance = new MyApplication();
        }
        return instance;
    }

    public static String getMusicAlbum()
    {
        if (currentMusic == null)
        {
            return "";
        } else
        {
            return currentMusic.getAlbum();
        }
    }

    public static int getMusicAlbumId()
    {
        if (currentMusic == null)
        {
            return -1;
        } else
        {
            return currentMusic.getAlbumId();
        }
    }

    public static String getMusicArtist()
    {
        if (currentMusic == null)
        {
            return "";
        } else
        {
            return currentMusic.getArtist();
        }
    }

    public static String getMusicData()
    {
        if (currentMusic == null)
        {
            return "";
        } else
        {
            return currentMusic.getData();
        }
    }

    public static int getMusicDuration()
    {
        while (currentMusic == null || currentMusic.getDuration() == 0) 
        {
            return 0x493e0;
        }
        return currentMusic.getDuration();
    }

    public static String getMusicFolderPath()
    {
        if (currentMusic == null)
        {
            return "";
        } else
        {
            return currentMusic.getFolderPath();
        }
    }

    public static int getMusicProgress()
    {
        return mediaPlayer.getCurrentPosition();
    }

    public static String getMusicTitle()
    {
        if (currentMusic == null)
        {
            return "";
        } else
        {
            return currentMusic.getTitle();
        }
    }

    public static int getWallpaperId()
    {
        return defaultPref.getInt("wallpaper_id", 0x7f020005);
    }

    public static void setCurrentMusic(Music music)
    {
        currentMusic = music;
    }

    public static void setCurrentPage(int i)
    {
        currentPage = i;
    }

    public static void setCurrentPosition(int i)
    {
        currentPosition = i;
    }

    public static void setPlayNetMusic(boolean flag)
    {
        isplayNetMusic = flag;
    }

    public static void setWallpaperId(int i)
    {
        defaultPref.edit().putInt("wallpaper_id", i).commit();
    }

    private void sortMusicList(ArrayList arraylist)
    {
        Collections.sort(arraylist, new Comparator() {

            final MyApplication this$0;

            public int compare(Music music, Music music1)
            {
                return music.getTitle().compareTo(music1.getTitle()) <= 0 ? -1 : 1;
            }

            public volatile int compare(Object obj, Object obj1)
            {
                return compare((Music)obj, (Music)obj1);
            }

            
            {
                this$0 = MyApplication.this;
                super();
            }
        });
    }

    public void addActivity(Activity activity)
    {
        activityList.add(activity);
    }

    public void append(Music music)
    {
        if (music != null)
        {
            musicList.add(music);
        }
    }

    public void append(ArrayList arraylist)
    {
        if (arraylist != null)
        {
            arraylist.addAll(arraylist);
        }
    }

    public void exit()
    {
        Iterator iterator = activityList.iterator();
        do
        {
            Activity activity;
            do
            {
                if (!iterator.hasNext())
                {
                    System.exit(0);
                    return;
                }
                activity = (Activity)iterator.next();
            } while (activity == null);
            activity.finish();
        } while (true);
    }

    public ArrayList getmusicList()
    {
        if (musicList == null)
        {
            return new ArrayList();
        } else
        {
            return musicList;
        }
    }

    public boolean isPlaying()
    {
        if (mediaPlayer == null)
        {
            return false;
        } else
        {
            return mediaPlayer.isPlaying();
        }
    }

    public void onCreate()
    {
        super.onCreate();
        context = getApplicationContext();
        instance = this;
        mediaPlayer = new MediaPlayer();
        mediaPlayer.setAudioStreamType(3);
        musicDao = new MusicDao(context);
        defaultPref = PreferenceManager.getDefaultSharedPreferences(context);
        musicPref = new MusicPreference(context);
        currentPosition = musicPref.getPosition();
        String s = musicPref.getData();
        musicProgress = musicPref.getProgress();
        playMode = musicPref.getPlayMode();
        if ((new File(s)).isFile())
        {
            currentMusic = musicDao.getMusicByPath(s);
            try
            {
                mediaPlayer.setDataSource(currentMusic.getData());
                mediaPlayer.prepare();
                mediaPlayer.seekTo(musicProgress);
                musicList = musicDao.getMusic(currentMusic.getFolderPath());
                sortMusicList(musicList);
            }
            catch (Exception exception) { }
        } else
        {
            currentMusic = null;
            currentPosition = 0;
        }
        timerStartService = new Timer();
        timerStartService.schedule(new TimerTask() {

            final MyApplication this$0;

            public void run()
            {
                Intent intent = new Intent(MyApplication.context, com/arist/service/MusicPlayService);
                startService(intent);
                MyApplication.timerStartService.cancel();
            }

            
            {
                this$0 = MyApplication.this;
                super();
            }
        }, 2000L);
        timer = new Timer();
        timer.schedule(new TimerTask() {

            final MyApplication this$0;

            public void run()
            {
                if (MyApplication.mediaPlayer.isPlaying())
                {
                    Intent intent = new Intent();
                    intent.setAction("com.MediaPlayer.action.MEDIAPLAYER_INFO");
                    MyApplication.musicProgress = MyApplication.mediaPlayer.getCurrentPosition();
                    intent.putExtra("musicProgress", MyApplication.musicProgress);
                    getApplicationContext().sendBroadcast(intent);
                }
            }

            
            {
                this$0 = MyApplication.this;
                super();
            }
        }, 0L, 500L);
    }

    public void setMusicList(ArrayList arraylist)
    {
        if (arraylist == null)
        {
            musicList = new ArrayList();
            return;
        } else
        {
            musicList = arraylist;
            return;
        }
    }

}
