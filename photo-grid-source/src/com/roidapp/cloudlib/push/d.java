// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.push;

import android.content.Context;

// Referenced classes of package com.roidapp.cloudlib.push:
//            a

final class d
    implements Runnable
{

    final Context a;
    final String b;

    d(Context context, String s)
    {
        a = context;
        b = s;
        super();
    }

    public final void run()
    {
        com.roidapp.cloudlib.push.a.d(a, b);
    }
}
