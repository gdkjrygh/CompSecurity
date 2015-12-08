// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.app2app.translator;

import android.os.Handler;
import com.skype.Account;
import com.skype.Conversation;
import com.skype.SkyLib;
import com.skype.android.app.app2app.App2AppChannel;
import com.skype.android.app.app2app.Protocol;
import com.skype.android.app.app2app.Stream;
import com.skype.android.event.EventBus;
import com.skype.android.event.EventBusInstance;
import com.skype.android.inject.AccountProvider;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.app.app2app.translator:
//            a, TranscribedMessage, OnTranscribedMessage

public class TranslatorChannel extends App2AppChannel
{

    public static final String CHANNEL_NAME = "Translator";
    public static final String LOG_NAME = "Translator";
    private static final Logger log = Logger.getLogger("Translator");
    private AccountProvider accountProvider;

    public TranslatorChannel(SkyLib skylib, AccountProvider accountprovider, Handler handler)
    {
        super(skylib, handler, new a(), log, "Translator");
        accountProvider = accountprovider;
    }

    private String getSkypeIdFromStreamName(String s)
    {
        s = s.split(":");
        if (s != null && s.length > 0)
        {
            return s[0];
        } else
        {
            return null;
        }
    }

    public volatile Protocol getProtocol()
    {
        return getProtocol();
    }

    public a getProtocol()
    {
        return (a)super.getProtocol();
    }

    public void handleDatagram(com.skype.android.gen.SkyLibListener.OnApp2AppDatagram onapp2appdatagram)
    {
        onapp2appdatagram = onapp2appdatagram.getData();
        if (getProtocol().isPingPacket(onapp2appdatagram))
        {
            log.info("Ping packet received");
        } else
        {
            onapp2appdatagram = getProtocol().unpackPacket(onapp2appdatagram);
            if (onapp2appdatagram.isValid())
            {
                onapp2appdatagram = new OnTranscribedMessage(onapp2appdatagram);
                EventBusInstance.a().a(onapp2appdatagram);
                return;
            }
        }
    }

    public void handleStreamListChangeEvent(com.skype.android.gen.SkyLibListener.OnApp2AppStreamListChange onapp2appstreamlistchange)
    {
        processStreams(onapp2appstreamlistchange.getStreams(), onapp2appstreamlistchange.getListType());
        log.info((new StringBuilder("App2AppStreamListChange ")).append(onapp2appstreamlistchange.getAppname()).toString());
        log.info(onapp2appstreamlistchange.getListType().toString());
        StringBuilder stringbuilder = new StringBuilder("Streams: ");
        onapp2appstreamlistchange = onapp2appstreamlistchange.getStreams();
        int j = onapp2appstreamlistchange.length;
        for (int i = 0; i < j; i++)
        {
            stringbuilder.append(onapp2appstreamlistchange[i]).append(", ");
        }

        log.info(stringbuilder.toString());
    }

    protected void processStreams(String as[], com.skype.SkyLib.APP2APP_STREAMS app2app_streams)
    {
        int j = as.length;
        if (com.skype.SkyLib.APP2APP_STREAMS.ALL_STREAMS == app2app_streams)
        {
            int i = 0;
            while (i < j) 
            {
                app2app_streams = getSkypeIdFromStreamName(as[i]);
                if (app2app_streams != null)
                {
                    Stream stream = getStreamByPartnerId(app2app_streams);
                    if (stream != null)
                    {
                        stream.setName(as[i]);
                        if (!stream.isConnected())
                        {
                            stream.connect();
                        }
                    } else
                    {
                        log.info((new StringBuilder("There is no stream: ")).append(app2app_streams).toString());
                    }
                } else
                {
                    log.info("partnerId is null");
                }
                i++;
            }
        }
    }

    public void sendMessage(Conversation conversation, int i, String s, com.skype.Translator.TRANSLATOR_RECO_TYPE translator_reco_type)
    {
        String s1 = getParticipantId(conversation);
        conversation = getStreamByPartnerId(s1);
        if (conversation != null)
        {
            s1 = accountProvider.get().getSkypenameProp();
            if (!conversation.sendApp2AppData(getProtocol().packPacket(i, s1, s, translator_reco_type)))
            {
                log.info("Can't send packet");
                return;
            } else
            {
                log.info((new StringBuilder("Message with type: ")).append(translator_reco_type).append(" has been sent: ").append(s).toString());
                return;
            }
        } else
        {
            log.info((new StringBuilder("Can't find out stream for: ")).append(s1).toString());
            return;
        }
    }

}
