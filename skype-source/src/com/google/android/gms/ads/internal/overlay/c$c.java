// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.gms.internal.hi;

// Referenced classes of package com.google.android.gms.ads.internal.overlay:
//            c

public static final class <init>
{

    public final int a;
    public final android.view.Group.LayoutParams b;
    public final ViewGroup c;
    public final Context d;

    public (hi hi1)
        throws 
    {
        b = hi1.getLayoutParams();
        android.view.ViewParent viewparent = hi1.getParent();
        d = hi1.e();
        if (viewparent != null && (viewparent instanceof ViewGroup))
        {
            c = (ViewGroup)viewparent;
            a = c.indexOfChild(hi1.a());
            c.removeView(hi1.a());
            hi1.b(true);
            return;
        } else
        {
            throw new <init>("Could not get the parent of the WebView for an overlay.");
        }
    }
}
