// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.LogAttributeName;
import com.skype.android.analytics.LogEvent;
import com.skype.android.analytics.SkypeTelemetryEvent;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.event.EventBus;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.NetworkUtil;
import com.skype.android.util.StopWatch;

public class ChatServiceMonitor
{
    public static final class ChatServiceEventProp extends Enum
    {

        private static final ChatServiceEventProp $VALUES[];
        public static final ChatServiceEventProp CONNECTED;
        public static final ChatServiceEventProp CONNECTING;
        public static final ChatServiceEventProp DISCONNECTED;
        public static final ChatServiceEventProp NO_INTERNET_CONNECTION;
        public static final ChatServiceEventProp UPDATING_CONVERSATIONS;
        private int colorId;
        private int textId;

        public static ChatServiceEventProp valueOf(String s)
        {
            return (ChatServiceEventProp)Enum.valueOf(com/skype/android/app/chat/ChatServiceMonitor$ChatServiceEventProp, s);
        }

        public static ChatServiceEventProp[] values()
        {
            return (ChatServiceEventProp[])$VALUES.clone();
        }

        public final int getColorId()
        {
            return colorId;
        }

        public final int getTextId()
        {
            return textId;
        }

        static 
        {
            NO_INTERNET_CONNECTION = new ChatServiceEventProp("NO_INTERNET_CONNECTION", 0, 0x7f080377, 0x7f0f0127);
            DISCONNECTED = new ChatServiceEventProp("DISCONNECTED", 1, 0x7f0803f8, 0x7f0f0127);
            CONNECTING = new ChatServiceEventProp("CONNECTING", 2, 0x7f0803f7, 0x7f0f00e8);
            CONNECTED = new ChatServiceEventProp("CONNECTED", 3, 0x7f0803f6, 0x7f0f0101);
            UPDATING_CONVERSATIONS = new ChatServiceEventProp("UPDATING_CONVERSATIONS", 4, 0x7f0803f9, 0x7f0f0127);
            $VALUES = (new ChatServiceEventProp[] {
                NO_INTERNET_CONNECTION, DISCONNECTED, CONNECTING, CONNECTED, UPDATING_CONVERSATIONS
            });
        }

        private ChatServiceEventProp(String s, int i, int j, int k)
        {
            super(s, i);
            textId = j;
            colorId = k;
        }
    }

    public class ChatServiceMonitorEvent
    {

        private ChatServiceEventProp prop;
        private boolean show;
        final ChatServiceMonitor this$0;

        public ChatServiceEventProp getProp()
        {
            return prop;
        }

        public boolean getShow()
        {
            return show;
        }

        public void saveData(ChatServiceEventProp chatserviceeventprop, boolean flag)
        {
            prop = chatserviceeventprop;
            show = flag;
        }

        public ChatServiceMonitorEvent(ChatServiceEventProp chatserviceeventprop, boolean flag)
        {
            this$0 = ChatServiceMonitor.this;
            super();
            prop = chatserviceeventprop;
            show = flag;
        }
    }


    private static final int CONN_INDICATOR_DELAY_MS = 1500;
    private static final int SYNC_INDICATOR_DELAY_MS = 5500;
    private static ChatServiceMonitorEvent currentBanner;
    private Analytics analytics;
    private boolean connectionIndicatorOn;
    private Context context;
    private int count;
    private EcsConfiguration ecsConfiguration;
    private EventBus eventBus;
    private Handler handler;
    private boolean isOnline;
    private Runnable msnpConnRunnable;
    private Runnable msnpSyncRunnable;
    private NetworkUtil networkUtil;
    private final com.skype.SkyLib.GetConnectivity_Result status = new com.skype.SkyLib.GetConnectivity_Result();
    private StopWatch stopWatch;
    private com.skype.SkyLib.SYNC_STATUS syncStatus;

