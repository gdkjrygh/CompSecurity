// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.server.postprocessor;

import android.content.ContentValues;
import com.google.android.gms.common.app.GmsApplicationContext;
import com.google.android.gms.common.server.response.FastContentValuesJsonResponse;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.common.server.response.PostProcessor;
import com.google.android.gms.games.server.api.Quest;

// Referenced classes of package com.google.android.gms.games.server.postprocessor:
//            PostProcessorHelper

public final class QuestPostProcessor
    implements PostProcessor
{

    public QuestPostProcessor()
    {
    }

    public final volatile FastJsonResponse postProcess(FastJsonResponse fastjsonresponse)
    {
        fastjsonresponse = (Quest)fastjsonresponse;
        GmsApplicationContext gmsapplicationcontext = GmsApplicationContext.getInstance();
        ContentValues contentvalues = ((FastContentValuesJsonResponse) (fastjsonresponse)).mValues;
        PostProcessorHelper.convertImageUrl(gmsapplicationcontext, contentvalues, "quest_banner_image_url", 0x7f0c00e0);
        PostProcessorHelper.convertImageUrl(gmsapplicationcontext, contentvalues, "quest_icon_image_url", 0x7f0c00e1);
        contentvalues.put("quest_type", Integer.valueOf(1));
        if (contentvalues.get("accepted_ts") == null)
        {
            contentvalues.put("accepted_ts", Long.valueOf(-1L));
        }
        if (contentvalues.get("notification_ts") == null)
        {
            contentvalues.put("notification_ts", Long.valueOf(-1L));
        }
        return fastjsonresponse;
    }
}
