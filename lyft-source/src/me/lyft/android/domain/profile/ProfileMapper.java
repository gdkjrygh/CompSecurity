// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.profile;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import me.lyft.android.common.Objects;
import me.lyft.android.common.Strings;
import me.lyft.android.infrastructure.lyft.profile.ImageUploadDTO;
import me.lyft.android.infrastructure.lyft.profile.MutualFriendDTO;
import me.lyft.android.infrastructure.lyft.profile.PermissionsDTO;
import me.lyft.android.infrastructure.lyft.profile.UpdateUserRequestBuilder;
import me.lyft.android.infrastructure.lyft.profile.UpdateUserRequestDTO;
import me.lyft.android.infrastructure.lyft.profile.UserDTO;

// Referenced classes of package me.lyft.android.domain.profile:
//            Profile, MutualFriend, ProfileFieldMapper

public class ProfileMapper
{

    public ProfileMapper()
    {
    }

    public static UpdateUserRequestDTO asUserDTOForUpdateProfile(Profile profile, ImageUploadDTO imageuploaddto)
    {
        PermissionsDTO permissionsdto = new PermissionsDTO(Boolean.valueOf(profile.isCanShowMutualFriends()));
        ArrayList arraylist = new ArrayList(3);
        arraylist.add(0, profile.getHometown());
        arraylist.add(1, profile.getFavoriteMusic());
        arraylist.add(2, profile.getAboutMe());
        return (new UpdateUserRequestBuilder()).withProfileFields(arraylist).withPermissions(permissionsdto).withImage(imageuploaddto).build();
    }

    static List fromMutualFriendsDTO(List list)
    {
        ArrayList arraylist = new ArrayList(list.size());
        MutualFriendDTO mutualfrienddto;
        for (list = list.iterator(); list.hasNext(); arraylist.add(new MutualFriend(Strings.nullToEmpty(mutualfrienddto.getName()), Strings.nullToEmpty(mutualfrienddto.getPhoto()))))
        {
            mutualfrienddto = (MutualFriendDTO)list.next();
        }

        return arraylist;
    }

    public static Profile fromUserDTO(UserDTO userdto, String s)
    {
        if (userdto.isNull())
        {
            return Profile.empty();
        } else
        {
            Profile profile = new Profile();
            profile.setSelf(Objects.equals(s, userdto.getId()));
            profile.setFirstName(userdto.getFirstName());
            profile.setPhotoUrl(userdto.getUserPhoto());
            s = (List)Objects.firstNonNull(userdto.getProfileFields(), Collections.emptyList());
            profile.setHometown(ProfileFieldMapper.getProfileValue(s, 0));
            profile.setFavoriteMusic(ProfileFieldMapper.getProfileValue(s, 1));
            profile.setAboutMe(ProfileFieldMapper.getProfileValue(s, 2));
            profile.setJoinDate(userdto.getJoinDate());
            profile.setCanShowMutualFriends(((Boolean)Objects.firstNonNull(((PermissionsDTO)Objects.firstNonNull(userdto.getPermissions(), new PermissionsDTO(Boolean.valueOf(false)))).isCanShowMutualFriends(), Boolean.valueOf(false))).booleanValue());
            profile.setAdditionalMutualFriendsCount(Strings.nullToEmpty(userdto.getAdditionalMutualFriendsCount()));
            profile.setMutualFriends(fromMutualFriendsDTO((List)Objects.firstNonNull(userdto.getMutualFriends(), Collections.emptyList())));
            return profile;
        }
    }
}
