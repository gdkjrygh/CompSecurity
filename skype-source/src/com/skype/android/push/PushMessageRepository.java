// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.push;

import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.event.EventBus;
import com.skype.msnp.MsnpHeader;
import com.skype.msnp.MsnpLayer;
import com.skype.msnp.MsnpMessage;
import com.skype.msnp.MsnpSdgMessageType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.push:
//            PushMessageListener, ChatPushMessage, PushEventType, PushHandlingHelper, 
//            OnChatPushMessageStoredEvent, DisplayResult, PushMessage

public class PushMessageRepository
    implements PushMessageListener
{

    private static final Logger log = Logger.getLogger("PushMessageRepository");
    private EcsConfiguration configuration;
    private EventBus eventBus;
    private Map map;
    private PushHandlingHelper pushHandlingHelper;

    public PushMessageRepository(EcsConfiguration ecsconfiguration, PushHandlingHelper pushhandlinghelper, EventBus eventbus)
    {
        configuration = ecsconfiguration;
        pushHandlingHelper = pushhandlinghelper;
        eventBus = eventbus;
        map = new ConcurrentHashMap(100, 0.75F, 2);
    }

    private void handleChatMessage(ChatPushMessage chatpushmessage)
    {
        MsnpMessage msnpmessage;
        boolean flag1;
        HashMap hashmap;
        HashMap hashmap1;
        PushEventType pusheventtype;
        boolean flag;
        boolean flag2;
        long l;
        if (chatpushmessage.getEventType() == PushEventType.INCOMING_INSTANT_MESSAGE || chatpushmessage.getEventType() == PushEventType.INCOMING_GROUP_INSTANT_MESSAGE)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag2 = false;
        msnpmessage = chatpushmessage.getMsnpMessage();
        flag1 = flag2;
        if (flag)
        {
            flag1 = flag2;
            if (msnpmessage != null)
            {
                MsnpSdgMessageType msnpsdgmessagetype = MsnpSdgMessageType.a(msnpmessage.a(MsnpLayer.c, MsnpHeader.k));
                static final class _cls1
                {

                    static final int $SwitchMap$com$skype$msnp$MsnpSdgMessageType[];

                    static 
                    {
                        $SwitchMap$com$skype$msnp$MsnpSdgMessageType = new int[MsnpSdgMessageType.values().length];
                        try
                        {
                            $SwitchMap$com$skype$msnp$MsnpSdgMessageType[MsnpSdgMessageType.b.ordinal()] = 1;
                        }
                        catch (NoSuchFieldError nosuchfielderror2) { }
                        try
                        {
                            $SwitchMap$com$skype$msnp$MsnpSdgMessageType[MsnpSdgMessageType.c.ordinal()] = 2;
                        }
                        catch (NoSuchFieldError nosuchfielderror1) { }
                        try
                        {
                            $SwitchMap$com$skype$msnp$MsnpSdgMessageType[MsnpSdgMessageType.h.ordinal()] = 3;
                        }
                        catch (NoSuchFieldError nosuchfielderror)
                        {
                            return;
                        }
                    }
                }

                switch (_cls1..SwitchMap.com.skype.msnp.MsnpSdgMessageType[msnpsdgmessagetype.ordinal()])
                {
                default:
                    flag1 = flag2;
                    break;

                case 1: // '\001'
                case 2: // '\002'
                case 3: // '\003'
                    break MISSING_BLOCK_LABEL_354;
                }
            }
        }
_L1:
        if (!flag || flag1)
        {
            pusheventtype = chatpushmessage.getEventType();
            hashmap1 = (HashMap)map.get(chatpushmessage.getConversationIdentity());
            hashmap = hashmap1;
            if (hashmap1 == null)
            {
                hashmap = new HashMap();
                map.put(chatpushmessage.getConversationIdentity(), hashmap);
            }
            if (msnpmessage != null && msnpmessage.f() && !hashmap.containsKey(msnpmessage.d()) || pusheventtype == PushEventType.MEDIA_MESSAGE_SHARING || pusheventtype == PushEventType.MOJI || pusheventtype == PushEventType.AUDIO_MEDIA || pusheventtype == PushEventType.ASYNC_VIDEO_MESSAGE || pusheventtype == PushEventType.ASYNC_FILE_TRANSFER || pusheventtype == PushEventType.VIDEO_SHARING)
            {
                String s1;
                boolean flag3;
                if (msnpmessage != null)
                {
                    s1 = msnpmessage.d();
                } else
                {
                    s1 = "";
                }
                hashmap.put(s1, chatpushmessage);
                if ((flag || pusheventtype == PushEventType.MOJI) && isSmartHistorySyncEnabled())
                {
                    flag3 = true;
                } else
                {
                    flag3 = false;
                }
                l = pushHandlingHelper.startPushHandling();
                eventBus.a(new OnChatPushMessageStoredEvent(chatpushmessage, flag3, l));
                chatpushmessage = chatpushmessage.getMessageBody();
                log.info((new StringBuilder("GCMPUSH:")).append(chatpushmessage).append(";").append(System.currentTimeMillis()).toString());
            }
            return;
        }
        break MISSING_BLOCK_LABEL_372;
        flag1 = true;
          goto _L1
        String s = chatpushmessage.getMessageBody();
        if (msnpmessage != null && !msnpmessage.f())
        {
            log.info((new StringBuilder("We got message with active-endpoint=false, dropping: ")).append(s).toString());
            chatpushmessage.onMessageConsumed(DisplayResult.ENDPOINT_ACTIVE);
            return;
        } else
        {
            chatpushmessage.onMessageConsumed(DisplayResult.TYPE_UNSUPPORTED);
            log.info((new StringBuilder("Dropping unsupported type of push message: ")).append(s).toString());
            return;
        }
    }

    private boolean isSmartHistorySyncEnabled()
    {
        return configuration.isSmartHistorySyncEnabled();
    }

    public void clear()
    {
        for (Iterator iterator = map.values().iterator(); iterator.hasNext();)
        {
            Iterator iterator1 = ((Map)iterator.next()).values().iterator();
            while (iterator1.hasNext()) 
            {
                ((ChatPushMessage)iterator1.next()).onMessageConsumed(DisplayResult.USER_LOGGED_OUT);
            }
        }

        map.clear();
    }

    public int getCount()
    {
        return map.size();
    }

    public List getMessages(String s)
    {
        ArrayList arraylist = new ArrayList();
        s = (HashMap)map.get(s);
        if (s != null)
        {
            for (s = s.entrySet().iterator(); s.hasNext(); arraylist.add(((java.util.Map.Entry)s.next()).getValue())) { }
        }
        return arraylist;
    }

    public EnumSet getSupportedEventTypes()
    {
        return PushMessageFactory.a.CHAT.supportedTypes;
    }

    public List getUnreadConversationsCountSince(long l)
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = map.entrySet().iterator();
label0:
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj = (HashMap)((java.util.Map.Entry)iterator.next()).getValue();
            if (obj == null)
            {
                continue;
            }
            obj = ((HashMap) (obj)).entrySet().iterator();
            ChatPushMessage chatpushmessage;
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    continue label0;
                }
                chatpushmessage = (ChatPushMessage)((java.util.Map.Entry)((Iterator) (obj)).next()).getValue();
            } while (chatpushmessage == null || l == 0L || chatpushmessage.isConsumed() || chatpushmessage.getReceivedTimestamp() <= l);
            arraylist.add(chatpushmessage);
        } while (true);
        return arraylist;
    }

    public void onPushMessage(PushMessage pushmessage)
    {
        handleChatMessage((ChatPushMessage)pushmessage);
    }

    public void removeMessage(ChatPushMessage chatpushmessage)
    {
        HashMap hashmap = (HashMap)map.get(chatpushmessage.getConversationIdentity());
        if (hashmap != null)
        {
            chatpushmessage = chatpushmessage.getMsnpMessage();
            if (chatpushmessage != null)
            {
                chatpushmessage = chatpushmessage.d();
            } else
            {
                chatpushmessage = "";
            }
            hashmap.remove(chatpushmessage);
        }
    }

    public int removeMessages(String s)
    {
        int i = 0;
        boolean flag = false;
        Object obj = getMessages(s);
        if (obj != null)
        {
            obj = ((List) (obj)).iterator();
            for (i = ((flag) ? 1 : 0); ((Iterator) (obj)).hasNext(); i++)
            {
                ((ChatPushMessage)((Iterator) (obj)).next()).onMessageConsumed(DisplayResult.ALREADY_SYNCED);
            }

            map.remove(s);
        }
        return i;
    }

}
