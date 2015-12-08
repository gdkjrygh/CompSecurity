// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.facebookinvites;

import com.soundcloud.android.model.Urn;
import com.soundcloud.android.stream.NotificationItem;
import com.soundcloud.java.objects.MoreObjects;
import java.util.List;

public class FacebookInvitesItem extends NotificationItem
{

    public static final Urn URN = new Urn("soundcloud:notifications:facebook-invites");
    private final List friendPictureUrls;

    public FacebookInvitesItem(List list)
    {
        friendPictureUrls = list;
    }

    public final boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (!(obj instanceof FacebookInvitesItem))
        {
            return false;
        } else
        {
            obj = (FacebookInvitesItem)obj;
            return MoreObjects.equal(friendPictureUrls, ((FacebookInvitesItem) (obj)).friendPictureUrls);
        }
    }

    public Urn getEntityUrn()
    {
        return URN;
    }

    public List getFacebookFriendPictureUrls()
    {
        return friendPictureUrls;
    }

    public boolean hasPictures()
    {
        return friendPictureUrls.size() > 0;
    }

    public int hashCode()
    {
        return MoreObjects.hashCode(new Object[] {
            friendPictureUrls
        });
    }

}
