// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.Display;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.Toast;
import butterknife.ButterKnife;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xbmc.kore.eventclient.EventServerConnection;
import org.xbmc.kore.host.HostConnectionObserver;
import org.xbmc.kore.host.HostInfo;
import org.xbmc.kore.host.HostManager;
import org.xbmc.kore.jsonrpc.ApiCallback;
import org.xbmc.kore.jsonrpc.HostConnection;
import org.xbmc.kore.service.NotificationService;
import org.xbmc.kore.ui.hosts.AddHostActivity;
import org.xbmc.kore.ui.views.CirclePageIndicator;
import org.xbmc.kore.utils.LogUtils;
import org.xbmc.kore.utils.TabsAdapter;
import org.xbmc.kore.utils.UIUtils;

// Referenced classes of package org.xbmc.kore.ui:
//            BaseActivity, SendTextDialogFragment, NavigationDrawerFragment, NowPlayingFragment, 
//            RemoteFragment, PlaylistFragment

public class RemoteActivity extends BaseActivity
    implements org.xbmc.kore.host.HostConnectionObserver.PlayerEventsObserver, NowPlayingFragment.NowPlayingListener, SendTextDialogFragment.SendTextDialogListener
{

    private static final String TAG = LogUtils.makeLogTag(org/xbmc/kore/ui/RemoteActivity);
    ImageView backgroundImage;
    android.support.v4.view.ViewPager.OnPageChangeListener defaultOnPageChangeListener;
    private HostConnectionObserver hostConnectionObserver;
    private HostManager hostManager;
    private String lastImageUrl;
    private NavigationDrawerFragment navigationDrawerFragment;
    CirclePageIndicator pageIndicator;
    Toolbar toolbar;
    ViewPager viewPager;

    public RemoteActivity()
    {
        hostManager = null;
        defaultOnPageChangeListener = new android.support.v4.view.ViewPager.OnPageChangeListener() {

            final RemoteActivity this$0;

            public void onPageScrollStateChanged(int i)
            {
            }

            public void onPageScrolled(int i, float f, int j)
            {
            }

            public void onPageSelected(int i)
            {
                setToolbarTitle(toolbar, i);
            }

            
            {
                this$0 = RemoteActivity.this;
                super();
            }
        };
        lastImageUrl = null;
    }

    private void clearPlaylistAndQueueFile(final String file, final HostConnection connection, final Handler callbackHandler)
    {
        LogUtils.LOGD(TAG, "Clearing video playlist");
        (new org.xbmc.kore.jsonrpc.method.Playlist.Clear(1)).execute(connection, new ApiCallback() {

            final RemoteActivity this$0;
            final Handler val$callbackHandler;
            final HostConnection val$connection;
            final String val$file;

            public void onError(int i, String s)
            {
                Toast.makeText(RemoteActivity.this, String.format(getString(0x7f0700d6), new Object[] {
                    s
                }), 0).show();
            }

            public volatile void onSuccess(Object obj)
            {
                onSuccess((String)obj);
            }

            public void onSuccess(String s)
            {
                queueFile(file, true, connection, callbackHandler);
            }

            
            {
                this$0 = RemoteActivity.this;
                file = s;
                connection = hostconnection;
                callbackHandler = handler;
                super();
            }
        }, callbackHandler);
    }

    private Uri getYouTubeUri(String s)
    {
        if (s != null)
        {
            String as[] = s.split(" ");
            int j = as.length;
            int i = 0;
            while (i < j) 
            {
                s = as[i];
                if (s.startsWith("http://") || s.startsWith("https://"))
                {
                    Uri uri;
                    try
                    {
                        new URL(s);
                        uri = Uri.parse(s);
                    }
                    catch (MalformedURLException malformedurlexception)
                    {
                        LogUtils.LOGD(TAG, (new StringBuilder()).append("Got a malformed URL in an intent: ").append(s).toString());
                        return null;
                    }
                    return uri;
                }
                i++;
            }
        }
        return null;
    }

    private String getYouTubeVideoId(Uri uri)
    {
        if (uri.getHost().endsWith("youtube.com") || uri.getHost().endsWith("youtu.be"))
        {
            uri = Pattern.compile("(?:https?:\\/\\/)?(?:www\\.|m\\.)?youtu(?:.be\\/|be\\.com\\/watch\\?v=)([\\w-]+)", 2).matcher(uri.toString());
            if (uri.matches())
            {
                return uri.group(1);
            }
        }
        return null;
    }

    private void handleStartIntent(final Intent kodiAddonUrl)
    {
        final Object callbackHandler = kodiAddonUrl.getAction();
        if (callbackHandler != null && (((String) (callbackHandler)).equals("android.intent.action.SEND") || ((String) (callbackHandler)).equals("android.intent.action.VIEW"))) goto _L2; else goto _L1
_L1:
        return;
_L2:
        final Object connection = null;
        if (!((String) (callbackHandler)).equals("android.intent.action.SEND")) goto _L4; else goto _L3
_L3:
        connection = getYouTubeUri(kodiAddonUrl.getStringExtra("android.intent.extra.TEXT"));
        if (connection == null) goto _L1; else goto _L5
_L5:
        kodiAddonUrl = getYouTubeVideoId(((Uri) (connection)));
        if (kodiAddonUrl == null) goto _L1; else goto _L6
_L6:
        kodiAddonUrl = (new StringBuilder()).append("plugin://plugin.video.youtube/play/?video_id=").append(kodiAddonUrl).toString();
        connection = hostManager.getConnection();
        callbackHandler = new Handler();
        (new org.xbmc.kore.jsonrpc.method.Player.GetActivePlayers()).execute(((HostConnection) (connection)), new ApiCallback() {

            final RemoteActivity this$0;
            final Handler val$callbackHandler;
            final HostConnection val$connection;
            final String val$kodiAddonUrl;

            public void onError(int i, String s)
            {
                LogUtils.LOGD(RemoteActivity.TAG, "Couldn't get active player when handling start intent.");
                Toast.makeText(RemoteActivity.this, String.format(getString(0x7f0700d3), new Object[] {
                    s
                }), 0).show();
            }

            public volatile void onSuccess(Object obj)
            {
                onSuccess((ArrayList)obj);
            }

            public void onSuccess(ArrayList arraylist)
            {
                boolean flag = false;
                arraylist = arraylist.iterator();
                do
                {
                    if (!arraylist.hasNext())
                    {
                        break;
                    }
                    if (((org.xbmc.kore.jsonrpc.type.PlayerType.GetActivePlayersReturnType)arraylist.next()).type.equals("video"))
                    {
                        flag = true;
                    }
                } while (true);
                if (!flag)
                {
                    clearPlaylistAndQueueFile(kodiAddonUrl, connection, callbackHandler);
                    return;
                } else
                {
                    queueFile(kodiAddonUrl, false, connection, callbackHandler);
                    return;
                }
            }

            
            {
                this$0 = RemoteActivity.this;
                kodiAddonUrl = s;
                connection = hostconnection;
                callbackHandler = handler;
                super();
            }
        }, ((Handler) (callbackHandler)));
        return;
_L4:
        if (!((String) (callbackHandler)).equals("android.intent.action.VIEW")) goto _L5; else goto _L7
_L7:
        if (kodiAddonUrl.getData() == null) goto _L1; else goto _L8
_L8:
        connection = Uri.parse(kodiAddonUrl.getData().toString());
          goto _L5
    }

    private void queueFile(String s, final boolean startPlaylist, final HostConnection connection, final Handler callbackHandler)
    {
        LogUtils.LOGD(TAG, "Queing file");
        org.xbmc.kore.jsonrpc.type.PlaylistType.Item item = new org.xbmc.kore.jsonrpc.type.PlaylistType.Item();
        item.file = s;
        (new org.xbmc.kore.jsonrpc.method.Playlist.Add(1, item)).execute(connection, new ApiCallback() {

            final RemoteActivity this$0;
            final Handler val$callbackHandler;
            final HostConnection val$connection;
            final boolean val$startPlaylist;

            public void onError(int i, String s1)
            {
                Toast.makeText(RemoteActivity.this, String.format(getString(0x7f0700d6), new Object[] {
                    s1
                }), 0).show();
            }

            public volatile void onSuccess(Object obj)
            {
                onSuccess((String)obj);
            }

            public void onSuccess(String s1)
            {
                if (startPlaylist)
                {
                    (new org.xbmc.kore.jsonrpc.method.Player.Open(1)).execute(connection, new ApiCallback() {

                        final _cls4 this$1;

                        public void onError(int i, String s)
                        {
                            Toast.makeText(_fld0, String.format(getString(0x7f0700d5), new Object[] {
                                s
                            }), 0).show();
                        }

                        public volatile void onSuccess(Object obj)
                        {
                            onSuccess((String)obj);
                        }

                        public void onSuccess(String s)
                        {
                        }

            
            {
                this$1 = _cls4.this;
                super();
            }
                    }, callbackHandler);
                }
                s1 = (new StringBuilder()).append("android:switcher:").append(viewPager.getId()).append(":").append(3).toString();
                s1 = (PlaylistFragment)getSupportFragmentManager().findFragmentByTag(s1);
                if (s1 != null)
                {
                    s1.forceRefreshPlaylist();
                }
            }

            
            {
                this$0 = RemoteActivity.this;
                startPlaylist = flag;
                connection = hostconnection;
                callbackHandler = handler;
                super();
            }
        }, callbackHandler);
    }

    private void setImageViewBackground(String s)
    {
        if (s != null)
        {
            Point point = new Point();
            getWindowManager().getDefaultDisplay().getSize(point);
            UIUtils.loadImageIntoImageview(hostManager, s, backgroundImage, point.x, point.y / 2);
            final int pixelsPerPage = point.x / 4;
            backgroundImage.getViewTreeObserver().addOnPreDrawListener(new android.view.ViewTreeObserver.OnPreDrawListener() {

                final RemoteActivity this$0;
                final int val$pixelsPerPage;

                public boolean onPreDraw()
                {
                    backgroundImage.getViewTreeObserver().removeOnPreDrawListener(this);
                    int i = viewPager.getCurrentItem();
                    int j = pixelsPerPage;
                    backgroundImage.scrollTo((i - 1) * j, 0);
                    pageIndicator.setOnPageChangeListener(new android.support.v4.view.ViewPager.OnPageChangeListener() {

                        final _cls6 this$1;

                        public void onPageScrollStateChanged(int i)
                        {
                        }

                        public void onPageScrolled(int i, float f, int j)
                        {
                            i = (int)(((float)(i - 1) + f) * (float)pixelsPerPage);
                            backgroundImage.scrollTo(i, 0);
                        }

                        public void onPageSelected(int i)
                        {
                            setToolbarTitle(toolbar, i);
                        }

            
            {
                this$1 = _cls6.this;
                super();
            }
                    });
                    return true;
                }

            
            {
                this$0 = RemoteActivity.this;
                pixelsPerPage = i;
                super();
            }
            });
            return;
        } else
        {
            backgroundImage.setImageDrawable(null);
            pageIndicator.setOnPageChangeListener(defaultOnPageChangeListener);
            return;
        }
    }

    private void setToolbarTitle(Toolbar toolbar1, int i)
    {
        if (toolbar1 == null) goto _L2; else goto _L1
_L1:
        i;
        JVM INSTR tableswitch 0 2: default 32
    //                   0 33
    //                   1 41
    //                   2 49;
           goto _L2 _L3 _L4 _L5
_L2:
        return;
_L3:
        toolbar1.setTitle(0x7f07006b);
        return;
_L4:
        toolbar1.setTitle(0x7f07007a);
        return;
_L5:
        toolbar1.setTitle(0x7f070072);
        return;
    }

    private void setupActionBar()
    {
        setToolbarTitle(toolbar, 1);
        setSupportActionBar(toolbar);
        ActionBar actionbar = getSupportActionBar();
        if (actionbar == null)
        {
            return;
        } else
        {
            actionbar.setDisplayHomeAsUpEnabled(true);
            return;
        }
    }

    public void SwitchToRemotePanel()
    {
        viewPager.setCurrentItem(1);
    }

    public void checkEventServerAvailability()
    {
        SharedPreferences sharedpreferences = PreferenceManager.getDefaultSharedPreferences(this);
        if (!sharedpreferences.getBoolean("checked_event_server_connection", false))
        {
            LogUtils.LOGD(TAG, "Checking EventServer connection implicitely");
            final HostInfo hostInfo = hostManager.getHostInfo();
            EventServerConnection.testEventServerConnection(hostInfo, new org.xbmc.kore.eventclient.EventServerConnection.EventServerConnectionCallback() {

                final RemoteActivity this$0;
                final HostInfo val$hostInfo;

                public void OnConnectResult(boolean flag)
                {
                    hostInfo.setUseEventServer(flag);
                    hostManager.editHost(hostInfo.getId(), hostInfo);
                }

            
            {
                this$0 = RemoteActivity.this;
                hostInfo = hostinfo;
                super();
            }
            }, new Handler());
            sharedpreferences.edit().putBoolean("checked_event_server_connection", true).apply();
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyevent)
    {
        boolean flag = true;
        if (!PreferenceManager.getDefaultSharedPreferences(this).getBoolean("pref_use_hardware_volume_keys", true)) goto _L2; else goto _L1
_L1:
        int i = keyevent.getAction();
        keyevent.getKeyCode();
        JVM INSTR tableswitch 24 25: default 48
    //                   24 56
    //                   25 84;
           goto _L2 _L3 _L4
_L2:
        flag = super.dispatchKeyEvent(keyevent);
_L6:
        return flag;
_L3:
        if (i == 0)
        {
            (new org.xbmc.kore.jsonrpc.method.Application.SetVolume("increment")).execute(hostManager.getConnection(), null, null);
            return true;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (i == 0)
        {
            (new org.xbmc.kore.jsonrpc.method.Application.SetVolume("decrement")).execute(hostManager.getConnection(), null, null);
            return true;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void inputOnInputRequested(String s, String s1, String s2)
    {
        SendTextDialogFragment.newInstance(s).show(getSupportFragmentManager(), null);
    }

    public void observerOnStopObserving()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        PreferenceManager.setDefaultValues(this, 0x7f060000, false);
        setContentView(0x7f03001d);
        ButterKnife.inject(this);
        hostManager = HostManager.getInstance(this);
        if (hostManager.getHostInfo() == null)
        {
            bundle = new Intent(this, org/xbmc/kore/ui/hosts/AddHostActivity);
            bundle.addFlags(0x4000000);
            bundle.addFlags(0x10000000);
            startActivity(bundle);
            finish();
        }
        navigationDrawerFragment = (NavigationDrawerFragment)getSupportFragmentManager().findFragmentById(0x7f0e0052);
        navigationDrawerFragment.setUp(0x7f0e0052, (DrawerLayout)findViewById(0x7f0e0050));
        bundle = (new TabsAdapter(this, getSupportFragmentManager())).addTab(org/xbmc/kore/ui/NowPlayingFragment, null, 0x7f07006b, 1L).addTab(org/xbmc/kore/ui/RemoteFragment, null, 0x7f07007a, 2L).addTab(org/xbmc/kore/ui/PlaylistFragment, null, 0x7f070072, 3L);
        viewPager.setAdapter(bundle);
        pageIndicator.setViewPager(viewPager);
        pageIndicator.setOnPageChangeListener(defaultOnPageChangeListener);
        viewPager.setCurrentItem(1);
        viewPager.setOffscreenPageLimit(2);
        setupActionBar();
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        if (!navigationDrawerFragment.isDrawerOpen())
        {
            getMenuInflater().inflate(0x7f0f0008, menu);
        }
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        case 2131624160: 
        case 2131624161: 
        case 2131624162: 
        case 2131624163: 
        case 2131624164: 
        case 2131624165: 
        case 2131624166: 
        case 2131624167: 
        case 2131624168: 
        default:
            return super.onOptionsItemSelected(menuitem);

        case 2131624159: 
            UIUtils.sendWolAsync(this, hostManager.getHostInfo());
            return true;

        case 2131624169: 
            (new org.xbmc.kore.jsonrpc.method.Application.Quit()).execute(hostManager.getConnection(), null, null);
            return true;

        case 2131624170: 
            (new org.xbmc.kore.jsonrpc.method.System.Suspend()).execute(hostManager.getConnection(), null, null);
            return true;

        case 2131624171: 
            (new org.xbmc.kore.jsonrpc.method.System.Reboot()).execute(hostManager.getConnection(), null, null);
            return true;

        case 2131624172: 
            (new org.xbmc.kore.jsonrpc.method.System.Shutdown()).execute(hostManager.getConnection(), null, null);
            return true;

        case 2131624173: 
            SendTextDialogFragment.newInstance(getString(0x7f070087)).show(getSupportFragmentManager(), null);
            return true;

        case 2131624178: 
            (new org.xbmc.kore.jsonrpc.method.GUI.SetFullscreen()).execute(hostManager.getConnection(), null, null);
            return true;

        case 2131624175: 
            (new org.xbmc.kore.jsonrpc.method.VideoLibrary.Clean()).execute(hostManager.getConnection(), null, null);
            return true;

        case 2131624177: 
            (new org.xbmc.kore.jsonrpc.method.AudioLibrary.Clean()).execute(hostManager.getConnection(), null, null);
            return true;

        case 2131624174: 
            (new org.xbmc.kore.jsonrpc.method.VideoLibrary.Scan()).execute(hostManager.getConnection(), null, null);
            return true;

        case 2131624176: 
            (new org.xbmc.kore.jsonrpc.method.AudioLibrary.Scan()).execute(hostManager.getConnection(), null, null);
            return true;
        }
    }

    public void onPause()
    {
        super.onPause();
        hostConnectionObserver.unregisterPlayerObserver(this);
        hostConnectionObserver = null;
    }

    public void onResume()
    {
        super.onResume();
        hostConnectionObserver = hostManager.getHostConnectionObserver();
        hostConnectionObserver.registerPlayerObserver(this, true);
        hostConnectionObserver.forceRefreshResults();
    }

    public void onSendTextCancel()
    {
    }

    public void onSendTextFinished(String s, boolean flag)
    {
        (new org.xbmc.kore.jsonrpc.method.Input.SendText(s, flag)).execute(hostManager.getConnection(), null, null);
    }

    public void onStart()
    {
        super.onStart();
        handleStartIntent(getIntent());
    }

    public void playerNoResultsYet()
    {
    }

    public void playerOnConnectionError(int i, String s)
    {
        playerOnStop();
    }

    public void playerOnPause(org.xbmc.kore.jsonrpc.type.PlayerType.GetActivePlayersReturnType getactiveplayersreturntype, org.xbmc.kore.jsonrpc.type.PlayerType.PropertyValue propertyvalue, org.xbmc.kore.jsonrpc.type.ListType.ItemsAll itemsall)
    {
        playerOnPlay(getactiveplayersreturntype, propertyvalue, itemsall);
    }

    public void playerOnPlay(org.xbmc.kore.jsonrpc.type.PlayerType.GetActivePlayersReturnType getactiveplayersreturntype, org.xbmc.kore.jsonrpc.type.PlayerType.PropertyValue propertyvalue, org.xbmc.kore.jsonrpc.type.ListType.ItemsAll itemsall)
    {
        checkEventServerAvailability();
        if (TextUtils.isEmpty(itemsall.fanart))
        {
            getactiveplayersreturntype = itemsall.thumbnail;
        } else
        {
            getactiveplayersreturntype = itemsall.fanart;
        }
        if (getactiveplayersreturntype != null && !getactiveplayersreturntype.equals(lastImageUrl))
        {
            setImageViewBackground(getactiveplayersreturntype);
        }
        lastImageUrl = getactiveplayersreturntype;
        if (PreferenceManager.getDefaultSharedPreferences(this).getBoolean("pref_show_notification", false))
        {
            LogUtils.LOGD(TAG, "Starting notification service");
            startService(new Intent(this, org/xbmc/kore/service/NotificationService));
        }
    }

    public void playerOnStop()
    {
        checkEventServerAvailability();
        if (lastImageUrl != null)
        {
            setImageViewBackground(null);
        }
        lastImageUrl = null;
    }

    public void systemOnQuit()
    {
        Toast.makeText(this, 0x7f0700cd, 0).show();
        playerOnStop();
    }






}
