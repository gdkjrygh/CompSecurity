// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.addfriends;

import com.snapchat.android.model.FriendAction;

// Referenced classes of package com.snapchat.android.fragments.addfriends:
//            AddNearbyFriendsFragment

static final class erruptReason
{

    static final int a[];
    static final int b[];

    static 
    {
        b = new int[erruptReason.values().length];
        try
        {
            b[erruptReason.LOCATION_PERMISSIONS.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            b[erruptReason.INITIAL_PROMPT.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            b[erruptReason.LOCATION_ERROR.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            b[erruptReason.ERROR.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            b[erruptReason.INTENTIONAL.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            b[erruptReason.NO_INTERNET_CONNECTION.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        a = new int[FriendAction.values().length];
        try
        {
            a[FriendAction.BLOCK.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[FriendAction.ADD.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
