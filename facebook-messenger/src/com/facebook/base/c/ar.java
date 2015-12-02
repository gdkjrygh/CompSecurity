// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.base.c;

import android.os.PowerManager;
import com.facebook.common.hardware.n;
import com.facebook.inject.ab;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.base.c:
//            a, b

class ar extends d
{

    final a a;

    private ar(a a1)
    {
        a = a1;
        super();
    }

    ar(a a1, b b1)
    {
        this(a1);
    }

    public n a()
    {
        return new n((PowerManager)e().a(android/os/PowerManager));
    }

    public Object b()
    {
        return a();
    }
}
