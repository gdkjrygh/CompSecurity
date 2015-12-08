// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.report.a.b;

import com.android.slyce.report.a.e.a;
import com.android.slyce.report.a.e.b;

// Referenced classes of package com.android.slyce.report.a.b:
//            d, c, a

public class f extends d
{

    public f()
    {
    }

    public c a(a a1)
    {
        if (b(a1) == 13)
        {
            return com.android.slyce.report.a.b.c.a;
        } else
        {
            return com.android.slyce.report.a.b.c.b;
        }
    }

    public b a(b b1)
    {
        super.a(b1);
        b1.a("Sec-WebSocket-Version", "13");
        return b1;
    }

    public com.android.slyce.report.a.b.a c()
    {
        return new f();
    }
}
