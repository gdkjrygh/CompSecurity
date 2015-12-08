// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.common.internal:
//            CharMatcher, Preconditions

private static final class components extends CharMatcher
{

    List components;

    public final boolean matches(char c)
    {
        for (Iterator iterator = components.iterator(); iterator.hasNext();)
        {
            if (((CharMatcher)iterator.next()).matches(c))
            {
                return true;
            }
        }

        return false;
    }

    public final CharMatcher or(CharMatcher charmatcher)
    {
        ArrayList arraylist = new ArrayList(components);
        arraylist.add(Preconditions.checkNotNull(charmatcher));
        return new <init>(arraylist);
    }

    (List list)
    {
        components = list;
    }
}
