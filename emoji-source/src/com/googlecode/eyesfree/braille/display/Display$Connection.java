// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.eyesfree.braille.display;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;

// Referenced classes of package com.googlecode.eyesfree.braille.display:
//            Display, IBrailleService

private class <init>
    implements ServiceConnection
{

    private volatile IBrailleService mService;
    final Display this$0;

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        Log.i(Display.access$100(), "Connected to braille service");
        componentname = b.asInterface(ibinder);
        componentname.registerCallback(Display.access$200(Display.this));
        mService = componentname;
        synchronized (Display.access$300(Display.this))
        {
            Display.access$402(Display.this, 0);
        }
        return;
        ibinder;
        componentname;
        JVM INSTR monitorexit ;
        try
        {
            throw ibinder;
        }
        // Misplaced declaration of an exception variable
        catch (ComponentName componentname)
        {
            Log.e(Display.access$100(), "Failed to register callback on service", componentname);
        }
        return;
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
        mService = null;
        Log.e(Display.access$100(), "Disconnected from braille service");
        Display.access$300(Display.this).reportConnectionState(0, null);
        Display.access$300(Display.this).scheduleRebind();
    }


    private ler()
    {
        this$0 = Display.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
