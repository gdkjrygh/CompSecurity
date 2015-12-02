// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.e;

import android.content.Context;
import android.content.Intent;
import com.facebook.c.b;
import com.facebook.c.c;

// Referenced classes of package com.facebook.e:
//            g, c

class d
    implements b
{

    final com.facebook.e.c a;

    d(com.facebook.e.c c1)
    {
        a = c1;
        super();
    }

    public void a(Context context, Intent intent, c c1)
    {
        if (!intent.getBooleanExtra("connected", false))
        {
            c.a(a, g.WIFI_OFF);
        }
    }
}
