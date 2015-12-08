// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.support.v4.app.FragmentActivity;
import android.support.v4.app.l;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.e;
import java.util.List;

// Referenced classes of package com.google.android.gms.common.api:
//            u

private final class c
    implements Runnable
{

    final u a;
    private final int b;
    private final ConnectionResult c;

    public final void run()
    {
        if (!u.a(a) || u.b(a))
        {
            return;
        }
        u.c(a);
        u.a(a, b);
        u.a(a, c);
        if (c.a())
        {
            try
            {
                int i = a.getActivity().getSupportFragmentManager().f().indexOf(a);
                c.a(a.getActivity(), (i + 1 << 16) + 1);
                return;
            }
            catch (android.content.ntSender.SendIntentException sendintentexception)
            {
                u.d(a);
            }
            return;
        }
        if (e.b(c.c()))
        {
            e.a(c.c(), a.getActivity(), a, a);
            return;
        } else
        {
            u.a(a, b, c);
            return;
        }
    }

    public onResult(u u1, int i, ConnectionResult connectionresult)
    {
        a = u1;
        super();
        b = i;
        c = connectionresult;
    }
}
