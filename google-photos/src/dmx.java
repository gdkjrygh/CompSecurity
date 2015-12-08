// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;

final class dmx
    implements gmc
{

    private static final String a[] = {
        "_id", "capture_timestamp", "type"
    };
    private static final ekz b;
    private static final ekz c = (new ela()).a();
    private final Context d;
    private final dqm e;
    private final gcf f;
    private final noz g;

    dmx(Context context)
    {
        d = context;
        e = (dqm)olm.a(context, dqm);
        f = (gcf)olm.a(context, gcf);
        g = noz.a(context, 3, "PagedAllMediaHandler", new String[] {
            "perf"
        });
    }

    private ekp a(dke dke1, ekw ekw1, int i)
    {
        int j;
        long l;
        if (!b.a(ekw1))
        {
            dke1 = String.valueOf(ekw1);
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(dke1).length() + 20)).append("Unexpected options: ").append(dke1).toString());
        }
        j = dke1.a;
        l = noy.a();
        if (!f.a(j) || !c.a(ekw1)) goto _L2; else goto _L1
_L1:
        Object obj = e.a(j).a(i);
        if (obj == null) goto _L2; else goto _L3
_L3:
        ekw1 = ((ekw) (obj));
_L5:
        return ekw1;
_L2:
        Cursor cursor;
        obj = new erm();
        obj.o = false;
        obj.h = a(d, j, ekw1);
        obj = ((erm) (obj)).a(a);
        obj.l = false;
        obj = ((erm) (obj)).a(ekw1.f);
        obj.g = i;
        obj.f = 1L;
        cursor = ((erm) (obj)).b(d, j);
        obj = null;
        if (cursor.moveToFirst())
        {
            obj = new djo(j, cursor.getLong(cursor.getColumnIndexOrThrow("_id")), cursor.getLong(cursor.getColumnIndexOrThrow("capture_timestamp")), euv.a(cursor.getInt(cursor.getColumnIndexOrThrow("type"))), elm.a);
        }
        cursor.close();
        if (obj == null)
        {
            dke1 = String.valueOf(dke1);
            throw new eke((new StringBuilder(String.valueOf(dke1).length() + 62)).append("Failed to find media at position: ").append(i).append(" for collection: ").append(dke1).toString());
        }
        break MISSING_BLOCK_LABEL_344;
        dke1;
        cursor.close();
        throw dke1;
        if (f.a(j) && c.a(ekw1))
        {
            e.a(j).a(i, ((ekp) (obj)));
        }
        ekw1 = ((ekw) (obj));
        if (g.a())
        {
            b.a(dke1);
            noy.a("position", Integer.valueOf(i));
            noy.a("duration", l);
            return ((ekp) (obj));
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    private static boolean a(Context context, int i, ekw ekw1)
    {
        context = ((drz)olm.a(context, drz)).a(i);
        return ekw1.g || context.equals(gaw.a);
    }

    public final volatile ekp a(ekq ekq, ekw ekw1, int i)
    {
        return a((dke)ekq, ekw1, i);
    }

    public final Class a()
    {
        return dke;
    }

    public final Integer a(ekq ekq, ekw ekw1, ekp ekp)
    {
        ekq = (dke)ekq;
        if (!(ekp instanceof djo))
        {
            ekq = String.valueOf(ekp);
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(ekq).length() + 24)).append("Expected AllMedia, got: ").append(ekq).toString());
        }
        if (!b.a(ekw1))
        {
            ekq = String.valueOf(ekw1);
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(ekq).length() + 20)).append("Unexpected options: ").append(ekq).toString());
        }
        long l = noy.a();
        djo djo1 = (djo)ekp;
        long l1 = djo1.b;
        long l2 = djo1.c;
        int i = ((dke) (ekq)).a;
        ekq = new erm();
        ekq.o = false;
        ekq.l = false;
        ekq.h = a(d, i, ekw1);
        l1 = ekq.a(ekw1.f).b(l2, l1).a(d, i);
        if (g.a())
        {
            b.a(ekp);
            noy.a("position", Long.valueOf(l1));
            noy.a("duration", l);
        }
        return Integer.valueOf((int)l1);
    }

    static 
    {
        ela ela1 = new ela();
        ela1.c = true;
        ela1.d = true;
        b = ela1.a();
    }
}
