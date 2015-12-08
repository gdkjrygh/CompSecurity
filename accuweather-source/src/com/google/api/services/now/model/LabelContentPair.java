// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.services.now.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.GenericData;

// Referenced classes of package com.google.api.services.now.model:
//            TemplatedString

public final class LabelContentPair extends GenericJson
{

    private TemplatedString content;
    private TemplatedString label;

    public LabelContentPair()
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

    public LabelContentPair clone()
    {
        return (LabelContentPair)super.clone();
    }

    public volatile Object clone()
        throws CloneNotSupportedException
    {
        return clone();
    }

    public TemplatedString getContent()
    {
        return content;
    }

    public TemplatedString getLabel()
    {
        return label;
    }

    public volatile GenericJson set(String s, Object obj)
    {
        return set(s, obj);
    }

    public volatile GenericData set(String s, Object obj)
    {
        return set(s, obj);
    }

    public LabelContentPair set(String s, Object obj)
    {
        return (LabelContentPair)super.set(s, obj);
    }

    public LabelContentPair setContent(TemplatedString templatedstring)
    {
        content = templatedstring;
        return this;
    }

    public LabelContentPair setLabel(TemplatedString templatedstring)
    {
        label = templatedstring;
        return this;
    }
}
