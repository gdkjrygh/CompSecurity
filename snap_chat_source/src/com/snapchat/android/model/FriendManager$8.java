// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.model;

import java.util.List;

// Referenced classes of package com.snapchat.android.model:
//            FriendManager, Friend

final class val.friends
    implements 
{

    final FriendManager this$0;
    final List val$friends;

    public final void a(Object obj)
    {
        obj = (Friend)obj;
        if (FriendManager.e(((Friend) (obj))))
        {
            val$friends.add(obj);
        }
    }

    ()
    {
        this$0 = final_friendmanager;
        val$friends = List.this;
        super();
    }
}
