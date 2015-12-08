// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentUris;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import java.util.HashSet;
import java.util.Set;

final class hdm
    implements nls
{

    int a;
    private final String b;
    private final Set c;
    private hdk d;

    public hdm(hdk hdk1, String s)
    {
        d = hdk1;
        super();
        a = 0;
        b = s;
        c = b(Uri.parse(s));
    }

    private static String a(Uri uri)
    {
        oql.c(uri);
        return "bucket_id";
    }

    private Set b(Uri uri)
    {
        Cursor cursor;
        HashSet hashset;
        cursor = hdk.g(d).a(uri, new String[] {
            "_id", a(uri)
        }, null, null, null);
        hashset = new HashSet();
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_135;
        }
        int i = cursor.getColumnIndexOrThrow("_id");
        int j = cursor.getColumnIndexOrThrow(a(uri));
        do
        {
            if (!cursor.moveToNext())
            {
                break;
            }
            uri = cursor.getString(j);
            if (hdk.h(d).a(uri))
            {
                hashset.add(Long.valueOf(cursor.getLong(i)));
            }
        } while (true);
        break MISSING_BLOCK_LABEL_129;
        uri;
        cursor.close();
        throw uri;
        cursor.close();
        return hashset;
    }

    public final Cursor a(int i, int j)
    {
        SQLiteDatabase sqlitedatabase = hdk.a(d);
        String as[] = hdk.b();
        String s = String.valueOf(b).concat("%");
        String s1 = (new StringBuilder(24)).append(j).append(", ").append(i).toString();
        return sqlitedatabase.query("local_media", as, "content_uri LIKE ?", new String[] {
            s
        }, null, null, null, s1);
    }

    public final void a(Cursor cursor)
    {
        int j = cursor.getColumnIndexOrThrow("content_uri");
        int k = cursor.getColumnIndex("state");
        int l = cursor.getColumnIndex("dedup_key");
        do
        {
            if (!cursor.moveToNext())
            {
                break;
            }
            String s = cursor.getString(j);
            eun eun1 = eun.a(cursor.getInt(k));
            if (!c.contains(Long.valueOf(ContentUris.parseId(Uri.parse(s)))) && eun1 == eun.a)
            {
                String s1 = cursor.getString(l);
                int i;
                if (DatabaseUtils.queryNumEntries(hdk.b(d).a.getReadableDatabase(), "media_store_extra_deleted_media", "local_dedup_key = ?", new String[] {
    s1
}) != 0L)
                {
                    i = 1;
                } else
                {
                    i = 0;
                }
                if (i == 0)
                {
                    esu esu1 = hdk.d(d);
                    i = hdk.c(d);
                    SQLiteDatabase sqlitedatabase = mvj.a(esu1.a, i);
                    ContentValues contentvalues = new ContentValues();
                    contentvalues.put("local_dedup_key", s1);
                    contentvalues.put("entry_timestamp", Long.valueOf(esu1.b.a()));
                    sqlitedatabase.insertWithOnConflict("external_deleted_media", null, contentvalues, 5);
                }
                hdk.f(d).b(hdk.a(d), hdk.c(d), s, hdk.e(d));
                a = a + 1;
            }
        } while (true);
    }
}
