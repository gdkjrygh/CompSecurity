// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model;

import com.pinterest.common.async.BackgroundTask;
import java.util.List;

// Referenced classes of package com.pinterest.api.model:
//            ModelHelper, User, Board, Pin, 
//            Notification

final class sk extends BackgroundTask
{

    final List val$boardIds;
    final List val$boards;
    final Notification val$notification;
    final List val$partners;
    final List val$pinIds;
    final List val$pins;
    final List val$templates;
    final List val$userIds;
    final List val$users;

    public final void run()
    {
        ModelHelper.setPartners(val$partners);
        List list = ModelHelper.getUsers(val$userIds);
        ModelHelper.setUsers(User.mergeAll(val$users, list));
        list = ModelHelper.getBoards(val$boardIds);
        ModelHelper.setBoards(Board.mergeAll(val$boards, list));
        list = ModelHelper.getPins(val$pinIds);
        ModelHelper.setPins(Pin.mergeAll(val$pins, list));
        ModelHelper.setNotificationTemplates(val$templates);
        ModelHelper.setNotification(val$notification);
    }

    sk()
    {
        val$partners = list;
        val$userIds = list1;
        val$users = list2;
        val$boardIds = list3;
        val$boards = list4;
        val$pinIds = list5;
        val$pins = list6;
        val$templates = list7;
        val$notification = notification1;
        super();
    }
}
