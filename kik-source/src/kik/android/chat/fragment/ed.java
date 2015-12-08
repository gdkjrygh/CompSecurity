// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import kik.android.widget.ResizeEventList;

// Referenced classes of package kik.android.chat.fragment:
//            ec, KikChatFragment

final class ed
    implements Runnable
{

    final ec a;

    ed(ec ec1)
    {
        a = ec1;
        super();
    }

    public final void run()
    {
        KikChatFragment.m(a.b).smoothScrollToPosition(KikChatFragment.m(a.b).getCount());
    }
}
