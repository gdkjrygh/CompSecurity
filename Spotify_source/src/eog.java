// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.Message;
import com.spotify.mobile.android.spotlets.collection.service.AnnotateService;
import java.lang.ref.WeakReference;

public final class eog extends Handler
{

    private final WeakReference a;

    public eog(AnnotateService annotateservice)
    {
        a = new WeakReference(annotateservice);
    }

    public final void handleMessage(Message message)
    {
        super.handleMessage(message);
        message = (AnnotateService)a.get();
        if (message == null)
        {
            return;
        } else
        {
            message.stopSelf();
            return;
        }
    }
}
