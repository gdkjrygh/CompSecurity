// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.common.internal:
//            GetServiceRequest

public abstract class GetServicePostProcessor
{

    protected final Context mContext;

    protected GetServicePostProcessor(Context context)
    {
        mContext = context;
    }

    public abstract boolean process$18b81057(GetServiceRequest getservicerequest, int i)
        throws RemoteException;
}
