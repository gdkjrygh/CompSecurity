// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api;

import com.android.volley.toolbox.ImageRequest;
import java.util.Map;

// Referenced classes of package com.pinterest.api:
//            ApiHttpClient

final class er extends ImageRequest
{

    final String a;

    public final Map getHeaders()
    {
        return ApiHttpClient.getRequestHeaders(a);
    }

    istener(String s, com.android.volley.r r, com.android.volley.stener stener, String s1)
    {
        a = s1;
        super(s, r, 0, 0, null, stener);
    }
}
