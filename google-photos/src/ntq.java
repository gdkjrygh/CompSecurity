// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Service;
import android.content.Intent;
import android.text.TextUtils;

public final class ntq
    implements Runnable
{

    private int a;
    private Intent b;
    private Service c;

    public ntq(Service service, int i, Intent intent)
    {
        c = service;
        a = i;
        b = intent;
    }

    public final void run()
    {
        if (b != null && !TextUtils.isEmpty(b.getAction()))
        {
            android.content.Context context = c.getApplicationContext();
            nto nto1 = (nto)((ntp)olm.a(context, ntp)).a(b.getAction());
            if (nto1 != null)
            {
                nto1.a(b, context);
            }
        }
        c.stopSelfResult(a);
    }
}
