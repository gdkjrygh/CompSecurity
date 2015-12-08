// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.android;

import android.app.Activity;
import android.os.AsyncTask;
import android.util.Log;

// Referenced classes of package com.google.zxing.client.android:
//            InactivityTimer

private final class <init> extends AsyncTask
{

    final InactivityTimer this$0;

    protected transient Object doInBackground(Object aobj[])
    {
        try
        {
            Thread.sleep(0x493e0L);
            Log.i(InactivityTimer.access$300(), "Finishing activity due to inactivity");
            InactivityTimer.access$400(InactivityTimer.this).finish();
        }
        // Misplaced declaration of an exception variable
        catch (Object aobj[]) { }
        return null;
    }

    private I()
    {
        this$0 = InactivityTimer.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
