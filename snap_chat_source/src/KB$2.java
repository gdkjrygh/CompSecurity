// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.snapchat.android.Timber;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

final class lang.Object
    implements com.snapchat.android.util.chat.eChatService.SecureChatWriteCompletedCallback
{

    final KB this$0;
    final RY val$pingMessage;

    public final void a(boolean flag, com.snapchat.android.util.chat.eChatService.SecureChatWriteCompletedCallback.Status status, String s)
    {
        if (flag)
        {
            Timber.f("SecureChatSessionPinger", (new StringBuilder("CHAT-LOG: SUCCEEDED SENDING PING and WAITING for response: ")).append(val$pingMessage.l()).toString(), new Object[0]);
            status = KB.this;
            s = val$pingMessage.l();
            ((KB) (status)).mPingIds.add(s);
            ((KB) (status)).mScheduledExecutorService.schedule(new <init>(status, s), ((KB) (status)).mTimeoutMillis, TimeUnit.MILLISECONDS);
        } else
        {
            Timber.f("SecureChatSessionPinger", (new StringBuilder("CHAT-LOG: FAILED SENDING PING ")).append(val$pingMessage.l()).append("with reason: ").append(s).toString(), new Object[0]);
            if (status == com.snapchat.android.util.chat.eChatService.SecureChatWriteCompletedCallback.Status.SCCP_MESSAGE_QUEUE_FULL)
            {
                mInterface.f();
                return;
            }
        }
    }

    >()
    {
        this$0 = final_kb;
        val$pingMessage = RY.this;
        super();
    }
}
