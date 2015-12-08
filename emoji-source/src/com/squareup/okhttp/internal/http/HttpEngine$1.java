// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.internal.Util;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.CacheResponse;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.squareup.okhttp.internal.http:
//            HttpEngine

static final class  extends CacheResponse
{

    public InputStream getBody()
        throws IOException
    {
        return new ByteArrayInputStream(Util.EMPTY_BYTE_ARRAY);
    }

    public Map getHeaders()
        throws IOException
    {
        HashMap hashmap = new HashMap();
        hashmap.put(null, Collections.singletonList("HTTP/1.1 504 Gateway Timeout"));
        return hashmap;
    }

    ()
    {
    }
}
