// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class nwh extends nzc
{

    public final List a;
    public boolean b;
    private final String c;
    private Map d;

    public nwh(Context context, int i, String s)
    {
        this(context, i, s, null);
    }

    public nwh(Context context, int i, String s, List list)
    {
        this(context, i, s, list, false);
    }

    private nwh(Context context, int i, String s, List list, boolean flag)
    {
        this(context, i, s, list, false, false);
    }

    private nwh(Context context, int i, String s, List list, boolean flag, boolean flag1)
    {
        super(context, new nyg(((mmv)olm.a(context, mmv)).a(i).b("account_name"), null, null, flag, null), "checkphotosexistence", new pal(), new pam());
        a = new ArrayList();
        d = new HashMap();
        c = s;
        if (list != null)
        {
            for (context = list.iterator(); context.hasNext(); a.add(list))
            {
                s = (String)context.next();
                list = new pll();
                list.a = s;
                list.b = null;
                list.c = null;
            }

        }
    }

    protected final void a(qlw qlw)
    {
        qlw = (pal)qlw;
        qlw.a = new plk();
        qlw = ((pal) (qlw)).a;
        qlw.d = Boolean.valueOf(true);
        qlw.a = c;
        qlw.b = (pll[])a.toArray(new pll[a.size()]);
        qlw.c = Boolean.valueOf(b);
    }

    public final boolean a(String s)
    {
        return d.containsKey(s);
    }

    public final long b(String s)
    {
        return ((Long)d.get(s)).longValue();
    }

    protected final void b(qlw qlw)
    {
        qlw = ((pam)qlw).a;
        if (((plx) (qlw)).a != null && ((plx) (qlw)).a.length != 0)
        {
            if (((plx) (qlw)).a.length != a.size())
            {
                throw new IllegalArgumentException("returned array length doesn't match input");
            }
            Iterator iterator = a.iterator();
            int i = 0;
            while (iterator.hasNext()) 
            {
                pll pll1 = (pll)iterator.next();
                String s = ((plx) (qlw)).a[i];
                if (s != null)
                {
                    try
                    {
                        d.put(pll1.a, Long.valueOf(s));
                    }
                    catch (NumberFormatException numberformatexception) { }
                }
                i++;
            }
        }
    }
}
