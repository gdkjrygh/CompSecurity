// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.ads.mediation.MediationAdapter;
import com.google.ads.mediation.NetworkExtras;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            az, cn, ax

public final class av extends aw.a
{

    private Map fq;

    public av()
    {
    }

    private ax h(String s)
        throws RemoteException
    {
        Object obj;
        try
        {
            obj = (MediationAdapter)Class.forName(s).newInstance();
            obj = new az(((MediationAdapter) (obj)), (NetworkExtras)fq.get(((MediationAdapter) (obj)).getAdditionalParametersType()));
        }
        catch (Throwable throwable)
        {
            cn.q((new StringBuilder()).append("Could not instantiate mediation adapter: ").append(s).append(". ").append(throwable.getMessage()).toString());
            throw new RemoteException();
        }
        return ((ax) (obj));
    }

    public void c(Map map)
    {
        fq = map;
    }

    public ax g(String s)
        throws RemoteException
    {
        return h(s);
    }
}
