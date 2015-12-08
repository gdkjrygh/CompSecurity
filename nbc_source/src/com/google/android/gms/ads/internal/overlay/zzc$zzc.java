// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.gms.internal.zzid;

// Referenced classes of package com.google.android.gms.ads.internal.overlay:
//            zzc

public static class <init>
{

    public final int index;
    public final Context zzpH;
    public final ViewGroup zzzA;
    public final android.view.p.LayoutParams zzzz;

    public _cls9(zzid zzid1)
        throws _cls9
    {
        zzzz = zzid1.getLayoutParams();
        android.view.ViewParent viewparent = zzid1.getParent();
        zzpH = zzid1.zzgC();
        if (viewparent != null && (viewparent instanceof ViewGroup))
        {
            zzzA = (ViewGroup)viewparent;
            index = zzzA.indexOfChild(zzid1.getWebView());
            zzzA.removeView(zzid1.getWebView());
            zzid1.zzB(true);
            return;
        } else
        {
            throw new <init>("Could not get the parent of the WebView for an overlay.");
        }
    }
}
