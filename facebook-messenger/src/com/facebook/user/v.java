// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.user;

import com.google.common.base.Function;

// Referenced classes of package com.facebook.user:
//            UserKey

final class v
    implements Function
{

    v()
    {
    }

    public String a(UserKey userkey)
    {
        return userkey.b();
    }

    public Object apply(Object obj)
    {
        return a((UserKey)obj);
    }
}
