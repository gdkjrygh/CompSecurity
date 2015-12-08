// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class hkn extends nzc
{

    public final List a = new ArrayList();
    private final String b;
    private final String c;
    private final List d;

    private hkn(Context context, int i, String s, String s1, List list)
    {
        boolean flag1 = true;
        super(context, (new nyh()).a(context, i).a(), "addreceiveditemstolibrary", new paf(), new pag());
        p.a(context);
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
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag);
        if (!TextUtils.isEmpty(s1))
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        p.a(flag);
        b = s;
        c = s1;
        d = list;
    }

    public static hkn a(Context context, int i, String s, String s1)
    {
        return new hkn(context, i, s, s1, null);
    }

    public static hkn a(Context context, int i, String s, String s1, List list)
    {
        return new hkn(context, i, s, s1, list);
    }

    protected final void a(qlw qlw)
    {
        qlw = (paf)qlw;
        qlw.a = new qjd();
        ((paf) (qlw)).a.b = new qbx();
        ((paf) (qlw)).a.b.a = b;
        ((paf) (qlw)).a.c = c;
        if (d != null && !d.isEmpty())
        {
            ArrayList arraylist = new ArrayList();
            qeo qeo1;
            for (Iterator iterator = d.iterator(); iterator.hasNext(); arraylist.add(qeo1))
            {
                String s = (String)iterator.next();
                qeo1 = new qeo();
                qeo1.a = s;
            }

            ((paf) (qlw)).a.a = (qeo[])arraylist.toArray(new qeo[arraylist.size()]);
        }
    }

    protected final void b(qlw qlw)
    {
        qlw = (pag)qlw;
        if (((pag) (qlw)).a != null && ((pag) (qlw)).a.a != null)
        {
            qlw = ((pag) (qlw)).a.a;
            int j = qlw.length;
            for (int i = 0; i < j; i++)
            {
                Object obj = qlw[i];
                a.add(((qeo) (obj)).a);
            }

        }
    }
}
