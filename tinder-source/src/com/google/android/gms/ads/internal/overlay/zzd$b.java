// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.gms.internal.cw;

// Referenced classes of package com.google.android.gms.ads.internal.overlay:
//            zzd

public static final class a
{

    public final int a;
    public final android.view.oup.LayoutParams b;
    public final ViewGroup c;
    public final Context d;

    public a(cw cw1)
        throws a
    {
        b = cw1.getLayoutParams();
        android.view.ViewParent viewparent = cw1.getParent();
        d = cw1.d();
        if (viewparent != null && (viewparent instanceof ViewGroup))
        {
            c = (ViewGroup)viewparent;
            a = c.indexOfChild(cw1.getView());
            c.removeView(cw1.getView());
            cw1.a(true);
            return;
        } else
        {
            throw new a("Could not get the parent of the WebView for an overlay.");
        }
    }
}
