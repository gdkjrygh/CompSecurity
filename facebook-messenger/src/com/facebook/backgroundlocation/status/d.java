// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.backgroundlocation.status;

import com.facebook.fbservice.ops.k;
import com.facebook.nux.status.j;
import javax.inject.a;

public class d
{

    public static final String a = (new StringBuilder()).append(com/facebook/backgroundlocation/status/d.getCanonicalName()).append(".ACTION_RESET_STATE").toString();
    private static final Class b = com/facebook/backgroundlocation/status/d;
    private final a c;
    private final j d;
    private final k e;
    private final com.facebook.base.broadcast.j f;

    public d(a a1, j j, k k, com.facebook.base.broadcast.j j1)
    {
        c = a1;
        d = j;
        e = k;
        f = j1;
    }

    public boolean a()
    {
        return ((Boolean)c.b()).booleanValue();
    }

}
