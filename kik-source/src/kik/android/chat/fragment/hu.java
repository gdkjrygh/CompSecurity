// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import kik.android.util.cy;

// Referenced classes of package kik.android.chat.fragment:
//            ht, hs, hr, hq, 
//            KikChatInfoFragment

final class hu
    implements Runnable
{

    final Throwable a;
    final ht b;

    hu(ht ht1, Throwable throwable)
    {
        b = ht1;
        a = throwable;
        super();
    }

    public final void run()
    {
        b.a.a.b.a.a(KikChatInfoFragment.b(0x7f0902db), cy.a(a));
    }
}
