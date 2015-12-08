// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.f.a;

import android.support.v4.app.Fragment;
import com.kik.g.p;
import com.kik.g.r;
import kik.android.chat.fragment.KikCardBrowserFragment;

// Referenced classes of package kik.android.f.a:
//            j, f

final class i extends r
{

    final p a;
    final KikCardBrowserFragment b;
    final Fragment c;
    final f d;

    i(f f, p p1, KikCardBrowserFragment kikcardbrowserfragment, Fragment fragment)
    {
        d = f;
        a = p1;
        b = kikcardbrowserfragment;
        c = fragment;
        super();
    }

    public final void a(Object obj)
    {
        if (!a.g())
        {
            b.f(c.getString(0x7f090148));
            a.a(new j(this));
        }
    }
}
