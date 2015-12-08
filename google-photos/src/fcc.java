// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Point;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public final class fcc
    implements fbw
{

    private static final long a;
    private final Context b;
    private final fcg c;
    private final fbl d;
    private final fcb e;
    private final noz f;
    private final noz g;
    private final fbv h;
    private final fbz i;
    private final fcz j;
    private final long k;
    private final fcl l;
    private fbx m;

    fcc(Context context, fcg fcg1, fbl fbl1, fcb fcb1, fbv fbv1, fbz fbz1, fcl fcl1, 
            fcz fcz1)
    {
        this(context, fcg1, fbl1, fcb1, fbv1, fbz1, fcl1, fcz1, a);
    }

    private fcc(Context context, fcg fcg1, fbl fbl1, fcb fcb1, fbv fbv1, fbz fbz1, fcl fcl1, 
            fcz fcz1, long l1)
    {
        m = fbx.a;
        h = fbv1;
        i = fbz1;
        j = fcz1;
        k = l1;
        b = (Context)p.a(context);
        c = (fcg)p.a(fcg1);
        d = (fbl)p.a(fbl1);
        e = (fcb)p.a(fcb1);
        l = fcl1;
        f = noz.a(context, 3, "PhotosDeviceMgmt", new String[0]);
        g = noz.a(context, "PhotosDeviceMgmt", new String[0]);
    }

    private fcm a(int i1, fcy fcy1, long l1)
    {
        Object obj;
        long l3;
label0:
        {
            obj = c.b();
            Iterator iterator;
            long l2;
            try
            {
                obj = d.a(i1, ((Iterable) (obj)));
            }
            // Misplaced declaration of an exception variable
            catch (fcy fcy1)
            {
                return null;
            }
            iterator = ((List) (obj)).iterator();
            l2 = 0L;
            while (iterator.hasNext()) 
            {
                l2 = ((fcj)iterator.next()).b() + l2;
                l3 = l2;
                if (l2 >= l1)
                {
                    break label0;
                }
            }
            l3 = l2;
        }
        if (l3 < l1) goto _L2; else goto _L1
_L1:
        Object obj1;
        SQLiteDatabase sqlitedatabase;
        fcm fcm1;
        fcm1 = fcm.a(i1, fcy1);
        fcl fcl1 = l;
        sqlitedatabase = mvj.a(fcl1.a, fcm1.a);
        ContentValues contentvalues;
        Iterator iterator1;
        fcj fcj1;
        if (((List) (obj)).isEmpty())
        {
            fcy1 = new HashMap();
        } else
        {
            fcy1 = fcl1.a(((List) (obj)));
            obj1 = new fcq(fcy1, sqlitedatabase, fcl1.a);
            b.a(100, fcy1.size(), ((ert) (obj1)));
            if (fcl1.c.a())
            {
                noy.a("getDedupKeyHasOriginalBytesWrapperMap", ((fcq) (obj1)).a);
            }
            fcy1 = ((fcq) (obj1)).a;
        }
        sqlitedatabase.beginTransactionNonExclusive();
        fcl.a(sqlitedatabase);
        contentvalues = new ContentValues();
        iterator1 = ((List) (obj)).iterator();
_L7:
        if (!iterator1.hasNext()) goto _L4; else goto _L3
_L3:
        fcj1 = (fcj)iterator1.next();
        obj = fcl1.d;
        if (fcy1.containsKey(fcl1.a(fcj1)))
        {
            obj = (fco)fcy1.get(fcl1.a(fcj1));
        }
        if (obj != fco.b && obj != fco.c)
        {
            continue; /* Loop/switch isn't completed */
        }
        contentvalues.clear();
        contentvalues.put("batch_id", fcm1.b);
        contentvalues.put("threshold", Integer.valueOf(fcm1.c.e));
        contentvalues.put("content_uri", fcj1.a());
        contentvalues.put("last_modified", Long.valueOf(fcj1.c()));
        contentvalues.put("size_bytes", Long.valueOf(fcj1.b()));
        obj1 = fcl1.b.a(fcj1.a());
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_623;
        }
        obj1 = ((nko) (obj1)).a();
_L5:
        contentvalues.put("fingerprint", ((String) (obj1)));
        contentvalues.put("type", Integer.valueOf(fcj1.d().c));
        obj1 = fcj1.e();
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_440;
        }
        contentvalues.put("width", Integer.valueOf(((Point) (obj1)).x));
        contentvalues.put("height", Integer.valueOf(((Point) (obj1)).y));
        contentvalues.put("path", fcj1.f());
        contentvalues.put("has_original_bytes", Integer.valueOf(((fco) (obj)).e));
        sqlitedatabase.insert("device_mgmt_batch", null, contentvalues);
        p.b(obj, "photosQuality should not be set with null, Instead set UNKNOWN");
        fcm1.h = fbn.a(fcm1.h, fbn.a(((fco) (obj))));
        fcm1.d = fcm1.d + 1;
        l1 = fcm1.e;
        fcm1.e = fcj1.b() + l1;
        continue; /* Loop/switch isn't completed */
        fcy1;
        sqlitedatabase.endTransaction();
        throw fcy1;
        obj1 = null;
          goto _L5
