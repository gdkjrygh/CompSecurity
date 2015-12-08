// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDoneException;
import android.database.sqlite.SQLiteQueryBuilder;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class erz
{

    private static final esj a = new esa();
    private static final esj b = new esb();
    private static final Uri g = Uri.parse("content://GPhotos/collections");
    private final Context c;
    private final noz d;
    private final noz e;
    private final ery f;

    public erz(Context context)
    {
        c = context;
        d = noz.a(context, 2, "CollectionOps", new String[] {
            "sync"
        });
        e = noz.a(context, 3, "CollectionOps", new String[] {
            "sync"
        });
        f = (ery)olm.a(context, ery);
    }

    public static Uri a(int i, String s)
    {
        android.net.Uri.Builder builder = g.buildUpon().appendEncodedPath(Integer.toString(i));
        if (s != null)
        {
            builder.appendEncodedPath(s);
        } else
        {
            builder.appendEncodedPath("allMediaKeys");
        }
        return builder.build();
    }

    public static esm a(qfz qfz1)
    {
        Object obj;
        pzy apzy[];
        int i;
        boolean flag;
        int j;
        obj = esm.b;
        apzy = qfz1.b.f;
        j = apzy.length;
        i = 0;
        flag = false;
_L9:
        Object obj1 = obj;
        if (i >= j) goto _L2; else goto _L1
_L1:
        boolean flag1;
        qfz1 = ((qfz) (obj));
        flag1 = flag;
        apzy[i].a;
        JVM INSTR tableswitch 1 10: default 100
    //                   1 138
    //                   2 138
    //                   3 138
    //                   4 138
    //                   5 138
    //                   6 128
    //                   7 106
    //                   8 106
    //                   9 106
    //                   10 138;
           goto _L3 _L4 _L4 _L4 _L4 _L4 _L5 _L6 _L6 _L6 _L4
_L6:
        break; /* Loop/switch isn't completed */
_L3:
        flag1 = flag;
        qfz1 = ((qfz) (obj));
_L7:
        obj1 = qfz1;
        if (flag1)
        {
            break; /* Loop/switch isn't completed */
        }
        i++;
        obj = qfz1;
        flag = flag1;
        continue; /* Loop/switch isn't completed */
_L5:
        qfz1 = esm.c;
        flag1 = true;
        continue; /* Loop/switch isn't completed */
_L4:
        qfz1 = esm.a;
        flag1 = flag;
        if (true) goto _L7; else goto _L2
_L2:
        return ((esm) (obj1));
        if (true) goto _L9; else goto _L8
_L8:
    }

    private Iterable a()
    {
        return olm.c(c, esl);
    }

    private void a(int i, erq erq1, esj esj1, List list, String s)
    {
        if (!list.isEmpty())
        {
            long l = noy.a();
            for (Iterator iterator = Collections.unmodifiableList(erq1.a).iterator(); iterator.hasNext();)
            {
                Object obj = iterator.next();
                Iterator iterator1 = a().iterator();
                while (iterator1.hasNext()) 
                {
                    esj1.a(obj, (esl)iterator1.next());
                }
            }

            long l1 = noy.a();
            for (erq1 = Collections.unmodifiableList(erq1.b).iterator(); erq1.hasNext();)
            {
                erq1.next();
                esj1 = a().iterator();
                while (esj1.hasNext()) 
                {
                    esj1.next();
                }
            }

            if (e.a())
            {
                noy.a(i);
                noy.a("source", s);
                noy.b("insert listeners", l1 - l);
                noy.a("remove listeners", l1);
            }
            if (f != null)
            {
                erq1 = list.iterator();
                while (erq1.hasNext()) 
                {
                    esj1 = (String)erq1.next();
                    list = f.a;
                    s = g.buildUpon().appendEncodedPath(Integer.toString(i));
                    if (esj1 != null)
                    {
                        s.appendEncodedPath(esj1);
                    } else
                    {
                        s.appendEncodedPath("allMediaKeys");
                    }
                    list.notifyChange(s.build(), null);
                }
                erq1 = f.a;
                esj1 = g.buildUpon().appendEncodedPath(Integer.toString(i));
                if (false)
                {
                    esj1.appendEncodedPath(null);
                } else
                {
                    esj1.appendEncodedPath("allMediaKeys");
                }
                erq1.notifyChange(esj1.build(), null);
                return;
            }
        }
    }

    private void a(int i, qfz aqfz[], String s)
    {
        if (aqfz != null && aqfz.length != 0) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj;
        erq erq1;
        long l1;
        obj = c;
        obj = hik.a;
        obj = mvj.a(c, i);
        erq1 = new erq(d);
        l1 = noy.a();
        ((SQLiteDatabase) (obj)).beginTransactionNonExclusive();
        int i1 = aqfz.length;
        int j = 0;
_L8:
        if (j >= i1) goto _L4; else goto _L3
_L3:
        qfz qfz1 = aqfz[j];
        String s1;
        erq1.a(((SQLiteDatabase) (obj)), new esh(i, qfz1));
        s1 = qfz1.a.a;
        ((SQLiteDatabase) (obj)).delete("album_enrichments", "collection_media_key = ?", new String[] {
            s1
        });
        if (qfz1.g != null && qfz1.g.a != null) goto _L6; else goto _L5
_L6:
        qbs aqbs[];
        int j1;
        aqbs = qfz1.g.a;
        j1 = aqbs.length;
        int k = 0;
_L7:
        qbs qbs1;
        if (k >= j1)
        {
            break; /* Loop/switch isn't completed */
        }
        qbs1 = aqbs[k];
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("enrichment_media_key", qbs1.a.a);
        contentvalues.put("collection_media_key", s1);
        contentvalues.put("position", qbs1.b);
        contentvalues.put("protobuf", qlw.a(qbs1.c));
        ((SQLiteDatabase) (obj)).insertWithOnConflict("album_enrichments", null, contentvalues, 0);
        k++;
        if (true) goto _L7; else goto _L5
_L4:
        ((SQLiteDatabase) (obj)).setTransactionSuccessful();
        ((SQLiteDatabase) (obj)).endTransaction();
        obj = new ArrayList();
        int l = aqfz.length;
        for (j = 0; j < l; j++)
        {
            ((List) (obj)).add(aqfz[j].a.a);
        }

        break MISSING_BLOCK_LABEL_326;
        aqfz;
        ((SQLiteDatabase) (obj)).endTransaction();
        throw aqfz;
        a(i, erq1, a, ((List) (obj)), s);
        if (e.a())
        {
            noy.a("total", Integer.valueOf(aqfz.length));
            noy.a("duration", l1);
            return;
        }
          goto _L1
_L5:
        j++;
          goto _L8
    }

    public void a(int i, String s, etd etd, String s1)
    {
        a(i, Collections.singletonList(s), etd, s1);
    }

    public void a(int i, List list, etd etd, String s)
    {
        list = (new etb(c, i)).a(list, etd);
        a(i, (qfz[])list.toArray(new qfz[list.size()]), s);
    }

    public final void a(int i, qfz aqfz[])
    {
        a(i, aqfz, "addOrUpdate");
    }

    public final int b(int i, String s)
    {
        long l = noy.a();
        erq erq1 = new erq(d);
        erq1.a(mvj.a(c, i), new esg(s));
        List list = Collections.unmodifiableList(erq1.b);
        if (!list.isEmpty())
        {
            a(i, erq1, b, Collections.singletonList(s), "delete");
        }
        i = list.size();
        if (e.a())
        {
            noy.a("duration", l);
            noy.a("total removed", Integer.valueOf(i));
        }
        return i;
    }

    public final String c(int i, String s)
    {
        SQLiteDatabase sqlitedatabase = mvj.a(c, i);
        try
        {
            s = DatabaseUtils.stringForQuery(sqlitedatabase, SQLiteQueryBuilder.buildQueryString(true, "collections", new String[] {
                "collection_media_key"
            }, "collection_album_id = ?", null, null, null, null), new String[] {
                s
            });
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        return s;
    }

    public final qfz d(int i, String s)
    {
        mvu mvu1 = new mvu(mvj.b(c, i));
        mvu1.a = "collections";
        mvu1.b = esk.a;
        mvu1.c = "collection_media_key = ?";
        mvu1.d = esk.a(s);
        s = mvu1.a();
        byte abyte0[];
        if (!s.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_98;
        }
        abyte0 = s.getBlob(s.getColumnIndexOrThrow("protobuf"));
        qfz qfz1 = (qfz)qfz.a(new qfz(), abyte0);
        s.close();
        return qfz1;
        Object obj;
        obj;
        s.close();
        return null;
        obj;
        s.close();
        throw obj;
    }

    public final String e(int i, String s)
    {
        p.a(s, "Envelope media key must not be empty.");
        mvu mvu1 = new mvu(mvj.b(c, i));
        mvu1.a = "collections";
        mvu1.b = (new String[] {
            "collection_media_key"
        });
        mvu1.c = "associated_envelope_media_key = ?";
        mvu1.d = (new String[] {
            s
        });
        s = mvu1.a();
        boolean flag = s.moveToFirst();
        if (!flag)
        {
            s.close();
            return null;
        }
        String s1 = s.getString(s.getColumnIndexOrThrow("collection_media_key"));
        s.close();
        return s1;
        Exception exception;
        exception;
        s.close();
        throw exception;
    }

}
