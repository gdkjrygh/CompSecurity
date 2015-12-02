// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.common.ui.titlebar;

import com.facebook.contacts.picker.ad;
import com.facebook.orca.contacts.divebar.bl;
import com.facebook.orca.threads.ThreadSummary;
import com.facebook.user.UserIdentifier;
import com.facebook.user.UserWithIdentifier;
import com.facebook.user.s;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.facebook.orca.common.ui.titlebar:
//            a, p

class e
    implements bl
{

    final a a;

    e(a a1)
    {
        a = a1;
        super();
    }

    public void a()
    {
        com.facebook.orca.common.ui.titlebar.a.i(a).b();
    }

    public void a(String s1)
    {
        if (s1 != null && !s1.equals(""))
        {
            com.facebook.orca.common.ui.titlebar.a.i(a).a(s1);
        }
    }

    public boolean a(ThreadSummary threadsummary, boolean flag, ad ad, String s1)
    {
        s1 = com.facebook.orca.common.ui.titlebar.a.a(a, s1, ad);
        for (Iterator iterator = com.facebook.orca.common.ui.titlebar.a.j(a).iterator(); iterator.hasNext();)
        {
            if (((bl)iterator.next()).a(threadsummary, flag, ad, s1))
            {
                return true;
            }
        }

        com.facebook.orca.common.ui.titlebar.a.a(a, threadsummary, flag, s1);
        return true;
    }

    public boolean a(UserWithIdentifier userwithidentifier, boolean flag, ad ad, String s1, int i)
    {
        if (flag && userwithidentifier != null)
        {
            s s2 = userwithidentifier.c().e();
            com.facebook.orca.common.ui.titlebar.a.i(a).a(s2.toString(), i);
        }
        s1 = com.facebook.orca.common.ui.titlebar.a.a(a, s1, ad);
        for (Iterator iterator = com.facebook.orca.common.ui.titlebar.a.j(a).iterator(); iterator.hasNext();)
        {
            if (((bl)iterator.next()).a(userwithidentifier, flag, ad, s1, i))
            {
                return true;
            }
        }

        com.facebook.orca.common.ui.titlebar.a.a(a, userwithidentifier, flag, ad, s1);
        return true;
    }
}
