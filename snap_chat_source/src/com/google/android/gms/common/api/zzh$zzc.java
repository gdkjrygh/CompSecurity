// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import S;
import android.support.v4.app.FragmentActivity;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import java.util.List;

// Referenced classes of package com.google.android.gms.common.api:
//            zzh

class zzNE
    implements Runnable
{

    private final int zzND;
    private final ConnectionResult zzNE;
    final zzh zzNF;

    public void run()
    {
        if (zzNE.hasResolution())
        {
            try
            {
                int i = zzNF.getActivity().mFragments.f().indexOf(zzNF);
                zzNE.startResolutionForResult(zzNF.getActivity(), (i + 1 << 16) + 1);
                return;
            }
            catch (android.content.nder.SendIntentException sendintentexception)
            {
                zzh.zza(zzNF);
            }
            return;
        }
        if (GooglePlayServicesUtil.isUserRecoverableError(zzNE.getErrorCode()))
        {
            GooglePlayServicesUtil.showErrorDialogFragment(zzNE.getErrorCode(), zzNF.getActivity(), zzNF, 2, zzNF);
            return;
        } else
        {
            zzh.zza(zzNF, zzND, zzNE);
            return;
        }
    }

    public sult(zzh zzh1, int i, ConnectionResult connectionresult)
    {
        zzNF = zzh1;
        super();
        zzND = i;
        zzNE = connectionresult;
    }
}
