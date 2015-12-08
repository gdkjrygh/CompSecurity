// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.profile;

import me.lyft.android.common.Strings;

// Referenced classes of package me.lyft.android.domain.profile:
//            ProfileField

public class ProfileFields
{

    private final ProfileField aboutMe;
    private final ProfileField favoriteMusic;
    private final ProfileField hometown;

    ProfileFields(ProfileField profilefield, ProfileField profilefield1, ProfileField profilefield2)
    {
        hometown = profilefield;
        favoriteMusic = profilefield1;
        aboutMe = profilefield2;
    }

    static boolean isProfileFieldEmpty(ProfileField profilefield)
    {
        return profilefield == null || Strings.isNullOrEmpty(profilefield.getDefaultValue());
    }

    public String getAboutMeDefault()
    {
        return aboutMe.getDefaultValue();
    }

    public String getAboutMeHint()
    {
        return aboutMe.getHint();
    }

    public String getAboutMePrefix()
    {
        return aboutMe.getPrefix();
    }

    public String getFavoriteMusicDefault()
    {
        return favoriteMusic.getDefaultValue();
    }

    public String getFavoriteMusicHint()
    {
        return favoriteMusic.getHint();
    }

    public String getFavoriteMusicPrefix()
    {
        return favoriteMusic.getPrefix();
    }

    public String getHometownDefault()
    {
        return hometown.getDefaultValue();
    }

    public String getHometownHint()
    {
        return hometown.getHint();
    }

    public String getHometownPrefix()
    {
        return hometown.getPrefix();
    }

    public boolean isEmpty()
    {
        return isProfileFieldEmpty(hometown) && isProfileFieldEmpty(favoriteMusic) && isProfileFieldEmpty(aboutMe);
    }
}
