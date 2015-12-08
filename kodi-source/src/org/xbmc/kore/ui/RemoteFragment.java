// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import org.xbmc.kore.eventclient.EventServerConnection;
import org.xbmc.kore.eventclient.Packet;
import org.xbmc.kore.eventclient.PacketBUTTON;
import org.xbmc.kore.host.HostConnectionObserver;
import org.xbmc.kore.host.HostInfo;
import org.xbmc.kore.host.HostManager;
import org.xbmc.kore.jsonrpc.ApiCallback;
import org.xbmc.kore.jsonrpc.ApiMethod;
import org.xbmc.kore.utils.LogUtils;
import org.xbmc.kore.utils.RepeatListener;
import org.xbmc.kore.utils.UIUtils;
import org.xbmc.kore.utils.Utils;

public class RemoteFragment extends Fragment
    implements org.xbmc.kore.host.HostConnectionObserver.PlayerEventsObserver
{

    private static final String TAG = LogUtils.makeLogTag(org/xbmc/kore/ui/RemoteFragment);
    ImageView backButton;
    LinearLayout buttonBarPanel;
    private Animation buttonInAnim;
    private Animation buttonOutAnim;
    private Handler callbackHandler;
    ImageView contextButton;
    private int currentActivePlayerId;
    private String currentNowPlayingItemType;
    private ApiCallback defaultActionCallback;
    private ApiCallback defaultPlaySpeedChangedCallback;
    ImageView downButton;
    private EventServerConnection eventServerConnection;
    ImageButton fastForwardButton;
    int fastForwardIcon;
    private android.view.View.OnTouchListener feedbackTouchListener;
    ImageButton homeButton;
    private HostConnectionObserver hostConnectionObserver;
    private HostManager hostManager;
    ImageView infoButton;
    TextView infoMessage;
    RelativeLayout infoPanel;
    TextView infoTitle;
    ImageView leftButton;
    RelativeLayout mediaPanel;
    ImageButton moviesButton;
    ImageButton musicButton;
    TextView nowPlayingDetails;
    TextView nowPlayingTitle;
    ImageView osdButton;
    ImageButton picturesButton;
    ImageButton playButton;
    RelativeLayout remotePanel;
    ImageButton rewindButton;
    int rewindIcon;
    ImageView rightButton;
    ImageView selectButton;
    int skipNextIcon;
    int skipPreviousIcon;
    ImageButton stopButton;
    ImageView thumbnail;
    ImageButton tvShowsButton;
    ImageView upButton;

    public RemoteFragment()
    {
        callbackHandler = new Handler();
        currentActivePlayerId = -1;
        currentNowPlayingItemType = null;
        eventServerConnection = null;
        defaultActionCallback = ApiMethod.getDefaultActionCallback();
        defaultPlaySpeedChangedCallback = new ApiCallback() {

            final RemoteFragment this$0;

            public void onError(int i, String s)
            {
            }

            public void onSuccess(Integer integer)
            {
                if (!isAdded())
                {
                    return;
                } else
                {
                    UIUtils.setPlayPauseButtonIcon(getActivity(), playButton, integer.intValue());
                    return;
                }
            }

            public volatile void onSuccess(Object obj)
            {
                onSuccess((Integer)obj);
            }

            
            {
                this$0 = RemoteFragment.this;
                super();
            }
        };
    }

    private void adjustRemoteButtons()
    {
        TypedArray typedarray = getActivity().getTheme().obtainStyledAttributes(new int[] {
            0x7f010041, 0x7f010007
        });
        int i = typedarray.getColor(0, 0x7f0d0159);
        int j = typedarray.getColor(1, 0x7f0d0060);
        typedarray.recycle();
        leftButton.setColorFilter(i);
        rightButton.setColorFilter(i);
        upButton.setColorFilter(i);
        downButton.setColorFilter(i);
        selectButton.setColorFilter(i);
        backButton.setColorFilter(i);
        infoButton.setColorFilter(i);
        osdButton.setColorFilter(i);
        contextButton.setColorFilter(i);
        if (Utils.isLollipopOrLater())
        {
            remotePanel.setBackgroundTintList(ColorStateList.valueOf(j));
            remotePanel.setBackgroundResource(0x7f020094);
        } else
        if (Utils.isJellybeanOrLater())
        {
            BitmapDrawable bitmapdrawable = new BitmapDrawable(getResources(), BitmapFactory.decodeResource(getResources(), 0x7f020094));
            bitmapdrawable.setColorFilter(new PorterDuffColorFilter(j, android.graphics.PorterDuff.Mode.SRC_IN));
            remotePanel.setBackground(bitmapdrawable);
            return;
        }
    }

    private void createEventServerConnection()
    {
        eventServerConnection = new EventServerConnection(hostManager.getHostInfo(), new org.xbmc.kore.eventclient.EventServerConnection.EventServerConnectionCallback() {

            final RemoteFragment this$0;

            public void OnConnectResult(boolean flag)
            {
                if (!flag)
                {
                    LogUtils.LOGD(RemoteFragment.TAG, "Couldnt setup EventServer, disabling it");
                    eventServerConnection = null;
                }
            }

            
            {
                this$0 = RemoteFragment.this;
                super();
            }
        });
    }

    private void setNowPlayingInfo(org.xbmc.kore.jsonrpc.type.ListType.ItemsAll itemsall, org.xbmc.kore.jsonrpc.type.PlayerType.PropertyValue propertyvalue)
    {
        int i;
        propertyvalue = itemsall.type;
        i = -1;
        propertyvalue.hashCode();
        JVM INSTR lookupswitch 4: default 56
    //                   -1544438277: 204
    //                   -759089802: 236
    //                   3536149: 220
    //                   104087344: 188;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        i;
        JVM INSTR tableswitch 0 3: default 88
    //                   0 252
    //                   1 290
    //                   2 383
    //                   3 447;
           goto _L6 _L7 _L8 _L9 _L10
_L6:
        String s;
        int j;
        switchToPanel(0x7f0e0071, true);
        propertyvalue = itemsall.label;
        s = "";
        itemsall = itemsall.thumbnail;
        i = fastForwardIcon;
        j = rewindIcon;
_L11:
        nowPlayingTitle.setText(propertyvalue);
        nowPlayingDetails.setText(s);
        fastForwardButton.setImageResource(i);
        rewindButton.setImageResource(j);
        UIUtils.loadImageWithCharacterAvatar(getActivity(), hostManager, itemsall, propertyvalue, thumbnail, thumbnail.getWidth(), thumbnail.getHeight());
        return;
_L5:
        if (propertyvalue.equals("movie"))
        {
            i = 0;
        }
          goto _L1
_L2:
        if (propertyvalue.equals("episode"))
        {
            i = 1;
        }
          goto _L1
_L4:
        if (propertyvalue.equals("song"))
        {
            i = 2;
        }
          goto _L1
_L3:
        if (propertyvalue.equals("musicvideo"))
        {
            i = 3;
        }
          goto _L1
_L7:
        switchToPanel(0x7f0e0071, true);
        propertyvalue = itemsall.title;
        s = itemsall.tagline;
        itemsall = itemsall.thumbnail;
        i = fastForwardIcon;
        j = rewindIcon;
          goto _L11
_L8:
        switchToPanel(0x7f0e0071, true);
        propertyvalue = itemsall.title;
        s = String.format(getString(0x7f070082), new Object[] {
            Integer.valueOf(itemsall.season), Integer.valueOf(itemsall.episode)
        });
        s = String.format("%s | %s", new Object[] {
            itemsall.showtitle, s
        });
        itemsall = itemsall.art.poster;
        i = fastForwardIcon;
        j = rewindIcon;
          goto _L11
_L9:
        switchToPanel(0x7f0e0071, true);
        propertyvalue = itemsall.title;
        s = (new StringBuilder()).append(itemsall.displayartist).append(" | ").append(itemsall.album).toString();
        itemsall = itemsall.thumbnail;
        i = skipNextIcon;
        j = skipPreviousIcon;
          goto _L11
_L10:
        switchToPanel(0x7f0e0071, true);
        propertyvalue = itemsall.title;
        s = (new StringBuilder()).append(Utils.listStringConcat(itemsall.artist, ", ")).append(" | ").append(itemsall.album).toString();
        itemsall = itemsall.thumbnail;
        i = fastForwardIcon;
        j = rewindIcon;
          goto _L11
    }

    private void setupDefaultButton(View view, final ApiMethod clickAction, final ApiMethod longClickAction)
    {
        view.setOnTouchListener(feedbackTouchListener);
        if (clickAction != null)
        {
            view.setOnClickListener(new android.view.View.OnClickListener() {

                final RemoteFragment this$0;
                final ApiMethod val$clickAction;

                public void onClick(View view1)
                {
                    UIUtils.handleVibration(getActivity());
                    clickAction.execute(hostManager.getConnection(), defaultActionCallback, callbackHandler);
                }

            
            {
                this$0 = RemoteFragment.this;
                clickAction = apimethod;
                super();
            }
            });
        }
        if (longClickAction != null)
        {
            view.setOnLongClickListener(new android.view.View.OnLongClickListener() {

                final RemoteFragment this$0;
                final ApiMethod val$longClickAction;

                public boolean onLongClick(View view1)
                {
                    UIUtils.handleVibration(getActivity());
                    longClickAction.execute(hostManager.getConnection(), defaultActionCallback, callbackHandler);
                    return true;
                }

            
            {
                this$0 = RemoteFragment.this;
                longClickAction = apimethod;
                super();
            }
            });
        }
    }

    private void setupEventServerButton(View view, String s)
    {
        view.setOnTouchListener(new RepeatListener(400, 80, new android.view.View.OnClickListener() {

            final RemoteFragment this$0;
            final Packet val$packet;

            public void onClick(View view1)
            {
                eventServerConnection.sendPacket(packet);
            }

            
            {
                this$0 = RemoteFragment.this;
                packet = packet1;
                super();
            }
        }, buttonInAnim, buttonOutAnim, getActivity().getApplicationContext()));
    }

    private void setupRepeatButton(View view, final ApiMethod action)
    {
        view.setOnTouchListener(new RepeatListener(400, 80, new android.view.View.OnClickListener() {

            final RemoteFragment this$0;
            final ApiMethod val$action;

            public void onClick(View view1)
            {
                action.execute(hostManager.getConnection(), defaultActionCallback, callbackHandler);
            }

            
            {
                this$0 = RemoteFragment.this;
                action = apimethod;
                super();
            }
        }, buttonInAnim, buttonOutAnim, getActivity().getApplicationContext()));
    }

    private void switchToPanel(int i, boolean flag)
    {
        i;
        JVM INSTR lookupswitch 2: default 28
    //                   2131624049: 69
    //                   2131624115: 49;
           goto _L1 _L2 _L3
_L1:
        break; /* Loop/switch isn't completed */
_L2:
        break MISSING_BLOCK_LABEL_69;
_L4:
        if (flag)
        {
            remotePanel.setVisibility(0);
            buttonBarPanel.setVisibility(0);
            return;
        } else
        {
            remotePanel.setVisibility(8);
            buttonBarPanel.setVisibility(8);
            return;
        }
_L3:
        mediaPanel.setVisibility(8);
        infoPanel.setVisibility(0);
          goto _L4
        infoPanel.setVisibility(8);
        mediaPanel.setVisibility(0);
          goto _L4
    }

    public void inputOnInputRequested(String s, String s1, String s2)
    {
    }

    public void observerOnStopObserving()
    {
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        setHasOptionsMenu(false);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        hostManager = HostManager.getInstance(getActivity());
        hostConnectionObserver = hostManager.getHostConnectionObserver();
        buttonInAnim = AnimationUtils.loadAnimation(getActivity(), 0x7f04000c);
        buttonOutAnim = AnimationUtils.loadAnimation(getActivity(), 0x7f04000d);
        createEventServerConnection();
        feedbackTouchListener = new android.view.View.OnTouchListener() {

            final RemoteFragment this$0;

            public boolean onTouch(View view, MotionEvent motionevent)
            {
                motionevent.getAction();
                JVM INSTR tableswitch 0 3: default 36
            //                           0 38
            //                           1 63
            //                           2 36
            //                           3 63;
                   goto _L1 _L2 _L3 _L1 _L3
_L1:
                return false;
_L2:
                buttonInAnim.setFillAfter(true);
                view.startAnimation(buttonInAnim);
                continue; /* Loop/switch isn't completed */
_L3:
                view.startAnimation(buttonOutAnim);
                if (true) goto _L1; else goto _L4
_L4:
            }

            
            {
                this$0 = RemoteFragment.this;
                super();
            }
        };
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = (ViewGroup)layoutinflater.inflate(0x7f030032, viewgroup, false);
        ButterKnife.inject(this, layoutinflater);
        if (hostManager.getHostInfo().getUseEventServer() && eventServerConnection != null)
        {
            setupEventServerButton(leftButton, "left");
            setupEventServerButton(rightButton, "right");
            setupEventServerButton(upButton, "up");
            setupEventServerButton(downButton, "down");
        } else
        {
            setupRepeatButton(leftButton, new org.xbmc.kore.jsonrpc.method.Input.Left());
            setupRepeatButton(rightButton, new org.xbmc.kore.jsonrpc.method.Input.Right());
            setupRepeatButton(upButton, new org.xbmc.kore.jsonrpc.method.Input.Up());
            setupRepeatButton(downButton, new org.xbmc.kore.jsonrpc.method.Input.Down());
        }
        setupDefaultButton(selectButton, new org.xbmc.kore.jsonrpc.method.Input.Select(), null);
        setupDefaultButton(backButton, new org.xbmc.kore.jsonrpc.method.Input.Back(), null);
        setupDefaultButton(infoButton, new org.xbmc.kore.jsonrpc.method.Input.ExecuteAction("info"), new org.xbmc.kore.jsonrpc.method.Input.ExecuteAction("codecinfo"));
        setupDefaultButton(osdButton, new org.xbmc.kore.jsonrpc.method.Input.ExecuteAction("osd"), null);
        setupDefaultButton(contextButton, new org.xbmc.kore.jsonrpc.method.Input.ExecuteAction("contextmenu"), null);
        adjustRemoteButtons();
        viewgroup = getActivity().getTheme().obtainStyledAttributes(new int[] {
            0x7f010017, 0x7f010031, 0x7f010024, 0x7f01002c
        });
        fastForwardIcon = viewgroup.getResourceId(0, 0x7f020056);
        rewindIcon = viewgroup.getResourceId(1, 0x7f020058);
        skipNextIcon = viewgroup.getResourceId(2, 0x7f020084);
        skipPreviousIcon = viewgroup.getResourceId(3, 0x7f020086);
        viewgroup.recycle();
        return layoutinflater;
    }

    public void onFastForwardClicked(View view)
    {
        if ("song".equals(currentNowPlayingItemType))
        {
            (new org.xbmc.kore.jsonrpc.method.Player.GoTo(currentActivePlayerId, "next")).execute(hostManager.getConnection(), defaultActionCallback, callbackHandler);
            return;
        } else
        {
            (new org.xbmc.kore.jsonrpc.method.Player.SetSpeed(currentActivePlayerId, "increment")).execute(hostManager.getConnection(), defaultPlaySpeedChangedCallback, callbackHandler);
            return;
        }
    }

    public void onHomeClicked(View view)
    {
        (new org.xbmc.kore.jsonrpc.method.GUI.ActivateWindow("home")).execute(hostManager.getConnection(), defaultActionCallback, callbackHandler);
    }

    public void onMoviedClicked(View view)
    {
        (new org.xbmc.kore.jsonrpc.method.GUI.ActivateWindow("videos", new String[] {
            "MovieTitles"
        })).execute(hostManager.getConnection(), defaultActionCallback, callbackHandler);
    }

    public void onMusicClicked(View view)
    {
        (new org.xbmc.kore.jsonrpc.method.GUI.ActivateWindow("musiclibrary")).execute(hostManager.getConnection(), defaultActionCallback, callbackHandler);
    }

    public void onPause()
    {
        super.onPause();
        hostConnectionObserver.unregisterPlayerObserver(this);
        if (eventServerConnection != null)
        {
            eventServerConnection.quit();
            eventServerConnection = null;
        }
    }

    public void onPicturesClicked(View view)
    {
        (new org.xbmc.kore.jsonrpc.method.GUI.ActivateWindow("pictures")).execute(hostManager.getConnection(), defaultActionCallback, callbackHandler);
    }

    public void onPlayClicked(View view)
    {
        (new org.xbmc.kore.jsonrpc.method.Player.PlayPause(currentActivePlayerId)).execute(hostManager.getConnection(), defaultPlaySpeedChangedCallback, callbackHandler);
    }

    public void onResume()
    {
        super.onResume();
        hostConnectionObserver.registerPlayerObserver(this, true);
        if (eventServerConnection == null)
        {
            createEventServerConnection();
        }
    }

    public void onRewindClicked(View view)
    {
        if ("song".equals(currentNowPlayingItemType))
        {
            (new org.xbmc.kore.jsonrpc.method.Player.GoTo(currentActivePlayerId, "previous")).execute(hostManager.getConnection(), defaultActionCallback, callbackHandler);
            return;
        } else
        {
            (new org.xbmc.kore.jsonrpc.method.Player.SetSpeed(currentActivePlayerId, "decrement")).execute(hostManager.getConnection(), defaultPlaySpeedChangedCallback, callbackHandler);
            return;
        }
    }

    public void onStopClicked(View view)
    {
        (new org.xbmc.kore.jsonrpc.method.Player.Stop(currentActivePlayerId)).execute(hostManager.getConnection(), defaultActionCallback, callbackHandler);
    }

    public void onTvShowsClicked(View view)
    {
        (new org.xbmc.kore.jsonrpc.method.GUI.ActivateWindow("videos", new String[] {
            "TvShowTitles"
        })).execute(hostManager.getConnection(), defaultActionCallback, callbackHandler);
    }

    public void playerNoResultsYet()
    {
        switchToPanel(0x7f0e00b3, false);
        if (hostManager.getHostInfo() != null)
        {
            infoTitle.setText(0x7f07002b);
        } else
        {
            infoTitle.setText(0x7f070067);
        }
        infoMessage.setText(null);
    }

    public void playerOnConnectionError(int i, String s)
    {
        s = hostManager.getHostInfo();
        switchToPanel(0x7f0e00b3, false);
        if (s != null)
        {
            infoTitle.setText(0x7f07002b);
            infoMessage.setText(String.format(getString(0x7f07002c), new Object[] {
                s.getName(), s.getAddress()
            }));
            return;
        } else
        {
            infoTitle.setText(0x7f070067);
            infoMessage.setText(null);
            return;
        }
    }

    public void playerOnPause(org.xbmc.kore.jsonrpc.type.PlayerType.GetActivePlayersReturnType getactiveplayersreturntype, org.xbmc.kore.jsonrpc.type.PlayerType.PropertyValue propertyvalue, org.xbmc.kore.jsonrpc.type.ListType.ItemsAll itemsall)
    {
        setNowPlayingInfo(itemsall, propertyvalue);
        currentActivePlayerId = getactiveplayersreturntype.playerid;
        currentNowPlayingItemType = itemsall.type;
        UIUtils.setPlayPauseButtonIcon(getActivity(), playButton, propertyvalue.speed);
    }

    public void playerOnPlay(org.xbmc.kore.jsonrpc.type.PlayerType.GetActivePlayersReturnType getactiveplayersreturntype, org.xbmc.kore.jsonrpc.type.PlayerType.PropertyValue propertyvalue, org.xbmc.kore.jsonrpc.type.ListType.ItemsAll itemsall)
    {
        setNowPlayingInfo(itemsall, propertyvalue);
        currentActivePlayerId = getactiveplayersreturntype.playerid;
        currentNowPlayingItemType = itemsall.type;
        UIUtils.setPlayPauseButtonIcon(getActivity(), playButton, propertyvalue.speed);
    }

    public void playerOnStop()
    {
        HostInfo hostinfo = hostManager.getHostInfo();
        switchToPanel(0x7f0e00b3, true);
        infoTitle.setText(0x7f07006a);
        infoMessage.setText(String.format(getString(0x7f070029), new Object[] {
            hostinfo.getName()
        }));
    }

    public void systemOnQuit()
    {
        playerNoResultsYet();
    }







/*
    static EventServerConnection access$302(RemoteFragment remotefragment, EventServerConnection eventserverconnection)
    {
        remotefragment.eventServerConnection = eventserverconnection;
        return eventserverconnection;
    }

*/



}
