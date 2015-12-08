// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.b;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            uz, vc, ux

final class vb
    implements Runnable
{

    final uz a;
    private final int b;
    private final ConnectionResult c;

    public vb(uz uz1, int i, ConnectionResult connectionresult)
    {
        a = uz1;
        super();
        b = i;
        c = connectionresult;
    }

    public final void run()
    {
        if (!uz.a(a) || com.google.android.gms.internal.uz.b(a))
        {
            return;
        }
        uz.c(a);
        uz.a(a, b);
        uz.a(a, c);
        if (c.a())
        {
            try
            {
                int i = a.getActivity().getSupportFragmentManager().getFragments().indexOf(a);
                c.a(a.getActivity(), (i + 1 << 16) + 1);
                return;
            }
            catch (android.content.IntentSender.SendIntentException sendintentexception)
            {
                uz.d(a);
            }
            return;
        }
        uz.a();
        if (com.google.android.gms.common.b.a(c.c()))
        {
            GooglePlayServicesUtil.showErrorDialogFragment(c.c(), a.getActivity(), a, 2, a);
            return;
        }
        if (c.c() == 18)
        {
            uz.a();
            android.app.Dialog dialog = com.google.android.gms.common.b.a(a.getActivity(), a);
            uz.a(a, ux.a(a.getActivity().getApplicationContext(), new vc(this, dialog)));
            return;
        } else
        {
            uz.a(a, b, c);
            return;
        }
    }
}
