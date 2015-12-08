// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal;

import java.io.IOException;
import okio.Sink;

// Referenced classes of package com.squareup.okhttp.internal:
//            FaultHidingSink, DiskLruCache

class  extends FaultHidingSink
{

    final this._cls1 this$1;

    protected void onException(IOException ioexception)
    {
        synchronized (_fld0)
        {
            cess._mth1902(this._cls1.this, true);
        }
        return;
        exception;
        ioexception;
        JVM INSTR monitorexit ;
        throw exception;
    }

    (Sink sink)
    {
        this$1 = this._cls1.this;
        super(sink);
    }
}
