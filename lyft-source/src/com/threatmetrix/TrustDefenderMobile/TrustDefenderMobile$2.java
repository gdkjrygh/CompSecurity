// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.threatmetrix.TrustDefenderMobile;

import android.util.Log;

// Referenced classes of package com.threatmetrix.TrustDefenderMobile:
//            CompleteProfile, TrustDefenderMobile, NativeGatherer, ProfileState

class  extends CompleteProfile
{

    final long a;
    final int b;
    final int c;
    final ckageScanCallSource d;
    final TrustDefenderMobile e;

    public void run()
    {
        byte byte0 = 0;
        if ((a & 12288L) != 0L)
        {
            byte0 = 2;
        }
        if ((a & 16384L) != 0L) goto _L2; else goto _L1
_L1:
        int i = byte0;
        if ((a & 8192L) == 0L) goto _L3; else goto _L2
_L3:
        Exception exception;
        try
        {
            NativeGatherer.a().a(TrustDefenderMobile.c(e), i, b, c);
        }
        catch (InterruptedException interruptedexception)
        {
            Log.d(TrustDefenderMobile.h(), (new StringBuilder()).append("doPackageScan(").append(d).append("): complete").toString());
            e.b.n();
            return;
        }
        finally
        {
            Log.d(TrustDefenderMobile.h(), (new StringBuilder()).append("doPackageScan(").append(d).append("): complete").toString());
        }
        Log.d(TrustDefenderMobile.h(), (new StringBuilder()).append("doPackageScan(").append(d).append("): complete").toString());
        e.b.n();
        return;
        e.b.n();
        throw exception;
_L2:
        i = byte0 | 1;
        if (true) goto _L3; else goto _L4
_L4:
    }

    ckageScanCallSource(TrustDefenderMobile trustdefendermobile, TrustDefenderMobile trustdefendermobile1, long l, int i, int j, ckageScanCallSource ckagescancallsource)
    {
        e = trustdefendermobile;
        a = l;
        b = i;
        c = j;
        d = ckagescancallsource;
        super(trustdefendermobile1);
    }
}
