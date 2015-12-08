// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appstate;

import android.os.RemoteException;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.ib;

// Referenced classes of package com.google.android.gms.appstate:
//            AppStateManager

static final class <init> extends <init>
{

    final int CX;

    protected volatile void a(com.google.android.gms.common.api.nit> nit>)
        throws RemoteException
    {
        a((ib)nit>);
    }

    protected void a(ib ib1)
    {
        ib1.a(this, CX);
    }

    public Result c(Status status)
    {
        return g(status);
    }

    public ateDeletedResult g(Status status)
    {
        return new AppStateManager.StateDeletedResult(status) {

            final Status CW;
            final AppStateManager._cls5 CZ;

            public int getStateKey()
            {
                return CZ.CX;
            }

            public Status getStatus()
            {
                return CW;
            }

            
            {
                CZ = AppStateManager._cls5.this;
                CW = status;
                super();
            }
        };
    }

    _cls1.CW(int i)
    {
        CX = i;
        super(null);
    }
}
