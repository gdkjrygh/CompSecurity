// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.Message;
import com.google.android.libraries.social.ingest.ui.MtpImageView;
import java.lang.ref.WeakReference;

public final class ndv extends Handler
{

    public ndv()
    {
    }

    public final void handleMessage(Message message)
    {
        MtpImageView mtpimageview = (MtpImageView)((WeakReference)message.obj).get();
        if (mtpimageview != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj;
        synchronized (MtpImageView.a(mtpimageview))
        {
            obj = MtpImageView.e(mtpimageview);
        }
        if (obj == null) goto _L1; else goto _L3
_L3:
        mtpimageview.a(obj);
        return;
        exception;
        message;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
