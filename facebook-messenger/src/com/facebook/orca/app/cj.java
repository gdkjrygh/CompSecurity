// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.app;

import com.facebook.common.executors.a;
import com.facebook.fbservice.ops.k;
import com.facebook.inject.d;
import com.facebook.orca.annotations.CurrentFolder;
import com.facebook.orca.f.ac;
import com.facebook.orca.f.ad;
import com.facebook.orca.f.r;
import com.facebook.orca.g.e;
import com.facebook.orca.notify.av;
import com.facebook.orca.threads.FolderName;

// Referenced classes of package com.facebook.orca.app:
//            g, h, i

class cj extends d
{

    final h a;

    private cj(h h)
    {
        a = h;
        super();
    }

    cj(h h, i i)
    {
        this(h);
    }

    public r a()
    {
        return new r((g)a(com/facebook/orca/app/g), (k)a(com/facebook/fbservice/ops/k), (av)a(com/facebook/orca/notify/av), (a)a(com/facebook/common/executors/a), (ad)a(com/facebook/orca/f/ad), (com.facebook.analytics.av)a(com/facebook/analytics/av), (com.facebook.common.time.a)a(com/facebook/orca/g/e), (com.facebook.common.time.a)a(com/facebook/common/time/a), (ac)a(com/facebook/orca/f/ac), b(com/facebook/orca/threads/FolderName, com/facebook/orca/annotations/CurrentFolder));
    }

    public Object b()
    {
        return a();
    }
}
