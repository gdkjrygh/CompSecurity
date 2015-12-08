// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.view.ViewGroup;

// Referenced classes of package com.google.android.gms.internal:
//            cc, dz

private static final class <init>
{

    public final int index;
    public final android.view.roup.LayoutParams oe;
    public final ViewGroup of;

    public (dz dz1)
        throws 
    {
        oe = dz1.getLayoutParams();
        android.view.ViewParent viewparent = dz1.getParent();
        if (viewparent instanceof ViewGroup)
        {
            of = (ViewGroup)viewparent;
            index = of.indexOfChild(dz1);
            of.removeView(dz1);
            dz1.p(true);
            return;
        } else
        {
            throw new <init>("Could not get the parent of the WebView for an overlay.");
        }
    }
}
