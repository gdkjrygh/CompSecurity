// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.n;
import com.google.android.gms.ads.internal.formats.j;
import com.google.android.gms.ads.internal.util.client.a;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.b.d;
import com.google.android.gms.b.f;

// Referenced classes of package com.google.android.gms.internal:
//            bn, bm

public final class bx extends f
{

    public bx()
    {
        super("com.google.android.gms.ads.NativeAdViewDelegateCreatorImpl");
    }

    private bm b(Context context, FrameLayout framelayout, FrameLayout framelayout1)
    {
        com.google.android.gms.b.c c = d.a(context);
        framelayout = d.a(framelayout);
        framelayout1 = d.a(framelayout1);
        context = com.google.android.gms.internal.bm.a.a(((bn)a(context)).a(c, framelayout, framelayout1, 0x7877d8));
        return context;
        context;
_L2:
        com.google.android.gms.ads.internal.util.client.b.b("Could not create remote NativeAdViewDelegate.", context);
        return null;
        context;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final bm a(Context context, FrameLayout framelayout, FrameLayout framelayout1)
    {
label0:
        {
            n.a();
            if (com.google.android.gms.ads.internal.util.client.a.b(context))
            {
                bm bm = b(context, framelayout, framelayout1);
                context = bm;
                if (bm != null)
                {
                    break label0;
                }
            }
            com.google.android.gms.ads.internal.util.client.b.a(3);
            context = new j(framelayout, framelayout1);
        }
        return context;
    }

    protected final Object a(IBinder ibinder)
    {
        return com.google.android.gms.internal.bn.a.a(ibinder);
    }
}
