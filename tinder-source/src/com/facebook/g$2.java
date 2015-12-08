// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import java.util.concurrent.Callable;

// Referenced classes of package com.facebook:
//            g, b, m, l, 
//            AccessToken, Profile

static final class <init>
    implements Callable
{

    final ile.b a = null;

    public final Object call()
        throws Exception
    {
        b.a().b();
        m m1 = m.a();
        Profile profile = m1.a.a();
        if (profile != null)
        {
            m1.a(profile, false);
        }
        if (AccessToken.a() != null && Profile.a() == null)
        {
            Profile.b();
        }
        return null;
    }

    on()
    {
        super();
    }
}
