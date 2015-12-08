// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.common;

import java.util.concurrent.Callable;

// Referenced classes of package com.worklight.common:
//            Logger

static final class VEL
    implements Callable
{

    public VEL call()
    {
        return Logger.access$100();
    }

    public volatile Object call()
        throws Exception
    {
        return call();
    }

    VEL()
    {
    }
}
