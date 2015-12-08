// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.server.api;

import android.content.ContentValues;
import com.google.android.gms.common.server.response.FastContentValuesJsonResponse;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.common.server.response.FastMapJsonResponse;
import com.google.android.gms.common.server.response.PostProcessor;
import com.google.android.gms.games.server.converter.PlayerImageUrlConverter;
import com.google.android.gms.games.server.postprocessor.PlayerPostProcessor;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

// Referenced classes of package com.google.android.gms.games.server.api:
//            PlayerExperienceInfo, PlayedApp, Played, ProfileSettings

public final class Player extends FastContentValuesJsonResponse
{
    public static final class Name extends FastMapJsonResponse
    {

        private static final TreeMap sFields;

        public final Map getFieldMappings()
        {
            return sFields;
        }

        static 
        {
            TreeMap treemap = new TreeMap();
            sFields = treemap;
            treemap.put("familyName", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("familyName"));
            sFields.put("fullName", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("fullName"));
            sFields.put("givenName", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("givenName"));
        }

        public Name()
        {
        }
    }


    private static final PlayerPostProcessor PROCESSOR = new PlayerPostProcessor();
    private static final TreeMap sFields;
    private final HashMap mConcreteTypes = new HashMap();

    public Player()
    {
    }

    public final void addConcreteType(String s, FastJsonResponse fastjsonresponse)
    {
        mConcreteTypes.put(s, fastjsonresponse);
    }

    public final String getDisplayName()
    {
        return (String)super.mValues.get("profile_name");
    }

    public final PlayerExperienceInfo getExperienceInfo()
    {
        return (PlayerExperienceInfo)mConcreteTypes.get("experienceInfo");
    }

    public final Map getFieldMappings()
    {
        return sFields;
    }

    public final PlayedApp getLastPlayedApp()
    {
        return (PlayedApp)mConcreteTypes.get("lastPlayedApp");
    }

    public final Played getLastPlayedWith()
    {
        return (Played)mConcreteTypes.get("lastPlayedWith");
    }

    public final Name getName()
    {
        return (Name)mConcreteTypes.get("name");
    }

    public final volatile PostProcessor getPostProcessor()
    {
        return PROCESSOR;
    }

    public final ProfileSettings getProfileSettings()
    {
        return (ProfileSettings)mConcreteTypes.get("profileSettings");
    }

    public final Boolean isCircled()
    {
        return (Boolean)super.mValues.get("is_in_circles");
    }

    protected final boolean isConcreteTypeFieldSet(String s)
    {
        return mConcreteTypes.containsKey(s);
    }

    static 
    {
        TreeMap treemap = new TreeMap();
        sFields = treemap;
        treemap.put("avatarImageUrl", com.google.android.gms.common.server.response.FastJsonResponse.Field.withConverter("profile_icon_image_url", com/google/android/gms/games/server/converter/PlayerImageUrlConverter, false));
        sFields.put("bannerUrlLandscape", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("banner_image_landscape_url"));
        sFields.put("bannerUrlPortrait", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("banner_image_portrait_url"));
        sFields.put("displayName", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("profile_name"));
        sFields.put("experienceInfo", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("experienceInfo", com/google/android/gms/games/server/api/PlayerExperienceInfo));
        sFields.put("hasAllPublicAcls", com.google.android.gms.common.server.response.FastJsonResponse.Field.forBoolean("has_all_public_acls"));
        sFields.put("isCircled", com.google.android.gms.common.server.response.FastJsonResponse.Field.forBoolean("is_in_circles"));
        sFields.put("lastPlayedApp", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("lastPlayedApp", com/google/android/gms/games/server/api/PlayedApp));
        sFields.put("lastPlayedWith", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("lastPlayedWith", com/google/android/gms/games/server/api/Played));
        sFields.put("name", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("name", com/google/android/gms/games/server/api/Player$Name));
        sFields.put("playerId", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("external_player_id"));
        sFields.put("profileSettings", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("profileSettings", com/google/android/gms/games/server/api/ProfileSettings));
        sFields.put("title", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("player_title"));
    }
}
