// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.base.c;

import android.content.Context;
import android.content.res.Resources;
import com.facebook.inject.ab;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.base.c:
//            a, b

class av extends d
{

    final a a;

    private av(a a1)
    {
        a = a1;
        super();
    }

    av(a a1, b b1)
    {
        this(a1);
    }

    public Resources a()
    {
        return ((Context)e().a(android/content/Context)).getResources();
    }

    public Object b()
    {
        return a();
    }
}
