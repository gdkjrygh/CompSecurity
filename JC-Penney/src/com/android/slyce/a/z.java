// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a;

import com.android.slyce.a.b.l;

// Referenced classes of package com.android.slyce.a:
//            x

class z
    implements Runnable
{

    final Exception a;
    final x b;

    z(x x1, Exception exception)
    {
        b = x1;
        a = exception;
        super();
    }

    public void run()
    {
        b.b.b(a, null);
    }
}
