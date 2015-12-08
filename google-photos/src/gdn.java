// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class gdn
    implements gcq
{

    final Set a = new HashSet();
    final HashMap b = new HashMap();
    private final Context c;
    private final gec d;
    private final gev e;
    private final gdl f;
    private final gdg g;
    private final noz h;
    private final noz i;

    gdn(Context context, gec gec1, gev gev1, gdl gdl1, gdg gdg1)
    {
        c = context;
        d = gec1;
        e = gev1;
        f = gdl1;
        g = gdg1;
        i = noz.a(context, 2, "RemoteMetadataSync", new String[] {
            "sync"
        });
        h = noz.a(context, 3, "RemoteMetadataSync", new String[] {
            "sync"
        });
    }

    public static gei a(int j)
    {
        return new gei(j);
    }

    private String a(gei gei1, gcr gcr1)
    {
        etz etz1 = null;
        gdr.a[gcr1.ordinal()];
        JVM INSTR tableswitch 1 4: default 40
    //                   1 95
    //                   2 102
    //                   3 109
    //                   4 116;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        gcr1 = String.valueOf(gcr1);
        p.b(etz1, (new StringBuilder(String.valueOf(gcr1).length() + 28)).append("no matching token type for: ").append(gcr1).toString());
        return ety.b(mvj.b(c, gei1.a), etz1);
_L2:
        etz1 = etz.a;
        continue; /* Loop/switch isn't completed */
_L3:
        etz1 = etz.b;
        continue; /* Loop/switch isn't completed */
_L4:
        etz1 = etz.c;
        continue; /* Loop/switch isn't completed */
_L5:
        etz1 = etz.d;
        if (true) goto _L1; else goto _L6
_L6:
    }

    static Set a(gdn gdn1)
    {
        return gdn1.a;
    }

    private void a(int j, String s, etz etz1)
    {
        ety.a(mvj.a(c, j), etz1, s);
    }

    private gcp b(gei gei1)
    {
        if (c(gei1))
        {
            return gcp.d;
        }
        int j = gei1.a;
        boolean flag;
        if (ety.a(mvj.b(c, j), etz.e) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            return gcp.c;
        } else
        {
            return gcp.b;
        }
    }

    private boolean c(gei gei1)
    {
        if (gei1.a != -1)
        {
            String s = a(gei1, gcr.a);
            gei1 = a(gei1, gcr.c);
            if (!TextUtils.isEmpty(s) && TextUtils.isEmpty(gei1))
            {
                return true;
            }
        }
        return false;
    }

    public final gcs a(geu geu1)
    {
        return new gdj(f.a, geu1);
    }

    public final gcs a(geu geu1, String s)
    {
        return new gde(g.a, geu1, s);
    }

    public final geu a(ds ds, get get1)
    {
        ds = (gei)ds;
        return e.a(((gei) (ds)).a, get1);
    }

    public final volatile String a(ds ds, gcr gcr1)
    {
        return a((gei)ds, gcr1);
    }

    public final void a(ds ds, gcy gcy, gcy gcy1)
    {
        gei gei1 = (gei)ds;
        ds = b(gei1);
        if (h.a())
        {
            noy.a("initialSyncResult", gcy);
            noy.a("deltaSyncResult", gcy1);
            noy.a("endLibraryState", ds);
        }
        int j = gei1.a;
        b.a(new gdq(this, j, ds, gcy, gcy1, ((eto)olm.a(c, eto)).e(j)));
        j = gei1.a;
        gcy = (gds)b.get(Integer.valueOf(j));
        gcy.a = false;
        gcy.b = ds;
    }

    public final void a(ds ds, geu geu1, boolean flag, gcx gcx1)
    {
_L2:
        int j1 = gcx1.i().length;
        qgi aqgi[] = new qgi[j1];
        for (int k = 0; k < j1; k++)
        {
            aqgi[k] = gcx1.i()[k].a;
        }

        eto eto1 = (eto)olm.a(c, eto);
        int l = geu1.d();
        qgg aqgg1[] = gcx1.h();
        qfu qfu = gcx1.g();
        if (geu1.c() != get.c)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        eto1.a(l, aqgg1, aqgi, qfu, flag);
        if (gcx1.k() != null)
        {
            ((gjj)olm.a(c, gjj)).a(geu1.d(), gcx1.k(), gcx1.g());
        }
        ((erz)olm.a(c, erz)).a(geu1.d(), gcx1.j());
        if (flag1)
        {
            ds.a();
        }
        return;
        gcx1 = (gcx)gcx1;
        if (h.a())
        {
            noy.a("syncTask", geu1);
            noy.a("isInitialSync", Boolean.valueOf(flag));
        }
        boolean flag1;
        if (!flag)
        {
            ds = new gez(c, geu1.d());
            qgg aqgg[] = gcx1.h();
            qir aqir[] = gcx1.i();
            if (!((gez) (ds)).d)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            p.a(flag, "can not prepare the same processor twice.");
            ds.d = true;
            if (aqgg.length != 0 || aqir.length != 0)
            {
label0:
                {
                    long l1 = noy.a();
                    Object obj1 = new ArrayList();
                    Object obj = new ArrayList();
                    int i1 = aqgg.length;
                    int j = 0;
                    while (j < i1) 
                    {
                        qgg qgg1 = aqgg[j];
                        qis qis1 = qgg1.c.j;
                        boolean flag2;
                        if (qis1 != null && qis1.a == 2)
                        {
                            flag2 = true;
                        } else
                        {
                            flag2 = false;
                        }
                        if (!flag2)
                        {
                            ((List) (obj)).add(qgg1);
                        } else
                        if (qis1.b != null && qis1.b.booleanValue())
                        {
                            ((List) (obj1)).add(qgg1);
                        }
                        j++;
                    }
                    Object obj2 = mvj.b(((gez) (ds)).a, ((gez) (ds)).b);
                    obj = ds.a(((SQLiteDatabase) (obj2)), ((java.util.Collection) (obj)));
                    if (!((Set) (obj)).isEmpty())
                    {
                        gfa gfa1 = new gfa(((gez) (ds)).a, ((gez) (ds)).b, ((Set) (obj)));
                        ((gez) (ds)).e.add(gfa1);
                    }
                    obj1 = ds.b(((SQLiteDatabase) (obj2)), ((java.util.Collection) (obj1)));
                    if (!((Set) (obj1)).isEmpty())
                    {
                        ((Set) (obj1)).removeAll(((java.util.Collection) (obj)));
                    }
                    if (!((Set) (obj1)).isEmpty())
                    {
                        obj2 = new gfc(((gez) (ds)).a, ((gez) (ds)).b, ((Set) (obj1)));
                        ((gez) (ds)).e.add(obj2);
                    }
                    obj2 = ds.a(aqir);
                    ((Set) (obj2)).removeAll(((java.util.Collection) (obj)));
                    ((Set) (obj2)).removeAll(((java.util.Collection) (obj1)));
                    if (!((Set) (obj2)).isEmpty())
                    {
                        gfb gfb1 = new gfb(((gez) (ds)).a, ((gez) (ds)).b, ((Set) (obj2)));
                        ((gez) (ds)).e.add(gfb1);
                    }
                    if (((gez) (ds)).c.a())
                    {
                        noy.a("items count", Integer.valueOf(aqgg.length));
                        noy.a("tombstone count", Integer.valueOf(aqir.length));
                        noy.a("trash dedupKeys", obj1);
                        noy.a("restore dedupKeys", obj);
                        noy.a("tombstone dedupKeys", obj2);
                        noy.a("duration", l1);
                    }
                    if (!((gez) (ds)).e.isEmpty())
                    {
                        flag1 = true;
                        break label0;
                    }
                }
            }
            flag1 = false;
            continue; /* Loop/switch isn't completed */
        }
        flag1 = false;
        ds = null;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final void a(ds ds, Long long1)
    {
        ds = (gei)ds;
        if (h.a())
        {
            noy.a("photoCount", long1);
        }
        int j = (int)((eto)olm.a(c, eto)).e(((gei) (ds)).a);
        b.a(new gdp(this, ((gei) (ds)).a, long1, j));
    }

    public final void a(ds ds, String s)
    {
        a(((gei)ds).a, s, etz.b);
    }

    public final void a(ds ds, boolean flag, String s, String s1)
    {
        Object obj;
        obj = (gei)ds;
        if (flag)
        {
            ds = etz.c;
        } else
        {
            ds = etz.d;
        }
        if (TextUtils.isEmpty(s))
        {
            a(((gei) (obj)).a, s1, ((etz) (ds)));
            return;
        }
        int j = ((gei) (obj)).a;
        obj = mvj.a(c, j);
        ((SQLiteDatabase) (obj)).beginTransactionNonExclusive();
        ety.a(((SQLiteDatabase) (obj)), ds, s1);
        ety.a(((SQLiteDatabase) (obj)), etz.b, s);
        ((SQLiteDatabase) (obj)).setTransactionSuccessful();
        ((SQLiteDatabase) (obj)).endTransaction();
        return;
        ds;
        ((SQLiteDatabase) (obj)).endTransaction();
        throw ds;
    }

    public final void a(gei gei1)
    {
        mvj.a(c, gei1.a).delete("metadata_sync", null, null);
    }

    public final boolean a(ds ds)
    {
        return c((gei)ds);
    }

    public final gcp b(int j)
    {
        gcp gcp1;
        boolean flag;
        if (j != -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag);
        if (b.containsKey(Integer.valueOf(j)))
        {
            gcp1 = ((gds)b.get(Integer.valueOf(j))).b;
            flag = true;
        } else
        {
            gcp1 = b(a(j));
            flag = false;
        }
        if (i.a())
        {
            noy.a(j);
            noy.a("state", gcp1);
            noy.a("cached", Boolean.valueOf(flag));
        }
        return gcp1;
    }

    public final void b(ds ds)
    {
        a((gei)ds);
    }

    public final void c(ds ds)
    {
        gei gei1 = (gei)ds;
        gcp gcp1 = b(gei1);
        if (h.a())
        {
            noy.a("startLibraryState", gcp1);
        }
        int j = gei1.a;
        if (b.containsKey(Integer.valueOf(j)))
        {
            ds = (gds)b.get(Integer.valueOf(j));
            ds.a = true;
            ds.b = gcp1;
        } else
        {
            ds = new gds(true, gcp1);
        }
        b.put(Integer.valueOf(j), ds);
        b.a(new gdo(this, gei1.a, gcp1));
    }

    public final void d(ds ds)
    {
        Object obj;
        obj = (gei)ds;
        String s = a(((gei) (obj)), gcr.a);
        ds = a(((gei) (obj)), gcr.b);
        if (h.a())
        {
            noy.a("currentSyncToken", s);
            noy.a("nextSyncToken", ds);
        }
        obj = mvj.a(c, ((gei) (obj)).a);
        ((SQLiteDatabase) (obj)).beginTransactionNonExclusive();
        ety.a(((SQLiteDatabase) (obj)), etz.a, ds);
        ety.a(((SQLiteDatabase) (obj)), etz.b, null);
        ((SQLiteDatabase) (obj)).setTransactionSuccessful();
        ((SQLiteDatabase) (obj)).endTransaction();
        return;
        ds;
        ((SQLiteDatabase) (obj)).endTransaction();
        throw ds;
    }

    public final void e(ds ds)
    {
        ds = d;
        int j;
        for (Iterator iterator = ((gec) (ds)).a.a(new String[] {
    "logged_in"
}).iterator(); iterator.hasNext(); ((gec) (ds)).b.c(j))
        {
            j = ((Integer)iterator.next()).intValue();
        }

        if (((gec) (ds)).d != null)
        {
            b.a(new ged(ds));
            return;
        } else
        {
            ((gec) (ds)).c.a.getSharedPreferences("com.google.android.apps.photos.metasync.remote.sync_reset_model", 0).edit().putBoolean("account_reset", true).commit();
            return;
        }
    }
}
