// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model;

import com.pinterest.common.async.BackgroundResult;
import com.pinterest.common.async.BackgroundTask;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.pinterest.api.model:
//            MyUser

final class _categories extends BackgroundTask
{

    List _categories;
    final BackgroundResult val$handler;

    public final void onFinish()
    {
        val$handler.onFinish(_categories);
    }

    public final void run()
    {
        _categories = MyUser.getLastUsedCategoriesBlocking();
    }

    oundResult()
    {
        val$handler = backgroundresult;
        super();
        _categories = new ArrayList();
    }
}
