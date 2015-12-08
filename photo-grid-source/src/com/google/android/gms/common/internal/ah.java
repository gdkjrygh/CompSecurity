// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;

// Referenced classes of package com.google.android.gms.common.internal:
//            ab, aa

public final class ah extends ab
{

    public final IBinder e;
    final aa f;

    public ah(aa aa1, int i, IBinder ibinder, Bundle bundle)
    {
        f = aa1;
        super(aa1, i, bundle);
        e = ibinder;
    }

    protected final void a(ConnectionResult connectionresult)
    {
        if (aa.e(f) != null)
        {
            aa.e(f).onConnectionFailed(connectionresult);
        }
        aa.g_();
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
            if (iinterface != null && aa.a(f, 2, 3, iinterface))
            {
                Bundle bundle = f.zzmS();
                if (aa.b(f) != null)
                {
                    aa.b(f).onConnected(bundle);
                }
                return true;
            }
        }
        return false;
    }
}
