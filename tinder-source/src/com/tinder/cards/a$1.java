// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.cards;

import com.facebook.a.d;
import com.facebook.a.e;

// Referenced classes of package com.tinder.cards:
//            a

final class t> extends d
{

    final a a;

    public final void onSpringUpdate(e e)
    {
        a.access$002(a, Math.min(1.0F, Math.abs(a.getTranslationX()) / a.getSwipeThreshold()));
        a.access$102(a, Math.min(1.0F, Math.abs(a.getTranslationY()) / a.getTopThreshold()));
        if (a.access$200(a) != null)
        {
            a.access$200(a).a(a, a.access$000(a), a.access$100(a), a.getTranslationX(), a.getTranslationY(), true);
        }
    }

    (a a1)
    {
        a = a1;
        super();
    }
}
