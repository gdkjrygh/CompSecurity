// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.favorites;

import com.facebook.f.n;
import com.facebook.prefs.shared.ae;
import com.facebook.prefs.shared.d;
import javax.inject.a;

public class ak
    implements a
{

    private static final ae b = n.a("messenger_divebar_allow_favorite_groups_android");
    private final d a;

    public ak(d d1)
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
