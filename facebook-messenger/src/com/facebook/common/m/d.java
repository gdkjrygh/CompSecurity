// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.m;

import java.io.IOException;

// Referenced classes of package com.facebook.common.m:
//            c

public class d extends IOException
{

    private c a;

    public d(c c)
    {
        a = c;
    }

    public c a()
    {
        return a;
    }

    public String toString()
    {
        return (new StringBuilder()).append("DNSUnresolvedException Status: ").append(a).append("\n").append(super.toString()).toString();
    }
}
