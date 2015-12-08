// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web;

import android.widget.Toast;
import com.kik.cards.web.kik.KikMessageParcelable;
import com.kik.g.p;
import com.kik.g.r;
import kik.android.f.a.ae;
import kik.android.f.a.f;

// Referenced classes of package com.kik.cards.web:
//            g, f, CardsWebViewFragment, i

final class h extends r
{

    final g a;

    h(g g1)
    {
        a = g1;
        super();
    }

    public final void a(Object obj)
    {
        obj = (av.a)obj;
        obj = new KikMessageParcelable(((av.a) (obj)).a(), ((av.a) (obj)).b(), ((av.a) (obj)).c(), ((av.a) (obj)).g(), null, null, ((av.a) (obj)).d(), ((av.a) (obj)).f(), ((av.a) (obj)).e(), ((av.a) (obj)).g(), "true", null, null, null, null, null, null, null, null);
        if (a.a.a.r != null && "https://kik.com/".equals(CardsWebViewFragment.o(a.a.a)))
        {
            ae.a(a.a.a.getActivity(), ((KikMessageParcelable) (obj)), a.a.a.p).a(new i(this));
            return;
        } else
        {
            f.a().a(((KikMessageParcelable) (obj)), a.a.a, a.a.a.w(), a.a.a.g);
            return;
        }
    }

    public final void a(Throwable throwable)
    {
        Toast.makeText(a.a.a.getActivity(), 0x7f090266, 0).show();
    }
}
