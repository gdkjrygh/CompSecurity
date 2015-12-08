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
        obj = (Friend)obj;
        if (((Friend) (obj)).mIsVerifiedSearchResult)
        {
            return iendSection.VERIFIED;
        }
        if (i == 0)
        {
            return iendSection.USERNAME;
        }
        if (((Friend) (obj)).mDirection == com.snapchat.android.model.OMING)
        {
            return iendSection.FRIENDS_WHO_ADDED_ME;
        }
        if (((Friend) (obj)).mFriendSection == iendSection.MY_ADDRESS_BOOK)
        {
            return iendSection.MY_ADDRESS_BOOK;
        }
        if (((Friend) (obj)).mDirection == com.snapchat.android.model.GOING || ((Friend) (obj)).mDirection == com.snapchat.android.model.H)
        {
            return iendSection.MY_FRIENDS;
        } else
        {
            return iendSection.NONE;
        }
    }

    public iendSection()
    {
    }
}
