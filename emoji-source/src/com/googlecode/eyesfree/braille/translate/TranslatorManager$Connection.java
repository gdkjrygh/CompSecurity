// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.eyesfree.braille.translate;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;

// Referenced classes of package com.googlecode.eyesfree.braille.translate:
//            TranslatorManager, ITranslatorService

private class <init>
    implements ServiceConnection
{

    private volatile ITranslatorService mService;
    final TranslatorManager this$0;

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        Log.i(TranslatorManager.access$400(), "Connected to translation service");
        componentname = erface(ibinder);
        componentname.setCallback(TranslatorManager.access$500(TranslatorManager.this));
        mService = componentname;
        synchronized (TranslatorManager.access$600(TranslatorManager.this))
        {
            TranslatorManager.access$702(TranslatorManager.this, 0);
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
            Log.e(TranslatorManager.access$400(), "Error when setting callback", componentname);
        }
        return;
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
        Log.e(TranslatorManager.access$400(), "Disconnected from translator service");
        mService = null;
        TranslatorManager.access$600(TranslatorManager.this).scheduleRebind();
    }


    private anagerHandler()
    {
        this$0 = TranslatorManager.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
