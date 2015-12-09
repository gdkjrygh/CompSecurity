// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.uploader.client;

import com.google.common.base.Preconditions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class HttpHeaders
{

    private Map headers;

    public HttpHeaders()
    {
        headers = new HashMap();
    }

    public final void add(String s, String s1)
    {
        s = s.toLowerCase();
        if (!headers.containsKey(s))
        {
            headers.put(s, new ArrayList());
        }
        ((List)headers.get(s)).add(s1);
    }

    public final Set getHeaderNames()
    {
        return Collections.unmodifiableSet(headers.keySet());
    }

    public final List getHeaderValues(String s)
    {
        return (List)headers.get(s.toLowerCase());
    }

    public final String getHeaderValuesAsString(String s)
    {
        if (!headers.containsKey(s.toLowerCase()))
        {
            return null;
        }
        StringBuilder stringbuilder = new StringBuilder();
        boolean flag = true;
        s = ((List)headers.get(s.toLowerCase())).iterator();
        do
        {
            if (!s.hasNext())
            {
                break;
            }
            String s1 = (String)s.next();
            if (s1 != null)
            {
                if (!flag)
                {
                    stringbuilder.append(",");
                }
                flag = false;
                stringbuilder.append(s1);
            }
        } while (true);
        return stringbuilder.toString();
    }

    public final void set(String s, String s1)
    {
        boolean flag;
        if (s != null && !s.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        Preconditions.checkNotNull(s1);
        s = s.toLowerCase();
        headers.put(s, new ArrayList());
        ((List)headers.get(s)).add(s1);
    }
}
