// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.base.app;

import com.google.common.base.Throwables;
import com.google.common.util.concurrent.FutureCallback;

// Referenced classes of package com.facebook.base.app:
//            AbstractApplicationLike

class a
    implements FutureCallback
{

    final AbstractApplicationLike a;

    public void onFailure(Throwable throwable)
    {
        throw Throwables.propagate(throwable);
    }

    public void onSuccess(Object obj)
    {
        AbstractApplicationLike.b();
    }

    (AbstractApplicationLike abstractapplicationlike)
    {
        a = abstractapplicationlike;
        super();
    }
}
