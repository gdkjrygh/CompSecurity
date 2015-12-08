// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.server.api;

import android.content.ContentValues;
import com.google.android.gms.common.server.response.FastContentValuesJsonResponse;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.common.server.response.PostProcessor;
import com.google.android.gms.games.server.postprocessor.SnapshotPostProcessor;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

// Referenced classes of package com.google.android.gms.games.server.api:
//            SnapshotImage

public final class Snapshot extends FastContentValuesJsonResponse
{

    private static final SnapshotPostProcessor PROCESSOR = new SnapshotPostProcessor();
    private static final TreeMap sFields;
    private final HashMap mConcreteTypes = new HashMap();

    public Snapshot()
    {
    }

    public final void addConcreteType(String s, FastJsonResponse fastjsonresponse)
    {
        mConcreteTypes.put(s, fastjsonresponse);
    }

    public final SnapshotImage getCoverImage()
    {
        return (SnapshotImage)mConcreteTypes.get("coverImage");
    }

    public final Map getFieldMappings()
    {
        return sFields;
    }

    public final String getId()
    {
        return (String)super.mValues.get("external_snapshot_id");
    }

    public final volatile PostProcessor getPostProcessor()
    {
        return PROCESSOR;
    }

    protected final boolean isConcreteTypeFieldSet(String s)
    {
        return mConcreteTypes.containsKey(s);
    }

    static 
    {
        TreeMap treemap = new TreeMap();
        sFields = treemap;
        treemap.put("applicationId", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("game_id"));
        sFields.put("coverImage", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("coverImage", com/google/android/gms/games/server/api/SnapshotImage));
        sFields.put("description", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("description"));
        sFields.put("driveId", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("drive_resource_id_string"));
        sFields.put("durationMillis", com.google.android.gms.common.server.response.FastJsonResponse.Field.forLong("duration"));
        sFields.put("id", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("external_snapshot_id"));
        sFields.put("lastModifiedMillis", com.google.android.gms.common.server.response.FastJsonResponse.Field.forLong("last_modified_timestamp"));
        sFields.put("progressValue", com.google.android.gms.common.server.response.FastJsonResponse.Field.forLong("progress_value"));
        sFields.put("title", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("title"));
        sFields.put("uniqueName", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("unique_name"));
    }
}
