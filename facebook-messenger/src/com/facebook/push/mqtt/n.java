// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.push.mqtt;

import com.facebook.inject.d;

// Referenced classes of package com.facebook.push.mqtt:
//            au

class n extends d
{

    private final com.facebook.prefs.shared.d a;

    public n(com.facebook.prefs.shared.d d1)
    {
        a = d1;
    }

    public Integer a()
    {
        return Integer.valueOf(a.a(au.c, 30));
    }

    public Object b()
    {
        return a();
    }
}
