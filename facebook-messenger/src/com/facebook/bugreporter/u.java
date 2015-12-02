// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.bugreporter;

import android.content.pm.PackageManager;
import com.facebook.common.l.b;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.bugreporter:
//            z, o, p

class u extends d
{

    final o a;

    private u(o o)
    {
        a = o;
        super();
    }

    u(o o, p p)
    {
        this(o);
    }

    public z a()
    {
        return new z((PackageManager)a(android/content/pm/PackageManager), (b)a(com/facebook/common/l/b));
    }

    public Object b()
    {
        return a();
    }
}
