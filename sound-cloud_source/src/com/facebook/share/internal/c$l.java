// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.internal;


// Referenced classes of package com.facebook.share.internal:
//            c

private static final class b
    implements Runnable
{

    private String a;
    private String b;

    public final void run()
    {
        c.a(a, b);
    }

    (String s, String s1)
    {
        a = s;
        b = s1;
    }
}
