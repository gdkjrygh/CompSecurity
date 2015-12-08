// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.cfg;

import java.io.Serializable;
import java.util.Collections;
import java.util.Map;

// Referenced classes of package com.fasterxml.jackson.databind.cfg:
//            ContextAttributes

public class _nonShared extends ContextAttributes
    implements Serializable
{

    protected static final EMPTY EMPTY = new <init>(Collections.emptyMap());
    protected static final Object NULL_SURROGATE = new Object();
    private static final long serialVersionUID = 1L;
    protected transient Map _nonShared;
    protected final Map _shared;

    public static ContextAttributes getEmpty()
    {
        return EMPTY;
    }


    protected (Map map)
    {
        _shared = map;
        _nonShared = null;
    }
}
