// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.activity;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

// Referenced classes of package com.pandora.android.activity:
//            BaseFragmentActivity

class a
    implements ServiceConnection
{

    final BaseFragmentActivity a;

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
    }

    _cls9(BaseFragmentActivity basefragmentactivity)
    {
        a = basefragmentactivity;
        super();
    }
}
