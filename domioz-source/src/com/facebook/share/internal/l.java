// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.internal;

import com.facebook.share.a.g;

// Referenced classes of package com.facebook.share.internal:
//            a, m

final class l
    implements Runnable
{

    private String a;
    private g b;
    private m c;

    l(String s, g g, m m)
    {
        a = s;
        b = g;
        c = m;
    }

    public final void run()
    {
        com.facebook.share.internal.a.b(a, b, c);
    }
}
