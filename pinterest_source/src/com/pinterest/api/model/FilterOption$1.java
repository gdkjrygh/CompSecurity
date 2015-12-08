// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model;

import com.pinterest.common.async.BackgroundTask;

// Referenced classes of package com.pinterest.api.model:
//            ModelHelper, FilterOption

final class sk extends BackgroundTask
{

    final FilterOption val$option;

    public final void run()
    {
        ModelHelper.setFilterOption(val$option);
    }

    sk()
    {
        val$option = filteroption;
        super();
    }
}
