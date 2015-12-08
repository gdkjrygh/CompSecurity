// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.internal;


// Referenced classes of package com.facebook.share.internal:
//            a

final class t
    implements Runnable
{

    private String a;
    private String b;

    t(String s, String s1)
    {
        a = s;
        b = s1;
    }

    public final void run()
    {
        com.facebook.share.internal.a.a(a, b);
    }
}
