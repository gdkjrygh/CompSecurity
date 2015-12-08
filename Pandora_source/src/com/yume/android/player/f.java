// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.player;


// Referenced classes of package com.yume.android.player:
//            e, d

final class f
    implements Runnable
{

    private e a;
    private final String b;

    f(e e1, String s)
    {
        a = e1;
        b = s;
        super();
    }

    public final void run()
    {
        a.a.a(b);
    }
}
