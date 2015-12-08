// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import java.util.concurrent.Callable;

// Referenced classes of package com.facebook:
//            c, b, K, J, 
//            AccessToken, Profile

final class u
    implements Callable
{

    final s.a a = null;

    u()
    {
        super();
    }

    public final Object call()
        throws Exception
    {
        Object obj = c.a();
        Object obj1 = ((c) (obj)).a.a();
        if (obj1 != null)
        {
            ((c) (obj)).a(((AccessToken) (obj1)), false);
        }
        obj = K.a();
        obj1 = ((K) (obj)).a.a();
        if (obj1 != null)
        {
            ((K) (obj)).a(((Profile) (obj1)), false);
        }
        if (AccessToken.a() != null && Profile.a() == null)
        {
            Profile.b();
        }
        return null;
    }
}
