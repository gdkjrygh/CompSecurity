// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDoneException;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class eto
{

    private static final Uri f = Uri.parse("content://GPhotos/all_photos");
    private static final String g[] = {
        "media_key", "photo_id", "collection_id"
    };
    private static final String h[] = {
        "content_uri"
    };
    private static final String i[] = {
        "media_key", "dedup_key", "utc_timestamp", "timezone_offset"
    };
    private static final String j[] = {
        "timezone_offset"
    };
    private static final String k[] = {
        "_id", "capture_timestamp"
    };
    public final Context a;
    public final noz b;
    public final etw c;
    public final noz d;
    public final erj e;
    private final noz l;
    private final noz m;
    private final euw n;

    public eto(Context context, erj erj1)
    {
        a = context;
        e = erj1;
        b = noz.a(context, 3, "MediaOperations", new String[] {
            "perf"
        });
        l = noz.a(context, 2, "MediaOperations", new String[0]);
        d = noz.a(context, "MediaOperations", new String[0]);
        m = noz.a(context, 3, "MediaOperations", new String[0]);
        c = (etw)olm.a(context, etw);
        n = (euw)olm.a(context, euw);
    }

    private int a(SQLiteDatabase sqlitedatabase, int i1, String s, String s1, String s2, erb erb1)
    {
        s = new esv(s, s1, s2);
        return !c.a(sqlitedatabase, i1, s, erb1) ? 0 : 1;
    }

    private static long a(SQLiteDatabase sqlitedatabase, qgg qgg1, String s)
    {
        qgg1 = qgg1.c.g;
        if (qgg1 != null)
        {
            break MISSING_BLOCK_LABEL_100;
        }
        s = sqlitedatabase.query("local_media", j, "dedup_key = ?", new String[] {
            s
        }, null, null, null);
        if (!s.moveToFirst()) goto _L2; else goto _L1
_L1:
        long l1 = s.getLong(s.getColumnIndexOrThrow("timezone_offset"));
        sqlitedatabase = Long.valueOf(l1);
_L3:
        s.close();
_L4:
        qgg1 = sqlitedatabase;
        if (sqlitedatabase == null)
        {
            qgg1 = Long.valueOf(0L);
        }
        return qgg1.longValue();
        sqlitedatabase;
        s.close();
        throw sqlitedatabase;
_L2:
        sqlitedatabase = qgg1;
          goto _L3
        sqlitedatabase = qgg1;
          goto _L4
    }

    static Context a(eto eto1)
    {
        return eto1.a;
    }

    public static Uri a(int i1)
    {
        return f.buildUpon().appendEncodedPath(Integer.toString(i1)).build();
    }

    public static Uri a(int i1, String s)
    {
        return f.buildUpon().appendEncodedPath(s).appendEncodedPath(Integer.toString(i1)).build();
    }

    private ett a(int i1, SQLiteDatabase sqlitedatabase, qgg aqgg[], erb erb1)
    {
        HashSet hashset;
        int j1;
        int k1;
        int j2;
        int l2;
        long l3;
        long l4;
        j1 = 0;
        hashset = new HashSet();
        k1 = 0;
        l2 = aqgg.length;
        j2 = 0;
        l4 = 0L;
        l3 = 0L;
_L3:
        if (j2 >= l2) goto _L2; else goto _L1
_L1:
        byte abyte0[];
        qgg qgg1;
        String s1;
        long l5;
        qgg1 = aqgg[j2];
        s1 = a(sqlitedatabase, qgg1);
        l5 = noy.a();
        int l1 = qgg1.d();
        abyte0 = n.a(l1);
        eui eui1;
        String s;
        long l6;
        long l7;
        eui1 = eui.a(qgg1, s1, abyte0);
        eui1.a(a(sqlitedatabase, qgg1, s1));
        l6 = noy.a();
        l7 = noy.a();
        s = a(sqlitedatabase, eui1.d());
        int i2;
        i2 = k1;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_224;
        }
        i2 = k1;
        if (!TextUtils.equals(s1, s))
        {
            ett ett1 = a(sqlitedatabase, i1, eui1.d(), erb1);
            if (m.a())
            {
                noy.a("media key", eui1.d());
                noy.a("old dedup key", s);
                noy.a("new dedup key", eui1.a());
                noy.a("deleted", Integer.valueOf(ett1.a));
            }
            i2 = k1 + ett1.a;
        }
        if (!c.a(sqlitedatabase, i1, new esw(eui1.a, "remote_media", eui1.c, "utc_timestamp", "timezone_offset", qgg1), erb1))
        {
            break MISSING_BLOCK_LABEL_457;
        }
        int k2;
        k2 = j1 + 1;
        i2++;
        j1 = i2;
        k1 = k2;
        if (eui1.e() == null)
        {
            break MISSING_BLOCK_LABEL_313;
        }
        hashset.add(eui1.e());
        k1 = k2;
        j1 = i2;
_L4:
        long l8 = noy.a();
        n.a(abyte0);
        if (j1 % 10 == 0 && sqlitedatabase.yieldIfContendedSafely(1000L) && l.a())
        {
            noy.a(i1);
        }
        j2++;
        l4 += l8 - l7;
        i2 = k1;
        l3 += l6 - l5;
        k1 = j1;
        j1 = i2;
          goto _L3
        sqlitedatabase;
        n.a(abyte0);
        throw sqlitedatabase;
_L2:
        if (b.a())
        {
            noy.b("buildTime", l3);
            noy.b("dbTime", l4);
        }
        return new ett(j1, hashset);
        k1 = j1;
        j1 = i2;
          goto _L4
    }

    public static eun a(SQLiteDatabase sqlitedatabase, String s, String s1, String s2, String as[])
    {
        if (!TextUtils.isEmpty(s2))
        {
            s2 = String.valueOf(s2);
            if (s2.length() != 0)
            {
                s2 = " WHERE ".concat(s2);
            } else
            {
                s2 = new String(" WHERE ");
            }
        } else
        {
            s2 = "";
        }
        try
        {
            sqlitedatabase = eun.a((int)DatabaseUtils.longForQuery(sqlitedatabase, (new StringBuilder(String.valueOf(s1).length() + 13 + String.valueOf(s).length() + String.valueOf(s2).length())).append("SELECT ").append(s1).append(" FROM ").append(s).append(s2).toString(), as));
        }
        // Misplaced declaration of an exception variable
        catch (SQLiteDatabase sqlitedatabase)
        {
            return null;
        }
        return sqlitedatabase;
    }

    private String a(SQLiteDatabase sqlitedatabase, String s)
    {
        return a(sqlitedatabase, "remote_media", "media_key", s);
    }

    private static String a(SQLiteDatabase sqlitedatabase, String s, String s1, String s2)
    {
        Object obj = null;
        s1 = String.valueOf(s1).concat(" = ?");
        s = sqlitedatabase.query(s, new String[] {
            "dedup_key"
        }, s1, new String[] {
            s2
        }, null, null, null);
        sqlitedatabase = obj;
        if (s.moveToNext())
        {
            sqlitedatabase = s.getString(s.getColumnIndexOrThrow("dedup_key"));
        }
        s.close();
        return sqlitedatabase;
        sqlitedatabase;
        s.close();
        throw sqlitedatabase;
    }

    private void a(int i1, String s, String s1, Iterable iterable, eun eun1, boolean flag)
    {
        a(i1, s, s1, iterable, eun1, flag, ((Collection) (Collections.emptySet())));
    }

    private void a(int i1, String s, List list, Long long1, boolean flag, boolean flag1, int j1)
    {
        SQLiteDatabase sqlitedatabase;
        long l4;
        l4 = noy.a();
        sqlitedatabase = mvj.a(a, i1);
        sqlitedatabase.beginTransactionNonExclusive();
        Iterator iterator = list.iterator();
_L2:
        etv etv1;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_355;
        }
        etv1 = (etv)iterator.next();
        long l2;
        long l3;
        l3 = -1L;
        l2 = -1L;
        Object obj;
        obj = new mvu(sqlitedatabase);
        obj.a = "media";
        obj.b = k;
        obj.c = "dedup_key = ?";
        obj.d = (new String[] {
            etv1.a
        });
        obj = ((mvu) (obj)).a();
        if (((Cursor) (obj)).moveToFirst())
        {
            int k1 = ((Cursor) (obj)).getColumnIndexOrThrow("_id");
            int i2 = ((Cursor) (obj)).getColumnIndexOrThrow("capture_timestamp");
            l3 = ((Cursor) (obj)).getLong(k1);
            l2 = ((Cursor) (obj)).getLong(i2);
        }
        ((Cursor) (obj)).close();
        if (l3 == -1L || l2 == -1L) goto _L2; else goto _L1
