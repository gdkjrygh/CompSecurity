// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dropbox.client2.exception;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public class userError
{

    public String error;
    public Map fields;
    public String userError;

    public (Map map)
    {
        fields = map;
        Object obj = map.get("error");
        if (obj instanceof String)
        {
            error = (String)obj;
        } else
        if (obj instanceof Map)
        {
            obj = ((Map)obj).values().iterator();
            while (((Iterator) (obj)).hasNext()) 
            {
                Object obj1 = ((Iterator) (obj)).next();
                if (obj1 instanceof String)
                {
                    error = (String)obj1;
                }
            }
        }
        map = ((Map) (map.get("user_error")));
        if (map instanceof String)
        {
            userError = (String)map;
        }
    }
}
