// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import java.util.List;

public final class gjr
{

    private static onj b = new onj("debug.photos.ondevice.index");
    private static onj c = new onj("debug.photos.ondevice.facequery");
    private static oni d = new oni("debug.photos.ondevice.fexplore");
    private final Context a;

    public gjr(Context context)
    {
        a = context;
    }

    public static int a(SQLiteDatabase sqlitedatabase, int i)
    {
        return sqlitedatabase.delete("on_device_person_cluster", "id = ?", new String[] {
            Integer.toString(i)
        });
    }

    public static int a(SQLiteDatabase sqlitedatabase, String s)
    {
        return sqlitedatabase.delete("on_device_search", "dedup_key = ?", new String[] {
            s
        });
    }

    public static int a(SQLiteDatabase sqlitedatabase, String s, int i)
    {
        return sqlitedatabase.delete("on_device_search", "dedup_key = ? AND tag = ?", new String[] {
            s, gka.a(i).a()
        });
    }

    public static eve a(gka gka1, int i, int j)
    {
        return new eve(dd.a(i, j), new String[] {
            gka1.a()
        });
    }

    public static eve a(gka gka1, long l, String s)
    {
        Object obj = gjw.a(l);
        String s1 = String.valueOf(((gjx) (obj)).a);
        obj = String.valueOf(((gjx) (obj)).b);
        return new eve("SELECT dedup_key FROM on_device_search WHERE tag = ? AND ((capture_day > ?) OR(capture_day = ? AND capture_offset > ?) OR(capture_day = ? AND capture_offset = ? AND dedup_key > ?)) ORDER BY capture_day DESC, capture_offset DESC, dedup_key DESC", new String[] {
            gka1.a(), s1, s1, obj, s1, obj, s
        });
    }

    public static gjs a(gka gka1)
    {
        return new gjs(gka1);
    }

    public static void a(SQLiteDatabase sqlitedatabase, int i, String s, double d1, String s1)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("id", Integer.valueOf(i));
        contentvalues.put("iconic_image_url", s);
        contentvalues.put("topicality_score", Double.valueOf(d1));
        contentvalues.put("media_key", s1);
        sqlitedatabase.insertWithOnConflict("on_device_person_cluster", null, contentvalues, 5);
    }

    public static void a(SQLiteDatabase sqlitedatabase, String s, gka gka1, long l)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("tag", gka1.a());
        gka1 = gjw.a(l);
        contentvalues.put("capture_day", Integer.valueOf(((gjx) (gka1)).a));
        contentvalues.put("capture_offset", Integer.valueOf(((gjx) (gka1)).b));
        contentvalues.put("dedup_key", s);
        sqlitedatabase.insertWithOnConflict("on_device_search", null, (new gjw(contentvalues)).a, 4);
    }

    public static boolean a()
    {
        return true;
    }

    public static boolean a(Context context, int i)
    {
        return ((myf)olm.a(context, myf)).a(gjn.a, i);
    }

    public static int b(SQLiteDatabase sqlitedatabase, String s)
    {
        return dc.a(sqlitedatabase, s);
    }

    public static eve b(gka gka1)
    {
        return new eve(dd.a(-1, -1), new String[] {
            gka1.a()
        });
    }

    public static List b(SQLiteDatabase sqlitedatabase, int i)
    {
        return dc.a(sqlitedatabase, i);
    }

    public static boolean b()
    {
        return false;
    }

    public final void a(int i, boolean flag)
    {
        ((mmv)olm.a(a, mmv)).b(i).h("OnDeviceSearch").c("require_index_sync", flag).d();
    }

    public final boolean a(int i)
    {
        boolean flag;
        try
        {
            flag = ((mmv)olm.a(a, mmv)).a(i).d("OnDeviceSearch").a("require_index_sync", true);
        }
        catch (mmy mmy1)
        {
            return false;
        }
        return flag;
    }

}
