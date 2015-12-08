// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.gms.internal.ry;

// Referenced classes of package com.google.android.gms.ads.internal.overlay:
//            i

public class 
{

    public final Context context;
    public final int index;
    public final android.view.p.LayoutParams zzBw;
    public final ViewGroup zzBx;

    public _cls9(ry ry1)
    {
        zzBw = ry1.getLayoutParams();
        android.view.ViewParent viewparent = ry1.getParent();
        context = ry1.f();
        if (viewparent != null && (viewparent instanceof ViewGroup))
        {
            zzBx = (ViewGroup)viewparent;
            index = zzBx.indexOfChild(ry1.b());
            zzBx.removeView(ry1.b());
            ry1.a(true);
            return;
        } else
        {
            throw new i("Could not get the parent of the WebView for an overlay.");
        }
    }
}
