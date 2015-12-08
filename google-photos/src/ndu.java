// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.google.android.libraries.social.ingest.ui.MtpImageView;
import java.lang.ref.WeakReference;

public final class ndu extends Handler
{

    private ndu(Looper looper)
    {
        super(looper);
    }

    public static ndu a()
    {
        HandlerThread handlerthread = new HandlerThread("MtpImageView Fetch");
        handlerthread.start();
        return new ndu(handlerthread.getLooper());
    }

    public final void handleMessage(Message message)
    {
        message = (MtpImageView)((WeakReference)message.obj).get();
        if (message != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        ndg ndg;
        Object obj1;
        synchronized (MtpImageView.a(message))
        {
            MtpImageView.a(message, false);
            obj1 = MtpImageView.b(message);
            ndg = MtpImageView.c(message);
        }
        if (obj1 == null) goto _L1; else goto _L3
_L3:
        obj1 = message.a(((android.mtp.MtpDevice) (obj1)), ndg);
        if (obj1 == null) goto _L1; else goto _L4
_L4:
        synchronized (MtpImageView.a(message))
        {
            if (MtpImageView.c(message) == ndg)
            {
                break MISSING_BLOCK_LABEL_92;
            }
        }
        return;
        message;
        obj;
        JVM INSTR monitorexit ;
        throw message;
        message;
        obj;
        JVM INSTR monitorexit ;
        throw message;
        MtpImageView.a(message, obj1);
        MtpImageView.a(message, null);
        MtpImageView.a(message, null);
        MtpImageView.b().sendMessage(MtpImageView.b().obtainMessage(0, MtpImageView.d(message)));
        obj;
        JVM INSTR monitorexit ;
    }
}
