// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;

import java.io.Serializable;

// Referenced classes of package com.google.common.base:
//            Preconditions

public abstract class Optional
    implements Serializable
{

    private Optional()
    {
    }

    Optional(_cls1 _pcls1)
    {
        this();
    }

    public static Optional absent()
    {
        return Absent.INSTANCE;
    }

    public static Optional fromNullable(Object obj)
    {
        if (obj == null)
        {
            return absent();
        } else
        {
            return new Present(obj);
        }
    }

    public static Optional of(Object obj)
    {
        return new Present(Preconditions.checkNotNull(obj));
    }

    public abstract Object get();

    public abstract boolean isPresent();

    public abstract Object or(Object obj);

    public abstract Object orNull();

    public abstract String toString();

    private class Absent extends Optional
    {

        private static final Absent INSTANCE = new Absent();

        public boolean equals(Object obj)
        {
            return obj == this;
        }

        public Object get()
        {
            throw new IllegalStateException("value is absent");
        }

        public int hashCode()
        {
            return 0x598df91c;
        }

        public boolean isPresent()
        {
            return false;
        }

        public Object or(Object obj)
        {
            return Preconditions.checkNotNull(obj, "use orNull() instead of or(null)");
        }

        public Object orNull()
        {
            return null;
        }

        public String toString()
        {
            return "Optional.absent()";
        }



        private Absent()
        {
            super(null);
        }
    }


    private class Present extends Optional
    {

        private final Object reference;

        public boolean equals(Object obj)
        {
            if (obj instanceof Present)
            {
                obj = (Present)obj;
                return reference.equals(((Present) (obj)).reference);
            } else
            {
                return false;
            }
        }

        public Object get()
        {
            return reference;
        }

        public int hashCode()
        {
            return 0x598df91c + reference.hashCode();
        }

        public boolean isPresent()
        {
            return true;
        }

        public Object or(Object obj)
        {
            Preconditions.checkNotNull(obj, "use orNull() instead of or(null)");
            return reference;
        }

        public Object orNull()
        {
            return reference;
        }

        public String toString()
        {
            return (new StringBuilder()).append("Optional.of(").append(reference).append(")").toString();
        }

        Present(Object obj)
        {
            super(null);
            reference = obj;
        }
    }

}
