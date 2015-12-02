// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.user;

import com.google.common.base.Function;

// Referenced classes of package com.facebook.user:
//            UserKey

final class u
    implements Function
{

    u()
    {
    }

    public String a(UserKey userkey)
    {
        return userkey.c();
    }

    public Object apply(Object obj)
    {
        return a((UserKey)obj);
    }
}
