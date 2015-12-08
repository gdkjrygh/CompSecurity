// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class hkm
    implements ds
{

    private static final int b;
    public boolean a;
    private final hhn c;
    private final String d;
    private final String e;
    private final int f;
    private final List g;
    private final noz h;

    public hkm(Context context, int i, String s, String s1, List list)
    {
        boolean flag1 = true;
        super();
        boolean flag;
        if (i != -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag);
        if (!TextUtils.isEmpty(s))
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        p.a(flag);
        h = noz.a(context, "AddMediaToEnvelope", new String[0]);
        f = i;
        e = s;
        d = s1;
        g = list;
        c = (hhn)olm.a(context, hhn);
    }

    public final void a(hpr hpr)
    {
        a = false;
        if (h.a())
        {
            noy.a("mediaKey", e);
            noy.a("mediaList", g);
        }
    }

    public final void a(qlw qlw)
    {
        a = true;
    }

    public final qlr f()
    {
        return qqz.a;
    }

    public final int g()
    {
        return b;
    }

    public final qlr g_()
    {
        return qqy.a;
    }

    public final String k_()
    {
        return "AddMediaToEnvelope";
    }

    public final qlw l_()
    {
        qqy qqy1 = new qqy();
        qqy1.d = d;
        qqy1.b = new qbx();
        qqy1.b.a = e;
        qqy1.c = new qdn();
        qqy1.c.a = 2;
        qdn qdn1 = qqy1.c;
        List list = g;
        ArrayList arraylist = new ArrayList(list.size());
        qeg qeg1;
        for (Iterator iterator = list.iterator(); iterator.hasNext(); arraylist.add(qeg1))
        {
            ekp ekp1 = (ekp)iterator.next();
            qeg1 = new qeg();
            qeg1.a = c.a(f, ekp1);
        }

        qdn1.c = (qeg[])arraylist.toArray(new qeg[list.size()]);
        return qqy1;
    }

    static 
    {
        b = qmb.b(qqz.a.b);
    }
}
