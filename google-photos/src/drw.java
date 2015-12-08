// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class drw
{

    private static final Set b = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[] {
        "_id", "capture_timestamp", "type"
    })));
    private static final ekz c;
    public final Context a;
    private final elp d;
    private final dsa e;
    private final noz f;
    private final dry g;

    public drw(Context context, elp elp1, dsa dsa1)
    {
        this(context, elp1, dsa1, new dry());
    }

    private drw(Context context, elp elp1, dsa dsa1, dry dry1)
    {
        a = context;
        d = elp1;
        e = dsa1;
        g = dry1;
        f = noz.a(context, 3, "AllMediaQueryFactory", new String[] {
            "perf"
        });
    }

    public transient erm a(ekw ekw1, ekk ekk, drx adrx[])
    {
        int j = 1;
        if (!c.a(ekw1))
        {
            ekw1 = String.valueOf(ekw1);
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(ekw1).length() + 27)).append("Given unsupported options: ").append(ekw1).toString());
        }
        erm erm1 = (new erm()).a(d.a(b, ekk)).a(ekw1.f);
        erm1.h = ekw1.g;
        if (ekw1.a())
        {
            erm1.f = ekw1.b;
        }
        int i;
        if (ekw1.c != 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i != 0)
        {
            erm1.g = ekw1.c;
        }
        if (ekw1.h != -1L)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        ekk = erm1;
        if (i != 0)
        {
            ekk = erm1.a(ekw1.h);
        }
        if (ekw1.i != -1L)
        {
            i = j;
        } else
        {
            i = 0;
        }
        if (i != 0)
        {
            long l = ekw1.i;
            ekk.c(String.valueOf(b.b("media", "capture_timestamp")).concat(" < ?"));
            ((erm) (ekk)).c.add(String.valueOf(l));
        }
        j = adrx.length;
        for (i = 0; i < j; i++)
        {
            ekk = adrx[i].a(ekk);
        }

        if (ekw1.d != null)
        {
            e.a(ekk, ekw1.d);
        }
        return ekk;
    }

    public final transient List a(int i, ekw ekw1, ekk ekk, drx adrx[])
    {
        long l1;
        long l2;
        l2 = noy.a();
        ekw1 = a(ekw1, ekk, adrx).b(a, i);
        l1 = 0L;
        if (ekw1 == null)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        if (ekw1.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_58;
        }
        ekk = new ArrayList();
        if (ekw1 != null)
        {
            ekw1.close();
        }
        return ekk;
        int j;
        int k;
        int l;
        j = ekw1.getColumnIndexOrThrow("_id");
        k = ekw1.getColumnIndexOrThrow("capture_timestamp");
        l = ekw1.getColumnIndexOrThrow("type");
        adrx = new ArrayList(ekw1.getCount());
        boolean flag;
        do
        {
            long l3 = ekw1.getLong(j);
            long l4 = ekw1.getLong(k);
            euv euv1 = euv.a(ekw1.getInt(l));
            long l5 = noy.a();
            elm elm = d.a(i, ekw1, ekk);
            l1 = (noy.a() - l5) + l1;
            adrx.add(e.a(i, l3, l4, euv1, elm));
            flag = ekw1.moveToNext();
        } while (flag);
        if (ekw1 != null)
        {
            ekw1.close();
        }
        if (f.a())
        {
            noy.a("results", Integer.valueOf(adrx.size()));
            noy.a("duration", l2);
            noy.b("time spent building features", l1);
        }
        return Collections.unmodifiableList(adrx);
        ekk;
        if (ekw1 != null)
        {
            ekw1.close();
        }
        throw ekk;
    }

    static 
    {
        ela ela1 = new ela();
        ela1.a = true;
        ela1.b = true;
        ela1.e = true;
        ela1.c = true;
        ela1.d = true;
        ela1.f = true;
        ela1.g = true;
        c = ela1.a();
    }
}
