// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Point;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class fcl
{

    private static final String e[] = {
        "batch_id", "size_bytes", "threshold", "is_dismissed", "is_read", "has_original_bytes"
    };
    public final Context a;
    final fch b;
    final noz c;
    fco d;

    fcl(Context context, fch fch1)
    {
        d = fco.a;
        a = context;
        b = fch1;
        c = noz.a(context, 3, "MediaBatchDataSource", new String[0]);
    }

    static void a(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.delete("device_mgmt_batch", null, null);
    }

    public final fcm a(int i)
    {
        return fcm.a(i, mvj.b(a, i).query("device_mgmt_batch", e, null, null, null, null, null));
    }

    public final fcm a(int i, String s)
    {
        p.a(s);
        return fcm.a(i, mvj.b(a, i).query("device_mgmt_batch", e, "batch_id = ?", new String[] {
            s
        }, null, null, null));
    }

    final String a(fcj fcj1)
    {
        fcj1 = b.a(fcj1.a());
        if (fcj1 != null)
        {
            return fcj1.b();
        } else
        {
            return null;
        }
    }

    public final List a(fcm fcm1)
    {
        Cursor cursor;
        int i;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        cursor = mvj.b(a, fcm1.a).query("device_mgmt_batch", fbp.a, "batch_id = ?", new String[] {
            fcm1.b
        }, null, null, null);
        i = cursor.getColumnIndexOrThrow("size_bytes");
        j = cursor.getColumnIndexOrThrow("content_uri");
        k = cursor.getColumnIndexOrThrow("last_modified");
        l = cursor.getColumnIndexOrThrow("type");
        i1 = cursor.getColumnIndexOrThrow("width");
        j1 = cursor.getColumnIndexOrThrow("height");
        k1 = cursor.getColumnIndexOrThrow("path");
        boolean flag = cursor.moveToNext();
        if (!flag)
        {
            cursor.close();
            return null;
        }
        ArrayList arraylist = new ArrayList(cursor.getCount());
_L3:
        fck fck1;
        fck1 = fck.a(cursor.getInt(l));
        if (cursor.isNull(i1) || cursor.isNull(j1))
        {
            break MISSING_BLOCK_LABEL_285;
        }
          goto _L1
_L4:
        arraylist.add(new fbs(cursor.getString(j), cursor.getString(k1), cursor.getLong(i), cursor.getLong(k), fck1, fcm1));
        flag = cursor.moveToNext();
        if (flag) goto _L3; else goto _L2
_L2:
        cursor.close();
        return arraylist;
_L1:
        fcm1 = new Point(cursor.getInt(i1), cursor.getInt(j1));
          goto _L4
        fcm1;
        cursor.close();
        throw fcm1;
        fcm1 = null;
          goto _L4
    }

    List a(List list)
    {
        ArrayList arraylist = new ArrayList();
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            String s = a((fcj)list.next());
            if (s != null)
            {
                arraylist.add(s);
            }
        } while (true);
        return arraylist;
    }

    public final void b(fcm fcm1)
    {
        mvj.a(a, fcm1.a).delete("device_mgmt_batch", null, null);
    }

}
