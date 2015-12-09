// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui.choose.food;

import android.content.Context;
import android.content.Intent;
import com.fitbit.data.bl.cf;
import com.fitbit.data.bl.r;
import com.fitbit.ui.choose.b;

// Referenced classes of package com.fitbit.ui.choose.food:
//            e

abstract class f extends b
{

    public f(Context context)
    {
        super(context);
    }

    public e e()
    {
        return new e(r.a().h());
    }

    protected Intent f()
    {
        return cf.a(getContext());
    }

    public Object f_()
    {
        return e();
    }
}
