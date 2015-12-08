// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal.util;

import java.util.Arrays;
import java.util.Iterator;

// Referenced classes of package com.google.inject.internal.util:
//            $Preconditions, $Iterators, $Function

public final class $Iterables
{
    static abstract class IterableWithToString
        implements Iterable
    {

        public String toString()
        {
            return $Iterables.toString(this);
        }

        IterableWithToString()
        {
        }
    }


    private $Iterables()
    {
    }

    public static Iterable concat(Iterable iterable)
    {
        return new IterableWithToString(transform(iterable, new $Function() {

            public volatile Object apply(Object obj)
            {
                return apply((Iterable)obj);
            }

            public Iterator apply(Iterable iterable1)
            {
                return iterable1.iterator();
            }

        })) {

            final Iterable val$iterators;

            public Iterator iterator()
            {
                return $Iterators.concat(iterators.iterator());
            }

            
            {
                iterators = iterable;
                super();
            }
        };
    }

    public static Iterable concat(Iterable iterable, Iterable iterable1)
    {
        $Preconditions.checkNotNull(iterable);
        $Preconditions.checkNotNull(iterable1);
        return concat(((Iterable) (Arrays.asList(new Iterable[] {
            iterable, iterable1
        }))));
    }

    public static Object getOnlyElement(Iterable iterable)
    {
        return $Iterators.getOnlyElement(iterable.iterator());
    }

    public static String toString(Iterable iterable)
    {
        return $Iterators.toString(iterable.iterator());
    }

    public static Iterable transform(Iterable iterable, $Function $function)
    {
        $Preconditions.checkNotNull(iterable);
        $Preconditions.checkNotNull($function);
        return new IterableWithToString(iterable, $function) {

            final Iterable val$fromIterable;
            final $Function val$function;

            public Iterator iterator()
            {
                return $Iterators.transform(fromIterable.iterator(), function);
            }

            
            {
                fromIterable = iterable;
                function = $function;
                super();
            }
        };
    }
}
