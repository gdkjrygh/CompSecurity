// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.prefs.shared;

import android.content.ContentProviderResult;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteQueryBuilder;
import android.net.Uri;
import android.text.TextUtils;
import com.facebook.c.r;
import com.facebook.debug.d.e;
import com.facebook.debug.log.b;
import com.facebook.debug.log.l;
import com.facebook.inject.t;
import com.google.common.a.ev;
import com.google.common.a.ew;
import com.google.common.a.hq;
import com.google.common.a.ik;
import com.google.common.base.Preconditions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

// Referenced classes of package com.facebook.prefs.shared:
//            ah, ae, g, h, 
//            i, ag

public class FbSharedPreferencesContentProvider extends r
{

    private static final Class a = com/facebook/prefs/shared/FbSharedPreferencesContentProvider;
    private static final l b = new l();
    private static final ev c = ev.k().b("_id", "_id").b("key", "key").b("value", "value").b("type", "type").b();
    private static ThreadLocal d = new ThreadLocal();
    private ah e;
    private ag f;
    private h g;
    private SQLiteDatabase h;
    private UriMatcher i;

    public FbSharedPreferencesContentProvider()
    {
    }

    static SQLiteDatabase a(FbSharedPreferencesContentProvider fbsharedpreferencescontentprovider)
    {
        return fbsharedpreferencescontentprovider.h;
    }

    private void a(ContentValues contentvalues, String s, Object obj)
    {
        int j = 1;
        contentvalues.put("key", s);
        if (obj instanceof String)
        {
            contentvalues.put("type", Integer.valueOf(1));
            contentvalues.put("value", (String)obj);
            return;
        }
        if (obj instanceof Boolean)
        {
            contentvalues.put("type", Integer.valueOf(2));
            if (!((Boolean)obj).booleanValue())
            {
                j = 0;
            }
            contentvalues.put("value", Integer.valueOf(j));
            return;
        }
        if (obj instanceof Integer)
        {
            contentvalues.put("type", Integer.valueOf(3));
            contentvalues.put("value", (Integer)obj);
            return;
        }
        if (obj instanceof Long)
        {
            contentvalues.put("type", Integer.valueOf(4));
            contentvalues.put("value", (Long)obj);
            return;
        }
        if (obj instanceof Float)
        {
            contentvalues.put("type", Integer.valueOf(5));
            contentvalues.put("value", (Float)obj);
            return;
        }
        if (obj instanceof Double)
        {
            contentvalues.put("type", Integer.valueOf(6));
            contentvalues.put("value", (Double)obj);
            return;
        } else
        {
            throw new IllegalArgumentException("Unsupported type");
        }
    }

    private void a(SortedMap sortedmap)
    {
        Object obj;
        obj = e.a(sortedmap);
        sortedmap = com.facebook.debug.d.e.a("#migrate");
        h.beginTransaction();
        h.delete("preferences", null, null);
        ContentValues contentvalues = new ContentValues();
        for (obj = ((SortedMap) (obj)).entrySet().iterator(); ((Iterator) (obj)).hasNext(); h.replaceOrThrow("preferences", null, contentvalues))
        {
            Object obj1 = (java.util.Map.Entry)((Iterator) (obj)).next();
            ae ae1 = (ae)((java.util.Map.Entry) (obj1)).getKey();
            obj1 = ((java.util.Map.Entry) (obj1)).getValue();
            a(contentvalues, ae1.a(), obj1);
        }

        break MISSING_BLOCK_LABEL_137;
        Exception exception;
        exception;
        h.endTransaction();
        sortedmap.a();
        throw exception;
        h.setTransactionSuccessful();
        h.endTransaction();
        sortedmap.a();
        return;
    }

    private int b(Uri uri, String s, String as[])
    {
        switch (i.match(uri))
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("Unknown URL ").append(uri).toString());

