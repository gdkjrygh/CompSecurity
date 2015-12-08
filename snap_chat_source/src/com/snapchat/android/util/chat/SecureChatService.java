// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.util.chat;

import BC;
import By;
import Ck;
import Cl;
import KA;
import Kp;
import Kq;
import Ks;
import Ky;
import Mf;
import Nv;
import PG;
import Qm;
import RO;
import Rl;
import android.app.Service;
import android.content.Intent;
import android.net.NetworkInfo;
import android.os.Binder;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.SystemClock;
import com.snapchat.android.Timber;
import com.snapchat.android.database.table.ChatsReceivedInLastHourTable;
import com.snapchat.android.model.chat.ChatConversation;
import com.snapchat.android.model.chat.ChatFeedItem;
import com.squareup.otto.Bus;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import sA;
import sD;
import sq;

// Referenced classes of package com.snapchat.android.util.chat:
//            SecureChatSession

public class SecureChatService extends Service
    implements Ck, Kp, Kq
{
    public static interface SecureChatWriteCompletedCallback
    {

        public abstract void a(boolean flag, Status status, String s);
    }

    public static final class SecureChatWriteCompletedCallback.Status extends Enum
    {

        private static final SecureChatWriteCompletedCallback.Status $VALUES[];
        public static final SecureChatWriteCompletedCallback.Status NOT_FRIENDS;
        public static final SecureChatWriteCompletedCallback.Status NO_CONNECTION;
        public static final SecureChatWriteCompletedCallback.Status SCCP_CONNECTION_ENDED;
        public static final SecureChatWriteCompletedCallback.Status SCCP_ERROR;
        public static final SecureChatWriteCompletedCallback.Status SCCP_MESSAGE_QUEUE_FULL;
        public static final SecureChatWriteCompletedCallback.Status SCCP_NACK;
        public static final SecureChatWriteCompletedCallback.Status SCCP_TIMEOUT_ERROR;
        public static final SecureChatWriteCompletedCallback.Status SUCCESS;

        public static SecureChatWriteCompletedCallback.Status valueOf(String s)
        {
            return (SecureChatWriteCompletedCallback.Status)Enum.valueOf(com/snapchat/android/util/chat/SecureChatService$SecureChatWriteCompletedCallback$Status, s);
        }

        public static SecureChatWriteCompletedCallback.Status[] values()
        {
            return (SecureChatWriteCompletedCallback.Status[])$VALUES.clone();
        }

        static 
        {
            SUCCESS = new SecureChatWriteCompletedCallback.Status("SUCCESS", 0);
            NO_CONNECTION = new SecureChatWriteCompletedCallback.Status("NO_CONNECTION", 1);
            NOT_FRIENDS = new SecureChatWriteCompletedCallback.Status("NOT_FRIENDS", 2);
            SCCP_ERROR = new SecureChatWriteCompletedCallback.Status("SCCP_ERROR", 3);
            SCCP_CONNECTION_ENDED = new SecureChatWriteCompletedCallback.Status("SCCP_CONNECTION_ENDED", 4);
            SCCP_TIMEOUT_ERROR = new SecureChatWriteCompletedCallback.Status("SCCP_TIMEOUT_ERROR", 5);
            SCCP_NACK = new SecureChatWriteCompletedCallback.Status("SCCP_NACK", 6);
            SCCP_MESSAGE_QUEUE_FULL = new SecureChatWriteCompletedCallback.Status("SCCP_MESSAGE_QUEUE_FULL", 7);
            $VALUES = (new SecureChatWriteCompletedCallback.Status[] {
                SUCCESS, NO_CONNECTION, NOT_FRIENDS, SCCP_ERROR, SCCP_CONNECTION_ENDED, SCCP_TIMEOUT_ERROR, SCCP_NACK, SCCP_MESSAGE_QUEUE_FULL
            });
        }

        private SecureChatWriteCompletedCallback.Status(String s, int i)
        {
            super(s, i);
        }
    }

    public final class a extends Binder
    {

        public final SecureChatService this$0;

        public a()
        {
            this$0 = SecureChatService.this;
            super();
        }
    }


    public static final long MILLIS_TO_KEEP_OPEN_IF_APP_CLOSED_DURING_SENDING = 5000L;
    private static final String TAG = "SecureChatService";
    private final IBinder mBinder;
    private final sq mChatConnectionMonitor;
    private final By mChatConversationManager;
    private final ChatsReceivedInLastHourTable mChatsReceivedInLastHourTable;
    public boolean mIsAppInForeground;
    public final Handler mMainHandler;
    private final Cl mNetworkStatusManager;
    private final sA mReceivingMailman;
    public SecureChatSession mSecureChatSession;
    private final sD mSendingMailman;

    public SecureChatService()
    {
        this(Cl.a(), new Handler(Looper.getMainLooper()), By.c(), sD.a(), sA.a(), sq.b(), ChatsReceivedInLastHourTable.a());
    }

    SecureChatService(Cl cl, Handler handler, By by, sD sd, sA sa, sq sq1, ChatsReceivedInLastHourTable chatsreceivedinlasthourtable)
    {
        mBinder = new a();
        mIsAppInForeground = true;
        mNetworkStatusManager = cl;
        mMainHandler = handler;
        mChatConversationManager = by;
        mSendingMailman = sd;
        mReceivingMailman = sa;
        mChatConnectionMonitor = sq1;
        mChatsReceivedInLastHourTable = chatsreceivedinlasthourtable;
    }

    static boolean a(SecureChatService securechatservice)
    {
        return securechatservice.mIsAppInForeground;
    }

    static sA b(SecureChatService securechatservice)
    {
        return securechatservice.mReceivingMailman;
    }

    public final void a()
    {
        Timber.f("SecureChatService", "CHAT-LOG: SecureChatService START SESSION", new Object[0]);
        mSecureChatSession.b();
    }

    public final void a(final RO message)
    {
        if (message.k() == RO.a.CHAT_MESSAGE)
        {
            android.content.Context context = getApplicationContext();
            Qm qm = (Qm)message;
            ChatsReceivedInLastHourTable.a(context, qm.c(), qm.g().longValue(), Ks.b(qm.h().c()));
        }
        mMainHandler.post(new Runnable() {

            final SecureChatService this$0;
            final RO val$message;

            public final void run()
            {
                SecureChatService.b(SecureChatService.this).a(message);
            }

            
            {
                this$0 = SecureChatService.this;
                message = ro;
                super();
            }
        });
    }

    public final void a(NetworkInfo networkinfo)
    {
        Timber.c("SecureChatService", "CHAT-LOG: SecureChatService onNetworkConnectivityChanged %s", new Object[] {
            networkinfo
        });
        if (networkinfo != null && networkinfo.isConnected() && mIsAppInForeground)
        {
            a();
        }
    }

    public final void a(SecureChatSession.ConnectionState connectionstate)
    {
        if (connectionstate != SecureChatSession.ConnectionState.CONNECTED) goto _L2; else goto _L1
_L1:
        Iterator iterator;
        connectionstate = mSendingMailman;
        iterator = mChatConversationManager.f().iterator();
_L4:
        ChatConversation chatconversation;
        ArrayList arraylist;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        chatconversation = (ChatConversation)iterator.next();
        chatconversation.A();
        arraylist = new ArrayList();
        List list = chatconversation.u();
        list;
        JVM INSTR monitorenter ;
        Iterator iterator4 = list.iterator();
        do
        {
            if (!iterator4.hasNext())
            {
                break;
            }
            ChatFeedItem chatfeeditem = (ChatFeedItem)iterator4.next();
            if ((chatfeeditem instanceof BC) && chatfeeditem.R())
            {
                arraylist.add((BC)chatfeeditem);
            }
        } while (true);
        break MISSING_BLOCK_LABEL_135;
        connectionstate;
        list;
        JVM INSTR monitorexit ;
        throw connectionstate;
        list;
        JVM INSTR monitorexit ;
        Iterator iterator3 = arraylist.iterator();
        while (iterator3.hasNext()) 
        {
            connectionstate.a(chatconversation, (BC)iterator3.next(), true, false);
        }
        if (true) goto _L4; else goto _L3
_L3:
        connectionstate = mChatConnectionMonitor;
        connectionstate.d = true;
        connectionstate.f = ((sq) (connectionstate)).f + 1;
        if (((sq) (connectionstate)).a != null)
        {
            ChatConversation chatconversation1;
            for (Iterator iterator1 = ((sq) (connectionstate)).a.f().iterator(); iterator1.hasNext(); ((sq) (connectionstate)).b.b(chatconversation1))
            {
                chatconversation1 = (ChatConversation)iterator1.next();
                ((sq) (connectionstate)).b.c(chatconversation1);
            }

            connectionstate.a();
        }
_L6:
        return;
_L2:
        sq sq1 = mChatConnectionMonitor;
        sq1.d = false;
        if (sq1.a != null)
        {
            Iterator iterator2 = sq1.a.f().iterator();
            while (iterator2.hasNext()) 
            {
                ChatConversation chatconversation2 = (ChatConversation)iterator2.next();
                boolean flag;
                if (chatconversation2.mNumSCCPChatMessagesSendingOrSent > 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (flag)
                {
                    if (SystemClock.elapsedRealtime() - chatconversation2.mLastSCCPMessageSentTimestamp < 15000L)
                    {
                        Timber.f("ChatConnectionMonitor", "[SCCP] SCCP DISCONNECTED and fetching conversation data from server.", new Object[0]);
                        chatconversation2.mSequenceNumberState = com.snapchat.android.model.chat.ChatConversation.SequenceNumberState.NOT_UPDATED;
                        sq1.b.c(chatconversation2);
                        if (sq1.c.containsKey(chatconversation2.mId))
                        {
                            connectionstate = (Handler)sq1.c.get(chatconversation2.mId);
                        } else
                        {
                            connectionstate = new Handler(Looper.getMainLooper());
                            sq1.c.put(chatconversation2.mId, connectionstate);
                        }
                        connectionstate.removeCallbacksAndMessages(null);
                        connectionstate.postDelayed(new sq._cls2(chatconversation2, connectionstate), 10000L);
                    } else
                    {
                        Timber.f("ChatConnectionMonitor", "[SCCP] SCCP DISCONNECTED but enough time has passed since last SCCP message sent.", new Object[0]);
                        chatconversation2.p();
                    }
                }
                chatconversation2.mHereAuth = null;
                chatconversation2.c(false);
                Mf.a().a(new Nv(com.snapchat.android.livechat.AdlHelper.PresenceSource.CHAT_GATEWAY, chatconversation2.mTheirUsername, false, "SCCP DISCONNECTED"));
            }
            sq1.a();
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public IBinder onBind(Intent intent)
    {
        mMainHandler.removeCallbacks(null);
        return mBinder;
    }

    public void onCreate()
    {
        mNetworkStatusManager.a(this);
        mSecureChatSession = new SecureChatSession(this);
        mSecureChatSession.a(this);
        mSecureChatSession.mInputThread.a(this);
        mMainHandler.removeCallbacks(null);
    }

    public void onDestroy()
    {
        Timber.f("SecureChatService", "CHAT-LOG: SecureChatService stopping session onDestroy", new Object[0]);
        mNetworkStatusManager.b(this);
        SecureChatSession securechatsession = mSecureChatSession;
        Timber.f("SecureChatSession", "CHAT-LOG: SecureChatSession tearDown", new Object[0]);
        securechatsession.c();
        Object obj = securechatsession.mOutputThread;
        ((KA) (obj)).mStopped.set(true);
        ((KA) (obj)).interrupt();
        PG.a(((Thread) (obj)));
        obj = securechatsession.mInputThread;
        ((Ky) (obj)).mStopped.set(true);
        ((Ky) (obj)).interrupt();
        PG.a(((Thread) (obj)));
        securechatsession.mConnectionExecutorService.shutdownNow();
        securechatsession.mScheduledExecutorService.shutdownNow();
        Timber.f("SecureChatSession", "CHAT-LOG: SecureChatSession tornDown successfully.", new Object[0]);
    }

    // Unreferenced inner class com/snapchat/android/util/chat/SecureChatService$1

/* anonymous class */
    public final class _cls1
        implements Runnable
    {

        final SecureChatService this$0;

        public final void run()
        {
            if (!SecureChatService.a(SecureChatService.this))
            {
                stopSelf();
            }
        }

            public 
            {
                this$0 = SecureChatService.this;
                super();
            }
    }

}
