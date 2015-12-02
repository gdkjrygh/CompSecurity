// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.a;

import com.facebook.f.n;
import com.facebook.prefs.shared.ae;
import com.facebook.prefs.shared.d;
import javax.inject.a;

public class g
    implements a
{

    public static final ae a = n.a("messenger_divebar_more_mobile_friends_2_android");
    private final d b;
    private final com.facebook.config.a.a c;

    public g(d d1, com.facebook.config.a.a a1)
    {
        b = d1;
        c = a1;
    }

    public Boolean a()
    {
        return Boolean.valueOf(b.a(a, false));
    }

    public Object b()
    {
        return a();
    }

}
