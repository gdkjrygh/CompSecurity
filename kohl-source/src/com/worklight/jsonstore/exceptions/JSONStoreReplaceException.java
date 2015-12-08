// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.jsonstore.exceptions;

import java.util.LinkedList;
import java.util.List;

// Referenced classes of package com.worklight.jsonstore.exceptions:
//            JSONStoreException

public class JSONStoreReplaceException extends JSONStoreException
{

    private static final long serialVersionUID = 0xbc39e042f49301dL;
    private List failures;

    public JSONStoreReplaceException(String s)
    {
        super(s);
        failures = new LinkedList();
    }

    public JSONStoreReplaceException(String s, List list)
    {
        super(s);
        failures = list;
    }

    public List getFailedObjects()
    {
        return failures;
    }
}
