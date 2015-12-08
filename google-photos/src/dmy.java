// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;

final class dmy
    implements gmc
{

    private static final ekz a = (new ela()).a();
    private static final String b[] = {
        "_id", "capture_timestamp"
    };
    private final Context c;
    private final noz d;

    dmy(Context context)
    {
        c = context;
        d = noz.a(context, 3, "PagedSearchHandler", new String[] {
            "perf"
        });
    }

    private ekp a(dnx dnx1, ekw ekw, int i)
    {
        Cursor cursor;
        int j;
        long l;
        Object obj = null;
        if (!a.a(ekw))
        {
            dnx1 = String.valueOf(ekw);
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(dnx1).length() + 21)).append("Unsupported options: ").append(dnx1).toString());
        }
        l = noy.a();
        j = dnx1.c;
        ekw = (new erm()).d(dnx1.c()).a(b);
        ekw.o = false;
        ekw.g = i;
        ekw.f = 1L;
        cursor = ekw.b(c, j);
        ekw = obj;
        if (cursor.moveToFirst())
        {
            ekw = new djo(j, cursor.getLong(cursor.getColumnIndexOrThrow("_id")), cursor.getLong(cursor.getColumnIndexOrThrow("capture_timestamp")), null, elm.a);
        }
        cursor.close();
        if (ekw == null)
        {
            dnx1 = String.valueOf(dnx1);
            throw new eke((new StringBuilder(String.valueOf(dnx1).length() + 62)).append("Failed to find media at position: ").append(i).append(" for collection: ").append(dnx1).toString());
        }
        break MISSING_BLOCK_LABEL_246;
        dnx1;
        cursor.close();
        throw dnx1;
        if (d.a())
        {
            b.a(dnx1);
            b.a(ekw);
            noy.a("position", Integer.valueOf(i));
            noy.a("duration", l);
        }
        return ekw;
    }

    public final volatile ekp a(ekq ekq, ekw ekw, int i)
    {
        return a((dnx)ekq, ekw, i);
    }

    public final Class a()
    {
        return dnx;
    }

    public final Integer a(ekq ekq, ekw ekw, ekp ekp)
    {
        ekq = (dnx)ekq;
        if (!(ekp instanceof djo))
        {
            ekq = String.valueOf(ekp);
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(ekq).length() + 24)).append("Expected AllMedia, got: ").append(ekq).toString());
        }
        if (!a.a(ekw))
        {
            ekq = String.valueOf(ekw);
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(ekq).length() + 20)).append("Unexpected options: ").append(ekq).toString());
        }
        long l = noy.a();
        ekw = (djo)ekp;
        long l1 = ((djo) (ekw)).b;
        long l2 = ((djo) (ekw)).c;
        int i = ((dnx) (ekq)).c;
        ekq = (new erm()).d(ekq.c());
        ekq.o = false;
        l1 = ekq.b(l2, l1).a(c, i);
        if (d.a())
        {
            b.a(ekp);
            noy.a("position", Long.valueOf(l1));
            noy.a("duration", l);
        }
        return Integer.valueOf((int)l1);
    }

}
