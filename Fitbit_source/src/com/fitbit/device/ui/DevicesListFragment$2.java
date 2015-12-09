// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.device.ui;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.fitbit.data.bl.an;
import com.fitbit.data.bl.bx;
import com.fitbit.util.bj;
import com.fitbit.util.p;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.fitbit.device.ui:
//            DevicesListFragment

class a extends bj
{

    final DevicesListFragment a;

    public List b()
    {
        List list = an.a().f();
        if (list != null)
        {
            Collections.sort(list, p.a);
        }
        return list;
    }

    protected Intent f()
    {
        Intent intent = bx.a(getContext(), DevicesListFragment.b(a));
        DevicesListFragment.a(a, false);
        return intent;
    }

    public Object f_()
    {
        return b();
    }

    (DevicesListFragment deviceslistfragment, Context context, IntentFilter intentfilter)
    {
        a = deviceslistfragment;
        super(context, intentfilter);
    }
}
