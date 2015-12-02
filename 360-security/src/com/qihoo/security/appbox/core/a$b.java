// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.appbox.core;


// Referenced classes of package com.qihoo.security.appbox.core:
//            a

private static class b
{

    private boolean a;
    private int b;

    static boolean a(b b1)
    {
        return b1.a;
    }

    static int b(a a1)
    {
        return a1.b;
    }

    public String toString()
    {
        return (new StringBuilder()).append("AppBoxV5update [show=").append(a).append(", index=").append(b).append("]").toString();
    }

    public (boolean flag, int i)
    {
        a = flag;
        b = i;
    }
}
