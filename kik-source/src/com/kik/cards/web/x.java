// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web;

import com.kik.cards.web.kik.KikMessageParcelable;
import com.kik.g.p;
import com.kik.g.r;
import kik.android.f.a.ae;

// Referenced classes of package com.kik.cards.web:
//            bf, CardsWebViewFragment, y

final class x extends r
{

    final KikMessageParcelable a;
    final CardsWebViewFragment b;

    x(CardsWebViewFragment cardswebviewfragment, KikMessageParcelable kikmessageparcelable)
    {
        b = cardswebviewfragment;
        a = kikmessageparcelable;
        super();
    }

    public final void a(Object obj)
    {
        obj = (av.a)obj;
        super.a(obj);
        a.i = ((av.a) (obj)).f();
        if (((av.a) (obj)).g() != null)
        {
            a.k = bf.a(((av.a) (obj)).g(), a.j);
        }
        ae.a(b.getActivity(), a, b.p).a(new y(this));
    }

    public final void a(Throwable throwable)
    {
        super.a(throwable);
        b.J();
    }
}
