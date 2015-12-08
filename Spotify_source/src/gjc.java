// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.Message;
import com.spotify.mobile.android.util.tracking.TrackingService;
import java.lang.ref.WeakReference;

public final class gjc extends Handler
{

    private WeakReference a;

    public gjc(TrackingService trackingservice)
    {
        a = new WeakReference(trackingservice);
    }

    public final void handleMessage(Message message)
    {
        message = (TrackingService)a.get();
        if (message != null)
        {
            message.stopSelf();
        }
    }
}
