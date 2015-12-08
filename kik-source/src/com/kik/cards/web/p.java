// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web;

import com.kik.g.r;
import kik.a.i.h;

// Referenced classes of package com.kik.cards.web:
//            o, CardsWebViewFragment, bf, bd, 
//            q, r

final class p extends r
{

    final o a;

    p(o o1)
    {
        a = o1;
        super();
    }

    public final void a(Object obj)
    {
        String s = ((av.a)obj).g();
        obj = s;
        if (s != null)
        {
            obj = bf.a(s, CardsWebViewFragment.d(a.a));
        }
        CardsWebViewFragment.a(a.a, CardsWebViewFragment.b(a.a).getUrl());
        a.a.i.a(CardsWebViewFragment.b(a.a).getUrl(), CardsWebViewFragment.b(a.a).getTitle(), ((String) (obj))).a(new q(this));
    }

    public final void a(Throwable throwable)
    {
        CardsWebViewFragment.a(a.a, CardsWebViewFragment.b(a.a).getUrl());
        a.a.i.a(CardsWebViewFragment.b(a.a).getUrl(), CardsWebViewFragment.b(a.a).getTitle(), null).a(new com.kik.cards.web.r(this));
    }
}
