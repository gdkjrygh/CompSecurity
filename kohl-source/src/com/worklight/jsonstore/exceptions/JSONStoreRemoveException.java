// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.jsonstore.exceptions;

import java.util.LinkedList;
import java.util.List;

// Referenced classes of package com.worklight.jsonstore.exceptions:
//            JSONStoreException

public class JSONStoreRemoveException extends JSONStoreException
{

    private static final long serialVersionUID = 0xbf93e2fc76e7670eL;
    private List failures;

    public JSONStoreRemoveException(String s)
    {
        super(s);
        failures = new LinkedList();
    }

    public JSONStoreRemoveException(String s, Throwable throwable)
    {
        super(s, throwable);
    }

    public JSONStoreRemoveException(String s, List list)
    {
        super(s);
        failures = list;
    }

    public JSONStoreRemoveException(Throwable throwable)
    {
        super(throwable);
    }

    public List getFailedObjects()
    {
        return failures;
    }
}
