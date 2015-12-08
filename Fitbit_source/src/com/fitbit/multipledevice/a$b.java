// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.multipledevice;

import com.fitbit.livedata.LiveDataSource;
import com.fitbit.livedata.LiveDataState;

// Referenced classes of package com.fitbit.multipledevice:
//            a

private static class b
{

    public final LiveDataState a;
    public final LiveDataSource b;

    public boolean equals(Object obj)
    {
        if (obj instanceof b)
        {
            if (b == ((b) (obj = (b)obj)).b && a == ((a) (obj)).a)
            {
                return true;
            }
        }
        return false;
    }

    public String toString()
    {
        return (new StringBuilder()).append("").append(a).append("(").append(b).append(")").toString();
    }

    public urce()
    {
        this(null, null);
    }

    public urce(LiveDataState livedatastate, LiveDataSource livedatasource)
    {
        if (livedatastate == null)
        {
            livedatastate = LiveDataState.a;
        }
        a = livedatastate;
        if (livedatasource == null)
        {
            livedatasource = LiveDataSource.c;
        }
        b = livedatasource;
    }
}
