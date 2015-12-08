// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Dialog;
import android.support.v4.app.i;
import android.support.v4.app.m;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.b;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            dq, do

private final class c
    implements Runnable
{

    final dq a;
    private final int b;
    private final ConnectionResult c;

    public final void run()
    {
        if (!dq.a(a) || com.google.android.gms.internal.dq.b(a))
        {
            return;
        }
        dq.c(a);
        dq.a(a, b);
        dq.a(a, c);
        if (c.a())
        {
            try
            {
                int j = a.getActivity().getSupportFragmentManager().f().indexOf(a);
                c.a(a.getActivity(), (j + 1 << 16) + 1);
                return;
            }
            catch (android.content.tSender.SendIntentException sendintentexception)
            {
                dq.d(a);
            }
            return;
        }
        dq.a();
        if (com.google.android.gms.common.b.a(c.c))
        {
            GooglePlayServicesUtil.showErrorDialogFragment(c.c, a.getActivity(), a, 2, a);
            return;
        }
        if (c.c == 18)
        {
            dq.a();
            Dialog dialog = com.google.android.gms.common.b.a(a.getActivity(), a);
            dq.a(a, com.google.android.gms.internal.do.a(a.getActivity().getApplicationContext(), new do(dialog) {

                final Dialog b;
                final dq.b c;

                protected final void a()
                {
                    dq.d(c.a);
                    b.dismiss();
                }

            
            {
                c = dq.b.this;
                b = dialog;
                super();
            }
            }));
            return;
        } else
        {
            dq.a(a, b, c);
            return;
        }
    }

    public ionResult(dq dq1, int j, ConnectionResult connectionresult)
    {
        a = dq1;
        super();
        b = j;
        c = connectionresult;
    }
}
