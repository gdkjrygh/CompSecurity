// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;

// Referenced classes of package com.google.android.gms.common.internal:
//            ax, bl, aa, aj, 
//            ah

public final class ae extends ax
{

    private aa a;
    private final int b;

    public ae(aa aa1, int i)
    {
        a = aa1;
        b = i;
    }

    public final void a(int i, Bundle bundle)
    {
        bl.a(a, "onAccountValidationComplete can be called only once per call to validateAccount");
        aa aa1 = a;
        int j = b;
        aa1.b.sendMessage(aa1.b.obtainMessage(5, j, -1, new aj(aa1, i, bundle)));
        a = null;
    }

    public final void a(int i, IBinder ibinder, Bundle bundle)
    {
        bl.a(a, "onPostInitComplete can be called only once per call to getRemoteService");
        aa aa1 = a;
        int j = b;
        aa1.b.sendMessage(aa1.b.obtainMessage(1, j, -1, new ah(aa1, i, ibinder, bundle)));
        a = null;
    }
}