_L1:
        obj = new ContentValues();
        ((ContentValues) (obj)).put("all_media_id", Long.valueOf(l3));
        ((ContentValues) (obj)).put("search_query", s);
        ((ContentValues) (obj)).put("dedup_key", etv1.a);
        ((ContentValues) (obj)).put("capture_timestamp", Long.valueOf(l2));
        int l1;
        if (flag)
        {
            l1 = 1;
        } else
        {
            l1 = 0;
        }
        ((ContentValues) (obj)).put("is_rejected", Integer.valueOf(l1));
        ((ContentValues) (obj)).put("date_header_start_timestamp", long1);
        sqlitedatabase.insertWithOnConflict("search_results", null, ((ContentValues) (obj)), j1);
          goto _L2
        s;
        if (m.a())
        {
            noy.a("media table id", Long.valueOf(l3));
            noy.a("dedup key", etv1.a);
        }
        throw s;
        s;
        sqlitedatabase.endTransaction();
        throw s;
        s;
        ((Cursor) (obj)).close();
        throw s;
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        if (b.a())
        {
            noy.a(i1);
            noy.a("query", s);
            noy.a("startTimestamp", long1);
            noy.a("isRejected", Boolean.valueOf(flag));
            noy.a("notify change", Boolean.valueOf(flag1));
            noy.a("total results", Integer.valueOf(list.size()));
            noy.a("duration", l4);
        }
        if (flag1)
        {
            e.a(i1, "insertOrUpdateSearchResults", null);
        }
        return;
    }

    private ett c(int i1, String s)
    {
        SQLiteDatabase sqlitedatabase;
        erb erb1;
        sqlitedatabase = mvj.a(a, i1);
        erb1 = new erb(a, i1);
        sqlitedatabase.beginTransactionWithListenerNonExclusive(erb1);
        s = a(sqlitedatabase, i1, s, erb1);
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        return s;
        s;
        sqlitedatabase.endTransaction();
        throw s;
    }

    private int d(int i1, String s)
    {
        SQLiteDatabase sqlitedatabase;
        erb erb1;
        sqlitedatabase = mvj.a(a, i1);
        erb1 = new erb(a, i1);
        sqlitedatabase.beginTransactionWithListenerNonExclusive(erb1);
        i1 = a(sqlitedatabase, i1, "local_media", "content_uri = ?", s, erb1);
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        return i1;
        s;
        sqlitedatabase.endTransaction();
        throw s;
    }

    final ett a(SQLiteDatabase sqlitedatabase, int i1, String s, erb erb1)
    {
        Collection collection = a(i1, new String[] {
            s
        });
        i1 = a(sqlitedatabase, i1, "remote_media", "media_key = ?", s, erb1);
        if (i1 == 0)
        {
            sqlitedatabase = Collections.emptyList();
        } else
        {
            sqlitedatabase = collection;
        }
        return new ett(i1, sqlitedatabase);
    }

    public final String a(SQLiteDatabase sqlitedatabase, qgg qgg1)
    {
        if (qgg1.c.l != null && !TextUtils.isEmpty(qgg1.c.l.a))
        {
            sqlitedatabase = qgg1.c.l.a;
        } else
        {
            String s = a(sqlitedatabase, qgg1.b.a);
            sqlitedatabase = s;
            if (TextUtils.isEmpty(s))
            {
                sqlitedatabase = String.valueOf("fake:");
                String s1 = String.valueOf(qgg1.b.a);
                if (s1.length() != 0)
                {
                    s1 = sqlitedatabase.concat(s1);
                } else
                {
                    s1 = new String(sqlitedatabase);
                }
                sqlitedatabase = s1;
                if (Log.isLoggable("MediaOperations", 3))
                {
                    sqlitedatabase = String.valueOf(qgg1.b.a);
                    if (sqlitedatabase.length() != 0)
                    {
                        "adding remote photo with empty or null localDedupKey, mediaKey=".concat(sqlitedatabase);
                        return s1;
                    } else
                    {
                        new String("adding remote photo with empty or null localDedupKey, mediaKey=");
                        return s1;
                    }
                }
            }
        }
        return sqlitedatabase;
    }

    public Collection a(int i1, String as[])
    {
        Object obj = mvj.b(a, i1);
        ArrayList arraylist = new ArrayList(as.length);
        if (as.length == 0)
        {
            return arraylist;
        } else
        {
            obj = new etr(this, as, ((SQLiteDatabase) (obj)), arraylist);
            b.a(500, as.length, ((ert) (obj)));
            return arraylist;
        }
    }

    public final List a(int i1, etj etj1, Collection collection)
    {
        SQLiteDatabase sqlitedatabase;
        ArrayList arraylist;
        int j1;
        sqlitedatabase = mvj.b(a, i1);
        arraylist = new ArrayList();
        collection = new ArrayList(collection);
        j1 = collection.size();
        i1 = 0;
_L2:
        Object obj;
        if (i1 >= j1)
        {
            break; /* Loop/switch isn't completed */
        }
        int k1 = Math.min(j1 - i1, 500);
        obj = collection.subList(i1, i1 + k1);
        i1 += k1;
        obj = (new etj(etj1)).a(h).b(((Collection) (obj))).a(sqlitedatabase);
        while (((Cursor) (obj)).moveToNext()) 
        {
            arraylist.add(((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndexOrThrow("content_uri")));
        }
        break MISSING_BLOCK_LABEL_147;
        etj1;
        ((Cursor) (obj)).close();
        throw etj1;
        ((Cursor) (obj)).close();
        if (true) goto _L2; else goto _L1
_L1:
        return arraylist;
    }

    public final List a(int i1, String s, eun eun1)
    {
        ArrayList arraylist;
        SQLiteDatabase sqlitedatabase = mvj.b(a, i1);
        arraylist = new ArrayList();
        if (TextUtils.isEmpty(s))
        {
            return arraylist;
        }
        eun1 = sqlitedatabase.query("remote_media", g, "dedup_key = ? AND state = ?", new String[] {
            s, String.valueOf(eun1.c)
        }, null, null, null);
        while (eun1.moveToNext()) 
        {
            long l1 = eun1.getLong(eun1.getColumnIndexOrThrow("photo_id"));
            String s1 = eun1.getString(eun1.getColumnIndexOrThrow("media_key"));
            String s2 = eun1.getString(eun1.getColumnIndexOrThrow("collection_id"));
            hpm hpm1 = new hpm();
            hpm1.a = s;
            hpm1 = hpm1.a(Long.valueOf(l1).longValue());
            hpm1.d = s1;
            hpm1.e = s2;
            arraylist.add(hpm1.a());
        }
        break MISSING_BLOCK_LABEL_189;
        s;
        eun1.close();
        throw s;
        eun1.close();
        return arraylist;
    }

    public List a(int i1, List list)
    {
        Object obj;
        if (list.isEmpty())
        {
            return Collections.emptyList();
        }
        int j1 = list.size();
        SQLiteDatabase sqlitedatabase = mvj.b(a, i1);
        obj = new ArrayList(j1);
        String as[] = i;
        String s = String.valueOf(b.b("media_key", j1));
        String s1 = String.valueOf("is_hidden != 0");
        list = sqlitedatabase.query("remote_media", as, (new StringBuilder(String.valueOf(s).length() + 5 + String.valueOf(s1).length())).append(s).append(" AND ").append(s1).toString(), (String[])list.toArray(new String[j1]), null, null, null);
        while (list.moveToNext()) 
        {
            ((List) (obj)).add(new etm(list.getString(list.getColumnIndexOrThrow("media_key")), list.getString(list.getColumnIndexOrThrow("dedup_key")), list.getLong(list.getColumnIndexOrThrow("utc_timestamp")), list.getLong(list.getColumnIndexOrThrow("timezone_offset")), d));
        }
        break MISSING_BLOCK_LABEL_234;
        obj;
        list.close();
        throw obj;
        list.close();
        return ((List) (obj));
    }

    public Set a(SQLiteDatabase sqlitedatabase, String as[], eun eun1)
    {
        HashSet hashset = new HashSet();
        sqlitedatabase = new etp(this, as, eun1, sqlitedatabase, hashset);
        b.a(500, as.length, sqlitedatabase);
        return hashset;
    }

    public final void a(int i1, SQLiteDatabase sqlitedatabase, eui eui1)
    {
        String s = eui1.a();
        p.a(s);
        Object obj;
        Object obj1;
        boolean flag;
        if (!s.startsWith("fake:"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj = String.valueOf("Cannot replace a fake dedupKey with another fake dedupKey, contentUri: ");
        obj1 = String.valueOf(eui1.c());
        p.a(flag, (new StringBuilder(String.valueOf(obj).length() + 15 + String.valueOf(obj1).length() + String.valueOf(s).length())).append(((String) (obj))).append(((String) (obj1))).append(", newDedupKey: ").append(s).toString());
        obj1 = new esw(eui1.a, "local_media", eui1.b, "utc_timestamp", "timezone_offset");
        obj = new erb(a, i1);
        eui1 = new eul(a, eui1.c(), s, eui1.g().longValue(), eui1.f().longValue(), ((esw) (obj1)), ((erb) (obj)));
        sqlitedatabase.beginTransactionWithListenerNonExclusive(((android.database.sqlite.SQLiteTransactionListener) (obj)));
        c.a(sqlitedatabase, i1, eui1, ((erb) (obj)));
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        return;
        eui1;
        sqlitedatabase.endTransaction();
        throw eui1;
    }

    public final void a(int i1, Iterable iterable, Iterable iterable1, boolean flag)
    {
        int k1 = 0;
        HashSet hashset = new HashSet();
        iterable = iterable.iterator();
        int j1;
        int l1;
        for (j1 = 0; iterable.hasNext(); j1 = l1 + j1)
        {
            ett ett1 = c(i1, (String)iterable.next());
            l1 = ett1.a;
            hashset.addAll(ett1.b);
        }

        for (iterable = iterable1.iterator(); iterable.hasNext();)
        {
            k1 += d(i1, (String)iterable.next());
        }

        for (iterable = hashset.iterator(); iterable.hasNext(); e.a(i1, "delete photos in collection", iterable1))
        {
            iterable1 = (String)iterable.next();
        }

        if (k1 + j1 > 0)
        {
            e.a(i1, "delete photos", null);
        }
    }

    public final void a(int i1, String s, long l1, List list)
    {
        long l2 = noy.a();
        a(i1, s, list, Long.valueOf(l1), false, true, 4);
        if (b.a())
        {
            noy.a("start", Long.valueOf(l1));
            noy.a("total entries", Integer.valueOf(list.size()));
            noy.a("duration", l2);
        }
    }

    public void a(int i1, String s, String s1, Iterable iterable, eun eun1, boolean flag, Collection collection)
    {
        if (iterable.iterator().hasNext()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        SQLiteDatabase sqlitedatabase;
        erb erb1;
        erb1 = new erb(a, i1);
        sqlitedatabase = mvj.a(a, i1);
        sqlitedatabase.beginTransactionWithListenerNonExclusive(erb1);
        iterable = iterable.iterator();
        boolean flag1 = false;
_L3:
        ess ess1;
        if (!iterable.hasNext())
        {
            break MISSING_BLOCK_LABEL_115;
        }
        ess1 = new ess(s, s1, (String)iterable.next(), eun1);
        if (c.a(i1, ess1, erb1) || flag1)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
          goto _L3
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        if (!flag || !flag1) goto _L1; else goto _L4
_L4:
        for (s = collection.iterator(); s.hasNext(); iterable.a(i1, (new StringBuilder(String.valueOf(collection).length() + 22)).append("media state change to ").append(collection).toString(), s1))
        {
            s1 = (String)s.next();
            iterable = e;
            collection = String.valueOf(eun1);
        }

        break MISSING_BLOCK_LABEL_225;
        s;
        sqlitedatabase.endTransaction();
        throw s;
        s = e;
        s1 = String.valueOf(eun1);
        s.a(i1, (new StringBuilder(String.valueOf(s1).length() + 22)).append("media state change to ").append(s1).toString(), null);
        return;
    }

    public void a(int i1, String s, List list, boolean flag, boolean flag1)
    {
        a(i1, s, list, ((Long) (null)), flag, flag1, 5);
    }

    public final void a(int i1, String s, qgg aqgg[], boolean flag)
    {
        SQLiteDatabase sqlitedatabase = mvj.a(a, i1);
        ArrayList arraylist = new ArrayList(aqgg.length);
        int k1 = aqgg.length;
        int j1 = 0;
        while (j1 < k1) 
        {
            qgg qgg1 = aqgg[j1];
            if (qgg1.c != null && qgg1.c.f != null)
            {
                long l2 = qgg1.c.f.longValue();
                long l1;
                if (qgg1.c.g != null)
                {
                    l1 = qgg1.c.g.longValue();
                } else
                {
                    l1 = 0L;
                }
                l1 = ivc.a(l2, l1);
                arraylist.add(new etv(a(sqlitedatabase, qgg1), l1));
            }
            j1++;
        }
        a(i1, s, ((List) (arraylist)), false, true);
    }

    public final void a(int i1, Collection collection)
    {
        a(i1, "local_media", "content_uri = ?", ((Iterable) (collection)), eun.a, true);
    }

    public final void a(int i1, Collection collection, boolean flag)
    {
        a(i1, "local_media", "content_uri = ?", ((Iterable) (collection)), eun.b, flag);
    }

    public final void a(int i1, Map map)
    {
        SQLiteDatabase sqlitedatabase;
        sqlitedatabase = mvj.a(a, i1);
        sqlitedatabase.beginTransactionNonExclusive();
        ContentValues contentvalues;
        for (map = map.entrySet().iterator(); map.hasNext(); sqlitedatabase.insertWithOnConflict("explore_suggestions", null, contentvalues, 5))
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)map.next();
            contentvalues = new ContentValues();
            contentvalues.put("category", (Integer)entry.getKey());
            contentvalues.put("auto_complete_items_response", (byte[])entry.getValue());
        }

        break MISSING_BLOCK_LABEL_112;
        map;
        sqlitedatabase.endTransaction();
        throw map;
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        return;
    }

    public final void a(int i1, qgg aqgg[], Collection collection, qfu qfu1, boolean flag)
    {
        qgi aqgi[] = new qgi[collection.size()];
        collection = collection.iterator();
        for (int j1 = 0; collection.hasNext(); j1++)
        {
            String s = (String)collection.next();
            aqgi[j1] = new qgi();
            aqgi[j1].a = 1;
            aqgi[j1].b = new qev();
            aqgi[j1].b.a = s;
        }

        a(i1, aqgg, aqgi, qfu1, true);
    }

    public final void a(int i1, qgg aqgg[], qgi aqgi[], qfu qfu1, boolean flag)
    {
        Object obj = ((mmv)olm.a(a, mmv)).a(i1).b("gaia_id");
        if (qfu1 != null && TextUtils.equals(((CharSequence) (obj)), qfu1.b)) goto _L2; else goto _L1
_L1:
        if (m.a())
        {
            noy.a(i1);
            noy.a("owner", qfu1);
        }
_L4:
        return;
        aqgg;
        if (!d.a()) goto _L4; else goto _L3
_L3:
        noy.a(i1);
        return;
_L2:
        erb erb1;
        long l2;
        qfu1 = mvj.a(a, i1);
        l2 = noy.a();
        erb1 = new erb(a, i1);
        new etu();
        qfu1.beginTransactionWithListenerNonExclusive(erb1);
        int j1;
        int k1;
        int l1;
        if (m.a())
        {
            noy.a("num tombstones", Integer.valueOf(aqgi.length));
        }
        obj = new HashSet();
        j1 = aqgg.length;
        aqgg = a(i1, ((SQLiteDatabase) (qfu1)), aqgg, erb1);
        k1 = ((ett) (aqgg)).a;
        ((Set) (obj)).addAll(((ett) (aqgg)).b);
        aqgg = (new euq(a, i1)).a(qfu1, aqgi, erb1);
        l1 = ((ett) (aqgg)).a;
        ((Set) (obj)).addAll(((ett) (aqgg)).b);
        int i2 = k1 + l1;
        aqgg = new etu(k1, l1, j1 - i2, i2, j1, ((Set) (obj)));
        qfu1.setTransactionSuccessful();
        qfu1.endTransaction();
        if (!flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        for (aqgi = ((etu) (aqgg)).f.iterator(); aqgi.hasNext(); e.a(i1, "insertUpdateDelete", qfu1))
        {
            qfu1 = (String)aqgi.next();
        }

        break MISSING_BLOCK_LABEL_335;
        aqgg;
        qfu1.endTransaction();
        throw aqgg;
        e.a(i1, "insertUpdateDelete", null);
        if (!b.a()) goto _L4; else goto _L5
_L5:
        noy.a(i1);
        noy.a("num media", Integer.valueOf(((etu) (aqgg)).e));
        noy.a("num inserted or updated", Integer.valueOf(((etu) (aqgg)).a));
        noy.a("num deleted", Integer.valueOf(((etu) (aqgg)).b));
        noy.a("num skipped", Integer.valueOf(((etu) (aqgg)).c));
        noy.a("total operations", Integer.valueOf(((etu) (aqgg)).d));
        noy.a("duration", l2);
        return;
    }

    public final boolean a(int i1, SQLiteDatabase sqlitedatabase, eui eui1, String s, boolean flag, erb erb1)
    {
        if (flag)
        {
            String s1 = a(sqlitedatabase, "local_media", "content_uri", s);
            if (s1 != null && !TextUtils.equals(eui1.a(), s1))
            {
                int j1 = b(sqlitedatabase, i1, s, erb1);
                if (m.a())
                {
                    noy.a("media key", eui1.d());
                    noy.a("old dedup key", s1);
                    noy.a("new dedup key", eui1.a());
                    noy.a("deleted", Integer.valueOf(j1));
                }
            }
        }
        esw esw1 = new esw(eui1.a, "local_media", eui1.b, "utc_timestamp", "timezone_offset");
        flag = c.a(sqlitedatabase, i1, esw1, erb1);
        erb1 = euv.a(eui1.b());
        if (flag && erb1 != euv.b && erb1 != euv.c)
        {
            ContentValues contentvalues = new ContentValues();
            contentvalues.put("type", Integer.valueOf(((euv) (erb1)).f));
            sqlitedatabase.update("media", contentvalues, "dedup_key = ?", new String[] {
                eui1.a()
            });
        }
        if (l.a())
        {
            noy.a("content uri", s);
            noy.a("new row inserted or updated", Boolean.valueOf(flag));
        }
        return flag;
    }

    public final int b(int i1, List list)
    {
        SQLiteDatabase sqlitedatabase;
        sqlitedatabase = mvj.a(a, i1);
        sqlitedatabase.beginTransactionNonExclusive();
        ContentValues contentvalues;
        contentvalues = new ContentValues();
        list = list.iterator();
        int j1 = 0;
        while (list.hasNext()) 
        {
            efw efw1 = (efw)list.next();
            contentvalues.clear();
            contentvalues.put("auto_backup_state", Integer.valueOf(euu.a(efw1.c).g));
            contentvalues.put("auto_backup_timestamp", Long.valueOf(efw1.b));
            j1 = sqlitedatabase.update("local_media", contentvalues, "content_uri = ?", new String[] {
                efw1.a
            }) + j1;
        }
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        if (j1 > 0)
        {
            e.a(i1, "auto backup state updated.", null);
        }
        return j1;
        list;
        sqlitedatabase.endTransaction();
        throw list;
    }

    public final int b(SQLiteDatabase sqlitedatabase, int i1, String s, erb erb1)
    {
        return a(sqlitedatabase, i1, "local_media", "content_uri = ?", s, erb1);
    }

    public final long b(int i1)
    {
        return DatabaseUtils.queryNumEntries(mvj.b(a, i1), "remote_media", euk.a, null);
    }

    public final long b(int i1, String s)
    {
        return DatabaseUtils.queryNumEntries(mvj.b(a, i1), "media", "dedup_key IN (SELECT dedup_key FROM search_results WHERE search_query = ? AND is_rejected != 1) AND is_deleted != 1", new String[] {
            s
        });
    }

    public final void c(int i1)
    {
        mvj.a(a, i1).delete("explore_suggestions", null, null);
    }

    public final List d(int i1)
    {
        ArrayList arraylist = new ArrayList();
        b.a(3000, new ets(this, i1, arraylist));
        return arraylist;
    }

    public final long e(int i1)
    {
        erm erm1 = new erm();
        erm1.o = false;
        erm1.l = false;
        return erm1.a(a, i1);
    }

}
