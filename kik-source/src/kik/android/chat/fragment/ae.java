// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package kik.android.chat.fragment:
//            ConversationsBaseFragment

final class ae extends Handler
{

    final ConversationsBaseFragment a;
    private final int b = 6;
    private final int c = 7;
    private final int d = 2000;

    ae(ConversationsBaseFragment conversationsbasefragment)
    {
        a = conversationsbasefragment;
        super();
    }

    public final void handleMessage(Message message)
    {
        super.handleMessage(message);
        message.what;
        JVM INSTR tableswitch 2 7: default 48
    //                   2 49
    //                   3 75
    //                   4 104
    //                   5 135
    //                   6 155
    //                   7 146;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L5:
        break MISSING_BLOCK_LABEL_135;
_L7:
        break MISSING_BLOCK_LABEL_146;
_L1:
        break; /* Loop/switch isn't completed */
_L6:
        break MISSING_BLOCK_LABEL_155;
_L8:
        return;
_L2:
        if (!hasMessages(6))
        {
            removeMessages(7);
            sendEmptyMessageDelayed(6, 2000L);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (!hasMessages(7) && !hasMessages(6))
        {
            sendEmptyMessageDelayed(7, 2000L);
            return;
        }
        if (true) goto _L8; else goto _L4
_L4:
        removeMessages(6);
        removeMessages(7);
        removeMessages(4);
        removeMessages(5);
        a.b(true);
        return;
        removeMessages(7);
        removeMessages(5);
        a.b(false);
        return;
        a.b(true);
        return;
    }
}
