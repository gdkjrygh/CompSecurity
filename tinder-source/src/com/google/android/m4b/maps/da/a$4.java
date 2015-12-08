// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.da;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;

// Referenced classes of package com.google.android.m4b.maps.da:
//            a, c

public final class d
    implements d
{

    private FrameLayout a;
    private LayoutInflater b;
    private ViewGroup c;
    private Bundle d;
    private a e;

    public final int a()
    {
        return 2;
    }

    public final void b()
    {
        a.removeAllViews();
        a.addView(e.a.a(b, c, d));
    }

    public (a a1, FrameLayout framelayout, LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        e = a1;
        a = framelayout;
        b = layoutinflater;
        c = viewgroup;
        d = bundle;
        super();
    }
}
