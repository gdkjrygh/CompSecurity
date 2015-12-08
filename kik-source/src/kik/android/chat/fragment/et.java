// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import com.kik.view.adapters.au;
import kik.android.chat.al;

// Referenced classes of package kik.android.chat.fragment:
//            KikChatFragment

final class et
    implements al
{

    final KikChatFragment a;

    et(KikChatFragment kikchatfragment)
    {
        a = kikchatfragment;
        super();
    }

    public final void a(int i)
    {
        KikChatFragment.ar(a).b(i - 1);
    }

    public final void b(int i)
    {
        KikChatFragment.ar(a).a(i - 1);
    }
}
