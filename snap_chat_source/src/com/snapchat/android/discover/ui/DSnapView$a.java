// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.discover.ui;

import com.squareup.otto.Bus;
import wK;

// Referenced classes of package com.snapchat.android.discover.ui:
//            DSnapView

final class c
    implements Runnable
{

    float a;
    float b;
    private DSnapView c;
    private DSnapView d;

    public final void run()
    {
        if (DSnapView.b(d) != null && DSnapView.c(d))
        {
            DSnapView.d(d).a(new wK(c, a, b));
        }
        DSnapView.e(d);
    }

    public (DSnapView dsnapview, DSnapView dsnapview1)
    {
        d = dsnapview;
        super();
        c = dsnapview1;
    }
}
