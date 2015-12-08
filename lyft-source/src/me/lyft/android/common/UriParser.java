// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.common;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class UriParser
{

    private static final String ENCODING = "UTF-8";

    public UriParser()
    {
    }

    public static Map parseParams(String s)
    {
        s = s.split("\\?");
        if (s.length > 1) goto _L2; else goto _L1
_L1:
        s = Collections.emptyMap();
_L4:
        return s;
_L2:
        HashMap hashmap;
        String as[];
        int i;
        int j;
        as = s[1].split("&");
        hashmap = new HashMap(as.length);
        j = as.length;
        i = 0;
_L7:
        s = hashmap;
        if (i >= j) goto _L4; else goto _L3
_L3:
        s = as[i];
        String s1;
        s = s.split("=");
        s1 = URLDecoder.decode(s[0], "UTF-8");
        if (s.length <= 1) goto _L6; else goto _L5
_L5:
        s = URLDecoder.decode(s[1], "UTF-8");
_L8:
        hashmap.put(s1, s);
_L9:
        i++;
          goto _L7
_L6:
        s = null;
          goto _L8
        s;
          goto _L9
    }
}
