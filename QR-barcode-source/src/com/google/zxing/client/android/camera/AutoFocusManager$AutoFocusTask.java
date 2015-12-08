// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.android.camera;

import android.os.AsyncTask;

// Referenced classes of package com.google.zxing.client.android.camera:
//            AutoFocusManager

private final class <init> extends AsyncTask
{

    final AutoFocusManager this$0;

    protected transient Object doInBackground(Object aobj[])
    {
        try
        {
            Thread.sleep(2000L);
        }
        // Misplaced declaration of an exception variable
        catch (Object aobj[]) { }
        synchronized (AutoFocusManager.this)
        {
            if (AutoFocusManager.access$0(AutoFocusManager.this))
            {
                start();
            }
        }
        return null;
        exception;
        aobj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private ()
    {
        this$0 = AutoFocusManager.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
