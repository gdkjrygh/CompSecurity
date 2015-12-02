// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.v;

import com.facebook.base.broadcast.a;
import com.google.common.base.Preconditions;

// Referenced classes of package com.facebook.common.v:
//            a

class b
    implements Runnable
{

    final com.facebook.common.v.a a;

    b(com.facebook.common.v.a a1)
    {
        a = a1;
        super();
    }

    public void run()
    {
        boolean flag;
        if (!com.facebook.common.v.a.a(a))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "This should have been canceled");
        com.facebook.common.v.a.a(a, null);
        com.facebook.common.v.a.b(a).a(a.c);
    }
}
