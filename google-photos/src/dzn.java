// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class dzn
    implements dur, gsk
{

    private static final onh a = new onh("debug.photos.assistant.dogfood");
    private static final long b;
    private static final ekk c = (new ekm()).a(elt).a(hpg).b(gaf).a();
    private final Context d;
    private final mmv e;
    private final nql f;
    private final nqn g;
    private final ifj h;
    private final noz i;
    private final noz j;
    private final List k;

    dzn(Context context, mmv mmv1)
    {
        d = context;
        e = mmv1;
        f = (nql)olm.a(context, nql);
        g = (nqn)olm.a(context, nqn);
        h = (ifj)olm.a(context, ifj);
        k = olm.c(context, dzt);
        i = noz.a(context, 3, "RemoteNotificationSrc", new String[0]);
        j = noz.a(context, "RemoteNotificationSrc", new String[0]);
    }

    private ekq a(int l, String s, pzx pzx1, qgg aqgg[])
    {
        ekq ekq = null;
        Iterator iterator = k.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ekq ekq1 = ((dzt)iterator.next()).a(l, s, pzx1, aqgg);
            ekq = ekq1;
            if (ekq1 == null)
            {
                continue;
            }
            ekq = ekq1;
            break;
        } while (true);
        aqgg = ekq;
        if (ekq == null)
        {
            List list = a(pzx1);
            aqgg = ekq;
            if (!list.isEmpty())
            {
                aqgg = new dmb(l, list);
            }
        }
        return new ebv(l, pzx1.a, s, aqgg, elm.a);
    }

    private List a(int l, imi imi1, nsx nsx1)
    {
        ich ich1;
        ArrayList arraylist;
        arraylist = new ArrayList();
        ich1 = null;
_L8:
        if (!nsx1.moveToNext()) goto _L2; else goto _L1
_L1:
        Object obj = nsx1.i();
        if (obj != null) goto _L4; else goto _L3
_L3:
        obj = null;
_L13:
        if (obj != null) goto _L6; else goto _L5
_L5:
        obj = null;
_L14:
        if (obj == null) goto _L8; else goto _L7
_L7:
        Object obj1;
        int i1;
        Object obj2;
        ekq ekq;
        dzm dzm1;
        boolean flag;
        boolean flag1;
        boolean flag2;
        long l1;
        if (imi1 == null)
        {
            l1 = -1L;
        } else
        {
            l1 = imi1.a(nsx1.a().hashCode());
        }
        obj1 = new dun();
        obj1.f = dzv.a(((dzl) (obj)).i.a);
        obj1.g = ((dzl) (obj)).k;
        obj1.a = new duj(l, ((dzl) (obj)).b, "com.google.android.apps.photos.assistant.remote.source_id");
        obj1.b = dva.a;
        obj1.d = obj;
        obj1.e = l1;
        obj1.c = 0L;
        obj1.h = dul.d;
        obj2 = ((dun) (obj1)).a();
        if (13 == ((dzl) (obj)).i.a || 9 == ((dzl) (obj)).i.a)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        obj1 = ich1;
        if (i1 != 0)
        {
            obj1 = ich1;
            if (ich1 == null)
            {
                obj1 = ((ice)olm.a(d, ice)).a(l);
            }
        }
        if (i1 != 0 && (((ich) (obj1)).d || ((ich) (obj1)).e))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (11 == ((dzl) (obj)).i.a || 12 == ((dzl) (obj)).i.a)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag1 && h.a(l))
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (i1 == 0) goto _L10; else goto _L9
_L9:
        ich1 = ((ich) (obj1));
        if (!flag) goto _L8; else goto _L10
_L10:
        if (!flag1) goto _L12; else goto _L11
_L11:
        ich1 = ((ich) (obj1));
        if (!flag2) goto _L8; else goto _L12
_L12:
        arraylist.add(obj2);
        ich1 = ((ich) (obj1));
          goto _L8
_L4:
        obj = (ozs)((oyo) (obj)).a(ozs.a);
          goto _L13
_L6:
        obj = ((ozs) (obj)).b;
label0:
        {
            if (obj != null)
            {
                break label0;
            }
            obj = null;
        }
          goto _L14
        if (((pzt) (obj)).b != null && ((pzt) (obj)).b.length > 0)
        {
            ((est)olm.a(d, est)).a(l, Arrays.asList(((pzt) (obj)).b));
        }
        obj2 = ((eci)olm.a(d, eci)).a(((pzt) (obj)));
        if (obj2 != null) goto _L16; else goto _L15
_L15:
        if (!i.a()) goto _L18; else goto _L17
_L17:
        obj = String.valueOf(Arrays.toString(((pzt) (obj)).d));
        if (((String) (obj)).length() == 0) goto _L20; else goto _L19
_L19:
        "No registered renderer for templates: ".concat(((String) (obj)));
          goto _L18
_L20:
        new String("No registered renderer for templates: ");
          goto _L18
_L16:
        if (i.a())
        {
            i1 = ((pzx) (obj2)).a;
            (new StringBuilder(35)).append("Found template of type: ").append(i1);
        }
        if (((pzx) (obj2)).b != null)
        {
            break MISSING_BLOCK_LABEL_547;
        }
        obj = null;
          goto _L14
        ekq = a(l, nsx1.a(), ((pzx) (obj2)), ((pzt) (obj)).a);
        if (((pzt) (obj)).f == null || ((pzt) (obj)).f.a == null)
        {
            break MISSING_BLOCK_LABEL_883;
        }
          goto _L21
_L24:
        if (((pzx) (obj2)).b.d == null) goto _L23; else goto _L22
