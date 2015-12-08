// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.host;

import android.os.Handler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.xbmc.kore.jsonrpc.ApiCallback;
import org.xbmc.kore.jsonrpc.HostConnection;
import org.xbmc.kore.utils.LogUtils;

public class HostConnectionObserver
    implements org.xbmc.kore.jsonrpc.HostConnection.InputNotificationsObserver, org.xbmc.kore.jsonrpc.HostConnection.PlayerNotificationsObserver, org.xbmc.kore.jsonrpc.HostConnection.SystemNotificationsObserver
{
    public static interface PlayerEventsObserver
    {

        public abstract void inputOnInputRequested(String s, String s1, String s2);

        public abstract void observerOnStopObserving();

        public abstract void playerNoResultsYet();

        public abstract void playerOnConnectionError(int i, String s);

        public abstract void playerOnPause(org.xbmc.kore.jsonrpc.type.PlayerType.GetActivePlayersReturnType getactiveplayersreturntype, org.xbmc.kore.jsonrpc.type.PlayerType.PropertyValue propertyvalue, org.xbmc.kore.jsonrpc.type.ListType.ItemsAll itemsall);

        public abstract void playerOnPlay(org.xbmc.kore.jsonrpc.type.PlayerType.GetActivePlayersReturnType getactiveplayersreturntype, org.xbmc.kore.jsonrpc.type.PlayerType.PropertyValue propertyvalue, org.xbmc.kore.jsonrpc.type.ListType.ItemsAll itemsall);

        public abstract void playerOnStop();

        public abstract void systemOnQuit();
    }


    public static final String TAG = LogUtils.makeLogTag(org/xbmc/kore/host/HostConnectionObserver);
    private Handler checkerHandler;
    private HostConnection connection;
    private boolean forceReply;
    private Runnable httpCheckerRunnable;
    private int lastCallResult;
    private int lastErrorCode;
    private String lastErrorDescription;
    private org.xbmc.kore.jsonrpc.type.PlayerType.GetActivePlayersReturnType lastGetActivePlayerResult;
    private org.xbmc.kore.jsonrpc.type.ListType.ItemsAll lastGetItemResult;
    private org.xbmc.kore.jsonrpc.type.PlayerType.PropertyValue lastGetPropertiesResult;
    private List playerEventsObservers;
    private Runnable tcpCheckerRunnable;

    public HostConnectionObserver(HostConnection hostconnection)
    {
        playerEventsObservers = new ArrayList();
        checkerHandler = new Handler();
        httpCheckerRunnable = new Runnable() {

            final HostConnectionObserver this$0;

            public void run()
            {
                if (playerEventsObservers.size() == 0)
                {
                    return;
                } else
                {
                    checkWhatsPlaying();
                    checkerHandler.postDelayed(this, 3000L);
                    return;
                }
            }

            
            {
                this$0 = HostConnectionObserver.this;
                super();
            }
        };
        tcpCheckerRunnable = new Runnable() {

            final HostConnectionObserver this$0;

            public void run()
            {
                if (playerEventsObservers.size() == 0)
                {
                    return;
                } else
                {
                    (new org.xbmc.kore.jsonrpc.method.JSONRPC.Ping()).execute(connection, new ApiCallback() {

                        final _cls2 this$1;

                        public void onError(int i, String s)
                        {
                            notifyConnectionError(i, s, playerEventsObservers);
                            checkerHandler.postDelayed(tcpCheckerRunnable, 2000L);
                        }

                        public volatile void onSuccess(Object obj)
                        {
                            onSuccess((String)obj);
                        }

                        public void onSuccess(String s)
                        {
                            if (lastCallResult == 0 || lastCallResult == 1)
                            {
                                checkWhatsPlaying();
                            }
                            checkerHandler.postDelayed(tcpCheckerRunnable, 10000L);
                        }

            
            {
                this$1 = _cls2.this;
                super();
            }
                    }, checkerHandler);
                    return;
                }
            }

            
            {
                this$0 = HostConnectionObserver.this;
                super();
            }
        };
        lastCallResult = 0;
        lastGetActivePlayerResult = null;
        lastGetPropertiesResult = null;
        lastGetItemResult = null;
        forceReply = false;
        connection = hostconnection;
    }

    private void chainCallGetActivePlayers()
    {
        (new org.xbmc.kore.jsonrpc.method.Player.GetActivePlayers()).execute(connection, new ApiCallback() {

            final HostConnectionObserver this$0;

            public void onError(int i, String s)
            {
                LogUtils.LOGD(HostConnectionObserver.TAG, "Notifying error");
                notifyConnectionError(i, s, playerEventsObservers);
            }

            public volatile void onSuccess(Object obj)
            {
                onSuccess((ArrayList)obj);
            }

            public void onSuccess(ArrayList arraylist)
            {
                if (arraylist.isEmpty())
                {
                    LogUtils.LOGD(HostConnectionObserver.TAG, "Nothing is playing");
                    notifyNothingIsPlaying(playerEventsObservers);
                    return;
                } else
                {
                    chainCallGetProperties((org.xbmc.kore.jsonrpc.type.PlayerType.GetActivePlayersReturnType)arraylist.get(0));
                    return;
                }
            }

            
            {
                this$0 = HostConnectionObserver.this;
                super();
            }
        }, checkerHandler);
    }

    private void chainCallGetItem(final org.xbmc.kore.jsonrpc.type.PlayerType.GetActivePlayersReturnType getActivePlayersResult, final org.xbmc.kore.jsonrpc.type.PlayerType.PropertyValue getPropertiesResult)
    {
        (new org.xbmc.kore.jsonrpc.method.Player.GetItem(getActivePlayersResult.playerid, new String[] {
            "art", "artist", "albumartist", "album", "cast", "director", "displayartist", "duration", "episode", "fanart", 
            "file", "firstaired", "genre", "imdbnumber", "plot", "premiered", "rating", "resume", "runtime", "season", 
            "showtitle", "streamdetails", "studio", "tagline", "thumbnail", "title", "top250", "track", "votes", "writer", 
            "year", "description"
        })).execute(connection, new ApiCallback() {

            final HostConnectionObserver this$0;
            final org.xbmc.kore.jsonrpc.type.PlayerType.GetActivePlayersReturnType val$getActivePlayersResult;
            final org.xbmc.kore.jsonrpc.type.PlayerType.PropertyValue val$getPropertiesResult;

            public void onError(int i, String s)
            {
                notifyConnectionError(i, s, playerEventsObservers);
            }

            public volatile void onSuccess(Object obj)
            {
                onSuccess((org.xbmc.kore.jsonrpc.type.ListType.ItemsAll)obj);
            }

            public void onSuccess(org.xbmc.kore.jsonrpc.type.ListType.ItemsAll itemsall)
            {
                notifySomethingIsPlaying(getActivePlayersResult, getPropertiesResult, itemsall, playerEventsObservers);
            }

            
            {
                this$0 = HostConnectionObserver.this;
                getActivePlayersResult = getactiveplayersreturntype;
                getPropertiesResult = propertyvalue;
                super();
            }
        }, checkerHandler);
    }

    private void chainCallGetProperties(final org.xbmc.kore.jsonrpc.type.PlayerType.GetActivePlayersReturnType getActivePlayersResult)
    {
        (new org.xbmc.kore.jsonrpc.method.Player.GetProperties(getActivePlayersResult.playerid, new String[] {
            "speed", "percentage", "position", "time", "totaltime", "repeat", "shuffled", "currentaudiostream", "currentsubtitle", "audiostreams", 
            "subtitles", "playlistid"
        })).execute(connection, new ApiCallback() {

            final HostConnectionObserver this$0;
            final org.xbmc.kore.jsonrpc.type.PlayerType.GetActivePlayersReturnType val$getActivePlayersResult;

            public void onError(int i, String s)
            {
                notifyConnectionError(i, s, playerEventsObservers);
            }

            public volatile void onSuccess(Object obj)
            {
                onSuccess((org.xbmc.kore.jsonrpc.type.PlayerType.PropertyValue)obj);
            }

            public void onSuccess(org.xbmc.kore.jsonrpc.type.PlayerType.PropertyValue propertyvalue)
            {
                chainCallGetItem(getActivePlayersResult, propertyvalue);
            }

            
            {
                this$0 = HostConnectionObserver.this;
                getActivePlayersResult = getactiveplayersreturntype;
                super();
            }
        }, checkerHandler);
    }

    private void checkWhatsPlaying()
    {
        LogUtils.LOGD(TAG, "Checking whats playing");
        chainCallGetActivePlayers();
    }

    private void notifyConnectionError(int i, String s, List list)
    {
        if (forceReply || lastCallResult != 1 || lastErrorCode != i)
        {
            lastCallResult = 1;
            lastErrorCode = i;
            lastErrorDescription = s;
            forceReply = false;
            for (list = (new ArrayList(list)).iterator(); list.hasNext(); notifyConnectionError(i, s, (PlayerEventsObserver)list.next())) { }
        }
    }

    private void notifyConnectionError(int i, String s, PlayerEventsObserver playereventsobserver)
    {
        playereventsobserver.playerOnConnectionError(i, s);
    }

    private void notifyNothingIsPlaying(List list)
    {
        if (forceReply || lastCallResult != 4)
        {
            lastCallResult = 4;
            forceReply = false;
            for (list = (new ArrayList(list)).iterator(); list.hasNext(); notifyNothingIsPlaying((PlayerEventsObserver)list.next())) { }
        }
    }

    private void notifyNothingIsPlaying(PlayerEventsObserver playereventsobserver)
    {
        playereventsobserver.playerOnStop();
    }

    private void notifySomethingIsPlaying(org.xbmc.kore.jsonrpc.type.PlayerType.GetActivePlayersReturnType getactiveplayersreturntype, org.xbmc.kore.jsonrpc.type.PlayerType.PropertyValue propertyvalue, org.xbmc.kore.jsonrpc.type.ListType.ItemsAll itemsall, List list)
    {
        int i;
        if (propertyvalue.speed == 0)
        {
            i = 3;
        } else
        {
            i = 2;
        }
        if (forceReply || lastCallResult != i || lastGetPropertiesResult.speed != propertyvalue.speed || lastGetPropertiesResult.shuffled != propertyvalue.shuffled || !lastGetPropertiesResult.repeat.equals(propertyvalue.repeat) || lastGetItemResult.id != itemsall.id || !lastGetItemResult.label.equals(itemsall.label))
        {
            lastCallResult = i;
            lastGetActivePlayerResult = getactiveplayersreturntype;
            lastGetPropertiesResult = propertyvalue;
            lastGetItemResult = itemsall;
            forceReply = false;
            for (list = (new ArrayList(list)).iterator(); list.hasNext(); notifySomethingIsPlaying(getactiveplayersreturntype, propertyvalue, itemsall, (PlayerEventsObserver)list.next())) { }
        }
        if (i == 2 && connection.getProtocol() == 0 && propertyvalue.time.ToSeconds() == 0)
        {
            LogUtils.LOGD(TAG, "Scheduling new call to check what's playing.");
            checkerHandler.postDelayed(new Runnable() {

                final HostConnectionObserver this$0;

                public void run()
                {
                    forceReply = true;
                    checkWhatsPlaying();
                }

            
            {
                this$0 = HostConnectionObserver.this;
                super();
            }
            }, 3000L);
        }
    }

    private void notifySomethingIsPlaying(org.xbmc.kore.jsonrpc.type.PlayerType.GetActivePlayersReturnType getactiveplayersreturntype, org.xbmc.kore.jsonrpc.type.PlayerType.PropertyValue propertyvalue, org.xbmc.kore.jsonrpc.type.ListType.ItemsAll itemsall, PlayerEventsObserver playereventsobserver)
    {
        if (propertyvalue.speed == 0)
        {
            playereventsobserver.playerOnPause(getactiveplayersreturntype, propertyvalue, itemsall);
            return;
        } else
        {
            playereventsobserver.playerOnPlay(getactiveplayersreturntype, propertyvalue, itemsall);
            return;
        }
    }

    public void forceRefreshResults()
    {
        forceReply = true;
        chainCallGetActivePlayers();
    }

    public void onInputRequested(org.xbmc.kore.jsonrpc.notification.Input.OnInputRequested oninputrequested)
    {
        for (Iterator iterator = (new ArrayList(playerEventsObservers)).iterator(); iterator.hasNext(); ((PlayerEventsObserver)iterator.next()).inputOnInputRequested(oninputrequested.title, oninputrequested.type, oninputrequested.value)) { }
    }

    public void onPause(org.xbmc.kore.jsonrpc.notification.Player.OnPause onpause)
    {
        chainCallGetActivePlayers();
    }

    public void onPlay(org.xbmc.kore.jsonrpc.notification.Player.OnPlay onplay)
    {
        chainCallGetActivePlayers();
    }

    public void onQuit(org.xbmc.kore.jsonrpc.notification.System.OnQuit onquit)
    {
        for (onquit = (new ArrayList(playerEventsObservers)).iterator(); onquit.hasNext(); ((PlayerEventsObserver)onquit.next()).systemOnQuit()) { }
    }

    public void onRestart(org.xbmc.kore.jsonrpc.notification.System.OnRestart onrestart)
    {
        for (onrestart = (new ArrayList(playerEventsObservers)).iterator(); onrestart.hasNext(); ((PlayerEventsObserver)onrestart.next()).systemOnQuit()) { }
    }

    public void onSeek(org.xbmc.kore.jsonrpc.notification.Player.OnSeek onseek)
    {
        chainCallGetActivePlayers();
    }

    public void onSleep(org.xbmc.kore.jsonrpc.notification.System.OnSleep onsleep)
    {
        for (onsleep = (new ArrayList(playerEventsObservers)).iterator(); onsleep.hasNext(); ((PlayerEventsObserver)onsleep.next()).systemOnQuit()) { }
    }

    public void onSpeedChanged(org.xbmc.kore.jsonrpc.notification.Player.OnSpeedChanged onspeedchanged)
    {
        chainCallGetActivePlayers();
    }

    public void onStop(org.xbmc.kore.jsonrpc.notification.Player.OnStop onstop)
    {
        notifyNothingIsPlaying(playerEventsObservers);
    }

    public void registerPlayerObserver(PlayerEventsObserver playereventsobserver, boolean flag)
    {
        if (connection != null)
        {
            playerEventsObservers.add(playereventsobserver);
            if (flag)
            {
                replyWithLastResult(playereventsobserver);
            }
            if (playerEventsObservers.size() == 1)
            {
                if (connection.getProtocol() == 0)
                {
                    connection.registerPlayerNotificationsObserver(this, checkerHandler);
                    connection.registerSystemNotificationsObserver(this, checkerHandler);
                    connection.registerInputNotificationsObserver(this, checkerHandler);
                    checkerHandler.post(tcpCheckerRunnable);
                    return;
                } else
                {
                    checkerHandler.post(httpCheckerRunnable);
                    return;
                }
            }
        }
    }

    public void replyWithLastResult(PlayerEventsObserver playereventsobserver)
    {
        switch (lastCallResult)
        {
        default:
            return;

        case 1: // '\001'
            notifyConnectionError(lastErrorCode, lastErrorDescription, playereventsobserver);
            return;

        case 4: // '\004'
            notifyNothingIsPlaying(playereventsobserver);
            return;

        case 2: // '\002'
        case 3: // '\003'
            notifySomethingIsPlaying(lastGetActivePlayerResult, lastGetPropertiesResult, lastGetItemResult, playereventsobserver);
            return;

        case 0: // '\0'
            playereventsobserver.playerNoResultsYet();
            return;
        }
    }

    public void stopObserving()
    {
        for (Iterator iterator = playerEventsObservers.iterator(); iterator.hasNext(); ((PlayerEventsObserver)iterator.next()).observerOnStopObserving()) { }
        playerEventsObservers.clear();
        if (connection.getProtocol() == 0)
        {
            connection.unregisterPlayerNotificationsObserver(this);
            connection.unregisterSystemNotificationsObserver(this);
            connection.unregisterInputNotificationsObserver(this);
            checkerHandler.removeCallbacks(tcpCheckerRunnable);
        } else
        {
            checkerHandler.removeCallbacks(httpCheckerRunnable);
        }
        lastCallResult = 0;
    }

    public void unregisterPlayerObserver(PlayerEventsObserver playereventsobserver)
    {
        playerEventsObservers.remove(playereventsobserver);
        LogUtils.LOGD(TAG, (new StringBuilder()).append("Unregistering observer. Still got ").append(playerEventsObservers.size()).append(" observers.").toString());
        if (playerEventsObservers.size() == 0)
        {
            if (connection.getProtocol() == 0)
            {
                connection.unregisterPlayerNotificationsObserver(this);
                connection.unregisterSystemNotificationsObserver(this);
                connection.unregisterInputNotificationsObserver(this);
                checkerHandler.removeCallbacks(tcpCheckerRunnable);
            } else
            {
                checkerHandler.removeCallbacks(httpCheckerRunnable);
            }
            lastCallResult = 0;
        }
    }






/*
    static boolean access$1102(HostConnectionObserver hostconnectionobserver, boolean flag)
    {
        hostconnectionobserver.forceReply = flag;
        return flag;
    }

*/








}
