// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.cloud;

import android.widget.CompoundButton;
import com.roidapp.baselib.c.b;
import com.roidapp.photogrid.common.af;

// Referenced classes of package com.roidapp.photogrid.cloud:
//            PGShareActivity

final class av
    implements android.widget.CompoundButton.OnCheckedChangeListener
{

    final PGShareActivity a;

    av(PGShareActivity pgshareactivity)
    {
        a = pgshareactivity;
        super();
    }

    public final void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        if (!flag)
        {
            b.a("SNS", "click", "share/closehashtags");
            af.b(a, "SNS", "click", "share/closehashtags", Long.valueOf(1L));
            a.e();
        }
    }
}
