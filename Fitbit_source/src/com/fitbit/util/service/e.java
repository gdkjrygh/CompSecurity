// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util.service;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.support.v4.content.Loader;

// Referenced classes of package com.fitbit.util.service:
//            h

class e extends Loader
{

    private final Intent a[];
    private h b;

    public transient e(Context context, Intent aintent[])
    {
        super(context);
        a = aintent;
    }

    static h a(e e1)
    {
        return e1.b;
    }

    static h a(e e1, h h)
    {
        e1.b = h;
        return h;
    }

    protected void onForceLoad()
    {
        if (a != null)
        {
            Intent aintent[] = a;
            int j = aintent.length;
            for (int i = 0; i < j; i++)
            {
                Intent intent = aintent[i];
                intent.putExtra("callback", new ServiceCallbackReceiver._cls1(new Handler()));
                getContext().startService(intent);
            }

        }
    }

    protected void onStartLoading()
    {
        if (b != null)
        {
            deliverResult(b);
            return;
        } else
        {
            forceLoad();
            return;
        }
    }

    protected void onStopLoading()
    {
        super.onStopLoading();
    }

    // Unreferenced inner class com/fitbit/util/service/ServiceCallbackReceiver$1

/* anonymous class */
    class ServiceCallbackReceiver._cls1 extends ResultReceiver
    {

        final e a;

        protected void onReceiveResult(int i, Bundle bundle)
        {
            e.a(a, new h(i, bundle));
            a.deliverResult(e.a(a));
        }

            
            {
                a = e.this;
                super(handler);
            }
    }

}
