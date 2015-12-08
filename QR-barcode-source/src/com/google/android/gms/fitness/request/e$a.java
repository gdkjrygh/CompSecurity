// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import com.google.android.gms.common.internal.o;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.data.DataSource;
import java.util.List;

// Referenced classes of package com.google.android.gms.fitness.request:
//            e

public static class 
{

    private DataSet Ts;

    static DataSet a( )
    {
        return .Ts;
    }

    public  b(DataSet dataset)
    {
        Ts = dataset;
        return this;
    }

    public e jj()
    {
        boolean flag1 = true;
        boolean flag;
        if (Ts != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        o.a(flag, "Must set the data set");
        if (!Ts.getDataPoints().isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        o.a(flag, "Cannot use an empty data set");
        if (Ts.getDataSource().iM() != null)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        o.a(flag, "Must set the app package name for the data source");
        return new e(this, null);
    }

    public ()
    {
    }
}
