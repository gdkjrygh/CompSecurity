// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.food.barcode.ui;

import android.content.Context;
import android.content.Intent;
import com.fitbit.data.bl.ci;
import com.fitbit.data.bl.r;
import com.fitbit.util.bi;

// Referenced classes of package com.fitbit.food.barcode.ui:
//            BarcodeScannerActivity

class a extends bi
{

    final BarcodeScannerActivity a;

    public Boolean b()
    {
        return Boolean.valueOf(r.a().s());
    }

    protected Intent f()
    {
        return ci.a(a);
    }

    public Object f_()
    {
        return b();
    }

    _cls9(BarcodeScannerActivity barcodescanneractivity, Context context)
    {
        a = barcodescanneractivity;
        super(context);
    }
}
