// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.radio.provider;

import android.content.ContentProvider;
import android.content.ContentProviderOperation;
import android.content.ContentProviderResult;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.OperationApplicationException;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.MatrixCursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQueryBuilder;
import android.net.Uri;
import com.pandora.radio.util.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p.cw.c;
import p.df.a;

// Referenced classes of package com.pandora.radio.provider:
//            h, e, d

public class StationProvider extends ContentProvider
{
    static class a
        implements d.b
    {

        public Collection a()
        {
            ArrayList arraylist = new ArrayList(5);
            arraylist.add(new d.c("stations", com.pandora.radio.provider.h.a()));
            arraylist.add(new d.c("tracks", com.pandora.radio.provider.h.b()));
            arraylist.add(new d.c("adData", com.pandora.radio.provider.h.c()));
            arraylist.add(new d.c("artistMessage", com.pandora.radio.provider.h.d()));
            arraylist.add(new d.c("seedsData", com.pandora.radio.provider.h.e()));
            arraylist.add(new d.c("extendedStationData", com.pandora.radio.provider.h.f()));
            return arraylist;
        }

        public void a(SQLiteDatabase sqlitedatabase)
        {
            sqlitedatabase.execSQL("CREATE TRIGGER IF NOT EXISTS TrackCleanup DELETE ON stations BEGIN  DELETE FROM tracks WHERE station_id = old._id;  END; ");
            sqlitedatabase.execSQL("CREATE TRIGGER IF NOT EXISTS AdDataCleanup DELETE ON tracks BEGIN  DELETE FROM adData WHERE old.adData_id = _id;  END; ");
            sqlitedatabase.execSQL("CREATE TRIGGER IF NOT EXISTS ArtistMessageCleanup DELETE ON tracks BEGIN  DELETE FROM artistMessage WHERE old.artistMessage_id = _id;  END; ");
            sqlitedatabase.execSQL("CREATE TRIGGER IF NOT EXISTS SeedDataCleanup DELETE ON stations BEGIN  DELETE FROM seedsData WHERE stationToken = old.stationToken;  END; ");
            sqlitedatabase.execSQL("CREATE TRIGGER IF NOT EXISTS ExtendedStationDataCleanup DELETE ON extendedStationData BEGIN  DELETE FROM extendedStationData WHERE stationToken = old.stationToken;  END; ");
        }

        public void a(SQLiteDatabase sqlitedatabase, int i1, int j1)
        {
            sqlitedatabase.execSQL("CREATE TRIGGER IF NOT EXISTS TrackCleanup DELETE ON stations BEGIN  DELETE FROM tracks WHERE station_id = old._id;  END; ");
            sqlitedatabase.execSQL("CREATE TRIGGER IF NOT EXISTS AdDataCleanup DELETE ON tracks BEGIN  DELETE FROM adData WHERE old.adData_id = _id;  END; ");
            sqlitedatabase.execSQL("CREATE TRIGGER IF NOT EXISTS ArtistMessageCleanup DELETE ON tracks BEGIN  DELETE FROM artistMessage WHERE old.artistMessage_id = _id;  END; ");
            sqlitedatabase.execSQL("CREATE TRIGGER IF NOT EXISTS SeedDataCleanup DELETE ON stations BEGIN  DELETE FROM seedsData WHERE stationToken = old.stationToken;  END; ");
            sqlitedatabase.execSQL("CREATE TRIGGER IF NOT EXISTS ExtendedStationDataCleanup DELETE ON extendedStationData BEGIN  DELETE FROM extendedStationData WHERE stationToken = old.stationToken;  END; ");
        }

        a()
        {
        }
    }

    private static final class b
    {

        public String a;
        public Boolean b;
        public Uri c;
        public String d;

        private b()
        {
        }

    }


    protected static final String a;
    protected static final String b;
    protected static final String c;
    protected static final String d;
    public static final String e = String.format("%s LEFT OUTER JOIN %s ON (%s.%s = %s.%s)", new Object[] {
        "stations", "extendedStationData", "stations", "stationToken", "extendedStationData", "stationToken"
    });
    public static Uri f;
    public static Uri g;
    public static Uri h;
    public static Uri i;
    public static Uri j;
    public static Uri k;
    public static Uri l;
    protected static Uri m;
    static long n = -1L;
    static long o = -1L;
    static long p = -1L;
    static long q = -1L;
    private static String r;
    private static boolean s = false;
    private static UriMatcher t;
    private static Map u;
    private static c v;

    public StationProvider()
    {
    }

