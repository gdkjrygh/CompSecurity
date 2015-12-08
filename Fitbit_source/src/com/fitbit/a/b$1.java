// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.a;

import android.content.Intent;
import com.fitbit.util.threading.c;

// Referenced classes of package com.fitbit.a:
//            b

class hreading.c extends c
{

    final b a;

    public void a(Intent intent)
    {
        if ("com.fitbit.ApplicationForegroundController.APP_PROBABLY_SWITCHED_TO_FOREGROUND".equals(intent.getAction()))
        {
            b.a(a);
        }
    }

    ntent(b b1)
    {
        a = b1;
        super();
    }
}
