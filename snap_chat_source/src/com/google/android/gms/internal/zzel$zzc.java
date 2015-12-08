// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.view.ViewGroup;

// Referenced classes of package com.google.android.gms.internal:
//            zzel, zzic

public static class <init>
{

    public final int index;
    public final Context zzlN;
    public final android.view..LayoutParams zzul;
    public final ViewGroup zzum;

    public (zzic zzic1)
    {
        zzul = zzic1.getLayoutParams();
        android.view.ViewParent viewparent = zzic1.getParent();
        zzlN = zzic1.zzeE();
        if (viewparent != null && (viewparent instanceof ViewGroup))
        {
            zzum = (ViewGroup)viewparent;
            index = zzum.indexOfChild(zzic1.getWebView());
            zzum.removeView(zzic1.getWebView());
            zzic1.zzA(true);
            return;
        } else
        {
            throw new <init>("Could not get the parent of the WebView for an overlay.");
        }
    }
}
