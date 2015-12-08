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

    protected final void a(ConnectionResult connectionresult)
    {
        if (m.e(f) != null)
        {
            m.e(f).onConnectionFailed(connectionresult);
        }
        m.h();
    }

    protected final boolean a()
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
        if (!f.b().equals(s))
        {
            Log.e("GmsClient", (new StringBuilder("service descriptor mismatch: ")).append(f.b()).append(" vs. ").append(s).toString());
        } else
        {
            android.os.IInterface iinterface = f.a(e);
            if (iinterface != null && m.a(f, 2, 3, iinterface))
            {
                if (m.b(f) != null)
                {
                    m.b(f).onConnected(null);
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
