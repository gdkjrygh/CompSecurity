// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.b;

import android.os.Bundle;
import com.kik.cards.web.CardsWebViewFragment;
import com.kik.g.p;
import com.kik.g.r;
import java.util.List;
import kik.a.d.k;
import kik.android.chat.fragment.KikCardBrowserFragment;

// Referenced classes of package kik.android.b:
//            k

final class l extends r
{

    final p a;
    final List b;
    final KikCardBrowserFragment c;
    final kik.android.b.k d;

    l(kik.android.b.k k1, p p1, List list, KikCardBrowserFragment kikcardbrowserfragment)
    {
        d = k1;
        a = p1;
        b = list;
        c = kikcardbrowserfragment;
        super();
    }

    public final void a()
    {
        super.a();
        if (c != null)
        {
            c.Q();
        }
    }

    public final void a(Object obj)
    {
        obj = (k)obj;
        super.a(obj);
        a.a(new Bundle());
        k.a(d, ((k) (obj)), b, k.a(d).w());
    }

    public final void a(Throwable throwable)
    {
        super.a(throwable);
        a.a(throwable);
    }
}
