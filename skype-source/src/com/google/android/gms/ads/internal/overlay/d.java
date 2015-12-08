// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.ads.internal.client.a;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.it;

// Referenced classes of package com.google.android.gms.ads.internal.overlay:
//            AdOverlayInfoParcel, a

public final class d
{

    public d()
    {
    }

    public static void a(Context context, AdOverlayInfoParcel adoverlayinfoparcel, boolean flag)
    {
        if (adoverlayinfoparcel.l == 4 && adoverlayinfoparcel.d == null)
        {
            if (adoverlayinfoparcel.c != null)
            {
                adoverlayinfoparcel.c.e();
            }
            p.b();
            com.google.android.gms.ads.internal.overlay.a.a(context, adoverlayinfoparcel.b, adoverlayinfoparcel.j);
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.ads.AdActivity");
        intent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", adoverlayinfoparcel.n.e);
        intent.putExtra("shouldCallOnOverlayOpened", flag);
        com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel.a(intent, adoverlayinfoparcel);
        if (!it.h())
        {
            intent.addFlags(0x80000);
        }
        if (!(context instanceof Activity))
        {
            intent.addFlags(0x10000000);
        }
        context.startActivity(intent);
    }
}
