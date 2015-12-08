// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a.c;

import com.android.slyce.a.a.a;
import com.android.slyce.a.a.c;

// Referenced classes of package com.android.slyce.a.c:
//            aj, au, l, ai

class ak
    implements a
{

    final aj a;

    ak(aj aj1)
    {
        a = aj1;
        super();
    }

    public void a(Exception exception)
    {
        if (a.a == null)
        {
            a.a = new au("Unable to connect to remote address");
        }
        if (a.a(a.a))
        {
            a.n.a(a.b, a.c, a.m, false, a.b.a).a(a.a, null);
        }
    }
}
