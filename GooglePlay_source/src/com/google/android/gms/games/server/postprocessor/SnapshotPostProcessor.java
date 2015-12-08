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
import com.google.android.gms.games.server.api.Snapshot;
import java.util.HashMap;

// Referenced classes of package com.google.android.gms.games.server.postprocessor:
//            PostProcessorHelper

public final class SnapshotPostProcessor
    implements PostProcessor
{

    public SnapshotPostProcessor()
    {
    }

    public final volatile FastJsonResponse postProcess(FastJsonResponse fastjsonresponse)
    {
        fastjsonresponse = (Snapshot)fastjsonresponse;
        GmsApplicationContext gmsapplicationcontext = GmsApplicationContext.getInstance();
        ContentValues contentvalues = ((FastContentValuesJsonResponse) (fastjsonresponse)).mValues;
        if (contentvalues.containsKey("drive_resource_id_string"))
        {
            contentvalues.putNull("drive_resolved_id_string");
        }
        com.google.android.gms.games.server.api.SnapshotImage snapshotimage = fastjsonresponse.getCoverImage();
        if (snapshotimage != null)
        {
            contentvalues.put("cover_icon_image_height", (Integer)((FastMapJsonResponse) (snapshotimage)).mValues.get("height"));
            contentvalues.put("cover_icon_image_width", (Integer)((FastMapJsonResponse) (snapshotimage)).mValues.get("width"));
            contentvalues.put("cover_icon_image_url", PostProcessorHelper.getMaxWidthImageUrl(gmsapplicationcontext, (String)((FastMapJsonResponse) (snapshotimage)).mValues.get("url")));
        }
        return fastjsonresponse;
    }
}
