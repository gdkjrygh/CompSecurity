// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.internal.jx;
import java.util.List;

// Referenced classes of package com.google.android.gms.fitness.request:
//            e

public static class 
{

    private DataSet UP;

    static DataSet a( )
    {
        return .UP;
    }

    public  b(DataSet dataset)
    {
        UP = dataset;
        return this;
    }

    public e jU()
    {
        boolean flag1 = true;
        boolean flag;
        if (UP != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        jx.a(flag, "Must set the data set");
        if (!UP.getDataPoints().isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        jx.a(flag, "Cannot use an empty data set");
        if (UP.getDataSource().jx() != null)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        jx.a(flag, "Must set the app package name for the data source");
        return new e(this, null);
    }

    public ()
    {
    }
}
