// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.associates;

import android.os.AsyncTask;

// Referenced classes of package com.amazon.device.associates:
//            bi, p

class bm extends AsyncTask
{

    bm()
    {
    }

    protected transient Void a(String as[])
    {
        this;
        JVM INSTR monitorenter ;
        as = bi.d();
        if (as == null)
        {
            break MISSING_BLOCK_LABEL_14;
        }
        as.e();
_L2:
        this;
        JVM INSTR monitorexit ;
        return null;
        as;
        p.c("AsyncInternalRegistration", (new StringBuilder()).append("Internal Registration failed. Ex=").append(as).toString());
        if (true) goto _L2; else goto _L1
_L1:
        as;
        throw as;
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return a((String[])aobj);
    }
}
