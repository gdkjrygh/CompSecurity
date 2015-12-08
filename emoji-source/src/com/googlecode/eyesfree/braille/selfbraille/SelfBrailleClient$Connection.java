// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.eyesfree.braille.selfbraille;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;

// Referenced classes of package com.googlecode.eyesfree.braille.selfbraille:
//            SelfBrailleClient, ISelfBrailleService

private class <init>
    implements ServiceConnection
{

    private volatile ISelfBrailleService mService;
    final SelfBrailleClient this$0;

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        if (!SelfBrailleClient.access$300(SelfBrailleClient.this))
        {
            Log.w(SelfBrailleClient.access$400(), String.format("Service certificate mismatch for %s, dropping connection", new Object[] {
                "com.googlecode.eyesfree.brailleback"
            }));
            SelfBrailleClient.access$500(SelfBrailleClient.this).unbindService();
            return;
        }
        Log.i(SelfBrailleClient.access$400(), "Connected to self braille service");
        mService = terface(ibinder);
        synchronized (SelfBrailleClient.access$500(SelfBrailleClient.this))
        {
            SelfBrailleClient.access$602(SelfBrailleClient.this, 0);
        }
        return;
        ibinder;
        componentname;
        JVM INSTR monitorexit ;
        throw ibinder;
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
        Log.e(SelfBrailleClient.access$400(), "Disconnected from self braille service");
        mService = null;
        SelfBrailleClient.access$500(SelfBrailleClient.this).scheduleRebind();
    }


    private Handler()
    {
        this$0 = SelfBrailleClient.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
