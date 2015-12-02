// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.user.a;

import java.util.Comparator;

// Referenced classes of package com.facebook.user.a:
//            i

class j
    implements Comparator
{

    final i a;

    j(i i)
    {
        a = i;
        super();
    }

    public int a(String s, String s1)
    {
        return s1.length() - s.length();
    }

    public int compare(Object obj, Object obj1)
    {
        return a((String)obj, (String)obj1);
    }
}
