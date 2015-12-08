// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.view.ViewGroup;

// Referenced classes of package com.google.android.gms.internal:
//            cg, ey

private static final class <init>
{

    public final int index;
    public final android.view.roup.LayoutParams or;
    public final ViewGroup os;

    public (ey ey1)
        throws 
    {
        or = ey1.getLayoutParams();
        android.view.ViewParent viewparent = ey1.getParent();
        if (viewparent instanceof ViewGroup)
        {
            os = (ViewGroup)viewparent;
            index = os.indexOfChild(ey1);
            os.removeView(ey1);
            ey1.q(true);
            return;
        } else
        {
            throw new <init>("Could not get the parent of the WebView for an overlay.");
        }
    }
}
