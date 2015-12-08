// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.util;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import java.lang.ref.WeakReference;

// Referenced classes of package com.jcp.util:
//            t

public class DownloadResultReceiver extends ResultReceiver
{

    private WeakReference a;

    public DownloadResultReceiver(Handler handler)
    {
        super(handler);
        a = new WeakReference(null);
    }

    public void a(t t1)
    {
        a = new WeakReference(t1);
    }

    protected void onReceiveResult(int i, Bundle bundle)
    {
        if (a.get() != null)
        {
            ((t)a.get()).a(i, bundle);
        }
    }
}
