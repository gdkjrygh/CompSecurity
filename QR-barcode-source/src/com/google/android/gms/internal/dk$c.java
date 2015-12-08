// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.view.ViewGroup;

// Referenced classes of package com.google.android.gms.internal:
//            dk, gv

private static final class <init>
{

    public final int index;
    public final android.view.roup.LayoutParams rI;
    public final ViewGroup rJ;

    public (gv gv1)
        throws 
    {
        rI = gv1.getLayoutParams();
        android.view.ViewParent viewparent = gv1.getParent();
        if (viewparent instanceof ViewGroup)
        {
            rJ = (ViewGroup)viewparent;
            index = rJ.indexOfChild(gv1);
            rJ.removeView(gv1);
            gv1.x(true);
            return;
        } else
        {
            throw new <init>("Could not get the parent of the WebView for an overlay.");
        }
    }
}
