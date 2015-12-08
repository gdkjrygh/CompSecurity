// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.widget.Button;
import com.kik.android.a;
import com.kik.g.i;
import com.kik.m.m;
import kik.a.c.c;
import kik.a.d.f;
import kik.a.d.s;

// Referenced classes of package kik.android.chat.fragment:
//            KikChatFragment, cb

final class ca extends i
{

    final KikChatFragment a;

    ca(KikChatFragment kikchatfragment)
    {
        a = kikchatfragment;
        super();
    }

    public final void a(Object obj, Object obj1)
    {
        obj = (s)obj1;
        a.g.c("Chat Closed", KikChatFragment.z(a).b()).a("Messages Received");
        a.g.c("Chat Session Ended", KikChatFragment.z(a).b()).a("Messages Received");
        if (a.I())
        {
            kik.android.chat.fragment.KikChatFragment.s(a);
        }
        if (!KikChatFragment.z(a).b().equals(((s) (obj)).i())) goto _L2; else goto _L1
_L1:
        if (KikChatFragment.B(a)) goto _L4; else goto _L3
_L3:
        a._newMessagesButton.post(new cb(this));
_L2:
        a.x.a(m.a(((s) (obj))));
        KikChatFragment.z(a).v();
        return;
_L4:
        if (KikChatFragment.D(a))
        {
            KikChatFragment.E(a);
        }
        if (true) goto _L2; else goto _L5
_L5:
    }
}
