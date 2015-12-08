// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.protobuf;

import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.google.protobuf:
//            AbstractMessageLite, LazyStringList, UninitializedMessageException, MessageLite

public static abstract class n
    implements n
{

    protected static void addAll(Iterable iterable, Collection collection)
    {
        if (iterable instanceof LazyStringList)
        {
            checkForNullValues(((LazyStringList)iterable).getUnderlyingElements());
            collection.addAll((Collection)iterable);
        } else
        {
            if (iterable instanceof Collection)
            {
                checkForNullValues(iterable);
                collection.addAll((Collection)iterable);
                return;
            }
            iterable = iterable.iterator();
            while (iterable.hasNext()) 
            {
                Object obj = iterable.next();
                if (obj == null)
                {
                    throw new NullPointerException();
                }
                collection.add(obj);
            }
        }
    }

    private static void checkForNullValues(Iterable iterable)
    {
        for (iterable = iterable.iterator(); iterable.hasNext();)
        {
            if (iterable.next() == null)
            {
                throw new NullPointerException();
            }
        }

    }

    protected static UninitializedMessageException newUninitializedMessageException(MessageLite messagelite)
    {
        return new UninitializedMessageException(messagelite);
    }

    public abstract n clone();

    public volatile Object clone()
        throws CloneNotSupportedException
    {
        return clone();
    }

    public n()
    {
    }
}
