// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

public final class ici
    implements dir, hpo
{

    final ico a;
    private final Context b;
    private final int c;

    public ici(Context context, int i, ico ico1)
    {
        b = context.getApplicationContext();
        c = i;
        a = ico1;
    }

    private Map a(boolean flag)
    {
        HashMap hashmap = new HashMap();
        if (a.d != null)
        {
            a(((Map) (hashmap)), icv.f, a.d, flag);
        }
        if (a.e != null)
        {
            a(((Map) (hashmap)), icv.e, a.e, flag);
        }
        if (a.a != null)
        {
            a(((Map) (hashmap)), icv.a, a.a, flag);
        }
        if (a.f != null)
        {
            a(((Map) (hashmap)), icv.c, a.f, flag);
        }
        if (a.c != null)
        {
            a(((Map) (hashmap)), icv.d, a.c, flag);
        }
        if (a.b != null)
        {
            a(((Map) (hashmap)), icv.b, a.b, flag);
        }
        return hashmap;
    }

    private static void a(Map map, icv icv1, icn icn1, boolean flag)
    {
        if (flag)
        {
            icn1 = icn1.a;
        } else
        {
            icn1 = icn1.b;
        }
        map.put(icv1, icn1);
    }

    public final nxx a()
    {
        nwg nwg1 = new nwg(b, c);
        if (a.d != null)
        {
            boolean flag = a.d.a.booleanValue();
            nwg1.c.h = new poa();
            pob pob1 = new pob();
            pob1.a = 1;
            int i;
            if (flag)
            {
                i = 2;
            } else
            {
                i = 3;
            }
            pob1.b = i;
            nwg1.c.h.a = (new pob[] {
                pob1
            });
        }
        if (a.a != null)
        {
            flag = a.a.a.booleanValue();
            nwg1.c.f = Boolean.valueOf(flag);
        }
        if (a.f != null)
        {
            flag = a.f.a.booleanValue();
            nwg1.c.a = Boolean.valueOf(flag);
        }
        if (a.c != null)
        {
            flag = a.c.a.booleanValue();
            nwg1.c.b = new por();
            nwg1.c.b.b = Boolean.valueOf(flag);
        }
        if (a.b != null)
        {
            flag = a.b.a.booleanValue();
            nwg1.c.e = Boolean.valueOf(flag);
        }
        return new nwf(nwg1.a, nwg1.b, nwg1.c);
    }

    public final String ao_()
    {
        return "com.google.android.apps.photos.settings.actions.ChangeSettingsOptimisticAction";
    }

    public final din b()
    {
        Map map = a(true);
        if (a.d != null && a.d.b == null)
        {
            nwc nwc1 = ((idi)olm.a(b, idi)).b(c);
            if (nwc1 != null)
            {
                a.d.b = Boolean.valueOf(nwc1.h);
            } else
            {
                a.d.b = Boolean.valueOf(false);
            }
        }
        ((idi)olm.a(b, idi)).a(map, c);
        return din.a(null);
    }

    public final diq c()
    {
        return diq.a((nwf)((hpp)olm.a(b, hpp)).a(this).a);
    }

    public final boolean d()
    {
        Map map = a(false);
        ((idi)olm.a(b, idi)).a(map, c);
        return true;
    }
}
