// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.services.now.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.GenericData;

// Referenced classes of package com.google.api.services.now.model:
//            Timestamp

public final class TemplatedStringParameter extends GenericJson
{

    private Timestamp timestamp;
    private String type;

    public TemplatedStringParameter()
    {
    }

    public volatile GenericJson clone()
    {
        return clone();
    }

    public volatile GenericData clone()
    {
        return clone();
    }

    public TemplatedStringParameter clone()
    {
        return (TemplatedStringParameter)super.clone();
    }

    public volatile Object clone()
        throws CloneNotSupportedException
    {
        return clone();
    }

    public Timestamp getTimestamp()
    {
        return timestamp;
    }

    public String getType()
    {
        return type;
    }

    public volatile GenericJson set(String s, Object obj)
    {
        return set(s, obj);
    }

    public volatile GenericData set(String s, Object obj)
    {
        return set(s, obj);
    }

    public TemplatedStringParameter set(String s, Object obj)
    {
        return (TemplatedStringParameter)super.set(s, obj);
    }

    public TemplatedStringParameter setTimestamp(Timestamp timestamp1)
    {
        timestamp = timestamp1;
        return this;
    }

    public TemplatedStringParameter setType(String s)
    {
        type = s;
        return this;
    }
}
