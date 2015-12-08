// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.repackaged.com.google.common.base;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

// Referenced classes of package com.google.api.client.repackaged.com.google.common.base:
//            Objects, Preconditions

public static final class <init>
{
    private static final class ValueHolder
    {

        final StringBuilder builder;
        boolean isNull;

        private ValueHolder()
        {
            builder = new StringBuilder();
        }

        ValueHolder(Objects._cls1 _pcls1)
        {
            this();
        }
    }


    private final String className;
    private boolean omitNullValues;
    private final List valueHolders;

    private ValueHolder addHolder()
    {
        ValueHolder valueholder = new ValueHolder(null);
        valueHolders.add(valueholder);
        return valueholder;
    }

    private ValueHolder addHolder(Object obj)
    {
        ValueHolder valueholder = addHolder();
        boolean flag;
        if (obj == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        valueholder.isNull = flag;
        return valueholder;
    }

    private StringBuilder checkNameAndAppend(String s)
    {
        Preconditions.checkNotNull(s);
        return addHolder().builder.append(s).append('=');
    }

    public ValueHolder.builder add(String s, char c)
    {
        checkNameAndAppend(s).append(c);
        return this;
    }

    public checkNameAndAppend add(String s, double d)
    {
        checkNameAndAppend(s).append(d);
        return this;
    }

    public checkNameAndAppend add(String s, float f)
    {
        checkNameAndAppend(s).append(f);
        return this;
    }

    public checkNameAndAppend add(String s, int i)
    {
        checkNameAndAppend(s).append(i);
        return this;
    }

    public checkNameAndAppend add(String s, long l)
    {
        checkNameAndAppend(s).append(l);
        return this;
    }

    public checkNameAndAppend add(String s, Object obj)
    {
        Preconditions.checkNotNull(s);
        addHolder(obj).builder.append(s).append('=').append(obj);
        return this;
    }

    public ValueHolder.builder add(String s, boolean flag)
    {
        checkNameAndAppend(s).append(flag);
        return this;
    }

    public checkNameAndAppend addValue(char c)
    {
        addHolder().builder.append(c);
        return this;
    }

    public ValueHolder.builder addValue(double d)
    {
        addHolder().builder.append(d);
        return this;
    }

    public ValueHolder.builder addValue(float f)
    {
        addHolder().builder.append(f);
        return this;
    }

    public ValueHolder.builder addValue(int i)
    {
        addHolder().builder.append(i);
        return this;
    }

    public ValueHolder.builder addValue(long l)
    {
        addHolder().builder.append(l);
        return this;
    }

    public ValueHolder.builder addValue(Object obj)
    {
        addHolder(obj).builder.append(obj);
        return this;
    }

    public ValueHolder.builder addValue(boolean flag)
    {
        addHolder().builder.append(flag);
        return this;
    }

    public ValueHolder.builder omitNullValues()
    {
        omitNullValues = true;
        return this;
    }

    public String toString()
    {
        boolean flag1 = omitNullValues;
        boolean flag = false;
        StringBuilder stringbuilder = (new StringBuilder(32)).append(className).append('{');
        Iterator iterator = valueHolders.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ValueHolder valueholder = (ValueHolder)iterator.next();
            if (!flag1 || !valueholder.isNull)
            {
                if (flag)
                {
                    stringbuilder.append(", ");
                } else
                {
                    flag = true;
                }
                stringbuilder.append(valueholder.builder);
            }
        } while (true);
        return stringbuilder.append('}').toString();
    }

    private ValueHolder(String s)
    {
        valueHolders = new LinkedList();
        omitNullValues = false;
        className = (String)Preconditions.checkNotNull(s);
    }

    ull(String s, ull ull)
    {
        this(s);
    }
}
