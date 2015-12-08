// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.os.Handler;
import android.os.Message;
import kik.a.d.k;
import kik.a.e.r;
import kik.android.widget.ResizeEventList;

// Referenced classes of package kik.android.chat.fragment:
//            KikChatFragment

final class em extends Handler
{

    final KikChatFragment a;

    em(KikChatFragment kikchatfragment)
    {
        a = kikchatfragment;
        super();
    }

    public final void handleMessage(Message message)
    {
        super.handleMessage(message);
        message.what;
        JVM INSTR tableswitch 1 7: default 52
    //                   1 53
    //                   2 61
    //                   3 105
    //                   4 141
    //                   5 154
    //                   6 211
    //                   7 197;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
        return;
_L2:
        KikChatFragment.i(a);
        return;
_L3:
        message = (String[])message.obj;
        if (message.length == 2 && KikChatFragment.j(a).b().equals(message[0]))
        {
            KikChatFragment.b(a, message[1]);
            return;
        }
          goto _L1
_L4:
        KikChatFragment.a(a, a.j.a((String)message.obj, true));
        kik.android.chat.fragment.KikChatFragment.k(a);
        return;
_L5:
        removeMessages(4);
        KikChatFragment.l(a);
        return;
_L6:
        removeMessages(5);
        removeMessages(4);
        KikChatFragment.l(a);
        KikChatFragment.m(a).setSelectionFromTop(KikChatFragment.m(a).getCount() - 1, -500);
        return;
_L8:
        removeMessages(7);
_L9:
        KikChatFragment.n(a);
        return;
_L7:
        if (hasMessages(7)) goto _L1; else goto _L9
    }
}
