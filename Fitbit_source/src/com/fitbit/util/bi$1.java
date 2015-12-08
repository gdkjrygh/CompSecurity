// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util;

import android.content.Intent;
import com.fitbit.e.a;
import com.fitbit.util.threading.c;

// Referenced classes of package com.fitbit.util:
//            bi

class ding.c extends c
{

    final bi a;

    public void a(Intent intent)
    {
        com.fitbit.e.a.a("SyncDataLoader", "%s %s", new Object[] {
            a, intent
        });
        a.b(intent);
    }

    t(bi bi1)
    {
        a = bi1;
        super();
    }
}
