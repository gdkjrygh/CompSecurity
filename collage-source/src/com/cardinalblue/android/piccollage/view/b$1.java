// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view;

import android.view.View;
import bolts.i;
import bolts.j;
import com.google.android.gms.ads.formats.NativeAppInstallAd;
import com.google.android.gms.ads.formats.NativeAppInstallAdView;
import com.google.android.gms.ads.formats.NativeContentAd;
import com.google.android.gms.ads.formats.NativeContentAdView;

// Referenced classes of package com.cardinalblue.android.piccollage.view:
//            b

class a
    implements i
{

    final b a;

    public Object then(j j1)
        throws Exception
    {
        if (j1.e() instanceof NativeContentAd)
        {
            j1 = (NativeContentAd)j1.e();
            NativeContentAdView nativecontentadview = (NativeContentAdView)a.itemView.findViewById(0x7f10016f);
            nativecontentadview.setVisibility(0);
            a.itemView.findViewById(0x7f100176).setVisibility(8);
            b.a(a, j1, nativecontentadview);
        } else
        if (j1.e() instanceof NativeAppInstallAd)
        {
            j1 = (NativeAppInstallAd)j1.e();
            NativeAppInstallAdView nativeappinstalladview = (NativeAppInstallAdView)a.itemView.findViewById(0x7f100176);
            nativeappinstalladview.setVisibility(0);
            a.itemView.findViewById(0x7f10016f).setVisibility(8);
            b.a(a, j1, nativeappinstalladview);
            return null;
        }
        return null;
    }

    nstallAdView(b b1)
    {
        a = b1;
        super();
    }
}
