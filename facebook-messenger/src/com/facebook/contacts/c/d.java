// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.c;

import com.facebook.contacts.models.a.a;
import com.facebook.contacts.models.a.b;
import com.google.common.a.fi;
import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;

// Referenced classes of package com.facebook.contacts.c:
//            e, b

public final class d
{

    private final com.facebook.contacts.c.b a;
    private final Set b;

    public d(com.facebook.contacts.c.b b1, Set set)
    {
        a = b1;
        b = set;
    }

    private String a()
    {
        HashSet hashset = new HashSet();
        for (Iterator iterator = b.iterator(); iterator.hasNext();)
        {
            Iterator iterator1 = ((b)iterator.next()).a().iterator();
            while (iterator1.hasNext()) 
            {
                hashset.add(((a)iterator1.next()).toString());
            }
        }

        return Joiner.on(",").join(hashset).toLowerCase(Locale.getDefault());
    }

    public String a(int i, String s, e e1)
    {
        com.facebook.g.a.b b1;
        com.facebook.g.a.b b2;
        if (e1 == e.DELTA)
        {
            com.facebook.g.a.b b3;
            com.facebook.g.a.b b4;
            boolean flag;
            if (s != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag);
        }
        b3 = com.facebook.g.a.a.b("contacts");
        if (e1 == e.FULL)
        {
            b3.a("contact_profile_type", new Object[] {
                a()
            }).a("high_quality", new Object[0]).a("orderby", new Object[] {
                "communication"
            });
        }
        b4 = com.facebook.g.a.a.b("page_info").c("end_cursor").c("has_next_page");
        if (e1 == e.FULL)
        {
            b2 = com.facebook.g.a.a.b("nodes");
            a.a(b2);
            b4.c("delta_cursor");
            b1 = b3;
        } else
        {
            b1 = com.facebook.g.a.a.b("added");
            a.a(b1);
            b1 = com.facebook.g.a.a.b("deltas").a(com.facebook.g.a.a.b("nodes").a(b1.f()).c("removed").f());
            b2 = b1;
        }
        if (s != null)
        {
            b1.a("after", new Object[] {
                s
            });
            if (e1 == e.DELTA)
            {
                b1.a("contact_profile_type", new Object[] {
                    a()
                }).a("high_quality", new Object[0]);
            }
        }
        b1.a("first", new Object[] {
            Integer.valueOf(i)
        }).a(b4.f());
        s = b3.a(b2.f()).f();
        return com.facebook.g.a.a.a().a(s).f().toString();
    }
}
