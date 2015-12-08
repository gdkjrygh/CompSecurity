// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.util.Log;
import java.util.List;

public final class epz extends nzc
{

    boolean a;
    boolean b;
    String c;
    qgg d;
    qfz e;
    private final epf r;
    private final List s;
    private final String t;

    public epz(Context context, int i, epf epf1, List list, String s1)
    {
        boolean flag1 = true;
        super(context, new nyg(context, i), "createmediabundle", new pap(), new paq());
        p.b(epf1, "must specify valid bundleType");
        boolean flag;
        if (epf1.a() || epf1.c())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag, "must specify a manual awesome or story type");
        if (!list.isEmpty())
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        p.a(flag, "must specify non-empty mediaList");
        r = epf1;
        s = list;
        t = s1;
    }

    protected final void a(qlw qlw)
    {
        qlw = (pap)qlw;
        qlw.a = new pjh();
        ((pap) (qlw)).a.c = b.i();
        pjh pjh1 = ((pap) (qlw)).a;
        int j = s.size();
        pks pks1 = new pks();
        pks1.a = new pki[j];
        for (int i = 0; i < j; i++)
        {
            String s1 = ((hpg)((ekp)s.get(i)).a(hpg)).b().c;
            pks1.a[i] = new pki();
            pks1.a[i].a = new pkh();
            pks1.a[i].a.a = s1;
        }

        pjh1.a = pks1;
        if (r.c())
        {
            pks1.c = new pym();
            pks1.c.a = r.d;
        } else
        if (r.a())
        {
            pks1.b = new pjg();
            pks1.b.a = new pkr();
            pks1.b.a.a = new pyp();
            pks1.b.a.a.b = r.c;
        } else
        {
            qlw = String.valueOf(r);
            throw new IllegalStateException((new StringBuilder(String.valueOf(qlw).length() + 23)).append("Unexpected bundleType: ").append(qlw).toString());
        }
        ((pap) (qlw)).a.b = new pkc();
        if (t != null)
        {
            ((pap) (qlw)).a.b.a = new pkh();
            ((pap) (qlw)).a.b.a.a = t;
            return;
        } else
        {
            ((pap) (qlw)).a.b.b = 1;
            return;
        }
    }

    protected final void b(qlw qlw)
    {
        qlw = (paq)qlw;
        if (qlw == null || ((paq) (qlw)).a == null || ((paq) (qlw)).a.a == null)
        {
            return;
        }
        if (b.a(((paq) (qlw)).a.a.b, false))
        {
            b = true;
            a = true;
            return;
        }
        if (b.a(((paq) (qlw)).a.a.d, false)) goto _L2; else goto _L1
_L1:
        if (!r.c()) goto _L4; else goto _L3
_L3:
        if (((paq) (qlw)).a.a.c == null) goto _L6; else goto _L5
_L5:
        e = ((paq) (qlw)).a.a.c;
        a = true;
_L2:
        c = ((paq)q).a.a.e;
        return;
_L6:
        if (Log.isLoggable("HttpOperation", 6))
        {
            Log.e("HttpOperation", "Error reading MediaCollection from CreateMediaBundle response.  The collection was null.");
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (r.a())
        {
            if (((paq) (qlw)).a.a.a != null)
            {
                d = ((paq) (qlw)).a.a.a;
                a = true;
            } else
            if (Log.isLoggable("HttpOperation", 6))
            {
                Log.e("HttpOperation", "Error reading MediaItem from CreateMediaBundle response.  The item was null.");
            }
        }
        if (true) goto _L2; else goto _L7
_L7:
    }
}
