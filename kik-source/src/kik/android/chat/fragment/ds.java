// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import java.util.List;

// Referenced classes of package kik.android.chat.fragment:
//            KikChatFragment

final class ds
    implements Runnable
{

    final List a;
    final KikChatFragment b;

    ds(KikChatFragment kikchatfragment, List list)
    {
        b = kikchatfragment;
        a = list;
        super();
    }

    public final void run()
    {
        KikChatFragment.a(b, a);
    }
}
