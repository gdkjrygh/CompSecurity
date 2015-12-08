// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import com.kik.g.i;
import kik.a.d.j;
import kik.a.d.n;
import kik.a.e.l;

// Referenced classes of package kik.android.chat.fragment:
//            KikCodeFragment

final class iy extends i
{

    final n a;
    final KikCodeFragment b;

    iy(KikCodeFragment kikcodefragment, n n1)
    {
        b = kikcodefragment;
        a = n1;
        super();
    }

    public final void a(Object obj, Object obj1)
    {
        obj = (String)obj1;
        if (((String) (obj)).equals(a.a().a()))
        {
            obj = b.i.a(((String) (obj)), false);
            if (obj != null)
            {
                KikCodeFragment.a(b, ((n) (obj)));
            }
        }
    }
}
