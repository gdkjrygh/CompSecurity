// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.cfg;


public abstract class ContextAttributes
{

    public ContextAttributes()
    {
    }

    public static ContextAttributes getEmpty()
    {
        return Impl.getEmpty();
    }

    private class Impl extends ContextAttributes
        implements Serializable
    {

        protected static final Impl EMPTY = new Impl(Collections.emptyMap());
        protected static final Object NULL_SURROGATE = new Object();
        private static final long serialVersionUID = 1L;
        protected transient Map _nonShared;
        protected final Map _shared;

        public static ContextAttributes getEmpty()
        {
            return EMPTY;
        }


        protected Impl(Map map)
        {
            _shared = map;
            _nonShared = null;
        }
    }

}
