// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web;

import android.os.Bundle;
import com.kik.g.p;
import com.kik.g.r;

// Referenced classes of package com.kik.cards.web:
//            CardsWebViewFragment

final class v extends r
{

    final p a;
    final CardsWebViewFragment b;

    v(CardsWebViewFragment cardswebviewfragment, p p1)
    {
        b = cardswebviewfragment;
        a = p1;
        super();
    }

    public final void a()
    {
        super.a();
        b.J();
    }

    public final volatile void a(Object obj)
    {
        obj = (Bundle)obj;
        super.a(obj);
        a.a(obj);
    }

    public final void a(Throwable throwable)
    {
        super.a(throwable);
        a.e();
    }
}
