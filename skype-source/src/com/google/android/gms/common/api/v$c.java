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
//            v

private final class c
    implements Runnable
{

    final v a;
    private final int b;
    private final ConnectionResult c;

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
            catch (android.content.ntSender.SendIntentException sendintentexception)
            {
                v.a(a);
            }
            return;
        }
        if (e.b(c.c()))
        {
            e.a(c.c(), a.getActivity(), a, a);
            return;
        } else
        {
            v.a(a, b, c);
            return;
        }
    }

    public onResult(v v1, int i, ConnectionResult connectionresult)
    {
        a = v1;
        super();
        b = i;
        c = connectionresult;
    }
}
