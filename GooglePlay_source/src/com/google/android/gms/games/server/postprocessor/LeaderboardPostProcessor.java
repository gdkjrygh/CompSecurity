// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.server.postprocessor;

import com.google.android.gms.common.app.GmsApplicationContext;
import com.google.android.gms.common.server.response.FastContentValuesJsonResponse;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.common.server.response.PostProcessor;
import com.google.android.gms.games.server.api.Leaderboard;
import com.google.android.gms.games.util.PanoUtils;

// Referenced classes of package com.google.android.gms.games.server.postprocessor:
//            PostProcessorHelper

public final class LeaderboardPostProcessor
    implements PostProcessor
{

    public LeaderboardPostProcessor()
    {
    }

    public final volatile FastJsonResponse postProcess(FastJsonResponse fastjsonresponse)
    {
        fastjsonresponse = (Leaderboard)fastjsonresponse;
        GmsApplicationContext gmsapplicationcontext = GmsApplicationContext.getInstance();
        android.content.ContentValues contentvalues = ((FastContentValuesJsonResponse) (fastjsonresponse)).mValues;
        int i;
        if (PanoUtils.isPano(gmsapplicationcontext))
        {
            i = 0x7f0c00dd;
        } else
        {
            i = 0x7f0c00dc;
        }
        PostProcessorHelper.convertImageUrlStripDefault(gmsapplicationcontext, contentvalues, "is_board_icon_default", "board_icon_image_url", i);
        return fastjsonresponse;
    }
}
