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
//            g

abstract class h extends b
{

    public h(Context context)
    {
        super(context);
    }

    public g e()
    {
        return new g(r.a().f());
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