    public ChatServiceMonitor(Application application, NetworkUtil networkutil, Analytics analytics1, EventBus eventbus, EcsConfiguration ecsconfiguration)
    {
        context = application;
        networkUtil = networkutil;
        analytics = analytics1;
        eventBus = eventbus;
        ecsConfiguration = ecsconfiguration;
        status.init(com.skype.SkyLib.CONNECTION_STATUS.MSNP_NO_NETWORK, com.skype.SkyLib.SYNC_STATUS.MSNP_NEED_TO_SYNC, com.skype.SkyLib.SEND_STATUS.MSNP_SEND_IDLE);
        handler = new Handler(Looper.getMainLooper());
        msnpSyncRunnable = new Runnable() {

            final ChatServiceMonitor this$0;

            public final void run()
            {
                notifyBanner(getEventProp(syncStatus), true);
            }

            
            {
                this$0 = ChatServiceMonitor.this;
                super();
            }
        };
        msnpConnRunnable = new Runnable() {

            final ChatServiceMonitor this$0;

            public final void run()
            {
                notifyBanner(getEventProp(status.m_conn_s), false);
            }

            
            {
                this$0 = ChatServiceMonitor.this;
                super();
            }
        };
        resetConnectionIndicator();
        syncStatus = status.m_sync_s;
        stopWatch = new StopWatch();
        isOnline = false;
        count = 0;
        currentBanner = new ChatServiceMonitorEvent(ChatServiceEventProp.NO_INTERNET_CONNECTION, false);
    }

