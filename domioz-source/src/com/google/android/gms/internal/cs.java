// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.view.ViewGroup;

// Referenced classes of package com.google.android.gms.internal:
//            fl, cq

public final class cs
{

    public final int a;
    public final android.view.ViewGroup.LayoutParams b;
    public final ViewGroup c;
    public final Context d;

    public cs(fl fl1)
    {
        b = fl1.getLayoutParams();
        android.view.ViewParent viewparent = fl1.getParent();
        d = fl1.d();
        if (viewparent != null && (viewparent instanceof ViewGroup))
        {
            c = (ViewGroup)viewparent;
            a = c.indexOfChild(fl1.a());
            c.removeView(fl1.a());
            fl1.a(true);
            return;
        } else
        {
            throw new cq("Could not get the parent of the WebView for an overlay.");
        }
    }
}
