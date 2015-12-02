// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.executors;


// Referenced classes of package com.facebook.common.executors:
//            ac

class ae
    implements Comparable
{

    public final ac a;
    public final long b;

    public ae(ac ac, long l)
    {
        a = ac;
        b = l;
    }

    public int a(ae ae1)
    {
        return Long.valueOf(b).compareTo(Long.valueOf(ae1.b));
    }

    public int compareTo(Object obj)
    {
        return a((ae)obj);
    }
}
