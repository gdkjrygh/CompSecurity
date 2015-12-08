// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appstate;

import android.os.RemoteException;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.gb;

// Referenced classes of package com.google.android.gms.appstate:
//            AppStateManager

static final class <init> extends <init>
{

    final int yH;

    protected volatile void a(com.google.android.gms.common.api.nit> nit>)
        throws RemoteException
    {
        a((gb)nit>);
    }

    protected void a(gb gb1)
    {
        gb1.a(this, yH);
    }

    public Result c(Status status)
    {
        return g(status);
    }

    public ateDeletedResult g(Status status)
    {
        return new AppStateManager.StateDeletedResult(status) {

            final Status yG;
            final AppStateManager._cls5 yJ;

            public int getStateKey()
            {
                return yJ.yH;
            }

            public Status getStatus()
            {
                return yG;
            }

            
            {
                yJ = AppStateManager._cls5.this;
                yG = status;
                super();
            }
        };
    }

    _cls1.yG(int i)
    {
        yH = i;
        super(null);
    }
}