    private b a(int i1)
    {
        b b1 = new b();
        b1.b = Boolean.valueOf(false);
        switch (i1)
        {
        case 7: // '\007'
        case 8: // '\b'
        default:
            throw new IllegalArgumentException("Unknown table match");

        case 1: // '\001'
            b1.b = Boolean.valueOf(true);
            // fall through

        case 0: // '\0'
            b1.a = "stations";
            b1.c = f;
            b1.d = h.b;
            return b1;

        case 4: // '\004'
            b1.b = Boolean.valueOf(true);
            // fall through

        case 3: // '\003'
            b1.a = "tracks";
            b1.c = g;
            b1.d = null;
            return b1;

        case 6: // '\006'
            b1.b = Boolean.valueOf(true);
            // fall through

        case 5: // '\005'
            b1.a = "adData";
            b1.c = h;
            b1.d = null;
            return b1;

        case 12: // '\f'
            b1.b = Boolean.valueOf(true);
            // fall through

        case 11: // '\013'
            b1.a = "artistMessage";
            b1.c = i;
            b1.d = null;
            return b1;

        case 2: // '\002'
            b1.a = "stations";
            b1.c = f;
            b1.d = h.b;
            return b1;

        case 9: // '\t'
            b1.a = "seedsData";
            b1.c = k;
            b1.d = null;
            return b1;

        case 10: // '\n'
            b1.a = "extendedStationData";
            b1.c = l;
            b1.d = null;
            return b1;
        }
    }

    public static String a()
    {
        return r;
    }

    private String a(int i1, b b1)
    {
        if (i1 == 0)
        {
            return e;
        } else
        {
            return b1.a;
        }
    }

    private static void a(SQLiteDatabase sqlitedatabase, int i1)
    {
        if (i1 == 0 || i1 == 1)
        {
            n = b(sqlitedatabase, d);
            o = b(sqlitedatabase, a);
            p = b(sqlitedatabase, b);
            q = b(sqlitedatabase, c);
        }
    }

    public static void a(c c1)
    {
        v = c1;
        if (r == null)
        {
            r = "com.pandora.radio.provider";
        }
        t = new UriMatcher(-1);
        t.addURI(r, "stations", 0);
        t.addURI(r, "stations/#", 1);
        t.addURI(r, "tracks", 3);
        t.addURI(r, "tracks/#", 4);
        t.addURI(r, "adData", 5);
        t.addURI(r, "adData/#", 6);
        t.addURI(r, "artistMessage", 11);
        t.addURI(r, "artistMessage/#", 12);
        t.addURI(r, "seedsData", 9);
        t.addURI(r, "live_folders/stations", 2);
        t.addURI(r, "stationCount", 7);
        t.addURI(r, "stationCount/*", 8);
        t.addURI(r, "extendedStationData", 10);
        u = new HashMap();
        u.put("_id", (new StringBuilder()).append(com.pandora.radio.provider.e.a).append(" AS ").append("_id").toString());
        u.put("name", (new StringBuilder()).append(com.pandora.radio.provider.e.a).append(" AS ").append("name").toString());
        f = Uri.parse(String.format("content://%s/%s", new Object[] {
            r, "stations"
        }));
        g = Uri.parse(String.format("content://%s/%s", new Object[] {
            r, "tracks"
        }));
        h = Uri.parse(String.format("content://%s/%s", new Object[] {
            r, "adData"
        }));
        i = Uri.parse(String.format("content://%s/%s", new Object[] {
            r, "artistMessage"
        }));
        j = Uri.parse(String.format("content://%s/%s/%s", new Object[] {
            r, "live_folders", "stations"
        }));
        k = Uri.parse(String.format("content://%s/%s", new Object[] {
            r, "seedsData"
        }));
        l = Uri.parse(String.format("content://%s/%s", new Object[] {
            r, "extendedStationData"
        }));
        m = Uri.parse(String.format("content://%s/%s", new Object[] {
            r, "stationCount"
        }));
        s = true;
    }

    private boolean a(SQLiteDatabase sqlitedatabase, String s1)
    {
        boolean flag = true;
        if (s1 == null) goto _L2; else goto _L1
_L1:
        s1 = sqlitedatabase.rawQuery(String.format("SELECT %s FROM %s WHERE (%s = '%s') AND %s LIMIT 1", new Object[] {
            com.pandora.radio.provider.e.a, "stations", com.pandora.radio.provider.e.a, s1, com.pandora.radio.provider.h.i
        }), null);
        if (s1 == null) goto _L4; else goto _L3
_L3:
        int i1 = s1.getCount();
        if (i1 != 0) goto _L5; else goto _L4
_L4:
        if (s1 != null)
        {
            s1.close();
        }
        flag = false;
_L7:
        return flag;
_L5:
        if (s1 == null) goto _L7; else goto _L6
_L6:
        s1.close();
        return true;
        sqlitedatabase;
        s1 = null;
_L9:
        if (s1 != null)
        {
            s1.close();
        }
        throw sqlitedatabase;
_L2:
        return false;
        sqlitedatabase;
        if (true) goto _L9; else goto _L8
_L8:
    }

