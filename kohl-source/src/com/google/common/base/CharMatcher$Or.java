// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.common.base:
//            CharMatcher, Preconditions

private static class components extends CharMatcher
{

    List components;

    public volatile boolean apply(Object obj)
    {
        return super.apply((Character)obj);
    }

    public boolean matches(char c)
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

    public CharMatcher or(CharMatcher charmatcher)
    {
        ArrayList arraylist = new ArrayList(components);
        arraylist.add(Preconditions.checkNotNull(charmatcher));
        return new <init>(arraylist);
    }

    void setBits(kupTable kuptable)
    {
        for (Iterator iterator = components.iterator(); iterator.hasNext(); ((CharMatcher)iterator.next()).setBits(kuptable)) { }
    }

    kupTable(List list)
    {
        components = list;
    }
}
