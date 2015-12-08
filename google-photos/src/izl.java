// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

final class izl
    implements iyx
{

    private static final Set a = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[] {
        "type", "content_uri", "protobuf"
    })));
    private final izs b;
    private final izr c;
    private final jdr d;

    izl(Context context)
    {
        d = (jdr)olm.a(context, jdr);
        b = (izs)olm.a(context, izs);
        c = (izr)olm.a(context, izr);
    }

    private ekf a(Cursor cursor)
    {
        if (cursor.getInt(cursor.getColumnIndexOrThrow("type")) == euv.c.f) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        byte abyte0[];
        abyte0 = cursor.getBlob(cursor.getColumnIndexOrThrow("protobuf"));
        cursor = cursor.getString(cursor.getColumnIndexOrThrow("content_uri"));
        if (TextUtils.isEmpty(cursor)) goto _L4; else goto _L3
_L3:
        Cursor cursor1 = c.getReadableDatabase().query("local", new String[] {
            "trash_file_name"
        }, "content_uri = ?", new String[] {
            cursor
        }, null, null, null);
        if (!cursor1.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_224;
        }
        cursor = cursor1.getString(cursor1.getColumnIndexOrThrow("trash_file_name"));
_L7:
        cursor1.close();
        if (TextUtils.isEmpty(cursor)) goto _L4; else goto _L5
_L5:
        cursor = Uri.fromFile(b.a(cursor)).toString();
_L6:
        qgg qgg1;
        qgg1 = (qgg)mve.a(new qgg(), abyte0);
        if (!TextUtils.isEmpty(cursor) && qgg1 != null)
        {
            return jdy.a(cursor, qgg1, d);
        }
        break MISSING_BLOCK_LABEL_194;
        cursor;
        cursor1.close();
        throw cursor;
        if (!TextUtils.isEmpty(cursor))
        {
            return jdy.a(cursor);
        }
        if (qgg1 != null)
        {
            return jdy.a(qgg1, d);
        }
          goto _L1
_L4:
        cursor = null;
          goto _L6
        cursor = null;
          goto _L7
    }

    public final volatile ekf a(int i, Object obj)
    {
        return a((Cursor)obj);
    }

    public final Set a()
    {
        return a;
    }

    public final Class b()
    {
        return jdy;
    }

}
