// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import java.util.List;

final class dmv
    implements elf, gmc
{

    private static final ekz a;
    private static final ekz b = (new ela()).a();
    private static final String c[] = {
        "_id", "capture_timestamp", "type"
    };
    private final drw d;
    private final noz e;
    private final Context f;
    private final gjr g;

    dmv(Context context, drw drw1)
    {
        d = drw1;
        e = noz.a(context, 3, "Search_OnDevice", new String[] {
            "perf"
        });
        f = context;
        g = (gjr)olm.a(context, gjr);
    }

    private ekp a(dms dms1, ekw ekw1, int i)
    {
        Object obj;
        int j;
        long l;
        if (!a.a(ekw1))
        {
            dms1 = String.valueOf(ekw1);
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(dms1).length() + 20)).append("Unexpected options: ").append(dms1).toString());
        }
        j = dms1.a;
        l = noy.a();
        obj = new erm();
        obj.o = false;
        obj = ((erm) (obj)).a(c);
        obj.l = false;
        ekw1 = ((erm) (obj)).a(ekw1.f);
        ekw1.f = 1L;
        ekw1.a(gjr.a(dms1.b, i, 1));
        obj = ekw1.b(f, j);
        ekw1 = null;
        if (((Cursor) (obj)).moveToFirst())
        {
            ekw1 = new djo(j, ((Cursor) (obj)).getLong(((Cursor) (obj)).getColumnIndexOrThrow("_id")), ((Cursor) (obj)).getLong(((Cursor) (obj)).getColumnIndexOrThrow("capture_timestamp")), euv.a(((Cursor) (obj)).getInt(((Cursor) (obj)).getColumnIndexOrThrow("type"))), elm.a);
        }
        ((Cursor) (obj)).close();
        if (ekw1 == null)
        {
            dms1 = String.valueOf(dms1);
            throw new eke((new StringBuilder(String.valueOf(dms1).length() + 62)).append("Failed to find media at position: ").append(i).append(" for collection: ").append(dms1).toString());
        }
        break MISSING_BLOCK_LABEL_283;
        dms1;
        ((Cursor) (obj)).close();
        throw dms1;
        if (e.a())
        {
            b.a(dms1);
            noy.a("position", Integer.valueOf(i));
            noy.a("duration", l);
        }
        return ekw1;
    }

    private Integer a(dms dms1, ekw ekw1, ekp ekp)
    {
        Cursor cursor;
        Cursor cursor1;
        djo djo1;
        int i;
        long l;
        if (!(ekp instanceof djo))
        {
            dms1 = String.valueOf(ekp);
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(dms1).length() + 24)).append("Expected AllMedia, got: ").append(dms1).toString());
        }
        if (!a.a(ekw1))
        {
            dms1 = String.valueOf(ekw1);
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(dms1).length() + 20)).append("Unexpected options: ").append(dms1).toString());
        }
        l = noy.a();
        i = dms1.a;
        djo1 = (djo)ekp;
        cursor1 = null;
        cursor = cursor1;
        Object obj = (new erm()).c(djo1.b);
        cursor = cursor1;
        obj.k = false;
        cursor = cursor1;
        cursor1 = ((erm) (obj)).b(f, i);
        cursor = cursor1;
        if (cursor1.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_248;
        }
        cursor = cursor1;
        dms1 = String.valueOf(ekp);
        cursor = cursor1;
        throw new eke((new StringBuilder(String.valueOf(dms1).length() + 28)).append("Given media does not exist: ").append(dms1).toString());
        dms1;
        if (cursor != null)
        {
            cursor.close();
        }
        throw dms1;
        cursor = cursor1;
        obj = cursor1.getString(cursor1.getColumnIndex("dedup_key"));
        if (cursor1 != null)
        {
            cursor1.close();
        }
        erm erm1 = new erm();
        erm1.o = false;
        erm1 = erm1.a(c);
        erm1.l = false;
        long l1 = erm1.a(ekw1.f).a(gjr.a(dms1.b, djo1.c, ((String) (obj)))).a(f, i);
        if (e.a())
        {
            b.a(dms1);
            b.a(ekp);
            noy.a("position", Long.valueOf(l1));
            noy.a("duration", l);
        }
        return Integer.valueOf((int)l1);
    }

    public final long a(ekq ekq, ekw ekw1)
    {
        ekq = (dms)ekq;
        int i = dd.a(mvj.b(f, ((dms) (ekq)).a), gjr.a(((dms) (ekq)).b).a);
        if (e.a())
        {
            noy.a("options", ekw1);
            noy.a("result", Integer.valueOf(i));
        }
        return (long)i;
    }

    public final volatile ekp a(ekq ekq, ekw ekw1, int i)
    {
        return a((dms)ekq, ekw1, i);
    }

    public final Class a()
    {
        return dms;
    }

    public final volatile Integer a(ekq ekq, ekw ekw1, ekp ekp)
    {
        return a((dms)ekq, ekw1, ekp);
    }

    public final List a(ekq ekq, ekw ekw1, ekk ekk)
    {
        dms dms1 = (dms)ekq;
        long l = noy.a();
        boolean flag1 = ekw1.a();
        if (flag1)
        {
            boolean flag;
            if (ekw1.e != 0x80000000)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (!flag)
            {
                ekq = String.valueOf("startMediaOffset must be set if limit is present for collection: ");
                ekk = String.valueOf(dms1);
                ekw1 = String.valueOf(ekw1);
                throw new eke((new StringBuilder(String.valueOf(ekq).length() + 15 + String.valueOf(ekk).length() + String.valueOf(ekw1).length())).append(ekq).append(ekk).append(", and options: ").append(ekw1).toString());
            }
        }
        if (flag1 && ekw1.d != null)
        {
            ekq = (new eky()).a(ekw1);
            ekq.f = null;
            ekq = ekq.a();
        } else
        {
            ekq = ekw1;
        }
        if (flag1)
        {
            ekw1 = new dmw(g, dms1.b, ekw1.e, ekw1.b);
        } else
        {
            ekw1 = new dmw(g, dms1.b);
        }
        ekq = d.a(dms1.a, ekq, ekk, new drx[] {
            ekw1
        });
        if (e.a())
        {
            b.a(dms1);
            noy.a("total", Integer.valueOf(ekq.size()));
            noy.a("duration", l);
        }
        return ekq;
    }

    public final ekz b()
    {
        return a;
    }

    public final ekz c()
    {
        return b;
    }

    static 
    {
        ela ela1 = new ela();
        ela1.f = true;
        ela1.g = true;
        ela1.a = true;
        ela1.b = true;
        ela1.e = true;
        a = ela1.a();
    }
}
