// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.microsoft.onlineid.b.b;

// Referenced classes of package com.microsoft.onlineid.internal:
//            c, e

public abstract class ApiRequestResultReceiver extends ResultReceiver
{

    public ApiRequestResultReceiver(Handler handler)
    {
        super(handler);
    }

    protected abstract void a();

    protected abstract void a(PendingIntent pendingintent);

    protected abstract void a(c c1);

    protected abstract void a(Exception exception);

    protected void onReceiveResult(int i, Bundle bundle)
    {
        bundle = new c(bundle);
        switch (i)
        {
        default:
            e.a(false);
            a(new b((new StringBuilder("Unknown result code: ")).append(i).toString()));
            return;

        case -1: 
            a(bundle);
            return;

        case 0: // '\0'
            a();
            return;

        case 1: // '\001'
            a(bundle.e());
            return;

        case 2: // '\002'
            a(bundle.f());
            break;
        }
    }
}
