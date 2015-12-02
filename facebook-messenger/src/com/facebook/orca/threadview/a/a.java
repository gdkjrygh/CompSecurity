// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadview.a;

import com.facebook.abtest.qe.d.e;
import com.facebook.abtest.qe.data.QuickExperimentInfo;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;

// Referenced classes of package com.facebook.orca.threadview.a:
//            b, c

public class a
{

    private static final String a = com/facebook/orca/threadview/a/a.getCanonicalName();
    private final com.facebook.abtest.qe.d.a b;

    public a(e e1)
    {
        b = ((e)Preconditions.checkNotNull(e1)).a("orca_send_receipts", new b(this));
    }

    private c a(QuickExperimentInfo quickexperimentinfo)
    {
        Optional optional = quickexperimentinfo.a("show_pending_receipt");
        quickexperimentinfo.a("show_send_receipt");
        quickexperimentinfo.a("show_failed_receipt");
        return new c(this, Boolean.parseBoolean((String)optional.orNull()), Boolean.parseBoolean((String)optional.orNull()), Boolean.parseBoolean((String)optional.orNull()));
    }

    static c a(a a1, QuickExperimentInfo quickexperimentinfo)
    {
        return a1.a(quickexperimentinfo);
    }

    public c a()
    {
        return (c)b.a();
    }

}
