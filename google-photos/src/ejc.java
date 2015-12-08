// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;

public final class ejc
{

    public static final ekk a = (new ekm()).b(feu).b(fzu).a();
    private static final String d[] = {
        "_display_name", "_size", "mime_type", "_data"
    };
    private static final String e[] = {
        "orientation", "datetaken", "latitude", "longitude"
    };
    private static final String f[] = {
        "datetaken", "latitude", "longitude"
    };
    public final eir b;
    public final ejg c;
    private final ContentResolver g;

    ejc(Context context, ContentResolver contentresolver)
    {
        c = (ejg)olm.a(context, ejg);
        g = contentresolver;
        b = (eir)olm.a(context, eir);
    }

    public eja a(eiz eiz1)
    {
        Object obj;
        android.net.Uri uri;
        Cursor cursor;
        uri = eiz1.d;
        obj = b(eiz1);
        cursor = g.query(uri, d, null, null, null);
        if (!cursor.moveToFirst()) goto _L2; else goto _L1
_L1:
        eiz1 = cursor.getString(cursor.getColumnIndexOrThrow("mime_type"));
        obj.d = cursor.getString(cursor.getColumnIndexOrThrow("_data"));
        obj.a = cursor.getString(cursor.getColumnIndexOrThrow("_display_name"));
        obj.b = cursor.getLong(cursor.getColumnIndexOrThrow("_size"));
        obj.c = eiz1;
_L9:
        if (cursor != null)
        {
            cursor.close();
        }
        if (!oql.b(uri)) goto _L4; else goto _L3
_L3:
        if (!ejv.a(eiz1) && !ejv.c(eiz1)) goto _L6; else goto _L5
_L5:
        eiz1 = g.query(uri, e, null, null, null);
        if (eiz1.moveToFirst())
        {
            obj.e = eiz1.getInt(eiz1.getColumnIndexOrThrow("orientation"));
            obj.f = eiz1.getLong(eiz1.getColumnIndexOrThrow("datetaken"));
            int i = eiz1.getColumnIndexOrThrow("latitude");
            int k = eiz1.getColumnIndexOrThrow("longitude");
            if (!eiz1.isNull(i) && !eiz1.isNull(k))
            {
                ((ejb) (obj)).a(eiz1.getFloat(i)).b(eiz1.getFloat(k));
            }
        }
        if (eiz1 != null)
        {
            eiz1.close();
        }
_L4:
        return ((ejb) (obj)).a();
        eiz1;
        if (cursor != null)
        {
            cursor.close();
        }
        throw eiz1;
        obj;
        if (eiz1 != null)
        {
            eiz1.close();
        }
        throw obj;
_L6:
        if (!ejv.b(eiz1))
        {
            continue; /* Loop/switch isn't completed */
        }
        eiz1 = g.query(uri, f, null, null, null);
        if (eiz1.moveToFirst())
        {
            obj.f = eiz1.getLong(eiz1.getColumnIndexOrThrow("datetaken"));
            int j = eiz1.getColumnIndexOrThrow("latitude");
            int l = eiz1.getColumnIndexOrThrow("longitude");
            if (!eiz1.isNull(j) && !eiz1.isNull(l))
            {
                ((ejb) (obj)).a(eiz1.getFloat(j)).b(eiz1.getFloat(l));
            }
        }
        if (eiz1 != null)
        {
            eiz1.close();
        }
        if (true) goto _L4; else goto _L7
_L7:
        Exception exception;
        exception;
        if (eiz1 != null)
        {
            eiz1.close();
        }
        throw exception;
_L2:
        eiz1 = null;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public ejb b(eiz eiz1)
    {
        Object obj;
        ejb ejb1;
        ejb1 = new ejb();
        obj = eiz1.c;
        ejd.a[((euv) (obj)).ordinal()];
        JVM INSTR tableswitch 1 2: default 44
    //                   1 80
    //                   2 86;
           goto _L1 _L2 _L3
_L1:
        obj = "image.jpg";
_L5:
        ejb1.a = ((String) (obj));
        ejb1.c = ejv.a(eiz1.c);
        ejb1.f = 0L;
        ejb1.b = 0L;
        ejb1.e = 0;
        return ejb1;
_L2:
        obj = "image.gif";
        continue; /* Loop/switch isn't completed */
_L3:
        obj = "video.mpeg";
        if (true) goto _L5; else goto _L4
_L4:
    }

}
