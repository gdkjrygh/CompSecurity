// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.snapchat.android.model.Friend;
import com.snapchat.android.model.FriendManager;
import com.snapchat.android.stories.StoriesSection;

public class yZ
    implements Comparable, zo
{

    protected final Friend a;
    private final FriendManager b;

    public yZ(Friend friend)
    {
        this(friend, FriendManager.e());
    }

    private yZ(Friend friend, FriendManager friendmanager)
    {
        a = friend;
        b = friendmanager;
    }

    public StoriesSection a(boolean flag)
    {
        com.snapchat.android.model.Friend.SuggestType suggesttype = a.mSuggestType;
        if (suggesttype == com.snapchat.android.model.Friend.SuggestType.USERNAME)
        {
            return StoriesSection.USERNAME;
        }
        if (suggesttype == com.snapchat.android.model.Friend.SuggestType.ADDRESS_BOOK)
        {
            return StoriesSection.ADDRESS_BOOK;
        }
        if (suggesttype == com.snapchat.android.model.Friend.SuggestType.OFFICIAL_STORY)
        {
            return StoriesSection.OFFICIAL_STORIES;
        }
        if (b.c(a.g()))
        {
            return StoriesSection.FRIENDS;
        } else
        {
            return StoriesSection.NONE;
        }
    }

    public final String a()
    {
        return a.mDisplayName;
    }

    public boolean b()
    {
        return false;
    }

    public int c()
    {
        return 7;
    }

    public int compareTo(Object obj)
    {
        obj = (yZ)obj;
        return a.a(((yZ) (obj)).a);
    }

    public final String e()
    {
        return a.c();
    }

    public final Friend f()
    {
        return a;
    }

    public final String i()
    {
        return a.g();
    }

    public boolean y_()
    {
        return false;
    }
}
