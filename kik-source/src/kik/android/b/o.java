// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.b;

import com.kik.cards.web.CardsWebViewFragment;
import com.kik.g.p;
import com.kik.g.r;
import kik.android.chat.activity.k;

// Referenced classes of package kik.android.b:
//            n, m, p

final class o extends r
{

    final n a;

    o(n n1)
    {
        a = n1;
        super();
    }

    public final void a(Object obj)
    {
        obj = (com.kik.cards.web.av.a)obj;
        super.a(obj);
        kik.android.chat.fragment.KikPermissionsFragment.a a1 = new kik.android.chat.fragment.KikPermissionsFragment.a();
        a1.c(a.b);
        if (obj != null)
        {
            a1.b(((com.kik.cards.web.av.a) (obj)).f());
            a1.a(((com.kik.cards.web.av.a) (obj)).g());
            a1.d(((com.kik.cards.web.av.a) (obj)).h());
            a1.e(((com.kik.cards.web.av.a) (obj)).i());
        }
        k.a(a1, m.b(a.c).getActivity()).f().a(new kik.android.b.p(this));
    }

    public final void a(Throwable throwable)
    {
        super.a(throwable);
        a.a.a(throwable);
    }
}
