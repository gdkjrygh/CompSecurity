// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Comparator;

// Referenced classes of package com.google.android.gms.internal:
//            am

class a
    implements Comparator
{

    final am a;

    public int a(String s, String s1)
    {
        return s1.length() - s.length();
    }

    public int compare(Object obj, Object obj1)
    {
        return a((String)obj, (String)obj1);
    }

    (am am1)
    {
        a = am1;
        super();
    }
}
