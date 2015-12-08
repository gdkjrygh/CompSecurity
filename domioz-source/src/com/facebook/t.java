// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.content.Context;

// Referenced classes of package com.facebook:
//            q

final class t
    implements Runnable
{

    final Context a;
    final String b;

    t(Context context, String s)
    {
        a = context;
        b = s;
        super();
    }

    public final void run()
    {
        q.b(a, b);
    }
}
