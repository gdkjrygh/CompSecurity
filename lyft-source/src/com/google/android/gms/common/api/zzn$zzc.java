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
//            zzn

class c
    implements Runnable
{

    final zzn a;
    private final int b;
    private final ConnectionResult c;

    public void run()
    {
        if (c.a())
        {
            try
            {
                int i = a.getActivity().getSupportFragmentManager().getFragments().indexOf(a);
                c.a(a.getActivity(), (i + 1 << 16) + 1);
                return;
            }
            catch (android.content.nder.SendIntentException sendintentexception)
            {
                zzn.a(a);
            }
            return;
        }
        if (GooglePlayServicesUtil.c(c.c()))
        {
            GooglePlayServicesUtil.a(c.c(), a.getActivity(), a, 2, a);
            return;
        } else
        {
            zzn.a(a, b, c);
            return;
        }
    }

    public sult(zzn zzn1, int i, ConnectionResult connectionresult)
    {
        a = zzn1;
        super();
        b = i;
        c = connectionresult;
    }
}
