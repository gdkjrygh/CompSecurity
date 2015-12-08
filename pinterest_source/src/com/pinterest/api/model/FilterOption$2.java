// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model;

import com.pinterest.common.async.BackgroundTask;
import java.util.ArrayList;

// Referenced classes of package com.pinterest.api.model:
//            ModelHelper

final class sk extends BackgroundTask
{

    final ArrayList val$values;

    public final void run()
    {
        ModelHelper.setFilterOptions(val$values);
    }

    sk()
    {
        val$values = arraylist;
        super();
    }
}
