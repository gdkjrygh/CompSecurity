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
        obj = ((Friend)obj).mFriendSection;
        if (obj == iendSection.ON_SNAPCHAT_TRUNCATED)
        {
            return iendSection.ON_SNAPCHAT_TRUNCATED;
        }
        if (obj == iendSection.INVITE)
        {
            return iendSection.INVITE;
        } else
        {
            return iendSection.NONE;
        }
    }

    public iendSection()
    {
    }
}
