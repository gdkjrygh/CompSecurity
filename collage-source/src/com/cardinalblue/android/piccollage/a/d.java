// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.a;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.support.v4.content.CursorLoader;
import android.text.TextUtils;
import com.cardinalblue.android.piccollage.model.PhotoInfo;
import com.cardinalblue.android.piccollage.model.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

// Referenced classes of package com.cardinalblue.android.piccollage.a:
//            f

public final class d
{

    public static final Uri a;
    public static final String b[] = {
        "_data", "bucket_id", "bucket_display_name", String.format("COUNT(%s) AS %s", new Object[] {
            "bucket_id", "_COUNT"
        }), "CASE     WHEN LOWER(bucket_display_name) = 'camera' THEN 0    WHEN LOWER(bucket_display_name) = 'instagram' THEN 1    WHEN LOWER(bucket_display_name) = 'download'    OR LOWER(bucket_display_name) = 'downloads' THEN 2    WHEN LOWER(bucket_display_name) = 'screenshot'    OR LOWER(bucket_display_name) = 'screenshots' THEN 3    WHEN LOWER(bucket_display_name) = 'facebook' THEN 4    ELSE 50 END as IDX"
    };
    public static final String c = String.format("NOT TRIM(%s) = '') GROUP BY (2", new Object[] {
        "_data"
    });
    public static final String d[] = {
        "_id", "_data"
    };
    public static final String e = String.format("NOT TRIM(%s) = '' AND %s = ? ", new Object[] {
        "_data", "bucket_id"
    });

    public d()
    {
    }

    public static Cursor a(Context context)
    {
        return context.getContentResolver().query(a, b, c, null, "IDX, _COUNT DESC , bucket_display_name, date_added");
    }

    public static Cursor a(Context context, String s)
    {
        return context.getContentResolver().query(a, d, e, new String[] {
            s
        }, "date_modified DESC");
    }

    public static Collection a(Cursor cursor)
    {
        Exception exception;
        if (cursor == null || cursor.isClosed())
        {
            return null;
        }
        Object obj;
        String s;
        String s1;
        String s2;
        int i;
        int j;
        int k;
        int l;
        int i1;
        boolean flag;
        try
        {
            flag = cursor.moveToFirst();
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            cursor.close();
            return null;
        }
        catch (IllegalStateException illegalstateexception)
        {
            cursor.close();
            return null;
        }
        finally
        {
            cursor.close();
        }
        if (!flag)
        {
            cursor.close();
            return null;
        }
        i = cursor.getColumnIndexOrThrow("_data");
        j = cursor.getColumnIndexOrThrow("bucket_id");
        k = cursor.getColumnIndexOrThrow("bucket_display_name");
        l = cursor.getColumnIndexOrThrow("_COUNT");
        obj = new LinkedHashMap();
_L5:
        s = cursor.getString(j);
        s1 = cursor.getString(k);
        s2 = cursor.getString(i);
        i1 = cursor.getInt(l);
        if (!TextUtils.isEmpty(s) && !TextUtils.isEmpty(s1) && !TextUtils.isEmpty(s2)) goto _L2; else goto _L1
_L1:
        if (cursor.moveToNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = ((Map) (obj)).values();
        cursor.close();
        return ((Collection) (obj));
_L2:
        ((Map) (obj)).put(s, new a(s, s1, s2, i1));
        if (true) goto _L1; else goto _L3
_L3:
        if (true) goto _L5; else goto _L4
_L4:
        throw exception;
    }

    public static CursorLoader b(Context context, String s)
    {
        return new CursorLoader(context, a, d, e, new String[] {
            s
        }, "date_modified DESC");
    }

    public static PhotoInfo b(Context context)
    {
        Object obj = a(context);
        if (((Cursor) (obj)).moveToFirst())
        {
            if ((obj = c(((Cursor) (obj)))) != null && (context = a(context, ((a) (obj)).a())).moveToFirst())
            {
                return d(context);
            }
        }
        return null;
    }

    public static Collection b(Cursor cursor)
    {
        ArrayList arraylist;
        if (cursor == null || cursor.isClosed())
        {
            return null;
        }
        arraylist = new ArrayList();
        if (cursor.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_46;
        }
        cursor.close();
        cursor.close();
        return null;
        int i = cursor.getColumnIndex("_data");
_L5:
        String s = cursor.getString(i);
        if (!TextUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        if (cursor.moveToNext())
        {
            break; /* Loop/switch isn't completed */
        }
        cursor.close();
        cursor.close();
        return arraylist;
_L2:
        arraylist.add(new PhotoInfo(com.cardinalblue.android.piccollage.lib.e.a.c.b(s), "gallery"));
        if (true) goto _L1; else goto _L3
_L3:
        if (true) goto _L5; else goto _L4
_L4:
        Object obj;
        obj;
        com.cardinalblue.android.piccollage.a.f.a(((Throwable) (obj)));
        cursor.close();
        return null;
        obj;
        com.cardinalblue.android.piccollage.a.f.a(((Throwable) (obj)));
        cursor.close();
        return null;
        obj;
        com.cardinalblue.android.piccollage.a.f.a(((Throwable) (obj)));
        cursor.close();
        return null;
        obj;
        cursor.close();
        throw obj;
    }

    public static CursorLoader c(Context context)
    {
        return new CursorLoader(context, a, b, c, null, "IDX, _COUNT DESC , bucket_display_name, date_added");
    }

    private static a c(Cursor cursor)
    {
        int i = cursor.getColumnIndexOrThrow("_data");
        int j = cursor.getColumnIndexOrThrow("bucket_id");
        int k = cursor.getColumnIndexOrThrow("bucket_display_name");
        int l = cursor.getColumnIndexOrThrow("_COUNT");
        String s = cursor.getString(j);
        String s1 = cursor.getString(k);
        String s2 = cursor.getString(i);
        i = cursor.getInt(l);
        if (TextUtils.isEmpty(s) || TextUtils.isEmpty(s1) || TextUtils.isEmpty(s2))
        {
            return null;
        } else
        {
            return new a(s, s1, s2, i);
        }
    }

    private static PhotoInfo d(Cursor cursor)
    {
        cursor = cursor.getString(cursor.getColumnIndex("_data"));
        if (TextUtils.isEmpty(cursor))
        {
            return null;
        } else
        {
            return new PhotoInfo(com.cardinalblue.android.piccollage.lib.e.a.c.b(cursor), "gallery");
        }
    }

    static 
    {
        a = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
    }
}
