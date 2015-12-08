// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;

// Referenced classes of package com.appboy:
//            AppboyGcmReceiver

public class execute extends AsyncTask
{

    private final Context context;
    private final Intent intent;
    final AppboyGcmReceiver this$0;

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((Void[])aobj);
    }

    protected transient Void doInBackground(Void avoid[])
    {
        handleAppboyGcmMessage(context, intent);
        return null;
    }

    public (Context context1, Intent intent1)
    {
        this$0 = AppboyGcmReceiver.this;
        super();
        context = context1;
        intent = intent1;
        execute(new Void[0]);
    }
}
