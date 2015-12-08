// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.support.v4.app.FragmentActivity;
import android.support.v4.app.h;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import java.util.List;

// Referenced classes of package com.google.android.gms.common.api:
//            zzl

private class c
    implements Runnable
{

    final zzl a;
    private final int b;
    private final ConnectionResult c;

    public void run()
    {
        if (!zzl.zza(a) || zzl.zzb(a))
        {
            return;
        }
        zzl.zza(a, true);
        zzl.zza(a, b);
        zzl.zza(a, c);
        if (c.hasResolution())
        {
            try
            {
                int i = a.getActivity().f().f().indexOf(a);
                c.startResolutionForResult(a.getActivity(), (i + 1 << 16) + 1);
                return;
            }
            catch (android.content.Sender.SendIntentException sendintentexception)
            {
                zzl.zzc(a);
            }
            return;
        }
        if (GooglePlayServicesUtil.isUserRecoverableError(c.getErrorCode()))
        {
            GooglePlayServicesUtil.showErrorDialogFragment(c.getErrorCode(), a.getActivity(), a, 2, a);
            return;
        } else
        {
            zzl.zza(a, b, c);
            return;
        }
    }

    public Result(zzl zzl1, int i, ConnectionResult connectionresult)
    {
        a = zzl1;
        super();
        b = i;
        c = connectionresult;
    }
}
