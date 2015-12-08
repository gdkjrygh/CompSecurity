// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.model;

import java.util.Comparator;

// Referenced classes of package com.snapchat.android.model:
//            FriendManager, Friend

final class this._cls0
    implements Comparator
{

    final FriendManager this$0;

    public final int compare(Object obj, Object obj1)
    {
        obj = (Friend)obj;
        obj1 = (Friend)obj1;
        return Integer.valueOf(((Friend) (obj)).mBestFriendIndex).compareTo(Integer.valueOf(((Friend) (obj1)).mBestFriendIndex));
    }

    ()
    {
        this$0 = FriendManager.this;
        super();
    }
}
