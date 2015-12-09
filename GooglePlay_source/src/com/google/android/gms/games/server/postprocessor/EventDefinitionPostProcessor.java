// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.server.postprocessor;

import com.google.android.gms.common.app.GmsApplicationContext;
import com.google.android.gms.common.server.response.FastContentValuesJsonResponse;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.common.server.response.PostProcessor;
import com.google.android.gms.games.server.api.EventDefinition;

// Referenced classes of package com.google.android.gms.games.server.postprocessor:
//            PostProcessorHelper

public final class EventDefinitionPostProcessor
    implements PostProcessor
{

    public EventDefinitionPostProcessor()
    {
    }

    public final volatile FastJsonResponse postProcess(FastJsonResponse fastjsonresponse)
    {
        fastjsonresponse = (EventDefinition)fastjsonresponse;
        PostProcessorHelper.convertImageUrlStripDefault(GmsApplicationContext.getInstance(), ((FastContentValuesJsonResponse) (fastjsonresponse)).mValues, "icon_default", "icon_image_url", 0x7f0c00d8);
        return fastjsonresponse;
    }
}
