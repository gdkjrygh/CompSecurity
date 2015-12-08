// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.b;

// Referenced classes of package com.google.android.gms.internal:
//            aa, ac, ab

protected final class c extends c
{

    public final int b;
    public final Bundle c;
    public final IBinder d;
    final aa e;

    protected void a()
    {
    }

    protected void a(Boolean boolean1)
    {
        if (boolean1 == null)
        {
            aa.a(e, 1, null);
            return;
        }
        b;
        JVM INSTR lookupswitch 2: default 44
    //                   0: 142
    //                   10: 269;
           goto _L1 _L2 _L3
_L1:
        if (c != null)
        {
            boolean1 = (PendingIntent)c.getParcelable("pendingIntent");
        } else
        {
            boolean1 = null;
        }
        if (aa.c(e) != null)
        {
            ac.a(aa.d(e)).b(e.d(), aa.c(e));
            aa.a(e, null);
        }
        aa.a(e, 1, null);
        aa.a(e).a(new b(b, boolean1));
        return;
_L2:
        boolean1 = d.getInterfaceDescriptor();
        if (!e.e().equals(boolean1)) goto _L5; else goto _L4
_L4:
        boolean1 = e.a(d);
        if (boolean1 != null)
        {
            try
            {
                aa.a(e, 3, boolean1);
                aa.a(e).a();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Boolean boolean1) { }
        }
_L5:
        ac.a(aa.d(e)).b(e.d(), aa.c(e));
        aa.a(e, null);
        aa.a(e, 1, null);
        aa.a(e).a(new b(8, null));
        return;
_L3:
        aa.a(e, 1, null);
        throw new IllegalStateException("A fatal developer error has occurred. Check the logs for further information.");
    }

    protected void a(Object obj)
    {
        a((Boolean)obj);
    }

    public (aa aa1, int i, IBinder ibinder, Bundle bundle)
    {
        e = aa1;
        super(aa1, Boolean.valueOf(true));
        b = i;
        d = ibinder;
        c = bundle;
    }
}
