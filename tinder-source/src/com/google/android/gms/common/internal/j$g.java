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
//            j

protected final class e extends e
{

    public final IBinder e;
    final j f;

    protected final void a(ConnectionResult connectionresult)
    {
        if (j.e(f) != null)
        {
            j.e(f).a(connectionresult);
        }
        j.g_();
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
        if (!f.f().equals(s))
        {
            Log.e("GmsClient", (new StringBuilder("service descriptor mismatch: ")).append(f.f()).append(" vs. ").append(s).toString());
        } else
        {
            android.os.IInterface iinterface = f.a(e);
            if (iinterface != null && j.a(f, 2, 3, iinterface))
            {
                if (j.b(f) != null)
                {
                    j.b(f).a(null);
                }
                return true;
            }
        }
        return false;
    }

    public ult(j j1, int i, IBinder ibinder, Bundle bundle)
    {
        f = j1;
        super(j1, i, bundle);
        e = ibinder;
    }
}
