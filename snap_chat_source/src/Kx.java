// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;

public final class Kx
    implements Kq
{

    public final ConcurrentHashMap mMessageCallbacksPendingAcks = new ConcurrentHashMap(16, 0.75F, 2);
    public final ConcurrentHashMap mMessageCallbacksPendingWrite = new ConcurrentHashMap(16, 0.75F, 2);
    public final ScheduledExecutorService mScheduledExecutorService;
    public final long mTimeoutInMillis = 20000L;

    public Kx(ScheduledExecutorService scheduledexecutorservice)
    {
        mScheduledExecutorService = scheduledexecutorservice;
    }

    public final void a(RO ro)
    {
        com.snapchat.android.util.chat.SecureChatService.SecureChatWriteCompletedCallback securechatwritecompletedcallback;
label0:
        {
            if (ro.k() == RO.a.CONVERSATION_MESSAGE_RESPONSE)
            {
                ro = (Qz)ro;
                securechatwritecompletedcallback = (com.snapchat.android.util.chat.SecureChatService.SecureChatWriteCompletedCallback)mMessageCallbacksPendingAcks.remove(ro.b());
                if (securechatwritecompletedcallback != null)
                {
                    if (!IJ.a(ro.a()))
                    {
                        break label0;
                    }
                    securechatwritecompletedcallback.a(true, com.snapchat.android.util.chat.SecureChatService.SecureChatWriteCompletedCallback.Status.SUCCESS, null);
                }
            }
            return;
        }
        securechatwritecompletedcallback.a(false, com.snapchat.android.util.chat.SecureChatService.SecureChatWriteCompletedCallback.Status.SCCP_NACK, ro.d());
    }

    public final void a(String s, com.snapchat.android.util.chat.SecureChatService.SecureChatWriteCompletedCallback.Status status, String s1)
    {
        com.snapchat.android.util.chat.SecureChatService.SecureChatWriteCompletedCallback securechatwritecompletedcallback = (com.snapchat.android.util.chat.SecureChatService.SecureChatWriteCompletedCallback)mMessageCallbacksPendingWrite.remove(s);
        if (securechatwritecompletedcallback != null)
        {
            securechatwritecompletedcallback.a(false, status, s1);
        }
        s = (com.snapchat.android.util.chat.SecureChatService.SecureChatWriteCompletedCallback)mMessageCallbacksPendingAcks.remove(s);
        if (s != null)
        {
            s.a(false, status, s1);
        }
    }

    // Unreferenced inner class Kx$1

/* anonymous class */
    public final class _cls1
        implements Runnable
    {

        final Kx this$0;
        final String val$messageId;

        public final void run()
        {
            Object obj = Kx.this;
            String s = messageId;
            obj = (com.snapchat.android.util.chat.SecureChatService.SecureChatWriteCompletedCallback)((Kx) (obj)).mMessageCallbacksPendingAcks.remove(s);
            if (obj != null)
            {
                ((com.snapchat.android.util.chat.SecureChatService.SecureChatWriteCompletedCallback) (obj)).a(false, com.snapchat.android.util.chat.SecureChatService.SecureChatWriteCompletedCallback.Status.SCCP_TIMEOUT_ERROR, "Message timed out");
            }
        }

            public 
            {
                this$0 = Kx.this;
                messageId = s;
                super();
            }
    }

}
