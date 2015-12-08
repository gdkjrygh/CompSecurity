// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model;

import com.pinterest.common.async.BackgroundTask;
import java.util.List;

// Referenced classes of package com.pinterest.api.model:
//            ModelHelper

final class ndTask extends BackgroundTask
{

    final List val$interests;

    public final void run()
    {
        ModelHelper.setInterests(val$interests);
    }

    ()
    {
        val$interests = list;
        super();
    }
}
