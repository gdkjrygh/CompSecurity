// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.a;

import com.facebook.auth.f.b;
import com.google.common.a.es;

public class e
    implements b
{

    private static final Class a = com/facebook/contacts/a/e;
    private es b;
    private es c;

    public e()
    {
    }

    public es a()
    {
        return b;
    }

    public void a(es es)
    {
        b = es;
        com.facebook.debug.log.b.b(a, "mobile app data cache updated");
    }

    public void b()
    {
        b = null;
        c = null;
    }

    public void b(es es)
    {
        c = es;
    }

    public void d()
    {
        b();
    }

}
