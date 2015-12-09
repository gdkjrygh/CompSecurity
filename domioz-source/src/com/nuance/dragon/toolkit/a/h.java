// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.dragon.toolkit.a;

import android.os.Handler;
import com.nuance.a.a.a.c.a.b.c;
import com.nuance.dragon.toolkit.d.e;

// Referenced classes of package com.nuance.dragon.toolkit.a:
//            d, i, j

final class h
    implements c
{

    final d a;

    h(d d1)
    {
        a = d1;
        super();
    }

    public final void a(String s)
    {
        e.b(a, (new StringBuilder("Connected with session ID ")).append(s).toString());
        d.a(a).post(new i(this, s));
    }

    public final void a(short word0)
    {
        (new StringBuilder("Disconnected reasonCode [")).append(word0).append("]");
        d.a(a).post(new j(this));
    }

    public final void a(byte abyte0[])
    {
        StringBuilder stringbuilder = (new StringBuilder("callLogDataGenerated data [")).append(abyte0).append("] length [");
        int k;
        if (abyte0 != null)
        {
            k = abyte0.length;
        } else
        {
            k = 0;
        }
        stringbuilder.append(k).append("]");
        (new StringBuilder("_calllogDataListener [")).append(d.b(a)).append("]");
    }

    public final void b(short word0)
    {
        e.c(a, (new StringBuilder("Connection failed reasonCode [")).append(word0).append("]").toString());
    }
}
