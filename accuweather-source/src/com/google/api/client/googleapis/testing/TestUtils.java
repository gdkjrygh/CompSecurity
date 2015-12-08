// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.googleapis.testing;

import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class TestUtils
{

    private static final String UTF_8 = "UTF-8";

    private TestUtils()
    {
    }

    public static Map parseQuery(String s)
        throws IOException
    {
        HashMap hashmap = new HashMap();
        Object obj;
        for (s = Splitter.on('&').split(s).iterator(); s.hasNext(); hashmap.put(URLDecoder.decode((String)((List) (obj)).get(0), "UTF-8"), URLDecoder.decode((String)((List) (obj)).get(1), "UTF-8")))
        {
            obj = (String)s.next();
            obj = Lists.newArrayList(Splitter.on('=').split(((CharSequence) (obj))));
            if (((List) (obj)).size() != 2)
            {
                throw new IOException("Invalid Query String");
            }
        }

        return hashmap;
    }
}
