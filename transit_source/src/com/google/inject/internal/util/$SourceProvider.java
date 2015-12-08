// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal.util;

import java.util.List;

// Referenced classes of package com.google.inject.internal.util:
//            $ImmutableSet, $Lists, $Iterables

public final class $SourceProvider
{

    public static final $SourceProvider DEFAULT_INSTANCE = new $SourceProvider($ImmutableSet.of(com/google/inject/internal/util/$SourceProvider.getName()));
    public static final Object UNKNOWN_SOURCE = "[unknown source]";
    private final $ImmutableSet classNamesToSkip;

    private $SourceProvider(Iterable iterable)
    {
        classNamesToSkip = $ImmutableSet.copyOf(iterable);
    }

    private static transient List asStrings(Class aclass[])
    {
        java.util.ArrayList arraylist = $Lists.newArrayList();
        int j = aclass.length;
        for (int i = 0; i < j; i++)
        {
            arraylist.add(aclass[i].getName());
        }

        return arraylist;
    }

    public StackTraceElement get()
    {
        StackTraceElement astacktraceelement[] = (new Throwable()).getStackTrace();
        int j = astacktraceelement.length;
        for (int i = 0; i < j; i++)
        {
            StackTraceElement stacktraceelement = astacktraceelement[i];
            String s = stacktraceelement.getClassName();
            if (!classNamesToSkip.contains(s))
            {
                return stacktraceelement;
            }
        }

        throw new AssertionError();
    }

    public transient $SourceProvider plusSkippedClasses(Class aclass[])
    {
        return new $SourceProvider($Iterables.concat(classNamesToSkip, asStrings(aclass)));
    }

}
