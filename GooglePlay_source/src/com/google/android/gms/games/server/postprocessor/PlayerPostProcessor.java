// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.server.postprocessor;

import android.content.ContentValues;
import com.google.android.gms.common.app.GmsApplicationContext;
import com.google.android.gms.common.server.response.FastContentValuesJsonResponse;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.common.server.response.FastMapJsonResponse;
import com.google.android.gms.common.server.response.PostProcessor;
import com.google.android.gms.games.server.api.Player;
import com.google.android.gms.games.server.api.PlayerExperienceInfo;
import com.google.android.gms.games.server.api.PlayerLevel;
import com.google.android.gms.games.server.api.ProfileSettings;
import com.google.android.gms.games.server.converter.ImageUrlBuilder;
import com.google.android.gms.games.util.PanoUtils;
import java.util.HashMap;

// Referenced classes of package com.google.android.gms.games.server.postprocessor:
//            PostProcessorHelper

public final class PlayerPostProcessor
    implements PostProcessor
{

    public PlayerPostProcessor()
    {
    }

    public final volatile FastJsonResponse postProcess(FastJsonResponse fastjsonresponse)
    {
        fastjsonresponse = (Player)fastjsonresponse;
        Object obj = GmsApplicationContext.getInstance();
        ContentValues contentvalues = ((FastContentValuesJsonResponse) (fastjsonresponse)).mValues;
        Object obj1 = contentvalues.getAsString("profile_icon_image_url");
        if (obj1 != null)
        {
            contentvalues.put("profile_hi_res_image_url", (new ImageUrlBuilder(((String) (obj1)))).setSize(((android.content.Context) (obj)), 0x7f0c00de).build());
        } else
        {
            contentvalues.putNull("profile_hi_res_image_url");
        }
        PostProcessorHelper.convertImageUrlMaxWidth(((android.content.Context) (obj)), contentvalues, "banner_image_landscape_url");
        PostProcessorHelper.convertImageUrlMaxWidth(((android.content.Context) (obj)), contentvalues, "banner_image_portrait_url");
        obj1 = fastjsonresponse.getExperienceInfo();
        if (obj1 != null)
        {
            Object obj2 = (Long)((FastMapJsonResponse) (obj1)).mValues.get("lastLevelUpTimestampMillis");
            if (obj2 != null)
            {
                contentvalues.put("last_level_up_timestamp", ((Long) (obj2)));
            }
            contentvalues.put("current_xp_total", (Long)((FastMapJsonResponse) (obj1)).mValues.get("currentExperiencePoints"));
            obj2 = ((PlayerExperienceInfo) (obj1)).getCurrentLevel();
            contentvalues.put("current_level", ((PlayerLevel) (obj2)).getLevel());
            contentvalues.put("current_level_min_xp", (Long)((FastContentValuesJsonResponse) (obj2)).mValues.get("level_min_xp"));
            contentvalues.put("current_level_max_xp", ((PlayerLevel) (obj2)).getMaxExperiencePoints());
            obj1 = ((PlayerExperienceInfo) (obj1)).getNextLevel();
            contentvalues.put("next_level", ((PlayerLevel) (obj1)).getLevel());
            contentvalues.put("next_level_max_xp", ((PlayerLevel) (obj1)).getMaxExperiencePoints());
        }
        obj1 = fastjsonresponse.getLastPlayedApp();
        if (obj1 != null)
        {
            contentvalues.putAll(((FastContentValuesJsonResponse) (obj1)).mValues);
            int i;
            if (PanoUtils.isPano(((android.content.Context) (obj))))
            {
                i = 0x7f0c00da;
            } else
            {
                i = 0x7f0c00d9;
            }
            PostProcessorHelper.convertImageUrl(((android.content.Context) (obj)), contentvalues, "most_recent_game_icon_url", 0x7f0c00db);
            PostProcessorHelper.convertImageUrl(((android.content.Context) (obj)), contentvalues, "most_recent_game_icon_url", "most_recent_game_hi_res_url", i);
            PostProcessorHelper.convertImageUrlMaxWidth(((android.content.Context) (obj)), contentvalues, "most_recent_game_featured_url");
        }
        obj = fastjsonresponse.getProfileSettings();
        if (obj != null)
        {
            contentvalues.put("is_profile_visible", ((ProfileSettings) (obj)).isProfileVisible());
        }
        contentvalues.put("last_updated", Long.valueOf(System.currentTimeMillis()));
        return fastjsonresponse;
    }
}
