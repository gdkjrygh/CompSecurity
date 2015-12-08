// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class dml
    implements gly
{

    private static final ekz a = (new ela()).a();
    private final Context b;
    private final drw c;
    private final drz d;

    public dml(Context context)
    {
        b = context;
        c = new drw(context, new elp(context, dkl), new djv());
        d = (drz)olm.a(context, drz);
    }

    private elb a(ehr ehr1, glq glq1, int i, ekk ekk1)
    {
label0:
        {
            boolean flag1 = false;
            ehr1 = b(ehr1);
            boolean flag;
            if (i > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            p.a(flag);
            p.a(glq1);
            if (ekk1.a().size() != 0)
            {
                flag = flag1;
                if (ekk1.a().size() != 1)
                {
                    break label0;
                }
                flag = flag1;
                if (!ekk1.a().contains(elt))
                {
                    break label0;
                }
            }
            flag = true;
        }
        p.a(flag, "only MediaDisplayFeature is supported");
        try
        {
            ehr1 = b.b(a(((dmh) (ehr1)).a, ekk1, glq1.b, i));
        }
        // Misplaced declaration of an exception variable
        catch (ehr ehr1)
        {
            return b.a(ehr1);
        }
        return ehr1;
    }

    private List a(int i, ekk ekk1, long l, int j)
    {
        android.database.sqlite.SQLiteDatabase sqlitedatabase;
        ArrayList arraylist;
        sqlitedatabase = mvj.b(b, i);
        arraylist = new ArrayList(j);
_L2:
        Cursor cursor = dmm.a(sqlitedatabase, l);
        ArrayList arraylist1;
        int k = cursor.getColumnIndexOrThrow("media_id");
        arraylist1 = new ArrayList(cursor.getCount());
        for (; cursor.moveToNext(); arraylist1.add(Long.valueOf(cursor.getLong(k)))) { }
        break MISSING_BLOCK_LABEL_99;
        ekk1;
        cursor.close();
        throw ekk1;
        cursor.close();
        arraylist.add(new glq(c.a(i, ekw.a, ekk1, new drx[] {
            new dmo(arraylist1), new dod(d, i)
        }), l));
        l = b.a(sqlitedatabase, l);
        if (l == -1L || arraylist.size() >= j)
        {
            return arraylist;
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    private static dmh b(ehr ehr1)
    {
        p.a(a.a(ehr1.b), "unrecognized options");
        p.a(ehr1.a instanceof dmh, "wrong collection type");
        return (dmh)ehr1.a;
    }

    public final long a(ehr ehr1)
    {
        ehr1 = b(ehr1);
        return DatabaseUtils.longForQuery(mvj.b(b, ((dmh) (ehr1)).a), "SELECT COUNT(DISTINCT start_timestamp) FROM chapters", null);
    }

    public final elb a(ehr ehr1, int i)
    {
        ehr1 = b(ehr1);
        long l = dmn.a(mvj.b(b, ((dmh) (ehr1)).a), i);
        if (l == -1L)
        {
            return b.a(new eke((new StringBuilder(39)).append("month not found at position ").append(i).toString()));
        }
        try
        {
            ehr1 = a(((dmh) (ehr1)).a, ekk.a, l, 1);
            if (ehr1.isEmpty())
            {
                return b.a(new eke("failed generating months"));
            }
            ehr1 = b.b(ehr1.get(0));
        }
        // Misplaced declaration of an exception variable
        catch (ehr ehr1)
        {
            return b.a(ehr1);
        }
        return ehr1;
    }

    public final elb a(ehr ehr1, Object obj)
    {
        obj = (glq)obj;
        ehr1 = b(ehr1);
        return b.b(Integer.valueOf((int)DatabaseUtils.longForQuery(mvj.b(b, ((dmh) (ehr1)).a), "SELECT COUNT(DISTINCT start_timestamp) FROM chapters WHERE start_timestamp > ?", new String[] {
            String.valueOf(((glq) (obj)).b)
        })));
    }

    public final volatile elb a(ehr ehr1, Object obj, int i, int j, ekk ekk1)
    {
        return a(ehr1, (glq)obj, j, ekk1);
    }

    public final Object a()
    {
        return "com.google.android.apps.photos.allphotos.data.AllPhotosCore";
    }

    public final boolean a(ekq ekq)
    {
        p.a(ekq instanceof dmh, "wrong collection type");
        return true;
    }

}
