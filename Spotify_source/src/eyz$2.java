// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import android.os.Bundle;
import android.widget.ListView;

final class ang.Object
    implements an
{

    private eyz a;

    public final da a(Bundle bundle)
    {
        return new cu(((fzv) (a)).p, eyz.m(a), dnz.a, null, null);
    }

    public final void a()
    {
        eyz.k(a).b(null);
    }

    public final void a(Object obj)
    {
        obj = (Cursor)obj;
        eyz.k(a).b(((Cursor) (obj)));
        if (obj == null || ((Cursor) (obj)).getCount() <= 0) goto _L2; else goto _L1
_L1:
        eyz.a(a, ((Cursor) (obj)));
        if (eyz.l(a) == null) goto _L4; else goto _L3
_L3:
        eyz.n(a).a(eyz.m(a), eyz.l(a), "");
_L2:
        if (eyz.r(a) != -1)
        {
            ((fzu) (a)).n.setSelection(eyz.r(a));
        }
        return;
_L4:
        if (eyz.o(a))
        {
            if (gex.a(eyz.p(a)))
            {
                ggp.a(((fzu) (a)).n, eyz.a(a, 0));
            } else
            {
                obj = eyz.h(a);
                ((ezb) (obj)).e.a().onClick(((ezb) (obj)).b);
            }
            eyz.q(a);
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    (eyz eyz1)
    {
        a = eyz1;
        super();
    }
}
