// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model;

import com.pinterest.common.async.BackgroundTask;
import java.util.List;

// Referenced classes of package com.pinterest.api.model:
//            ModelHelper

final class undTask extends BackgroundTask
{

    final List val$comments;
    final List val$partners;
    final List val$users;

    public final void run()
    {
        ModelHelper.setComments(val$comments);
        ModelHelper.setPartners(val$partners);
        ModelHelper.setUsers(val$users);
    }

    r()
    {
        val$comments = list;
        val$partners = list1;
        val$users = list2;
        super();
    }
}
