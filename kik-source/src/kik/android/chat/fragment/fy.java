// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import kik.android.widget.ResizeEventList;

// Referenced classes of package kik.android.chat.fragment:
//            fx, KikChatFragment

final class fy
    implements Runnable
{

    final fx a;

    fy(fx fx1)
    {
        a = fx1;
        super();
    }

    public final void run()
    {
        KikChatFragment.m(a.b).smoothScrollToPosition(KikChatFragment.m(a.b).getCount());
    }
}
