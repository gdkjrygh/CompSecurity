// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model;

import com.pinterest.common.async.BackgroundTask;

// Referenced classes of package com.pinterest.api.model:
//            ModelHelper, Partner

final class undTask extends BackgroundTask
{

    final Partner val$partner;

    public final void run()
    {
        ModelHelper.setPartner(val$partner);
    }

    r()
    {
        val$partner = partner1;
        super();
    }
}
