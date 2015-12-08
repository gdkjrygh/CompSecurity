// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.j;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.a;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.b.d;
import com.google.android.gms.b.f;
import com.google.android.gms.internal.dg;

// Referenced classes of package com.google.android.gms.ads.internal.client:
//            n, t, s

public final class g extends f
{

    private static final g a = new g();

    private g()
    {
        super("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl");
    }

    public static s a(Context context, String s, dg dg)
    {
        Object obj;
label0:
        {
            com.google.android.gms.ads.internal.client.n.a();
            if (com.google.android.gms.ads.internal.util.client.a.b(context))
            {
                s s1 = a.b(context, s, dg);
                obj = s1;
                if (s1 != null)
                {
                    break label0;
                }
            }
            com.google.android.gms.ads.internal.util.client.b.a(3);
            obj = new j(context, s, dg, new VersionInfoParcel());
        }
        return ((s) (obj));
    }

    private s b(Context context, String s, dg dg)
    {
        com.google.android.gms.b.c c = d.a(context);
        context = com.google.android.gms.ads.internal.client.s.a.a(((t)a(context)).a(c, s, dg, 0x7877d8));
        return context;
        context;
        com.google.android.gms.ads.internal.util.client.b.b("Could not create remote builder for AdLoader.", context);
_L2:
        return null;
        context;
        com.google.android.gms.ads.internal.util.client.b.b("Could not create remote builder for AdLoader.", context);
        if (true) goto _L2; else goto _L1
_L1:
    }

    protected final Object a(IBinder ibinder)
    {
        return com.google.android.gms.ads.internal.client.t.a.a(ibinder);
    }

}
