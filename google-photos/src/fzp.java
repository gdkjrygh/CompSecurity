// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;

final class fzp
    implements fzj
{

    private static final String a[] = {
        "utc_timestamp", "timezone_offset", "latitude", "longitude", "width", "height", "filename", "size_bytes", "focal_length", "f_stop", 
        "iso", "exposure", "camera_make", "camera_model", "duration"
    };
    private final Context b;

    public fzp(Context context)
    {
        b = context;
    }

    public final fzw a(fzi fzi1, int i)
    {
        Cursor cursor;
        Object obj = null;
        fzi1 = fzi1.a;
        cursor = mvj.b(b, i).query("remote_media", a, "media_key == ?", new String[] {
            fzi1
        }, null, null, null);
        fzi1 = obj;
        if (cursor.moveToFirst())
        {
            fzi1 = new fzy();
            fzi1.c = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow("utc_timestamp")));
            fzi1.s = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow("timezone_offset")));
            fzi1.a = Double.valueOf(cursor.getDouble(cursor.getColumnIndexOrThrow("latitude")));
            fzi1.b = Double.valueOf(cursor.getDouble(cursor.getColumnIndexOrThrow("longitude")));
            fzi1.d = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow("width")));
            fzi1.e = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow("height")));
            fzi1.g = cursor.getString(cursor.getColumnIndexOrThrow("filename"));
            fzi1.i = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow("size_bytes")));
            fzi1.j = Float.valueOf(cursor.getFloat(cursor.getColumnIndexOrThrow("focal_length")));
            fzi1.k = Float.valueOf(cursor.getFloat(cursor.getColumnIndexOrThrow("f_stop")));
            fzi1.l = Float.valueOf(cursor.getFloat(cursor.getColumnIndexOrThrow("exposure")));
            fzi1.m = Integer.valueOf(cursor.getInt(cursor.getColumnIndexOrThrow("iso")));
            fzi1.o = cursor.getString(cursor.getColumnIndexOrThrow("camera_make"));
            fzi1.o = cursor.getString(cursor.getColumnIndexOrThrow("camera_model"));
            fzi1.q = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow("duration")));
            fzi1 = fzi1.a();
        }
        cursor.close();
        return fzi1;
        fzi1;
        cursor.close();
        throw fzi1;
    }

    public final boolean a(fzi fzi1)
    {
        return !TextUtils.isEmpty(fzi1.a);
    }

}
