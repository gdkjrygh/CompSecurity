// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.util;

import com.snapchat.android.model.Friend;

// Referenced classes of package com.snapchat.android.util:
//            FriendSectionizer

public static final class iendSection extends FriendSectionizer
{

    public final volatile iendSection a(Object obj, int i)
    {
        if (((Friend)obj).mFriendSection == iendSection.SUGGESTED_FRIEND)
        {
            return iendSection.SUGGESTED_FRIEND;
        } else
        {
            return iendSection.NONE;
        }
    }

    public iendSection()
    {
    }
}
