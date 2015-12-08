// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.model;

import java.util.Comparator;

// Referenced classes of package com.snapchat.android.model:
//            FriendManager, Friend

public final class this._cls0
    implements Comparator
{

    final FriendManager this$0;

    public final volatile int compare(Object obj, Object obj1)
    {
        obj = (Friend)obj;
        long l = ((Friend)obj1).mTheyAddedMeTimestamp - ((Friend) (obj)).mTheyAddedMeTimestamp;
        if (l < 0xffffffff80000000L)
        {
            return 0x80000000;
        }
        if (l > 0x7fffffffL)
        {
            return 0x7fffffff;
        } else
        {
            return (int)l;
        }
    }

    public ()
    {
        this$0 = FriendManager.this;
        super();
    }
}
