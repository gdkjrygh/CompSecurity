// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.notify;

import com.facebook.prefs.shared.d;
import javax.inject.a;

public class u
    implements a
{

    private final d a;
    private final a b;

    public u(d d, a a1)
    {
        a = d;
        b = a1;
    }

    public Boolean a()
    {
        if (b.b() != null)
        {
            return Boolean.valueOf(true);
        } else
        {
            return Boolean.valueOf(false);
        }
    }

    public Object b()
    {
        return a();
    }
}
