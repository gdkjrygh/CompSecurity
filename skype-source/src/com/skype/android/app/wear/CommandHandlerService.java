// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.wear;

import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.c;
import com.google.android.gms.wearable.WearableListenerService;
import com.google.android.gms.wearable.d;
import com.google.android.gms.wearable.e;
import com.google.android.gms.wearable.f;
import com.google.android.gms.wearable.k;
import com.google.android.gms.wearable.o;
import com.skype.SkyLib;
import com.skype.android.SkypeApplication;
import com.skype.android.analytics.Analytics;
import com.skype.android.app.BackgroundNavigation;
import com.skype.android.app.chat.MessageHolderUtil;
import com.skype.android.app.transfer.TransferUtil;
import com.skype.android.app.wear.eventhandler.FetchConversationHistoryEventHandler;
import com.skype.android.app.wear.eventhandler.FetchEmoticonStillsEventHandler;
import com.skype.android.app.wear.eventhandler.FetchRecentConversationListEventHandler;
import com.skype.android.app.wear.eventhandler.GetUnreadConversationCountEventHandler;
import com.skype.android.app.wear.eventhandler.OpenHubEventHandler;
import com.skype.android.app.wear.eventhandler.ReplyWithEmoticonEventHandler;
import com.skype.android.concurrent.AsyncService;
import com.skype.android.inject.LoginManager;
import com.skype.android.mediacontent.MediaContentRoster;
import com.skype.android.res.DefaultAvatars;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.util.ConversationUtil;
import com.skype.android.util.ImageCache;
import com.skype.android.util.cache.FormattedMessageCache;
import com.skype.android.wakeup.DreamKeeper;
import java.util.Iterator;

// Referenced classes of package com.skype.android.app.wear:
//            CommandHandlerUriMatcher, DaggerCommandHandlerServiceComponent, EventHandler, CommandHandlerServiceComponent, 
//            RemoteNodeWearModule, WearDataRequestCache

public class CommandHandlerService extends WearableListenerService
{

    private static final String TAG = "CommandHandlerService";
    Analytics analytics;
    AsyncService async;
    private final CommandHandlerUriMatcher commandHandlers = new CommandHandlerUriMatcher();
    private CommandHandlerServiceComponent component;
    ConversationUtil conversationUtil;
    DefaultAvatars defaultAvatars;
    DreamKeeper dreamKeeper;
    private c googleApiClient;
    ImageCache imageCache;
    SkyLib lib;
    LoginManager loginManager;
    ObjectIdMap map;
    MediaContentRoster mediaContentRoster;
    FormattedMessageCache messageCache;
    MessageHolderUtil messageHolderUtil;
    BackgroundNavigation nav;
    TransferUtil transferUtil;
    WearDataRequestCache wearCache;

    public CommandHandlerService()
    {
    }

    private CommandHandlerServiceComponent getComponent()
    {
        if (component == null)
        {
            component = DaggerCommandHandlerServiceComponent.builder().skypeApplicationComponent(((SkypeApplication)getApplicationContext()).a()).build();
        }
        return component;
    }

    private EventHandler getHandler(String s)
    {
        s = commandHandlers.match(s);
        if (s != null)
        {
            return s;
        } else
        {
            return EventHandler.NULL_HANDLER;
        }
    }

    public void onCreate()
    {
        super.onCreate();
        getComponent().inject(this);
        googleApiClient = (new com.google.android.gms.common.api.c.a(this)).a(o.l).b();
        googleApiClient.a(new com.google.android.gms.common.api.c.b() {

            final CommandHandlerService this$0;

            public final void onConnected(Bundle bundle)
            {
                Log.i("CommandHandlerService", "Successfully connect to Google API Client");
            }

            public final void onConnectionSuspended(int i)
            {
                Log.i("CommandHandlerService", "Google API Client connection has been suspended.");
            }

            
            {
                this$0 = CommandHandlerService.this;
                super();
            }
        });
        googleApiClient.a(new com.google.android.gms.common.api.c.c() {

            final CommandHandlerService this$0;

            public final void onConnectionFailed(ConnectionResult connectionresult)
            {
                Log.i("CommandHandlerService", "Unable to connect to Google API Client.");
            }

            
            {
                this$0 = CommandHandlerService.this;
                super();
            }
        });
        googleApiClient.b();
        commandHandlers.addURI(HostDeviceCapabilities.RemoteCommands.GET_UNREAD_COUNT_COMMAND.getCommand(), null, new GetUnreadConversationCountEventHandler(lib, new RemoteNodeWearModule(googleApiClient)));
        commandHandlers.addURI(HostDeviceCapabilities.RemoteCommands.OPEN_HUB_ON_PHONE_COMMAND.getCommand(), null, new OpenHubEventHandler(nav));
        commandHandlers.addURI(HostDeviceCapabilities.RemoteCommands.FETCH_EMOTICON_PACK_COMMAND.getCommand(), null, new FetchEmoticonStillsEventHandler(loginManager, mediaContentRoster, wearCache));
        commandHandlers.addURI(HostDeviceCapabilities.RemoteCommands.SEND_CHAT_EMOTICON_COMMAND.getCommand(), "#/*/#", new ReplyWithEmoticonEventHandler(conversationUtil, dreamKeeper, loginManager, map, analytics));
        commandHandlers.addURI(HostDeviceCapabilities.RemoteCommands.FETCH_RECENT_CONVERSATIONS_COMMAND.getCommand(), null, new FetchRecentConversationListEventHandler(lib, async, imageCache, loginManager, conversationUtil, map, nav.getContext(), messageCache, defaultAvatars));
        commandHandlers.addURI(HostDeviceCapabilities.RemoteCommands.FETCH_CONVERSATION_HISTORY_COMMAND.getCommand(), "#", new FetchConversationHistoryEventHandler(loginManager, map, messageCache, messageHolderUtil, transferUtil, conversationUtil, lib, imageCache, defaultAvatars));
    }

    public void onDataChanged(e e1)
    {
        e1 = e1.iterator();
        do
        {
            if (!e1.hasNext())
            {
                break;
            }
            d d1 = (d)e1.next();
            if (d1.c() == 1)
            {
                f f1 = d1.b();
                getHandler(d1.b().b().getPath()).handle(this, googleApiClient, f1);
            }
        } while (true);
    }

    public void onDestroy()
    {
        super.onDestroy();
        googleApiClient.c();
    }

    public void onMessageReceived(k k1)
    {
        getHandler(k1.a()).handle(this, googleApiClient, k1.a());
    }
}
