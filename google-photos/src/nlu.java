// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import java.util.HashMap;

final class nlu
    implements nls
{

    int a;
    private final String b[];
    private final String c;
    private final long d;
    private final long e;
    private nlr f;

    public nlu(nlr nlr1, String as[], String s, long l, long l1)
    {
        f = nlr1;
        super();
        b = as;
        c = s;
        d = l;
        e = l1;
    }

    public final Cursor a(int i, int j)
    {
        long l = d;
        long l1 = e;
        ejr ejr1 = f.d;
        android.net.Uri uri = f.b;
        String as[] = b;
        String s = c;
        s = (new StringBuilder(String.valueOf(s).length() + 43)).append(s).append(" DESC  LIMIT ").append(i).append(" OFFSET ").append(j).toString();
        return ejr1.a(uri, as, "date_modified >= ? OR _id > ?", new String[] {
            String.valueOf(l), String.valueOf(l1)
        }, s);
    }

    public final void a(Cursor cursor)
    {
        boolean flag;
        boolean flag1;
        HashMap hashmap = new HashMap();
        SQLiteDatabase sqlitedatabase;
        Object obj;
        long l;
        if (f.c != -1)
        {
            android.database.sqlite.SQLiteTransactionListener sqlitetransactionlistener = f.e.f_();
            sqlitedatabase = mvj.a(f.a, f.c);
            sqlitedatabase.beginTransactionWithListenerNonExclusive(sqlitetransactionlistener);
        } else
        {
            sqlitedatabase = null;
        }
        if (!cursor.moveToNext() || f.h)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = cursor.getString(2);
        if (TextUtils.isEmpty(((CharSequence) (obj))) || !((String) (obj)).startsWith("image/") && !((String) (obj)).startsWith("video/"))
        {
            flag = false;
        } else
        {
            flag = true;
        }
        l = cursor.getLong(0);
        if (flag && l >= 0L)
        {
            break MISSING_BLOCK_LABEL_202;
        }
        if (f.g.a())
        {
            noy.a("uri", f.b);
            noy.a("mimeType", obj);
            noy.a("media store id", Long.valueOf(l));
        }
        continue; /* Loop/switch isn't completed */
        cursor;
        if (sqlitedatabase != null)
        {
            sqlitedatabase.endTransaction();
        }
        throw cursor;
        if (f.e.a(f.a, cursor, f.b))
        {
            hashmap.put(f.e, Boolean.valueOf(true));
        }
        a = a + 1;
        if (a <= 0 || a % 100 != 0 && !cursor.isLast())
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = f.e;
        if (hashmap.containsKey(f.e) && ((Boolean)hashmap.get(f.e)).booleanValue())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        ((nlj) (obj)).a(flag1);
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_57;
_L1:
        if (sqlitedatabase == null)
        {
            break MISSING_BLOCK_LABEL_350;
        }
        sqlitedatabase.setTransactionSuccessful();
        if (sqlitedatabase != null)
        {
            sqlitedatabase.endTransaction();
        }
        return;
    }
}
