// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.uploader.service.lib.service;

import android.content.Context;
import android.os.Handler;
import android.os.RemoteException;
import android.util.Log;
import com.google.common.base.Preconditions;

// Referenced classes of package com.google.android.libraries.uploader.service.lib.service:
//            Uploader, ByteArrayWrapper

final class listener extends listener
{

    _cls3.val.sessionId listener;
    final Uploader this$0;

    public final void onResponseReceived(final String sessionId, final ByteArrayWrapper responseTextBytes, final int httpResponseCode)
        throws RemoteException
    {
        this;
        JVM INSTR monitorenter ;
        Uploader.access$1500(Uploader.this, sessionId);
        if (responseTextBytes.getByteArray() != null)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        Log.e(Uploader.access$800(), (new StringBuilder(44)).append("Response is null. Response code: ").append(httpResponseCode).toString());
        (new Handler(Uploader.access$1600(Uploader.this).getMainLooper())).post(new Runnable() {

            final Uploader.IUploadServiceCallbackImpl this$1;
            final String val$sessionId;

            public final void run()
            {
                listener.onUploadFailed(sessionId);
            }

            
            {
                this$1 = Uploader.IUploadServiceCallbackImpl.this;
                sessionId = s;
                super();
            }
        });
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
        (new Handler(Uploader.access$1600(Uploader.this).getMainLooper())).post(new Runnable() {

            final Uploader.IUploadServiceCallbackImpl this$1;
            final int val$httpResponseCode;
            final ByteArrayWrapper val$responseTextBytes;
            final String val$sessionId;

            public final void run()
            {
                listener.onResponseReceived(sessionId, responseTextBytes.getByteArray(), httpResponseCode);
            }

            
            {
                this$1 = Uploader.IUploadServiceCallbackImpl.this;
                sessionId = s;
                responseTextBytes = bytearraywrapper;
                httpResponseCode = i;
                super();
            }
        });
        if (true) goto _L2; else goto _L1
_L1:
        sessionId;
        this;
        JVM INSTR monitorexit ;
        throw sessionId;
    }

    public final void onUploadFailed(final String sessionId)
        throws RemoteException
    {
        this;
        JVM INSTR monitorenter ;
        Uploader.access$1500(Uploader.this, sessionId);
        (new Handler(Uploader.access$1600(Uploader.this).getMainLooper())).post(new Runnable() {

            final Uploader.IUploadServiceCallbackImpl this$1;
            final String val$sessionId;

            public final void run()
            {
                listener.onUploadFailed(sessionId);
            }

            
            {
                this$1 = Uploader.IUploadServiceCallbackImpl.this;
                sessionId = s;
                super();
            }
        });
        this;
        JVM INSTR monitorexit ;
        return;
        sessionId;
        this;
        JVM INSTR monitorexit ;
        throw sessionId;
    }

    public _cls3.val.sessionId(_cls3.val.sessionId sessionid)
    {
        this$0 = Uploader.this;
        super();
        listener = (listener)Preconditions.checkNotNull(sessionid);
    }
}
