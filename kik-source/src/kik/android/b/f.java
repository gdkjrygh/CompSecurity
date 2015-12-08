// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.b;

import com.b.a.b;
import com.kik.g.p;
import com.kik.g.r;
import com.kik.m.e;
import com.kik.n.a.c.i;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kik.a.e.v;
import kik.a.i.h;
import kik.android.util.DeviceUtils;
import kik.android.util.bx;

// Referenced classes of package kik.android.b:
//            a, e

final class f extends r
{

    final Map a;
    final kik.android.b.e b;

    f(kik.android.b.e e1, Map map)
    {
        b = e1;
        a = map;
        super();
    }

    public final void a(Object obj)
    {
        HashMap hashmap;
        Object obj1;
        long l;
        obj1 = (i)obj;
        obj = new ArrayList(a.values());
        ((List) (obj)).removeAll(Collections.singleton(null));
        hashmap = new HashMap();
        Iterator iterator = ((List) (obj)).iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            kik.a.i.h.a a2 = (kik.a.i.h.a)iterator.next();
            byte abyte0[] = kik.android.b.a.a(a2);
            if (abyte0 != null)
            {
                try
                {
                    hashmap.put(e.b(abyte0), a2);
                }
                catch (IOException ioexception1)
                {
                    if (DeviceUtils.c())
                    {
                        ioexception1.printStackTrace();
                    }
                }
            }
        } while (true);
        l = System.currentTimeMillis();
        if (obj1 == null) goto _L2; else goto _L1
_L1:
        int j;
        obj1 = ((i) (obj1)).b();
        j = 0;
        if (obj1 == null) goto _L2; else goto _L3
_L3:
        obj1 = ((List) (obj1)).iterator();
_L4:
        Object obj2;
        int k;
        if (!((Iterator) (obj1)).hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj2 = (b)((Iterator) (obj1)).next();
        k = j;
        obj2 = (kik.a.i.h.a)hashmap.get(e.b(((b) (obj2)).c()));
        k = j;
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_221;
        }
        j++;
        k = j;
        ((kik.a.i.h.a) (obj2)).a(l - (long)j);
        k = j;
        j = k;
        continue; /* Loop/switch isn't completed */
        IOException ioexception;
        ioexception;
        if (DeviceUtils.c())
        {
            ioexception.printStackTrace();
            j = k;
        } else
        {
            bx.a(ioexception);
            j = k;
        }
        if (true) goto _L4; else goto _L2
_L2:
        kik.a.i.h.a a1;
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); kik.android.b.a.c(b.c).a(a1))
        {
            a1 = (kik.a.i.h.a)((Iterator) (obj)).next();
        }

        b.b.a(Boolean.valueOf(true));
        kik.android.b.a.b(b.c).a("XDATA_CARD_HISTORY_MIGRATED", Boolean.valueOf(true));
        return;
    }

    public final void a(Throwable throwable)
    {
        b.b.a(throwable);
    }
}
