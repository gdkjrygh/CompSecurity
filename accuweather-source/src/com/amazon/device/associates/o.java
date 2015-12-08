// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.associates;

import android.os.AsyncTask;

// Referenced classes of package com.amazon.device.associates:
//            be, p

class o extends AsyncTask
{

    private static final String a = com/amazon/device/associates/o.getName();

    o()
    {
    }

    protected transient Void a(String as[])
    {
        this;
        JVM INSTR monitorenter ;
        be be1;
        be1 = new be();
        be1.a(as[0], as[1], as[2]);
        if (be1 == null)
        {
            break MISSING_BLOCK_LABEL_31;
        }
        be1.e();
_L2:
        this;
        JVM INSTR monitorexit ;
        return null;
        as;
        p.c(a, (new StringBuilder()).append("ImpressionRecoder Call failed. Ex=").append(as).toString());
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