_L4:
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        return fcm1;
_L2:
        return null;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final void a()
    {
        Object obj = e.a();
        int i1 = ((fcx) (obj)).c;
        if (((fcx) (obj)).a)
        {
            obj = a(i1, ((fcx) (obj)).b, i.c());
            if (obj != null)
            {
                if (f.a())
                {
                    noy.a("batch", obj);
                }
                h.a(i1, ((fcm) (obj)));
            }
        } else
        if (i1 != -1)
        {
            fcm fcm1 = l.a(i1);
            if (fcm1 != null && fcy.b.equals(((fcx) (obj)).b))
            {
                l.b(fcm1);
                h.d(i1, fcm1);
                return;
            }
        }
    }

    public final boolean a(int i1, String s)
    {
label0:
        {
            {
                fcm fcm1 = l.a(i1, s);
                if (fcm1 == null || fcm1.f)
                {
                    break label0;
                }
                m = fbx.b;
                h.b(i1, fcm1);
                s = c.a(l.a(fcm1));
                Context context;
                try
                {
                    s = d.a(i1, s);
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    m = fbx.a;
                    h.a(i1, fcm1);
                    return false;
                }
                c.a(s);
                s = obx.a(fcm1.e);
                context = b;
                ((mrv)olm.a(context, mrv)).a(context, s);
                m = fbx.c;
                h.c(i1, fcm1);
                try
                {
                    Thread.sleep(k);
                }
                // Misplaced declaration of an exception variable
                catch (String s) { }
            }
            if (fcm1 != null)
            {
                l.b(fcm1);
            }
            m = fbx.a;
            h.d(i1, fcm1);
            return true;
        }
        if (fcm1 != null && f.a())
        {
            noy.a("batch", fcm1);
        } else
        if (f.a())
        {
            noy.a("batchId", s);
        }
        if (false)
        {
        } else
        {
            break MISSING_BLOCK_LABEL_137;
        }
    }

    public final fbx b()
    {
        return m;
    }

    public final void b(int i1, String s)
    {
        s = l.a(i1, s);
        if (s != null)
        {
            SQLiteDatabase sqlitedatabase = mvj.a(l.a, ((fcm) (s)).a);
            ContentValues contentvalues = new ContentValues(1);
            contentvalues.put("is_dismissed", Integer.valueOf(1));
            sqlitedatabase.update("device_mgmt_batch", contentvalues, null, null);
        }
        j.a(i1);
        h.e(i1, s);
    }

    static 
    {
        a = TimeUnit.SECONDS.toMillis(5L);
    }
}
