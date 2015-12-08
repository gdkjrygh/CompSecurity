// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import com.google.android.gms.fitness.data.DataType;

// Referenced classes of package com.google.android.gms.fitness.request:
//            m

public static class e
{

    private DataType TM;

    static DataType a(e e)
    {
        return e.TM;
    }

    public e c(DataType datatype)
    {
        TM = datatype;
        return this;
    }

    public m ka()
    {
        return new m(this, null);
    }

    public e()
    {
    }
}
