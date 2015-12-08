// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import aoo;
import aop;
import aoz;
import com.facebook.model.GraphUser;

// Referenced classes of package com.facebook:
//            Request

final class 
    implements aoo
{

    private aop a;

    public final void a(aoz aoz1)
    {
        if (a != null)
        {
            a.a((GraphUser)aoz1.a(com/facebook/model/GraphUser), aoz1);
        }
    }

    hUser(aop aop1)
    {
        a = aop1;
        super();
    }
}
