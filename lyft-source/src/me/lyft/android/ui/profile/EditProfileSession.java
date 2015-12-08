// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.profile;

import java.io.File;
import me.lyft.android.common.Strings;
import me.lyft.android.domain.profile.Profile;
import me.lyft.android.domain.profile.ProfileFields;

public class EditProfileSession
{

    private String about;
    private ProfileFields defaultProfileFields;
    private String hometown;
    private String music;
    private Profile profile;
    private boolean showMutualFriends;
    private boolean useSessionData;
    private File userImageFile;
    private boolean userShowMutualFriends;

    public EditProfileSession()
    {
    }

    public String getAbout()
    {
        if (useSessionData)
        {
            return Strings.nullToEmpty(about);
        } else
        {
            return profile.getAboutMe();
        }
    }

    public String getAboutMeHint()
    {
        return defaultProfileFields.getAboutMeHint();
    }

    public String getFavoriteMusicHint()
    {
        return defaultProfileFields.getFavoriteMusicHint();
    }

    public String getHometown()
    {
        if (useSessionData)
        {
            return Strings.nullToEmpty(hometown);
        } else
        {
            return profile.getHometown();
        }
    }

    public String getHometownHint()
    {
        return defaultProfileFields.getHometownHint();
    }

    public String getMusic()
    {
        if (useSessionData)
        {
            return Strings.nullToEmpty(music);
        } else
        {
            return profile.getFavoriteMusic();
        }
    }

    public File getUserPhotoFile()
    {
        return userImageFile;
    }

    public void setAbout(String s)
    {
        about = s;
    }

    public void setDefaultProfileFields(ProfileFields profilefields)
    {
        defaultProfileFields = profilefields;
    }

    public void setHometown(String s)
    {
        hometown = s;
    }

    public void setMusic(String s)
    {
        music = s;
    }

    public void setProfile(Profile profile1)
    {
        profile = profile1;
    }

    public void setShowMutualFriends(boolean flag)
    {
        showMutualFriends = flag;
    }

    public void setUseSessionData(boolean flag)
    {
        useSessionData = flag;
    }

    public void setUserPhotoFile(File file)
    {
        userImageFile = file;
    }

    public void setUserShowMutualFriends(boolean flag)
    {
        userShowMutualFriends = flag;
    }

    public boolean showMutualFriends()
    {
        if (useSessionData)
        {
            return showMutualFriends;
        } else
        {
            return userShowMutualFriends;
        }
    }
}
