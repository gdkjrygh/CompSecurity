// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.app2app;

import android.os.Handler;
import com.skype.Conversation;
import com.skype.SkyLib;
import com.skype.android.app.app2app.translator.TranslatorChannel;
import com.skype.android.event.EventBus;
import com.skype.android.inject.AccountProvider;
import com.skype.android.inject.EventSubscriberBinder;
import com.skype.android.inject.EventThread;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.app.app2app:
//            ChannelKey, App2AppChannel

public class App2AppManager
{

    private static final Logger log = Logger.getLogger("Translator");
    private final Map channelMap = new HashMap();
    private Handler handler;

    public App2AppManager(SkyLib skylib, AccountProvider accountprovider, EventBus eventbus)
    {
        handler = new Handler(EventThread.BACKGROUND.getLooper());
        channelMap.put(ChannelKey.TRANSLATOR, new TranslatorChannel(skylib, accountprovider, handler));
        (new EventSubscriberBinder(eventbus, this)).bind();
    }

    private App2AppChannel getChannelByName(String s)
    {
        Object obj = null;
        ChannelKey channelkey = ChannelKey.getChannelByName(s);
        s = obj;
        if (channelkey != null)
        {
            s = (App2AppChannel)channelMap.get(channelkey);
        }
        return s;
    }

    public void connect(ChannelKey channelkey, Conversation conversation)
    {
        if (channelMap.containsKey(channelkey))
        {
            ((App2AppChannel)channelMap.get(channelkey)).connect(conversation);
        }
    }

    public void disconnect(ChannelKey channelkey, Conversation conversation)
    {
        if (channelMap.containsKey(channelkey))
        {
            ((App2AppChannel)channelMap.get(channelkey)).disconnect(conversation);
        }
    }

    public TranslatorChannel getTranslatorChannel()
    {
        return (TranslatorChannel)channelMap.get(ChannelKey.TRANSLATOR);
    }

    void onEvent(com.skype.android.gen.SkyLibListener.OnApp2AppDatagram onapp2appdatagram)
    {
        log.info((new StringBuilder("Appname: ")).append(onapp2appdatagram.getAppname()).append("Stream: ").append(onapp2appdatagram.getStream()).toString());
        App2AppChannel app2appchannel = getChannelByName(onapp2appdatagram.getAppname());
        if (app2appchannel != null)
        {
            app2appchannel.handleDatagram(onapp2appdatagram);
        }
    }

    void onEvent(com.skype.android.gen.SkyLibListener.OnApp2AppStreamListChange onapp2appstreamlistchange)
    {
        App2AppChannel app2appchannel = getChannelByName(onapp2appstreamlistchange.getAppname());
        if (app2appchannel != null)
        {
            app2appchannel.handleStreamListChangeEvent(onapp2appstreamlistchange);
        }
    }

}
