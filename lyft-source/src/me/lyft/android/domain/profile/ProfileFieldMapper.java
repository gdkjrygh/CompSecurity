// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.profile;

import java.util.List;
import me.lyft.android.common.Strings;
import me.lyft.android.infrastructure.lyft.constants.ProfileFieldDTO;

// Referenced classes of package me.lyft.android.domain.profile:
//            ProfileField, ProfileFields

public class ProfileFieldMapper
{

    static final int ABOUT_INDEX = 2;
    static final int HOMETOWN_INDEX = 0;
    static final int MUSIC_INDEX = 1;

    public ProfileFieldMapper()
    {
    }

    static ProfileField createProfileField(List list, int i)
    {
        String s2 = "";
        String s1 = "";
        String s = "";
        if (list.size() > i)
        {
            list = (ProfileFieldDTO)list.get(i);
            s2 = Strings.nullToEmpty(list.getDefaultProfile());
            s1 = Strings.nullToEmpty(list.getPlaceholder());
            s = Strings.nullToEmpty(list.getPrefix());
        }
        return new ProfileField(s2, s1, s);
    }

    public static ProfileFields fromDTOs(List list)
    {
        return new ProfileFields(createProfileField(list, 0), createProfileField(list, 1), createProfileField(list, 2));
    }

    static String getProfileValue(List list, int i)
    {
        if (list.size() > i)
        {
            return (String)list.get(i);
        } else
        {
            return "";
        }
    }
}
