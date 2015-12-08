// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

final class iyq
    implements iyx
{

    private static final Set a = new HashSet(Arrays.asList(new String[] {
        "remote_url", "content_uri", "signature", "is_edited"
    }));
    private final izs b;
    private final izr c;

    iyq(Context context)
    {
        b = (izs)olm.a(context, izs);
        c = (izr)olm.a(context, izr);
    }

    private ekf a(int i, Cursor cursor)
    {
        Object obj;
        Object obj1;
        Cursor cursor1;
        String s = cursor.getString(cursor.getColumnIndexOrThrow("remote_url"));
        obj1 = cursor.getString(cursor.getColumnIndexOrThrow("content_uri"));
        int j = cursor.getColumnIndexOrThrow("signature");
        if (!cursor.isNull(j))
        {
            obj = Integer.valueOf(cursor.getInt(j));
        } else
        {
            obj = null;
        }
        if (cursor.getInt(cursor.getColumnIndexOrThrow("is_edited")) != 0)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        if (!TextUtils.isEmpty(((CharSequence) (obj1))))
        {
            cursor = Uri.parse(((String) (obj1)));
        } else
        {
            cursor = null;
        }
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_337;
        }
        cursor1 = c.getReadableDatabase().query("local", new String[] {
            "trash_file_name"
        }, "content_uri = ?", new String[] {
            obj1
        }, null, null, null);
        if (!cursor1.moveToFirst()) goto _L2; else goto _L1
_L1:
        obj1 = cursor1.getString(cursor1.getColumnIndexOrThrow("trash_file_name"));
_L6:
        cursor1.close();
        if (!TextUtils.isEmpty(((CharSequence) (obj1))))
        {
            cursor = new gan(Uri.fromFile(b.a(((String) (obj1)))), ((Integer) (obj)));
        } else
        {
            cursor = new gan(cursor, ((Integer) (obj)));
        }
_L7:
        if (!TextUtils.isEmpty(s))
        {
            obj = new gat(s, i);
        } else
        {
            obj = null;
        }
        if (cursor == null || obj == null) goto _L4; else goto _L3
_L3:
        if (!TextUtils.isEmpty(s) && j)
        {
            obj1 = gas.a;
        } else
        {
            obj1 = gas.b;
        }
        cursor = new gaq(cursor, ((gat) (obj)), ((gas) (obj1)));
_L5:
        return new elu(cursor);
        cursor;
        cursor1.close();
        throw cursor;
_L4:
        if (obj != null)
        {
            cursor = ((Cursor) (obj));
        }
        if (true) goto _L5; else goto _L2
_L2:
        obj1 = null;
          goto _L6
        cursor = null;
          goto _L7
    }

    public final volatile ekf a(int i, Object obj)
    {
        return a(i, (Cursor)obj);
    }

    public final Set a()
    {
        return a;
    }

    public final Class b()
    {
        return elt;
    }

}
