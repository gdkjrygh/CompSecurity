// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.List;

final class hgi
    implements hgh
{

    private final Context a;
    private final int b;
    private final String c;
    private final String d;
    private final est e;
    private final noz f;
    private boolean g;

    hgi(Context context, int i, String s, String s1)
    {
        a = context;
        b = i;
        c = s;
        d = s1;
        e = (est)olm.a(context, est);
        f = noz.a(context, 5, "SharedMediaOpAdapter", new String[0]);
    }

    public final hgn a(hgk hgk)
    {
        boolean flag;
        if (hgk == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        g = flag;
        if (g)
        {
            return hgn.a(a, b, c, d);
        } else
        {
            return hgn.a(a, b, c, hgk, d);
        }
    }

    public final void a(long l, List list, List list1, List list2)
    {
        if (list2 == null || list2.isEmpty())
        {
            return;
        } else
        {
            list2 = (qfz)list2.get(0);
            e.a(b, l, list2, list1, list);
            return;
        }
    }
}
