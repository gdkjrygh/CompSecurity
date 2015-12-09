// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

// Referenced classes of package com.jcp.fragments:
//            MultipleVideosGridFragment

class bw extends DebouncingOnClickListener
{

    final MultipleVideosGridFragment a;
    final MultipleVideosGridFragment..ViewInjector b;

    bw(MultipleVideosGridFragment..ViewInjector viewinjector, MultipleVideosGridFragment multiplevideosgridfragment)
    {
        b = viewinjector;
        a = multiplevideosgridfragment;
        super();
    }

    public void doClick(View view)
    {
        a.onCloseFragmentClick();
    }
}
