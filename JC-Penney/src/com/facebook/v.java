// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.content.Context;

// Referenced classes of package com.facebook:
//            s

final class v
    implements Runnable
{

    final Context a;
    final String b;

    v(Context context, String s1)
    {
        a = context;
        b = s1;
        super();
    }

    public void run()
    {
        s.b(a, b);
    }
}
