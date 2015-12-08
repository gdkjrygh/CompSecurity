// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.gcm;

import android.content.Intent;
import android.os.AsyncTask;

// Referenced classes of package com.google.android.gms.gcm:
//            GcmListenerService

class a extends AsyncTask
{

    final Intent a;
    final GcmListenerService b;

    protected transient Void a(Void avoid[])
    {
        GcmListenerService.zza(b, a);
        return null;
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }

    (GcmListenerService gcmlistenerservice, Intent intent)
    {
        b = gcmlistenerservice;
        a = intent;
        super();
    }
}
