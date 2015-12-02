// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.clearengine.b;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Message;

// Referenced classes of package com.qihoo.security.clearengine.b:
//            a

class a
    implements ServiceConnection
{

    final a a;

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        componentname = Message.obtain();
        componentname.what = 5;
        componentname.obj = ibinder;
        com.qihoo.security.clearengine.b.a.a(a).sendMessage(componentname);
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
        synchronized (com.qihoo.security.clearengine.b.a.b(a))
        {
            com.qihoo.security.clearengine.b.a.a(a, false);
            com.qihoo.security.clearengine.b.a.b(a, false);
        }
        com.qihoo.security.clearengine.b.a.a(a).sendEmptyMessage(6);
        return;
        exception;
        componentname;
        JVM INSTR monitorexit ;
        throw exception;
    }

    (a a1)
    {
        a = a1;
        super();
    }
}
