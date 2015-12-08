// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.snapchat.android.Timber;
import java.util.Set;

final class lang.Object
    implements Runnable
{

    final KB this$0;
    final String val$pingId;

    public final void run()
    {
        KB kb = KB.this;
        String s = val$pingId;
        if (kb.mPingIds.remove(s))
        {
            Timber.f("SecureChatSessionPinger", (new StringBuilder("CHAT-LOG: PING TIMED OUT! ")).append(s).toString(), new Object[0]);
            kb.mInterface.f();
        }
    }

    >()
    {
        this$0 = final_kb;
        val$pingId = String.this;
        super();
    }
}
