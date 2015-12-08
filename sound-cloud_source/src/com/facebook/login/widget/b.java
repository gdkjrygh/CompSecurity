// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.login.widget;


// Referenced classes of package com.facebook.login.widget:
//            a, LoginButton

final class b
    implements Runnable
{

    final com.facebook.internal.U.b a;
    final a b;

    b(a a1, com.facebook.internal.U.b b1)
    {
        b = a1;
        a = b1;
        super();
    }

    public final void run()
    {
        LoginButton.a(b.b, a);
    }
}
