// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.app2app;

import android.os.Handler;
import com.skype.Conversation;
import com.skype.SkyLib;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.app.app2app:
//            Stream, Protocol

public abstract class App2AppChannel
{

    private boolean created;
    private Handler handler;
    private final SkyLib lib;
    private final Logger log;
    private final String name;
    private Protocol protocol;
    private Map streamsMap;

    protected App2AppChannel(SkyLib skylib, Handler handler1, Protocol protocol1, Logger logger, String s)
    {
        lib = skylib;
        protocol = protocol1;
        handler = handler1;
        log = logger;
        name = s;
        streamsMap = new HashMap();
    }

    protected void connect(Conversation conversation)
    {
        log.info("Connecting");
        String s = getParticipantId(conversation);
        if (s != null && !streamsMap.containsKey(s))
        {
            if (createChannel())
            {
                conversation = new Stream(lib, protocol, handler, name, s);
                streamsMap.put(s, conversation);
                String as[] = lib.app2AppGetStreamsList(name, com.skype.SkyLib.APP2APP_STREAMS.ALL_STREAMS).m_streams;
                conversation.connect();
                if (as != null && as.length > 0)
                {
                    processStreams(as, com.skype.SkyLib.APP2APP_STREAMS.ALL_STREAMS);
                }
            }
            return;
        } else
        {
            log.info("channel already exist");
            return;
        }
    }

    protected boolean createChannel()
    {
        if (!created)
        {
            created = lib.app2AppCreate(name);
            if (!created)
            {
                log.info("can't create app2app channel!");
            }
            return created;
        } else
        {
            return true;
        }
    }

    protected void disconnect(Conversation conversation)
    {
        conversation = getParticipantId(conversation);
        if (conversation != null)
        {
            Stream stream = (Stream)streamsMap.get(conversation);
            if (stream != null)
            {
                stream.disconnect();
                streamsMap.remove(conversation);
                if (streamsMap.isEmpty())
                {
                    if (lib.app2AppDelete(getName()))
                    {
                        log.info((new StringBuilder("App2AppChannel ")).append(getName()).append(" was deleted as there is no streams left").toString());
                    } else
                    {
                        log.info((new StringBuilder("Can't delete channel: ")).append(getName()).toString());
                    }
                    created = false;
                }
                return;
            } else
            {
                log.info((new StringBuilder("Disconnect: channel not exist for: ")).append(conversation).toString());
                return;
            }
        } else
        {
            log.info("Disconnect: can't find other party");
            return;
        }
    }

    final String getName()
    {
        return name;
    }

    protected String getParticipantId(Conversation conversation)
    {
        com.skype.Conversation.TYPE type = conversation.getTypeProp();
        if (com.skype.Conversation.TYPE.DIALOG == type)
        {
            return conversation.getIdentityProp();
        } else
        {
            log.info("App2App is supported for dialogs only");
            return null;
        }
    }

    protected Protocol getProtocol()
    {
        return protocol;
    }

    protected Stream getStreamByPartnerId(String s)
    {
        return (Stream)streamsMap.get(s);
    }

    protected abstract void handleDatagram(com.skype.android.gen.SkyLibListener.OnApp2AppDatagram onapp2appdatagram);

    protected abstract void handleStreamListChangeEvent(com.skype.android.gen.SkyLibListener.OnApp2AppStreamListChange onapp2appstreamlistchange);

    protected abstract void processStreams(String as[], com.skype.SkyLib.APP2APP_STREAMS app2app_streams);
}
