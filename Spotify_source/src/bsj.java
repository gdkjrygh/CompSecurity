// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

public final class bsj extends bsd
{

    private IBinder a;
    private bsc b;

    public bsj(bsc bsc1, int i, IBinder ibinder, Bundle bundle)
    {
        b = bsc1;
        super(bsc1, i, bundle);
        a = ibinder;
    }

    protected final void a(ConnectionResult connectionresult)
    {
        if (bsc.e(b) != null)
        {
            bsc.e(b).a(connectionresult);
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
        if (!b.b().equals(s))
        {
            Log.e("GmsClient", (new StringBuilder("service descriptor mismatch: ")).append(b.b()).append(" vs. ").append(s).toString());
        } else
        {
            android.os.IInterface iinterface = b.a(a);
            if (iinterface != null && bsc.a(b, 2, 3, iinterface))
            {
                Bundle bundle = b.l_();
                if (bsc.b(b) != null)
                {
                    bsc.b(b).a(bundle);
                }
                return true;
            }
        }
        return false;
    }
}
