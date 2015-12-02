// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.base.c;

import android.app.Activity;
import android.support.v4.app.i;
import android.support.v4.app.q;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.base.c:
//            a, b

class ab extends d
{

    final a a;

    private ab(a a1)
    {
        a = a1;
        super();
    }

    ab(a a1, b b1)
    {
        this(a1);
    }

    public q a()
    {
        Activity activity = (Activity)a(android/app/Activity);
        if (activity instanceof i)
        {
            return ((i)activity).f();
        } else
        {
            return null;
        }
    }

    public Object b()
    {
        return a();
    }
}
