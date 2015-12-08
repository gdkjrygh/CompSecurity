// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.http;

import java.util.Comparator;

// Referenced classes of package com.squareup.okhttp.internal.http:
//            OkHeaders

final class 
    implements Comparator
{

    public volatile int compare(Object obj, Object obj1)
    {
        return compare((String)obj, (String)obj1);
    }

    public int compare(String s, String s1)
    {
        if (s == s1)
        {
            return 0;
        }
        if (s == null)
        {
            return -1;
        }
        if (s1 == null)
        {
            return 1;
        } else
        {
            return String.CASE_INSENSITIVE_ORDER.compare(s, s1);
        }
    }

    ()
    {
    }
}
