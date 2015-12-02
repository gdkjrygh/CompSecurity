// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.auth.login;

import com.facebook.prefs.shared.aj;
import com.facebook.prefs.shared.d;
import com.facebook.prefs.shared.e;

public class am
{

    private final d a;

    public am(d d1)
    {
        a = d1;
    }

    public boolean a()
    {
        return !a.a(aj.g, true);
    }

    public void b()
    {
        a.b().a(aj.g, true).a();
    }

    public void c()
    {
        a.b().a(aj.g, false).a();
    }
}
