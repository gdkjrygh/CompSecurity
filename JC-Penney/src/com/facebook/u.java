// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import java.util.concurrent.Callable;

// Referenced classes of package com.facebook:
//            d, au, AccessToken, Profile

final class u
    implements Callable
{

    u()
    {
    }

    public Void a()
    {
        d.a().c();
        au.a().c();
        if (AccessToken.a() != null && Profile.a() == null)
        {
            Profile.b();
        }
        return null;
    }

    public Object call()
    {
        return a();
    }
}
