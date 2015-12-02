// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.divebar;

import com.facebook.orca.contacts.picker.o;
import java.util.EnumSet;
import javax.inject.a;

// Referenced classes of package com.facebook.orca.contacts.divebar:
//            al, am, ad

public class ao
{

    private final a a;
    private final a b;
    private final a c;

    public ao(a a1, a a2, a a3)
    {
        a = a1;
        b = a2;
        c = a3;
    }

    private EnumSet e()
    {
        return EnumSet.of(al.FAVORITE_FRIENDS, al.ONLINE_FRIENDS, al.OTHER_CONTACTS);
    }

    private EnumSet f()
    {
        boolean flag;
        if (((Boolean)b.b()).booleanValue() || ((Boolean)c.b()).booleanValue())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            return EnumSet.of(al.FAVORITE_FRIENDS, new al[] {
                al.TOP_FRIENDS, al.TOP_GROUPS, al.ONLINE_FRIENDS, al.MOBILE_FRIENDS, al.OTHER_CONTACTS
            });
        } else
        {
            return EnumSet.of(al.FAVORITE_FRIENDS, al.TOP_FRIENDS, al.TOP_GROUPS, al.ONLINE_FRIENDS, al.OTHER_CONTACTS);
        }
    }

    public ad a()
    {
        am am1 = new am(f(), o.a, 10, 0x48190800L, true);
        ad ad1 = (ad)a.b();
        ad1.a(am1);
        return ad1;
    }

    public ad b()
    {
        am am1 = new am(e(), o.a, 10, 0x48190800L, true);
        ad ad1 = (ad)a.b();
        ad1.a(am1);
        return ad1;
    }

    public ad c()
    {
        EnumSet enumset = EnumSet.of(al.FAVORITE_FRIENDS, al.TOP_FRIENDS, al.TOP_GROUPS);
        ad ad1 = (ad)a.b();
        ad1.a(new am(enumset, o.a, 10, 0x48190800L, false));
        return ad1;
    }

    public ad d()
    {
        EnumSet enumset = EnumSet.of(al.TOP_FRIENDS);
        ad ad1 = (ad)a.b();
        ad1.a(new am(enumset, o.a, 10, 0x48190800L, false));
        return ad1;
    }
}
