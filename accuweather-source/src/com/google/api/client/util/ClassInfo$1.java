// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.util;

import java.util.Comparator;

// Referenced classes of package com.google.api.client.util:
//            ClassInfo

class this._cls0
    implements Comparator
{

    final ClassInfo this$0;

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
            return s.compareTo(s1);
        }
    }

    ()
    {
        this$0 = ClassInfo.this;
        super();
    }
}
