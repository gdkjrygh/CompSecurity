// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;

// Referenced classes of package com.google.android.gms.common.internal:
//            zzi

public final class e extends e
{

    public final IBinder e;
    final zzi f;

    protected void a(ConnectionResult connectionresult)
    {
        if (zzi.e(f) != null)
        {
            zzi.e(f).onConnectionFailed(connectionresult);
        }
        f.a(connectionresult);
    }

    protected boolean a()
    {
        String s;
        try
        {
            s = e.getInterfaceDescriptor();
        }
        catch (RemoteException remoteexception)
        {
            Log.w("GmsClient", "service probably died");
            return false;
        }
        if (!f.e().equals(s))
        {
            Log.e("GmsClient", (new StringBuilder()).append("service descriptor mismatch: ").append(f.e()).append(" vs. ").append(s).toString());
        } else
        {
            android.os.IInterface iinterface = f.a(e);
            if (iinterface != null && zzi.a(f, 2, 3, iinterface))
            {
                Bundle bundle = f.e_();
                if (zzi.b(f) != null)
                {
                    zzi.b(f).onConnected(bundle);
                }
                GooglePlayServicesUtil.c(zzi.f(f));
                return true;
            }
        }
        return false;
    }

    public sUtil(zzi zzi1, int i, IBinder ibinder, Bundle bundle)
    {
        f = zzi1;
        super(zzi1, i, bundle);
        e = ibinder;
    }
}
