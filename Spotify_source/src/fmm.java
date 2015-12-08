// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;

public final class fmm extends fni
{

    private final BroadcastReceiver b = new BroadcastReceiver() {

        private fmm a;

        public final void onReceive(Context context, Intent intent)
        {
            fmm.a(a);
        }

            
            {
                a = fmm.this;
                super();
            }
    };
    private final Context c;

    public fmm(fnj fnj1)
    {
        super("BluetoothA2dpConnected");
        c = fnj1.a;
        fnj1 = new IntentFilter();
        fnj1.addAction("android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED");
        fnj1.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
        c.registerReceiver(b, fnj1);
        (new Handler()).post(new Runnable() {

            private fmm a;

            public final void run()
            {
                fmm.a(a);
            }

            
            {
                a = fmm.this;
                super();
            }
        });
    }

    static void a(fmm fmm1)
    {
        if (((AudioManager)fmm1.c.getSystemService("audio")).isBluetoothA2dpOn())
        {
            fmm1.J_();
            return;
        } else
        {
            fmm1.c();
            return;
        }
    }

    protected final void a()
    {
        c.unregisterReceiver(b);
    }
}
