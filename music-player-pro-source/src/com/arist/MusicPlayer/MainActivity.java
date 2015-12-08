// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.MusicPlayer;

import android.app.Activity;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.view.ViewPager;
import android.text.Editable;
import android.util.Log;
import android.view.Display;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.arist.Adapter.FolderAdapter;
import com.arist.Adapter.MainGridAdapter;
import com.arist.Adapter.MusicAdapter;
import com.arist.Adapter.MyPagerAdapter;
import com.arist.Adapter.NetMusicAdapter;
import com.arist.PopMenu.PopupWindowSearch;
import com.arist.biz.ButtonInfoBiz;
import com.arist.biz.MusicBiz;
import com.arist.dao.MusicDao;
import com.arist.dao.MusicFolderDao;
import com.arist.entity.Music;
import com.arist.entity.MusicFolder;
import com.arist.notify.MyNotiofation;
import com.arist.service.MusicDownloadService;
import com.arist.util.AdUtil;
import com.arist.util.AlbumPicUtil;
import com.arist.util.BitmapService;
import com.arist.util.Constant;
import com.arist.util.FavMusicXmlUtil;
import com.arist.util.MainGridPreference;
import com.arist.util.MusicPreference;
import com.arist.util.TimeFormat;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.umeng.analytics.MobclickAgent;
import com.yong.jamendo.api.JamendoGet2ApiImpl;
import com.yong.jamendo.api.JamendoMusic;
import com.yong.jamendo.api.WSError;
import com.yong.slidemenu.SlideHolder;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Timer;
import java.util.TimerTask;
import net.coocent.android.exitwithrate.EnterAndExit;
import net.coocent.android.xmlparser.LoadAppInfoListener;
import net.coocent.android.xmlparser.PromotionSDK;
import yong.powerfull.equalizer.Equize;

// Referenced classes of package com.arist.MusicPlayer:
//            MyApplication, MusicPlayActivity, SettingScreen, ScanMusicActivity, 
//            SkinSetting

