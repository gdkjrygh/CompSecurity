// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.server.postprocessor;

import android.content.ContentValues;
import android.support.v4.util.ArrayMap;
import com.google.android.gms.common.server.response.FastContentValuesJsonResponse;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.common.server.response.PostProcessor;
import com.google.android.gms.games.server.api.Application;
import java.util.Iterator;
import java.util.Set;

public final class ApplicationPostProcessor
    implements PostProcessor
{

    private static final ArrayMap REQUIRED_FEATURE_FIELDS;

    public ApplicationPostProcessor()
    {
    }

    public final volatile FastJsonResponse postProcess(FastJsonResponse fastjsonresponse)
    {
        fastjsonresponse = (Application)fastjsonresponse;
        ContentValues contentvalues = ((FastContentValuesJsonResponse) (fastjsonresponse)).mValues;
        String s1;
        for (Iterator iterator = REQUIRED_FEATURE_FIELDS.keySet().iterator(); iterator.hasNext(); contentvalues.put((String)REQUIRED_FEATURE_FIELDS.get(s1), Boolean.valueOf(false)))
        {
            s1 = (String)iterator.next();
        }

        String s = ((FastContentValuesJsonResponse) (fastjsonresponse)).mValues.getAsString("enabledFeatures");
        if (s != null)
        {
            String as[] = s.split(",");
            for (int i = 0; i < as.length; i++)
            {
                if (as[i].equals("SNAPSHOTS"))
                {
                    contentvalues.put("snapshots_enabled", Boolean.valueOf(true));
                }
            }

        }
        return fastjsonresponse;
    }

    static 
    {
        ArrayMap arraymap = new ArrayMap();
        REQUIRED_FEATURE_FIELDS = arraymap;
        arraymap.put("SNAPSHOTS", "snapshots_enabled");
    }
}
