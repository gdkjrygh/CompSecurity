// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.l;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import kik.a.d.a.a;
import kik.a.d.a.b;
import kik.a.d.a.d;
import kik.a.d.a.g;
import kik.a.d.a.h;
import kik.a.d.a.l;
import kik.a.d.a.m;
import kik.a.d.f;
import kik.a.d.s;
import kik.a.f.e.k;

// Referenced classes of package com.kik.l:
//            ad, ae

final class af
    implements y.a
{

    Vector a;
    f b;
    final Hashtable c;
    final Map d;
    final Map e;
    final ae f;

    af(ae ae, Hashtable hashtable, Map map, Map map1)
    {
        f = ae;
        c = hashtable;
        d = map;
        e = map1;
        super();
        a = new Vector();
        b = null;
    }

    public final void a(Object obj)
    {
        ad ad1 = (ad)obj;
        obj = ad1.c("body");
        boolean flag = ad1.a("was_me");
        int i = ad1.d("read_state");
        Object obj2 = ad1.c("uid");
        long l1 = ad1.e("timestamp");
        String s6 = ad1.c("partner_jid");
        String s7 = ad1.c("bin_id");
        String s1 = ad1.c("sys_msg");
        String s2 = ad1.c("stat_msg");
        Object obj1 = ad1.c("stat_user_jid");
        boolean flag1 = ad1.a("stat_special_visibility");
        String s3 = ad1.c("content_id");
        int j = ad1.d("friend_attr_id");
        String s4 = ad1.c("render_instructions");
        int i1 = ad1.d("message_retry_count");
        boolean flag2 = ad1.a("req_read_reciept");
        boolean flag3 = ad1.a("encryption_failure");
        obj2 = new s(s7, s6, flag, ((String) (obj2)), l1, i, flag2, i1, ad1.b("encryption_key"));
        ((s) (obj2)).b(flag3);
        if (obj != null)
        {
            ((s) (obj2)).a(new h(((String) (obj))));
        }
        if (s1 != null)
        {
            ((s) (obj2)).a(new m(s1));
        }
        if (flag3)
        {
            ((s) (obj2)).a(new b((byte)0));
        }
        if (s2 != null && obj1 != null)
        {
            ((s) (obj2)).a(new l(s2, ((String) (obj1)), flag1));
        }
        if (s4 != null)
        {
            ((s) (obj2)).a(new k(s4));
        }
        if (s3 != null)
        {
            ((s) (obj2)).a(new a(s3, ad1.c("app_id"), "2", null, null, null, null));
        }
        if (j != 0)
        {
            ((s) (obj2)).a(new d(j));
        }
        s2 = ((s) (obj2)).i();
        if (b == null || !b.b().equals(s2))
        {
            if (b != null)
            {
                b.a(a);
                a = new Vector();
            }
            b = new f(s2);
            c.put(s2, b);
        }
        a.add(obj2);
        obj1 = ((s) (obj2)).l().iterator();
        do
        {
            if (!((Iterator) (obj1)).hasNext())
            {
                break;
            }
            g g1 = (g)((Iterator) (obj1)).next();
            if (g1 instanceof a)
            {
                String s5 = ad1.c("content_id");
                List list = (List)d.get(s5);
                obj = list;
                if (list == null)
                {
                    obj = new ArrayList();
                }
                ((List) (obj)).add((a)g1);
                d.put(s5, obj);
            } else
            if (g1 instanceof d)
            {
                e.put(Integer.valueOf(ad1.d("friend_attr_id")), (d)g1);
            }
        } while (true);
        if (ad1.isLast())
        {
            b.a(a);
            c.put(s2, b);
        }
    }
}
