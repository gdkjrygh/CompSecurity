// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http.params;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

// Referenced classes of package org.apache.http.params:
//            AbstractHttpParams, HttpParams

public class BasicHttpParams extends AbstractHttpParams
    implements Serializable, Cloneable
{

    private final Map parameters = new ConcurrentHashMap();

    public BasicHttpParams()
    {
    }

    public Object clone()
    {
        BasicHttpParams basichttpparams = (BasicHttpParams)super.clone();
        copyParams(basichttpparams);
        return basichttpparams;
    }

    public void copyParams(HttpParams httpparams)
    {
        java.util.Map.Entry entry;
        for (Iterator iterator = parameters.entrySet().iterator(); iterator.hasNext(); httpparams.setParameter((String)entry.getKey(), entry.getValue()))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

    }

    public HttpParams setParameter(String s, Object obj)
    {
        if (s == null)
        {
            return this;
        }
        if (obj != null)
        {
            parameters.put(s, obj);
            return this;
        } else
        {
            parameters.remove(s);
            return this;
        }
    }
}
