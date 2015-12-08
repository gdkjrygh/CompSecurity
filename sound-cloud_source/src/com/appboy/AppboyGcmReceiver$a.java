// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;

// Referenced classes of package com.appboy:
//            AppboyGcmReceiver

public final class execute extends AsyncTask
{

    final AppboyGcmReceiver a;
    private final Context b;
    private final Intent c;

    protected final Object doInBackground(Object aobj[])
    {
        a.a(b, c);
        return null;
    }

    public (AppboyGcmReceiver appboygcmreceiver, Context context, Intent intent)
    {
        a = appboygcmreceiver;
        super();
        b = context;
        c = intent;
        execute(new Void[0]);
    }
}
