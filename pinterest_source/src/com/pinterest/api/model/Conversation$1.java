// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model;

import com.pinterest.common.async.BackgroundTask;
import java.util.List;

// Referenced classes of package com.pinterest.api.model:
//            ModelHelper

final class sk extends BackgroundTask
{

    final List val$conversations;
    final List val$users;

    public final void run()
    {
        if (!val$conversations.isEmpty())
        {
            ModelHelper.setConversations(val$conversations);
        }
        if (!val$users.isEmpty())
        {
            ModelHelper.setUsers(val$users);
        }
    }

    sk()
    {
        val$conversations = list;
        val$users = list1;
        super();
    }
}
