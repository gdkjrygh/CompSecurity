// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.cloud;

import android.widget.RelativeLayout;

// Referenced classes of package com.roidapp.photogrid.cloud:
//            PGShareActivity

final class as
    implements Runnable
{

    final PGShareActivity a;

    as(PGShareActivity pgshareactivity)
    {
        a = pgshareactivity;
        super();
    }

    public final void run()
    {
        PGShareActivity.p(a).setVisibility(8);
    }
}
