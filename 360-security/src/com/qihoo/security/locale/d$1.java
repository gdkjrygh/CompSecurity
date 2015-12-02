// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.locale;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.qihoo.security.locale:
//            d, a, b

class a
    implements ServiceConnection
{

    final d a;

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        d.a(a, a(ibinder));
        d.b(a).a(d.a(a));
        if (d.c(a) == null || d.c(a).isEmpty())
        {
            break MISSING_BLOCK_LABEL_139;
        }
        for (componentname = d.c(a).iterator(); componentname.hasNext(); d.b(a).a(ibinder))
        {
            ibinder = (b)componentname.next();
        }

        try
        {
            d.c(a).clear();
            d.a(a, null);
            d.b(a).f();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ComponentName componentname) { }
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
    }

    ion(d d1)
    {
        a = d1;
        super();
    }
}
