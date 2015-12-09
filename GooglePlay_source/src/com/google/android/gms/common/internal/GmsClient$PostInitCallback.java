// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

// Referenced classes of package com.google.android.gms.common.internal:
//            GmsClient

protected final class service extends k
{

    public final IBinder service;
    final GmsClient this$0;

    protected final void handleServiceFailure(ConnectionResult connectionresult)
    {
        if (GmsClient.access$700(GmsClient.this) != null)
        {
            GmsClient.access$700(GmsClient.this).onConnectionFailed(connectionresult);
        }
        onConnectionFailed(connectionresult);
    }

    protected final boolean handleServiceSuccess()
    {
        String s;
        try
        {
            s = service.getInterfaceDescriptor();
        }
        catch (RemoteException remoteexception)
        {
            Log.w("GmsClient", "service probably died");
            return false;
        }
        if (!getServiceDescriptor().equals(s))
        {
            Log.e("GmsClient", (new StringBuilder("service descriptor mismatch: ")).append(getServiceDescriptor()).append(" vs. ").append(s).toString());
        } else
        {
            android.os.IInterface iinterface = createServiceInterface(service);
            if (iinterface != null && GmsClient.access$400(GmsClient.this, 2, 3, iinterface))
            {
                Bundle bundle = getConnectionHint();
                if (GmsClient.access$300(GmsClient.this) != null)
                {
                    GmsClient.access$300(GmsClient.this).onConnected(bundle);
                }
                return true;
            }
        }
        return false;
    }

    public cks(int i, IBinder ibinder, Bundle bundle)
    {
        this$0 = GmsClient.this;
        super(GmsClient.this, i, bundle);
        service = ibinder;
    }
}
