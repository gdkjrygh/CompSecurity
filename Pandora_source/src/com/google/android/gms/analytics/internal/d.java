// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.internal.zzht;
import java.io.Closeable;
import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.http.NameValuePair;
import org.apache.http.client.utils.URLEncodedUtils;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            zzd, c, zze, zzaa, 
//            zzq, zzae, zzg, zzal, 
//            zzw

class d extends zzd
    implements Closeable
{
    class a extends SQLiteOpenHelper
    {

        final d a;

        private void a(SQLiteDatabase sqlitedatabase)
        {
            boolean flag1 = true;
            Set set = b(sqlitedatabase, "hits2");
            String as[] = new String[4];
            as[0] = "hit_id";
            as[1] = "hit_string";
            as[2] = "hit_time";
            as[3] = "hit_url";
            int j1 = as.length;
            for (int i1 = 0; i1 < j1; i1++)
            {
                String s = as[i1];
                if (!set.remove(s))
                {
                    throw new SQLiteException((new StringBuilder()).append("Database hits2 is missing required column: ").append(s).toString());
                }
            }

            boolean flag;
            if (!set.remove("hit_app_id"))
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            if (!set.isEmpty())
            {
                throw new SQLiteException("Database hits2 has extra columns");
            }
            if (flag)
            {
                sqlitedatabase.execSQL("ALTER TABLE hits2 ADD COLUMN hit_app_id INTEGER");
            }
        }

        private boolean a(SQLiteDatabase sqlitedatabase, String s)
        {
            SQLiteDatabase sqlitedatabase1 = null;
            sqlitedatabase = sqlitedatabase.query("SQLITE_MASTER", new String[] {
                "name"
            }, "name=?", new String[] {
                s
            }, null, null, null);
            sqlitedatabase1 = sqlitedatabase;
            sqlitedatabase = sqlitedatabase1;
            boolean flag = sqlitedatabase1.moveToFirst();
            if (sqlitedatabase1 != null)
            {
                sqlitedatabase1.close();
            }
            return flag;
            SQLiteException sqliteexception;
            sqliteexception;
            sqlitedatabase1 = null;
_L4:
            sqlitedatabase = sqlitedatabase1;
            a.zzc("Error querying for table", s, sqliteexception);
            if (sqlitedatabase1 != null)
            {
                sqlitedatabase1.close();
            }
            return false;
            sqlitedatabase;
            s = sqlitedatabase1;
_L2:
            if (s != null)
            {
                s.close();
            }
            throw sqlitedatabase;
            Exception exception;
            exception;
            s = sqlitedatabase;
            sqlitedatabase = exception;
            if (true) goto _L2; else goto _L1
_L1:
            sqliteexception;
            if (true) goto _L4; else goto _L3
_L3:
        }

        private Set b(SQLiteDatabase sqlitedatabase, String s)
        {
            HashSet hashset;
            hashset = new HashSet();
            sqlitedatabase = sqlitedatabase.rawQuery((new StringBuilder()).append("SELECT * FROM ").append(s).append(" LIMIT 0").toString(), null);
            s = sqlitedatabase.getColumnNames();
            int i1 = 0;
_L2:
            if (i1 >= s.length)
            {
                break; /* Loop/switch isn't completed */
            }
            hashset.add(s[i1]);
            i1++;
            if (true) goto _L2; else goto _L1
_L1:
            sqlitedatabase.close();
            return hashset;
            s;
            sqlitedatabase.close();
            throw s;
        }

        private void b(SQLiteDatabase sqlitedatabase)
        {
            int i1 = 0;
            sqlitedatabase = b(sqlitedatabase, "properties");
            String as[] = new String[6];
            as[0] = "app_uid";
            as[1] = "cid";
            as[2] = "tid";
            as[3] = "params";
            as[4] = "adid";
            as[5] = "hits_count";
            for (int j1 = as.length; i1 < j1; i1++)
            {
                String s = as[i1];
                if (!sqlitedatabase.remove(s))
                {
                    throw new SQLiteException((new StringBuilder()).append("Database properties is missing required column: ").append(s).toString());
                }
            }

            if (!sqlitedatabase.isEmpty())
            {
                throw new SQLiteException("Database properties table has extra columns");
            } else
            {
                return;
            }
        }

        public SQLiteDatabase getWritableDatabase()
        {
            if (!d.a(a).a(0x36ee80L))
            {
                throw new SQLiteException("Database open failed");
            }
            SQLiteDatabase sqlitedatabase;
            try
            {
                sqlitedatabase = super.getWritableDatabase();
            }
            catch (SQLiteException sqliteexception)
            {
                d.a(a).a();
                a.zzaJ("Opening the database failed, dropping the table and recreating it");
                Object obj = d.b(a);
                a.getContext().getDatabasePath(((String) (obj))).delete();
                try
                {
                    obj = super.getWritableDatabase();
                    d.a(a).b();
                }
                catch (SQLiteException sqliteexception1)
                {
                    a.zze("Failed to open freshly created database", sqliteexception1);
                    throw sqliteexception1;
                }
                return ((SQLiteDatabase) (obj));
            }
            return sqlitedatabase;
        }

        public void onCreate(SQLiteDatabase sqlitedatabase)
        {
            zzw.zzaQ(sqlitedatabase.getPath());
        }

        public void onOpen(SQLiteDatabase sqlitedatabase)
        {
            Cursor cursor;
            if (android.os.Build.VERSION.SDK_INT >= 15)
            {
                break MISSING_BLOCK_LABEL_29;
            }
            cursor = sqlitedatabase.rawQuery("PRAGMA journal_mode=memory", null);
            cursor.moveToFirst();
            cursor.close();
            if (!a(sqlitedatabase, "hits2"))
            {
                sqlitedatabase.execSQL(d.k());
            } else
            {
                a(sqlitedatabase);
            }
            if (!a(sqlitedatabase, "properties"))
            {
                sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS properties ( app_uid INTEGER NOT NULL, cid TEXT NOT NULL, tid TEXT NOT NULL, params TEXT NOT NULL, adid INTEGER NOT NULL, hits_count INTEGER NOT NULL, PRIMARY KEY (app_uid, cid, tid)) ;");
                return;
            } else
            {
                b(sqlitedatabase);
                return;
            }
            sqlitedatabase;
            cursor.close();
            throw sqlitedatabase;
        }

        public void onUpgrade(SQLiteDatabase sqlitedatabase, int i1, int j1)
        {
        }

        a(Context context, String s)
        {
            a = d.this;
            super(context, s, null, 1);
        }
    }


    private static final String a = String.format("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' INTEGER NOT NULL, '%s' TEXT NOT NULL, '%s' TEXT NOT NULL, '%s' INTEGER);", new Object[] {
        "hits2", "hit_id", "hit_time", "hit_url", "hit_string", "hit_app_id"
    });
    private static final String b = String.format("SELECT MAX(%s) FROM %s WHERE 1;", new Object[] {
        "hit_time", "hits2"
    });
    private final a c;
    private final c d = new c(zzgG());
    private final c e = new c(zzgG());

    d(zze zze1)
    {
        super(zze1);
        String s = m();
        c = new a(zze1.getContext(), s);
    }

    private long a(String s, String as[])
    {
        String as1[];
        String as2[];
        SQLiteDatabase sqlitedatabase;
        sqlitedatabase = j();
        as2 = null;
        as1 = null;
        as = sqlitedatabase.rawQuery(s, as);
        as1 = as;
        as2 = as;
        if (!as.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_60;
        }
        as1 = as;
        as2 = as;
        long l1 = as.getLong(0);
        if (as != null)
        {
            as.close();
        }
        return l1;
        as1 = as;
        as2 = as;
        try
        {
            throw new SQLiteException("Database returned empty set");
        }
        // Misplaced declaration of an exception variable
        catch (String as[])
        {
            as2 = as1;
        }
        finally
        {
            if (as2 == null) goto _L0; else goto _L0
        }
        zzd("Database error", s, as);
        as2 = as1;
        throw as;
        as2.close();
        throw s;
    }

    private long a(String s, String as[], long l1)
    {
        String as1[];
        String as2[];
        SQLiteDatabase sqlitedatabase;
        sqlitedatabase = j();
        as2 = null;
        as1 = null;
        as = sqlitedatabase.rawQuery(s, as);
        as1 = as;
        as2 = as;
        if (!as.moveToFirst()) goto _L2; else goto _L1
_L1:
        as1 = as;
        as2 = as;
        l1 = as.getLong(0);
        long l2;
        l2 = l1;
        if (as != null)
        {
            as.close();
            l2 = l1;
        }
_L4:
        return l2;
_L2:
        l2 = l1;
        if (as == null) goto _L4; else goto _L3
_L3:
        as.close();
        return l1;
        as;
        as2 = as1;
        zzd("Database error", s, as);
        as2 = as1;
        throw as;
        s;
        if (as2 != null)
        {
            as2.close();
        }
        throw s;
    }

    static c a(d d1)
    {
        return d1.e;
    }

    private static String a(Map map)
    {
        zzv.zzr(map);
        Object obj = new android.net.Uri.Builder();
        java.util.Map.Entry entry;
        for (map = map.entrySet().iterator(); map.hasNext(); ((android.net.Uri.Builder) (obj)).appendQueryParameter((String)entry.getKey(), (String)entry.getValue()))
        {
            entry = (java.util.Map.Entry)map.next();
        }

        obj = ((android.net.Uri.Builder) (obj)).build().getEncodedQuery();
        map = ((Map) (obj));
        if (obj == null)
        {
            map = "";
        }
        return map;
    }

    static String b(d d1)
    {
        return d1.m();
    }

    private String b(zzaa zzaa1)
    {
        if (zzaa1.zziR())
        {
            return zzgI().zzid();
        } else
        {
            return zzgI().zzie();
        }
    }

    private static String c(zzaa zzaa1)
    {
        zzv.zzr(zzaa1);
        Object obj = new android.net.Uri.Builder();
        zzaa1 = zzaa1.zzhe().entrySet().iterator();
        do
        {
            if (!zzaa1.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)zzaa1.next();
            String s = (String)entry.getKey();
            if (!"ht".equals(s) && !"qt".equals(s) && !"AppUID".equals(s))
            {
                ((android.net.Uri.Builder) (obj)).appendQueryParameter(s, (String)entry.getValue());
            }
        } while (true);
        obj = ((android.net.Uri.Builder) (obj)).build().getEncodedQuery();
        zzaa1 = ((zzaa) (obj));
        if (obj == null)
        {
            zzaa1 = "";
        }
        return zzaa1;
    }

    static String k()
    {
        return a;
    }

    private void l()
    {
        int i1 = zzgI().zzin();
        long l1 = f();
        if (l1 > (long)(i1 - 1))
        {
            List list = a((l1 - (long)i1) + 1L);
            zzd("Store full, deleting hits to make room, count", Integer.valueOf(list.size()));
            a(list);
        }
    }

    private String m()
    {
        if (!zzgI().zzhP())
        {
            return zzgI().zzip();
        }
        if (zzgI().zzhQ())
        {
            return zzgI().zzip();
        } else
        {
            return zzgI().zziq();
        }
    }

    public long a(long l1, String s, String s1)
    {
        zzv.zzbS(s);
        zzv.zzbS(s1);
        zzgR();
        zzgF();
        return a("SELECT hits_count FROM properties WHERE app_uid=? AND cid=? AND tid=?", new String[] {
            String.valueOf(l1), s, s1
        }, 0L);
    }

    public List a(long l1)
    {
        Object obj;
        Object obj1;
        ArrayList arraylist;
        obj1 = null;
        zzgF();
        zzgR();
        if (l1 <= 0L)
        {
            return Collections.emptyList();
        }
        obj = j();
        arraylist = new ArrayList();
        String s = String.format("%s ASC", new Object[] {
            "hit_id"
        });
        String s1 = Long.toString(l1);
        obj = ((SQLiteDatabase) (obj)).query("hits2", new String[] {
            "hit_id"
        }, null, null, null, null, s, s1);
        obj1 = obj;
        obj = obj1;
        if (!((Cursor) (obj1)).moveToFirst()) goto _L2; else goto _L1
_L1:
        obj = obj1;
        arraylist.add(Long.valueOf(((Cursor) (obj1)).getLong(0)));
        obj = obj1;
        boolean flag = ((Cursor) (obj1)).moveToNext();
        if (flag) goto _L1; else goto _L2
_L2:
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
        }
_L3:
        return arraylist;
        Object obj2;
        obj2;
        obj1 = null;
_L6:
        obj = obj1;
        zzd("Error selecting hit ids", obj2);
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
        }
          goto _L3
        obj;
