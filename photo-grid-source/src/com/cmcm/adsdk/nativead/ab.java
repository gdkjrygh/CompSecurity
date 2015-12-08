// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cmcm.adsdk.nativead;

import android.os.AsyncTask;
import com.cmcm.adsdk.b.b.a;
import com.cmcm.adsdk.b.c.b;

// Referenced classes of package com.cmcm.adsdk.nativead:
//            aa

final class ab extends AsyncTask
{

    final aa a;

    ab(aa aa1)
    {
        a = aa1;
        super();
    }

    private transient Boolean a()
    {
        java.util.List list = com.cmcm.adsdk.b.b.a.a(a.mContext).a(Integer.valueOf(a.mPositionId).intValue());
        Object obj = com.cmcm.adsdk.nativead.aa.a(a);
        obj;
        JVM INSTR monitorenter ;
        com.cmcm.adsdk.nativead.aa.a(a, list);
        Exception exception;
        boolean flag;
        if (com.cmcm.adsdk.nativead.aa.b(a) != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj;
        JVM INSTR monitorexit ;
        return Boolean.valueOf(flag);
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected final Object doInBackground(Object aobj[])
    {
        return a();
    }

    protected final void onPostExecute(Object obj)
    {
        if (((Boolean)obj).booleanValue())
        {
            aa.c(a);
            if (aa.d(a))
            {
                b.a("CMCMADSDK", "the last request suspended by no config, to complete last request");
                aa.e(a);
                aa.f(a);
            }
        }
    }
}