    private boolean a(Uri uri)
    {
        int i1 = t.match(uri);
        return i1 == 0 || i1 == 1;
    }

    private static long b(SQLiteDatabase sqlitedatabase, String s1)
    {
        if (s1 != null)
        {
            return DatabaseUtils.longForQuery(sqlitedatabase, String.format("select count(*) from %s %s", new Object[] {
                "stations", s1
            }), null);
        } else
        {
            return DatabaseUtils.queryNumEntries(sqlitedatabase, "stations");
        }
    }

    public static boolean b()
    {
        return s;
    }

    public Uri a(Uri uri, ContentValues contentvalues)
    {
        SQLiteDatabase sqlitedatabase = v.w().a();
        int i1 = t.match(uri);
        b b1 = a(i1);
        if (b1.b.booleanValue())
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Unexpected insert uri").append(uri).toString());
        }
        if (i1 == 0 && a(sqlitedatabase, contentvalues.getAsString(com.pandora.radio.provider.e.a)))
        {
            return null;
        }
        long l1 = sqlitedatabase.insert(b1.a, null, contentvalues);
        a(sqlitedatabase, i1);
        if (l1 > 0L)
        {
            return ContentUris.withAppendedId(b1.c, l1);
        } else
        {
            throw new SQLException((new StringBuilder()).append("Failed to insert row into ").append(uri).toString());
        }
    }

    public ContentProviderResult[] applyBatch(ArrayList arraylist)
    {
        ContentProviderOperation contentprovideroperation;
        SQLiteDatabase sqlitedatabase;
        ContentProviderResult acontentproviderresult[];
        contentprovideroperation = null;
        acontentproviderresult = new ContentProviderResult[arraylist.size()];
        sqlitedatabase = v.w().a();
        sqlitedatabase.beginTransaction();
        Iterator iterator = arraylist.iterator();
        int i1;
        int k1;
        k1 = 0;
        i1 = 0;
        arraylist = contentprovideroperation;
_L2:
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        contentprovideroperation = (ContentProviderOperation)iterator.next();
        arraylist = contentprovideroperation.getUri();
        int j1 = k1;
        if (a(arraylist))
        {
            j1 = k1 + 1;
        }
        k1 = i1 + 1;
        acontentproviderresult[i1] = contentprovideroperation.apply(this, acontentproviderresult, k1);
        i1 = k1;
        k1 = j1;
        if (true) goto _L2; else goto _L1
_L1:
        sqlitedatabase.setTransactionSuccessful();
        if (k1 <= 0)
        {
            break MISSING_BLOCK_LABEL_128;
        }
        a(sqlitedatabase, 0);
        getContext().getContentResolver().notifyChange(arraylist, null);
        sqlitedatabase.endTransaction();
        return acontentproviderresult;
        arraylist;
        p.df.a.b("StationProvider", (new StringBuilder()).append("batch failed: ").append(arraylist.getLocalizedMessage()).toString());
        sqlitedatabase.endTransaction();
        return acontentproviderresult;
        arraylist;
        sqlitedatabase.endTransaction();
        throw arraylist;
    }

    public int bulkInsert(Uri uri, ContentValues acontentvalues[])
    {
        return v.w().a(this, new d.d(acontentvalues, uri) {

            final ContentValues a[];
            final Uri b;
            final StationProvider c;

            public int a(SQLiteDatabase sqlitedatabase)
            {
                for (int i1 = 0; i1 < a.length; i1++)
                {
                    c.a(b, a[i1]);
                }

                c.getContext().getContentResolver().notifyChange(b, null);
                return a.length;
            }

            
            {
                c = StationProvider.this;
                a = acontentvalues;
                b = uri;
                super();
            }
        });
    }

    public int delete(Uri uri, String s1, String as[])
    {
        SQLiteDatabase sqlitedatabase = v.w().a();
        int j1 = t.match(uri);
        b b1 = a(j1);
        int i1;
        if (b1.b.booleanValue())
        {
            Object obj = (String)uri.getPathSegments().get(1);
            obj = (new StringBuilder()).append("_id=").append(((String) (obj)));
            if (!com.pandora.radio.util.i.a(s1))
            {
                s1 = (new StringBuilder()).append(" AND (").append(s1).append(")").toString();
            } else
            {
                s1 = "";
            }
            s1 = ((StringBuilder) (obj)).append(s1).toString();
            i1 = sqlitedatabase.delete(b1.a, s1, as);
        } else
        {
            String s2 = s1;
            if (com.pandora.radio.util.i.a(s1))
            {
                s2 = "1";
            }
            i1 = sqlitedatabase.delete(b1.a, s2, as);
        }
        if (i1 > 0)
        {
            a(sqlitedatabase, j1);
            getContext().getContentResolver().notifyChange(uri, null);
        }
        return i1;
    }

    public String getType(Uri uri)
    {
        switch (t.match(uri))
        {
        case 2: // '\002'
        case 7: // '\007'
        case 8: // '\b'
        case 10: // '\n'
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("Unknown URI ").append(uri).toString());

        case 0: // '\0'
        case 3: // '\003'
        case 5: // '\005'
        case 9: // '\t'
        case 11: // '\013'
            return "vnd.android.cursor.dir/vnd.pandora.station";

        case 1: // '\001'
        case 4: // '\004'
        case 6: // '\006'
        case 12: // '\f'
            return "vnd.android.cursor.item/vnd.pandora.station";
        }
    }

    public Uri insert(Uri uri, ContentValues contentvalues)
    {
        uri = a(uri, contentvalues);
        if (uri != null)
        {
            getContext().getContentResolver().notifyChange(uri, null);
        }
        return uri;
    }

    public boolean onCreate()
    {
        return true;
    }

    public Cursor query(Uri uri, String as[], String s1, String as1[], String s2)
    {
        SQLiteDatabase sqlitedatabase;
        SQLiteQueryBuilder sqlitequerybuilder;
        int i1;
        sqlitequerybuilder = new SQLiteQueryBuilder();
        sqlitedatabase = v.w().a();
        i1 = t.match(uri);
        if (i1 != 2) goto _L2; else goto _L1
_L1:
        sqlitequerybuilder.setTables("stations");
        sqlitequerybuilder.setProjectionMap(u);
        s2 = h.b;
_L4:
        as = sqlitequerybuilder.query(sqlitedatabase, as, s1, as1, null, null, s2);
        as.setNotificationUri(getContext().getContentResolver(), uri);
        return as;
_L2:
        if (i1 == 7)
        {
            long l1 = b(sqlitedatabase, d);
            uri = new MatrixCursor(new String[] {
                "count"
            });
            uri.addRow(new Object[] {
                Long.valueOf(l1)
            });
            return uri;
        }
        if (i1 == 8)
        {
            uri = uri.getPathSegments();
            b b1;
            long l2;
            if (uri.contains("excludeCCStations"))
            {
                l2 = b(sqlitedatabase, a);
            } else
            if (uri.contains("excludeShuffleStation"))
            {
                l2 = b(sqlitedatabase, b);
            } else
            if (uri.contains("excludeArtistMessagesNotEnabled"))
            {
                l2 = b(sqlitedatabase, c);
            } else
            {
                l2 = -1L;
            }
            uri = new MatrixCursor(new String[] {
                "count"
            });
            uri.addRow(new Object[] {
                Long.valueOf(l2)
            });
            return uri;
        }
        b1 = a(i1);
        sqlitequerybuilder.setTables(a(i1, b1));
        if (b1.b.booleanValue())
        {
            sqlitequerybuilder.appendWhere((new StringBuilder()).append("_id=").append((String)uri.getPathSegments().get(1)).toString());
        }
        if (com.pandora.radio.util.i.a(s2))
        {
            s2 = b1.d;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public int update(Uri uri, ContentValues contentvalues, String s1, String as[])
    {
        if (contentvalues == null)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Required values missing when updating: ").append(uri).toString());
        }
        Object obj = a(t.match(uri));
        SQLiteDatabase sqlitedatabase = v.w().a();
        int i1;
        if (((b) (obj)).b.booleanValue())
        {
            Object obj1 = (String)uri.getPathSegments().get(1);
            obj = ((b) (obj)).a;
            obj1 = (new StringBuilder()).append("_id=").append(((String) (obj1)));
            if (!com.pandora.radio.util.i.a(s1))
            {
                s1 = (new StringBuilder()).append(" AND (").append(s1).append(')').toString();
            } else
            {
                s1 = "";
            }
            i1 = sqlitedatabase.update(((String) (obj)), contentvalues, ((StringBuilder) (obj1)).append(s1).toString(), as);
        } else
        {
            i1 = sqlitedatabase.update(((b) (obj)).a, contentvalues, s1, as);
        }
        if (i1 > 0)
        {
            a(sqlitedatabase, t.match(uri));
            getContext().getContentResolver().notifyChange(uri, null);
        }
        return i1;
    }

    static 
    {
        a = String.format("where (%s == 0) AND %s", new Object[] {
            "onePlaylist", com.pandora.radio.provider.h.i
        });
        b = String.format("where (%s == 0) AND %s", new Object[] {
            "isQuickMix", com.pandora.radio.provider.h.i
        });
        c = String.format("where %s", new Object[] {
            h.k
        });
        d = String.format("where %s", new Object[] {
            com.pandora.radio.provider.h.i
        });
    }
}
