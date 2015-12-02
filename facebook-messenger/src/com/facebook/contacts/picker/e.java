// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.picker;

import com.facebook.common.w.n;
import com.facebook.debug.log.b;
import com.facebook.widget.a.h;
import com.facebook.widget.a.j;
import com.google.common.a.es;
import com.google.common.base.Objects;
import java.util.Iterator;

// Referenced classes of package com.facebook.contacts.picker:
//            u, j, l, w, 
//            i, m, f, g, 
//            h, v

public class e
    implements u
{

    private static final Class a = com/facebook/contacts/picker/e;
    private final com.facebook.contacts.picker.j b;
    private final com.facebook.contacts.picker.j c;
    private final es d;
    private w e;
    private h f;
    private j g;

    public e(u u1, u u2)
    {
        g = j.FINISHED;
        b = new com.facebook.contacts.picker.j(u1);
        c = new com.facebook.contacts.picker.j(u2);
        d = es.a(b, c);
    }

    static com.facebook.contacts.picker.j a(e e1)
    {
        return e1.c;
    }

    static Class a()
    {
        return a;
    }

    static void a(e e1, CharSequence charsequence)
    {
        e1.b(charsequence);
    }

    private static boolean a(l l1, CharSequence charsequence)
    {
        return l1 != null && Objects.equal(charsequence, l1.b());
    }

    static com.facebook.contacts.picker.j b(e e1)
    {
        return e1.b;
    }

    private void b()
    {
        j j1 = c.c();
        if (j1 != g)
        {
            g = j1;
            com.facebook.debug.log.b.a(a, "New filtering state: %s", new Object[] {
                j1
            });
            if (f != null)
            {
                f.a(g);
            }
        }
    }

    private void b(CharSequence charsequence)
    {
        l l1;
        int k;
        k = 0;
        l1 = c(charsequence);
        if (l1 == null) goto _L2; else goto _L1
_L1:
        com.facebook.debug.log.b.b(a, "New filtering result: %s", new Object[] {
            l1
        });
        e.a(charsequence, l1);
        if (f == null) goto _L2; else goto _L3
_L3:
        i.a[l1.a().ordinal()];
        JVM INSTR tableswitch 1 2: default 80
    //                   1 91
    //                   2 96;
           goto _L4 _L5 _L6
_L4:
        f.a(k);
_L2:
        return;
_L5:
        k = -1;
        continue; /* Loop/switch isn't completed */
_L6:
        k = l1.c();
        if (true) goto _L4; else goto _L7
_L7:
    }

    private l c(CharSequence charsequence)
    {
        if (n.c(charsequence))
        {
            return l.a(charsequence);
        }
        com.facebook.debug.log.b.b(a, "preforming filtering for: %s", new Object[] {
            charsequence
        });
        l l1 = b.b();
        l l2 = c.b();
        boolean flag = a(l1, charsequence);
        boolean flag1 = a(l2, charsequence);
        if (flag1 && l2.a() == m.OK)
        {
            com.facebook.debug.log.b.b(a, (new StringBuilder()).append("slow valid: ").append(l2.c()).toString());
            return l2;
        }
        if (flag && l1.a() == m.OK)
        {
            com.facebook.debug.log.b.b(a, (new StringBuilder()).append("quick valid: ").append(l1.c()).toString());
            return l1;
        }
        if (flag1)
        {
            com.facebook.debug.log.b.b(a, (new StringBuilder()).append("slow valid but failed: ").append(l2.a()).toString());
            return l2;
        }
        if (flag)
        {
            com.facebook.debug.log.b.b(a, (new StringBuilder()).append("quick valid but failed: ").append(l1.a()).toString());
            return l1;
        } else
        {
            com.facebook.debug.log.b.b(a, "both invalid");
            return null;
        }
    }

    static void c(e e1)
    {
        e1.b();
    }

    public void a(v v)
    {
        for (Iterator iterator = d.iterator(); iterator.hasNext(); ((com.facebook.contacts.picker.j)iterator.next()).a().a(v)) { }
    }

    public void a(w w1)
    {
        com.facebook.debug.log.b.b(a, "init");
        e = w1;
        c.a().a(new f(this));
        b.a().a(new g(this));
    }

    public void a(es es1)
    {
        for (Iterator iterator = d.iterator(); iterator.hasNext(); ((com.facebook.contacts.picker.j)iterator.next()).a().a(es1)) { }
    }

    public void a(CharSequence charsequence)
    {
        a(charsequence, ((h) (null)));
    }

    public void a(CharSequence charsequence, h h1)
    {
        com.facebook.debug.log.b.b(a, "Starting filtering");
        f = h1;
        com.facebook.contacts.picker.j j1;
        for (h1 = d.iterator(); h1.hasNext(); j1.a().a(charsequence, new com.facebook.contacts.picker.h(this, j1)))
        {
            j1 = (com.facebook.contacts.picker.j)h1.next();
        }

    }

}