    private ChatServiceEventProp getEventProp(Object obj)
    {
        ChatServiceEventProp chatserviceeventprop = null;
        if (obj instanceof com.skype.SkyLib.SYNC_STATUS)
        {
            if ((com.skype.SkyLib.SYNC_STATUS)obj == com.skype.SkyLib.SYNC_STATUS.MSNP_SYNCING)
            {
                chatserviceeventprop = ChatServiceEventProp.UPDATING_CONVERSATIONS;
            }
        } else
        if (obj instanceof com.skype.SkyLib.CONNECTION_STATUS)
        {
            obj = (com.skype.SkyLib.CONNECTION_STATUS)obj;
            static final class _cls3
            {

                static final int $SwitchMap$com$skype$SkyLib$CONNECTION_STATUS[];

                static 
                {
                    $SwitchMap$com$skype$SkyLib$CONNECTION_STATUS = new int[com.skype.SkyLib.CONNECTION_STATUS.values().length];
                    try
                    {
                        $SwitchMap$com$skype$SkyLib$CONNECTION_STATUS[com.skype.SkyLib.CONNECTION_STATUS.MSNP_NO_NETWORK.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror3) { }
                    try
                    {
                        $SwitchMap$com$skype$SkyLib$CONNECTION_STATUS[com.skype.SkyLib.CONNECTION_STATUS.MSNP_DISCONNECTED.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror2) { }
                    try
                    {
                        $SwitchMap$com$skype$SkyLib$CONNECTION_STATUS[com.skype.SkyLib.CONNECTION_STATUS.MSNP_CONNECTING.ordinal()] = 3;
                    }
                    catch (NoSuchFieldError nosuchfielderror1) { }
                    try
                    {
                        $SwitchMap$com$skype$SkyLib$CONNECTION_STATUS[com.skype.SkyLib.CONNECTION_STATUS.MSNP_CONNECTED.ordinal()] = 4;
                    }
                    catch (NoSuchFieldError nosuchfielderror)
                    {
                        return;
                    }
                }
            }

            switch (_cls3..SwitchMap.com.skype.SkyLib.CONNECTION_STATUS[((com.skype.SkyLib.CONNECTION_STATUS) (obj)).ordinal()])
            {
            default:
                return null;

            case 1: // '\001'
                return ChatServiceEventProp.NO_INTERNET_CONNECTION;

            case 2: // '\002'
                return ChatServiceEventProp.DISCONNECTED;

            case 3: // '\003'
                return ChatServiceEventProp.CONNECTING;

            case 4: // '\004'
                return ChatServiceEventProp.CONNECTED;
            }
        }
        return chatserviceeventprop;
    }

    private void notifyBanner(ChatServiceEventProp chatserviceeventprop, boolean flag)
    {
        if (!flag) goto _L2; else goto _L1
_L1:
        if (chatserviceeventprop != ChatServiceEventProp.CONNECTED) goto _L4; else goto _L3
_L3:
        postMsnpConn(status.m_conn_s);
_L2:
        currentBanner.saveData(chatserviceeventprop, flag);
        eventBus.a(new ChatServiceMonitorEvent(chatserviceeventprop, flag));
        return;
_L4:
        if (chatserviceeventprop == ChatServiceEventProp.DISCONNECTED)
        {
            resetConnectionIndicator();
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    private void postMsnpConn(com.skype.SkyLib.CONNECTION_STATUS connection_status)
    {
        handler.removeCallbacks(msnpConnRunnable);
        handler.postDelayed(msnpConnRunnable, 1500L);
    }

    private void postMsnpSync(com.skype.SkyLib.SYNC_STATUS sync_status)
    {
        syncStatus = sync_status;
        handler.removeCallbacks(msnpSyncRunnable);
        handler.postDelayed(msnpSyncRunnable, 5500L);
    }

    private void report(long l)
    {
        if (analytics != null)
        {
            SkypeTelemetryEvent skypetelemetryevent = new SkypeTelemetryEvent(LogEvent.d);
            skypetelemetryevent.put(LogAttributeName.B, networkUtil.h());
            skypetelemetryevent.put(LogAttributeName.C, Long.valueOf(l));
            skypetelemetryevent.put(LogAttributeName.D, Integer.valueOf(count));
            analytics.a(skypetelemetryevent);
        }
    }

    public ChatServiceMonitorEvent getCurrentBanner()
    {
        return currentBanner;
    }

    public void onAccountAvailability(com.skype.Contact.AVAILABILITY availability)
    {
        if (!isOnline && ContactUtil.a(availability))
        {
            resetConnectionIndicator();
        }
        isOnline = ContactUtil.a(availability);
    }

    public void processEvent(com.skype.SkyLib.GetConnectivity_Result getconnectivity_result)
    {
        boolean flag = false;
        if (!ecsConfiguration.getMsnpConnectionIndicatorEnabled()) goto _L2; else goto _L1
_L1:
        if (status.m_conn_s == getconnectivity_result.m_conn_s) goto _L4; else goto _L3
_L3:
        _cls3..SwitchMap.com.skype.SkyLib.CONNECTION_STATUS[getconnectivity_result.m_conn_s.ordinal()];
        JVM INSTR tableswitch 1 4: default 68
    //                   1 140
    //                   2 140
    //                   3 157
    //                   4 176;
           goto _L5 _L6 _L6 _L7 _L8
_L5:
        if (flag)
        {
            notifyBanner(getEventProp(getconnectivity_result.m_conn_s), true);
        }
        status.m_conn_s = getconnectivity_result.m_conn_s;
_L4:
        if (status.m_sync_s != getconnectivity_result.m_sync_s)
        {
            if (getconnectivity_result.m_sync_s == com.skype.SkyLib.SYNC_STATUS.MSNP_SYNCING)
            {
                postMsnpSync(getconnectivity_result.m_sync_s);
            } else
            {
                handler.removeCallbacks(msnpSyncRunnable);
                if (currentBanner.getProp() == ChatServiceEventProp.UPDATING_CONVERSATIONS && currentBanner.getShow())
                {
                    notifyBanner(currentBanner.getProp(), false);
                }
            }
            status.m_sync_s = getconnectivity_result.m_sync_s;
        }
_L2:
        return;
_L6:
        if (!connectionIndicatorOn)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        continue; /* Loop/switch isn't completed */
_L7:
        if (connectionIndicatorOn)
        {
            stopWatch.a();
            flag = true;
        }
        continue; /* Loop/switch isn't completed */
_L8:
        stopWatch.b();
        if (status.m_conn_s == com.skype.SkyLib.CONNECTION_STATUS.MSNP_CONNECTING && connectionIndicatorOn)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            count = count + 1;
            report(stopWatch.c() / 1000L);
        }
        connectionIndicatorOn = false;
        if (true) goto _L5; else goto _L9
_L9:
    }

    public void resetConnectionIndicator()
    {
        connectionIndicatorOn = true;
    }




}
