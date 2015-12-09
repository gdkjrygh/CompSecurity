// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.a;

import android.content.Context;

// Referenced classes of package com.facebook.a:
//            a, r, i, j

final class f
    implements Runnable
{

    final Context a;
    final i b;
    final j c;

    f(Context context, i i, j j)
    {
        a = context;
        b = i;
        c = j;
        super();
    }

    public final void run()
    {
        com.facebook.a.a.a(a, b).a(c);
        com.facebook.a.a.d();
    }
}
