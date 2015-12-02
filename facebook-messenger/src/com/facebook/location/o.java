// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.location;

import com.google.common.a.fi;
import com.google.common.base.Preconditions;
import java.util.Set;

// Referenced classes of package com.facebook.location:
//            GetDeviceLocationParams

public class o
{

    private long a;
    private long b;
    private float c;
    private long d;
    private float e;
    private long f;
    private float g;
    private long h;
    private float i;
    private Set j;
    private boolean k;

    public o()
    {
        a = 5000L;
        b = 0x1d4c0L;
        c = -1F;
        d = 250L;
        e = 10F;
        f = 0x1d4c0L;
        g = 100F;
        h = 0x1d4c0L;
        i = 200F;
        j = fi.a("network", "gps", "passive");
        k = false;
    }

    public long a()
    {
        return a;
    }

    public o a(float f1)
    {
        boolean flag;
        if (f1 >= 0.0F || f1 == -1F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        g = f1;
        return this;
    }

    public o a(long l1)
    {
        boolean flag;
        if (l1 >= 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        a = l1;
        return this;
    }

    public long b()
    {
        return b;
    }

    public float c()
    {
        return c;
    }

    public long d()
    {
        return d;
    }

    public float e()
    {
        return e;
    }

    public long f()
    {
        return f;
    }

    public float g()
    {
        return g;
    }

    public long h()
    {
        return h;
    }

    public float i()
    {
        return i;
    }

    public Set j()
    {
        return j;
    }

    public boolean k()
    {
        return k;
    }

    public GetDeviceLocationParams l()
    {
        return new GetDeviceLocationParams(this);
    }
}
