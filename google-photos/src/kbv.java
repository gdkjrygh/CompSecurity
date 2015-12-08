// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

public final class kbv extends kbp
{

    private IBinder a;
    private kbo b;

    public kbv(kbo kbo1, int i, IBinder ibinder, Bundle bundle)
    {
        b = kbo1;
        super(kbo1, i, bundle);
        a = ibinder;
    }

    protected final void a(ConnectionResult connectionresult)
    {
        if (kbo.e(b) != null)
        {
            kbo.e(b).a(connectionresult);
        }
        b.a(connectionresult);
    }

    protected final boolean a()
    {
        String s;
        try
        {
            s = a.getInterfaceDescriptor();
        }
        catch (RemoteException remoteexception)
        {
            Log.w("GmsClient", "service probably died");
            return false;
        }
        if (!b.d().equals(s))
        {
            Log.e("GmsClient", (new StringBuilder("service descriptor mismatch: ")).append(b.d()).append(" vs. ").append(s).toString());
        } else
        {
            android.os.IInterface iinterface = b.a(a);
            if (iinterface != null && kbo.a(b, 2, 3, iinterface))
            {
                Bundle bundle = b.b();
                if (kbo.b(b) != null)
                {
                    kbo.b(b).a(bundle);
                }
                return true;
            }
        }
        return false;
    }
}
