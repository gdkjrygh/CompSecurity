// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.model;

import java.util.Comparator;
import java.util.HashMap;

// Referenced classes of package com.snapchat.android.model:
//            FriendManager, Friend

final class val.timestamps
    implements Comparator
{

    final FriendManager this$0;
    final HashMap val$timestamps;

    private long a(Friend friend)
    {
        friend = (Long)val$timestamps.get(friend);
        if (friend == null)
        {
            return 0L;
        } else
        {
            return friend.longValue();
        }
    }

    public final int compare(Object obj, Object obj1)
    {
        obj = (Friend)obj;
        return Long.signum(a((Friend)obj1) - a(((Friend) (obj))));
    }

    ()
    {
        this$0 = final_friendmanager;
        val$timestamps = HashMap.this;
        super();
    }
}
