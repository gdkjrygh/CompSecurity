// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app;

import com.skype.Account;
import com.skype.Conversation;
import com.skype.Message;
import com.skype.PROPKEY;
import com.skype.SkyLib;
import com.skype.Transfer;
import com.skype.VideoMessage;
import com.skype.VideoMessageImpl;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.AnalyticsEvent;
import com.skype.android.analytics.AnalyticsParameter;
import com.skype.android.analytics.AnalyticsParameterContainer;
import com.skype.android.event.EventBus;
import com.skype.android.inject.AccountProvider;
import com.skype.android.inject.EventSubscriberBinder;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.skylib.ObjectInterfaceNotFoundException;
import com.skype.android.util.ConversationUtil;
import com.skype.android.util.DeviceFeatures;
import com.skype.android.wakeup.BackgroundLogger;
import com.skype.android.wakeup.ForegroundState;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class BackgroundMode
{

    public static final com.skype.GI.NETWORKACTIVITYLEVEL BACKGROUND_LEVEL;
    private static final com.skype.GI.NETWORKACTIVITYLEVEL CALLS_MINIMAL_LEVEL;
    private static final com.skype.GI.NETWORKACTIVITYLEVEL NORMAL_LEVEL;
    private static final Logger log;
    private AccountProvider accountProvider;
    private com.skype.GI.NETWORKACTIVITYLEVEL activityLevel;
    private Analytics analytics;
    private ConversationUtil conversationUtil;
    private ForegroundState foregroundState;
    private SkyLib lib;
    private ObjectIdMap map;

    public BackgroundMode(SkyLib skylib, ObjectIdMap objectidmap, AccountProvider accountprovider, ConversationUtil conversationutil, ForegroundState foregroundstate, EventBus eventbus, Analytics analytics1)
    {
        lib = skylib;
        map = objectidmap;
        accountProvider = accountprovider;
        conversationUtil = conversationutil;
        foregroundState = foregroundstate;
        analytics = analytics1;
        activityLevel = NORMAL_LEVEL;
        (new EventSubscriberBinder(eventbus, this)).bind();
    }

    private boolean areCallsAllowed()
    {
        this;
        JVM INSTR monitorenter ;
        int i;
        int j;
        i = activityLevel.toInt();
        j = CALLS_MINIMAL_LEVEL.toInt();
        boolean flag;
        if (i <= j)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    private boolean canBackground()
    {
        if (accountProvider.get().getStatusProp() == com.skype.Account.STATUS.LOGGED_IN)
        {
            List list = conversationUtil.a(false);
            List list1 = getLiveTransfers();
            List list2 = getUploadingVideoMessages();
            if (list.size() != 0 || list1.size() != 0 || list2.size() != 0)
            {
                return false;
            }
        }
        return true;
    }

    private void changeOperationMode(com.skype.GI.NETWORKACTIVITYLEVEL networkactivitylevel)
    {
        this;
        JVM INSTR monitorenter ;
        com.skype.GI.NETWORKACTIVITYLEVEL networkactivitylevel1 = activityLevel;
        activityLevel = networkactivitylevel;
        log.info((new StringBuilder("Changing skylib activity level: ")).append(networkactivitylevel1).append(" -> ").append(networkactivitylevel).toString());
        lib.changeOperationMode(networkactivitylevel.toInt());
        this;
        JVM INSTR monitorexit ;
        return;
        networkactivitylevel;
        throw networkactivitylevel;
    }

    private List getLiveTransfers()
    {
        ArrayList arraylist;
        int ai[];
        arraylist = new ArrayList();
        ai = lib.getMessageListByType(com.skype.Message.TYPE.POSTED_FILES, false, 0, (int)(System.currentTimeMillis() / 1000L)).m_messageObjectIDList;
        int k = ai.length;
        int i = 0;
_L5:
        int j;
        if (i >= k)
        {
            break; /* Loop/switch isn't completed */
        }
        j = ai[i];
        int ai1[];
        int l;
        ai1 = ((Message)map.a(j, com/skype/Message)).getTransfers().m_transferObjectIDList;
        l = ai1.length;
        j = 0;
_L3:
        if (j >= l) goto _L2; else goto _L1
_L1:
        int i1 = ai1[j];
        Transfer transfer = (Transfer)map.a(i1, com/skype/Transfer);
        if (ConversationUtil.a(transfer))
        {
            arraylist.add(transfer);
        }
        j++;
          goto _L3
_L2:
        i++;
        if (true) goto _L5; else goto _L4
        ObjectInterfaceNotFoundException objectinterfacenotfoundexception;
        objectinterfacenotfoundexception;
        sendHandledObjectNotFoundTelemetry("getLiveTransfers");
_L4:
        return arraylist;
    }

    private List getUploadingVideoMessages()
    {
        ArrayList arraylist;
        int ai[];
        arraylist = new ArrayList();
        ai = lib.getMessageListByType(com.skype.Message.TYPE.POSTED_VIDEO_MESSAGE, true, 0).m_messageObjectIDList;
        int j = ai.length;
        int i = 0;
_L2:
        int k;
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        k = ai[i];
        Message message = (Message)map.a(k, com/skype/Message);
        VideoMessageImpl videomessageimpl = new VideoMessageImpl();
        message.getVideoMessage(videomessageimpl);
        if (videomessageimpl.getStatusProp() == com.skype.VideoMessage.STATUS.UPLOADING)
        {
            arraylist.add(videomessageimpl);
        }
        i++;
        if (true) goto _L2; else goto _L1
        ObjectInterfaceNotFoundException objectinterfacenotfoundexception;
        objectinterfacenotfoundexception;
        sendHandledObjectNotFoundTelemetry("getUploadingVideoMessages");
_L1:
        return arraylist;
    }

    public void background()
    {
        if (!foregroundState.c())
        {
            if (canBackground())
            {
                changeOperationMode(BACKGROUND_LEVEL);
                return;
            } else
            {
                log.info("Can't move SkyLib to Background mode. We some work to do still.");
                return;
            }
        } else
        {
            log.info("Can't move SkyLib to Background mode: Application in the foreground.");
            return;
        }
    }

    public void foreground()
    {
        foreground(false);
    }

    public void foreground(boolean flag)
    {
        com.skype.GI.NETWORKACTIVITYLEVEL networkactivitylevel;
        if (flag)
        {
            networkactivitylevel = com.skype.GI.NETWORKACTIVITYLEVEL.NAL_QUIET_WITH_NETWORK_LEVEL;
        } else
        {
            networkactivitylevel = NORMAL_LEVEL;
        }
        changeOperationMode(networkactivitylevel);
    }

    public void handleIncommingCall()
    {
        if (!areCallsAllowed())
        {
            log.info((new StringBuilder("Preparing to handle incoming call. Moving to: ")).append(CALLS_MINIMAL_LEVEL).toString());
            changeOperationMode(CALLS_MINIMAL_LEVEL);
            return;
        } else
        {
            log.info("Call setup services already available.");
            return;
        }
    }

    public boolean isBackgrounded()
    {
        this;
        JVM INSTR monitorenter ;
        int i;
        int j;
        i = activityLevel.toInt();
        j = com.skype.GI.NETWORKACTIVITYLEVEL.NAL_FIRST_QUIET_LEVEL.toInt();
        boolean flag;
        if (i >= j)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public void onEvent(com.skype.android.gen.ConversationListener.OnPropertyChange onpropertychange)
    {
        if (onpropertychange.getPropKey() != PROPKEY.CONVERSATION_LOCAL_LIVESTATUS) goto _L2; else goto _L1
_L1:
        onpropertychange = ((Conversation)onpropertychange.getSender()).getLocalLiveStatusProp();
        static final class _cls1
        {

            static final int $SwitchMap$com$skype$Conversation$LOCAL_LIVESTATUS[];

            static 
            {
                $SwitchMap$com$skype$Conversation$LOCAL_LIVESTATUS = new int[com.skype.Conversation.LOCAL_LIVESTATUS.values().length];
                try
                {
                    $SwitchMap$com$skype$Conversation$LOCAL_LIVESTATUS[com.skype.Conversation.LOCAL_LIVESTATUS.NONE.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror) { }
            }
        }

        _cls1..SwitchMap.com.skype.Conversation.LOCAL_LIVESTATUS[onpropertychange.ordinal()];
        JVM INSTR tableswitch 1 1: default 48
    //                   1 49;
           goto _L2 _L3
_L2:
        return;
_L3:
        background();
        return;
    }

    public void onEvent(com.skype.android.gen.TransferListener.OnPropertyChange onpropertychange)
    {
        if (onpropertychange.getPropKey() == PROPKEY.TRANSFER_STATUS)
        {
            background();
        }
    }

    public void onEvent(com.skype.android.gen.VideoMessageListener.OnPropertyChange onpropertychange)
    {
        if (onpropertychange.getPropKey() == PROPKEY.VIDEOMESSAGE_STATUS)
        {
            background();
        }
    }

    protected void sendHandledObjectNotFoundTelemetry(String s)
    {
        AnalyticsParameterContainer analyticsparametercontainer = new AnalyticsParameterContainer();
        s = (new StringBuilder()).append(getClass().getSimpleName()).append("-").append(s).toString();
        analyticsparametercontainer.a(AnalyticsParameter.T, s);
        analytics.a(AnalyticsEvent.df, analyticsparametercontainer);
    }

    static 
    {
        NORMAL_LEVEL = com.skype.GI.NETWORKACTIVITYLEVEL.NAL_NORMAL_LEVEL;
        CALLS_MINIMAL_LEVEL = com.skype.GI.NETWORKACTIVITYLEVEL.NAL_QUIET_WITH_NETWORK_LEVEL;
        com.skype.GI.NETWORKACTIVITYLEVEL networkactivitylevel;
        if (DeviceFeatures.d())
        {
            networkactivitylevel = CALLS_MINIMAL_LEVEL;
        } else
        {
            networkactivitylevel = com.skype.GI.NETWORKACTIVITYLEVEL.NAL_QUIET_SUSPENDED_OFFLINE_LEVEL;
        }
        BACKGROUND_LEVEL = networkactivitylevel;
        log = BackgroundLogger.a;
    }
}
