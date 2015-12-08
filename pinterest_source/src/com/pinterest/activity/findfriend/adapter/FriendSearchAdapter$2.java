// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.findfriend.adapter;

import java.util.List;

// Referenced classes of package com.pinterest.activity.findfriend.adapter:
//            FriendSearchAdapter

class val.newItems
    implements Runnable
{

    final FriendSearchAdapter this$0;
    final List val$newItems;

    public void run()
    {
        FriendSearchAdapter.access$202(FriendSearchAdapter.this, val$newItems);
        notifyDataSetChanged();
    }

    ()
    {
        this$0 = final_friendsearchadapter;
        val$newItems = List.this;
        super();
    }
}
