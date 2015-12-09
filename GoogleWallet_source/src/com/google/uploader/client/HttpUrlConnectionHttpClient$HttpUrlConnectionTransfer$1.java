// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.uploader.client;

import java.util.concurrent.Callable;

// Referenced classes of package com.google.uploader.client:
//            HttpUrlConnectionHttpClient, TransferException, TransferListener, TransferExceptionOrHttpResponse

final class this._cls0
    implements Callable
{

    final call this$0;

    private TransferExceptionOrHttpResponse call()
    {
        HttpResponse httpresponse = cess._mth000(this._cls0.this);
        synchronized (this._cls0.this)
        {
            if (cess._mth100(this._cls0.this) != null)
            {
                cess._mth100(this._cls0.this).onResponseReceived(this._cls0.this, httpresponse);
            }
        }
        try
        {
            obj = new TransferExceptionOrHttpResponse(httpresponse);
        }
        catch (TransferException transferexception)
        {
            synchronized (this._cls0.this)
            {
                if (cess._mth100(this._cls0.this) != null)
                {
                    cess._mth100(this._cls0.this).onException(this._cls0.this, transferexception);
                }
            }
            return new TransferExceptionOrHttpResponse(transferexception);
        }
        return ((TransferExceptionOrHttpResponse) (obj));
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        exception1;
        _lcls0;
        JVM INSTR monitorexit ;
        throw exception1;
    }

    public final volatile Object call()
        throws Exception
    {
        return call();
    }

    ()
    {
        this$0 = this._cls0.this;
        super();
    }
}
