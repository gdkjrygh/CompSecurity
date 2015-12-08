// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model;

import com.pinterest.common.async.BackgroundTask;
import java.util.List;

// Referenced classes of package com.pinterest.api.model:
//            ModelHelper, Pin, Board, User

final class t> extends BackgroundTask
{

    final List val$boardIds;
    final List val$boards;
    final List val$conversationMsgList;
    final List val$partners;
    final List val$pinIds;
    final List val$pins;
    final List val$userIds;
    final List val$users;

    public final void run()
    {
        List list1 = ModelHelper.getPins(val$pinIds);
        List list2 = ModelHelper.getBoards(val$boardIds);
        List list = ModelHelper.getUsers(val$userIds);
        list1 = Pin.mergeAll(val$pins, list1);
        list2 = Board.mergeAll(val$boards, list2);
        list = User.mergeAll(val$users, list);
        ModelHelper.setConversationMessages(val$conversationMsgList);
        ModelHelper.setPins(list1);
        ModelHelper.setBoards(list2);
        ModelHelper.setPartners(val$partners);
        ModelHelper.setUsers(list);
    }

    ()
    {
        val$pinIds = list;
        val$boardIds = list1;
        val$userIds = list2;
        val$pins = list3;
        val$boards = list4;
        val$users = list5;
        val$conversationMsgList = list6;
        val$partners = list7;
        super();
    }
}
