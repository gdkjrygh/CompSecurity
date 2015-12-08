// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.snapchat.android.model.Friend;
import com.snapchat.android.model.FriendAction;

public final class NH
{

    public FriendAction mAction;
    public Friend mFriend;

    public NH()
    {
        mAction = FriendAction.NONE;
    }

    public NH(Friend friend, FriendAction friendaction)
    {
        mAction = FriendAction.NONE;
        mFriend = friend;
        mAction = friendaction;
    }
}
