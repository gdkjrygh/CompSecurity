// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model;

import com.pinterest.common.async.BackgroundTask;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.pinterest.api.model:
//            ModelHelper, User, Board, Pin

final class roundTask extends BackgroundTask
{

    final List val$boards;
    final List val$items;
    final List val$pins;
    final List val$users;

    public final void run()
    {
        ModelHelper.setStories(val$items);
        Object obj = new ArrayList();
        for (Iterator iterator = val$users.iterator(); iterator.hasNext(); ((List) (obj)).add(((User)iterator.next()).getUid())) { }
        obj = ModelHelper.getUsers(((List) (obj)));
        ModelHelper.setUsers(User.mergeAll(val$users, ((List) (obj))));
        obj = new ArrayList();
        for (Iterator iterator1 = val$boards.iterator(); iterator1.hasNext(); ((List) (obj)).add(((Board)iterator1.next()).getUid())) { }
        obj = ModelHelper.getBoards(((List) (obj)));
        ModelHelper.setBoards(Board.mergeAll(val$boards, ((List) (obj))));
        obj = new ArrayList();
        for (Iterator iterator2 = val$pins.iterator(); iterator2.hasNext(); ((List) (obj)).add(((Pin)iterator2.next()).getUid())) { }
        obj = ModelHelper.getPins(((List) (obj)));
        ModelHelper.setPins(Pin.mergeAll(val$pins, ((List) (obj))));
    }

    per()
    {
        val$items = list;
        val$users = list1;
        val$boards = list2;
        val$pins = list3;
        super();
    }
}
