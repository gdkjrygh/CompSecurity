// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.opti.a;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.qihoo360.mobilesafe.core.c.c;

// Referenced classes of package com.qihoo.security.opti.a:
//            b

class a
    implements ServiceConnection
{

    final b a;

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        b.a(a, com.qihoo360.mobilesafe.core.c.a(ibinder));
        if (b.a(a) != null)
        {
            try
            {
                b.a(a).a(b.b(a));
            }
            // Misplaced declaration of an exception variable
            catch (ComponentName componentname) { }
            com.qihoo.security.opti.a.b.c(a);
        }
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
        if (b.a(a) != null)
        {
            try
            {
                b.a(a).b(b.b(a));
            }
            // Misplaced declaration of an exception variable
            catch (ComponentName componentname) { }
        }
        b.a(a, null);
    }

    .c(b b1)
    {
        a = b1;
        super();
    }
}
