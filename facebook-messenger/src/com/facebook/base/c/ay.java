// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.base.c;

import android.app.Service;
import android.content.Context;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.base.c:
//            a, b

class ay extends d
{

    final a a;

    private ay(a a1)
    {
        a = a1;
        super();
    }

    ay(a a1, b b1)
    {
        this(a1);
    }

    public Service a()
    {
        return (Service)a(android/content/Context);
    }

    public Object b()
    {
        return a();
    }
}
