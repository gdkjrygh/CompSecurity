// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.base.c;

import android.os.Process;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.base.c:
//            a, b

class an extends d
{

    final a a;

    private an(a a1)
    {
        a = a1;
        super();
    }

    an(a a1, b b1)
    {
        this(a1);
    }

    public Integer a()
    {
        return Integer.valueOf(Process.myPid());
    }

    public Object b()
    {
        return a();
    }
}
