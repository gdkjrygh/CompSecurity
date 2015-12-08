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

final class Tx
    implements Runnable
{

    private final int Tw;
    private final ConnectionResult Tx;
    final g Ty;

    public final void run()
    {
        if (Tx.hasResolution())
        {
            try
            {
                int i = Ty.getActivity().getSupportFragmentManager().getFragments().indexOf(Ty);
                Tx.startResolutionForResult(Ty.getActivity(), (i + 1 << 16) + 1);
                return;
            }
            catch (android.content.ntSender.SendIntentException sendintentexception)
            {
                g.a(Ty);
            }
            return;
        }
        if (GooglePlayServicesUtil.isUserRecoverableError(Tx.getErrorCode()))
        {
            GooglePlayServicesUtil.showErrorDialogFragment(Tx.getErrorCode(), Ty.getActivity(), Ty, 2, Ty);
            return;
        } else
        {
            g.a(Ty, Tw, Tx);
            return;
        }
    }

    public onResult(g g1, int i, ConnectionResult connectionresult)
    {
        Ty = g1;
        super();
        Tw = i;
        Tx = connectionresult;
    }
}
