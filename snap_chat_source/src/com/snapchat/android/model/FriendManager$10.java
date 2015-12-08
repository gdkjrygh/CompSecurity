// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.model;

import android.text.TextUtils;

// Referenced classes of package com.snapchat.android.model:
//            FriendManager, Friend

public final class val.sharedStoryId
    implements 
{

    final FriendManager this$0;
    final String val$sharedStoryId;

    public final boolean a(Object obj)
    {
        return TextUtils.equals(((Friend)obj).mSharedStoryId, val$sharedStoryId);
    }

    public ()
    {
        this$0 = final_friendmanager;
        val$sharedStoryId = String.this;
        super();
    }
}
