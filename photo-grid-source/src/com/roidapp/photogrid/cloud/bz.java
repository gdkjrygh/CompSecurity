// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.cloud;

import android.widget.CompoundButton;
import com.roidapp.baselib.c.b;
import com.roidapp.photogrid.common.af;

// Referenced classes of package com.roidapp.photogrid.cloud:
//            br, BaseShareActivity

final class bz
    implements android.widget.CompoundButton.OnCheckedChangeListener
{

    final br a;

    bz(br br1)
    {
        a = br1;
        super();
    }

    public final void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        if (!flag)
        {
            br.c(a);
            b.a("SNS", "click", "share/closehashtags");
            af.b(br.c(a), "SNS", "click", "share/closehashtags", Long.valueOf(1L));
            br.c(a).j();
        }
    }
}
