// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web;

import com.kik.g.r;
import kik.android.util.bx;

// Referenced classes of package com.kik.cards.web:
//            p, o, CardsWebViewFragment

final class q extends r
{

    final p a;

    q(p p1)
    {
        a = p1;
        super();
    }

    public final void b(Throwable throwable)
    {
        bx.b(new IllegalArgumentException((new StringBuilder("Invalid history Item on success. target was: ")).append(CardsWebViewFragment.d(a.a.a)).toString()));
    }
}
