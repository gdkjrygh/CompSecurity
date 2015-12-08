// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util.format;

import android.content.Context;
import com.fitbit.data.domain.device.Device;

// Referenced classes of package com.fitbit.util.format:
//            g

public class b extends g
{

    public b(Context context)
    {
        this(context, 2);
    }

    public b(Context context, int i)
    {
        super(context, i);
        c(0x7f080158);
        d(0x7f08015b);
        e(0x7f0b0009);
    }

    protected String a(Device device)
    {
        return device.j();
    }

    protected volatile String a(Object obj)
    {
        return a((Device)obj);
    }
}
