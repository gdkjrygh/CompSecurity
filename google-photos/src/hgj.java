// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.Iterator;
import java.util.List;

final class hgj
    implements hgh
{

    private final Context a;
    private final int b;
    private final String c;
    private final String d;
    private final boolean e;
    private final noz f;

    hgj(Context context, int i, String s, String s1, boolean flag)
    {
        a = context;
        b = i;
        c = s;
        d = s1;
        e = flag;
        f = noz.a(context, 3, "UserMediaOpHandler", new String[0]);
    }

    public final hgn a(hgk hgk)
    {
        if (e && gcp.d.equals(((gdn)olm.a(a, gdn)).b(b)))
        {
            return null;
        }
        if (hgk == null)
        {
            return hgn.a(a, b, c, d);
        } else
        {
            return hgn.a(a, b, c, hgk, d);
        }
    }

    public final void a(long l, List list, List list1, List list2)
    {
        list = new hgm(list);
        String s = ((mmv)olm.a(a, mmv)).a(b).b("gaia_id");
        for (Iterator iterator = list1.iterator(); iterator.hasNext();)
        {
            qfu qfu1 = list.a(((qgg)iterator.next()).c.b);
            if (qfu1 == null)
            {
                throw new ekn("MediaItem owned by unknown user");
            }
            if (!s.equals(qfu1.a.b))
            {
                throw new ekn("MediaItem not owned by current user.");
            }
        }

        for (Iterator iterator1 = list2.iterator(); iterator1.hasNext();)
        {
            qfu qfu2 = list.a(((qfz)iterator1.next()).b.a);
            if (qfu2 == null)
            {
                throw new ekn("MediaCollection owned by unknown user");
            }
            if (!s.equals(qfu2.a.b))
            {
                throw new ekn("MediaCollection not owned by current user.");
            }
        }

        if (!list1.isEmpty())
        {
            qgg aqgg[] = (qgg[])list1.toArray(new qgg[list1.size()]);
            list = list.a(((qgg)list1.get(0)).c.b);
            ((eto)olm.a(a, eto)).a(b, aqgg, new qgi[0], list, true);
        }
        if (!list2.isEmpty())
        {
            list = (qfz[])list2.toArray(new qfz[list2.size()]);
            ((erz)olm.a(a, erz)).a(b, list);
        }
    }
}
