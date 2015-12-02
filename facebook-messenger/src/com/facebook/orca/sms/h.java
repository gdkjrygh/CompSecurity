// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.sms;

import com.facebook.orca.prefs.n;
import com.facebook.prefs.shared.d;
import javax.inject.a;

public class h
    implements a
{

    private final d a;

    public h(d d1)
    {
        a = d1;
    }

    public Boolean a()
    {
        boolean flag = true;
        if (!a.a(n.g, false) || !a.a(n.f, true))
        {
            flag = false;
        }
        return Boolean.valueOf(flag);
    }

    public Object b()
    {
        return a();
    }
}
