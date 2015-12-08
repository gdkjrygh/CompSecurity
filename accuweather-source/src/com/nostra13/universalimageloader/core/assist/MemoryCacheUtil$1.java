// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nostra13.universalimageloader.core.assist;

import java.util.Comparator;

// Referenced classes of package com.nostra13.universalimageloader.core.assist:
//            MemoryCacheUtil

static final class 
    implements Comparator
{

    public volatile int compare(Object obj, Object obj1)
    {
        return compare((String)obj, (String)obj1);
    }

    public int compare(String s, String s1)
    {
        return s.substring(0, s.lastIndexOf("_")).compareTo(s1.substring(0, s1.lastIndexOf("_")));
    }

    ()
    {
    }
}
