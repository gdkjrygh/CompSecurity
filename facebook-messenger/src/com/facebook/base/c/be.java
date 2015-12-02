// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.base.c;

import android.os.Handler;
import android.os.Looper;
import com.facebook.common.executors.j;
import com.facebook.inject.d;
import com.google.common.d.a.v;

// Referenced classes of package com.facebook.base.c:
//            a, b

class be extends d
{

    final a a;

    private be(a a1)
    {
        a = a1;
        super();
    }

    be(a a1, b b1)
    {
        this(a1);
    }

    public v a()
    {
        return new j(new Handler(Looper.getMainLooper()));
    }

    public Object b()
    {
        return a();
    }
}
