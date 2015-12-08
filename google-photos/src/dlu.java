// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

final class dlu
    implements elf
{

    private static final String a[] = {
        "local_dedup_key"
    };
    private static final ekz b = (new ela()).a();
    private static final ekz c;
    private final Context d;
    private final drw e;

    dlu(Context context, drw drw1)
    {
        d = context;
        e = drw1;
    }

    private drx a(dls dls1, ekw ekw)
    {
        int i = dls1.a;
        dls1 = new mvu(mvj.b(d, i));
        dls1.a = "external_deleted_media";
        dls1.b = a;
        dls1 = dls1.a();
        int j = dls1.getCount();
        if (j == 0)
        {
            dls1.close();
            return null;
        }
        HashSet hashset;
        hashset = new HashSet();
        int k = dls1.getColumnIndexOrThrow("local_dedup_key");
        for (; dls1.moveToNext(); hashset.add(dls1.getString(k))) { }
        break MISSING_BLOCK_LABEL_116;
        ekw;
        dls1.close();
        throw ekw;
        dls1.close();
        return new dlv(this, hashset, ekw);
    }

    public final long a(ekq ekq, ekw ekw)
    {
        ekq = (dls)ekq;
        drx drx1 = a(((dls) (ekq)), ekw);
        if (drx1 == null)
        {
            return 0L;
        } else
        {
            drw drw1 = e;
            int i = ((dls) (ekq)).a;
            return drw1.a(ekw, ekk.a, new drx[] {
                drx1
            }).a(drw1.a, i);
        }
    }

    public final Class a()
    {
        return dls;
    }

    public final List a(ekq ekq, ekw ekw, ekk ekk1)
    {
        ekq = (dls)ekq;
        drx drx1 = a(((dls) (ekq)), ekw);
        if (drx1 == null)
        {
            return Collections.emptyList();
        } else
        {
            return e.a(((dls) (ekq)).a, ekw, ekk1, new drx[] {
                drx1
            });
        }
    }

    public final ekz b()
    {
        return c;
    }

    public final ekz c()
    {
        return b;
    }

    static 
    {
        ela ela1 = new ela();
        ela1.a = true;
        c = ela1.a();
    }
}
