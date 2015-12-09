// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.dynamic;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;

// Referenced classes of package com.google.android.gms.dynamic:
//            b, a

class d
    implements d
{

    final FrameLayout a;
    final LayoutInflater b;
    final ViewGroup c;
    final Bundle d;
    final b e;

    public int a()
    {
        return 2;
    }

    public void a(a a1)
    {
        a.removeAllViews();
        a.addView(com.google.android.gms.dynamic.b.b(e).a(b, c, d));
    }

    (b b1, FrameLayout framelayout, LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        e = b1;
        a = framelayout;
        b = layoutinflater;
        c = viewgroup;
        d = bundle;
        super();
    }
}
