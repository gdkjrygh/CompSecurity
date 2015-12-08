// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import kik.android.util.cq;
import kik.android.util.cy;

// Referenced classes of package kik.android.chat.fragment:
//            bg, bf, KikAddToBlockFragment

final class bi
    implements Runnable
{

    final Throwable a;
    final bg b;

    bi(bg bg1, Throwable throwable)
    {
        b = bg1;
        a = throwable;
        super();
    }

    public final void run()
    {
        b.a.b.a(cq.a(), cy.a(a));
    }
}
