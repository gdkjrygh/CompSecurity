// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui.endless;

import android.content.Context;
import android.content.IntentFilter;
import com.fitbit.util.bi;
import java.util.Date;
import java.util.List;

// Referenced classes of package com.fitbit.ui.endless:
//            d

public abstract class b extends bi
{

    private final Date a;
    private final Date b;
    private int c;

    public b(Context context, IntentFilter intentfilter, Date date, Date date1)
    {
        super(context, intentfilter);
        c = 0;
        a = date;
        b = date1;
    }

    protected abstract List a(Date date, Date date1);

    protected abstract String b();

    public Date d()
    {
        return a;
    }

    public Date e()
    {
        return b;
    }

    public Object f_()
    {
        return g();
    }

    public d g()
    {
        boolean flag = true;
        c = c + 1;
        d d1 = new d();
        if (c <= 1)
        {
            flag = false;
        }
        d1.a(flag);
        d1.a(a(d(), e()));
        return d1;
    }
}
