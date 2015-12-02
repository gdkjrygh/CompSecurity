// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.appbox.core;

import com.qihoo.security.appbox.b.c;

// Referenced classes of package com.qihoo.security.appbox.core:
//            a, AppBoxResponse

class b
    implements Runnable
{

    final c a;
    final AppBoxResponse b;
    final a c;

    public void run()
    {
        a.a(b);
    }

    oxResponse(a a1, c c1, AppBoxResponse appboxresponse)
    {
        c = a1;
        a = c1;
        b = appboxresponse;
        super();
    }
}