_L22:
        obj1 = ((pzx) (obj2)).b.d.a;
        obj = ((pzx) (obj2)).b.d.b;
_L25:
        dzm1 = new dzm(l, nsx1.a());
        dzm1.i = ((pzx) (obj2));
        dzm1.l = i1;
        dzm1.c = ((pzx) (obj2)).b.a;
        dzm1.d = ((pzx) (obj2)).b.b;
        dzm1.e = ((String) (obj1));
        dzm1.f = ((String []) (obj));
        dzm1.j = ekq;
        obj = new ArrayList((Collection)b.a(d, ekq).a(ekq, ekw.a, c).b());
        Collections.sort(((List) (obj)), new dzo(a(((pzx) (obj2)))));
        dzm1.h = ((List) (obj));
        dzm1.k = ((pzx) (obj2)).b.e;
        dzm1.g = nsx1.h().longValue();
        obj = new dzl(dzm1);
          goto _L14
_L21:
        i1 = ((pzt) (obj)).f.a.intValue();
          goto _L24
_L2:
        return arraylist;
_L23:
        obj = null;
        obj1 = null;
          goto _L25
_L18:
        obj = null;
          goto _L14
        eke eke1;
        eke1;
        eke1 = null;
          goto _L14
        i1 = 0;
          goto _L24
    }

    private static List a(pzx pzx1)
    {
        ArrayList arraylist = new ArrayList();
        if (pzx1.b != null && pzx1.b.c != null && pzx1.b.c.length > 0)
        {
            pzx1 = pzx1.b.c;
            int i1 = pzx1.length;
            for (int l = 0; l < i1; l++)
            {
                arraylist.add(((qev) (pzx1[l])).a);
            }

        }
        return arraylist;
    }

    public final int a(int l)
    {
        Iterator iterator = a(l, ((imi) (null))).iterator();
        l = 0;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            if (b(((dum)iterator.next()).a) == dut.a)
            {
                l++;
            }
        } while (true);
        return l;
    }

    public final duu a(dui dui1)
    {
        return null;
    }

    public final Object a()
    {
        return "com.google.android.apps.photos.assistant.remote.source_id";
    }

    public final List a(int l, imi imi1)
    {
        Object obj1;
        Object obj2;
        obj2 = null;
        mmx mmx1 = e.a(l);
        obj1 = (gcf)olm.a(d, gcf);
        long l1 = mmx1.d("com.google.android.apps.photos.assistant.remote.source").a("last_notification_sync_time", 0L);
        long l3 = System.currentTimeMillis();
        if (l3 - l1 > b && ((gcf) (obj1)).a(l))
        {
            e.b(l).h("com.google.android.apps.photos.assistant.remote.source").b("last_notification_sync_time", l3).d();
            mtj.a(d, new dzp(f, g, l));
        }
        obj1 = obj2;
        long l2 = noy.a();
        obj1 = obj2;
        Context context = d;
        obj1 = obj2;
        Object obj = ntd.a;
        obj1 = obj2;
        nta.a[((ntd) (obj)).ordinal()];
        JVM INSTR tableswitch 1 2: default 311
    //                   1 284
    //                   2 291;
           goto _L1 _L2 _L3
_L5:
        obj1 = obj2;
        obj = b.a(context, l, ((String) (obj)), null);
        obj1 = obj;
        if (!i.a())
        {
            break MISSING_BLOCK_LABEL_230;
        }
        obj1 = obj;
        noy.a("duration", l2);
        obj1 = obj;
        l2 = noy.a();
        obj1 = obj;
        imi1 = a(l, imi1, ((nsx) (obj)));
        obj1 = obj;
        if (!i.a())
        {
            break MISSING_BLOCK_LABEL_274;
        }
        obj1 = obj;
        noy.a("duration", l2);
        if (obj != null)
        {
            ((nsx) (obj)).close();
        }
        return imi1;
_L2:
        obj = "priority IN (3,4) AND read_state IN (1,4)";
        continue; /* Loop/switch isn't completed */
_L3:
        obj = "priority = 2 AND read_state IN (2,1,4)";
        continue; /* Loop/switch isn't completed */
        imi1;
        if (obj1 != null)
        {
            ((nsx) (obj1)).close();
        }
        throw imi1;
_L1:
        obj = "priority IN (3,4) AND read_state IN (2,1,4)";
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final void a(List list)
    {
        if (list.isEmpty())
        {
            return;
        } else
        {
            int l = ((dui)list.get(0)).a();
            f.a(l);
            return;
        }
    }

    public final boolean a(int l, String s)
    {
        return a(l, s, 5);
    }

    boolean a(int l, String s, int i1)
    {
        return nqw.a == f.a(l, new String[] {
            s
        }, i1).a;
    }

    public final int b(dui dui1)
    {
        dui1 = b.a(d, dui1.a(), new String[] {
            dui1.b()
        });
        if (!dui1.moveToFirst()) goto _L2; else goto _L1
_L1:
        dui1.f();
        JVM INSTR tableswitch 2 5: default 100
    //                   2 78
    //                   3 78
    //                   4 78
    //                   5 78;
           goto _L3 _L4 _L4 _L4 _L4
_L3:
        int l = dut.a;
_L5:
        dui1.close();
        return l;
_L4:
        l = dut.b;
        if (true) goto _L5; else goto _L2
_L2:
        dui1.close();
        return dut.a;
        Exception exception;
        exception;
        dui1.close();
        throw exception;
    }

    public final Uri b()
    {
        return nsw.a;
    }

    public final void b(int l, String s)
    {
        a(l, s, 4);
    }

    public final boolean c()
    {
        return true;
    }

    static 
    {
        b = TimeUnit.MINUTES.toMillis(10L);
    }
}
