// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.fbwebrtc;

import com.facebook.f.n;
import com.facebook.prefs.shared.ae;
import javax.inject.a;

public class d
    implements a
{

    public static final ae a = n.a("voip_show_free_call_disclaimer");
    private final com.facebook.prefs.shared.d b;

    public d(com.facebook.prefs.shared.d d1)
    {
        b = d1;
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