_L5:
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
        }
        throw obj;
        obj2;
        obj1 = obj;
        obj = obj2;
        if (true) goto _L5; else goto _L4
_L4:
        obj2;
          goto _L6
    }

    Map a(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            return new HashMap(0);
        }
        Object obj;
        if (!s.startsWith("?"))
        {
            try
            {
                s = (new StringBuilder()).append("?").append(s).toString();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                zze("Error parsing hit parameters", s);
                return new HashMap(0);
            }
        }
        obj = URLEncodedUtils.parse(new URI(s), "UTF-8");
        s = new HashMap(((List) (obj)).size());
        NameValuePair namevaluepair;
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); s.put(namevaluepair.getName(), namevaluepair.getValue()))
        {
            namevaluepair = (NameValuePair)((Iterator) (obj)).next();
        }

        return s;
    }

    public void a()
    {
        zzgR();
        j().beginTransaction();
    }

    public void a(long l1, String s)
    {
        zzv.zzbS(s);
        zzgR();
        zzgF();
        int i1 = j().delete("properties", "app_uid=? AND cid<>?", new String[] {
            String.valueOf(l1), s
        });
        if (i1 > 0)
        {
            zza("Deleted property records", Integer.valueOf(i1));
        }
    }

    public void a(zzaa zzaa1)
    {
        SQLiteDatabase sqlitedatabase;
        ContentValues contentvalues;
        zzv.zzr(zzaa1);
        zzgF();
        zzgR();
        String s = c(zzaa1);
        if (s.length() > 8192)
        {
            zzgH().zza(zzaa1, "Hit length exceeds the maximum allowed size");
            return;
        }
        l();
        sqlitedatabase = j();
        contentvalues = new ContentValues();
        contentvalues.put("hit_string", s);
        contentvalues.put("hit_time", Long.valueOf(zzaa1.zziP()));
        contentvalues.put("hit_app_id", Integer.valueOf(zzaa1.zziN()));
        contentvalues.put("hit_url", b(zzaa1));
        long l1 = sqlitedatabase.insert("hits2", null, contentvalues);
        if (l1 == -1L)
        {
            try
            {
                zzaJ("Failed to insert a hit (got -1)");
                return;
            }
            // Misplaced declaration of an exception variable
            catch (zzaa zzaa1)
            {
                zze("Error storing a hit", zzaa1);
            }
            return;
        }
        zzb("Hit saved to database. db-id, hit", Long.valueOf(l1), zzaa1);
        return;
    }

    public void a(zzg zzg1)
    {
        zzv.zzr(zzg1);
        zzgR();
        zzgF();
        SQLiteDatabase sqlitedatabase = j();
        String s = a(zzg1.zzhe());
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("app_uid", Long.valueOf(zzg1.zzha()));
        contentvalues.put("cid", zzg1.getClientId());
        contentvalues.put("tid", zzg1.zzhb());
        int i1;
        if (zzg1.zzhc())
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        contentvalues.put("adid", Integer.valueOf(i1));
        contentvalues.put("hits_count", Long.valueOf(zzg1.zzhd()));
        contentvalues.put("params", s);
        try
        {
            if (sqlitedatabase.insertWithOnConflict("properties", null, contentvalues, 5) == -1L)
            {
                zzaJ("Failed to insert/update a property (got -1)");
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (zzg zzg1)
        {
            zze("Error storing a property", zzg1);
        }
    }

    public void a(List list)
    {
        zzv.zzr(list);
        zzgF();
        zzgR();
        if (!list.isEmpty())
        {
            Object obj = new StringBuilder("hit_id");
            ((StringBuilder) (obj)).append(" in (");
            for (int i1 = 0; i1 < list.size(); i1++)
            {
                Long long1 = (Long)list.get(i1);
                if (long1 == null || long1.longValue() == 0L)
                {
                    throw new SQLiteException("Invalid hit id");
                }
                if (i1 > 0)
                {
                    ((StringBuilder) (obj)).append(",");
                }
                ((StringBuilder) (obj)).append(long1);
            }

            ((StringBuilder) (obj)).append(")");
            obj = ((StringBuilder) (obj)).toString();
            try
            {
                SQLiteDatabase sqlitedatabase = j();
                zza("Deleting dispatched hits. count", Integer.valueOf(list.size()));
                int j1 = sqlitedatabase.delete("hits2", ((String) (obj)), null);
                if (j1 != list.size())
                {
                    zzb("Deleted fewer hits then expected", Integer.valueOf(list.size()), Integer.valueOf(j1), obj);
                    return;
                }
            }
            // Misplaced declaration of an exception variable
            catch (List list)
            {
                zze("Error deleting hits", list);
                throw list;
            }
        }
    }

    public List b(long l1)
    {
        Object obj;
        Object obj1;
        boolean flag = true;
        obj1 = null;
        Object obj2;
        String s;
        String s1;
        int i1;
        long l2;
        if (l1 < 0L)
        {
            flag = false;
        }
        zzv.zzQ(flag);
        zzgF();
        zzgR();
        obj2 = j();
        obj = obj1;
        s = String.format("%s ASC", new Object[] {
            "hit_id"
        });
        obj = obj1;
        s1 = Long.toString(l1);
        obj = obj1;
        obj1 = ((SQLiteDatabase) (obj2)).query("hits2", new String[] {
            "hit_id", "hit_time", "hit_string", "hit_url", "hit_app_id"
        }, null, null, null, null, s, s1);
        obj = obj1;
        obj2 = new ArrayList();
        obj = obj1;
        if (!((Cursor) (obj1)).moveToFirst()) goto _L2; else goto _L1
_L1:
        obj = obj1;
        l1 = ((Cursor) (obj1)).getLong(0);
        obj = obj1;
        l2 = ((Cursor) (obj1)).getLong(1);
        obj = obj1;
        s = ((Cursor) (obj1)).getString(2);
        obj = obj1;
        s1 = ((Cursor) (obj1)).getString(3);
        obj = obj1;
        i1 = ((Cursor) (obj1)).getInt(4);
        obj = obj1;
        ((List) (obj2)).add(new zzaa(this, a(s), l2, zzal.zzaZ(s1), l1, i1));
        obj = obj1;
        flag = ((Cursor) (obj1)).moveToNext();
        if (flag) goto _L1; else goto _L2
_L2:
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
        }
        return ((List) (obj2));
        obj1;
        obj = null;
_L6:
        zze("Error loading hits from the database", obj1);
        throw obj1;
        obj1;
_L4:
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        throw obj1;
        obj1;
        if (true) goto _L4; else goto _L3
_L3:
        SQLiteException sqliteexception;
        sqliteexception;
        obj = obj1;
        obj1 = sqliteexception;
        if (true) goto _L6; else goto _L5
_L5:
    }

    Map b(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            return new HashMap(0);
        }
        try
        {
            Object obj = URLEncodedUtils.parse(new URI((new StringBuilder()).append("?").append(s).toString()), "UTF-8");
            s = new HashMap(((List) (obj)).size());
            NameValuePair namevaluepair;
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); s.put(namevaluepair.getName(), namevaluepair.getValue()))
            {
                namevaluepair = (NameValuePair)((Iterator) (obj)).next();
            }

        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            zze("Error parsing property parameters", s);
            return new HashMap(0);
        }
        return s;
    }

    public void b()
    {
        zzgR();
        j().setTransactionSuccessful();
    }

    public void c()
    {
        zzgR();
        j().endTransaction();
    }

    public void c(long l1)
    {
        zzgF();
        zzgR();
        ArrayList arraylist = new ArrayList(1);
        arraylist.add(Long.valueOf(l1));
        zza("Deleting hit, id", Long.valueOf(l1));
        a(arraylist);
    }

    public void close()
    {
        try
        {
            c.close();
            return;
        }
        catch (SQLiteException sqliteexception)
        {
            zze("Sql error closing database", sqliteexception);
            return;
        }
        catch (IllegalStateException illegalstateexception)
        {
            zze("Error closing database", illegalstateexception);
        }
    }

    public List d(long l1)
    {
        Cursor cursor;
        Cursor cursor1;
        Object obj1;
        zzgR();
        zzgF();
        obj1 = j();
        cursor1 = null;
        cursor = cursor1;
        int i1 = zzgI().zzio();
        cursor = cursor1;
        cursor1 = ((SQLiteDatabase) (obj1)).query("properties", new String[] {
            "cid", "tid", "adid", "hits_count", "params"
        }, "app_uid=?", new String[] {
            String.valueOf(l1)
        }, null, null, null, String.valueOf(i1));
        cursor = cursor1;
        obj1 = new ArrayList();
        cursor = cursor1;
        if (!cursor1.moveToFirst()) goto _L2; else goto _L1
_L1:
        cursor = cursor1;
        String s = cursor1.getString(0);
        cursor = cursor1;
        String s1 = cursor1.getString(1);
        cursor = cursor1;
        Map map;
        long l2;
        boolean flag;
        if (cursor1.getInt(2) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        cursor = cursor1;
        l2 = cursor1.getInt(3);
        cursor = cursor1;
        map = b(cursor1.getString(4));
        cursor = cursor1;
        if (TextUtils.isEmpty(s)) goto _L4; else goto _L3
_L3:
        cursor = cursor1;
        if (!TextUtils.isEmpty(s1)) goto _L5; else goto _L4
_L4:
        cursor = cursor1;
        zzc("Read property with empty client id or tracker id", s, s1);
_L6:
        cursor = cursor1;
        if (cursor1.moveToNext()) goto _L1; else goto _L2
_L2:
        cursor = cursor1;
        if (((List) (obj1)).size() < i1)
        {
            break MISSING_BLOCK_LABEL_271;
        }
        cursor = cursor1;
        zzaI("Sending hits to too many properties. Campaign report might be incorrect");
        if (cursor1 != null)
        {
            cursor1.close();
        }
        return ((List) (obj1));
_L5:
        cursor = cursor1;
        ((List) (obj1)).add(new zzg(l1, s, s1, flag, l2, map));
          goto _L6
        SQLiteException sqliteexception;
        sqliteexception;
        Object obj;
        cursor = cursor1;
        obj = sqliteexception;
_L10:
        zze("Error loading hits from the database", obj);
        throw obj;
        obj;
_L8:
        if (cursor != null)
        {
            cursor.close();
        }
        throw obj;
        obj;
        if (true) goto _L8; else goto _L7
_L7:
        obj;
        cursor = null;
        if (true) goto _L10; else goto _L9
_L9:
    }

    public void d()
    {
        zzgF();
        zzgR();
        j().delete("hits2", null, null);
    }

    public void e()
    {
        zzgF();
        zzgR();
        j().delete("properties", null, null);
    }

    public long f()
    {
        zzgF();
        zzgR();
        return a("SELECT COUNT(*) FROM hits2", ((String []) (null)));
    }

    boolean g()
    {
        return f() == 0L;
    }

    public int h()
    {
        zzgF();
        zzgR();
        if (!d.a(0x5265c00L))
        {
            return 0;
        } else
        {
            d.a();
            zzaF("Deleting stale hits (if any)");
            int i1 = j().delete("hits2", "hit_time < ?", new String[] {
                Long.toString(zzgG().currentTimeMillis() - 0x9a7ec800L)
            });
            zza("Deleted stale hits, count", Integer.valueOf(i1));
            return i1;
        }
    }

    public long i()
    {
        zzgF();
        zzgR();
        return a(b, ((String []) (null)), 0L);
    }

    SQLiteDatabase j()
    {
        SQLiteDatabase sqlitedatabase;
        try
        {
            sqlitedatabase = c.getWritableDatabase();
        }
        catch (SQLiteException sqliteexception)
        {
            zzd("Error opening database", sqliteexception);
            throw sqliteexception;
        }
        return sqlitedatabase;
    }

    protected void zzgb()
    {
    }

}
