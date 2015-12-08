// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model;

import com.pinterest.common.async.BackgroundTask;

// Referenced classes of package com.pinterest.api.model:
//            ModelHelper, Interest

final class ndTask extends BackgroundTask
{

    final Interest val$interest;

    public final void run()
    {
        ModelHelper.setInterest(val$interest);
    }

    ()
    {
        val$interest = interest1;
        super();
    }
}
