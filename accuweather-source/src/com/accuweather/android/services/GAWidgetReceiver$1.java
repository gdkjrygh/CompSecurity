// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.services;

import android.content.Context;
import android.os.AsyncTask;

// Referenced classes of package com.accuweather.android.services:
//            GAWidgetReceiver

class val.context extends AsyncTask
{

    final GAWidgetReceiver this$0;
    final Context val$context;

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((Boolean[])aobj);
    }

    protected transient Void doInBackground(Boolean aboolean[])
    {
        onDoInBackground(aboolean[0].booleanValue(), val$context);
        return null;
    }

    _cls9()
    {
        this$0 = final_gawidgetreceiver;
        val$context = Context.this;
        super();
    }
}
