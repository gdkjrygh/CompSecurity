// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package kik.android.chat.fragment:
//            KikChatInfoFragment, ProgressDialogFragment

final class gv extends Handler
{

    final KikChatInfoFragment a;

    gv(KikChatInfoFragment kikchatinfofragment)
    {
        a = kikchatinfofragment;
        super();
    }

    public final void handleMessage(Message message)
    {
        message.what;
        JVM INSTR tableswitch 1 2: default 28
    //                   1 29
    //                   2 80;
           goto _L1 _L2 _L3
_L1:
        return;
_L2:
        if (KikChatInfoFragment.c(a) == null)
        {
            KikChatInfoFragment.a(a, new ProgressDialogFragment(KikChatInfoFragment.b(0x7f09036a), false));
            a.a(KikChatInfoFragment.c(a), KikScopedDialogFragment.a.b, "searchUser");
            return;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (KikChatInfoFragment.c(a) != null)
        {
            if (KikChatInfoFragment.c(a).isAdded())
            {
                KikChatInfoFragment.c(a).dismissAllowingStateLoss();
                KikChatInfoFragment.a(a, null);
                return;
            } else
            {
                sendEmptyMessageDelayed(2, 100L);
                return;
            }
        }
        if (true) goto _L1; else goto _L4
_L4:
    }
}
