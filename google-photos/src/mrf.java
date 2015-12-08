// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class mrf
{

    final muz a;

    public mrf(Context context)
    {
        a = (muz)olm.a(context, muz);
    }

    public static long a(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase = new mvu(sqlitedatabase);
        sqlitedatabase.a = "album_upload_media";
        sqlitedatabase.b = (new String[] {
            "_id"
        });
        sqlitedatabase.c = mrg.b;
        sqlitedatabase.g = "1";
        sqlitedatabase = sqlitedatabase.a();
        long l;
        if (!sqlitedatabase.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_78;
        }
        l = sqlitedatabase.getLong(sqlitedatabase.getColumnIndexOrThrow("_id"));
        sqlitedatabase.close();
        return l;
        sqlitedatabase.close();
        return -1L;
        Exception exception;
        exception;
        sqlitedatabase.close();
        throw exception;
    }

    private static mqr a(Cursor cursor)
    {
        boolean flag1 = true;
        mqt mqt1 = new mqt();
        mqt1.a = cursor.getLong(cursor.getColumnIndexOrThrow("_id"));
        mqt1.c = cursor.getLong(cursor.getColumnIndexOrThrow("batch_id"));
        mqt1.d = mqu.a(cursor.getString(cursor.getColumnIndexOrThrow("status")));
        mqt1.f = cursor.getString(cursor.getColumnIndexOrThrow("photo_id"));
        mqt1.g = cursor.getString(cursor.getColumnIndexOrThrow("media_key"));
        mqt1.e = cursor.getInt(cursor.getColumnIndexOrThrow("attempt_count"));
        mqt1.b = cursor.getString(cursor.getColumnIndexOrThrow("local_uri"));
        mqt1.h = cursor.getLong(cursor.getColumnIndexOrThrow("update_time"));
        boolean flag;
        if (mqt1.a > -1L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag, "Must have valid uploadId");
        if (mqt1.c > -1L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag, "Must have a valid batchId");
        if (!TextUtils.isEmpty(mqt1.b))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag, "Must have a non-empty mediaLocalUri");
        if (mqt1.e >= 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        p.a(flag, "Must have non-negative attemptCount.");
        p.b(mqt1.d, "UploadState must be non-null.");
        return new mqr(mqt1);
    }

    static String[] a(Collection collection)
    {
        String as[] = new String[collection.size()];
        collection = collection.iterator();
        for (int i = 0; collection.hasNext(); i++)
        {
            as[i] = Long.toString(((Long)collection.next()).longValue());
        }

        return as;
    }

    public static void b(SQLiteDatabase sqlitedatabase, long l)
    {
        sqlitedatabase.execSQL("UPDATE album_upload_media SET attempt_count = attempt_count + 1 WHERE _id = ?", mrg.a(l));
    }

    public final Collection a(SQLiteDatabase sqlitedatabase, long l, Collection collection)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("batch_id", Long.valueOf(l));
        contentvalues.put("update_time", Long.valueOf(a.a()));
        ArrayList arraylist = new ArrayList(collection.size());
        for (collection = collection.iterator(); collection.hasNext(); arraylist.add(Long.valueOf(sqlitedatabase.insert("album_upload_media", null, contentvalues))))
        {
            contentvalues.put("local_uri", (String)collection.next());
        }

        return arraylist;
    }

    public final List a(SQLiteDatabase sqlitedatabase, List list)
    {
        ArrayList arraylist;
        Iterator iterator;
        arraylist = new ArrayList();
        iterator = (new mrd(list, 500)).iterator();
_L2:
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        List list1 = (List)iterator.next();
        list = String.valueOf("batch_id");
        Object obj = String.valueOf(b.s(list1.size()));
        String as[];
        if (((String) (obj)).length() != 0)
        {
            list = list.concat(((String) (obj)));
        } else
        {
            list = new String(list);
        }
        as = a(((Collection) (list1)));
        obj = new mvu(sqlitedatabase);
        obj.a = "album_upload_media";
        obj.b = mrg.c;
        obj.c = list;
        obj.d = as;
        list = ((mvu) (obj)).a();
        while (list.moveToNext()) 
        {
            arraylist.add(a(((Cursor) (list))));
        }
        break MISSING_BLOCK_LABEL_175;
        sqlitedatabase;
        list.close();
        throw sqlitedatabase;
        list.close();
        if (true) goto _L2; else goto _L1
_L1:
        return arraylist;
    }

    public final mqr a(SQLiteDatabase sqlitedatabase, long l)
    {
        Cursor cursor;
        Object obj = null;
        sqlitedatabase = new mvu(sqlitedatabase);
        sqlitedatabase.a = "album_upload_media";
        sqlitedatabase.b = mrg.c;
        sqlitedatabase.c = "_id = ?";
        sqlitedatabase.d = (new String[] {
            Long.toString(l)
        });
        sqlitedatabase.g = "1";
        cursor = sqlitedatabase.a();
        sqlitedatabase = obj;
        if (cursor.moveToNext())
        {
            sqlitedatabase = a(cursor);
        }
        cursor.close();
        return sqlitedatabase;
        sqlitedatabase;
        cursor.close();
        throw sqlitedatabase;
    }

    public final void a(SQLiteDatabase sqlitedatabase, long l, mqu mqu1)
    {
        boolean flag;
        if (mqu1 != mqu.c)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag, "use updateComplete to specify a photoId when upload is complete");
        a(sqlitedatabase, l, mqu1, null, null);
    }

    void a(SQLiteDatabase sqlitedatabase, long l, mqu mqu1, String s, String s1)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("status", mqu1.g);
        contentvalues.put("update_time", Long.valueOf(a.a()));
        if (s != null)
        {
            contentvalues.put("photo_id", s);
        }
        if (s1 != null)
        {
            contentvalues.put("media_key", s1);
        }
        sqlitedatabase.update("album_upload_media", contentvalues, "_id = ?", mrg.a(l));
    }

    public final HashMap b(SQLiteDatabase sqlitedatabase, List list)
    {
        HashMap hashmap;
        Iterator iterator;
        hashmap = new HashMap();
        iterator = (new mrd(list, 500)).iterator();
_L2:
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj = (List)iterator.next();
        list = String.valueOf("batch_id");
        Object obj1 = String.valueOf(b.s(((List) (obj)).size()));
        String as[];
        int i;
        if (((String) (obj1)).length() != 0)
        {
            list = list.concat(((String) (obj1)));
        } else
        {
            list = new String(list);
        }
        as = a(((Collection) (obj)));
        obj1 = new mvu(sqlitedatabase);
        obj1.a = "album_upload_media";
        obj1.b = (new String[] {
            "status", "COUNT(_id)"
        });
        obj1.c = list;
        obj1.d = as;
        obj1.e = "status";
        list = ((mvu) (obj1)).a();
        while (list.moveToNext()) 
        {
            as = mqu.a(list.getString(list.getColumnIndex("status")));
            i = list.getInt(1);
            if (!hashmap.containsKey(as))
            {
                hashmap.put(as, Integer.valueOf(0));
            }
            hashmap.put(as, Integer.valueOf(((Integer)hashmap.get(as)).intValue() + i));
        }
        break MISSING_BLOCK_LABEL_258;
        sqlitedatabase;
        list.close();
        throw sqlitedatabase;
        list.close();
        if (true) goto _L2; else goto _L1
_L1:
        return hashmap;
    }
}
