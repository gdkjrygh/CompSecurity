// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.a;

import com.facebook.f.n;
import com.facebook.prefs.shared.ae;
import javax.inject.a;

public class d
    implements a
{

    private static final ae b = n.a("messenger_divebar_show_groups_android");
    private final com.facebook.prefs.shared.d a;

    public d(com.facebook.prefs.shared.d d1)
    {
        a = d1;
    }

    public Boolean a()
    {
        return Boolean.valueOf(a.a(b, false));
    }

    public Object b()
    {
        return a();
    }

}
