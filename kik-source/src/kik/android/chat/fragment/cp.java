// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import kik.a.d.a.a;
import kik.a.e.g;

// Referenced classes of package kik.android.chat.fragment:
//            KikChatFragment

final class cp
    implements g
{

    final int a;
    final KikChatFragment b;

    cp(KikChatFragment kikchatfragment, int i)
    {
        b = kikchatfragment;
        a = i;
        super();
    }

    public final void a(a a1)
    {
        if (a == KikChatFragment.N(b) && a1 != null)
        {
            KikChatFragment.b(b, a1);
            KikChatFragment.c(b, "Attached");
            KikChatFragment.O(b);
        }
    }
}
