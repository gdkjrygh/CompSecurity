// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3;

import java.io.Serializable;

public class ObjectUtils
{
    public static class Null
        implements Serializable
    {

        Null()
        {
        }
    }


    public static final Null NULL = new Null();

    public static boolean equals(Object obj, Object obj1)
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
            return obj.equals(obj1);
        }
    }

    public static void identityToString(StringBuffer stringbuffer, Object obj)
    {
        if (obj == null)
        {
            throw new NullPointerException("Cannot get the toString of a null identity");
        } else
        {
            stringbuffer.append(obj.getClass().getName()).append('@').append(Integer.toHexString(System.identityHashCode(obj)));
            return;
        }
    }

    public String toString()
    {
        return super.toString();
    }

}
