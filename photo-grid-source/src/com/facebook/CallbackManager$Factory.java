// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import com.facebook.internal.CallbackManagerImpl;

// Referenced classes of package com.facebook:
//            CallbackManager

public class Impl
{

    public static CallbackManager create()
    {
        return new CallbackManagerImpl();
    }

    public Impl()
    {
    }
}
