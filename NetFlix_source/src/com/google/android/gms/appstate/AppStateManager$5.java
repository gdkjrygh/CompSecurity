// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appstate;

import android.os.RemoteException;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.ei;

// Referenced classes of package com.google.android.gms.appstate:
//            AppStateManager

static final class <init> extends <init>
{

    final int wA;

    protected volatile void a(com.google.android.gms.common.api.nit> nit>)
        throws RemoteException
    {
        a((ei)nit>);
    }

    protected void a(ei ei1)
    {
        ei1.a(this, wA);
    }

    public ateDeletedResult c(Status status)
    {
        return new AppStateManager.StateDeletedResult(status) {

            final AppStateManager._cls5 wC;
            final Status wz;

            public int getStateKey()
            {
                return wC.wA;
            }

            public Status getStatus()
            {
                return wz;
            }

            
            {
                wC = AppStateManager._cls5.this;
                wz = status;
                super();
            }
        };
    }

    public Result d(Status status)
    {
        return c(status);
    }

    _cls1.wz(int i)
    {
        wA = i;
        super(null);
    }
}
