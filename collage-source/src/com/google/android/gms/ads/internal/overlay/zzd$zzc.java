// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.gms.internal.hs;

// Referenced classes of package com.google.android.gms.ads.internal.overlay:
//            zzd

public static class <init>
{

    public final Context context;
    public final int index;
    public final android.view.p.LayoutParams zzAM;
    public final ViewGroup zzAN;

    public _cls9(hs hs1)
        throws _cls9
    {
        zzAM = hs1.getLayoutParams();
        android.view.ViewParent viewparent = hs1.getParent();
        context = hs1.d();
        if (viewparent != null && (viewparent instanceof ViewGroup))
        {
            zzAN = (ViewGroup)viewparent;
            index = zzAN.indexOfChild(hs1.getWebView());
            zzAN.removeView(hs1.getWebView());
            hs1.a(true);
            return;
        } else
        {
            throw new <init>("Could not get the parent of the WebView for an overlay.");
        }
    }
}
