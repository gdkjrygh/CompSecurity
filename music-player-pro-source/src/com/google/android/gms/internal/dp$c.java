// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.view.ViewGroup;

// Referenced classes of package com.google.android.gms.internal:
//            dp, gu

private static final class <init>
{

    public final int index;
    public final android.view.roup.LayoutParams rZ;
    public final ViewGroup sa;

    public (gu gu1)
        throws 
    {
        rZ = gu1.getLayoutParams();
        android.view.ViewParent viewparent = gu1.getParent();
        if (viewparent instanceof ViewGroup)
        {
            sa = (ViewGroup)viewparent;
            index = sa.indexOfChild(gu1);
            sa.removeView(gu1);
            gu1.z(true);
            return;
        } else
        {
            throw new <init>("Could not get the parent of the WebView for an overlay.");
        }
    }
}
