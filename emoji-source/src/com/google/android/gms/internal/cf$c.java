// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.view.ViewGroup;

// Referenced classes of package com.google.android.gms.internal:
//            cf, ex

private static final class <init>
{

    public final int index;
    public final android.view.roup.LayoutParams ot;
    public final ViewGroup ou;

    public (ex ex1)
        throws 
    {
        ot = ex1.getLayoutParams();
        android.view.ViewParent viewparent = ex1.getParent();
        if (viewparent instanceof ViewGroup)
        {
            ou = (ViewGroup)viewparent;
            index = ou.indexOfChild(ex1);
            ou.removeView(ex1);
            ex1.q(true);
            return;
        } else
        {
            throw new <init>("Could not get the parent of the WebView for an overlay.");
        }
    }
}
