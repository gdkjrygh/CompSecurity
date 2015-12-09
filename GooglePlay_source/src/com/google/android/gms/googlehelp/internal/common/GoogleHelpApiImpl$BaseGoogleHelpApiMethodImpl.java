// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.googlehelp.internal.common;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.googlehelp.Help;

// Referenced classes of package com.google.android.gms.googlehelp.internal.common:
//            GoogleHelpApiImpl, GoogleHelpClientImpl, IGoogleHelpService

static abstract class  extends com.google.android.gms.common.api.internal.odImpl
{

    protected final volatile void doExecute(com.google.android.gms.common.api.lpApiMethodImpl lpapimethodimpl)
        throws RemoteException
    {
        lpapimethodimpl = (GoogleHelpClientImpl)lpapimethodimpl;
        android.content.Context context = ((GmsClient) (lpapimethodimpl)).mContext;
        doExecute$5d59a3cd((IGoogleHelpService)lpapimethodimpl.getService());
    }

    protected abstract void doExecute$5d59a3cd(IGoogleHelpService igooglehelpservice)
        throws RemoteException;

    public (GoogleApiClient googleapiclient)
    {
        super(Help.CLIENT_KEY, googleapiclient);
    }
}
