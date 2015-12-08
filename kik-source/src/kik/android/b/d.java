// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.b;

import com.kik.g.p;
import com.kik.g.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kik.a.e.v;

// Referenced classes of package kik.android.b:
//            a, s

final class d extends r
{

    final p a;
    final a b;

    d(a a1, p p1)
    {
        b = a1;
        a = p1;
        super();
    }

    public final void a(Object obj)
    {
        obj = (Map)obj;
        super.c();
        ArrayList arraylist = new ArrayList();
        if (obj != null)
        {
            arraylist.addAll(((Map) (obj)).values());
        }
        obj = arraylist.iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            a.a a1 = (a.a)((Iterator) (obj)).next();
            if (a1 != null)
            {
                if (a1.a)
                {
                    kik.android.b.a.a(b).d(a1.c);
                }
                if (a1.b)
                {
                    kik.android.b.a.a(b).g(a1.c);
                }
                if (a1.d != null && a1.e != null)
                {
                    kik.android.b.a.a(b).a(a1.e, a1.d, a1.c);
                }
            }
        } while (true);
        kik.android.b.a.b(b).a("XDATA_CARD_PERMISSIONS_MIGRATED", Boolean.valueOf(true));
        a.a(Boolean.valueOf(true));
    }

    public final void a(Throwable throwable)
    {
        a.a(throwable);
    }
}