        case 3: // '\003'
            break;
        }
        int j;
        boolean flag;
        if (s == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "Selection not supported");
        uri = (String)uri.getPathSegments().get(2);
        j = h.delete("preferences", "key=?", new String[] {
            uri
        });
        ((g)d.get()).a(uri);
        return j;
    }

    private int b(Uri uri, ContentValues acontentvalues[])
    {
        int j = 0;
        int i1 = acontentvalues.length;
        int k = 0;
        for (; j < i1; j++)
        {
            b(uri, acontentvalues[j]);
            k++;
        }

        return k;
    }

    private Uri b(Uri uri, ContentValues contentvalues)
    {
        boolean flag = true;
        long l1;
        if (i.match(uri) != 1)
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        Preconditions.checkArgument(contentvalues.containsKey("key"));
        l1 = h.replaceOrThrow("preferences", "key", contentvalues);
        if (l1 > 0L)
        {
            uri = Uri.withAppendedPath(g.d().a(), Long.valueOf(l1).toString());
            ((g)d.get()).a(contentvalues.getAsString("key"));
            return uri;
        } else
        {
            throw new SQLException((new StringBuilder()).append("Failed to insert row into ").append(uri).toString());
        }
    }

    private g b()
    {
        g g2 = (g)d.get();
        g g1 = g2;
        if (g2 == null)
        {
            g1 = new g(this);
            d.set(g1);
        }
        g1.c();
        return g1;
    }

    private void c()
    {
        g g1 = (g)d.get();
        Intent intent;
        g1.e();
        if (g1.b() == 0 && !g1.a().isEmpty())
        {
            intent = new Intent(g.c());
            ArrayList arraylist = hq.a(g1.a());
            intent.putStringArrayListExtra("prefs", arraylist);
            com.facebook.debug.log.b.b(a, "Broadcasting changed preference keys: %s", new Object[] {
                arraylist
            });
            if (g.e() != null)
            {
                break MISSING_BLOCK_LABEL_115;
            }
            getContext().sendBroadcast(intent);
        }
_L2:
        if (g1.b() == 0)
        {
            d.set(null);
        }
        return;
        getContext().sendBroadcast(intent, g.e());
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        if (g1.b() == 0)
        {
            d.set(null);
        }
        throw exception;
    }

    private SortedMap d()
    {
        Cursor cursor;
        Object obj;
        obj = ik.d();
        cursor = h.query("preferences", new String[] {
            "key", "type", "value"
        }, null, null, null, null, null);
_L8:
        Object obj1;
        if (!cursor.moveToNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = cursor.getString(0);
        cursor.getInt(1);
        JVM INSTR tableswitch 1 5: default 250
    //                   1 96
    //                   2 128
    //                   3 164
    //                   4 190
    //                   5 216;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        continue; /* Loop/switch isn't completed */
_L2:
        ((TreeMap) (obj)).put(new ae(((String) (obj1))), cursor.getString(2));
        continue; /* Loop/switch isn't completed */
        obj;
        cursor.close();
        throw obj;
_L3:
        obj1 = new ae(((String) (obj1)));
        boolean flag;
        if (cursor.getInt(2) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ((TreeMap) (obj)).put(obj1, Boolean.valueOf(flag));
        continue; /* Loop/switch isn't completed */
_L4:
        ((TreeMap) (obj)).put(new ae(((String) (obj1))), Integer.valueOf(cursor.getInt(2)));
        continue; /* Loop/switch isn't completed */
_L5:
        ((TreeMap) (obj)).put(new ae(((String) (obj1))), Long.valueOf(cursor.getLong(2)));
        continue; /* Loop/switch isn't completed */
_L6:
        ((TreeMap) (obj)).put(new ae(((String) (obj1))), Float.valueOf(cursor.getFloat(2)));
        if (true) goto _L8; else goto _L7
_L7:
        cursor.close();
        return ((SortedMap) (obj));
    }

    private void e()
    {
        this;
        JVM INSTR monitorenter ;
        ag ag1 = f;
        if (ag1 == null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        f = m();
        continue; /* Loop/switch isn't completed */
        Object obj;
        obj;
        com.facebook.debug.log.b.a(b, a, "Possible prefs database corruption", ((Throwable) (obj)));
        getContext().deleteDatabase("prefs_db");
        f = m();
        if (true) goto _L1; else goto _L3
_L3:
        obj;
        throw obj;
    }

    private ag m()
    {
        e e1 = com.facebook.debug.d.e.a("initializePrefsDatabase");
        ag ag1 = new ag(getContext());
        ag1.getWritableDatabase();
        e1.a();
        return ag1;
    }

    protected int a(Uri uri, ContentValues contentvalues, String s, String as[])
    {
        throw new IllegalArgumentException("Update not supported");
    }

    protected int a(Uri uri, String s, String as[])
    {
        g g1 = b();
        int j;
        j = b(uri, s, as);
        g1.d();
        c();
        return j;
        uri;
        c();
        throw uri;
    }

    protected int a(Uri uri, ContentValues acontentvalues[])
    {
        g g1 = b();
        int j;
        j = b(uri, acontentvalues);
        g1.d();
        c();
        return j;
        uri;
        c();
        throw uri;
    }

    protected Cursor a(Uri uri, String as[], String s, String as1[], String s1)
    {
        SQLiteQueryBuilder sqlitequerybuilder;
        sqlitequerybuilder = new SQLiteQueryBuilder();
        sqlitequerybuilder.setTables("preferences");
        sqlitequerybuilder.setProjectionMap(c);
        switch (i.match(uri))
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("Unknown URL ").append(uri).toString());

        case 1: // '\001'
            break;

        case 3: // '\003'
            break MISSING_BLOCK_LABEL_162;

        case 2: // '\002'
            sqlitequerybuilder.appendWhere((new StringBuilder()).append("_id='").append(DatabaseUtils.sqlEscapeString((String)uri.getPathSegments().get(1))).append("'").toString());
            break;
        }
_L1:
        if (TextUtils.isEmpty(s1))
        {
            uri = "key DESC";
        } else
        {
            uri = s1;
        }
        return sqlitequerybuilder.query(h, as, s, as1, null, null, uri);
        sqlitequerybuilder.appendWhere((new StringBuilder()).append("key='").append(DatabaseUtils.sqlEscapeString((String)uri.getPathSegments().get(2))).append("'").toString());
          goto _L1
    }

    protected Uri a(Uri uri, ContentValues contentvalues)
    {
        g g1 = b();
        uri = b(uri, contentvalues);
        g1.d();
        c();
        return uri;
        uri;
        c();
        throw uri;
    }

    protected String a(Uri uri)
    {
        return null;
    }

    protected void a()
    {
        this;
        JVM INSTR monitorenter ;
        e e1 = com.facebook.debug.d.e.a("FbSharedPreferencesContentProvider.onInitialize");
        Object obj = t.a(getContext());
        e = (ah)((t) (obj)).a(com/facebook/prefs/shared/ah);
        g = (h)((t) (obj)).a(com/facebook/prefs/shared/h);
        obj = g.a();
        i = new UriMatcher(-1);
        i.addURI(((String) (obj)), "prefs", 1);
        i.addURI(((String) (obj)), "prefs/#", 2);
        i.addURI(((String) (obj)), "prefs/key/*", 3);
        e();
        h = f.getWritableDatabase();
        obj = com.facebook.debug.d.e.a("#maybeMigrate");
        SortedMap sortedmap = d();
        if (e.a(sortedmap))
        {
            a(sortedmap);
        }
        ((e) (obj)).a();
        e1.a();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    protected ContentProviderResult[] a(ArrayList arraylist)
    {
        g g1 = b();
        arraylist = super.a(arraylist);
        g1.d();
        c();
        return arraylist;
        arraylist;
        c();
        throw arraylist;
    }

}
