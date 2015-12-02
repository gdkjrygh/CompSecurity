// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.baidu.android.pushservice;

import android.content.Context;
import android.content.Intent;
import com.baidu.android.pushservice.util.f;

// Referenced classes of package com.baidu.android.pushservice:
//            a

final class y
    implements Runnable
{

    final Context a;

    y(Context context)
    {
        a = context;
        super();
    }

    public final void run()
    {
        String s = f.B(a);
        if (f.r(a) && a.getPackageName().equals(s))
        {
            Intent intent = new Intent("com.baidu.pushservice.action.START");
            com.baidu.android.pushservice.a.a(a, intent);
        }
    }
}