public class MainActivity extends Activity
    implements LoadAppInfoListener
{
    private class MyReciever extends BroadcastReceiver
    {

        final MainActivity this$0;

        public void onReceive(Context context, Intent intent)
        {
            if ("com.MediaPlayer.action.MEDIAPLAYER_INFO".equals(intent.getAction()))
            {
                int i = intent.getIntExtra("musicProgress", 0);
                if (!seeking)
                {
                    musicProgressMain.setProgress((i * 1000) / MyApplication.getMusicDuration());
                }
            } else
            {
                if ("com.MediaPlayer.action.MUSIC_CHANGED".equals(intent.getAction()))
                {
                    updateView();
                    musicAdapter.notifyDataSetChanged();
                    return;
                }
                if ("com.MediaPlayer.action.STATUS_CHANGED".equals(intent.getAction()))
                {
                    updatePlayStatusView();
                    return;
                }
                if ("com.MediaPlayer.action.UPDATE_NETMUEIC_VIEW".equals(intent.getAction()))
                {
                    downloadMusicName = intent.getStringExtra("name");
                    context = intent.getStringExtra("albumName");
                    Toast.makeText(MainActivity.this, (new StringBuilder(String.valueOf(downloadMusicName))).append(".mp3").append(" ").append(getString(0x7f080082)).toString(), 1).show();
                    mediaScannerConnection = new MediaScannerConnection(MyApplication.context, mediaScannerConnectionClient);
                    mediaScannerConnection.connect();
                    BitmapService.copyCachBmp((new StringBuilder(String.valueOf(downloadMusicName))).append("-").append(context).append(".jpg").toString());
                    return;
                }
                if ("com.MediaPlayer.action.NET_MUSIC_BUFFERING".equals(intent.getAction()))
                {
                    context = handler.obtainMessage();
                    context.what = 7;
                    context.arg1 = 1;
                    handler.sendMessage(context);
                    return;
                }
            }
        }

        private MyReciever()
        {
            this$0 = MainActivity.this;
            super();
        }

        MyReciever(MyReciever myreciever)
        {
            this();
        }
    }

    private class OnClickListenerMusicCancel
        implements android.content.DialogInterface.OnClickListener
    {

        final MainActivity this$0;

        public void onClick(DialogInterface dialoginterface, int i)
        {
            dismissDialog(1);
            removeDialog(1);
        }

        private OnClickListenerMusicCancel()
        {
            this$0 = MainActivity.this;
            super();
        }

        OnClickListenerMusicCancel(OnClickListenerMusicCancel onclicklistenermusiccancel)
        {
            this();
        }
    }

    private class OnClickListenerMusicDetail
        implements android.view.View.OnClickListener
    {

        final MainActivity this$0;

        public void onClick(View view)
        {
            showDialog(2);
            dismissDialog(1);
            removeDialog(1);
        }

        private OnClickListenerMusicDetail()
        {
            this$0 = MainActivity.this;
            super();
        }

        OnClickListenerMusicDetail(OnClickListenerMusicDetail onclicklistenermusicdetail)
        {
            this();
        }
    }

    private class OnClickListenerMusicLove
        implements android.view.View.OnClickListener
    {

        final MainActivity this$0;

        public void onClick(View view)
        {
            Toast.makeText(MainActivity.this, getString(0x7f080064), 0).show();
            (new Thread() {

                final OnClickListenerMusicLove this$1;

                public void run()
                {
                    ArrayList arraylist;
                    arraylist = FavMusicXmlUtil.getFavMusic();
                    if (arraylist.contains(selMusic))
                    {
                        return;
                    }
                    try
                    {
                        arraylist.add(selMusic);
                        FavMusicXmlUtil.saveFavMusic(arraylist);
                        mainPref.saveFav(arraylist.size());
                        return;
                    }
                    catch (Exception exception)
                    {
                        exception.printStackTrace();
                    }
                    return;
                }

            
            {
                this$1 = OnClickListenerMusicLove.this;
                super();
            }
            }).start();
            dismissDialog(1);
            removeDialog(1);
        }


        private OnClickListenerMusicLove()
        {
            this$0 = MainActivity.this;
            super();
        }

        OnClickListenerMusicLove(OnClickListenerMusicLove onclicklistenermusiclove)
        {
            this();
        }
    }

    private class OnClickListenerMusicRemove
        implements android.view.View.OnClickListener
    {

        final MainActivity this$0;

        public void onClick(View view)
        {
            musicDao.deleteMusic(selMusic.getId());
            dismissDialog(1);
            removeDialog(1);
            musics.remove(selMusic);
            musicAdapter.notifyDataSetChanged();
        }

        private OnClickListenerMusicRemove()
        {
            this$0 = MainActivity.this;
            super();
        }

        OnClickListenerMusicRemove(OnClickListenerMusicRemove onclicklistenermusicremove)
        {
            this();
        }
    }

    private class OnClickListenerMusicUpdate
        implements android.view.View.OnClickListener
    {

        final MainActivity this$0;

        public void onClick(View view)
        {
            showDialog(3);
            dismissDialog(1);
            removeDialog(1);
        }

        private OnClickListenerMusicUpdate()
        {
            this$0 = MainActivity.this;
            super();
        }

        OnClickListenerMusicUpdate(OnClickListenerMusicUpdate onclicklistenermusicupdate)
        {
            this();
        }
    }

    class OnItemClickListenerFolder
        implements android.widget.AdapterView.OnItemClickListener
    {

        final MainActivity this$0;

        public void onItemClick(AdapterView adapterview, View view, int i, long l)
        {
            adapterview = (MusicFolder)folderAdapter.getItem(i);
            if ("artist".equals(adapterview.getPath()))
            {
                musics = musicDao.getMusicsByArtist(adapterview.getName());
            } else
            if ("album".equals(adapterview.getPath()))
            {
                musics = musicDao.getMusicsByAlbumId(adapterview.getId());
            } else
            {
                musics = musicDao.getMusic(adapterview.getPath());
            }
            selectedButtonId = 111;
            updateView(3);
        }

        OnItemClickListenerFolder()
        {
            this$0 = MainActivity.this;
            super();
        }
    }

    class OnItemClickListenerMain
        implements android.widget.AdapterView.OnItemClickListener
    {

        final MainActivity this$0;

        public void onItemClick(AdapterView adapterview, View view, int i, long l)
        {
            switch (i)
            {
            default:
                return;

            case 1: // '\001'
                selectedButtonId = 2;
                updateView(2);
                return;

            case 2: // '\002'
                selectedButtonId = 3;
                updateView(2);
                return;

            case 3: // '\003'
                selectedButtonId = 4;
                updateView(2);
                return;

            case 0: // '\0'
                selectedButtonId = 1;
                updateView(3);
                return;

            case 4: // '\004'
                try
                {
                    selectedButtonId = 5;
                    updateView(3);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (AdapterView adapterview)
                {
                    adapterview.printStackTrace();
                }
                return;

            case 5: // '\005'
                mainPref.saveAdd(musicBiz.getRecentAddMusic().size());
                selectedButtonId = 6;
                updateView(3);
                return;

            case 6: // '\006'
                mainPref.saveDownload(musicDao.getMusic(Constant.BASE_DOWNLOAD_PATH.substring(0, Constant.BASE_DOWNLOAD_PATH.length() - 1)).size());
                selectedButtonId = 7;
                updateView(3);
                return;
            }
        }

        OnItemClickListenerMain()
        {
            this$0 = MainActivity.this;
            super();
        }
    }

    class OnItemClickListenerMusic
        implements android.widget.AdapterView.OnItemClickListener
    {

        final MainActivity this$0;

        public void onItemClick(AdapterView adapterview, View view, int i, long l)
        {
            MyApplication.getInstance().setMusicList(musics);
            MyApplication.setCurrentPosition(i);
            sendBroadcast(new Intent("com.MediaPlayer.action.PLAY"));
            if (MyApplication.getDefaultSharedPreferences().getBoolean("switch_playing_interface", false))
            {
                adapterview = new Intent(MainActivity.this, com/arist/MusicPlayer/MusicPlayActivity);
                startActivity(adapterview);
                overridePendingTransition(0x7f040006, 0x7f040003);
            }
            musicAdapter.notifyDataSetChanged();
        }

        OnItemClickListenerMusic()
        {
            this$0 = MainActivity.this;
            super();
        }
    }

    class OnItemClickListenerNetMusic
        implements android.widget.AdapterView.OnItemClickListener
    {

        final MainActivity this$0;

        public void onItemClick(AdapterView adapterview, View view, int i, long l)
        {
            currentNetMusic = (JamendoMusic)netMusicAdapter.getItem(i);
            adapterview = (new StringBuilder(String.valueOf(Constant.BASE_DOWNLOAD_PATH))).append(currentNetMusic.getMusic_name()).append(".mp3").toString();
            if ((new File(adapterview)).exists())
            {
                try
                {
                    MyApplication.mediaPlayer.reset();
                    MyApplication.mediaPlayer.setDataSource(adapterview);
                    MyApplication.mediaPlayer.prepare();
                    MyApplication.mediaPlayer.start();
                    MyApplication.setCurrentMusic(musicDao.getMusicByPath(adapterview));
                    MyApplication.setPlayNetMusic(true);
                    sendBroadcast(new Intent("com.MediaPlayer.action.STATUS_CHANGED"));
                    sendBroadcast(new Intent("com.MediaPlayer.action.MUSIC_CHANGED"));
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (AdapterView adapterview)
                {
                    return;
                }
            } else
            {
                showDialog(4);
                return;
            }
        }

        OnItemClickListenerNetMusic()
        {
            this$0 = MainActivity.this;
            super();
        }
    }

    class OnItemLongClickListenerMusic
        implements android.widget.AdapterView.OnItemLongClickListener
    {

        final MainActivity this$0;

        public boolean onItemLongClick(AdapterView adapterview, View view, int i, long l)
        {
            selMusic = (Music)musicAdapter.getItem(i);
            showDialog(1);
            return true;
        }

        OnItemLongClickListenerMusic()
        {
            this$0 = MainActivity.this;
            super();
        }
    }

    class OnItemLongClickListenerNetMusic
        implements android.widget.AdapterView.OnItemLongClickListener
    {

        final MainActivity this$0;

        public boolean onItemLongClick(AdapterView adapterview, View view, int i, long l)
        {
            currentNetMusic = (JamendoMusic)netMusicAdapter.getItem(i);
            showDialog(5);
            return true;
        }

        OnItemLongClickListenerNetMusic()
        {
            this$0 = MainActivity.this;
            super();
        }
    }

    private class btnNetMusicSearchOnClickListener
        implements android.view.View.OnClickListener
    {

        final MainActivity this$0;

        public void onClick(View view)
        {
            view = etNetMusicSearch.getText().toString();
            if (view != null && !"".equals(view.trim()))
            {
                tv_netMusicTips.setVisibility(8);
                if (!searchThreadRunning)
                {
                    (view. new Thread() {

                        final btnNetMusicSearchOnClickListener this$1;
                        private final String val$text;

                        public void run()
                        {
                            searchThreadRunning = true;
                            Message message1;
                            try
                            {
                                Message message = handler.obtainMessage();
                                message.what = 7;
                                message.arg1 = 0;
                                handler.sendMessage(message);
                                jamendoMusicArray = (new JamendoGet2ApiImpl()).searchForTracksByTag(text);
                                if (jamendoMusicArray == null || jamendoMusicArray.size() < 1)
                                {
                                    handler.sendEmptyMessage(10);
                                }
                            }
                            catch (Exception exception)
                            {
                                exception.printStackTrace();
                            }
                            catch (WSError wserror)
                            {
                                Toast.makeText(getApplicationContext(), 0x7f080084, 1).show();
                                handler.sendEmptyMessage(10);
                                wserror.printStackTrace();
                            }
                            message1 = handler.obtainMessage();
                            message1.what = 7;
                            message1.arg1 = 1;
                            handler.sendMessage(message1);
                            handler.sendMessage(handler.obtainMessage(9));
                            searchThreadRunning = false;
                        }

            
            {
                this$1 = final_btnnetmusicsearchonclicklistener;
                text = String.this;
                super();
            }
                    }).start();
                    return;
                }
            }
        }


        private btnNetMusicSearchOnClickListener()
        {
            this$0 = MainActivity.this;
            super();
        }

        btnNetMusicSearchOnClickListener(btnNetMusicSearchOnClickListener btnnetmusicsearchonclicklistener)
        {
            this();
        }
    }


    private static final int DIALOG_MUEIC_DETAIL = 2;
    private static final int DIALOG_MUEIC_EDIT = 3;
    public static final int DIALOG_MUSIC = 1;
    private static final int DIALOG_NET_MUSIC_CONFIRM = 4;
    public static final int DIALOG_NET_MUSIC_OP = 5;
    private static final int TYPE_FOLDER = 2;
    private static final int TYPE_MUSIC = 3;
    private static final int VP_BUTTONGRID = 0;
    private static final int VP_FOLDERLIST = 1;
    private static final int VP_MUSICLIST = 2;
    private static final int VP_NETMUSICLIST = 3;
    private static final int startAnim = 0;
    private static final int stopAnim = 1;
    private Animation anim;
    private Button btnLocalMusic;
    private ImageButton btnNext;
    private ImageButton btnPlay;
    private ImageButton btnPre;
    private TextView btn_equalizer;
    private TextView btn_exit;
    private TextView btn_playMode;
    private TextView btn_scan;
    private TextView btn_searchMusic;
    private TextView btn_setting;
    private TextView btn_skin;
    private TextView btn_sleep;
    private Button btn_slideMenu;
    private ButtonInfoBiz buttonInfoBiz;
    private ImageView comps[];
    private TextView controlPanelArtistMain;
    private TextView controlPanelTitleMain;
    private LinearLayout controlPanel_TextLayout;
    public JamendoMusic currentNetMusic;
    public int currentPageIndex;
    private String downloadMusicName;
    private EditText etNetMusicSearch;
    private FolderAdapter folderAdapter;
    private MusicFolderDao folderDao;
    private ArrayList folders;
    private RelativeLayout giftLayout;
    private GridView gv;
    private Handler handler;
    private LayoutInflater inflater;
    private ArrayList infos;
    boolean isExitAdLoad;
    private boolean isSleepOpened;
    private ImageView ivAlbum;
    private ImageView ivNetMusicLoading;
    private ImageView iv_comp1;
    private ImageView iv_comp2;
    private ImageView iv_comp3;
    private ArrayList jamendoMusicArray;
    private RelativeLayout layout;
    private ListView listViewFolder;
    private ListView listViewMusic;
    private ListView listViewNetMusic;
    EnterAndExit mEnterAndExit;
    AdView mExitAdview;
    private SlideHolder mSlideHolder;
    private MainGridAdapter mainGridAdapter;
    private MainGridPreference mainPref;
    private MediaScannerConnection mediaScannerConnection;
    private android.media.MediaScannerConnection.MediaScannerConnectionClient mediaScannerConnectionClient;
    private MusicAdapter musicAdapter;
    private MusicBiz musicBiz;
    private MusicDao musicDao;
    private ProgressBar musicProgressMain;
    private ArrayList musics;
    private NetMusicAdapter netMusicAdapter;
    private RelativeLayout netMusicLayout;
    android.view.View.OnClickListener onShareClickListtener;
    private String playModeEntries[];
    private PopupWindowSearch popupWindowSearch;
    private MyReciever reciever;
    private int screenWidth;
    private boolean searchThreadRunning;
    private int seekProgress;
    private Timer seekTimer;
    private boolean seeking;
    public Music selMusic;
    private int selectedButtonId;
    private int sleepTime;
    private Timer sleepTimer;
    private TextView tv_netMusicTips;
    private MyPagerAdapter vpAdapter;
    private ViewPager vpContainer;
    private ArrayList vpViews;

    public MainActivity()
    {
        currentPageIndex = 0;
        isExitAdLoad = false;
        popupWindowSearch = null;
        vpContainer = null;
        vpViews = new ArrayList();
        selectedButtonId = 4;
        seeking = false;
        onShareClickListtener = new android.view.View.OnClickListener() {

            final MainActivity this$0;

            public void onClick(View view)
            {
                anim = AnimationUtils.loadAnimation(MainActivity.this, 0x7f040008);
                ivAlbum.startAnimation(anim);
                anim.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

                    final _cls1 this$1;

                    public void onAnimationEnd(Animation animation)
                    {
                        animation = new Intent(_fld0, com/arist/MusicPlayer/MusicPlayActivity);
                        startActivity(animation);
                        overridePendingTransition(0x7f040006, 0x7f040003);
                    }

                    public void onAnimationRepeat(Animation animation)
                    {
                    }

                    public void onAnimationStart(Animation animation)
                    {
                    }

            
            {
                this$1 = _cls1.this;
                super();
            }
                });
            }


            
            {
                this$0 = MainActivity.this;
                super();
            }
        };
        seekProgress = 0;
        isSleepOpened = false;
        playModeEntries = new String[4];
        downloadMusicName = "";
        mediaScannerConnectionClient = new android.media.MediaScannerConnection.MediaScannerConnectionClient() {

            final MainActivity this$0;

            public void onMediaScannerConnected()
            {
                mediaScannerConnection.scanFile((new StringBuilder(String.valueOf(Constant.BASE_DOWNLOAD_PATH))).append(downloadMusicName).append(".mp3").toString(), null);
            }

            public void onScanCompleted(String s, Uri uri)
            {
                if (s.equals((new StringBuilder(String.valueOf(Constant.BASE_DOWNLOAD_PATH))).append(downloadMusicName).append(".mp3").toString()))
                {
                    musicDao.deleteAllMusic();
                    folderDao.deleteAllFolder();
                    musicBiz.addAllMusicToDB();
                    musicBiz.addMusicFolderToDB();
                    resetSetMainGrid();
                    mediaScannerConnection.disconnect();
                }
            }

            
            {
                this$0 = MainActivity.this;
                super();
            }
        };
        searchThreadRunning = false;
        jamendoMusicArray = new ArrayList();
    }

    private Dialog createSleepSetDlg(View view, final EditText et)
    {
        return (new android.app.AlertDialog.Builder(this)).setTitle(getString(0x7f080053)).setIcon(0x7f02007a).setCancelable(true).setView(view).setPositiveButton(getString(0x7f080052), new android.content.DialogInterface.OnClickListener() {

            final MainActivity this$0;
            private final EditText val$et;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                sleepTime = Integer.parseInt(et.getText().toString().trim());
                MyApplication.getDefaultSharedPreferences().edit().putInt("sleep_time", sleepTime).commit();
                long l = sleepTime * 60 * 1000;
                long l1 = System.currentTimeMillis();
                sleepTimer = new Timer();
                sleepTimer.schedule((l + l1). new TimerTask() {

                    final _cls13 this$1;
                    private final long val$sleepTimeMillis;

                    public void run()
                    {
                        if (System.currentTimeMillis() > sleepTimeMillis)
                        {
                            sendBroadcast(new Intent("com.MediaPlayer.action.START_SLEEP"));
                            finish();
                            sleepTimer.cancel();
                        }
                    }

            
            {
                this$1 = final__pcls13;
                sleepTimeMillis = J.this;
                super();
            }
                }, 0L, 60000L);
                isSleepOpened = true;
                Toast.makeText(MainActivity.this, String.format(getString(0x7f080055), new Object[] {
                    Integer.valueOf(sleepTime)
                }), 1).show();
            }


            
            {
                this$0 = MainActivity.this;
                et = edittext;
                super();
            }
        }).setNegativeButton(getString(0x7f080051), null).create();
    }

    private void doPlay()
    {
        if (MyApplication.isplayNetMusic)
        {
            if (MyApplication.getInstance().isPlaying())
            {
                if (MyApplication.mediaPlayer != null)
                {
                    MyApplication.mediaPlayer.pause();
                    MyApplication.status = 3;
                }
            } else
            {
                try
                {
                    MyApplication.mediaPlayer.start();
                    MyApplication.status = 2;
                }
                catch (Exception exception) { }
            }
            sendBroadcast(new Intent("com.MediaPlayer.action.STATUS_CHANGED"));
            return;
        } else
        {
            Intent intent = new Intent();
            intent.setAction("com.MediaPlayer.action.PLAY");
            sendBroadcast(intent);
            return;
        }
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

    private void initListener()
    {
        iv_comp1 = (ImageView)findViewById(0x7f0d0026);
        iv_comp2 = (ImageView)findViewById(0x7f0d0027);
        iv_comp3 = (ImageView)findViewById(0x7f0d0028);
        comps = (new ImageView[] {
            iv_comp1, iv_comp2, iv_comp3
        });
        btnNext = (ImageButton)findViewById(0x7f0d002d);
        btnPre = (ImageButton)findViewById(0x7f0d002b);
        btnPlay = (ImageButton)findViewById(0x7f0d002c);
        ivAlbum = (ImageView)findViewById(0x7f0d0031);
        controlPanel_TextLayout = (LinearLayout)findViewById(0x7f0d0032);
        musicProgressMain = (ProgressBar)findViewById(0x7f0d0030);
        controlPanelTitleMain = (TextView)findViewById(0x7f0d0033);
        controlPanelArtistMain = (TextView)findViewById(0x7f0d0034);
        btnLocalMusic = (Button)findViewById(0x7f0d0023);
        btnLocalMusic.setOnClickListener(new android.view.View.OnClickListener() {

            final MainActivity this$0;

            public void onClick(View view)
            {
                vpContainer.setCurrentItem(0, true);
            }

            
            {
                this$0 = MainActivity.this;
                super();
            }
        });
        btnNext.setOnClickListener(new android.view.View.OnClickListener() {

            final MainActivity this$0;

            public void onClick(View view)
            {
                doPlayNext();
            }

            
            {
                this$0 = MainActivity.this;
                super();
            }
        });
        btnNext.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            final MainActivity this$0;

            public boolean onLongClick(View view)
            {
                seekTimer = new Timer();
                seekTimer.schedule(new TimerTask() {

                    int i;
                    final _cls19 this$1;

                    public void run()
                    {
                        Message message = handler.obtainMessage();
                        message.what = 1;
                        Bundle bundle = new Bundle();
                        int j = i;
                        i = j + 1;
                        bundle.putInt("text", j);
                        message.setData(bundle);
                        handler.sendMessage(message);
                    }

            
            {
                this$1 = _cls19.this;
                super();
                i = 1;
            }
                }, 0L, 100L);
                seeking = true;
                return true;
            }


            
            {
                this$0 = MainActivity.this;
                super();
            }
        });
        btnNext.setOnTouchListener(new android.view.View.OnTouchListener() {

            final MainActivity this$0;

            public boolean onTouch(View view, MotionEvent motionevent)
            {
                if (1 == motionevent.getAction() && seekTimer != null)
                {
                    seekTimer.cancel();
                    view = new Intent("com.MediaPlayer.action.SEEK");
                    view.putExtra("seekProgress", seekProgress);
                    sendBroadcast(view);
                    seeking = false;
                }
                return false;
            }

            
            {
                this$0 = MainActivity.this;
                super();
            }
        });
        btnPre.setOnClickListener(new android.view.View.OnClickListener() {

            final MainActivity this$0;

            public void onClick(View view)
            {
                doPlayPre();
            }

            
            {
                this$0 = MainActivity.this;
                super();
            }
        });
        btnPre.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            final MainActivity this$0;

            public boolean onLongClick(View view)
            {
                seekTimer = new Timer();
                seekTimer.schedule(new TimerTask() {

                    int i;
                    final _cls22 this$1;

                    public void run()
                    {
                        Message message = handler.obtainMessage();
                        message.what = 2;
                        Bundle bundle = new Bundle();
                        int j = i;
                        i = j + 1;
                        bundle.putInt("text", j);
                        message.setData(bundle);
                        handler.sendMessage(message);
                    }

            
            {
                this$1 = _cls22.this;
                super();
                i = 1;
            }
                }, 0L, 100L);
                seeking = true;
                return true;
            }


            
            {
                this$0 = MainActivity.this;
                super();
            }
        });
        btnPre.setOnTouchListener(new android.view.View.OnTouchListener() {

            final MainActivity this$0;

            public boolean onTouch(View view, MotionEvent motionevent)
            {
                if (1 == motionevent.getAction() && seekTimer != null)
                {
                    seekTimer.cancel();
                    view = new Intent("com.MediaPlayer.action.SEEK");
                    view.putExtra("seekProgress", seekProgress);
                    sendBroadcast(view);
                    seeking = false;
                }
                return false;
            }

            
            {
                this$0 = MainActivity.this;
                super();
            }
        });
        btnPlay.setOnClickListener(new android.view.View.OnClickListener() {

            final MainActivity this$0;

            public void onClick(View view)
            {
                doPlay();
            }

            
            {
                this$0 = MainActivity.this;
                super();
            }
        });
        ivAlbum.setOnClickListener(onShareClickListtener);
        controlPanel_TextLayout.setOnClickListener(onShareClickListtener);
        vpContainer.setOnPageChangeListener(new android.support.v4.view.ViewPager.OnPageChangeListener() {

            final MainActivity this$0;

            public void onPageScrollStateChanged(int i)
            {
            }

            public void onPageScrolled(int i, float f, int j)
            {
            }

            public void onPageSelected(int i)
            {
                currentPageIndex = i;
                MyApplication.setCurrentPage(currentPageIndex);
                if (currentPageIndex == 0)
                {
                    infos = buttonInfoBiz.getButtonInfos();
                    mainGridAdapter.setData(infos);
                    mainGridAdapter.notifyDataSetChanged();
                }
                int j = vpViews.size();
                int ai[] = new int[4];
                i = 0;
                do
                {
                    if (i >= j)
                    {
                        setComps(j, ai);
                        (new Thread() {

                            final _cls25 this$1;

                            public void run()
                            {
                            }

            
            {
                this$1 = _cls25.this;
                super();
            }
                        }).start();
                        return;
                    }
                    if (i == currentPageIndex)
                    {
                        ai[i] = 1;
                    }
                    i++;
                } while (true);
            }

            
            {
                this$0 = MainActivity.this;
                super();
            }
        });
    }

    private void resetSetMainGrid()
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
            infos = buttonInfoBiz.getButtonInfos();
            mainGridAdapter.setData(infos);
            mainGridAdapter.notifyDataSetChanged();
            return;
        }
        catch (Exception exception)
        {
            return;
        }
    }

    private void setComps(int i, int ai[])
    {
        int j;
        if (i != 3)
        {
            break MISSING_BLOCK_LABEL_54;
        }
        j = 0;
_L3:
        if (j < i) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (ai[j] == 1)
        {
            comps[j].setImageResource(0x7f0200a3);
        } else
        {
            comps[j].setImageResource(0x7f0200a4);
        }
        j++;
          goto _L3
        int k = 0;
        while (k < i) 
        {
            if (ai[k] == 1)
            {
                comps[k].setImageResource(0x7f0200a3);
            } else
            {
                comps[k].setImageResource(0x7f0200a4);
            }
            k++;
        }
          goto _L1
    }

    private void setPlaymodeLeftDrawable()
    {
        Drawable drawable;
        Resources resources;
        resources = getResources();
        drawable = resources.getDrawable(0x7f020089);
        MyApplication.playMode;
        JVM INSTR tableswitch 1 4: default 48
    //                   1 74
    //                   2 85
    //                   3 96
    //                   4 107;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        btn_playMode.setCompoundDrawables(drawable, null, null, null);
        return;
_L2:
        drawable = resources.getDrawable(0x7f020089);
        continue; /* Loop/switch isn't completed */
_L3:
        drawable = resources.getDrawable(0x7f02008c);
        continue; /* Loop/switch isn't completed */
_L4:
        drawable = resources.getDrawable(0x7f02008a);
        continue; /* Loop/switch isn't completed */
_L5:
        drawable = resources.getDrawable(0x7f02008b);
        if (true) goto _L1; else goto _L6
_L6:
    }

    private void sortMusicList(ArrayList arraylist)
    {
        Collections.sort(arraylist, new Comparator() {

            final MainActivity this$0;

            public int compare(Music music, Music music1)
            {
                return music.getTitle().compareTo(music1.getTitle()) <= 0 ? -1 : 1;
            }

            public volatile int compare(Object obj, Object obj1)
            {
                return compare((Music)obj, (Music)obj1);
            }

            
            {
                this$0 = MainActivity.this;
                super();
            }
        });
    }

    private void startActivitySafely(Intent intent)
    {
        intent.addFlags(0x10000000);
        try
        {
            startActivity(intent);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            return;
        }
    }

    private void updateView()
    {
        controlPanelTitleMain.setText(MyApplication.getMusicTitle());
        controlPanelArtistMain.setText(MyApplication.getMusicArtist());
        musicProgressMain.setProgress((MyApplication.getMusicProgress() * 1000) / MyApplication.getMusicDuration());
        updatePlayStatusView();
        android.graphics.Bitmap bitmap = AlbumPicUtil.getAlbumBitmap(MyApplication.getCurrentMusic());
        if (bitmap == null)
        {
            ivAlbum.setImageResource(0x7f020056);
        } else
        {
            ivAlbum.setImageBitmap(bitmap);
        }
        sendBroadcast(new Intent("com.MediaPlayer.action.ALBUM_PIC_CHANGED"));
    }

    private void updateView(int i)
    {
        i;
        JVM INSTR tableswitch 2 3: default 24
    //                   2 25
    //                   3 157;
           goto _L1 _L2 _L3
_L1:
        return;
_L2:
        selectedButtonId;
        JVM INSTR tableswitch 2 4: default 56
    //                   2 110
    //                   3 77
    //                   4 143;
           goto _L4 _L5 _L6 _L7
_L4:
        folderAdapter.changeData(folders);
        vpContainer.setCurrentItem(1, true);
        return;
_L6:
        folders = musicDao.getTempAlbums();
        handler.postDelayed(new Runnable() {

            final MainActivity this$0;

            public void run()
            {
                folders = musicDao.getAlbums();
                folderAdapter.changeData(folders);
            }

            
            {
                this$0 = MainActivity.this;
                super();
            }
        }, 200L);
          goto _L4
_L5:
        folders = musicDao.getTempArtists();
        handler.postDelayed(new Runnable() {

            final MainActivity this$0;

            public void run()
            {
                folders = musicDao.getArtists();
                folderAdapter.changeData(folders);
            }

            
            {
                this$0 = MainActivity.this;
                super();
            }
        }, 200L);
          goto _L4
_L7:
        folders = folderDao.getAllFolder();
          goto _L4
_L3:
        selectedButtonId;
        JVM INSTR lookupswitch 5: default 212
    //                   1: 241
    //                   5: 255
    //                   6: 287
    //                   7: 301
    //                   111: 212;
           goto _L8 _L9 _L10 _L11 _L12 _L8
_L8:
        sortMusicList(musics);
        musicAdapter.changeData(musics);
        vpContainer.setCurrentItem(2, true);
        return;
_L9:
        musics = musicDao.getAllMusic();
        continue; /* Loop/switch isn't completed */
_L10:
        try
        {
            musics = FavMusicXmlUtil.getFavMusic();
            mainPref.saveFav(musics.size());
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
        continue; /* Loop/switch isn't completed */
_L11:
        musics = musicBiz.getRecentAddMusic();
        continue; /* Loop/switch isn't completed */
_L12:
        try
        {
            musics = musicDao.getMusic(Constant.BASE_DOWNLOAD_PATH.substring(0, Constant.BASE_DOWNLOAD_PATH.length() - 1));
        }
        catch (Exception exception1) { }
        if (true) goto _L8; else goto _L13
_L13:
    }

    private void updateView(ArrayList arraylist)
    {
        netMusicAdapter.changeData(arraylist);
        arraylist = handler.obtainMessage();
        arraylist.what = 7;
        arraylist.arg1 = 1;
        handler.sendMessage(arraylist);
    }

    public void addNetMusicView()
    {
        netMusicLayout = (RelativeLayout)inflater.inflate(0x7f030014, null);
        ivNetMusicLoading = (ImageView)netMusicLayout.findViewById(0x7f0d005b);
        tv_netMusicTips = (TextView)netMusicLayout.findViewById(0x7f0d005c);
        listViewNetMusic = (ListView)netMusicLayout.findViewById(0x7f0d005d);
        listViewNetMusic.setFastScrollEnabled(true);
        etNetMusicSearch = (EditText)netMusicLayout.findViewById(0x7f0d005a);
        ((ImageButton)netMusicLayout.findViewById(0x7f0d0059)).setOnClickListener(new btnNetMusicSearchOnClickListener(null));
        netMusicAdapter = new NetMusicAdapter(this, null, listViewNetMusic);
        listViewNetMusic.setAdapter(netMusicAdapter);
        listViewNetMusic.setOnItemClickListener(new OnItemClickListenerNetMusic());
        listViewNetMusic.setOnItemLongClickListener(new OnItemLongClickListenerNetMusic());
        vpViews.add(netMusicLayout);
    }

    public void initData()
    {
        musicDao = new MusicDao(this);
        folderDao = new MusicFolderDao(this);
        musicBiz = new MusicBiz(this);
        musicBiz.setMusicDao(musicDao);
        musicBiz.setFolderDao(folderDao);
        mainPref = new MainGridPreference(this);
        screenWidth = getWindowManager().getDefaultDisplay().getWidth();
        playModeEntries = getResources().getStringArray(0x7f0b0002);
        infos = new ArrayList();
        buttonInfoBiz = new ButtonInfoBiz(this);
        infos = buttonInfoBiz.getButtonInfos();
        mainGridAdapter = new MainGridAdapter(this, infos);
        folders = new ArrayList();
        folders = folderDao.getAllFolder();
        folderAdapter = new FolderAdapter(this, folders);
        musics = new ArrayList();
        if (MyApplication.musicList == null || MyApplication.musicList.size() <= 0) goto _L2; else goto _L1
_L1:
        musics = MyApplication.musicList;
_L4:
        musicAdapter = new MusicAdapter(this, musics);
        return;
_L2:
        if (folders.size() > 0)
        {
            musics = musicDao.getMusic(((MusicFolder)folders.get(0)).getPath());
            if (musics.size() > 0)
            {
                MyApplication.getInstance().setMusicList(musics);
                MyApplication.setCurrentPosition(0);
                MyApplication.setCurrentMusic((Music)musics.get(0));
                try
                {
                    MyApplication.mediaPlayer.setDataSource(MyApplication.getCurrentMusic().getData());
                    MyApplication.mediaPlayer.prepare();
                }
                catch (Exception exception) { }
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void initView()
    {
        mSlideHolder = (SlideHolder)findViewById(0x7f0d001f);
        layout = (RelativeLayout)findViewById(0x7f0d0020);
        inflater = LayoutInflater.from(this);
        gv = (GridView)inflater.inflate(0x7f03000e, null);
        gv.setColumnWidth(screenWidth / 3);
        listViewFolder = (ListView)inflater.inflate(0x7f030012, null);
        listViewFolder.setFastScrollEnabled(true);
        listViewMusic = (ListView)inflater.inflate(0x7f030012, null);
        listViewMusic.setFastScrollEnabled(true);
        gv.setAdapter(mainGridAdapter);
        gv.setOnItemClickListener(new OnItemClickListenerMain());
        listViewFolder.setAdapter(folderAdapter);
        listViewFolder.setOnItemClickListener(new OnItemClickListenerFolder());
        listViewMusic.setAdapter(musicAdapter);
        listViewMusic.setOnItemClickListener(new OnItemClickListenerMusic());
        listViewMusic.setOnItemLongClickListener(new OnItemLongClickListenerMusic());
        vpContainer = (ViewPager)findViewById(0x7f0d002a);
        vpContainer.setFocusable(true);
        vpViews.add(gv);
        vpViews.add(listViewFolder);
        vpViews.add(listViewMusic);
        popupWindowSearch = new PopupWindowSearch(this, handler);
        btn_slideMenu = (Button)findViewById(0x7f0d0022);
        btn_slideMenu.setOnClickListener(new android.view.View.OnClickListener() {

            final MainActivity this$0;

            public void onClick(View view)
            {
                mSlideHolder.toggle();
            }

            
            {
                this$0 = MainActivity.this;
                super();
            }
        });
        btn_scan = (TextView)findViewById(0x7f0d00a5);
        btn_scan.setOnClickListener(new android.view.View.OnClickListener() {

            final MainActivity this$0;

            public void onClick(View view)
            {
                view = new Intent(MainActivity.this, com/arist/MusicPlayer/ScanMusicActivity);
                startActivity(view);
            }

            
            {
                this$0 = MainActivity.this;
                super();
            }
        });
        btn_playMode = (TextView)findViewById(0x7f0d00a7);
        setPlaymodeLeftDrawable();
        btn_playMode.setOnClickListener(new android.view.View.OnClickListener() {

            final MainActivity this$0;

            public void onClick(View view)
            {
                (new android.app.AlertDialog.Builder(MainActivity.this)).setTitle(getString(0x7f080056)).setCancelable(true).setNegativeButton(getString(0x7f080051), null).setSingleChoiceItems(playModeEntries, MyApplication.playMode - 1, new android.content.DialogInterface.OnClickListener() {

                    final _cls5 this$1;

                    public void onClick(DialogInterface dialoginterface, int i)
                    {
                        i++;
                        MyApplication.playMode = i;
                        MyApplication.musicPref.savePlayMode(i);
                        setPlaymodeLeftDrawable();
                        dialoginterface.dismiss();
                    }

            
            {
                this$1 = _cls5.this;
                super();
            }
                }).create().show();
            }


            
            {
                this$0 = MainActivity.this;
                super();
            }
        });
        btn_equalizer = (TextView)findViewById(0x7f0d00aa);
        btn_equalizer.setOnClickListener(new android.view.View.OnClickListener() {

            final MainActivity this$0;

            public void onClick(View view)
            {
                if (android.os.Build.VERSION.SDK_INT >= 9)
                {
                    startActivity(new Intent(MainActivity.this, yong/powerfull/equalizer/Equize));
                }
            }

            
            {
                this$0 = MainActivity.this;
                super();
            }
        });
        btn_skin = (TextView)findViewById(0x7f0d00ab);
        btn_skin.setOnClickListener(new android.view.View.OnClickListener() {

            final MainActivity this$0;

            public void onClick(View view)
            {
                startActivity(new Intent(MainActivity.this, com/arist/MusicPlayer/SkinSetting));
            }

            
            {
                this$0 = MainActivity.this;
                super();
            }
        });
        btn_searchMusic = (TextView)findViewById(0x7f0d00a6);
        btn_searchMusic.setOnClickListener(new android.view.View.OnClickListener() {

            final MainActivity this$0;

            public void onClick(View view)
            {
                mSlideHolder.toggle();
                popupWindowSearch.showAtLocation(listViewMusic, 48, 0, 35);
            }

            
            {
                this$0 = MainActivity.this;
                super();
            }
        });
        btn_sleep = (TextView)findViewById(0x7f0d00ac);
        btn_sleep.setOnClickListener(new android.view.View.OnClickListener() {

            final MainActivity this$0;

            public void onClick(View view)
            {
                if (!isSleepOpened)
                {
                    view = inflater.inflate(0x7f030023, null);
                    EditText edittext = (EditText)view.findViewById(0x7f0d00a1);
                    edittext.setText((new StringBuilder()).append(MyApplication.getDefaultSharedPreferences().getInt("sleep_time", 15)).toString());
                    createSleepSetDlg(view, edittext).show();
                    return;
                } else
                {
                    isSleepOpened = false;
                    sleepTimer.cancel();
                    Toast.makeText(MainActivity.this, getString(0x7f080054), 1).show();
                    return;
                }
            }

            
            {
                this$0 = MainActivity.this;
                super();
            }
        });
        btn_setting = (TextView)findViewById(0x7f0d00ad);
        btn_setting.setOnClickListener(new android.view.View.OnClickListener() {

            final MainActivity this$0;

            public void onClick(View view)
            {
                startActivity(new Intent(MainActivity.this, com/arist/MusicPlayer/SettingScreen));
            }

            
            {
                this$0 = MainActivity.this;
                super();
            }
        });
        btn_exit = (TextView)findViewById(0x7f0d00ae);
        btn_exit.setOnClickListener(new android.view.View.OnClickListener() {

            final MainActivity this$0;

            public void onClick(View view)
            {
                MyNotiofation.clearNotification();
                MyApplication.status = 3;
                sendBroadcast(new Intent("com.MediaPlayer.action.STATUS_CHANGED"));
                (new EnterAndExit(MainActivity.this)).exitWithRate(isExitAdLoad, mExitAdview);
            }

            
            {
                this$0 = MainActivity.this;
                super();
            }
        });
        giftLayout = (RelativeLayout)findViewById(0x7f0d00a8);
        giftLayout.setOnClickListener(new android.view.View.OnClickListener() {

            final MainActivity this$0;

            public void onClick(View view)
            {
                PromotionSDK.showPromoationApp();
            }

            
            {
                this$0 = MainActivity.this;
                super();
            }
        });
        PromotionSDK.InitMyActionBar(this, this);
        PromotionSDK.starAppInfoLoadTask();
    }

    public void onAppInfoLoaded(ArrayList arraylist)
    {
        PromotionSDK.InitAppInfoList(arraylist);
        PromotionSDK.UpdateNewcount();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setContentView(0x7f030004);
        MyApplication.getInstance().addActivity(this);
        handler = new Handler() {

            final MainActivity this$0;

            public void handleMessage(Message message)
            {
                int i = 0;
                message.what;
                JVM INSTR tableswitch 1 10: default 60
            //                           1 66
            //                           2 179
            //                           3 60
            //                           4 60
            //                           5 60
            //                           6 60
            //                           7 284
            //                           8 348
            //                           9 517
            //                           10 554;
                   goto _L1 _L2 _L3 _L1 _L1 _L1 _L1 _L4 _L5 _L6 _L7
_L1:
                super.handleMessage(message);
                return;
_L2:
                i = message.getData().getInt("text");
                if (i == 1)
                {
                    seekProgress = MyApplication.mediaPlayer.getCurrentPosition();
                }
                MainActivity mainactivity = MainActivity.this;
                if (seekProgress + i * 200 > MyApplication.getMusicDuration())
                {
                    i = MyApplication.getMusicDuration();
                } else
                {
                    i = seekProgress + i * 200;
                }
                mainactivity.seekProgress = i;
                musicProgressMain.setProgress((seekProgress * 1000) / MyApplication.getMusicDuration());
                continue; /* Loop/switch isn't completed */
_L3:
                int k = message.getData().getInt("text");
                if (k == 1)
                {
                    seekProgress = MyApplication.mediaPlayer.getCurrentPosition();
                }
                MainActivity mainactivity1 = MainActivity.this;
                if (seekProgress - k * 200 >= 0)
                {
                    i = seekProgress - k * 200;
                }
                mainactivity1.seekProgress = i;
                musicProgressMain.setProgress((seekProgress * 1000) / MyApplication.getMusicDuration());
                continue; /* Loop/switch isn't completed */
_L4:
                if (message.arg1 == 0)
                {
                    ivNetMusicLoading.setVisibility(1);
                    ivNetMusicLoading.startAnimation(AnimationUtils.loadAnimation(MainActivity.this, 0x7f040004));
                } else
                {
                    ivNetMusicLoading.setVisibility(-1);
                    ivNetMusicLoading.clearAnimation();
                }
                continue; /* Loop/switch isn't completed */
_L5:
                String s = String.valueOf(message.obj);
                musics = musicDao.getAllMusic();
                vpContainer.setCurrentItem(2);
                ArrayList arraylist = new ArrayList();
                int j = 0;
                do
                {
                    if (j >= musics.size())
                    {
                        musics = arraylist;
                        musicAdapter.changeData(arraylist);
                        continue; /* Loop/switch isn't completed */
                    }
                    if (((Music)musics.get(j)).getTitle().toLowerCase().contains(s) || ((Music)musics.get(j)).getArtist().toLowerCase().contains(s))
                    {
                        arraylist.add((Music)musics.get(j));
                    }
                    j++;
                } while (true);
_L6:
                if (jamendoMusicArray.size() > 0)
                {
                    try
                    {
                        netMusicAdapter.changeData(jamendoMusicArray);
                    }
                    catch (Exception exception) { }
                }
                continue; /* Loop/switch isn't completed */
_L7:
                tv_netMusicTips.setVisibility(0);
                netMusicAdapter.changeData(jamendoMusicArray);
                if (true) goto _L1; else goto _L8
_L8:
            }

            
            {
                this$0 = MainActivity.this;
                super();
            }
        };
        initData();
        initView();
        initListener();
        vpAdapter = new MyPagerAdapter(vpViews);
        vpContainer.setAdapter(vpAdapter);
        mEnterAndExit = new EnterAndExit(this);
        mExitAdview = new AdView(this);
        mExitAdview.setAdSize(AdSize.MEDIUM_RECTANGLE);
        mExitAdview.setAdUnitId("ca-app-pub-4949699850115085/9640026851");
        mExitAdview.loadAd((new com.google.android.gms.ads.AdRequest.Builder()).build());
        mExitAdview.setAdListener(new AdListener() {

            final MainActivity this$0;

            public void onAdLoaded()
            {
                super.onAdLoaded();
                isExitAdLoad = true;
            }

            
            {
                this$0 = MainActivity.this;
                super();
            }
        });
        AdUtil.showAD(this);
    }

    protected Dialog onCreateDialog(int i)
    {
        switch (i)
        {
        default:
            return super.onCreateDialog(i);

        case 1: // '\001'
            return showMusicContexDlg();

        case 2: // '\002'
            View view = inflater.inflate(0x7f03001a, null);
            ((TextView)view.findViewById(0x7f0d006f)).setText(selMusic.getTitle());
            ((TextView)view.findViewById(0x7f0d0070)).setText(selMusic.getAlbum());
            ((TextView)view.findViewById(0x7f0d0071)).setText(selMusic.getArtist());
            ((TextView)view.findViewById(0x7f0d0072)).setText(TimeFormat.timeFormat(selMusic.getDuration()));
            ((TextView)view.findViewById(0x7f0d0073)).setText(TimeFormat.sizeFormat(selMusic.getSize()));
            ((TextView)view.findViewById(0x7f0d0074)).setText(selMusic.getData());
            view.findViewById(0x7f0d0075).setOnClickListener(new android.view.View.OnClickListener() {

                final MainActivity this$0;

                public void onClick(View view2)
                {
                    showDialog(3);
                    dismissDialog(2);
                    removeDialog(2);
                }

            
            {
                this$0 = MainActivity.this;
                super();
            }
            });
            view.findViewById(0x7f0d0076).setOnClickListener(new android.view.View.OnClickListener() {

                final MainActivity this$0;

                public void onClick(View view2)
                {
                    dismissDialog(2);
                    removeDialog(2);
                }

            
            {
                this$0 = MainActivity.this;
                super();
            }
            });
            return (new android.app.AlertDialog.Builder(this)).setTitle(selMusic.getTitle()).setIcon(0x7f020073).setCancelable(true).setView(view).create();

        case 3: // '\003'
            View view1 = inflater.inflate(0x7f03001b, null);
            final EditText etName = (EditText)view1.findViewById(0x7f0d0077);
            final EditText etAlbum = (EditText)view1.findViewById(0x7f0d0078);
            final EditText etArtist = (EditText)view1.findViewById(0x7f0d0079);
            etName.setText(selMusic.getTitle());
            etAlbum.setText(selMusic.getAlbum());
            etArtist.setText(selMusic.getArtist());
            view1.findViewById(0x7f0d007a).setOnClickListener(new android.view.View.OnClickListener() {

                final MainActivity this$0;
                private final EditText val$etAlbum;
                private final EditText val$etArtist;
                private final EditText val$etName;

                public void onClick(View view2)
                {
                    selMusic.setTitle(etName.getText().toString());
                    selMusic.setAlbum(etAlbum.getText().toString());
                    selMusic.setArtist(etArtist.getText().toString());
                    musicDao.updateMusic(selMusic);
                    musicAdapter.notifyDataSetChanged();
                    dismissDialog(3);
                    removeDialog(3);
                }

            
            {
                this$0 = MainActivity.this;
                etName = edittext;
                etAlbum = edittext1;
                etArtist = edittext2;
                super();
            }
            });
            view1.findViewById(0x7f0d007b).setOnClickListener(new android.view.View.OnClickListener() {

                final MainActivity this$0;

                public void onClick(View view2)
                {
                    dismissDialog(3);
                    removeDialog(3);
                }

            
            {
                this$0 = MainActivity.this;
                super();
            }
            });
            return (new android.app.AlertDialog.Builder(this)).setCancelable(true).setTitle(selMusic.getTitle()).setIcon(0x7f020073).setView(view1).create();

        case 4: // '\004'
            return showNewMusicConfirmPlayDlg();

        case 5: // '\005'
            return shouNetMusicContextDlg();
        }
    }

    protected void onDestroy()
    {
        Log.i("info", "onDestroy()");
        if (netMusicAdapter != null)
        {
            netMusicAdapter.quit();
        }
        EnterAndExit.onDes(this);
        MyApplication.musicPref.savePosition(MyApplication.currentPosition);
        MyApplication.musicPref.saveProgress(MyApplication.getMusicProgress());
        MyApplication.musicPref.saveData(MyApplication.getMusicData());
        MyApplication.musicPref.savePlayMode(MyApplication.playMode);
        MyApplication.status = 1;
        sendBroadcast(new Intent("com.MediaPlayer.action.STATUS_CHANGED"));
        MyApplication.getInstance().exit();
        super.onDestroy();
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
label0:
        {
            boolean flag = false;
            Object obj = getPackageManager().resolveActivity((new Intent("android.intent.action.MAIN")).addCategory("android.intent.category.HOME"), 0);
            switch (i)
            {
            default:
                return super.onKeyDown(i, keyevent);

            case 4: // '\004'
                break;
            }
            if (currentPageIndex == 0)
            {
                if (MyApplication.mediaPlayer.isPlaying())
                {
                    break label0;
                }
                (new EnterAndExit(this)).exitWithRate(isExitAdLoad, mExitAdview);
            }
            i = currentPageIndex - 1;
            currentPageIndex = i;
            if (i < 0)
            {
                i = ((flag) ? 1 : 0);
            } else
            {
                i = currentPageIndex;
            }
            currentPageIndex = i;
            MyApplication.setCurrentPage(currentPageIndex);
            if (currentPageIndex == 1)
            {
                folderAdapter.notifyDataSetChanged();
            }
            vpContainer.setCurrentItem(currentPageIndex, true);
            return true;
        }
        keyevent = ((ResolveInfo) (obj)).activityInfo;
        obj = new Intent("android.intent.action.MAIN");
        ((Intent) (obj)).addCategory("android.intent.category.LAUNCHER");
        ((Intent) (obj)).setComponent(new ComponentName(((ActivityInfo) (keyevent)).packageName, ((ActivityInfo) (keyevent)).name));
        startActivitySafely(((Intent) (obj)));
        return true;
    }

    protected void onPause()
    {
        unregisterReceiver(reciever);
        MobclickAgent.onPause(this);
        super.onPause();
    }

    protected void onRestart()
    {
        super.onRestart();
    }

    protected void onResume()
    {
        Object obj = new BitmapDrawable(BitmapService.readBitMap(getResources(), MyApplication.getWallpaperId()));
        layout.setBackgroundDrawable(((Drawable) (obj)));
        reciever = new MyReciever(null);
        obj = new IntentFilter();
        ((IntentFilter) (obj)).addAction("com.MediaPlayer.action.MEDIAPLAYER_INFO");
        ((IntentFilter) (obj)).addAction("com.MediaPlayer.action.MUSIC_CHANGED");
        ((IntentFilter) (obj)).addAction("com.MediaPlayer.action.STATUS_CHANGED");
        ((IntentFilter) (obj)).addAction("com.MediaPlayer.action.UPDATE_NETMUEIC_VIEW");
        ((IntentFilter) (obj)).addAction("com.MediaPlayer.action.NET_MUSIC_BUFFERING");
        registerReceiver(reciever, ((IntentFilter) (obj)));
        obj = new IntentFilter();
        ((IntentFilter) (obj)).addAction("android.intent.action.MEDIA_SCANNER_STARTED");
        ((IntentFilter) (obj)).addAction("android.intent.action.MEDIA_SCANNER_FINISHED");
        ((IntentFilter) (obj)).addDataScheme("file");
        registerReceiver(reciever, ((IntentFilter) (obj)));
        musics = MyApplication.getInstance().getmusicList();
        updateView();
        if (MyApplication.showList)
        {
            MyApplication.showList = false;
            musicAdapter.changeData(musics);
            vpContainer.setCurrentItem(2, true);
            if (MyApplication.getCurrentPosition() < musicAdapter.getCount())
            {
                listViewMusic.setSelection(MyApplication.getCurrentPosition());
            }
        }
        MobclickAgent.onResume(this);
        PromotionSDK.onResume();
        super.onResume();
    }

    protected void onStart()
    {
        super.onStart();
    }

    protected void onStop()
    {
        super.onStop();
    }

    public Dialog shouNetMusicContextDlg()
    {
        View view = inflater.inflate(0x7f03001e, null);
        ((TextView)view.findViewById(0x7f0d006f)).setText(currentNetMusic.getMusic_name());
        ((TextView)view.findViewById(0x7f0d0070)).setText(currentNetMusic.getAlbum_name());
        ((TextView)view.findViewById(0x7f0d0071)).setText(currentNetMusic.getArtistName());
        ((TextView)view.findViewById(0x7f0d0072)).setText(TimeFormat.timeFormatInSecond(currentNetMusic.getDuration()));
        view.findViewById(0x7f0d0036).setOnClickListener(new android.view.View.OnClickListener() {

            final MainActivity this$0;

            public void onClick(View view1)
            {
                Toast.makeText(MainActivity.this, 0x7f08007d, 1).show();
                view1 = new Intent(MainActivity.this, com/arist/service/MusicDownloadService);
                view1.putExtra("uri", currentNetMusic.getAudio_link());
                view1.putExtra("musicName", currentNetMusic.getMusic_name());
                view1.putExtra("AlbumName", currentNetMusic.getAlbum_name());
                startService(view1);
                dismissDialog(5);
                removeDialog(5);
            }

            
            {
                this$0 = MainActivity.this;
                super();
            }
        });
        view.findViewById(0x7f0d008b).setOnClickListener(new android.view.View.OnClickListener() {

            final MainActivity this$0;

            public void onClick(View view1)
            {
                dismissDialog(5);
                removeDialog(5);
            }

            
            {
                this$0 = MainActivity.this;
                super();
            }
        });
        return (new android.app.AlertDialog.Builder(this)).setTitle(currentNetMusic.getMusic_name()).setIcon(0x7f020073).setCancelable(false).setView(view).create();
    }

    public Dialog showMusicContexDlg()
    {
        View view = inflater.inflate(0x7f030019, null);
        view.findViewById(0x7f0d006b).setOnClickListener(new OnClickListenerMusicDetail(null));
        view.findViewById(0x7f0d006e).setOnClickListener(new OnClickListenerMusicLove(null));
        view.findViewById(0x7f0d006c).setOnClickListener(new OnClickListenerMusicRemove(null));
        view.findViewById(0x7f0d006d).setOnClickListener(new OnClickListenerMusicUpdate(null));
        return (new android.app.AlertDialog.Builder(this)).setTitle(selMusic.getTitle()).setIcon(0x7f020073).setCancelable(false).setNegativeButton(0x7f080063, new OnClickListenerMusicCancel(null)).setView(view).create();
    }

    public Dialog showNewMusicConfirmPlayDlg()
    {
        return (new android.app.AlertDialog.Builder(this)).setTitle(0x7f08007a).setIcon(0x108009b).setCancelable(true).setMessage(0x7f08007b).setNegativeButton(0x7f080051, new android.content.DialogInterface.OnClickListener() {

            final MainActivity this$0;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                dismissDialog(4);
                removeDialog(4);
            }

            
            {
                this$0 = MainActivity.this;
                super();
            }
        }).setPositiveButton(0x7f080052, new android.content.DialogInterface.OnClickListener() {

            final MainActivity this$0;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                dialoginterface = (new StringBuilder(String.valueOf(currentNetMusic.getMusic_name()))).append("-").append(currentNetMusic.getAlbum_name()).append(".jpg").toString();
                BitmapService.copyBitmap((new StringBuilder(String.valueOf(Constant.BASE_ABLUM_CACHES_PATH))).append(dialoginterface).toString(), (new StringBuilder(String.valueOf(Constant.BASE_ABLUM_PATH))).append(dialoginterface).toString());
                try
                {
                    dialoginterface = new Music();
                    dialoginterface.setAlbum(currentNetMusic.getAlbum_name());
                    dialoginterface.setArtist(currentNetMusic.getArtistName());
                    dialoginterface.setDuration(currentNetMusic.getDuration() * 1000);
                    dialoginterface.setTitle(currentNetMusic.getMusic_name());
                    MyApplication.setCurrentMusic(dialoginterface);
                }
                // Misplaced declaration of an exception variable
                catch (DialogInterface dialoginterface) { }
                dialoginterface = new Intent("com.MediaPlayer.action.NET_PLAY");
                dialoginterface.putExtra("netMusic", currentNetMusic);
                sendBroadcast(dialoginterface);
                dialoginterface = handler.obtainMessage();
                dialoginterface.what = 7;
                dialoginterface.arg1 = 0;
                handler.sendMessage(dialoginterface);
                Toast.makeText(MainActivity.this, 0x7f08007c, 1).show();
            }

            
            {
                this$0 = MainActivity.this;
                super();
            }
        }).create();
    }

    public void updatePlayStatusView()
    {
        if (MyApplication.status == 2)
        {
            btnPlay.setImageResource(0x7f020050);
            return;
        } else
        {
            btnPlay.setImageResource(0x7f020052);
            return;
        }
    }





























































}
