// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.crashlytics.android.core.CodedOutputStream;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

final class aml
{

    private static final anm a = new anm("", "", 0L);
    private static final amv b[] = new amv[0];
    private static final amy c[] = new amy[0];
    private static final ams d[] = new ams[0];
    private static final amn e[] = new amn[0];

    private static amw a(anj aanj[])
    {
        amo aamo[] = new amo[aanj.length];
        for (int i = 0; i < aamo.length; i++)
        {
            aamo[i] = new amo(aanj[i]);
        }

        return new amw(aamo);
    }

    private static amw a(ano aano[])
    {
        ams aams[];
        int i;
        if (aano != null)
        {
            aams = new ams[aano.length];
        } else
        {
            aams = d;
        }
        for (i = 0; i < aams.length; i++)
        {
            aams[i] = new ams(aano[i]);
        }

        return new amw(aams);
    }

    public static void a(anl anl1, ami ami1, Map map, CodedOutputStream codedoutputstream)
    {
        Object aobj[];
        Object obj1;
        ann aann[];
        int i;
        if (anl1.b != null)
        {
            aobj = anl1.b;
        } else
        {
            aobj = a;
        }
        obj1 = new amx(((anm) (aobj)));
        aann = anl1.c;
        if (aann != null)
        {
            aobj = new amy[aann.length];
        } else
        {
            aobj = c;
        }
        for (i = 0; i < aobj.length; i++)
        {
            ann ann1 = aann[i];
            aobj[i] = new amy(ann1, a(ann1.c));
        }

        amw amw1 = new amw(((amv []) (aobj)));
        ani aani[] = anl1.d;
        if (aani != null)
        {
            aobj = new amn[aani.length];
        } else
        {
            aobj = e;
        }
        for (i = 0; i < aobj.length; i++)
        {
            aobj[i] = new amn(aani[i]);
        }

        Object obj = new amr(((amx) (obj1)), amw1, new amw(((amv []) (aobj))));
        anj aanj[] = anl1.e;
        map = new TreeMap(map);
        if (aanj != null)
        {
            int l = aanj.length;
            for (int j = 0; j < l; j++)
            {
                anj anj1 = aanj[j];
                map.put(anj1.a, anj1.b);
            }

        }
        map = (java.util.Map.Entry[])map.entrySet().toArray(new java.util.Map.Entry[map.size()]);
        aanj = new anj[map.length];
        for (int k = 0; k < aanj.length; k++)
        {
            aanj[k] = new anj((String)map[k].getKey(), (String)map[k].getValue());
        }

        map = new amm(((amr) (obj)), a(aanj));
        obj = anl1.f;
        obj = new amp((float)((ank) (obj)).f / 100F, ((ank) (obj)).g, ((ank) (obj)).h, ((ank) (obj)).a, ((ank) (obj)).b - ((ank) (obj)).d, ((ank) (obj)).c - ((ank) (obj)).e);
        aanj = ami1.a();
        if (aanj == null)
        {
            gya.a().a("CrashlyticsCore", "No log data to include with this event.");
        }
        ami1.b();
        if (aanj != null)
        {
            ami1 = new amt(aanj);
        } else
        {
            ami1 = new amu();
        }
        (new amq(anl1.a, "ndk-crash", new amv[] {
            map, obj, ami1
        })).b(codedoutputstream);
    }

    static amv[] a()
    {
        return b;
    }

}
