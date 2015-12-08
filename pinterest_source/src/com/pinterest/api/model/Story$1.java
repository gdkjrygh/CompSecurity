// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model;

import com.pinterest.common.async.BackgroundTask;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.pinterest.api.model:
//            Story, User, ModelHelper, Board, 
//            Pin

final class roundTask extends BackgroundTask
{

    final Story val$story;

    public final void run()
    {
        Object obj = new ArrayList();
        for (Iterator iterator = Story.access$000(val$story).iterator(); iterator.hasNext(); ((List) (obj)).add(((User)iterator.next()).getUid())) { }
        obj = ModelHelper.getUsers(((List) (obj)));
        Story.access$002(val$story, User.mergeAll(Story.access$000(val$story), ((List) (obj))));
        ModelHelper.setUsers(Story.access$000(val$story));
        obj = new ArrayList();
        for (Iterator iterator1 = Story.access$100(val$story).iterator(); iterator1.hasNext(); ((List) (obj)).add(((Board)iterator1.next()).getUid())) { }
        obj = ModelHelper.getBoards(((List) (obj)));
        Story.access$102(val$story, Board.mergeAll(Story.access$100(val$story), ((List) (obj))));
        ModelHelper.setBoards(Story.access$100(val$story));
        obj = new ArrayList();
        for (Iterator iterator2 = Story.access$200(val$story).iterator(); iterator2.hasNext(); ((List) (obj)).add(((Pin)iterator2.next()).getUid())) { }
        obj = ModelHelper.getPins(((List) (obj)));
        Story.access$202(val$story, Pin.mergeAll(Story.access$200(val$story), ((List) (obj))));
        ModelHelper.setPins(Story.access$200(val$story));
        ModelHelper.setStory(val$story);
    }

    per()
    {
        val$story = story1;
        super();
    }
}
