// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appstate;

import android.os.RemoteException;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.ga;

// Referenced classes of package com.google.android.gms.appstate:
//            AppStateManager

static final class <init> extends <init>
{

    final int yK;

    protected volatile void a(com.google.android.gms.common.api.nit> nit>)
        throws RemoteException
    {
        a((ga)nit>);
    }

    protected void a(ga ga1)
    {
        ga1.a(this, yK);
    }

    public Result c(Status status)
    {
        return g(status);
    }

    public ateDeletedResult g(Status status)
    {
        return new AppStateManager.StateDeletedResult(status) {

            final Status yJ;
            final AppStateManager._cls5 yM;

            public int getStateKey()
            {
                return yM.yK;
            }

            public Status getStatus()
            {
                return yJ;
            }

            
            {
                yM = AppStateManager._cls5.this;
                yJ = status;
                super();
            }
        };
    }

    _cls1.yJ(int i)
    {
        yK = i;
        super(null);
    }
}
