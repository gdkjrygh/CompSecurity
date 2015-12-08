// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentValues;
import android.content.Context;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;

final class gby
{

    private static ekk a = (new ekm()).a(elt).a();
    private final Context b;
    private final int c;
    private final ekq d;
    private final ekv e;
    private final int f;
    private final int g;
    private final gbs h;
    private final gca i;
    private final amh j;
    private final fli k;
    private final noz l;
    private final noz m;
    private final noz n;

    public gby(Context context, int i1, ekq ekq, int j1, int k1, int l1, gca gca1)
    {
        this(context, ekq, j1, k1, l1, b.a(context, ekq), new gbs(context, i1, k1, l1), gca1, (amh)olm.a(context, amh), (fli)olm.a(context, fli));
    }

    private gby(Context context, ekq ekq, int i1, int j1, int k1, ekv ekv1, gbs gbs1, 
            gca gca1, amh amh1, fli fli1)
    {
        b = context;
        c = i1;
        d = ekq;
        e = ekv1;
        f = j1;
        g = k1;
        h = gbs1;
        i = gca1;
        j = amh1;
        k = fli1;
        l = noz.a(context, 3, "SyncBatch", new String[] {
            "perf", "sync"
        });
        m = noz.a(context, 2, "SyncBatch", new String[] {
            "perf", "sync"
        });
        n = noz.a(context, 3, "SyncBatch", new String[0]);
    }

    public final long a()
    {
        ekp ekp1;
        int i1;
        int k1;
        int l1;
        long l2;
        long l3;
        l3 = noy.a();
        Object obj;
        try
        {
            obj = e;
            ekq ekq = d;
            eky eky1 = new eky();
            eky1.a = c;
            obj = (List)((ekv) (obj)).a(ekq, eky1.a(), a).a();
        }
        catch (eke eke1)
        {
            return 0L;
        }
        if (l.a())
        {
            noy.a("duration", l3);
        }
        obj = ((List) (obj)).iterator();
        l2 = 0L;
        k1 = 0;
        i1 = 0;
        l1 = 0;
_L13:
        if (!((Iterator) (obj)).hasNext()) goto _L2; else goto _L1
_L1:
        ekp1 = (ekp)((Iterator) (obj)).next();
        if (!i.a()) goto _L4; else goto _L3
_L3:
        if (l.a())
        {
            noy.a("duration", l3);
        }
_L11:
        return l2;
_L4:
        gap gap1;
        gbs gbs1;
        boolean flag;
        long l4;
        l4 = noy.a();
        gap1 = ((elt)ekp1.a(elt)).e();
        gbs1 = h;
        if (!euv.c.equals(ekp1.c()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag) goto _L6; else goto _L5
_L5:
        if (gap1.f() && !gap1.e())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag) goto _L7; else goto _L6
_L6:
        if (gbs1.f.a())
        {
            noy.a("media", ekp1);
            noy.a("model", gap1);
        }
        flag = false;
_L9:
        if (flag)
        {
            break; /* Loop/switch isn't completed */
        }
        if (m.a())
        {
            noy.a("media model", gap1);
        }
        l1++;
        continue; /* Loop/switch isn't completed */
_L7:
        String s1 = gap1.a();
        if (DatabaseUtils.queryNumEntries(mvj.b(gbs1.a, gbs1.b), "media_sync_table", "url = ? AND width = ? AND height = ?", new String[] {
    s1, gbs1.c, gbs1.d
}) > 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            if (gbs1.f.a())
            {
                noy.a("media", ekp1);
                noy.a("model", gap1);
            }
            flag = false;
        } else
        {
            flag = true;
        }
        if (true) goto _L9; else goto _L8
_L8:
        Object obj1;
        String s;
        long l5;
        try
        {
            obj1 = (File)j.b(gap1).a(k.h()).a(f, g).get();
        }
        catch (InterruptedException interruptedexception)
        {
            i1++;
            continue; /* Loop/switch isn't completed */
        }
        catch (ExecutionException executionexception)
        {
            gca gca1 = i;
            Throwable throwable = executionexception.getCause();
            if (throwable instanceof and)
            {
                int j1 = ((and)throwable).a;
                boolean flag1 = gca1.e;
                if (j1 == 500 || j1 == 502 || j1 == 503 || j1 == 504)
                {
                    j1 = 1;
                } else
                {
                    j1 = 0;
                }
                gca1.e = j1 | flag1;
            }
            i1++;
            continue; /* Loop/switch isn't completed */
        }
        l5 = ((File) (obj1)).length();
        obj1 = h;
        s = (String)p.a(gap1.a());
        ((gbs) (obj1)).e.put("url", s);
        ((gbs) (obj1)).e.put("sync_time", Long.valueOf(System.currentTimeMillis()));
        mvj.a(((gbs) (obj1)).a, ((gbs) (obj1)).b).insert("media_sync_table", null, ((gbs) (obj1)).e);
        if (m.a())
        {
            noy.a("model", gap1);
            noy.a("width", Integer.valueOf(f));
            noy.a("height", Integer.valueOf(g));
            noy.a(b, l5);
            noy.a("duration", l4);
        }
        l2 += l5;
        k1++;
        continue; /* Loop/switch isn't completed */
_L2:
        if (!l.a()) goto _L11; else goto _L10
_L10:
        noy.a("MediaCollection", d);
        noy.a("duration", l3);
        noy.a("downloaded images", Integer.valueOf(k1));
        noy.a(b, l2);
        noy.a("failed", Integer.valueOf(i1));
        noy.a("skipped", Integer.valueOf(l1));
        return l2;
        if (true) goto _L13; else goto _L12
_L12:
    }

}
