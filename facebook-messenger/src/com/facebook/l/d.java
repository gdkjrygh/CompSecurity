// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.l;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import com.facebook.c.b;
import com.facebook.c.c;

// Referenced classes of package com.facebook.l:
//            c, e

class d
    implements b
{

    final com.facebook.l.c a;

    d(com.facebook.l.c c1)
    {
        a = c1;
        super();
    }

    public void a(Context context, Intent intent, c c1)
    {
        com.facebook.l.c.b(a).postDelayed(new e(this), 1000L);
    }
}
