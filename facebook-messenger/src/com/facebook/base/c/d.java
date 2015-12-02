// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.base.c;

import android.app.Activity;
import android.content.Context;

// Referenced classes of package com.facebook.base.c:
//            a, b

class d extends com.facebook.inject.d
{

    final a a;

    private d(a a1)
    {
        a = a1;
        super();
    }

    d(a a1, b b1)
    {
        this(a1);
    }

    public Activity a()
    {
        return (Activity)a(android/content/Context);
    }

    public Object b()
    {
        return a();
    }
}
