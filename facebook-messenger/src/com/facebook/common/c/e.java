// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.c;

import com.facebook.f.n;
import com.facebook.prefs.shared.ae;
import com.facebook.prefs.shared.aj;
import com.facebook.prefs.shared.d;
import javax.inject.a;

public class e
    implements a
{

    public static final ae a = n.a("debug_logs_defaulted_on_android");
    private final d b;

    public e(d d1)
    {
        b = d1;
    }

    public Boolean a()
    {
        boolean flag = b.a(a, false);
        return Boolean.valueOf(b.a(aj.j, flag));
    }

    public Object b()
    {
        return a();
    }

}
