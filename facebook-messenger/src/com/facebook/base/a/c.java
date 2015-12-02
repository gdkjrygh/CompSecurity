// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.base.a;

import com.facebook.base.d;
import com.google.common.base.Preconditions;

// Referenced classes of package com.facebook.base.a:
//            d

public class c
    implements d
{

    private final com.facebook.base.a.d a;

    public c(com.facebook.base.a.d d1)
    {
        a = (com.facebook.base.a.d)Preconditions.checkNotNull(d1);
    }

    public void a()
    {
        a.a();
    }
}
