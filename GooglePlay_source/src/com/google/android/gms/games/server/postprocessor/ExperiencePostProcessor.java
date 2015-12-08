// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.server.postprocessor;

import android.content.ContentValues;
import com.google.android.gms.common.server.response.FastContentValuesJsonResponse;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.common.server.response.PostProcessor;
import com.google.android.gms.games.server.api.Experience;
import com.google.android.gms.games.server.api.PlayerLevel;

public final class ExperiencePostProcessor
    implements PostProcessor
{

    public ExperiencePostProcessor()
    {
    }

    public final volatile FastJsonResponse postProcess(FastJsonResponse fastjsonresponse)
    {
        fastjsonresponse = (Experience)fastjsonresponse;
        ContentValues contentvalues = ((FastContentValuesJsonResponse) (fastjsonresponse)).mValues;
        PlayerLevel playerlevel = fastjsonresponse.getNewLevel();
        if (playerlevel != null)
        {
            contentvalues.put("newLevel", Integer.valueOf(playerlevel.getLevel().intValue()));
            return fastjsonresponse;
        } else
        {
            contentvalues.put("newLevel", Integer.valueOf(-1));
            return fastjsonresponse;
        }
    }
}
