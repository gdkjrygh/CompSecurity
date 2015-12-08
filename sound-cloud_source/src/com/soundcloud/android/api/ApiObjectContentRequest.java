// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api;

import android.net.Uri;
import com.soundcloud.java.collections.MultiMap;
import java.util.Map;

// Referenced classes of package com.soundcloud.android.api:
//            ApiRequest

public class ApiObjectContentRequest extends ApiRequest
{

    private final Object content;

    ApiObjectContentRequest(Uri uri, String s, int i, Boolean boolean1, MultiMap multimap, Map map, Object obj)
    {
        super(uri, s, i, boolean1, multimap, map);
        content = obj;
    }

    public Object getContent()
    {
        return content;
    }

    public String getContentType()
    {
        return getAcceptMediaType();
    }
}
