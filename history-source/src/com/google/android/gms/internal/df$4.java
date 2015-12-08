// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal:
//            df, da, gr

class qZ
    implements Runnable
{

    final df qZ;

    public void run()
    {
        try
        {
            df.a(qZ).onAdClosed();
            return;
        }
        catch (RemoteException remoteexception)
        {
            gr.d("Could not call onAdClosed.", remoteexception);
        }
    }

    (df df1)
    {
        qZ = df1;
        super();
    }
}
