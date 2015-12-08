// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

final class dmr
    implements ert
{

    boolean a;
    int b;
    private final SQLiteDatabase c;
    private final evg d;
    private final hqo e;
    private final int f;
    private final long g;
    private dmq h;

    dmr(dmq dmq1, int i, hqo hqo1, long l)
    {
        h = dmq1;
        super();
        f = i;
        e = hqo1;
        g = l;
        c = mvj.a(dmq.a(dmq1), i);
        d = ((gjo)olm.a(dmq.a(dmq1), gjo)).b(c, i);
    }

    public final Cursor a(int i, int j)
    {
        erm erm1 = new erm();
        erm1.l = false;
        erm1.i = true;
        erm1.g = j;
        erm1.f = i;
        erm1 = erm1.a(dmq.b());
        if (g > 0L)
        {
            erm1.b(g);
        }
        return erm1.b(dmq.a(h), f);
    }

    public final boolean a(Cursor cursor, int i)
    {
        int j;
        int k;
        int l;
        long l1;
        j = cursor.getColumnIndexOrThrow("dedup_key");
        k = cursor.getColumnIndexOrThrow("capture_timestamp");
        l = cursor.getColumnIndexOrThrow("protobuf");
        l1 = 0L;
        c.beginTransaction();
        i = 0;
_L4:
        if (!cursor.moveToNext())
        {
            break MISSING_BLOCK_LABEL_273;
        }
        l1 = cursor.getLong(k);
        if (!e.c) goto _L2; else goto _L1
_L1:
        j = 1;
_L6:
        c.setTransactionSuccessful();
        c.endTransaction();
        Object obj;
        byte abyte0[];
        qgg qgg1;
        if (j != 0 || i == 500)
        {
            cursor = h;
            i = f;
            ((mmv)olm.a(((dmq) (cursor)).a, mmv)).b(i).h("OnDeviceSearchIndexSyncJob").b("resume_capture_timestamp", l1).d();
        } else
        {
            a = true;
        }
        return j == 0 && !a;
_L2:
        b = b + 1;
        i++;
        obj = cursor.getString(j);
        abyte0 = cursor.getBlob(l);
        if (abyte0 == null) goto _L4; else goto _L3
_L3:
        qgg1 = (qgg)mve.a(new qgg(), abyte0);
        if (qgg1 == null) goto _L4; else goto _L5
_L5:
        obj = new evh(((String) (obj)), l1, qgg1);
        d.a(((evh) (obj)));
          goto _L4
        cursor;
        c.endTransaction();
        throw cursor;
        j = 0;
          goto _L6
    }
}
