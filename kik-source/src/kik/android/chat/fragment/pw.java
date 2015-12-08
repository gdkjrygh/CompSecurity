// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import com.kik.android.a;
import com.kik.g.r;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kik.a.d.k;
import kik.a.d.n;
import kik.a.f.q;
import kik.android.e.d;
import kik.android.util.cq;
import kik.android.util.p;

// Referenced classes of package kik.android.chat.fragment:
//            KikStartGroupFragment, KikContactsListFragment

final class pw extends r
{

    final String a;
    final List b;
    final KikStartGroupFragment c;
    final KikStartGroupFragment d;

    pw(KikStartGroupFragment kikstartgroupfragment, String s, List list, KikStartGroupFragment kikstartgroupfragment1)
    {
        d = kikstartgroupfragment;
        a = s;
        b = list;
        c = kikstartgroupfragment1;
        super();
    }

    public final void a(Object obj)
    {
        obj = (n)obj;
        kik.android.chat.fragment.KikStartGroupFragment.a(d, ((n) (obj)));
        Object obj1 = d.Y.b("Group Created");
        long l;
        if (a == null)
        {
            l = 0L;
        } else
        {
            l = a.length();
        }
        ((com.kik.android.a.f) (obj1)).a("Name Length", l).a("Has Picture", KikStartGroupFragment.b(d)).a("Participants Count", kik.android.chat.fragment.KikStartGroupFragment.a(d).size() + 1).b();
        obj1 = b.iterator();
        do
        {
            if (!((Iterator) (obj1)).hasNext())
            {
                break;
            }
            k k1 = (k)((Iterator) (obj1)).next();
            if (!k1.p())
            {
                d.U.a(k1.a());
            }
        } while (true);
        d.a(null);
        if (p.a().f())
        {
            (new kik.android.util.p.a(((n) (obj)).b(), d.Z, d.aa, d.W, d.X, (byte)0)).a(new d[] {
                c
            });
            return;
        } else
        {
            KikStartGroupFragment.b(d, ((n) (obj)));
            return;
        }
    }

    public final void a(Throwable throwable)
    {
        String s = null;
        d.a(null);
        int i;
        if (throwable instanceof q)
        {
            throwable = (q)throwable;
            i = throwable.a();
            throwable = ((Throwable) (throwable.b()));
        } else
        {
            i = 100;
            throwable = s;
        }
        i;
        JVM INSTR lookupswitch 5: default 84
    //                   104: 211
    //                   201: 126
    //                   202: 190
    //                   401: 258
    //                   403: 235;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        d.d(i);
        throwable = "Other";
_L8:
        if (i == 101)
        {
            throwable = "Network";
        }
        d.Y.b("Group Create Failed").a("Reason", throwable).b();
        return;
_L3:
        s = d.U.a((String)throwable, true).c();
        throwable = s;
        if (s == null)
        {
            throwable = KikStartGroupFragment.b(0x7f090202);
        }
        d.a(KikStartGroupFragment.b(0x7f0902e7), kik.android.chat.fragment.KikStartGroupFragment.a(0x7f0901a2, new Object[] {
            throwable
        }));
        throwable = "Other";
        continue; /* Loop/switch isn't completed */
_L4:
        d.a(cq.a(), KikStartGroupFragment.b(0x7f090025));
        throwable = "Other";
        continue; /* Loop/switch isn't completed */
_L2:
        s = (String)throwable;
        d.a(cq.a(), (String)throwable);
        throwable = s;
        continue; /* Loop/switch isn't completed */
_L6:
        throwable = "Restricted Name";
        d.a(KikStartGroupFragment.b(0x7f0902c8), KikStartGroupFragment.b(0x7f090121));
        continue; /* Loop/switch isn't completed */
_L5:
        throwable = "Invalid Name";
        d.a(KikStartGroupFragment.b(0x7f0902c8), KikStartGroupFragment.b(0x7f090059));
        if (true) goto _L8; else goto _L7
_L7:
    }
}
