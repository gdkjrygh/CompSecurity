// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.chatheads;

import android.app.Service;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.orca.chatheads:
//            bz, cn, co

class cv extends d
{

    final cn a;

    private cv(cn cn)
    {
        a = cn;
        super();
    }

    cv(cn cn, co co)
    {
        this(cn);
    }

    public bz a()
    {
        return new bz((Service)a(android/app/Service));
    }

    public Object b()
    {
        return a();
    }
}
