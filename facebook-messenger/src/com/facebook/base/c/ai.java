// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.base.c;

import android.content.Context;
import com.facebook.base.broadcast.j;
import com.facebook.base.broadcast.m;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.base.c:
//            a, b

class ai extends d
{

    final a a;

    private ai(a a1)
    {
        a = a1;
        super();
    }

    ai(a a1, b b1)
    {
        this(a1);
    }

    public j a()
    {
        return new m((Context)a(android/content/Context));
    }

    public Object b()
    {
        return a();
    }
}
