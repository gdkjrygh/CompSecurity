// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.k;
import com.google.android.gms.ads.internal.overlay.i;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.a;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.b.d;
import com.google.android.gms.b.f;
import com.google.android.gms.internal.cd;
import com.google.android.gms.internal.dg;

// Referenced classes of package com.google.android.gms.ads.internal.client:
//            v, n, AdSizeParcel, u

public final class h extends f
{

    public h()
    {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    private u a(Context context, AdSizeParcel adsizeparcel, String s, dg dg, int j)
    {
        com.google.android.gms.b.c c = d.a(context);
        context = com.google.android.gms.ads.internal.client.u.a.a(((v)a(context)).a(c, adsizeparcel, s, dg, 0x7877d8, j));
        return context;
        context;
_L2:
        com.google.android.gms.ads.internal.util.client.b.a(3);
        return null;
        context;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final u a(Context context, AdSizeParcel adsizeparcel, String s, dg dg)
    {
        Object obj;
label0:
        {
            com.google.android.gms.ads.internal.client.n.a();
            if (com.google.android.gms.ads.internal.util.client.a.b(context))
            {
                u u = a(context, adsizeparcel, s, dg, 1);
                obj = u;
                if (u != null)
                {
                    break label0;
                }
            }
            com.google.android.gms.ads.internal.util.client.b.a(3);
            obj = new com.google.android.gms.ads.internal.f(context, adsizeparcel, s, dg, new VersionInfoParcel());
        }
        return ((u) (obj));
    }

    protected final Object a(IBinder ibinder)
    {
        return com.google.android.gms.ads.internal.client.v.a.a(ibinder);
    }

    public final u b(Context context, AdSizeParcel adsizeparcel, String s, dg dg)
    {
        Object obj;
label0:
        {
            com.google.android.gms.ads.internal.client.n.a();
            if (com.google.android.gms.ads.internal.util.client.a.b(context))
            {
                u u = a(context, adsizeparcel, s, dg, 2);
                obj = u;
                if (u != null)
                {
                    break label0;
                }
            }
            com.google.android.gms.ads.internal.util.client.b.c("Using InterstitialAdManager from the client jar.");
            obj = new k(context, adsizeparcel, s, dg, new VersionInfoParcel(), new com.google.android.gms.ads.internal.d(new cd(), new i()));
        }
        return ((u) (obj));
    }
}
