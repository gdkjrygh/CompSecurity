// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.videolib.a;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import com.roidapp.videolib.core.a.a;

// Referenced classes of package com.roidapp.videolib.a:
//            b

final class d
    implements ServiceConnection
{

    final b a;

    d(b b1)
    {
        a = b1;
        super();
    }

    public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        com.roidapp.videolib.a.b.a(a, new Messenger(ibinder));
        b.b(a, new Messenger(b.b(a)));
        int i;
        if (b.g(a))
        {
            i = 0;
        } else
        {
            i = 1;
        }
        componentname = Message.obtain(null, 43520, i, 1);
        componentname.setData(b.h(a).i());
        com.roidapp.videolib.a.b.a(a, componentname);
    }

    public final void onServiceDisconnected(ComponentName componentname)
    {
        com.roidapp.videolib.a.b.a(a, null);
    }
}
