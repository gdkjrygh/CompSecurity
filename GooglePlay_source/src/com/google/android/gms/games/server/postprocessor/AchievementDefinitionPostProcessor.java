// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.server.postprocessor;

import com.google.android.gms.common.app.GmsApplicationContext;
import com.google.android.gms.common.server.response.FastContentValuesJsonResponse;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.common.server.response.PostProcessor;
import com.google.android.gms.games.server.api.AchievementDefinition;
import com.google.android.gms.games.util.PanoUtils;

// Referenced classes of package com.google.android.gms.games.server.postprocessor:
//            PostProcessorHelper

public final class AchievementDefinitionPostProcessor
    implements PostProcessor
{

    public AchievementDefinitionPostProcessor()
    {
    }

    public final volatile FastJsonResponse postProcess(FastJsonResponse fastjsonresponse)
    {
        fastjsonresponse = (AchievementDefinition)fastjsonresponse;
        GmsApplicationContext gmsapplicationcontext = GmsApplicationContext.getInstance();
        android.content.ContentValues contentvalues = ((FastContentValuesJsonResponse) (fastjsonresponse)).mValues;
        int i;
        if (PanoUtils.isPano(gmsapplicationcontext))
        {
            i = 0x7f0c00d6;
        } else
        {
            i = 0x7f0c00d5;
        }
        PostProcessorHelper.convertImageUrlStripDefault(gmsapplicationcontext, contentvalues, "is_revealed_icon_default", "revealed_icon_image_url", i);
        PostProcessorHelper.convertImageUrlStripDefault(gmsapplicationcontext, contentvalues, "is_unlocked_icon_default", "unlocked_icon_image_url", i);
        return fastjsonresponse;
    }
}
