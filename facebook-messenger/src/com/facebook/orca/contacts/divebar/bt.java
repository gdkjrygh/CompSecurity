// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.divebar;

import com.facebook.abtest.qe.data.QuickExperimentInfo;
import com.facebook.abtest.qe.data.d;
import com.google.common.base.Optional;

// Referenced classes of package com.facebook.orca.contacts.divebar:
//            bs

class bt
    implements d
{

    final bs a;

    bt(bs bs)
    {
        a = bs;
        super();
    }

    public boolean a(QuickExperimentInfo quickexperimentinfo)
    {
        return quickexperimentinfo.a("hide_offline").isPresent() && quickexperimentinfo.a("show_offline_section").isPresent();
    }
}
