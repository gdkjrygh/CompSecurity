// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.profile;

import java.util.Collections;
import java.util.List;
import me.lyft.android.common.INullable;
import me.lyft.android.common.Objects;
import me.lyft.android.common.Strings;

public class Profile
    implements INullable
{

    private String aboutMe;
    private String additionalMutualFriendsCount;
    private boolean canShowMutualFriends;
    private String favoriteMusic;
    private String firstName;
    private String hometown;
    private String joinDate;
    private List mutualFriends;
    private String photoUrl;
    private boolean self;

    public Profile()
    {
    }

    public static Profile empty()
    {
        return NullProfile.INSTANCE;
    }

    public String getAboutMe()
    {
        return Strings.nullToEmpty(aboutMe);
    }

    public String getAdditionalMutualFriendsCount()
    {
        return additionalMutualFriendsCount;
    }

    public String getFavoriteMusic()
    {
        return Strings.nullToEmpty(favoriteMusic);
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getHometown()
    {
        return Strings.nullToEmpty(hometown);
    }

    public String getJoinDate()
    {
        return joinDate;
    }

    public List getMutualFriends()
    {
        return (List)Objects.firstNonNull(mutualFriends, Collections.emptyList());
    }

    public String getPhotoUrl()
    {
        return photoUrl;
    }

    public boolean hasMutualFriends()
    {
        return !getMutualFriends().isEmpty();
    }

    public boolean hasNoProfileFields()
    {
        return Strings.isNullOrEmpty(hometown) && Strings.isNullOrEmpty(favoriteMusic) && Strings.isNullOrEmpty(aboutMe);
    }

    public boolean isCanShowMutualFriends()
    {
        return canShowMutualFriends;
    }

    public boolean isNull()
    {
        return false;
    }

    public boolean isSelf()
    {
        return self;
    }

    public void setAboutMe(String s)
    {
        aboutMe = s;
    }

    void setAdditionalMutualFriendsCount(String s)
    {
        additionalMutualFriendsCount = s;
    }

    public void setCanShowMutualFriends(boolean flag)
    {
        canShowMutualFriends = flag;
    }

    public void setFavoriteMusic(String s)
    {
        favoriteMusic = s;
    }

    void setFirstName(String s)
    {
        firstName = s;
    }

    public void setHometown(String s)
    {
        hometown = s;
    }

    public void setJoinDate(String s)
    {
        joinDate = s;
    }

    void setMutualFriends(List list)
    {
        mutualFriends = list;
    }

    void setPhotoUrl(String s)
    {
        photoUrl = s;
    }

    void setSelf(boolean flag)
    {
        self = flag;
    }

    private class NullProfile extends Profile
    {

        public static final NullProfile INSTANCE = new NullProfile();

        public String getAboutMe()
        {
            return "";
        }

        public String getAdditionalMutualFriendsCount()
        {
            return "";
        }

        public String getFavoriteMusic()
        {
            return "";
        }

        public String getFirstName()
        {
            return "";
        }

        public String getHometown()
        {
            return "";
        }

        public String getJoinDate()
        {
            return "";
        }

        public List getMutualFriends()
        {
            return Collections.emptyList();
        }

        public String getPhotoUrl()
        {
            return "";
        }

        public boolean hasMutualFriends()
        {
            return false;
        }

        public boolean hasNoProfileFields()
        {
            return false;
        }

        public boolean isCanShowMutualFriends()
        {
            return false;
        }

        public final boolean isNull()
        {
            return true;
        }

        public boolean isSelf()
        {
            return false;
        }

        public void setAboutMe(String s)
        {
        }

        void setAdditionalMutualFriendsCount(String s)
        {
        }

        public void setCanShowMutualFriends(boolean flag)
        {
        }

        public void setFavoriteMusic(String s)
        {
        }

        void setFirstName(String s)
        {
        }

        public void setHometown(String s)
        {
        }

        public void setJoinDate(String s)
        {
        }

        void setMutualFriends(List list)
        {
        }

        void setPhotoUrl(String s)
        {
        }

        void setSelf(boolean flag)
        {
        }


        NullProfile()
        {
        }
    }

}
