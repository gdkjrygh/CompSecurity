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
//            d

private class JL
    implements Runnable
{

    private final int JK;
    private final ConnectionResult JL;
    final d JM;

    public void run()
    {
        if (JL.hasResolution())
        {
            try
            {
                int i = JM.getActivity().getSupportFragmentManager().getFragments().indexOf(JM);
                JL.startResolutionForResult(JM.getActivity(), (i + 1 << 16) + 1);
                return;
            }
            catch (android.content.ntSender.SendIntentException sendintentexception)
            {
                d.a(JM);
            }
            return;
        }
        if (GooglePlayServicesUtil.isUserRecoverableError(JL.getErrorCode()))
        {
            GooglePlayServicesUtil.showErrorDialogFragment(JL.getErrorCode(), JM.getActivity(), JM, 2, JM);
            return;
        } else
        {
            d.a(JM, JK, JL);
            return;
        }
    }

    public onResult(d d1, int i, ConnectionResult connectionresult)
    {
        JM = d1;
        super();
        JK = i;
        JL = connectionresult;
    }
}
