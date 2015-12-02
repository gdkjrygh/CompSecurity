// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.divebar;

import com.facebook.abtest.qe.data.QuickExperimentInfo;
import com.facebook.auth.e.a;
import com.facebook.debug.log.b;
import com.facebook.prefs.shared.d;
import com.google.common.d.a.h;

// Referenced classes of package com.facebook.orca.contacts.divebar:
//            bs, bv

class bu
    implements h
{

    final bs a;

    bu(bs bs1)
    {
        a = bs1;
        super();
    }

    public void a(QuickExperimentInfo quickexperimentinfo)
    {
        if ("local_default_group".equals(quickexperimentinfo.b()) && com.facebook.orca.contacts.divebar.bs.a(a).a(a.g, false))
        {
            b.d(bs.e(), "QE data has not been fetched yet! Re-initializing...");
            a.d();
            return;
        } else
        {
            com.facebook.orca.contacts.divebar.bs.a(a, com.facebook.orca.contacts.divebar.bs.a(a, quickexperimentinfo.a("show_presence")));
            com.facebook.orca.contacts.divebar.bs.b(a, com.facebook.orca.contacts.divebar.bs.a(a, quickexperimentinfo.a("hide_offline")));
            bs.c(a, com.facebook.orca.contacts.divebar.bs.a(a, quickexperimentinfo.a("show_offline_section")));
            com.facebook.orca.contacts.divebar.bs.a(a, bv.COMPLETED);
            b.c(bs.e(), (new StringBuilder()).append("Fetched QE params (group: ").append(quickexperimentinfo.b()).append("): ").append("Show presence? ").append(com.facebook.orca.contacts.divebar.bs.b(a)).append("; ").append("Hide offline users? ").append(bs.c(a)).append("; ").append("Show offline section? ").append(com.facebook.orca.contacts.divebar.bs.d(a)).toString());
            return;
        }
    }

    public volatile void a(Object obj)
    {
        a((QuickExperimentInfo)obj);
    }

    public void a(Throwable throwable)
    {
        b.e(bs.e(), "Failed to fetch QE info for Wildfire presence experiment!");
        com.facebook.orca.contacts.divebar.bs.a(a, bv.INIT);
    }
}
