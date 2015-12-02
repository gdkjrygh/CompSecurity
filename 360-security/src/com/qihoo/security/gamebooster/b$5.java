// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.gamebooster;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.qihoo.security.service.a;

// Referenced classes of package com.qihoo.security.gamebooster:
//            b

class a
    implements ServiceConnection
{

    final b a;

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        a.a = com.qihoo.security.service.a(ibinder);
        if (a.a == null)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        a.a.a(b.k(a));
        return;
        componentname;
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
        a.a = null;
    }

    (b b1)
    {
        a = b1;
        super();
    }
}
