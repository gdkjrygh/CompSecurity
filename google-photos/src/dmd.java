// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

final class dmd
    implements elf
{

    private static final ekz a = (new ela()).a();
    private static final Set b = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[] {
        "_id", "capture_timestamp", "type", "media_key"
    })));
    private final Context c;
    private final elp d;
    private final mmv e;
    private final noz f;

    dmd(Context context, elp elp1)
    {
        c = context;
        d = elp1;
        e = (mmv)olm.a(context, mmv);
        f = noz.a(context, 3, "MediaKeyCollectionHndlr", new String[] {
            "perf"
        });
    }

    static Context a(dmd dmd1)
    {
        return dmd1.c;
    }

    static djo a(dmd dmd1, Cursor cursor, int i, ekk ekk)
    {
        int j = cursor.getColumnIndexOrThrow("_id");
        int k = cursor.getColumnIndexOrThrow("type");
        int l = cursor.getColumnIndexOrThrow("capture_timestamp");
        return new djo(i, cursor.getLong(j), cursor.getLong(l), euv.a(cursor.getInt(k)), dmd1.d.a(i, cursor, ekk));
    }

    private static List a(Collection collection, List list)
    {
        collection = new HashSet(collection);
        collection.removeAll(list);
        list = new ArrayList(collection.size());
        for (collection = collection.iterator(); collection.hasNext(); list.add(djf.a((String)collection.next()))) { }
        return list;
    }

    private Set a(int i, String s, List list, Set set, Set set1)
    {
        djh djh1;
        int j;
        int k;
        long l1;
        l1 = noy.a();
        djh1 = djh.a(c, i, list);
        k = 0;
        j = 1;
_L5:
        qfu aqfu[];
        int l;
        int j1;
        djh1.d();
        if (djh1.l())
        {
            throw new eke(((nxx) (djh1)).n);
        }
        aqfu = djh1.a.c;
        j1 = aqfu.length;
        l = 0;
_L3:
        qfu qfu1;
        if (l >= j1)
        {
            break MISSING_BLOCK_LABEL_148;
        }
        qfu1 = aqfu[l];
        if (!qfu1.b.equals(s)) goto _L2; else goto _L1
_L1:
        if (qfu1 == null)
        {
            s = String.valueOf(list);
            throw new eke((new StringBuilder(String.valueOf(s).length() + 41)).append("Owner not found in response.  LegacyIds: ").append(s).toString());
        }
        break MISSING_BLOCK_LABEL_154;
_L2:
        l++;
          goto _L3
        qfu1 = null;
          goto _L1
        qgg aqgg[] = djh1.a.b;
        a(aqgg, qfu1);
        ((eto)olm.a(c, eto)).a(i, aqgg, new qgi[0], qfu1, true);
        int k1 = aqgg.length;
        for (int i1 = 0; i1 < k1; i1++)
        {
            qeo qeo1 = aqgg[i1].b;
            set1.add(qeo1.a);
            if (qeo1.b != null && qeo1.b.b != null)
            {
                set.remove(qeo1.b.b);
            }
            k++;
        }

        if (djh1.a.a != null)
        {
            djh1 = djh.b(c, i, list, djh1.a.a);
            j++;
        } else
        {
            djh1 = null;
        }
        if (djh1 == null)
        {
            if (f.a())
            {
                noy.a("duration", l1);
                noy.a("numPages", Integer.valueOf(j));
                noy.a("numItems", Integer.valueOf(k));
            }
            return set1;
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    private static Set a(SQLiteDatabase sqlitedatabase, List list)
    {
        String s = String.valueOf("SELECT dedup_key FROM remote_media WHERE ");
        String s1 = String.valueOf(b.b("media_key", list.size()));
        if (s1.length() != 0)
        {
            s = s.concat(s1);
        } else
        {
            s = new String(s);
        }
        sqlitedatabase = sqlitedatabase.rawQuery(s, (String[])list.toArray(new String[list.size()]));
        list = new HashSet(sqlitedatabase.getCount());
        for (; sqlitedatabase.moveToNext(); list.add(sqlitedatabase.getString(0))) { }
        break MISSING_BLOCK_LABEL_120;
        list;
        sqlitedatabase.close();
        throw list;
        sqlitedatabase.close();
        return list;
    }

    static Set a(dmd dmd1, SQLiteDatabase sqlitedatabase, List list)
    {
        return a(sqlitedatabase, list);
    }

    private static void a(List list, Set set)
    {
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            Object obj = ((djf)list.next()).a();
            if (((qeo) (obj)).b != null)
            {
                obj = ((qeo) (obj)).b.b;
                if (obj != null)
                {
                    set.add(obj);
                }
            }
        } while (true);
    }

    private static void a(qgg aqgg[], qfu qfu1)
    {
        int j = aqgg.length;
        for (int i = 0; i < j; i++)
        {
            qgg qgg1 = aqgg[i];
            if (!qfu1.a.a.equals(qgg1.c.b.a))
            {
                aqgg = String.valueOf(qgg1.b.a);
                if (aqgg.length() != 0)
                {
                    aqgg = "Media does not belong to owner.  Media: ".concat(aqgg);
                } else
                {
                    aqgg = new String("Media does not belong to owner.  Media: ");
                }
                throw new eke(aqgg);
            }
        }

    }

    private boolean a(SQLiteDatabase sqlitedatabase, Set set)
    {
        for (set = set.iterator(); set.hasNext();)
        {
            boolean flag;
            if (DatabaseUtils.longForQuery(sqlitedatabase, "SELECT count(*) FROM remote_media WHERE media_key = ?", new String[] {
    (String)set.next()
}) > 0L)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (!flag)
            {
                return false;
            }
        }

        return true;
    }

    private static List b(List list, Set set)
    {
        ArrayList arraylist = new ArrayList();
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            djf djf1 = (djf)list.next();
            qeo qeo1 = djf1.a();
            if (qeo1.b != null && qeo1.b.b != null && set.contains(qeo1.b.b))
            {
                arraylist.add(djf1);
            }
        } while (true);
        return arraylist;
    }

    public final long a(ekq ekq, ekw ekw)
    {
        throw new UnsupportedOperationException();
    }

    public final Class a()
    {
        return dmb;
    }

    public final List a(ekq ekq, ekw ekw, ekk ekk)
    {
        dmb dmb1 = (dmb)ekq;
        long l = noy.a();
        int i = dmb1.a;
        ekw = mvj.b(c, i);
        ekq = new HashSet(Collections.unmodifiableList(dmb1.b));
        Object obj = new HashSet();
        int j = dmb1.a;
        Object obj1 = mvj.b(c, j);
        Object obj2 = e.a(j).b("gaia_id");
        List list = dmb1.a(((String) (obj2)));
        boolean flag;
        if (dmb1.c.size() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            a(list, ((Set) (obj)));
            dmf dmf1 = new dmf(this, new ArrayList(((Collection) (obj))), ((SQLiteDatabase) (obj1)), ekq, ((Set) (obj)));
            b.a(500, ((Set) (obj)).size(), dmf1);
        }
        if (!((Set) (obj)).isEmpty() || !a(((SQLiteDatabase) (obj1)), ((Set) (ekq))))
        {
            a(j, ((String) (obj2)), list, ((Set) (obj)), ((Set) (ekq)));
        }
        if (!((Set) (obj)).isEmpty())
        {
            throw new ekt(b(list, ((Set) (obj))));
        }
        obj = new ArrayList(ekq);
        String as[] = d.a(b, ekk);
        obj1 = new ArrayList(ekq.size());
        obj2 = new ArrayList(ekq.size());
        ekw = new dme(this, ((List) (obj)), ekw, as, i, ((List) (obj1)), ekk, ((List) (obj2)));
        b.a(500, ((List) (obj)).size(), ekw);
        if (((List) (obj1)).size() != ekq.size())
        {
            throw new ekt(a(((Collection) (ekq)), ((List) (obj2))));
        }
        if (f.a())
        {
            noy.a("duration", l);
        }
        return ((List) (obj1));
    }

    public final ekz b()
    {
        return a;
    }

    public final ekz c()
    {
        throw new UnsupportedOperationException();
    }

}
