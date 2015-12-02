// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.http.protocol;

import com.facebook.http.f.c;
import com.facebook.prefs.shared.d;
import javax.inject.a;

public class aj
    implements a
{

    private final d a;

    public aj(d d1)
    {
        a = d1;
    }

    public Boolean a()
    {
        return Boolean.valueOf(a.a(c.d, false));
    }

    public Object b()
    {
        return a();
    }
}
