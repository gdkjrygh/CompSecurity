// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cmcm.adsdk.nativead;

import android.os.AsyncTask;
import com.cmcm.adsdk.b.b.a;

// Referenced classes of package com.cmcm.adsdk.nativead:
//            aa

final class ac extends AsyncTask
{

    final aa a;

    ac(aa aa1)
    {
        a = aa1;
        super();
    }

    private transient Void a()
    {
        java.util.List list = com.cmcm.adsdk.b.b.a.a(a.mContext).a(Integer.valueOf(a.mPositionId).intValue());
        synchronized (com.cmcm.adsdk.nativead.aa.a(a))
        {
            com.cmcm.adsdk.nativead.aa.a(a, list);
        }
        return null;
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
        aa.e(a);
    }
}
