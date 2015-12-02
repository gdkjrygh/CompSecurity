// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.selfupdate;

import android.content.Context;
import android.content.Intent;
import com.facebook.base.broadcast.l;
import com.facebook.c.b;
import com.facebook.c.c;

// Referenced classes of package com.facebook.selfupdate:
//            af

class ah
    implements b
{

    final af a;

    ah(af af1)
    {
        a = af1;
        super();
    }

    public void a(Context context, Intent intent, c c)
    {
        a.f();
        if (com.facebook.selfupdate.af.c(a) != null)
        {
            com.facebook.selfupdate.af.c(a).c();
        }
    }
}
