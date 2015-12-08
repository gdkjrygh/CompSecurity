// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.leanplum;

import com.leanplum.callbacks.StartCallback;

// Referenced classes of package com.leanplum:
//            Z, N, ak

final class aj
    implements Z
{

    private final StartCallback a;

    aj(StartCallback startcallback)
    {
        a = startcallback;
        super();
    }

    public final void a()
    {
        N.a().a(new ak(this, a));
    }
}
