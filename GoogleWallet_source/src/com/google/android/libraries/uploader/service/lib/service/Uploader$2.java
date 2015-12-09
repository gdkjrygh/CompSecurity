// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.uploader.service.lib.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.libraries.uploader.service.lib.service:
//            Uploader

final class this._cls0 extends BroadcastReceiver
{

    final Uploader this$0;

    public final void onReceive(Context context, Intent intent)
    {
        Log.i(Uploader.access$800(), "Restarting all active uploads");
        for (context = Uploader.access$1300(Uploader.this).entrySet().iterator(); context.hasNext(); Uploader.access$1400(Uploader.this, (String)intent.etKey(), (stener)intent.etValue()))
        {
            intent = (java.util.etValue)context.next();
        }

    }

    stener()
    {
        this$0 = Uploader.this;
        super();
    }
}
