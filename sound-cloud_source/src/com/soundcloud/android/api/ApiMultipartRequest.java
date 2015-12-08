// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api;

import android.net.Uri;
import com.soundcloud.java.collections.MultiMap;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.soundcloud.android.api:
//            ApiRequest

public class ApiMultipartRequest extends ApiRequest
{

    private final List parts;
    private final ApiRequest.ProgressListener progressListener;

    ApiMultipartRequest(Uri uri, String s, int i, Boolean boolean1, MultiMap multimap, Map map, List list, 
            ApiRequest.ProgressListener progresslistener)
    {
        super(uri, s, i, boolean1, multimap, map);
        parts = list;
        progressListener = progresslistener;
    }

    public List getParts()
    {
        return parts;
    }

    public ApiRequest.ProgressListener getProgressListener()
    {
        return progressListener;
    }

    boolean hasProgressListener()
    {
        return progressListener != null;
    }
}
