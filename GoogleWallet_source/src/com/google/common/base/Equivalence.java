// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;

import java.io.Serializable;

public abstract class Equivalence
{
    static final class Equals extends Equivalence
        implements Serializable
    {

        static final Equals INSTANCE = new Equals();

        protected final boolean doEquivalent(Object obj, Object obj1)
        {
            return obj.equals(obj1);
        }

        public final int doHash(Object obj)
        {
            return obj.hashCode();
        }


        Equals()
        {
        }
    }

    static final class Identity extends Equivalence
        implements Serializable
    {

        static final Identity INSTANCE = new Identity();

        protected final boolean doEquivalent(Object obj, Object obj1)
        {
            return false;
        }

        protected final int doHash(Object obj)
        {
            return System.identityHashCode(obj);
        }


        Identity()
        {
        }
    }


    protected Equivalence()
    {
    }

    public static Equivalence equals()
    {
        return Equals.INSTANCE;
    }

    public static Equivalence identity()
    {
        return Identity.INSTANCE;
    }

    protected abstract boolean doEquivalent(Object obj, Object obj1);

    protected abstract int doHash(Object obj);

    public final boolean equivalent(Object obj, Object obj1)
    {
        if (obj == obj1)
        {
            return true;
        }
        if (obj == null || obj1 == null)
        {
            return false;
        } else
        {
            return doEquivalent(obj, obj1);
        }
    }

    public final int hash(Object obj)
    {
        if (obj == null)
        {
            return 0;
        } else
        {
            return doHash(obj);
        }
    }
}
