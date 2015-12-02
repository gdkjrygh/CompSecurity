// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.picker;

import com.facebook.debug.log.b;
import com.facebook.user.UserIdentifier;
import com.facebook.user.UserWithIdentifier;
import com.facebook.widget.a.h;
import com.facebook.widget.a.j;
import com.google.common.a.es;
import com.google.common.a.et;
import com.google.common.a.kl;
import com.google.common.base.Objects;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.facebook.contacts.picker:
//            u, ab, ac, l, 
//            ad, ag, w, aa, 
//            m, ae, y, z, 
//            v

public class x
    implements u
{

    private static final Class a = com/facebook/contacts/picker/x;
    private final es b;
    private w c;
    private h d;
    private j e;

    public x(es es1)
    {
        e = j.FINISHED;
        et et1 = es.e();
        for (es1 = es1.iterator(); es1.hasNext(); et1.b(new ab((ac)es1.next()))) { }
        b = et1.b();
    }

    private l a(l l1, Set set)
    {
        et et1 = es.e();
        Iterator iterator = l1.d().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj = (ad)iterator.next();
            if (obj instanceof ag)
            {
                obj = (ag)obj;
                if (!set.contains(((ag) (obj)).a().c().c()))
                {
                    et1.b(obj);
                }
            } else
            {
                et1.b(obj);
            }
        } while (true);
        return l.a(l1.b(), et1.b());
    }

    static Class a()
    {
        return a;
    }

    static void a(x x1)
    {
        x1.b();
    }

    static void a(x x1, CharSequence charsequence)
    {
        x1.b(charsequence);
    }

    private void a(es es1, et et1, Set set)
    {
        es1 = es1.iterator();
        do
        {
            if (!es1.hasNext())
            {
                break;
            }
            Object obj = (ad)es1.next();
            if (obj instanceof ag)
            {
                obj = (ag)obj;
                UserIdentifier useridentifier = ((ag) (obj)).a().c();
                if (!set.contains(useridentifier.c()))
                {
                    et1.b(obj);
                    set.add(useridentifier.c());
                }
            } else
            {
                et1.b(obj);
            }
        } while (true);
    }

    private void b()
    {
        j j1 = j.FINISHED;
        Iterator iterator = b.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ab ab1 = (ab)iterator.next();
            if (j.FILTERING != ab1.d())
            {
                continue;
            }
            j1 = j.FILTERING;
            break;
        } while (true);
        if (j1 != e)
        {
            e = j1;
            com.facebook.debug.log.b.a(a, "New filtering state: %s", new Object[] {
                j1
            });
            if (d != null)
            {
                d.a(e);
            }
        }
    }

    private void b(CharSequence charsequence)
    {
        l l1;
        int i;
        i = 0;
        l1 = c(charsequence);
        if (l1 == null) goto _L2; else goto _L1
_L1:
        com.facebook.debug.log.b.a(a, "New filtering result: %s", new Object[] {
            l1
        });
        c.a(charsequence, l1);
        if (d == null) goto _L2; else goto _L3
_L3:
        aa.a[l1.a().ordinal()];
        JVM INSTR tableswitch 1 2: default 80
    //                   1 91
    //                   2 96;
           goto _L4 _L5 _L6
_L4:
        d.a(i);
_L2:
        return;
_L5:
        i = -1;
        continue; /* Loop/switch isn't completed */
_L6:
        i = l1.c();
        if (true) goto _L4; else goto _L7
_L7:
    }

    private l c(CharSequence charsequence)
    {
        l l3 = ((ab)b.get(0)).c();
        l l1;
        if (l3 == null || !Objects.equal(charsequence, l3.b()))
        {
            l1 = null;
        } else
        {
            l1 = l3;
            if (l3.a() != m.EMPTY_CONSTRAINT)
            {
                l1 = l3;
                if (l3.a() != m.EXCEPTION)
                {
                    java.util.HashSet hashset = kl.a();
                    et et1 = es.e();
                    Iterator iterator = b.iterator();
                    do
                    {
                        if (!iterator.hasNext())
                        {
                            break;
                        }
                        ab ab1 = (ab)iterator.next();
                        l l4 = ab1.c();
                        if (l4 != null)
                        {
                            l l2 = l4;
                            if (l4.a() == m.OK)
                            {
                                l2 = l4;
                                if (Objects.equal(charsequence, l4.b()))
                                {
                                    l2 = a(l4, hashset);
                                    ab1.a(l2);
                                }
                            }
                            if (l2.c() > 0)
                            {
                                if (ab1.b() != null)
                                {
                                    et1.b(new ae(ab1.b()));
                                }
                                a(l2.d(), et1, hashset);
                            }
                        }
                    } while (true);
                    return l.a(charsequence, et1.b());
                }
            }
        }
        return l1;
    }

    public void a(v v)
    {
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((ab)iterator.next()).a().a(v)) { }
    }

    public void a(w w1)
    {
        c = w1;
        ab ab1;
        for (w1 = b.iterator(); w1.hasNext(); ab1.a().a(new y(this, ab1)))
        {
            ab1 = (ab)w1.next();
        }

    }

    public void a(es es1)
    {
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((ab)iterator.next()).a().a(es1)) { }
    }

    public void a(CharSequence charsequence)
    {
        a(charsequence, ((h) (null)));
    }

    public void a(CharSequence charsequence, h h1)
    {
        d = h1;
        ab ab1;
        for (h1 = b.iterator(); h1.hasNext(); ab1.a().a(charsequence, new z(this, ab1)))
        {
            ab1 = (ab)h1.next();
        }

    }

}
