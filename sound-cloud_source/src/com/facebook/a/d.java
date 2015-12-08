// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.a;

import android.content.Context;

// Referenced classes of package com.facebook.a:
//            a

final class d
    implements Runnable
{

    final Context a;
    final a.a b;
    final a.b c;

    d(Context context, a.a a1, a.b b1)
    {
        a = context;
        b = a1;
        c = b1;
        super();
    }

    public final void run()
    {
        com.facebook.a.a.a(a, b).a(c);
        com.facebook.a.a.d();
    }
}
