// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.base;

import com.tinder.managers.aa;
import com.tinder.utils.e;

// Referenced classes of package com.tinder.base:
//            ActivitySignedInBase

private final class b
    implements Runnable
{

    final ActivitySignedInBase a;
    private boolean b;

    public final void run()
    {
        aa aa1 = a.x;
        boolean flag = b;
        e.a(new com.tinder.managers.(aa1.a, flag)).a(false);
    }

    public (ActivitySignedInBase activitysignedinbase, boolean flag)
    {
        a = activitysignedinbase;
        super();
        b = flag;
    }
}
