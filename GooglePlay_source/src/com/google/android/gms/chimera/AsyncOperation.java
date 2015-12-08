// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.chimera;

import android.os.RemoteException;
import com.google.android.gms.common.service.OperationException;

// Referenced classes of package com.google.android.gms.chimera:
//            BaseAsyncOperationService

public interface AsyncOperation
{

    public abstract void execute(BaseAsyncOperationService baseasyncoperationservice)
        throws OperationException, RemoteException;
}
