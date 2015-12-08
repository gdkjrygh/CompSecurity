// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.support.v4.app.FragmentActivity;
import android.support.v4.app.u;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.e;
import java.util.List;

// Referenced classes of package com.google.android.gms.common.api:
//            au

final class ax
    implements Runnable
{

    final au a;
    private final int b;
    private final ConnectionResult c;

    public ax(au au1, int i, ConnectionResult connectionresult)
    {
        a = au1;
        super();
        b = i;
        c = connectionresult;
    }

    public final void run()
    {
        if (c.a())
        {
            try
            {
                int i = a.getActivity().getSupportFragmentManager().f().indexOf(a);
                c.a(a.getActivity(), (i + 1 << 16) + 1);
                return;
            }
            catch (android.content.IntentSender.SendIntentException sendintentexception)
            {
                au.a(a);
            }
            return;
        }
        if (e.b(c.c()))
        {
            e.a(c.c(), a.getActivity(), a, a);
            return;
        } else
        {
            au.a(a, b, c);
            return;
        }
    }
}
