// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.view.ViewGroup;

// Referenced classes of package com.google.android.gms.internal:
//            em, bs

final class bt
{

    public final int a;
    public final android.view.ViewGroup.LayoutParams b;
    public final ViewGroup c;

    public bt(em em1)
    {
        b = em1.getLayoutParams();
        android.view.ViewParent viewparent = em1.getParent();
        if (viewparent instanceof ViewGroup)
        {
            c = (ViewGroup)viewparent;
            a = c.indexOfChild(em1);
            c.removeView(em1);
            em1.a(true);
            return;
        } else
        {
            throw new bs("Could not get the parent of the WebView for an overlay.");
        }
    }
}
