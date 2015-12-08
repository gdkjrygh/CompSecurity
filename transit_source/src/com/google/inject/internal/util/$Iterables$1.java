// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal.util;

import java.util.Iterator;

// Referenced classes of package com.google.inject.internal.util:
//            $Function, $Iterables

static final class 
    implements $Function
{

    public volatile Object apply(Object obj)
    {
        return apply((Iterable)obj);
    }

    public Iterator apply(Iterable iterable)
    {
        return iterable.iterator();
    }

    ()
    {
    }
}
