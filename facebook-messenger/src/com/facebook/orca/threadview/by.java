// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadview;

import com.facebook.contacts.contactcard.ContactCardFragment;
import com.facebook.messages.threads.model.ThreadViewSpec;
import com.facebook.orca.activity.k;
import com.facebook.orca.common.ui.titlebar.a;
import com.facebook.orca.threads.ThreadSummary;
import com.facebook.widget.titlebar.b;
import com.facebook.widget.titlebar.d;

// Referenced classes of package com.facebook.orca.threadview:
//            ThreadViewFragment, ca

class by extends b
{

    final ThreadViewFragment a;

    by(ThreadViewFragment threadviewfragment)
    {
        a = threadviewfragment;
        super();
    }

    public void a(d d1)
    {
        if (d1.a() != 1) goto _L2; else goto _L1
_L1:
        if (ThreadViewFragment.j(a) != ca.MESSAGES) goto _L4; else goto _L3
_L3:
        if (!ThreadViewFragment.h(a).b()) goto _L6; else goto _L5
_L5:
        com.facebook.orca.threadview.ThreadViewFragment.a(a, ca.CONTACTCARD);
_L4:
        return;
_L6:
        d1 = com.facebook.orca.threadview.ThreadViewFragment.k(a);
        if (d1 != null)
        {
            if (d1.h())
            {
                com.facebook.orca.threadview.ThreadViewFragment.a(a, ca.CONTACTCARD);
                return;
            } else
            {
                com.facebook.orca.threadview.ThreadViewFragment.a(a, ca.GROUP_CONTACTCARD);
                return;
            }
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (d1.a() != 2)
        {
            break; /* Loop/switch isn't completed */
        }
        if (ThreadViewFragment.j(a) == ca.CONTACTCARD && com.facebook.orca.threadview.ThreadViewFragment.d(a) != null)
        {
            com.facebook.orca.threadview.ThreadViewFragment.d(a).b();
            return;
        }
        if (true) goto _L4; else goto _L7
_L7:
        if (d1.a() != 3)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (ThreadViewFragment.j(a) == ca.CONTACTCARD && com.facebook.orca.threadview.ThreadViewFragment.d(a) != null)
        {
            com.facebook.orca.threadview.ThreadViewFragment.d(a).c();
            return;
        }
        continue; /* Loop/switch isn't completed */
        if (d1.a() != 4) goto _L4; else goto _L8
_L8:
        d1 = a.l();
        if (d1 instanceof k)
        {
            ((k)d1).c().g();
            return;
        }
        if (true) goto _L4; else goto _L9
_L9:
    }
}
