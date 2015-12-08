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
//            m

protected final class e extends e
{

    public final IBinder e;
    final m f;

    protected void a(ConnectionResult connectionresult)
    {
        if (m.zze(f) != null)
        {
            m.zze(f).onConnectionFailed(connectionresult);
        }
        f.onConnectionFailed(connectionresult);
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
        if (!f.zzfB().equals(s))
        {
            Log.e("GmsClient", (new StringBuilder()).append("service descriptor mismatch: ").append(f.zzfB()).append(" vs. ").append(s).toString());
        } else
        {
            android.os.IInterface iinterface = f.zzV(e);
            if (iinterface != null && m.zza(f, 2, 3, iinterface))
            {
                Bundle bundle = f.zzmw();
                if (m.zzb(f) != null)
                {
                    m.zzb(f).onConnected(bundle);
                }
                return true;
            }
        }
        return false;
    }

    public ult(m m1, int i, IBinder ibinder, Bundle bundle)
    {
        f = m1;
        super(m1, i, bundle);
        e = ibinder;
    }
}
