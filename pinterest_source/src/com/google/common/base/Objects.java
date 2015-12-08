// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;

import java.util.Arrays;

// Referenced classes of package com.google.common.base:
//            MoreObjects

public final class Objects
{

    private Objects()
    {
    }

    public static boolean equal(Object obj, Object obj1)
    {
        return obj == obj1 || obj != null && obj.equals(obj1);
    }

    public static Object firstNonNull(Object obj, Object obj1)
    {
        return MoreObjects.firstNonNull(obj, obj1);
    }

    public static transient int hashCode(Object aobj[])
    {
        return Arrays.hashCode(aobj);
    }

    public static ToStringHelper toStringHelper(Class class1)
    {
        return new ToStringHelper(MoreObjects.simpleName(class1), null);
    }

    public static ToStringHelper toStringHelper(Object obj)
    {
        return new ToStringHelper(MoreObjects.simpleName(obj.getClass()), null);
    }

    public static ToStringHelper toStringHelper(String s)
    {
        return new ToStringHelper(s, null);
    }

    private class ToStringHelper
    {

        private final String className;
        private ValueHolder holderHead;
        private ValueHolder holderTail;
        private boolean omitNullValues;

        private ValueHolder addHolder()
        {
            ValueHolder valueholder = new ValueHolder(null);
            holderTail.next = valueholder;
            holderTail = valueholder;
            return valueholder;
        }

        private ToStringHelper addHolder(Object obj)
        {
            addHolder().value = obj;
            return this;
        }

        private ToStringHelper addHolder(String s, Object obj)
        {
            ValueHolder valueholder = addHolder();
            valueholder.value = obj;
            valueholder.name = (String)Preconditions.checkNotNull(s);
            return this;
        }

        public final ToStringHelper add(String s, char c)
        {
            return addHolder(s, String.valueOf(c));
        }

        public final ToStringHelper add(String s, double d)
        {
            return addHolder(s, String.valueOf(d));
        }

        public final ToStringHelper add(String s, float f)
        {
            return addHolder(s, String.valueOf(f));
        }

        public final ToStringHelper add(String s, int i)
        {
            return addHolder(s, String.valueOf(i));
        }

        public final ToStringHelper add(String s, long l)
        {
            return addHolder(s, String.valueOf(l));
        }

        public final ToStringHelper add(String s, Object obj)
        {
            return addHolder(s, obj);
        }

        public final ToStringHelper add(String s, boolean flag)
        {
            return addHolder(s, String.valueOf(flag));
        }

        public final ToStringHelper addValue(char c)
        {
            return addHolder(String.valueOf(c));
        }

        public final ToStringHelper addValue(double d)
        {
            return addHolder(String.valueOf(d));
        }

        public final ToStringHelper addValue(float f)
        {
            return addHolder(String.valueOf(f));
        }

        public final ToStringHelper addValue(int i)
        {
            return addHolder(String.valueOf(i));
        }

        public final ToStringHelper addValue(long l)
        {
            return addHolder(String.valueOf(l));
        }

        public final ToStringHelper addValue(Object obj)
        {
            return addHolder(obj);
        }

        public final ToStringHelper addValue(boolean flag)
        {
            return addHolder(String.valueOf(flag));
        }

        public final ToStringHelper omitNullValues()
        {
            omitNullValues = true;
            return this;
        }

        public final String toString()
        {
            boolean flag = omitNullValues;
            StringBuilder stringbuilder = (new StringBuilder(32)).append(className).append('{');
            ValueHolder valueholder = holderHead.next;
            String s1;
            for (String s = ""; valueholder != null; s = s1)
            {
label0:
                {
                    if (flag)
                    {
                        s1 = s;
                        if (valueholder.value == null)
                        {
                            break label0;
                        }
                    }
                    stringbuilder.append(s);
                    s1 = ", ";
                    if (valueholder.name != null)
                    {
                        stringbuilder.append(valueholder.name).append('=');
                    }
                    stringbuilder.append(valueholder.value);
                }
                valueholder = valueholder.next;
            }

            return stringbuilder.append('}').toString();
        }

        private ToStringHelper(String s)
        {
        /* block-local class not found */
        class ValueHolder {}

            holderHead = new ValueHolder(null);
            holderTail = holderHead;
            omitNullValues = false;
            className = (String)Preconditions.checkNotNull(s);
        }

        ToStringHelper(String s, _cls1 _pcls1)
        {
            this(s);
        }
    }

}
