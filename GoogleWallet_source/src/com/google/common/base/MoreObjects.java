// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;


// Referenced classes of package com.google.common.base:
//            Preconditions

public final class MoreObjects
{
    public static final class ToStringHelper
    {

        private final String className;
        private ValueHolder holderHead;
        private ValueHolder holderTail;
        private boolean omitNullValues;

        private ValueHolder addHolder()
        {
            ValueHolder valueholder = new ValueHolder();
            holderTail.next = valueholder;
            holderTail = valueholder;
            return valueholder;
        }

        private ToStringHelper addHolder(String s, Object obj)
        {
            ValueHolder valueholder = addHolder();
            valueholder.value = obj;
            valueholder.name = (String)Preconditions.checkNotNull(s);
            return this;
        }

        public final ToStringHelper add(String s, Object obj)
        {
            return addHolder(s, obj);
        }

        public final ToStringHelper add(String s, boolean flag)
        {
            return addHolder(s, String.valueOf(flag));
        }

        public final String toString()
        {
            boolean flag = omitNullValues;
            String s = "";
            StringBuilder stringbuilder = (new StringBuilder(32)).append(className).append('{');
            for (ValueHolder valueholder = holderHead.next; valueholder != null;)
            {
                String s1;
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
                s = s1;
            }

            return stringbuilder.append('}').toString();
        }

        private ToStringHelper(String s)
        {
            holderHead = new ValueHolder();
            holderTail = holderHead;
            omitNullValues = false;
            className = (String)Preconditions.checkNotNull(s);
        }

    }

    static final class ToStringHelper.ValueHolder
    {

        String name;
        ToStringHelper.ValueHolder next;
        Object value;

        private ToStringHelper.ValueHolder()
        {
        }

    }


    public static ToStringHelper toStringHelper(Class class1)
    {
        return new ToStringHelper(class1.getSimpleName());
    }
}
