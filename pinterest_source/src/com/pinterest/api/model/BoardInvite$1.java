// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model;

import com.pinterest.common.async.BackgroundTask;
import java.util.List;

// Referenced classes of package com.pinterest.api.model:
//            ModelHelper

final class ask extends BackgroundTask
{

    final List val$invites;

    public final void run()
    {
        ModelHelper.setBoardInvites(val$invites);
    }

    ask()
    {
        val$invites = list;
        super();
    }
}
