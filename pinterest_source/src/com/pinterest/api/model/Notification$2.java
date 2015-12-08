// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model;

import com.pinterest.common.async.BackgroundTask;
import java.util.List;

// Referenced classes of package com.pinterest.api.model:
//            ModelHelper, User, Board, Pin

final class sk extends BackgroundTask
{

    final List val$boardIds;
    final List val$boards;
    final List val$notifications;
    final List val$pinIds;
    final List val$pins;
    final List val$templates;
    final List val$userIds;
    final List val$users;

    public final void run()
    {
        ModelHelper.setNotifications(val$notifications);
        ModelHelper.setNotificationTemplates(val$templates);
        List list = ModelHelper.getUsers(val$userIds);
        ModelHelper.setUsers(User.mergeAll(val$users, list));
        list = ModelHelper.getBoards(val$boardIds);
        ModelHelper.setBoards(Board.mergeAll(val$boards, list));
        list = ModelHelper.getPins(val$pinIds);
        ModelHelper.setPins(Pin.mergeAll(val$pins, list));
    }

    sk()
    {
        val$notifications = list;
        val$templates = list1;
        val$userIds = list2;
        val$users = list3;
        val$boardIds = list4;
        val$boards = list5;
        val$pinIds = list6;
        val$pins = list7;
        super();
    }
}
