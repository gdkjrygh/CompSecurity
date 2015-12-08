// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal:
//            df, dg, da, gr

class ra
    implements Runnable
{

    final df qZ;
    final com.google.ads.uest.ErrorCode ra;

    public void run()
    {
        try
        {
            df.a(qZ).onAdFailedToLoad(dg.a(ra));
            return;
        }
        catch (RemoteException remoteexception)
        {
            gr.d("Could not call onAdFailedToLoad.", remoteexception);
        }
    }

    (df df1, com.google.ads.uest.ErrorCode errorcode)
    {
        qZ = df1;
        ra = errorcode;
        super();
    }
}
