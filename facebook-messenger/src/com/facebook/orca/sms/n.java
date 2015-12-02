// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.sms;

import com.facebook.prefs.shared.d;
import javax.inject.a;

public class n
    implements a
{

    private final d a;
    private final a b;
    private final a c;

    public n(d d1, a a1, a a2)
    {
        a = d1;
        b = a1;
        c = a2;
    }

    public Boolean a()
    {
        boolean flag;
        if (((Boolean)b.b()).booleanValue() && ((Boolean)c.b()).booleanValue() && a.a(com.facebook.orca.prefs.n.i, true))
        {
            flag = true;
        } else
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
