// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.cfg;

import java.io.Serializable;
import java.util.Collections;
import java.util.Map;

public abstract class ContextAttributes
{
    public static class Impl extends ContextAttributes
        implements Serializable
    {

        protected static final Impl EMPTY = new Impl(Collections.emptyMap());
        protected static final Object NULL_SURROGATE = new Object();
        protected transient Map _nonShared;
        protected final Map _shared;

        public static ContextAttributes getEmpty()
        {
            return EMPTY;
        }

        public Object getAttribute(Object obj)
        {
            if (_nonShared != null)
            {
                Object obj1 = _nonShared.get(obj);
                if (obj1 != null)
                {
                    obj = obj1;
                    if (obj1 == NULL_SURROGATE)
                    {
                        obj = null;
                    }
                    return obj;
                }
            }
            return _shared.get(obj);
        }


        protected Impl(Map map)
        {
            _shared = map;
            _nonShared = null;
        }
    }


    public ContextAttributes()
    {
    }

    public static ContextAttributes getEmpty()
    {
        return Impl.getEmpty();
    }

    public abstract Object getAttribute(Object obj);
}
