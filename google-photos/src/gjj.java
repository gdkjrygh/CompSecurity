// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import java.util.HashSet;
import java.util.Set;

public final class gjj
{

    public final Context a;
    public final noz b;
    public final noz c;
    public final noz d;
    private final noz e;
    private final gjr f;

    public gjj(Context context, gjr gjr1)
    {
        a = context;
        b = noz.a(context, 3, "ClusterOperations", new String[] {
            "perf"
        });
        e = noz.a(context, 2, "ClusterOperations", new String[0]);
        c = noz.a(context, "ClusterOperations", new String[0]);
        d = noz.a(context, 3, "ClusterOperations", new String[0]);
        f = gjr1;
    }

    public gjk a(int i, SQLiteDatabase sqlitedatabase, qfx aqfx[])
    {
        int j = 0;
        HashSet hashset = new HashSet();
        long l3 = noy.a();
        long l1 = 0L;
        int k1 = aqfx.length;
        int k = 0;
        int l = 0;
        for (; k < k1; k++)
        {
            qfx qfx1 = aqfx[k];
            if (qfx1.c != 1)
            {
                continue;
            }
            long l2 = noy.a();
            long l4 = qfx1.a.b.a.longValue();
            gjr.a(sqlitedatabase, (int)l4, qfx1.b.a, qfx1.b.b.doubleValue(), qfx1.a.a);
            int i1 = j + 1;
            int j1 = l + 1;
            hashset.add(Integer.valueOf((int)l4));
            l2 = (noy.a() - l2) + l1;
            l = j1;
            j = i1;
            l1 = l2;
            if (j1 % 50 != 0)
            {
                continue;
            }
            l = j1;
            j = i1;
            l1 = l2;
            if (!sqlitedatabase.yieldIfContendedSafely(1000L))
            {
                continue;
            }
            l = j1;
            j = i1;
            l1 = l2;
            if (e.a())
            {
                noy.a(i);
                l1 = l2;
                j = i1;
                l = j1;
            }
        }

        if (b.a())
        {
            noy.b("buildTime", l3);
            noy.b("dbTime", l1);
        }
        return new gjk(j, 0, 0, j, j, hashset, (byte)0);
    }

    public final void a(int i, qfx aqfx[], qfu qfu1)
    {
        if (gjr.b()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        String s = ((mmv)olm.a(a, mmv)).a(i).b("gaia_id");
        if (qfu1 != null && TextUtils.equals(s, qfu1.b))
        {
            break; /* Loop/switch isn't completed */
        }
        if (d.a())
        {
            noy.a(i);
            noy.a("owner", qfu1);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        break; /* Loop/switch isn't completed */
        aqfx;
        if (c.a())
        {
            noy.a(i);
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
        long l;
        qfu1 = mvj.a(a, i);
        l = noy.a();
        new gjk();
        qfu1.beginTransactionNonExclusive();
        HashSet hashset = new HashSet();
        int j = aqfx.length;
        aqfx = a(i, ((SQLiteDatabase) (qfu1)), aqfx);
        int k = ((gjk) (aqfx)).d;
        hashset.addAll(((gjk) (aqfx)).f);
        aqfx = new gjk(k, 0, 0, k, j, hashset, (byte)0);
        qfu1.setTransactionSuccessful();
        qfu1.endTransaction();
        if (!b.a()) goto _L1; else goto _L5
_L5:
        noy.a(i);
        noy.a("num cluster", Integer.valueOf(((gjk) (aqfx)).e));
        noy.a("num inserted or updated", Integer.valueOf(((gjk) (aqfx)).a));
        noy.a("num deleted", Integer.valueOf(((gjk) (aqfx)).b));
        noy.a("num skipped", Integer.valueOf(((gjk) (aqfx)).c));
        noy.a("total operations", Integer.valueOf(((gjk) (aqfx)).d));
        noy.a("duration", l);
        return;
        aqfx;
        qfu1.endTransaction();
        throw aqfx;
    }
}
