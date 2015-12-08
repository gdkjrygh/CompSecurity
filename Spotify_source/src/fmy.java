// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

public final class fmy extends fni
{

    private final Context b;
    private BroadcastReceiver c;

    public fmy(fnj fnj1)
    {
        super("HeadsetPlug");
        b = fnj1.a;
        c = new BroadcastReceiver() {

            private fmy a;

            public final void onReceive(Context context, Intent intent)
            {
                switch (intent.getIntExtra("state", -1))
                {
                default:
                    return;

                case 0: // '\0'
                    a.c();
                    return;

                case 1: // '\001'
                    a.J_();
                    break;
                }
            }

            
            {
                a = fmy.this;
                super();
            }
        };
        b.registerReceiver(c, new IntentFilter("android.intent.action.HEADSET_PLUG"));
    }

    protected final void a()
    {
        b.unregisterReceiver(c);
    }
}
