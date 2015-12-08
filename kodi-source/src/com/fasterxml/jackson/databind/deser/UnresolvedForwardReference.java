// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.fasterxml.jackson.databind.deser:
//            UnresolvedId

public final class UnresolvedForwardReference extends JsonMappingException
{

    private ReadableObjectId _roid;
    private List _unresolvedIds;

    public UnresolvedForwardReference(String s)
    {
        super(s);
        _unresolvedIds = new ArrayList();
    }

    public UnresolvedForwardReference(String s, JsonLocation jsonlocation, ReadableObjectId readableobjectid)
    {
        super(s, jsonlocation);
        _roid = readableobjectid;
    }

    public void addUnresolvedId(Object obj, Class class1, JsonLocation jsonlocation)
    {
        _unresolvedIds.add(new UnresolvedId(obj, class1, jsonlocation));
    }

    public String getMessage()
    {
        Object obj = super.getMessage();
        if (_unresolvedIds == null)
        {
            return ((String) (obj));
        }
        obj = new StringBuilder(((String) (obj)));
        Iterator iterator = _unresolvedIds.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ((StringBuilder) (obj)).append(((UnresolvedId)iterator.next()).toString());
            if (iterator.hasNext())
            {
                ((StringBuilder) (obj)).append(", ");
            }
        } while (true);
        ((StringBuilder) (obj)).append('.');
        return ((StringBuilder) (obj)).toString();
    }

    public ReadableObjectId getRoid()
    {
        return _roid;
    }

    public Object getUnresolvedId()
    {
        return _roid.getKey().key;
    }
}
