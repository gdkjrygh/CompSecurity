// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.view.ViewGroup;

// Referenced classes of package com.google.android.gms.internal:
//            bf, cq

private static final class <init>
{

    public final android.view.roup.LayoutParams fP;
    public final ViewGroup fQ;
    public final int index;

    public (cq cq1)
        throws 
    {
        fP = cq1.getLayoutParams();
        android.view.ViewParent viewparent = cq1.getParent();
        if (viewparent instanceof ViewGroup)
        {
            fQ = (ViewGroup)viewparent;
            index = fQ.indexOfChild(cq1);
            fQ.removeView(cq1);
            cq1.i(true);
            return;
        } else
        {
            throw new <init>("Could not get the parent of the WebView for an overlay.");
        }
    }
}
