// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model;

import com.pinterest.common.async.BackgroundTask;

// Referenced classes of package com.pinterest.api.model:
//            ModelHelper, SearchFilter

final class sk extends BackgroundTask
{

    final SearchFilter val$filter;

    public final void run()
    {
        ModelHelper.setSearchFilter(val$filter);
    }

    sk()
    {
        val$filter = searchfilter;
        super();
    }
}
