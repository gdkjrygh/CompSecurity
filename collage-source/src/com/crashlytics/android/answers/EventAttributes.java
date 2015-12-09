// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.answers;

import java.util.HashMap;
import java.util.Map;

public final class EventAttributes
{

    public static final int MAX_NUM_ATTRIBUTES = 20;
    public static final int MAX_STRING_LENGTH = 100;
    final Map attributes = new HashMap();

    public EventAttributes()
    {
    }

    static void validateStringLength(String s)
    {
        if (s.length() > 100)
        {
            throw new IllegalArgumentException(String.format("String cannot be longer than %d characters", new Object[] {
                Integer.valueOf(100)
            }));
        } else
        {
            return;
        }
    }

    public EventAttributes put(String s, Number number)
    {
        if (s == null)
        {
            throw new NullPointerException("key must not be null");
        }
        if (number == null)
        {
            throw new NullPointerException("value must not be null");
        } else
        {
            validateStringLength(s);
            putAttribute(s, number);
            return this;
        }
    }

    public EventAttributes put(String s, String s1)
    {
        if (s == null)
        {
            throw new NullPointerException("key must not be null");
        }
        if (s1 == null)
        {
            throw new NullPointerException("value must not be null");
        } else
        {
            validateStringLength(s);
            validateStringLength(s1);
            putAttribute(s, s1);
            return this;
        }
    }

    void putAttribute(String s, Object obj)
    {
        if (attributes.size() >= 20 && !attributes.containsKey(s))
        {
            throw new IllegalStateException(String.format("Event cannot have more than %d attributes", new Object[] {
                Integer.valueOf(20)
            }));
        } else
        {
            attributes.put(s, obj);
            return;
        }
    }
}
