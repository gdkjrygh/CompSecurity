// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model;

import com.pinterest.common.async.BackgroundTask;
import java.util.List;

// Referenced classes of package com.pinterest.api.model:
//            ModelHelper, Conversation

final class sk extends BackgroundTask
{

    final Conversation val$conversation;
    final List val$partners;
    final List val$users;

    public final void run()
    {
        ModelHelper.setPartners(val$partners);
        ModelHelper.setUsers(val$users);
        ModelHelper.setConversation(val$conversation);
    }

    sk()
    {
        val$partners = list;
        val$users = list1;
        val$conversation = conversation1;
        super();
    }
}
