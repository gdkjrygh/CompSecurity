// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.chatheads;

import com.facebook.f.n;
import com.facebook.prefs.shared.ae;
import com.facebook.prefs.shared.d;
import javax.inject.a;

public class dx
    implements a
{

    public static final ae a = n.a("messenger_chat_heads_android");
    private final d b;
    private final a c;

    public dx(d d1, a a1)
    {
        b = d1;
        c = a1;
    }

    public Boolean a()
    {
        boolean flag;
        if (((Boolean)c.b()).booleanValue() && b.a(com.facebook.orca.prefs.n.s, true))
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
