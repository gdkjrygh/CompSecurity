// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import java.util.List;

// Referenced classes of package com.google.android.gms.common.api:
//            g

private class KM
    implements Runnable
{

    private final int KL;
    private final ConnectionResult KM;
    final g KN;

    public void run()
    {
        if (KM.hasResolution())
        {
            try
            {
                int i = KN.getActivity().getSupportFragmentManager().getFragments().indexOf(KN);
                KM.startResolutionForResult(KN.getActivity(), (i + 1 << 16) + 1);
                return;
            }
            catch (android.content.ntSender.SendIntentException sendintentexception)
            {
                g.a(KN);
            }
            return;
        }
        if (GooglePlayServicesUtil.isUserRecoverableError(KM.getErrorCode()))
        {
            GooglePlayServicesUtil.showErrorDialogFragment(KM.getErrorCode(), KN.getActivity(), KN, 2, KN);
            return;
        } else
        {
            g.a(KN, KL, KM);
            return;
        }
    }

    public onResult(g g1, int i, ConnectionResult connectionresult)
    {
        KN = g1;
        super();
        KL = i;
        KM = connectionresult;
    }
}
